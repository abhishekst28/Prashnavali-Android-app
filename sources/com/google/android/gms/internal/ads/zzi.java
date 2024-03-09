package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.core.internal.view.SupportMenu;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
public final class zzi {
    static Pair<ByteBuffer, Long> zza(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair<ByteBuffer, Long> zza = zza(randomAccessFile, 0);
        if (zza != null) {
            return zza;
        }
        return zza(randomAccessFile, (int) SupportMenu.USER_MASK);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair<java.nio.ByteBuffer, java.lang.Long> zza(java.io.RandomAccessFile r10, int r11) throws java.io.IOException {
        /*
            if (r11 < 0) goto L_0x0088
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r11 > r0) goto L_0x0088
            long r1 = r10.length()
            r3 = 0
            r4 = 22
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0013
            return r3
        L_0x0013:
            long r6 = (long) r11
            long r4 = r1 - r4
            long r4 = java.lang.Math.min(r6, r4)
            int r11 = (int) r4
            r4 = 22
            int r11 = r11 + r4
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.allocate(r11)
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
            r11.order(r5)
            int r5 = r11.capacity()
            long r5 = (long) r5
            long r1 = r1 - r5
            r10.seek(r1)
            byte[] r5 = r11.array()
            int r6 = r11.arrayOffset()
            int r7 = r11.capacity()
            r10.readFully(r5, r6, r7)
            zze(r11)
            int r10 = r11.capacity()
            r5 = -1
            if (r10 < r4) goto L_0x006c
            int r10 = r10 - r4
            int r4 = java.lang.Math.min(r10, r0)
            r6 = 0
        L_0x0051:
            if (r6 >= r4) goto L_0x006c
            int r7 = r10 - r6
            int r8 = r11.getInt(r7)
            r9 = 101010256(0x6054b50, float:2.506985E-35)
            if (r8 != r9) goto L_0x0069
            int r8 = r7 + 20
            short r8 = r11.getShort(r8)
            r8 = r8 & r0
            if (r8 != r6) goto L_0x0069
            goto L_0x006d
        L_0x0069:
            int r6 = r6 + 1
            goto L_0x0051
        L_0x006c:
            r7 = -1
        L_0x006d:
            if (r7 != r5) goto L_0x0071
            return r3
        L_0x0071:
            r11.position(r7)
            java.nio.ByteBuffer r10 = r11.slice()
            java.nio.ByteOrder r11 = java.nio.ByteOrder.LITTLE_ENDIAN
            r10.order(r11)
            long r3 = (long) r7
            long r1 = r1 + r3
            java.lang.Long r11 = java.lang.Long.valueOf(r1)
            android.util.Pair r10 = android.util.Pair.create(r10, r11)
            return r10
        L_0x0088:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r0 = 27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "maxCommentSize: "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzi.zza(java.io.RandomAccessFile, int):android.util.Pair");
    }

    public static long zzc(ByteBuffer byteBuffer) {
        zze(byteBuffer);
        return zzb(byteBuffer, byteBuffer.position() + 16);
    }

    public static void zza(ByteBuffer byteBuffer, long j) {
        zze(byteBuffer);
        int position = byteBuffer.position() + 16;
        if (j < 0 || j > 4294967295L) {
            StringBuilder sb = new StringBuilder(47);
            sb.append("uint32 value of out range: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        byteBuffer.putInt(byteBuffer.position() + position, (int) j);
    }

    public static long zzd(ByteBuffer byteBuffer) {
        zze(byteBuffer);
        return zzb(byteBuffer, byteBuffer.position() + 12);
    }

    private static void zze(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static long zzb(ByteBuffer byteBuffer, int i) {
        return ((long) byteBuffer.getInt(i)) & 4294967295L;
    }
}
