package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzefb {
    static int zza(byte[] bArr, int i, zzefa zzefa) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zza((int) b, bArr, i2, zzefa);
        }
        zzefa.zziaw = b;
        return i2;
    }

    static int zza(int i, byte[] bArr, int i2, zzefa zzefa) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzefa.zziaw = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzefa.zziaw = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzefa.zziaw = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzefa.zziaw = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzefa.zziaw = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zzb(byte[] bArr, int i, zzefa zzefa) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            zzefa.zziax = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        zzefa.zziax = j2;
        return i3;
    }

    static int zzg(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    static long zzh(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    static double zzi(byte[] bArr, int i) {
        return Double.longBitsToDouble(zzh(bArr, i));
    }

    static float zzj(byte[] bArr, int i) {
        return Float.intBitsToFloat(zzg(bArr, i));
    }

    static int zzc(byte[] bArr, int i, zzefa zzefa) throws zzegz {
        int zza = zza(bArr, i, zzefa);
        int i2 = zzefa.zziaw;
        if (i2 < 0) {
            throw zzegz.zzbgc();
        } else if (i2 == 0) {
            zzefa.zziay = "";
            return zza;
        } else {
            zzefa.zziay = new String(bArr, zza, i2, zzegr.UTF_8);
            return zza + i2;
        }
    }

    static int zzd(byte[] bArr, int i, zzefa zzefa) throws zzegz {
        int zza = zza(bArr, i, zzefa);
        int i2 = zzefa.zziaw;
        if (i2 < 0) {
            throw zzegz.zzbgc();
        } else if (i2 == 0) {
            zzefa.zziay = "";
            return zza;
        } else {
            zzefa.zziay = zzejw.zzo(bArr, zza, i2);
            return zza + i2;
        }
    }

    static int zze(byte[] bArr, int i, zzefa zzefa) throws zzegz {
        int zza = zza(bArr, i, zzefa);
        int i2 = zzefa.zziaw;
        if (i2 < 0) {
            throw zzegz.zzbgc();
        } else if (i2 > bArr.length - zza) {
            throw zzegz.zzbgb();
        } else if (i2 == 0) {
            zzefa.zziay = zzeff.zzibd;
            return zza;
        } else {
            zzefa.zziay = zzeff.zzi(bArr, zza, i2);
            return zza + i2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int zza(com.google.android.gms.internal.ads.zzeiv r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.ads.zzefa r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000e
            int r0 = zza((int) r8, (byte[]) r7, (int) r0, (com.google.android.gms.internal.ads.zzefa) r10)
            int r8 = r10.zziaw
            r3 = r0
            goto L_0x000f
        L_0x000e:
            r3 = r0
        L_0x000f:
            if (r8 < 0) goto L_0x0027
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0027
            java.lang.Object r9 = r6.newInstance()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.zza(r1, r2, r3, r4, r5)
            r6.zzaj(r9)
            r10.zziay = r9
            return r8
        L_0x0027:
            com.google.android.gms.internal.ads.zzegz r6 = com.google.android.gms.internal.ads.zzegz.zzbgb()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzefb.zza(com.google.android.gms.internal.ads.zzeiv, byte[], int, int, com.google.android.gms.internal.ads.zzefa):int");
    }

    static int zza(zzeiv zzeiv, byte[] bArr, int i, int i2, int i3, zzefa zzefa) throws IOException {
        zzeid zzeid = (zzeid) zzeiv;
        Object newInstance = zzeid.newInstance();
        int zza = zzeid.zza(newInstance, bArr, i, i2, i3, zzefa);
        zzeid.zzaj(newInstance);
        zzefa.zziay = newInstance;
        return zza;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzeha<?> zzeha, zzefa zzefa) {
        zzegs zzegs = (zzegs) zzeha;
        int zza = zza(bArr, i2, zzefa);
        zzegs.zzhc(zzefa.zziaw);
        while (zza < i3) {
            int zza2 = zza(bArr, zza, zzefa);
            if (i != zzefa.zziaw) {
                break;
            }
            zza = zza(bArr, zza2, zzefa);
            zzegs.zzhc(zzefa.zziaw);
        }
        return zza;
    }

    static int zza(byte[] bArr, int i, zzeha<?> zzeha, zzefa zzefa) throws IOException {
        zzegs zzegs = (zzegs) zzeha;
        int zza = zza(bArr, i, zzefa);
        int i2 = zzefa.zziaw + zza;
        while (zza < i2) {
            zza = zza(bArr, zza, zzefa);
            zzegs.zzhc(zzefa.zziaw);
        }
        if (zza == i2) {
            return zza;
        }
        throw zzegz.zzbgb();
    }

    static int zza(zzeiv<?> zzeiv, int i, byte[] bArr, int i2, int i3, zzeha<?> zzeha, zzefa zzefa) throws IOException {
        int zza = zza((zzeiv) zzeiv, bArr, i2, i3, zzefa);
        zzeha.add(zzefa.zziay);
        while (zza < i3) {
            int zza2 = zza(bArr, zza, zzefa);
            if (i != zzefa.zziaw) {
                break;
            }
            zza = zza((zzeiv) zzeiv, bArr, zza2, i3, zzefa);
            zzeha.add(zzefa.zziay);
        }
        return zza;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzejq zzejq, zzefa zzefa) throws zzegz {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int zzb = zzb(bArr, i2, zzefa);
                zzejq.zzd(i, Long.valueOf(zzefa.zziax));
                return zzb;
            } else if (i4 == 1) {
                zzejq.zzd(i, Long.valueOf(zzh(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int zza = zza(bArr, i2, zzefa);
                int i5 = zzefa.zziaw;
                if (i5 < 0) {
                    throw zzegz.zzbgc();
                } else if (i5 <= bArr.length - zza) {
                    if (i5 == 0) {
                        zzejq.zzd(i, zzeff.zzibd);
                    } else {
                        zzejq.zzd(i, zzeff.zzi(bArr, zza, i5));
                    }
                    return zza + i5;
                } else {
                    throw zzegz.zzbgb();
                }
            } else if (i4 == 3) {
                zzejq zzbia = zzejq.zzbia();
                int i6 = (i & -8) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int zza2 = zza(bArr, i2, zzefa);
                    int i8 = zzefa.zziaw;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = zza2;
                        break;
                    }
                    i7 = i8;
                    i2 = zza(i8, bArr, zza2, i3, zzbia, zzefa);
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzegz.zzbgi();
                }
                zzejq.zzd(i, zzbia);
                return i2;
            } else if (i4 == 5) {
                zzejq.zzd(i, Integer.valueOf(zzg(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzegz.zzbge();
            }
        } else {
            throw zzegz.zzbge();
        }
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzefa zzefa) throws zzegz {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return zzb(bArr, i2, zzefa);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return zza(bArr, i2, zzefa) + zzefa.zziaw;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = zza(bArr, i2, zzefa);
                    i6 = zzefa.zziaw;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = zza(i6, bArr, i2, i3, zzefa);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw zzegz.zzbgi();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw zzegz.zzbge();
            }
        } else {
            throw zzegz.zzbge();
        }
    }
}
