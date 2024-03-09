package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzccw extends zzyj {
    private final Object lock = new Object();
    @Nullable
    private zzyg zzfyf;
    @Nullable
    private final zzanj zzfyg;

    public zzccw(@Nullable zzyg zzyg, @Nullable zzanj zzanj) {
        this.zzfyf = zzyg;
        this.zzfyg = zzanj;
    }

    public final void play() throws RemoteException {
        throw new RemoteException();
    }

    public final void pause() throws RemoteException {
        throw new RemoteException();
    }

    public final void stop() throws RemoteException {
        throw new RemoteException();
    }

    public final void mute(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    public final boolean isMuted() throws RemoteException {
        throw new RemoteException();
    }

    public final int getPlaybackState() throws RemoteException {
        throw new RemoteException();
    }

    public final float getDuration() throws RemoteException {
        zzanj zzanj = this.zzfyg;
        if (zzanj != null) {
            return zzanj.getVideoDuration();
        }
        return 0.0f;
    }

    public final float getCurrentTime() throws RemoteException {
        zzanj zzanj = this.zzfyg;
        if (zzanj != null) {
            return zzanj.getVideoCurrentTime();
        }
        return 0.0f;
    }

    public final void zza(zzyl zzyl) throws RemoteException {
        synchronized (this.lock) {
            if (this.zzfyf != null) {
                this.zzfyf.zza(zzyl);
            }
        }
    }

    public final zzyl zzqj() throws RemoteException {
        synchronized (this.lock) {
            if (this.zzfyf == null) {
                return null;
            }
            zzyl zzqj = this.zzfyf.zzqj();
            return zzqj;
        }
    }

    public final float getAspectRatio() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean isCustomControlsEnabled() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean isClickToExpandEnabled() throws RemoteException {
        throw new RemoteException();
    }
}
