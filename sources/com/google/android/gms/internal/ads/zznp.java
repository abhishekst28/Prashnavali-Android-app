package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zznp {
    public static final zznp zzbgq = new zznp(new zznq[0]);
    public final int length;
    private int zzahr;
    private final zznq[] zzbgr;

    public zznp(zznq... zznqArr) {
        this.zzbgr = zznqArr;
        this.length = zznqArr.length;
    }

    public final zznq zzbd(int i) {
        return this.zzbgr[i];
    }

    public final int zza(zznq zznq) {
        for (int i = 0; i < this.length; i++) {
            if (this.zzbgr[i] == zznq) {
                return i;
            }
        }
        return -1;
    }

    public final int hashCode() {
        if (this.zzahr == 0) {
            this.zzahr = Arrays.hashCode(this.zzbgr);
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
        zznp zznp = (zznp) obj;
        if (this.length != zznp.length || !Arrays.equals(this.zzbgr, zznp.zzbgr)) {
            return false;
        }
        return true;
    }
}
