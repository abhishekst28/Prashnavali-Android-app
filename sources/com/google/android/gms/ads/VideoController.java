package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzyg;
import com.google.android.gms.internal.ads.zzzz;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class VideoController {
    public static final int PLAYBACK_STATE_ENDED = 3;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    public static final int PLAYBACK_STATE_READY = 5;
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    private final Object lock = new Object();
    private zzyg zzado;
    private VideoLifecycleCallbacks zzadp;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    public static abstract class VideoLifecycleCallbacks {
        public void onVideoStart() {
        }

        public void onVideoPlay() {
        }

        public void onVideoPause() {
        }

        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z) {
        }
    }

    public final void zza(zzyg zzyg) {
        synchronized (this.lock) {
            this.zzado = zzyg;
            if (this.zzadp != null) {
                setVideoLifecycleCallbacks(this.zzadp);
            }
        }
    }

    public final zzyg zzdt() {
        zzyg zzyg;
        synchronized (this.lock) {
            zzyg = this.zzado;
        }
        return zzyg;
    }

    public final void play() {
        synchronized (this.lock) {
            if (this.zzado != null) {
                try {
                    this.zzado.play();
                } catch (RemoteException e) {
                    zzbbd.zzc("Unable to call play on video controller.", e);
                }
            }
        }
    }

    public final void pause() {
        synchronized (this.lock) {
            if (this.zzado != null) {
                try {
                    this.zzado.pause();
                } catch (RemoteException e) {
                    zzbbd.zzc("Unable to call pause on video controller.", e);
                }
            }
        }
    }

    public final void stop() {
        synchronized (this.lock) {
            if (this.zzado != null) {
                try {
                    this.zzado.stop();
                } catch (RemoteException e) {
                    zzbbd.zzc("Unable to call stop on video controller.", e);
                }
            }
        }
    }

    public final void mute(boolean z) {
        synchronized (this.lock) {
            if (this.zzado != null) {
                try {
                    this.zzado.mute(z);
                } catch (RemoteException e) {
                    zzbbd.zzc("Unable to call mute on video controller.", e);
                }
            }
        }
    }

    public final boolean isMuted() {
        synchronized (this.lock) {
            if (this.zzado == null) {
                return true;
            }
            try {
                boolean isMuted = this.zzado.isMuted();
                return isMuted;
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to call isMuted on video controller.", e);
                return true;
            }
        }
    }

    public final int getPlaybackState() {
        synchronized (this.lock) {
            if (this.zzado == null) {
                return 0;
            }
            try {
                int playbackState = this.zzado.getPlaybackState();
                return playbackState;
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to call getPlaybackState on video controller.", e);
                return 0;
            }
        }
    }

    public final boolean isCustomControlsEnabled() {
        synchronized (this.lock) {
            if (this.zzado == null) {
                return false;
            }
            try {
                boolean isCustomControlsEnabled = this.zzado.isCustomControlsEnabled();
                return isCustomControlsEnabled;
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to call isUsingCustomPlayerControls.", e);
                return false;
            }
        }
    }

    public final boolean isClickToExpandEnabled() {
        synchronized (this.lock) {
            if (this.zzado == null) {
                return false;
            }
            try {
                boolean isClickToExpandEnabled = this.zzado.isClickToExpandEnabled();
                return isClickToExpandEnabled;
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to call isClickToExpandEnabled.", e);
                return false;
            }
        }
    }

    public final float getVideoDuration() {
        synchronized (this.lock) {
            if (this.zzado == null) {
                return 0.0f;
            }
            try {
                float duration = this.zzado.getDuration();
                return duration;
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to call getDuration on video controller.", e);
                return 0.0f;
            }
        }
    }

    public final float getVideoCurrentTime() {
        synchronized (this.lock) {
            if (this.zzado == null) {
                return 0.0f;
            }
            try {
                float currentTime = this.zzado.getCurrentTime();
                return currentTime;
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to call getCurrentTime on video controller.", e);
                return 0.0f;
            }
        }
    }

    public final void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        Preconditions.checkNotNull(videoLifecycleCallbacks, "VideoLifecycleCallbacks may not be null.");
        synchronized (this.lock) {
            this.zzadp = videoLifecycleCallbacks;
            if (this.zzado != null) {
                try {
                    this.zzado.zza(new zzzz(videoLifecycleCallbacks));
                } catch (RemoteException e) {
                    zzbbd.zzc("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                }
            }
        }
    }

    public final VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.lock) {
            videoLifecycleCallbacks = this.zzadp;
        }
        return videoLifecycleCallbacks;
    }

    public final boolean hasVideoContent() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzado != null;
        }
        return z;
    }

    @Deprecated
    public final float getAspectRatio() {
        synchronized (this.lock) {
            if (this.zzado == null) {
                return 0.0f;
            }
            try {
                float aspectRatio = this.zzado.getAspectRatio();
                return aspectRatio;
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to call getAspectRatio on video controller.", e);
                return 0.0f;
            }
        }
    }
}
