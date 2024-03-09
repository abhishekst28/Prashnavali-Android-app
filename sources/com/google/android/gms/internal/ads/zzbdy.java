package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbdy implements zzhs {
    private int zzbiv;
    private final zzoq zzejo;
    private long zzejp;
    private long zzejq;
    private long zzejr;
    private long zzejs;
    private boolean zzejt;

    zzbdy() {
        this(15000, 30000, 2500, 5000);
    }

    private zzbdy(int i, int i2, long j, long j2) {
        this.zzejo = new zzoq(true, 65536);
        this.zzejp = 15000000;
        this.zzejq = 30000000;
        this.zzejr = 2500000;
        this.zzejs = 5000000;
    }

    public final void zzez() {
        zzk(false);
    }

    public final void zza(zzhx[] zzhxArr, zznp zznp, zzod zzod) {
        this.zzbiv = 0;
        for (int i = 0; i < zzhxArr.length; i++) {
            if (zzod.zzbg(i) != null) {
                this.zzbiv += zzpq.zzbs(zzhxArr[i].getTrackType());
            }
        }
        this.zzejo.zzbi(this.zzbiv);
    }

    public final void onStopped() {
        zzk(true);
    }

    public final void zzfa() {
        zzk(true);
    }

    public final zzok zzfb() {
        return this.zzejo;
    }

    public final synchronized boolean zzc(long j, boolean z) {
        long j2;
        j2 = z ? this.zzejs : this.zzejr;
        return j2 <= 0 || j >= j2;
    }

    public final synchronized boolean zzdt(long j) {
        boolean z;
        char c;
        z = false;
        if (j > this.zzejq) {
            c = 0;
        } else {
            c = j < this.zzejp ? (char) 2 : 1;
        }
        boolean z2 = this.zzejo.zzip() >= this.zzbiv;
        if (c == 2 || (c == 1 && this.zzejt && !z2)) {
            z = true;
        }
        this.zzejt = z;
        return z;
    }

    public final synchronized void zzds(int i) {
        this.zzejp = ((long) i) * 1000;
    }

    public final synchronized void zzdt(int i) {
        this.zzejq = ((long) i) * 1000;
    }

    public final synchronized void zzdn(int i) {
        this.zzejr = ((long) i) * 1000;
    }

    public final synchronized void zzdo(int i) {
        this.zzejs = ((long) i) * 1000;
    }

    private final void zzk(boolean z) {
        this.zzbiv = 0;
        this.zzejt = false;
        if (z) {
            this.zzejo.reset();
        }
    }
}
