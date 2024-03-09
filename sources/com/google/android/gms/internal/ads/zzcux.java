package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcux implements Runnable {
    private final zzcix zzgmi;

    private zzcux(zzcix zzcix) {
        this.zzgmi = zzcix;
    }

    static Runnable zza(zzcix zzcix) {
        return new zzcux(zzcix);
    }

    public final void run() {
        this.zzgmi.zzanp();
    }
}
