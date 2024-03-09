package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcmn implements Runnable {
    private final String zzeng;
    private final zzcmi zzgfz;
    private final zzdlx zzggm;
    private final zzaih zzggn;
    private final List zzggo;

    zzcmn(zzcmi zzcmi, zzdlx zzdlx, zzaih zzaih, List list, String str) {
        this.zzgfz = zzcmi;
        this.zzggm = zzdlx;
        this.zzggn = zzaih;
        this.zzggo = list;
        this.zzeng = str;
    }

    public final void run() {
        this.zzgfz.zza(this.zzggm, this.zzggn, this.zzggo, this.zzeng);
    }
}
