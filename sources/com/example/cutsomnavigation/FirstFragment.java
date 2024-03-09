package com.example.cutsomnavigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.example.cutsomnavigation.Wheel;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class FirstFragment extends Fragment {
    Button btn;
    int cnt = 0;
    ImageView img1;
    ImageView img2;
    ImageView img3;
    boolean isStarted;
    /* access modifiers changed from: private */
    public InterstitialAd mInterstitialAd;
    TextView msg;
    Wheel wheel1;
    Wheel wheel2;
    Wheel wheel3;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        this.img2 = (ImageView) view.findViewById(R.id.img2);
        this.btn = (Button) view.findViewById(R.id.btn);
        this.msg = (TextView) view.findViewById(R.id.msg);
        MobileAds.initialize(getActivity().getApplicationContext(), (OnInitializationCompleteListener) new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        InterstitialAd interstitialAd = new InterstitialAd(getActivity().getApplicationContext());
        this.mInterstitialAd = interstitialAd;
        interstitialAd.setAdUnitId(getString(R.string.adpaisa));
        this.mInterstitialAd.loadAd(new AdRequest.Builder().build());
        this.btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (FirstFragment.this.isStarted) {
                    FirstFragment.this.wheel2.stopWheel();
                    if (FirstFragment.this.cnt == 3 && FirstFragment.this.mInterstitialAd.isLoaded()) {
                        FirstFragment.this.mInterstitialAd.show();
                        FirstFragment.this.cnt = 0;
                        InterstitialAd unused = FirstFragment.this.mInterstitialAd = new InterstitialAd(FirstFragment.this.getActivity().getApplicationContext());
                        FirstFragment.this.mInterstitialAd.setAdUnitId(FirstFragment.this.getString(R.string.adpaisa));
                        FirstFragment.this.mInterstitialAd.loadAd(new AdRequest.Builder().build());
                        FirstFragment.this.mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }
                    if (FirstFragment.this.wheel2.currentIndex == 1) {
                        FirstFragment.this.msg.setText("भगवान उनकी मदद करें जो खुद की मदद करते हैं। इसलिए मेरे बच्चे, अपने काम में भरोसा रखो।");
                    } else if (FirstFragment.this.wheel2.currentIndex == 2) {
                        FirstFragment.this.msg.setText("यह काम करो। यह अच्छा है।");
                    } else {
                        FirstFragment.this.msg.setText("यह काम बंद करो। यह संदिग्ध है।");
                    }
                    FirstFragment.this.btn.setText("Start");
                    FirstFragment.this.isStarted = false;
                    return;
                }
                FirstFragment.this.wheel2 = new Wheel(new Wheel.WheelListener() {
                    public void newImage(final int img) {
                        FirstFragment.this.getActivity().runOnUiThread(new Runnable() {
                            public void run() {
                                FirstFragment.this.img2.setImageResource(img);
                            }
                        });
                    }
                }, 200, MainActivity.randomLong(150, 400));
                FirstFragment.this.wheel2.start();
                FirstFragment.this.cnt++;
                FirstFragment.this.btn.setText("Stop");
                FirstFragment.this.msg.setText("");
                FirstFragment.this.isStarted = true;
            }
        });
        return view;
    }
}
