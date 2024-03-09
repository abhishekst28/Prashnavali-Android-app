package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcja implements zzbtp {
    private final zzbfq zzdgc;

    zzcja(zzbfq zzbfq) {
        this.zzdgc = !((Boolean) zzwe.zzpu().zzd(zzaat.zzcnx)).booleanValue() ? null : zzbfq;
    }

    public final void zzbz(Context context) {
        zzbfq zzbfq = this.zzdgc;
        if (zzbfq != null) {
            zzbfq.onPause();
        }
    }

    public final void zzca(Context context) {
        zzbfq zzbfq = this.zzdgc;
        if (zzbfq != null) {
            zzbfq.onResume();
        }
    }

    public final void zzcb(Context context) {
        zzbfq zzbfq = this.zzdgc;
        if (zzbfq != null) {
            zzbfq.destroy();
        }
    }
}
