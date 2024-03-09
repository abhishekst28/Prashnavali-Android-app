package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcru implements Runnable {
    private final zzbfq zzgak;
    private final zzcrn zzglk;

    zzcru(zzcrn zzcrn, zzbfq zzbfq) {
        this.zzglk = zzcrn;
        this.zzgak = zzbfq;
    }

    public final void run() {
        this.zzglk.zzo(this.zzgak);
    }
}
