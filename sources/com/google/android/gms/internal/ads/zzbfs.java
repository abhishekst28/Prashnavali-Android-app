package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzc;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzbfs implements Runnable {
    private final zzbft zzelv;

    zzbfs(zzbft zzbft) {
        this.zzelv = zzbft;
    }

    public final void run() {
        zzbft zzbft = this.zzelv;
        zzbft.zzelw.zzabn();
        zzc zzaba = zzbft.zzelw.zzaba();
        if (zzaba != null) {
            zzaba.zzur();
        }
    }
}
