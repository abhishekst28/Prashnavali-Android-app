package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzedn {
    private final zzeee zzhyy;
    private final zzeee zzhyz;

    public zzedn(byte[] bArr, byte[] bArr2) {
        this.zzhyy = zzeee.zzs(bArr);
        this.zzhyz = zzeee.zzs(bArr2);
    }

    public final byte[] zzbct() {
        zzeee zzeee = this.zzhyy;
        if (zzeee == null) {
            return null;
        }
        return zzeee.getBytes();
    }

    public final byte[] zzbcu() {
        zzeee zzeee = this.zzhyz;
        if (zzeee == null) {
            return null;
        }
        return zzeee.getBytes();
    }
}
