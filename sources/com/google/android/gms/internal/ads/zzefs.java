package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzefs extends zzefq {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private final boolean zzibu;
    private int zzibv;
    private int zzibw;
    private int zzibx;
    private int zziby;

    private zzefs(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zziby = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i2 + i;
        this.pos = i;
        this.zzibw = i;
        this.zzibu = z;
    }

    public final int zzbdt() throws IOException {
        if (zzbej()) {
            this.zzibx = 0;
            return 0;
        }
        int zzbel = zzbel();
        this.zzibx = zzbel;
        if ((zzbel >>> 3) != 0) {
            return zzbel;
        }
        throw zzegz.zzbge();
    }

    public final void zzfy(int i) throws zzegz {
        if (this.zzibx != i) {
            throw zzegz.zzbgf();
        }
    }

    public final boolean zzfz(int i) throws IOException {
        int zzbdt;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.limit - this.pos >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.buffer;
                    int i4 = this.pos;
                    this.pos = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw zzegz.zzbgd();
            }
            while (i3 < 10) {
                if (zzbeq() < 0) {
                    i3++;
                }
            }
            throw zzegz.zzbgd();
            return true;
        } else if (i2 == 1) {
            zzgd(8);
            return true;
        } else if (i2 == 2) {
            zzgd(zzbel());
            return true;
        } else if (i2 == 3) {
            do {
                zzbdt = zzbdt();
                if (zzbdt == 0 || !zzfz(zzbdt)) {
                    zzfy(((i >>> 3) << 3) | 4);
                }
                zzbdt = zzbdt();
                break;
            } while (!zzfz(zzbdt));
            zzfy(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                zzgd(4);
                return true;
            }
            throw zzegz.zzbgg();
        }
    }

    public final double readDouble() throws IOException {
        return Double.longBitsToDouble(zzbeo());
    }

    public final float readFloat() throws IOException {
        return Float.intBitsToFloat(zzben());
    }

    public final long zzbdu() throws IOException {
        return zzbem();
    }

    public final long zzbdv() throws IOException {
        return zzbem();
    }

    public final int zzbdw() throws IOException {
        return zzbel();
    }

    public final long zzbdx() throws IOException {
        return zzbeo();
    }

    public final int zzbdy() throws IOException {
        return zzben();
    }

    public final boolean zzbdz() throws IOException {
        return zzbem() != 0;
    }

    public final String readString() throws IOException {
        int zzbel = zzbel();
        if (zzbel > 0 && zzbel <= this.limit - this.pos) {
            String str = new String(this.buffer, this.pos, zzbel, zzegr.UTF_8);
            this.pos += zzbel;
            return str;
        } else if (zzbel == 0) {
            return "";
        } else {
            if (zzbel < 0) {
                throw zzegz.zzbgc();
            }
            throw zzegz.zzbgb();
        }
    }

    public final String zzbea() throws IOException {
        int zzbel = zzbel();
        if (zzbel > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (zzbel <= i - i2) {
                String zzo = zzejw.zzo(this.buffer, i2, zzbel);
                this.pos += zzbel;
                return zzo;
            }
        }
        if (zzbel == 0) {
            return "";
        }
        if (zzbel <= 0) {
            throw zzegz.zzbgc();
        }
        throw zzegz.zzbgb();
    }

    public final zzeff zzbeb() throws IOException {
        byte[] bArr;
        int zzbel = zzbel();
        if (zzbel > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (zzbel <= i - i2) {
                zzeff zzi = zzeff.zzi(this.buffer, i2, zzbel);
                this.pos += zzbel;
                return zzi;
            }
        }
        if (zzbel == 0) {
            return zzeff.zzibd;
        }
        if (zzbel > 0) {
            int i3 = this.limit;
            int i4 = this.pos;
            if (zzbel <= i3 - i4) {
                int i5 = zzbel + i4;
                this.pos = i5;
                bArr = Arrays.copyOfRange(this.buffer, i4, i5);
                return zzeff.zzv(bArr);
            }
        }
        if (zzbel > 0) {
            throw zzegz.zzbgb();
        } else if (zzbel == 0) {
            bArr = zzegr.zzibj;
            return zzeff.zzv(bArr);
        } else {
            throw zzegz.zzbgc();
        }
    }

    public final int zzbec() throws IOException {
        return zzbel();
    }

    public final int zzbed() throws IOException {
        return zzbel();
    }

    public final int zzbee() throws IOException {
        return zzben();
    }

    public final long zzbef() throws IOException {
        return zzbeo();
    }

    public final int zzbeg() throws IOException {
        return zzgc(zzbel());
    }

    public final long zzbeh() throws IOException {
        return zzfh(zzbem());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        if (r2[r3] >= 0) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzbel() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.pos
            int r1 = r5.limit
            if (r1 == r0) goto L_0x006d
            byte[] r2 = r5.buffer
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0011
            r5.pos = r3
            return r0
        L_0x0011:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0022
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x006a
        L_0x0022:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x002f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            r1 = r3
            goto L_0x006a
        L_0x002f:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x006a
        L_0x003d:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x0069
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x006a
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x0069
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x006a
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x0069
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 < 0) goto L_0x006d
            goto L_0x006a
        L_0x0069:
            r1 = r3
        L_0x006a:
            r5.pos = r1
            return r0
        L_0x006d:
            long r0 = r5.zzbei()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzefs.zzbel():int");
    }

    private final long zzbem() throws IOException {
        long j;
        int i = this.pos;
        int i2 = this.limit;
        if (i2 != i) {
            byte[] bArr = this.buffer;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.pos = i3;
                return (long) b;
            } else if (i2 - i3 >= 9) {
                int i4 = i3 + 1;
                byte b2 = b ^ (bArr[i3] << 7);
                if (b2 < 0) {
                    j = (long) (b2 ^ Byte.MIN_VALUE);
                } else {
                    int i5 = i4 + 1;
                    byte b3 = b2 ^ (bArr[i4] << 14);
                    if (b3 >= 0) {
                        i4 = i5;
                        j = (long) (b3 ^ 16256);
                    } else {
                        i4 = i5 + 1;
                        byte b4 = b3 ^ (bArr[i5] << 21);
                        if (b4 < 0) {
                            j = (long) (b4 ^ -2080896);
                        } else {
                            long j2 = (long) b4;
                            int i6 = i4 + 1;
                            long j3 = j2 ^ (((long) bArr[i4]) << 28);
                            if (j3 >= 0) {
                                j = j3 ^ 266354560;
                                i4 = i6;
                            } else {
                                i4 = i6 + 1;
                                long j4 = j3 ^ (((long) bArr[i6]) << 35);
                                if (j4 < 0) {
                                    j = j4 ^ -34093383808L;
                                } else {
                                    int i7 = i4 + 1;
                                    long j5 = j4 ^ (((long) bArr[i4]) << 42);
                                    if (j5 >= 0) {
                                        j = j5 ^ 4363953127296L;
                                        i4 = i7;
                                    } else {
                                        i4 = i7 + 1;
                                        long j6 = j5 ^ (((long) bArr[i7]) << 49);
                                        if (j6 < 0) {
                                            j = j6 ^ -558586000294016L;
                                        } else {
                                            int i8 = i4 + 1;
                                            long j7 = (j6 ^ (((long) bArr[i4]) << 56)) ^ 71499008037633920L;
                                            if (j7 < 0) {
                                                i4 = i8 + 1;
                                                if (((long) bArr[i8]) >= 0) {
                                                    j = j7;
                                                }
                                            } else {
                                                i4 = i8;
                                                j = j7;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.pos = i4;
                return j;
            }
        }
        return zzbei();
    }

    /* access modifiers changed from: package-private */
    public final long zzbei() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zzbeq = zzbeq();
            j |= ((long) (zzbeq & Byte.MAX_VALUE)) << i;
            if ((zzbeq & 128) == 0) {
                return j;
            }
        }
        throw zzegz.zzbgd();
    }

    private final int zzben() throws IOException {
        int i = this.pos;
        if (this.limit - i >= 4) {
            byte[] bArr = this.buffer;
            this.pos = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw zzegz.zzbgb();
    }

    private final long zzbeo() throws IOException {
        int i = this.pos;
        if (this.limit - i >= 8) {
            byte[] bArr = this.buffer;
            this.pos = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw zzegz.zzbgb();
    }

    public final int zzga(int i) throws zzegz {
        if (i >= 0) {
            int zzbek = i + zzbek();
            int i2 = this.zziby;
            if (zzbek <= i2) {
                this.zziby = zzbek;
                zzbep();
                return i2;
            }
            throw zzegz.zzbgb();
        }
        throw zzegz.zzbgc();
    }

    private final void zzbep() {
        int i = this.limit + this.zzibv;
        this.limit = i;
        int i2 = i - this.zzibw;
        int i3 = this.zziby;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.zzibv = i4;
            this.limit = i - i4;
            return;
        }
        this.zzibv = 0;
    }

    public final void zzgb(int i) {
        this.zziby = i;
        zzbep();
    }

    public final boolean zzbej() throws IOException {
        return this.pos == this.limit;
    }

    public final int zzbek() {
        return this.pos - this.zzibw;
    }

    private final byte zzbeq() throws IOException {
        int i = this.pos;
        if (i != this.limit) {
            byte[] bArr = this.buffer;
            this.pos = i + 1;
            return bArr[i];
        }
        throw zzegz.zzbgb();
    }

    private final void zzgd(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.limit;
            int i3 = this.pos;
            if (i <= i2 - i3) {
                this.pos = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw zzegz.zzbgc();
        }
        throw zzegz.zzbgb();
    }
}
