package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zznq {
    public final int length;
    private int zzahr;
    private final zzho[] zzbfk;

    public zznq(zzho... zzhoArr) {
        zzoz.checkState(zzhoArr.length > 0);
        this.zzbfk = zzhoArr;
        this.length = zzhoArr.length;
    }

    public final zzho zzbe(int i) {
        return this.zzbfk[i];
    }

    public final int zzh(zzho zzho) {
        int i = 0;
        while (true) {
            zzho[] zzhoArr = this.zzbfk;
            if (i >= zzhoArr.length) {
                return -1;
            }
            if (zzho == zzhoArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final int hashCode() {
        if (this.zzahr == 0) {
            this.zzahr = Arrays.hashCode(this.zzbfk) + 527;
        }
        return this.zzahr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zznq zznq = (zznq) obj;
        if (this.length != zznq.length || !Arrays.equals(this.zzbfk, zznq.zzbfk)) {
            return false;
        }
        return true;
    }
}
