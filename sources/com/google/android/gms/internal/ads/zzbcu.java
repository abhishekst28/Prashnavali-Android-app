package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbcu implements Runnable {
    private final /* synthetic */ zzbcr zzegd;
    private final /* synthetic */ boolean zzegg;

    zzbcu(zzbcr zzbcr, boolean z) {
        this.zzegd = zzbcr;
        this.zzegg = z;
    }

    public final void run() {
        this.zzegd.zzd("windowVisibilityChanged", "isVisible", String.valueOf(this.zzegg));
    }
}
