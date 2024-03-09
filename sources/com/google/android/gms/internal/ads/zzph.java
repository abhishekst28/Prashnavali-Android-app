package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzph {
    private byte[] data;
    private int zzbju;
    private int zzbjv;
    private int zzbjw;

    public zzph() {
    }

    public zzph(byte[] bArr) {
        this(bArr, bArr.length);
    }

    private zzph(byte[] bArr, int i) {
        this.data = bArr;
        this.zzbjw = i;
    }

    public final int zzbk(int i) {
        byte b;
        int i2;
        int i3;
        byte b2;
        boolean z = false;
        if (i == 0) {
            return 0;
        }
        int i4 = i / 8;
        byte b3 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = this.zzbjv;
            if (i6 != 0) {
                byte[] bArr = this.data;
                int i7 = this.zzbju;
                b2 = ((bArr[i7 + 1] & 255) >>> (8 - i6)) | ((bArr[i7] & 255) << i6);
            } else {
                b2 = this.data[this.zzbju];
            }
            i -= 8;
            b3 = b | ((255 & b2) << i);
            this.zzbju++;
        }
        if (i > 0) {
            int i8 = this.zzbjv + i;
            byte b4 = (byte) (255 >> (8 - i));
            if (i8 > 8) {
                byte[] bArr2 = this.data;
                int i9 = this.zzbju;
                int i10 = (bArr2[i9] & 255) << (i8 - 8);
                this.zzbju = i9 + 1;
                b = (b4 & (((bArr2[i9 + 1] & 255) >> (16 - i8)) | i10)) | b;
            } else {
                byte[] bArr3 = this.data;
                int i11 = this.zzbju;
                byte b5 = (b4 & ((bArr3[i11] & 255) >> (8 - i8))) | b;
                if (i8 == 8) {
                    this.zzbju = i11 + 1;
                }
                b = b5;
            }
            this.zzbjv = i8 % 8;
        }
        int i12 = this.zzbju;
        if (i12 >= 0 && (i2 = this.zzbjv) >= 0 && i2 < 8 && (i12 < (i3 = this.zzbjw) || (i12 == i3 && i2 == 0))) {
            z = true;
        }
        zzoz.checkState(z);
        return b;
    }
}
