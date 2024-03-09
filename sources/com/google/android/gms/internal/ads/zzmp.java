package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzmp implements Runnable {
    private final /* synthetic */ zzmn zzbeg;

    zzmp(zzmn zzmn) {
        this.zzbeg = zzmn;
    }

    public final void run() {
        if (!this.zzbeg.zzage) {
            this.zzbeg.zzbdr.zza(this.zzbeg);
        }
    }
}
