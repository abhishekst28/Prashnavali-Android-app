package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzhu {
    public static final zzhu zzahv = new zzhu(1.0f, 1.0f);
    public final float zzahw;
    public final float zzahx;
    private final int zzahy;

    public zzhu(float f, float f2) {
        this.zzahw = f;
        this.zzahx = f2;
        this.zzahy = Math.round(f * 1000.0f);
    }

    public final long zzdu(long j) {
        return j * ((long) this.zzahy);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzhu zzhu = (zzhu) obj;
        if (this.zzahw == zzhu.zzahw && this.zzahx == zzhu.zzahx) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.zzahw) + 527) * 31) + Float.floatToRawIntBits(this.zzahx);
    }
}
