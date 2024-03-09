package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzawf implements Runnable {
    private final String zzdin;
    private final zzawb zzdxh;
    private final zzawr zzdxi;

    zzawf(zzawb zzawb, zzawr zzawr, String str) {
        this.zzdxh = zzawb;
        this.zzdxi = zzawr;
        this.zzdin = str;
    }

    public final void run() {
        this.zzdxh.zza(this.zzdxi, this.zzdin);
    }
}
