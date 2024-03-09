package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbll implements zzbtp {
    private final zzdlx zzfle;

    public zzbll(zzdlx zzdlx) {
        this.zzfle = zzdlx;
    }

    public final void zzbz(Context context) {
        try {
            this.zzfle.pause();
        } catch (zzdlr e) {
            zzaxy.zzd("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    public final void zzca(Context context) {
        try {
            this.zzfle.resume();
            if (context != null) {
                this.zzfle.onContextChanged(context);
            }
        } catch (zzdlr e) {
            zzaxy.zzd("Cannot invoke onResume for the mediation adapter.", e);
        }
    }

    public final void zzcb(Context context) {
        try {
            this.zzfle.destroy();
        } catch (zzdlr e) {
            zzaxy.zzd("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }
}
