package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcss implements Runnable {
    private final zzcix zzgmi;

    private zzcss(zzcix zzcix) {
        this.zzgmi = zzcix;
    }

    static Runnable zza(zzcix zzcix) {
        return new zzcss(zzcix);
    }

    public final void run() {
        this.zzgmi.zzanp();
    }
}
