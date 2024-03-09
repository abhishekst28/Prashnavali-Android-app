package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzkf {
    public final int zzaov = 1;
    public final byte[] zzaow;

    public zzkf(int i, byte[] bArr) {
        this.zzaow = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzkf zzkf = (zzkf) obj;
        if (this.zzaov != zzkf.zzaov || !Arrays.equals(this.zzaow, zzkf.zzaow)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.zzaov * 31) + Arrays.hashCode(this.zzaow);
    }
}
