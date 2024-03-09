package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzhk {
    public final int index;
    private final zzhx[] zzael;
    private final zzog zzaem;
    public final zzmx zzafi;
    public final Object zzafj;
    public final zznm[] zzafk;
    private final boolean[] zzafl;
    public final long zzafm;
    public int zzafn;
    public long zzafo;
    public boolean zzafp;
    public boolean zzafq;
    public boolean zzafr;
    public zzhk zzafs;
    public zzoi zzaft;
    private final zzhw[] zzafu;
    private final zzhs zzafv;
    private final zzmz zzafw;
    private zzoi zzafx;

    public zzhk(zzhx[] zzhxArr, zzhw[] zzhwArr, long j, zzog zzog, zzhs zzhs, zzmz zzmz, Object obj, int i, int i2, boolean z, long j2) {
        this.zzael = zzhxArr;
        this.zzafu = zzhwArr;
        this.zzafm = j;
        this.zzaem = zzog;
        this.zzafv = zzhs;
        this.zzafw = zzmz;
        this.zzafj = zzoz.checkNotNull(obj);
        this.index = i;
        this.zzafn = i2;
        this.zzafp = z;
        this.zzafo = j2;
        this.zzafk = new zznm[zzhxArr.length];
        this.zzafl = new boolean[zzhxArr.length];
        this.zzafi = zzmz.zza(i2, zzhs.zzfb());
    }

    public final long zzen() {
        return this.zzafm - this.zzafo;
    }

    public final void zzc(int i, boolean z) {
        this.zzafn = i;
        this.zzafp = z;
    }

    public final boolean zzeo() {
        if (this.zzafq) {
            return !this.zzafr || this.zzafi.zzhp() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean zzep() throws zzhd {
        boolean z;
        zzoi zza = this.zzaem.zza(this.zzafu, this.zzafi.zzhm());
        zzoi zzoi = this.zzafx;
        if (zzoi != null) {
            int i = 0;
            while (true) {
                if (i >= zza.zzbht.length) {
                    z = true;
                    break;
                } else if (!zza.zza(zzoi, i)) {
                    z = false;
                    break;
                } else {
                    i++;
                }
            }
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        this.zzaft = zza;
        return true;
    }

    public final long zzb(long j, boolean z) {
        return zza(j, false, new boolean[this.zzael.length]);
    }

    public final long zza(long j, boolean z, boolean[] zArr) {
        zzod zzod = this.zzaft.zzbht;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzod.length) {
                break;
            }
            boolean[] zArr2 = this.zzafl;
            if (z || !this.zzaft.zza(this.zzafx, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        long zza = this.zzafi.zza(zzod.zzik(), this.zzafl, this.zzafk, zArr, j);
        this.zzafx = this.zzaft;
        this.zzafr = false;
        int i2 = 0;
        while (true) {
            zznm[] zznmArr = this.zzafk;
            if (i2 < zznmArr.length) {
                if (zznmArr[i2] != null) {
                    zzoz.checkState(zzod.zzbg(i2) != null);
                    this.zzafr = true;
                } else {
                    zzoz.checkState(zzod.zzbg(i2) == null);
                }
                i2++;
            } else {
                this.zzafv.zza(this.zzael, this.zzaft.zzbhs, zzod);
                return zza;
            }
        }
    }

    public final void release() {
        try {
            this.zzafw.zzb(this.zzafi);
        } catch (RuntimeException e) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e);
        }
    }
}
