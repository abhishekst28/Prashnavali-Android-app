package com.example.cutsomnavigation;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import androidx.fragment.app.Fragment;

public class MusicSetting extends Fragment {
    AudioManager audiomanager;
    Button bt2;
    Button bt3;
    MediaPlayer mp;
    SeekBar seekme;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.music_setting, container, false);
        this.bt2 = (Button) view.findViewById(R.id.button2);
        this.bt3 = (Button) view.findViewById(R.id.button3);
        this.seekme = (SeekBar) view.findViewById(R.id.seekBar);
        this.audiomanager = (AudioManager) getActivity().getSystemService("audio");
        this.bt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MusicSetting.this.audiomanager.setStreamMute(3, false);
            }
        });
        this.bt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MusicSetting.this.audiomanager.setStreamMute(3, true);
            }
        });
        int maxivol = this.audiomanager.getStreamMaxVolume(3);
        int curvol = this.audiomanager.getStreamVolume(3);
        this.seekme.setMax(maxivol);
        this.seekme.setProgress(curvol);
        this.seekme.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                MusicSetting.this.audiomanager.setStreamVolume(3, i, 0);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        return view;
    }
}
