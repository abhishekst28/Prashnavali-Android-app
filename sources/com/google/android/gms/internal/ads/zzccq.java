package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzccq implements Runnable {
    private final zzcdd zzfxi;

    private zzccq(zzcdd zzcdd) {
        this.zzfxi = zzcdd;
    }

    static Runnable zza(zzcdd zzcdd) {
        return new zzccq(zzcdd);
    }

    public final void run() {
        this.zzfxi.zzale();
    }
}
