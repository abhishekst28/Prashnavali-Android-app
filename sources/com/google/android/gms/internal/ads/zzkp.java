package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzkp {
    private final zzpk zzapo = new zzpk(8);
    private int zzarh;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        r2 = zzc(r18);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(com.google.android.gms.internal.ads.zzjy r18) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            long r2 = r18.getLength()
            r4 = 1024(0x400, double:5.06E-321)
            r6 = -1
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0017
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r4 = r2
            goto L_0x0018
        L_0x0017:
        L_0x0018:
            int r5 = (int) r4
            com.google.android.gms.internal.ads.zzpk r4 = r0.zzapo
            byte[] r4 = r4.data
            r6 = 4
            r7 = 0
            r1.zza(r4, r7, r6)
            com.google.android.gms.internal.ads.zzpk r4 = r0.zzapo
            long r9 = r4.zzja()
            r0.zzarh = r6
        L_0x002a:
            r11 = 440786851(0x1a45dfa3, double:2.1777764E-315)
            r4 = 1
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x0052
            int r6 = r0.zzarh
            int r6 = r6 + r4
            r0.zzarh = r6
            if (r6 != r5) goto L_0x003a
            return r7
        L_0x003a:
            com.google.android.gms.internal.ads.zzpk r6 = r0.zzapo
            byte[] r6 = r6.data
            r1.zza(r6, r7, r4)
            r4 = 8
            long r9 = r9 << r4
            r11 = -256(0xffffffffffffff00, double:NaN)
            long r9 = r9 & r11
            com.google.android.gms.internal.ads.zzpk r4 = r0.zzapo
            byte[] r4 = r4.data
            byte r4 = r4[r7]
            r4 = r4 & 255(0xff, float:3.57E-43)
            long r11 = (long) r4
            long r9 = r9 | r11
            goto L_0x002a
        L_0x0052:
            long r5 = r17.zzc(r18)
            int r9 = r0.zzarh
            long r9 = (long) r9
            r11 = -9223372036854775808
            int r13 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x00a2
            if (r8 == 0) goto L_0x0068
            long r13 = r9 + r5
            int r8 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r8 < 0) goto L_0x0068
            goto L_0x00a2
        L_0x0068:
            int r2 = r0.zzarh
            long r13 = (long) r2
            long r15 = r9 + r5
            int r3 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r3 >= 0) goto L_0x009b
            long r2 = r17.zzc(r18)
            int r8 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r8 != 0) goto L_0x007a
            return r7
        L_0x007a:
            long r2 = r17.zzc(r18)
            r13 = 0
            int r8 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r8 < 0) goto L_0x009a
            r13 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r15 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x008c
            goto L_0x009a
        L_0x008c:
            if (r8 == 0) goto L_0x0099
            int r8 = (int) r2
            r1.zzaj(r8)
            int r8 = r0.zzarh
            long r13 = (long) r8
            long r13 = r13 + r2
            int r2 = (int) r13
            r0.zzarh = r2
        L_0x0099:
            goto L_0x0068
        L_0x009a:
            return r7
        L_0x009b:
            long r1 = (long) r2
            int r3 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r3 != 0) goto L_0x00a1
            return r4
        L_0x00a1:
            return r7
        L_0x00a2:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkp.zza(com.google.android.gms.internal.ads.zzjy):boolean");
    }

    private final long zzc(zzjy zzjy) throws IOException, InterruptedException {
        int i = 0;
        zzjy.zza(this.zzapo.data, 0, 1);
        byte b = this.zzapo.data[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (~i2);
        zzjy.zza(this.zzapo.data, 1, i3);
        while (i < i3) {
            i++;
            i4 = (this.zzapo.data[i] & 255) + (i4 << 8);
        }
        this.zzarh += i3 + 1;
        return (long) i4;
    }
}
