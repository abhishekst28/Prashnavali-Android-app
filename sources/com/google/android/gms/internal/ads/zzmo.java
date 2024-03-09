package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzmo implements zznl {
    private final zznl[] zzbef;

    public zzmo(zznl[] zznlArr) {
        this.zzbef = zznlArr;
    }

    public final long zzhn() {
        long j = Long.MAX_VALUE;
        for (zznl zzhn : this.zzbef) {
            long zzhn2 = zzhn.zzhn();
            if (zzhn2 != Long.MIN_VALUE) {
                j = Math.min(j, zzhn2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final boolean zzef(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long zzhn = zzhn();
            if (zzhn == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (zznl zznl : this.zzbef) {
                if (zznl.zzhn() == zzhn) {
                    z |= zznl.zzef(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }
}
