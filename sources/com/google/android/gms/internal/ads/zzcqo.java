package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcqo implements zzbsz, zzbuj {
    private static final Object zzgjy = new Object();
    private static int zzgjz = 0;
    private final zzcqt zzgka;

    public zzcqo(zzcqt zzcqt) {
        this.zzgka = zzcqt;
    }

    public final void onAdLoaded() {
        zzbk(true);
    }

    public final void zzg(zzuw zzuw) {
        zzbk(false);
    }

    private static boolean zzapn() {
        boolean z;
        synchronized (zzgjy) {
            z = zzgjz < ((Integer) zzwe.zzpu().zzd(zzaat.zzcvy)).intValue();
        }
        return z;
    }

    private final void zzbk(boolean z) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcvx)).booleanValue() && zzapn()) {
            this.zzgka.zzbk(z);
            synchronized (zzgjy) {
                zzgjz++;
            }
        }
    }
}
