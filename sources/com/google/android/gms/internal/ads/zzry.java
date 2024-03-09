package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzry {
    final long value;
    final int zzbtv;
    final String zzbuf;

    zzry(long j, String str, int i) {
        this.value = j;
        this.zzbuf = str;
        this.zzbtv = i;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof zzry)) {
            return false;
        }
        zzry zzry = (zzry) obj;
        if (zzry.value == this.value && zzry.zzbtv == this.zzbtv) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.value;
    }
}
