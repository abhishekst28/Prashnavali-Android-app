package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzefv extends zzefq {
    private final byte[] buffer;
    private int pos;
    private int zzajz;
    private int zzibv;
    private int zzibx;
    private int zziby;
    private final InputStream zzibz;
    private int zzica;
    private zzefu zzicb;

    private zzefv(InputStream inputStream, int i) {
        super();
        this.zziby = Integer.MAX_VALUE;
        this.zzicb = null;
        zzegr.zza(inputStream, "input");
        this.zzibz = inputStream;
        this.buffer = new byte[i];
        this.zzajz = 0;
        this.pos = 0;
        this.zzica = 0;
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
            if (this.zzajz - this.pos >= 10) {
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
        if (zzbel > 0 && zzbel <= this.zzajz - this.pos) {
            String str = new String(this.buffer, this.pos, zzbel, zzegr.UTF_8);
            this.pos += zzbel;
            return str;
        } else if (zzbel == 0) {
            return "";
        } else {
            if (zzbel > this.zzajz) {
                return new String(zzg(zzbel, false), zzegr.UTF_8);
            }
            zzge(zzbel);
            String str2 = new String(this.buffer, this.pos, zzbel, zzegr.UTF_8);
            this.pos += zzbel;
            return str2;
        }
    }

    public final String zzbea() throws IOException {
        byte[] bArr;
        int zzbel = zzbel();
        int i = this.pos;
        if (zzbel <= this.zzajz - i && zzbel > 0) {
            bArr = this.buffer;
            this.pos = i + zzbel;
        } else if (zzbel == 0) {
            return "";
        } else {
            if (zzbel <= this.zzajz) {
                zzge(zzbel);
                bArr = this.buffer;
                this.pos = zzbel;
                i = 0;
            } else {
                bArr = zzg(zzbel, false);
                i = 0;
            }
        }
        return zzejw.zzo(bArr, i, zzbel);
    }

    public final zzeff zzbeb() throws IOException {
        int zzbel = zzbel();
        int i = this.zzajz;
        int i2 = this.pos;
        if (zzbel <= i - i2 && zzbel > 0) {
            zzeff zzi = zzeff.zzi(this.buffer, i2, zzbel);
            this.pos += zzbel;
            return zzi;
        } else if (zzbel == 0) {
            return zzeff.zzibd;
        } else {
            byte[] zzgg = zzgg(zzbel);
            if (zzgg != null) {
                return zzeff.zzu(zzgg);
            }
            int i3 = this.pos;
            int i4 = this.zzajz;
            int i5 = i4 - i3;
            this.zzica += i4;
            this.pos = 0;
            this.zzajz = 0;
            List<byte[]> zzgh = zzgh(zzbel - i5);
            byte[] bArr = new byte[zzbel];
            System.arraycopy(this.buffer, i3, bArr, 0, i5);
            for (byte[] next : zzgh) {
                System.arraycopy(next, 0, bArr, i5, next.length);
                i5 += next.length;
            }
            return zzeff.zzv(bArr);
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
            int r1 = r5.zzajz
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzefv.zzbel():int");
    }

    private final long zzbem() throws IOException {
        long j;
        int i = this.pos;
        int i2 = this.zzajz;
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
        if (this.zzajz - i < 4) {
            zzge(4);
            i = this.pos;
        }
        byte[] bArr = this.buffer;
        this.pos = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private final long zzbeo() throws IOException {
        int i = this.pos;
        if (this.zzajz - i < 8) {
            zzge(8);
            i = this.pos;
        }
        byte[] bArr = this.buffer;
        this.pos = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public final int zzga(int i) throws zzegz {
        if (i >= 0) {
            int i2 = i + this.zzica + this.pos;
            int i3 = this.zziby;
            if (i2 <= i3) {
                this.zziby = i2;
                zzbep();
                return i3;
            }
            throw zzegz.zzbgb();
        }
        throw zzegz.zzbgc();
    }

    private final void zzbep() {
        int i = this.zzajz + this.zzibv;
        this.zzajz = i;
        int i2 = this.zzica + i;
        int i3 = this.zziby;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.zzibv = i4;
            this.zzajz = i - i4;
            return;
        }
        this.zzibv = 0;
    }

    public final void zzgb(int i) {
        this.zziby = i;
        zzbep();
    }

    public final boolean zzbej() throws IOException {
        return this.pos == this.zzajz && !zzgf(1);
    }

    public final int zzbek() {
        return this.zzica + this.pos;
    }

    private final void zzge(int i) throws IOException {
        if (zzgf(i)) {
            return;
        }
        if (i > (this.zzibr - this.zzica) - this.pos) {
            throw zzegz.zzbgh();
        }
        throw zzegz.zzbgb();
    }

    private final boolean zzgf(int i) throws IOException {
        while (this.pos + i > this.zzajz) {
            int i2 = this.zzibr;
            int i3 = this.zzica;
            int i4 = this.pos;
            if (i > (i2 - i3) - i4 || i3 + i4 + i > this.zziby) {
                return false;
            }
            if (i4 > 0) {
                int i5 = this.zzajz;
                if (i5 > i4) {
                    byte[] bArr = this.buffer;
                    System.arraycopy(bArr, i4, bArr, 0, i5 - i4);
                }
                this.zzica += i4;
                this.zzajz -= i4;
                this.pos = 0;
            }
            InputStream inputStream = this.zzibz;
            byte[] bArr2 = this.buffer;
            int i6 = this.zzajz;
            int read = inputStream.read(bArr2, i6, Math.min(bArr2.length - i6, (this.zzibr - this.zzica) - this.zzajz));
            if (read == 0 || read < -1 || read > this.buffer.length) {
                String valueOf = String.valueOf(this.zzibz.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 91);
                sb.append(valueOf);
                sb.append("#read(byte[]) returned invalid result: ");
                sb.append(read);
                sb.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb.toString());
            } else if (read <= 0) {
                return false;
            } else {
                this.zzajz += read;
                zzbep();
                if (this.zzajz >= i) {
                    return true;
                }
            }
        }
        StringBuilder sb2 = new StringBuilder(77);
        sb2.append("refillBuffer() called when ");
        sb2.append(i);
        sb2.append(" bytes were already available in buffer");
        throw new IllegalStateException(sb2.toString());
    }

    private final byte zzbeq() throws IOException {
        if (this.pos == this.zzajz) {
            zzge(1);
        }
        byte[] bArr = this.buffer;
        int i = this.pos;
        this.pos = i + 1;
        return bArr[i];
    }

    private final byte[] zzg(int i, boolean z) throws IOException {
        byte[] zzgg = zzgg(i);
        if (zzgg != null) {
            return zzgg;
        }
        int i2 = this.pos;
        int i3 = this.zzajz;
        int i4 = i3 - i2;
        this.zzica += i3;
        this.pos = 0;
        this.zzajz = 0;
        List<byte[]> zzgh = zzgh(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.buffer, i2, bArr, 0, i4);
        for (byte[] next : zzgh) {
            System.arraycopy(next, 0, bArr, i4, next.length);
            i4 += next.length;
        }
        return bArr;
    }

    private final byte[] zzgg(int i) throws IOException {
        if (i == 0) {
            return zzegr.zzibj;
        }
        if (i >= 0) {
            int i2 = this.zzica + this.pos + i;
            if (i2 - this.zzibr <= 0) {
                int i3 = this.zziby;
                if (i2 <= i3) {
                    int i4 = this.zzajz - this.pos;
                    int i5 = i - i4;
                    if (i5 >= 4096 && i5 > this.zzibz.available()) {
                        return null;
                    }
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.buffer, this.pos, bArr, 0, i4);
                    this.zzica += this.zzajz;
                    this.pos = 0;
                    this.zzajz = 0;
                    while (i4 < i) {
                        int read = this.zzibz.read(bArr, i4, i - i4);
                        if (read != -1) {
                            this.zzica += read;
                            i4 += read;
                        } else {
                            throw zzegz.zzbgb();
                        }
                    }
                    return bArr;
                }
                zzgd((i3 - this.zzica) - this.pos);
                throw zzegz.zzbgb();
            }
            throw zzegz.zzbgh();
        }
        throw zzegz.zzbgc();
    }

    private final List<byte[]> zzgh(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.zzibz.read(bArr, i2, min - i2);
                if (read != -1) {
                    this.zzica += read;
                    i2 += read;
                } else {
                    throw zzegz.zzbgb();
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzgd(int i) throws IOException {
        int i2 = this.zzajz;
        int i3 = this.pos;
        if (i <= i2 - i3 && i >= 0) {
            this.pos = i3 + i;
        } else if (i >= 0) {
            int i4 = this.zzica;
            int i5 = this.pos;
            int i6 = i4 + i5 + i;
            int i7 = this.zziby;
            if (i6 <= i7) {
                this.zzica = i4 + i5;
                int i8 = this.zzajz - i5;
                this.zzajz = 0;
                this.pos = 0;
                while (i8 < i) {
                    try {
                        long j = (long) (i - i8);
                        long skip = this.zzibz.skip(j);
                        int i9 = (skip > 0 ? 1 : (skip == 0 ? 0 : -1));
                        if (i9 >= 0 && skip <= j) {
                            if (i9 == 0) {
                                break;
                            }
                            i8 += (int) skip;
                        } else {
                            String valueOf = String.valueOf(this.zzibz.getClass());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 92);
                            sb.append(valueOf);
                            sb.append("#skip returned invalid result: ");
                            sb.append(skip);
                            sb.append("\nThe InputStream implementation is buggy.");
                            throw new IllegalStateException(sb.toString());
                        }
                    } catch (Throwable th) {
                        this.zzica += i8;
                        zzbep();
                        throw th;
                    }
                }
                this.zzica += i8;
                zzbep();
                if (i8 < i) {
                    int i10 = this.zzajz;
                    int i11 = i10 - this.pos;
                    this.pos = i10;
                    zzge(1);
                    while (true) {
                        int i12 = i - i11;
                        int i13 = this.zzajz;
                        if (i12 > i13) {
                            i11 += i13;
                            this.pos = i13;
                            zzge(1);
                        } else {
                            this.pos = i12;
                            return;
                        }
                    }
                }
            } else {
                zzgd((i7 - i4) - i5);
                throw zzegz.zzbgb();
            }
        } else {
            throw zzegz.zzbgc();
        }
    }
}
