package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zznr {
    public static void zza(long j, zzpk zzpk, zzkg[] zzkgArr) {
        boolean z;
        zzpk zzpk2 = zzpk;
        zzkg[] zzkgArr2 = zzkgArr;
        while (zzpk.zziy() > 1) {
            int zzf = zzf(zzpk);
            int zzf2 = zzf(zzpk);
            if (zzf2 == -1 || zzf2 > zzpk.zziy()) {
                Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                zzpk2.zzbo(zzpk.limit());
            } else {
                if (zzf != 4 || zzf2 < 8) {
                    z = false;
                } else {
                    int position = zzpk.getPosition();
                    int readUnsignedByte = zzpk.readUnsignedByte();
                    int readUnsignedShort = zzpk.readUnsignedShort();
                    int readInt = zzpk.readInt();
                    int readUnsignedByte2 = zzpk.readUnsignedByte();
                    zzpk2.zzbo(position);
                    z = readUnsignedByte == 181 && readUnsignedShort == 49 && readInt == 1195456820 && readUnsignedByte2 == 3;
                }
                if (z) {
                    zzpk2.zzbp(8);
                    zzpk2.zzbp(1);
                    int readUnsignedByte3 = (zzpk.readUnsignedByte() & 31) * 3;
                    int position2 = zzpk.getPosition();
                    for (zzkg zzkg : zzkgArr2) {
                        zzpk2.zzbo(position2);
                        zzkg.zza(zzpk2, readUnsignedByte3);
                        zzkg.zza(j, 1, readUnsignedByte3, 0, (zzkf) null);
                    }
                    zzpk2.zzbp(zzf2 - (readUnsignedByte3 + 10));
                } else {
                    zzpk2.zzbp(zzf2);
                }
            }
        }
    }

    private static int zzf(zzpk zzpk) {
        int i = 0;
        while (zzpk.zziy() != 0) {
            int readUnsignedByte = zzpk.readUnsignedByte();
            i += readUnsignedByte;
            if (readUnsignedByte != 255) {
                return i;
            }
        }
        return -1;
    }
}
