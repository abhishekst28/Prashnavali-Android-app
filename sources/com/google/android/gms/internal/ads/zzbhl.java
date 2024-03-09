package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzc;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzbhl implements Runnable {
    private final zzbhi zzepr;

    zzbhl(zzbhi zzbhi) {
        this.zzepr = zzbhi;
    }

    public final void run() {
        zzbhi zzbhi = this.zzepr;
        zzbhi.zzelw.zzabn();
        zzc zzaba = zzbhi.zzelw.zzaba();
        if (zzaba != null) {
            zzaba.zzur();
        }
    }
}
