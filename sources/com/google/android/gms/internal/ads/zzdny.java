package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdny {
    private int zzhga = 0;
    private final long zzhgb;
    private final zzdnx zzhgc = new zzdnx();
    private long zzhgd;
    private int zzhge = 0;
    private int zzhgf = 0;

    public zzdny() {
        long currentTimeMillis = zzp.zzkw().currentTimeMillis();
        this.zzhgb = currentTimeMillis;
        this.zzhgd = currentTimeMillis;
    }

    public final void zzauc() {
        this.zzhgd = zzp.zzkw().currentTimeMillis();
        this.zzhge++;
    }

    public final void zzaud() {
        this.zzhgf++;
        this.zzhgc.zzhfz = true;
    }

    public final void zzaue() {
        this.zzhga++;
        this.zzhgc.zzhga++;
    }

    public final long getCreationTimeMillis() {
        return this.zzhgb;
    }

    public final long zzatf() {
        return this.zzhgd;
    }

    public final int zzatg() {
        return this.zzhge;
    }

    public final zzdnx zzauf() {
        zzdnx zzdnx = (zzdnx) this.zzhgc.clone();
        zzdnx zzdnx2 = this.zzhgc;
        zzdnx2.zzhfz = false;
        zzdnx2.zzhga = 0;
        return zzdnx;
    }

    public final String zzats() {
        return "Created: " + this.zzhgb + " Last accessed: " + this.zzhgd + " Accesses: " + this.zzhge + "\nEntries retrieved: Valid: " + this.zzhgf + " Stale: " + this.zzhga;
    }
}
