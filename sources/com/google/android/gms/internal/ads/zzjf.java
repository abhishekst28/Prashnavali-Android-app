package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzjf {
    private final int zzahj;
    private float zzahw = 1.0f;
    private float zzahx = 1.0f;
    private final int zzamw;
    private final int zzamx;
    private final int zzamy;
    private final int zzamz;
    private final short[] zzana;
    private int zzanb;
    private short[] zzanc;
    private int zzand;
    private short[] zzane;
    private int zzanf;
    private short[] zzang;
    private int zzanh = 0;
    private int zzani = 0;
    private int zzanj;
    private int zzank;
    private int zzanl;
    private int zzanm;
    private int zzann = 0;
    private int zzano;
    private int zzanp;
    private int zzanq;

    public zzjf(int i, int i2) {
        this.zzahj = i;
        this.zzamw = i2;
        this.zzamx = i / 400;
        int i3 = i / 65;
        this.zzamy = i3;
        int i4 = i3 * 2;
        this.zzamz = i4;
        this.zzana = new short[i4];
        this.zzanb = i4;
        this.zzanc = new short[(i4 * i2)];
        this.zzand = i4;
        this.zzane = new short[(i4 * i2)];
        this.zzanf = i4;
        this.zzang = new short[(i4 * i2)];
    }

    public final void setSpeed(float f) {
        this.zzahw = f;
    }

    public final void zzc(float f) {
        this.zzahx = f;
    }

    public final void zza(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.zzamw;
        int i2 = remaining / i;
        zzab(i2);
        shortBuffer.get(this.zzanc, this.zzanj * this.zzamw, ((i * i2) << 1) / 2);
        this.zzanj += i2;
        zzgg();
    }

    public final void zzb(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.zzamw, this.zzank);
        shortBuffer.put(this.zzane, 0, this.zzamw * min);
        int i = this.zzank - min;
        this.zzank = i;
        short[] sArr = this.zzane;
        int i2 = this.zzamw;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    public final void zzfj() {
        int i;
        int i2 = this.zzanj;
        float f = this.zzahw;
        float f2 = this.zzahx;
        int i3 = this.zzank + ((int) ((((((float) i2) / (f / f2)) + ((float) this.zzanl)) / f2) + 0.5f));
        zzab((this.zzamz * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.zzamz;
            int i5 = this.zzamw;
            if (i4 >= i * 2 * i5) {
                break;
            }
            this.zzanc[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.zzanj += i * 2;
        zzgg();
        if (this.zzank > i3) {
            this.zzank = i3;
        }
        this.zzanj = 0;
        this.zzanm = 0;
        this.zzanl = 0;
    }

    public final int zzgf() {
        return this.zzank;
    }

    private final void zzaa(int i) {
        int i2 = this.zzank + i;
        int i3 = this.zzand;
        if (i2 > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.zzand = i4;
            this.zzane = Arrays.copyOf(this.zzane, i4 * this.zzamw);
        }
    }

    private final void zzab(int i) {
        int i2 = this.zzanj + i;
        int i3 = this.zzanb;
        if (i2 > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.zzanb = i4;
            this.zzanc = Arrays.copyOf(this.zzanc, i4 * this.zzamw);
        }
    }

    private final void zza(short[] sArr, int i, int i2) {
        zzaa(i2);
        int i3 = this.zzamw;
        System.arraycopy(sArr, i * i3, this.zzane, this.zzank * i3, i3 * i2);
        this.zzank += i2;
    }

    private final void zzb(short[] sArr, int i, int i2) {
        int i3 = this.zzamz / i2;
        int i4 = this.zzamw;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.zzana[i7] = (short) (i8 / i5);
        }
    }

    private final int zza(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.zzamw;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                short s = sArr[i4 + i10];
                short s2 = sArr[i4 + i2 + i10];
                i9 += s >= s2 ? s - s2 : s2 - s;
            }
            if (i9 * i7 < i5 * i2) {
                i7 = i2;
                i5 = i9;
            }
            if (i9 * i6 > i8 * i2) {
                i6 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.zzanp = i5 / i7;
        this.zzanq = i8 / i6;
        return i7;
    }

    private final void zzgg() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8 = this.zzank;
        float f = this.zzahw / this.zzahx;
        double d = (double) f;
        int i9 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i10 = this.zzanj;
            if (i10 >= this.zzamz) {
                int i11 = 0;
                while (true) {
                    int i12 = this.zzanm;
                    if (i12 > 0) {
                        int min = Math.min(this.zzamz, i12);
                        zza(this.zzanc, i11, min);
                        this.zzanm -= min;
                        i11 += min;
                    } else {
                        short[] sArr = this.zzanc;
                        int i13 = this.zzahj;
                        int i14 = i13 > 4000 ? i13 / 4000 : 1;
                        if (this.zzamw == i9 && i14 == i9) {
                            i4 = zza(sArr, i11, this.zzamx, this.zzamy);
                        } else {
                            zzb(sArr, i11, i14);
                            int zza = zza(this.zzana, 0, this.zzamx / i14, this.zzamy / i14);
                            if (i14 != i9) {
                                int i15 = zza * i14;
                                int i16 = i14 << 2;
                                int i17 = i15 - i16;
                                int i18 = i15 + i16;
                                int i19 = this.zzamx;
                                if (i17 < i19) {
                                    i17 = i19;
                                }
                                int i20 = this.zzamy;
                                if (i18 > i20) {
                                    i18 = i20;
                                }
                                if (this.zzamw == i9) {
                                    i4 = zza(sArr, i11, i17, i18);
                                } else {
                                    zzb(sArr, i11, i9);
                                    i4 = zza(this.zzana, 0, i17, i18);
                                }
                            } else {
                                i4 = zza;
                            }
                        }
                        int i21 = this.zzanp;
                        int i22 = this.zzanq;
                        if (i21 == 0 || this.zzann == 0) {
                            z = false;
                        } else if (i22 > i21 * 3) {
                            z = false;
                        } else if ((i21 << 1) <= this.zzano * 3) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            i5 = this.zzann;
                        } else {
                            i5 = i4;
                        }
                        this.zzano = this.zzanp;
                        this.zzann = i4;
                        if (d > 1.0d) {
                            short[] sArr2 = this.zzanc;
                            if (f >= 2.0f) {
                                i7 = (int) (((float) i5) / (f - 1.0f));
                            } else {
                                this.zzanm = (int) ((((float) i5) * (2.0f - f)) / (f - 1.0f));
                                i7 = i5;
                            }
                            zzaa(i7);
                            int i23 = i7;
                            zza(i7, this.zzamw, this.zzane, this.zzank, sArr2, i11, sArr2, i11 + i5);
                            this.zzank += i23;
                            i11 += i5 + i23;
                        } else {
                            int i24 = i5;
                            short[] sArr3 = this.zzanc;
                            if (f < 0.5f) {
                                i6 = (int) ((((float) i24) * f) / (1.0f - f));
                            } else {
                                this.zzanm = (int) ((((float) i24) * ((2.0f * f) - 1.0f)) / (1.0f - f));
                                i6 = i24;
                            }
                            int i25 = i24 + i6;
                            zzaa(i25);
                            int i26 = this.zzamw;
                            System.arraycopy(sArr3, i11 * i26, this.zzane, this.zzank * i26, i26 * i24);
                            zza(i6, this.zzamw, this.zzane, this.zzank + i24, sArr3, i24 + i11, sArr3, i11);
                            this.zzank += i25;
                            i11 += i6;
                        }
                    }
                    if (this.zzamz + i11 > i10) {
                        break;
                    }
                    i9 = 1;
                }
                int i27 = this.zzanj - i11;
                short[] sArr4 = this.zzanc;
                int i28 = this.zzamw;
                System.arraycopy(sArr4, i11 * i28, sArr4, 0, i28 * i27);
                this.zzanj = i27;
            }
        } else {
            zza(this.zzanc, 0, this.zzanj);
            this.zzanj = 0;
        }
        float f2 = this.zzahx;
        if (f2 != 1.0f && this.zzank != i8) {
            int i29 = this.zzahj;
            int i30 = (int) (((float) i29) / f2);
            while (true) {
                if (i30 <= 16384 && i29 <= 16384) {
                    break;
                }
                i30 /= 2;
                i29 /= 2;
            }
            int i31 = this.zzank - i8;
            int i32 = this.zzanl + i31;
            int i33 = this.zzanf;
            if (i32 > i33) {
                int i34 = i33 + (i33 / 2) + i31;
                this.zzanf = i34;
                this.zzang = Arrays.copyOf(this.zzang, i34 * this.zzamw);
            }
            short[] sArr5 = this.zzane;
            int i35 = this.zzamw;
            System.arraycopy(sArr5, i8 * i35, this.zzang, this.zzanl * i35, i35 * i31);
            this.zzank = i8;
            this.zzanl += i31;
            int i36 = 0;
            while (true) {
                i = this.zzanl;
                if (i36 >= i - 1) {
                    break;
                }
                while (true) {
                    i2 = this.zzanh;
                    int i37 = (i2 + 1) * i30;
                    i3 = this.zzani;
                    if (i37 <= i3 * i29) {
                        break;
                    }
                    zzaa(1);
                    int i38 = 0;
                    while (true) {
                        int i39 = this.zzamw;
                        if (i38 >= i39) {
                            break;
                        }
                        short[] sArr6 = this.zzang;
                        int i40 = (i36 * i39) + i38;
                        short s = sArr6[i40];
                        short s2 = sArr6[i40 + i39];
                        int i41 = this.zzanh;
                        int i42 = i41 * i30;
                        int i43 = (i41 + 1) * i30;
                        int i44 = i43 - (this.zzani * i29);
                        int i45 = i43 - i42;
                        this.zzane[(this.zzank * i39) + i38] = (short) (((s * i44) + ((i45 - i44) * s2)) / i45);
                        i38++;
                    }
                    this.zzani++;
                    this.zzank++;
                }
                int i46 = i2 + 1;
                this.zzanh = i46;
                if (i46 == i29) {
                    this.zzanh = 0;
                    zzoz.checkState(i3 == i30);
                    this.zzani = 0;
                }
                i36++;
            }
            int i47 = i - 1;
            if (i47 != 0) {
                short[] sArr7 = this.zzang;
                int i48 = this.zzamw;
                System.arraycopy(sArr7, i47 * i48, sArr7, 0, (i - i47) * i48);
                this.zzanl -= i47;
            }
        }
    }

    private static void zza(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }
}
