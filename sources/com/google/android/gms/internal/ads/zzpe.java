package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzpe {
    private int size;
    private long[] zzbjq;

    public zzpe() {
        this(32);
    }

    private zzpe(int i) {
        this.zzbjq = new long[32];
    }

    public final void add(long j) {
        int i = this.size;
        long[] jArr = this.zzbjq;
        if (i == jArr.length) {
            this.zzbjq = Arrays.copyOf(jArr, i << 1);
        }
        long[] jArr2 = this.zzbjq;
        int i2 = this.size;
        this.size = i2 + 1;
        jArr2[i2] = j;
    }

    public final long get(int i) {
        if (i >= 0 && i < this.size) {
            return this.zzbjq[i];
        }
        int i2 = this.size;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final int size() {
        return this.size;
    }
}
