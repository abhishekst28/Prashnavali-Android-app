package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzcmr extends zzaik {
    private final /* synthetic */ zzcmi zzggp;
    private final /* synthetic */ Object zzggq;
    private final /* synthetic */ String zzggr;
    private final /* synthetic */ long zzggs;
    private final /* synthetic */ zzbbq zzggt;

    zzcmr(zzcmi zzcmi, Object obj, String str, long j, zzbbq zzbbq) {
        this.zzggp = zzcmi;
        this.zzggq = obj;
        this.zzggr = str;
        this.zzggs = j;
        this.zzggt = zzbbq;
    }

    public final void onInitializationSucceeded() {
        synchronized (this.zzggq) {
            this.zzggp.zza(this.zzggr, true, "", (int) (zzp.zzkw().elapsedRealtime() - this.zzggs));
            this.zzggp.zzggh.zzgk(this.zzggr);
            this.zzggt.set(true);
        }
    }

    public final void onInitializationFailed(String str) {
        synchronized (this.zzggq) {
            this.zzggp.zza(this.zzggr, false, str, (int) (zzp.zzkw().elapsedRealtime() - this.zzggs));
            this.zzggp.zzggh.zzr(this.zzggr, "error");
            this.zzggt.set(false);
        }
    }
}
