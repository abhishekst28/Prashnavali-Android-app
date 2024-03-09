package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzlp {
    public int zzawy;
    public zzlb zzbaf;
    public long zzbag;
    public long zzbah;
    public long zzbai;
    public int zzbaj;
    public long[] zzbak;
    public int[] zzbal;
    public int[] zzbam;
    public int[] zzban;
    public long[] zzbao;
    public boolean[] zzbap;
    public boolean zzbaq;
    public boolean[] zzbar;
    public zzlq zzbas;
    public int zzbat;
    public zzpk zzbau;
    public boolean zzbav;
    public long zzbaw;

    zzlp() {
    }

    public final void zzaw(int i) {
        zzpk zzpk = this.zzbau;
        if (zzpk == null || zzpk.limit() < i) {
            this.zzbau = new zzpk(i);
        }
        this.zzbat = i;
        this.zzbaq = true;
        this.zzbav = true;
    }

    public final long zzax(int i) {
        return this.zzbao[i] + ((long) this.zzban[i]);
    }
}
