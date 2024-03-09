package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdnb {
    private final zzdne zzhdx = new zzdne();
    private int zzhdy;
    private int zzhdz;
    private int zzhea;
    private int zzheb;
    private int zzhec;

    zzdnb() {
    }

    public final void zzatm() {
        this.zzhea++;
    }

    public final void zzatn() {
        this.zzheb++;
    }

    public final void zzato() {
        this.zzhdy++;
        this.zzhdx.zzher = true;
    }

    public final void zzatp() {
        this.zzhdz++;
        this.zzhdx.zzhes = true;
    }

    public final void zzatq() {
        this.zzhec++;
    }

    public final zzdne zzatr() {
        zzdne zzdne = (zzdne) this.zzhdx.clone();
        zzdne zzdne2 = this.zzhdx;
        zzdne2.zzher = false;
        zzdne2.zzhes = false;
        return zzdne;
    }

    public final String zzats() {
        return "\n\tPool does not exist: " + this.zzhea + "\n\tNew pools created: " + this.zzhdy + "\n\tPools removed: " + this.zzhdz + "\n\tEntries added: " + this.zzhec + "\n\tNo entries retrieved: " + this.zzheb + "\n";
    }
}
