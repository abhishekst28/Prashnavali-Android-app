package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zznv extends zzoa {
    private static final int[] zzbgv = new int[0];
    private final zzoe zzbgw;
    private final AtomicReference<zzny> zzbgx;

    public zznv() {
        this((zzoe) null);
    }

    private zznv(zzoe zzoe) {
        this.zzbgw = null;
        this.zzbgx = new AtomicReference<>(new zzny());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ab, code lost:
        if (r10.zzagu <= r12) goto L_0x01b0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzob[] zza(com.google.android.gms.internal.ads.zzhw[] r35, com.google.android.gms.internal.ads.zznp[] r36, int[][][] r37) throws com.google.android.gms.internal.ads.zzhd {
        /*
            r34 = this;
            r0 = r35
            int r1 = r0.length
            com.google.android.gms.internal.ads.zzob[] r2 = new com.google.android.gms.internal.ads.zzob[r1]
            r3 = r34
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.internal.ads.zzny> r4 = r3.zzbgx
            java.lang.Object r4 = r4.get()
            com.google.android.gms.internal.ads.zzny r4 = (com.google.android.gms.internal.ads.zzny) r4
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0014:
            r9 = 2
            if (r6 >= r1) goto L_0x0299
            r13 = r0[r6]
            int r13 = r13.getTrackType()
            if (r9 != r13) goto L_0x0281
            if (r7 != 0) goto L_0x026b
            r7 = r36[r6]
            r13 = r37[r6]
            int r14 = r4.zzbhc
            int r15 = r4.zzbhd
            int r11 = r4.zzbhe
            int r9 = r4.viewportWidth
            int r5 = r4.viewportHeight
            boolean r10 = r4.zzbhh
            boolean r12 = r4.zzbhf
            boolean r3 = r4.zzbhg
            r19 = r1
            r18 = r4
            r0 = 0
            r1 = 0
            r4 = 0
            r20 = 0
            r21 = -1
            r22 = -1
        L_0x0049:
            r23 = r8
            int r8 = r7.length
            if (r0 >= r8) goto L_0x0249
            com.google.android.gms.internal.ads.zznq r8 = r7.zzbd(r0)
            r24 = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r25 = r2
            int r2 = r8.length
            r7.<init>(r2)
            r2 = 0
        L_0x0060:
            r26 = r6
            int r6 = r8.length
            if (r2 >= r6) goto L_0x0072
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r7.add(r6)
            int r2 = r2 + 1
            r6 = r26
            goto L_0x0060
        L_0x0072:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r9 == r2) goto L_0x0157
            if (r5 != r2) goto L_0x0089
            r27 = r1
            r28 = r4
            r31 = r5
            r32 = r9
            r30 = r10
            r33 = r11
            r29 = r12
            goto L_0x0165
        L_0x0089:
            r6 = 0
        L_0x008b:
            r27 = r1
            int r1 = r8.length
            if (r6 >= r1) goto L_0x0120
            com.google.android.gms.internal.ads.zzho r1 = r8.zzbe(r6)
            r28 = r4
            int r4 = r1.width
            if (r4 <= 0) goto L_0x0104
            int r4 = r1.height
            if (r4 <= 0) goto L_0x0104
            int r4 = r1.width
            r29 = r12
            int r12 = r1.height
            if (r10 == 0) goto L_0x00bd
            r30 = r10
            if (r4 <= r12) goto L_0x00ad
            r10 = 1
            goto L_0x00ae
        L_0x00ad:
            r10 = 0
        L_0x00ae:
            r31 = r5
            if (r9 <= r5) goto L_0x00b4
            r5 = 1
            goto L_0x00b5
        L_0x00b4:
            r5 = 0
        L_0x00b5:
            if (r10 == r5) goto L_0x00c1
            r5 = r9
            r10 = r31
            goto L_0x00c4
        L_0x00bd:
            r31 = r5
            r30 = r10
        L_0x00c1:
            r10 = r9
            r5 = r31
        L_0x00c4:
            r32 = r9
            int r9 = r4 * r5
            r33 = r11
            int r11 = r12 * r10
            if (r9 < r11) goto L_0x00d8
            android.graphics.Point r5 = new android.graphics.Point
            int r4 = com.google.android.gms.internal.ads.zzpq.zzf(r11, r4)
            r5.<init>(r10, r4)
            goto L_0x00e2
        L_0x00d8:
            android.graphics.Point r4 = new android.graphics.Point
            int r9 = com.google.android.gms.internal.ads.zzpq.zzf(r9, r12)
            r4.<init>(r9, r5)
            r5 = r4
        L_0x00e2:
            int r4 = r1.width
            int r9 = r1.height
            int r4 = r4 * r9
            int r9 = r1.width
            int r10 = r5.x
            float r10 = (float) r10
            r11 = 1065017672(0x3f7ae148, float:0.98)
            float r10 = r10 * r11
            int r10 = (int) r10
            if (r9 < r10) goto L_0x010e
            int r1 = r1.height
            int r5 = r5.y
            float r5 = (float) r5
            float r5 = r5 * r11
            int r5 = (int) r5
            if (r1 < r5) goto L_0x010e
            if (r4 >= r2) goto L_0x010e
            r2 = r4
            goto L_0x010e
        L_0x0104:
            r31 = r5
            r32 = r9
            r30 = r10
            r33 = r11
            r29 = r12
        L_0x010e:
            int r6 = r6 + 1
            r1 = r27
            r4 = r28
            r12 = r29
            r10 = r30
            r5 = r31
            r9 = r32
            r11 = r33
            goto L_0x008b
        L_0x0120:
            r28 = r4
            r31 = r5
            r32 = r9
            r30 = r10
            r33 = r11
            r29 = r12
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r1) goto L_0x0156
            int r1 = r7.size()
            r4 = 1
            int r1 = r1 - r4
        L_0x0137:
            if (r1 < 0) goto L_0x0156
            java.lang.Object r4 = r7.get(r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.google.android.gms.internal.ads.zzho r4 = r8.zzbe(r4)
            int r4 = r4.zzex()
            r5 = -1
            if (r4 == r5) goto L_0x0150
            if (r4 <= r2) goto L_0x0153
        L_0x0150:
            r7.remove(r1)
        L_0x0153:
            int r1 = r1 + -1
            goto L_0x0137
        L_0x0156:
            goto L_0x0166
        L_0x0157:
            r27 = r1
            r28 = r4
            r31 = r5
            r32 = r9
            r30 = r10
            r33 = r11
            r29 = r12
        L_0x0165:
        L_0x0166:
            r1 = r13[r0]
            r5 = r20
            r6 = r21
            r9 = r22
            r4 = r28
            r2 = 0
        L_0x0172:
            int r10 = r8.length
            if (r2 >= r10) goto L_0x0226
            r10 = r1[r2]
            boolean r10 = zze((int) r10, (boolean) r3)
            if (r10 == 0) goto L_0x0212
            com.google.android.gms.internal.ads.zzho r10 = r8.zzbe(r2)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            boolean r11 = r7.contains(r11)
            if (r11 == 0) goto L_0x01b2
            int r11 = r10.width
            r12 = -1
            if (r11 == r12) goto L_0x0199
            int r11 = r10.width
            if (r11 > r14) goto L_0x0196
            goto L_0x0199
        L_0x0196:
            r12 = r33
            goto L_0x01b4
        L_0x0199:
            int r11 = r10.height
            r12 = -1
            if (r11 == r12) goto L_0x01a2
            int r11 = r10.height
            if (r11 > r15) goto L_0x0196
        L_0x01a2:
            int r11 = r10.zzagu
            r12 = -1
            if (r11 == r12) goto L_0x01ae
            int r11 = r10.zzagu
            r12 = r33
            if (r11 > r12) goto L_0x01b4
            goto L_0x01b0
        L_0x01ae:
            r12 = r33
        L_0x01b0:
            r11 = 1
            goto L_0x01b5
        L_0x01b2:
            r12 = r33
        L_0x01b4:
            r11 = 0
        L_0x01b5:
            if (r11 != 0) goto L_0x01c2
            if (r29 == 0) goto L_0x01ba
            goto L_0x01c2
        L_0x01ba:
            r22 = r1
            r20 = r3
            r21 = r4
            goto L_0x021a
        L_0x01c2:
            r20 = r3
            if (r11 == 0) goto L_0x01c8
            r3 = 2
            goto L_0x01c9
        L_0x01c8:
            r3 = 1
        L_0x01c9:
            r21 = r4
            r4 = r1[r2]
            r22 = r1
            r1 = 0
            boolean r4 = zze((int) r4, (boolean) r1)
            if (r4 == 0) goto L_0x01d8
            int r3 = r3 + 1000
        L_0x01d8:
            if (r3 <= r5) goto L_0x01dc
            r1 = 1
            goto L_0x01dd
        L_0x01dc:
            r1 = 0
        L_0x01dd:
            if (r3 != r5) goto L_0x0200
            int r1 = r10.zzex()
            if (r1 == r6) goto L_0x01ee
            int r1 = r10.zzex()
            int r1 = zze((int) r1, (int) r6)
            goto L_0x01f4
        L_0x01ee:
            int r1 = r10.zzagu
            int r1 = zze((int) r1, (int) r9)
        L_0x01f4:
            if (r4 == 0) goto L_0x01fb
            if (r11 == 0) goto L_0x01fb
            if (r1 <= 0) goto L_0x01ff
            goto L_0x01fd
        L_0x01fb:
            if (r1 >= 0) goto L_0x01ff
        L_0x01fd:
            r1 = 1
            goto L_0x0200
        L_0x01ff:
            r1 = 0
        L_0x0200:
            if (r1 == 0) goto L_0x021a
            int r1 = r10.zzagu
            int r4 = r10.zzex()
            r9 = r1
            r27 = r2
            r5 = r3
            r6 = r4
            r4 = r8
            goto L_0x021c
        L_0x0212:
            r22 = r1
            r20 = r3
            r21 = r4
            r12 = r33
        L_0x021a:
            r4 = r21
        L_0x021c:
            int r2 = r2 + 1
            r33 = r12
            r3 = r20
            r1 = r22
            goto L_0x0172
        L_0x0226:
            r20 = r3
            r21 = r4
            r12 = r33
            int r0 = r0 + 1
            r22 = r9
            r11 = r12
            r8 = r23
            r7 = r24
            r2 = r25
            r1 = r27
            r12 = r29
            r10 = r30
            r9 = r32
            r20 = r5
            r21 = r6
            r6 = r26
            r5 = r31
            goto L_0x0049
        L_0x0249:
            r27 = r1
            r25 = r2
            r28 = r4
            r26 = r6
            if (r28 != 0) goto L_0x0255
            r11 = 0
            goto L_0x025e
        L_0x0255:
            com.google.android.gms.internal.ads.zznx r11 = new com.google.android.gms.internal.ads.zznx
            r1 = r27
            r0 = r28
            r11.<init>(r0, r1)
        L_0x025e:
            r25[r26] = r11
            r0 = r25[r26]
            if (r0 == 0) goto L_0x0268
            r0 = 1
            goto L_0x0269
        L_0x0268:
            r0 = 0
        L_0x0269:
            r7 = r0
            goto L_0x0275
        L_0x026b:
            r19 = r1
            r25 = r2
            r18 = r4
            r26 = r6
            r23 = r8
        L_0x0275:
            r0 = r36[r26]
            int r0 = r0.length
            if (r0 <= 0) goto L_0x027d
            r12 = 1
            goto L_0x027e
        L_0x027d:
            r12 = 0
        L_0x027e:
            r8 = r23 | r12
            goto L_0x028b
        L_0x0281:
            r19 = r1
            r25 = r2
            r18 = r4
            r26 = r6
            r23 = r8
        L_0x028b:
            int r6 = r26 + 1
            r3 = r34
            r0 = r35
            r4 = r18
            r1 = r19
            r2 = r25
            goto L_0x0014
        L_0x0299:
            r19 = r1
            r25 = r2
            r18 = r4
            r23 = r8
            r0 = 0
            r1 = 0
            r2 = 0
        L_0x02a5:
            r3 = r19
            if (r1 >= r3) goto L_0x04b1
            r4 = r35[r1]
            int r4 = r4.getTrackType()
            r6 = 3
            r7 = 1
            if (r4 == r7) goto L_0x0401
            r7 = 2
            if (r4 == r7) goto L_0x03f2
            if (r4 == r6) goto L_0x0338
            r4 = r35[r1]
            r4.getTrackType()
            r4 = r36[r1]
            r5 = r37[r1]
            r7 = r18
            boolean r6 = r7.zzbhg
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x02cc:
            int r12 = r4.length
            if (r9 >= r12) goto L_0x0320
            com.google.android.gms.internal.ads.zznq r12 = r4.zzbd(r9)
            r13 = r5[r9]
            r14 = 0
        L_0x02d7:
            int r15 = r12.length
            if (r14 >= r15) goto L_0x0319
            r15 = r13[r14]
            boolean r15 = zze((int) r15, (boolean) r6)
            if (r15 == 0) goto L_0x030e
            com.google.android.gms.internal.ads.zzho r15 = r12.zzbe(r14)
            int r15 = r15.zzaho
            r17 = 1
            r15 = r15 & 1
            if (r15 == 0) goto L_0x02f1
            r15 = 1
            goto L_0x02f2
        L_0x02f1:
            r15 = 0
        L_0x02f2:
            if (r15 == 0) goto L_0x02f6
            r15 = 2
            goto L_0x02f7
        L_0x02f6:
            r15 = 1
        L_0x02f7:
            r19 = r3
            r3 = r13[r14]
            r18 = r4
            r4 = 0
            boolean r3 = zze((int) r3, (boolean) r4)
            if (r3 == 0) goto L_0x0306
            int r15 = r15 + 1000
        L_0x0306:
            if (r15 <= r11) goto L_0x0312
            r8 = r12
            r10 = r14
            r11 = r15
            goto L_0x0312
        L_0x030e:
            r19 = r3
            r18 = r4
        L_0x0312:
            int r14 = r14 + 1
            r4 = r18
            r3 = r19
            goto L_0x02d7
        L_0x0319:
            r19 = r3
            r18 = r4
            int r9 = r9 + 1
            goto L_0x02cc
        L_0x0320:
            r19 = r3
            if (r8 != 0) goto L_0x0326
            r3 = 0
            goto L_0x032b
        L_0x0326:
            com.google.android.gms.internal.ads.zznx r3 = new com.google.android.gms.internal.ads.zznx
            r3.<init>(r8, r10)
        L_0x032b:
            r25[r1] = r3
            r21 = r2
            r2 = 0
            r3 = -1
            r15 = 0
            r16 = 2
            r17 = 1
            goto L_0x04a9
        L_0x0338:
            r19 = r3
            r7 = r18
            if (r2 != 0) goto L_0x03e7
            r2 = r36[r1]
            r3 = r37[r1]
            boolean r4 = r7.zzbhg
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x034b:
            int r12 = r2.length
            if (r8 >= r12) goto L_0x03ca
            com.google.android.gms.internal.ads.zznq r12 = r2.zzbd(r8)
            r13 = r3[r8]
            r14 = r11
            r11 = r10
            r10 = r9
            r9 = 0
        L_0x0359:
            int r15 = r12.length
            if (r9 >= r15) goto L_0x03bf
            r15 = r13[r9]
            boolean r15 = zze((int) r15, (boolean) r4)
            if (r15 == 0) goto L_0x03b5
            com.google.android.gms.internal.ads.zzho r15 = r12.zzbe(r9)
            int r5 = r15.zzaho
            r17 = 1
            r5 = r5 & 1
            if (r5 == 0) goto L_0x0373
            r5 = 1
            goto L_0x0374
        L_0x0373:
            r5 = 0
        L_0x0374:
            int r6 = r15.zzaho
            r16 = 2
            r6 = r6 & 2
            if (r6 == 0) goto L_0x037e
            r6 = 1
            goto L_0x037f
        L_0x037e:
            r6 = 0
        L_0x037f:
            r21 = r2
            r2 = 0
            boolean r22 = zza(r15, r2)
            if (r22 == 0) goto L_0x0392
            if (r5 == 0) goto L_0x038c
            r2 = 6
            goto L_0x03a2
        L_0x038c:
            if (r6 != 0) goto L_0x0390
            r2 = 5
            goto L_0x03a2
        L_0x0390:
            r2 = 4
            goto L_0x03a2
        L_0x0392:
            if (r5 == 0) goto L_0x0396
            r2 = 3
            goto L_0x03a2
        L_0x0396:
            if (r6 == 0) goto L_0x03b9
            r2 = 0
            boolean r5 = zza(r15, r2)
            if (r5 == 0) goto L_0x03a1
            r2 = 2
            goto L_0x03a2
        L_0x03a1:
            r2 = 1
        L_0x03a2:
            r5 = r13[r9]
            r6 = 0
            boolean r5 = zze((int) r5, (boolean) r6)
            if (r5 == 0) goto L_0x03ad
            int r2 = r2 + 1000
        L_0x03ad:
            if (r2 <= r11) goto L_0x03b9
            r11 = r2
            r10 = r9
            r14 = r12
            goto L_0x03b9
        L_0x03b5:
            r21 = r2
            r16 = 2
        L_0x03b9:
            int r9 = r9 + 1
            r2 = r21
            r6 = 3
            goto L_0x0359
        L_0x03bf:
            r21 = r2
            r16 = 2
            int r8 = r8 + 1
            r9 = r10
            r10 = r11
            r11 = r14
            r6 = 3
            goto L_0x034b
        L_0x03ca:
            r16 = 2
            if (r11 != 0) goto L_0x03d0
            r2 = 0
            goto L_0x03d5
        L_0x03d0:
            com.google.android.gms.internal.ads.zznx r2 = new com.google.android.gms.internal.ads.zznx
            r2.<init>(r11, r9)
        L_0x03d5:
            r25[r1] = r2
            r2 = r25[r1]
            if (r2 == 0) goto L_0x03dd
            r4 = 1
            goto L_0x03de
        L_0x03dd:
            r4 = 0
        L_0x03de:
            r21 = r4
            r2 = 0
            r3 = -1
            r15 = 0
            r17 = 1
            goto L_0x04a9
        L_0x03e7:
            r16 = 2
            r21 = r2
            r2 = 0
            r3 = -1
            r15 = 0
            r17 = 1
            goto L_0x04a9
        L_0x03f2:
            r19 = r3
            r7 = r18
            r16 = 2
            r21 = r2
            r2 = 0
            r3 = -1
            r15 = 0
            r17 = 1
            goto L_0x04a9
        L_0x0401:
            r19 = r3
            r7 = r18
            r16 = 2
            if (r0 != 0) goto L_0x04a2
            r0 = r36[r1]
            r3 = r37[r1]
            boolean r4 = r7.zzbhg
            r5 = 0
            r6 = 0
            r8 = -1
            r9 = -1
        L_0x0418:
            int r10 = r0.length
            if (r5 >= r10) goto L_0x0483
            com.google.android.gms.internal.ads.zznq r10 = r0.zzbd(r5)
            r11 = r3[r5]
            r12 = r9
            r9 = r8
            r8 = r6
            r6 = 0
        L_0x0426:
            int r13 = r10.length
            if (r6 >= r13) goto L_0x0475
            r13 = r11[r6]
            boolean r13 = zze((int) r13, (boolean) r4)
            if (r13 == 0) goto L_0x046a
            com.google.android.gms.internal.ads.zzho r13 = r10.zzbe(r6)
            r14 = r11[r6]
            int r15 = r13.zzaho
            r17 = 1
            r15 = r15 & 1
            if (r15 == 0) goto L_0x0442
            r15 = 1
            goto L_0x0443
        L_0x0442:
            r15 = 0
        L_0x0443:
            r21 = r2
            r2 = 0
            boolean r13 = zza(r13, r2)
            if (r13 == 0) goto L_0x0452
            if (r15 == 0) goto L_0x0450
            r13 = 4
            goto L_0x0457
        L_0x0450:
            r13 = 3
            goto L_0x0457
        L_0x0452:
            if (r15 == 0) goto L_0x0456
            r13 = 2
            goto L_0x0457
        L_0x0456:
            r13 = 1
        L_0x0457:
            r15 = 0
            boolean r14 = zze((int) r14, (boolean) r15)
            if (r14 == 0) goto L_0x0460
            int r13 = r13 + 1000
        L_0x0460:
            if (r13 <= r8) goto L_0x0470
            r9 = r5
            r12 = r6
            r8 = r13
            goto L_0x0470
        L_0x046a:
            r21 = r2
            r2 = 0
            r15 = 0
            r17 = 1
        L_0x0470:
            int r6 = r6 + 1
            r2 = r21
            goto L_0x0426
        L_0x0475:
            r21 = r2
            r2 = 0
            r15 = 0
            r17 = 1
            int r5 = r5 + 1
            r6 = r8
            r8 = r9
            r9 = r12
            r2 = r21
            goto L_0x0418
        L_0x0483:
            r21 = r2
            r2 = 0
            r15 = 0
            r17 = 1
            r3 = -1
            if (r8 != r3) goto L_0x048e
            r4 = r2
            goto L_0x0497
        L_0x048e:
            com.google.android.gms.internal.ads.zznq r0 = r0.zzbd(r8)
            com.google.android.gms.internal.ads.zznx r4 = new com.google.android.gms.internal.ads.zznx
            r4.<init>(r0, r9)
        L_0x0497:
            r25[r1] = r4
            r0 = r25[r1]
            if (r0 == 0) goto L_0x049f
            r4 = 1
            goto L_0x04a0
        L_0x049f:
            r4 = 0
        L_0x04a0:
            r0 = r4
            goto L_0x04a9
        L_0x04a2:
            r21 = r2
            r2 = 0
            r3 = -1
            r15 = 0
            r17 = 1
        L_0x04a9:
            int r1 = r1 + 1
            r18 = r7
            r2 = r21
            goto L_0x02a5
        L_0x04b1:
            return r25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznv.zza(com.google.android.gms.internal.ads.zzhw[], com.google.android.gms.internal.ads.zznp[], int[][][]):com.google.android.gms.internal.ads.zzob[]");
    }

    private static int zze(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    private static boolean zze(int i, boolean z) {
        int i2 = i & 3;
        if (i2 != 3) {
            return z && i2 == 2;
        }
        return true;
    }

    private static boolean zza(zzho zzho, String str) {
        return str != null && TextUtils.equals(str, zzpq.zzbj(zzho.zzahp));
    }
}
