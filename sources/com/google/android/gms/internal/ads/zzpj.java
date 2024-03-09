package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzpj {
    private byte[] data;
    private int zzbju;
    private int zzbjv = 0;
    private int zzbjw;

    public zzpj(byte[] bArr, int i, int i2) {
        this.data = bArr;
        this.zzbju = i;
        this.zzbjw = i2;
        zzix();
    }

    public final void zzbl(int i) {
        int i2 = this.zzbju;
        int i3 = (i / 8) + i2;
        this.zzbju = i3;
        int i4 = this.zzbjv + (i % 8);
        this.zzbjv = i4;
        if (i4 > 7) {
            this.zzbju = i3 + 1;
            this.zzbjv = i4 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.zzbju) {
                zzix();
                return;
            } else if (zzbm(i2)) {
                this.zzbju++;
                i2 += 2;
            }
        }
    }

    public final boolean zzit() {
        return zzbk(1) == 1;
    }

    public final int zzbk(int i) {
        byte b;
        byte b2;
        if (i == 0) {
            return 0;
        }
        int i2 = i / 8;
        byte b3 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = zzbm(this.zzbju + 1) ? this.zzbju + 2 : this.zzbju + 1;
            int i5 = this.zzbjv;
            if (i5 != 0) {
                byte[] bArr = this.data;
                b2 = ((bArr[i4] & 255) >>> (8 - i5)) | ((bArr[this.zzbju] & 255) << i5);
            } else {
                b2 = this.data[this.zzbju];
            }
            i -= 8;
            b3 = b | ((255 & b2) << i);
            this.zzbju = i4;
        }
        if (i > 0) {
            int i6 = this.zzbjv + i;
            byte b4 = (byte) (255 >> (8 - i));
            int i7 = zzbm(this.zzbju + 1) ? this.zzbju + 2 : this.zzbju + 1;
            if (i6 > 8) {
                byte[] bArr2 = this.data;
                int i8 = (255 & bArr2[i7]) >> (16 - i6);
                this.zzbju = i7;
                b = (b4 & (i8 | ((bArr2[this.zzbju] & 255) << (i6 - 8)))) | b;
            } else {
                byte b5 = (b4 & ((255 & this.data[this.zzbju]) >> (8 - i6))) | b;
                if (i6 == 8) {
                    this.zzbju = i7;
                }
                b = b5;
            }
            this.zzbjv = i6 % 8;
        }
        zzix();
        return b;
    }

    public final int zziu() {
        return zziw();
    }

    public final int zziv() {
        int zziw = zziw();
        return (zziw % 2 == 0 ? -1 : 1) * ((zziw + 1) / 2);
    }

    private final int zziw() {
        int i = 0;
        int i2 = 0;
        while (!zzit()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = zzbk(i2);
        }
        return i3 + i;
    }

    private final boolean zzbm(int i) {
        if (2 > i || i >= this.zzbjw) {
            return false;
        }
        byte[] bArr = this.data;
        return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i - 1] == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r3.zzbjv;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        r2 = r3.zzbjw;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzix() {
        /*
            r3 = this;
            int r0 = r3.zzbju
            if (r0 < 0) goto L_0x0016
            int r1 = r3.zzbjv
            if (r1 < 0) goto L_0x0016
            r2 = 8
            if (r1 >= r2) goto L_0x0016
            int r2 = r3.zzbjw
            if (r0 < r2) goto L_0x0014
            if (r0 != r2) goto L_0x0016
            if (r1 != 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            com.google.android.gms.internal.ads.zzoz.checkState(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpj.zzix():void");
    }
}
