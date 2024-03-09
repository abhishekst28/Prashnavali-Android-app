package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzduq implements Runnable {
    private final /* synthetic */ zzdup zzhoz;
    private final /* synthetic */ zzdtf zzhpg;

    zzduq(zzdup zzdup, zzdtf zzdtf) {
        this.zzhoz = zzdup;
        this.zzhpg = zzdtf;
    }

    public final void run() {
        this.zzhoz.zza(this.zzhpg);
    }
}
