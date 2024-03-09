package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzefi extends zzefp {
    private final int zzibg;
    private final int zzibh;

    zzefi(byte[] bArr, int i, int i2) {
        super(bArr);
        zzi(i, i + i2, bArr.length);
        this.zzibg = i;
        this.zzibh = i2;
    }

    public final byte zzfu(int i) {
        zzaa(i, size());
        return this.zzibo[this.zzibg + i];
    }

    /* access modifiers changed from: package-private */
    public final byte zzfv(int i) {
        return this.zzibo[this.zzibg + i];
    }

    public final int size() {
        return this.zzibh;
    }

    /* access modifiers changed from: protected */
    public final int zzbdq() {
        return this.zzibg;
    }

    /* access modifiers changed from: protected */
    public final void zzb(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzibo, zzbdq() + i, bArr, i2, i3);
    }
}
