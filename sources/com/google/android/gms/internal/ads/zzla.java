package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzla implements zzky {
    private final zzpk zzawe;
    private final int zzawy = this.zzawe.zzjd();
    private final int zzaxc = this.zzawe.zzjd();

    public zzla(zzkt zzkt) {
        zzpk zzpk = zzkt.zzawe;
        this.zzawe = zzpk;
        zzpk.zzbo(12);
    }

    public final int zzgw() {
        return this.zzawy;
    }

    public final int zzgx() {
        int i = this.zzaxc;
        return i == 0 ? this.zzawe.zzjd() : i;
    }

    public final boolean zzgy() {
        return this.zzaxc != 0;
    }
}
