package com.example.cutsomnavigation;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;
import android.widget.Toast;

public class MusicService extends Service implements MediaPlayer.OnErrorListener {
    private int length = 0;
    private final IBinder mBinder = new ServiceBinder();
    MediaPlayer mPlayer;

    public class ServiceBinder extends Binder {
        public ServiceBinder() {
        }

        /* access modifiers changed from: package-private */
        public MusicService getService() {
            return MusicService.this;
        }
    }

    public IBinder onBind(Intent arg0) {
        return this.mBinder;
    }

    public void onCreate() {
        super.onCreate();
        MediaPlayer create = MediaPlayer.create(this, R.raw.heyram);
        this.mPlayer = create;
        create.setOnErrorListener(this);
        MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(true);
            this.mPlayer.setVolume(50.0f, 50.0f);
        }
        this.mPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            public boolean onError(MediaPlayer mp, int what, int extra) {
                onError(MusicService.this.mPlayer, what, extra);
                return true;
            }
        });
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer == null) {
            return 2;
        }
        mediaPlayer.start();
        return 2;
    }

    public void pauseMusic() {
        MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.mPlayer.pause();
            this.length = this.mPlayer.getCurrentPosition();
        }
    }

    public void resumeMusic() {
        MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null && !mediaPlayer.isPlaying()) {
            this.mPlayer.seekTo(this.length);
            this.mPlayer.start();
        }
    }

    public void startMusic() {
        MediaPlayer create = MediaPlayer.create(this, R.raw.heyram);
        this.mPlayer = create;
        create.setOnErrorListener(this);
        MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(true);
            this.mPlayer.setVolume(50.0f, 50.0f);
            this.mPlayer.start();
        }
    }

    public void stopMusic() {
        MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.mPlayer.release();
            this.mPlayer = null;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.stop();
                this.mPlayer.release();
            } finally {
                this.mPlayer = null;
            }
        }
    }

    public boolean onError(MediaPlayer mp, int what, int extra) {
        Toast.makeText(this, "Music player failed", 0).show();
        MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.stop();
                this.mPlayer.release();
            } finally {
                this.mPlayer = null;
            }
        }
        return false;
    }
}
