package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzjt implements zzke {
    private final int length;
    private final long zzaid;
    private final int[] zzaoj;
    private final long[] zzaok;
    private final long[] zzaol;
    private final long[] zzaom;

    public zzjt(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzaoj = iArr;
        this.zzaok = jArr;
        this.zzaol = jArr2;
        this.zzaom = jArr3;
        int length2 = iArr.length;
        this.length = length2;
        if (length2 > 0) {
            this.zzaid = jArr2[length2 - 1] + jArr3[length2 - 1];
        } else {
            this.zzaid = 0;
        }
    }

    public final boolean isSeekable() {
        return true;
    }

    public final long getDurationUs() {
        return this.zzaid;
    }

    public final long zzdz(long j) {
        return this.zzaok[zzpq.zza(this.zzaom, j, true, true)];
    }
}
