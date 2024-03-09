package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcml implements Runnable {
    private final Object zzdij;
    private final String zzgef;
    private final zzcmi zzgfz;
    private final zzbbq zzggk;
    private final long zzggl;

    zzcml(zzcmi zzcmi, Object obj, zzbbq zzbbq, String str, long j) {
        this.zzgfz = zzcmi;
        this.zzdij = obj;
        this.zzggk = zzbbq;
        this.zzgef = str;
        this.zzggl = j;
    }

    public final void run() {
        this.zzgfz.zza(this.zzdij, this.zzggk, this.zzgef, this.zzggl);
    }
}
