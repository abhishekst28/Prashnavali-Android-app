package com.google.android.gms.internal.ads;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzpf {
    public static final byte[] zzbjn = {0, 0, 0, 1};
    private static final float[] zzbjr = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzbjs = new Object();
    private static int[] zzbjt = new int[10];

    public static int zzb(byte[] bArr, int i) {
        int i2;
        synchronized (zzbjs) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 < i - 2) {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } else {
                        i3 = i;
                        break;
                    }
                }
                if (i3 < i) {
                    if (zzbjt.length <= i4) {
                        zzbjt = Arrays.copyOf(zzbjt, zzbjt.length << 1);
                    }
                    zzbjt[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = zzbjt[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i10 + 1;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    public static void zzp(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < position) {
                byte b = byteBuffer.get(i) & 255;
                if (i2 == 3) {
                    if (b == 1 && (byteBuffer.get(i3) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (b == 0) {
                    i2++;
                }
                if (b != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static boolean zza(String str, byte b) {
        if ((!"video/avc".equals(str) || (b & 31) != 6) && (!"video/hevc".equals(str) || ((b & 126) >> 1) != 39)) {
            return false;
        }
        return true;
    }

    public static zzpi zzd(byte[] bArr, int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        boolean z3;
        zzpj zzpj = new zzpj(bArr, i, i2);
        zzpj.zzbl(8);
        int zzbk = zzpj.zzbk(8);
        zzpj.zzbl(16);
        int zziu = zzpj.zziu();
        int i8 = 1;
        if (zzbk == 100 || zzbk == 110 || zzbk == 122 || zzbk == 244 || zzbk == 44 || zzbk == 83 || zzbk == 86 || zzbk == 118 || zzbk == 128 || zzbk == 138) {
            i3 = zzpj.zziu();
            if (i3 == 3) {
                z3 = zzpj.zzit();
            } else {
                z3 = false;
            }
            zzpj.zziu();
            zzpj.zziu();
            zzpj.zzbl(1);
            if (zzpj.zzit()) {
                int i9 = i3 != 3 ? 8 : 12;
                int i10 = 0;
                while (i10 < i9) {
                    if (zzpj.zzit()) {
                        int i11 = i10 < 6 ? 16 : 64;
                        int i12 = 8;
                        int i13 = 8;
                        for (int i14 = 0; i14 < i11; i14++) {
                            if (i12 != 0) {
                                i12 = ((zzpj.zziv() + i13) + 256) % 256;
                            }
                            if (i12 != 0) {
                                i13 = i12;
                            }
                        }
                    }
                    i10++;
                }
            }
            z = z3;
        } else {
            i3 = 1;
            z = false;
        }
        int zziu2 = zzpj.zziu() + 4;
        int zziu3 = zzpj.zziu();
        if (zziu3 == 0) {
            i4 = zzpj.zziu() + 4;
            z2 = false;
        } else if (zziu3 == 1) {
            boolean zzit = zzpj.zzit();
            zzpj.zziv();
            zzpj.zziv();
            long zziu4 = (long) zzpj.zziu();
            for (int i15 = 0; ((long) i15) < zziu4; i15++) {
                zzpj.zziu();
            }
            z2 = zzit;
            i4 = 0;
        } else {
            i4 = 0;
            z2 = false;
        }
        zzpj.zziu();
        zzpj.zzbl(1);
        int zziu5 = zzpj.zziu() + 1;
        boolean zzit2 = zzpj.zzit();
        int zziu6 = (true - (zzit2 ? 1 : 0)) * (zzpj.zziu() + 1);
        if (!zzit2) {
            zzpj.zzbl(1);
        }
        zzpj.zzbl(1);
        int i16 = zziu5 << 4;
        int i17 = zziu6 << 4;
        if (zzpj.zzit()) {
            int zziu7 = zzpj.zziu();
            int zziu8 = zzpj.zziu();
            int zziu9 = zzpj.zziu();
            int zziu10 = zzpj.zziu();
            if (i3 == 0) {
                i7 = true - zzit2;
            } else {
                int i18 = i3 == 3 ? 1 : 2;
                if (i3 == 1) {
                    i8 = 2;
                }
                i7 = (true - zzit2) * i8;
                i8 = i18;
            }
            i6 = i16 - ((zziu7 + zziu8) * i8);
            i5 = i17 - ((zziu9 + zziu10) * i7);
        } else {
            i6 = i16;
            i5 = i17;
        }
        float f2 = 1.0f;
        if (zzpj.zzit() && zzpj.zzit()) {
            int zzbk2 = zzpj.zzbk(8);
            if (zzbk2 == 255) {
                int zzbk3 = zzpj.zzbk(16);
                int zzbk4 = zzpj.zzbk(16);
                if (!(zzbk3 == 0 || zzbk4 == 0)) {
                    f2 = ((float) zzbk3) / ((float) zzbk4);
                }
                f = f2;
            } else {
                float[] fArr = zzbjr;
                if (zzbk2 < fArr.length) {
                    f = fArr[zzbk2];
                } else {
                    StringBuilder sb = new StringBuilder(46);
                    sb.append("Unexpected aspect_ratio_idc value: ");
                    sb.append(zzbk2);
                    Log.w("NalUnitUtil", sb.toString());
                }
            }
            return new zzpi(zziu, i6, i5, f, z, zzit2, zziu2, zziu3, i4, z2);
        }
        f = 1.0f;
        return new zzpi(zziu, i6, i5, f, z, zzit2, zziu2, zziu3, i4, z2);
    }
}
