package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdvx implements Runnable {
    private final /* synthetic */ Runnable zzhqa;
    private final /* synthetic */ zzdvy zzhqb;

    zzdvx(zzdvy zzdvy, Runnable runnable) {
        this.zzhqb = zzdvy;
        this.zzhqa = runnable;
    }

    public final void run() {
        this.zzhqb.zzhqc = false;
        this.zzhqa.run();
    }

    public final String toString() {
        return this.zzhqa.toString();
    }
}
