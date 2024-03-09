package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzrx extends zzrq {
    private MessageDigest zzbuc;
    private final int zzbud;
    private final int zzbue;

    public zzrx(int i) {
        int i2 = i / 8;
        this.zzbud = i % 8 > 0 ? i2 + 1 : i2;
        this.zzbue = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] zzbu(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.mLock
            monitor-enter(r0)
            java.security.MessageDigest r1 = r9.zzmq()     // Catch:{ all -> 0x0068 }
            r9.zzbuc = r1     // Catch:{ all -> 0x0068 }
            r2 = 0
            if (r1 != 0) goto L_0x0010
            byte[] r10 = new byte[r2]     // Catch:{ all -> 0x0068 }
            monitor-exit(r0)     // Catch:{ all -> 0x0068 }
            return r10
        L_0x0010:
            r1.reset()     // Catch:{ all -> 0x0068 }
            java.security.MessageDigest r1 = r9.zzbuc     // Catch:{ all -> 0x0068 }
            java.lang.String r3 = "UTF-8"
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)     // Catch:{ all -> 0x0068 }
            byte[] r10 = r10.getBytes(r3)     // Catch:{ all -> 0x0068 }
            r1.update(r10)     // Catch:{ all -> 0x0068 }
            java.security.MessageDigest r10 = r9.zzbuc     // Catch:{ all -> 0x0068 }
            byte[] r10 = r10.digest()     // Catch:{ all -> 0x0068 }
            int r1 = r10.length     // Catch:{ all -> 0x0068 }
            int r3 = r9.zzbud     // Catch:{ all -> 0x0068 }
            if (r1 <= r3) goto L_0x0030
            int r1 = r9.zzbud     // Catch:{ all -> 0x0068 }
            goto L_0x0031
        L_0x0030:
            int r1 = r10.length     // Catch:{ all -> 0x0068 }
        L_0x0031:
            byte[] r3 = new byte[r1]     // Catch:{ all -> 0x0068 }
            java.lang.System.arraycopy(r10, r2, r3, r2, r1)     // Catch:{ all -> 0x0068 }
            int r10 = r9.zzbue     // Catch:{ all -> 0x0068 }
            r4 = 8
            int r10 = r10 % r4
            if (r10 <= 0) goto L_0x0066
            r5 = 0
        L_0x0040:
            if (r2 >= r1) goto L_0x004e
            if (r2 <= 0) goto L_0x0045
            long r5 = r5 << r4
        L_0x0045:
            byte r10 = r3[r2]     // Catch:{ all -> 0x0068 }
            r10 = r10 & 255(0xff, float:3.57E-43)
            long r7 = (long) r10     // Catch:{ all -> 0x0068 }
            long r5 = r5 + r7
            int r2 = r2 + 1
            goto L_0x0040
        L_0x004e:
            int r10 = r9.zzbue     // Catch:{ all -> 0x0068 }
            int r10 = r10 % r4
            int r10 = 8 - r10
            long r1 = r5 >>> r10
            int r10 = r9.zzbud     // Catch:{ all -> 0x0068 }
            int r10 = r10 + -1
        L_0x0059:
            if (r10 < 0) goto L_0x0066
            r5 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r1
            int r6 = (int) r5     // Catch:{ all -> 0x0068 }
            byte r5 = (byte) r6     // Catch:{ all -> 0x0068 }
            r3[r10] = r5     // Catch:{ all -> 0x0068 }
            long r1 = r1 >>> r4
            int r10 = r10 + -1
            goto L_0x0059
        L_0x0066:
            monitor-exit(r0)     // Catch:{ all -> 0x0068 }
            return r3
        L_0x0068:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0068 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrx.zzbu(java.lang.String):byte[]");
    }
}
