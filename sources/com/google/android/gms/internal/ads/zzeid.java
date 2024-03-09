package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzeid<T> implements zzeiv<T> {
    private static final Unsafe zzhop = zzejt.zzbie();
    private static final int[] zzihz = new int[0];
    private final int[] zziia;
    private final Object[] zziib;
    private final int zziic;
    private final int zziid;
    private final zzehz zziie;
    private final boolean zziif;
    private final boolean zziig;
    private final boolean zziih;
    private final boolean zziii;
    private final int[] zziij;
    private final int zziik;
    private final int zziil;
    private final zzeih zziim;
    private final zzehj zziin;
    private final zzejn<?, ?> zziio;
    private final zzege<?> zziip;
    private final zzehw zziiq;

    private zzeid(int[] iArr, Object[] objArr, int i, int i2, zzehz zzehz, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzeih zzeih, zzehj zzehj, zzejn<?, ?> zzejn, zzege<?> zzege, zzehw zzehw) {
        this.zziia = iArr;
        this.zziib = objArr;
        this.zziic = i;
        this.zziid = i2;
        this.zziig = zzehz instanceof zzegp;
        this.zziih = z;
        this.zziif = zzege != null && zzege.zzj(zzehz);
        this.zziii = false;
        this.zziij = iArr2;
        this.zziik = i3;
        this.zziil = i4;
        this.zziim = zzeih;
        this.zziin = zzehj;
        this.zziio = zzejn;
        this.zziip = zzege;
        this.zziie = zzehz;
        this.zziiq = zzehw;
    }

    /* JADX WARNING: Removed duplicated region for block: B:155:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03af A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.ads.zzeid<T> zza(java.lang.Class<T> r33, com.google.android.gms.internal.ads.zzehx r34, com.google.android.gms.internal.ads.zzeih r35, com.google.android.gms.internal.ads.zzehj r36, com.google.android.gms.internal.ads.zzejn<?, ?> r37, com.google.android.gms.internal.ads.zzege<?> r38, com.google.android.gms.internal.ads.zzehw r39) {
        /*
            r0 = r34
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzeiq
            if (r1 == 0) goto L_0x0422
            com.google.android.gms.internal.ads.zzeiq r0 = (com.google.android.gms.internal.ads.zzeiq) r0
            int r1 = r0.zzbgw()
            int r2 = com.google.android.gms.internal.ads.zzegp.zze.zzigf
            r3 = 0
            if (r1 != r2) goto L_0x0013
            r11 = 1
            goto L_0x0014
        L_0x0013:
            r11 = 0
        L_0x0014:
            java.lang.String r1 = r0.zzbhh()
            int r2 = r1.length()
            char r5 = r1.charAt(r3)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x0033
            r5 = 1
        L_0x0028:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0034
            r5 = r7
            goto L_0x0028
        L_0x0033:
            r7 = 1
        L_0x0034:
            int r5 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0053
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0040:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0050
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r7 = r7 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x0040
        L_0x0050:
            int r5 = r5 << r9
            r7 = r7 | r5
            r5 = r10
        L_0x0053:
            if (r7 != 0) goto L_0x0067
            int[] r7 = zzihz
            r14 = r7
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            goto L_0x0180
        L_0x0067:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0086
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0073:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0083
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r5 = r5 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L_0x0073
        L_0x0083:
            int r7 = r7 << r9
            r5 = r5 | r7
            r7 = r10
        L_0x0086:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x00a6
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0093:
            int r12 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x00a3
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r12
            goto L_0x0093
        L_0x00a3:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r12
        L_0x00a6:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x00c6
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00b3:
            int r13 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00c3
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r12
            r9 = r9 | r10
            int r12 = r12 + 13
            r10 = r13
            goto L_0x00b3
        L_0x00c3:
            int r10 = r10 << r12
            r9 = r9 | r10
            r10 = r13
        L_0x00c6:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00e6
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00d3:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00e3
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r10 = r10 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00d3
        L_0x00e3:
            int r12 = r12 << r13
            r10 = r10 | r12
            r12 = r14
        L_0x00e6:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x0106
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00f3:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x0103
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00f3
        L_0x0103:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0106:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x0128
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0113:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x0124
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0113
        L_0x0124:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0128:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x014c
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0135:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0147
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0135
        L_0x0147:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x014c:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0172
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r3 = r16
            r16 = 13
        L_0x015b:
            int r17 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r6) goto L_0x016d
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r16
            r15 = r15 | r3
            int r16 = r16 + 13
            r3 = r17
            goto L_0x015b
        L_0x016d:
            int r3 = r3 << r16
            r15 = r15 | r3
            r16 = r17
        L_0x0172:
            int r3 = r15 + r13
            int r3 = r3 + r14
            int[] r3 = new int[r3]
            int r14 = r5 << 1
            int r14 = r14 + r7
            r7 = r14
            r14 = r3
            r3 = r5
            r5 = r16
        L_0x0180:
            sun.misc.Unsafe r8 = zzhop
            java.lang.Object[] r16 = r0.zzbhi()
            com.google.android.gms.internal.ads.zzehz r17 = r0.zzbgy()
            java.lang.Class r6 = r17.getClass()
            int r4 = r12 * 3
            int[] r4 = new int[r4]
            r17 = 1
            int r12 = r12 << 1
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r19 = r15 + r13
            r21 = r15
            r22 = r19
            r13 = 0
            r20 = 0
        L_0x01a3:
            if (r5 >= r2) goto L_0x03f7
            int r23 = r5 + 1
            char r5 = r1.charAt(r5)
            r24 = r2
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r2) goto L_0x01d7
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r2 = r23
            r23 = 13
        L_0x01b8:
            int r25 = r2 + 1
            char r2 = r1.charAt(r2)
            r26 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r15) goto L_0x01d1
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r23
            r5 = r5 | r2
            int r23 = r23 + 13
            r2 = r25
            r15 = r26
            goto L_0x01b8
        L_0x01d1:
            int r2 = r2 << r23
            r5 = r5 | r2
            r2 = r25
            goto L_0x01db
        L_0x01d7:
            r26 = r15
            r2 = r23
        L_0x01db:
            int r15 = r2 + 1
            char r2 = r1.charAt(r2)
            r23 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r15) goto L_0x020e
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r15 = r23
            r23 = 13
        L_0x01ef:
            int r25 = r15 + 1
            char r15 = r1.charAt(r15)
            r27 = r10
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x0208
            r10 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r23
            r2 = r2 | r10
            int r23 = r23 + 13
            r15 = r25
            r10 = r27
            goto L_0x01ef
        L_0x0208:
            int r10 = r15 << r23
            r2 = r2 | r10
            r15 = r25
            goto L_0x0212
        L_0x020e:
            r27 = r10
            r15 = r23
        L_0x0212:
            r10 = r2 & 255(0xff, float:3.57E-43)
            r23 = r9
            r9 = r2 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0220
            int r9 = r13 + 1
            r14[r13] = r20
            r13 = r9
        L_0x0220:
            r9 = 51
            r28 = r13
            if (r10 < r9) goto L_0x02bf
            int r9 = r15 + 1
            char r15 = r1.charAt(r15)
            r13 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r13) goto L_0x024f
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r29 = 13
        L_0x0235:
            int r30 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r13) goto L_0x024a
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r29
            r15 = r15 | r9
            int r29 = r29 + 13
            r9 = r30
            r13 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0235
        L_0x024a:
            int r9 = r9 << r29
            r15 = r15 | r9
            r9 = r30
        L_0x024f:
            int r13 = r10 + -51
            r29 = r9
            r9 = 9
            if (r13 == r9) goto L_0x0273
            r9 = 17
            if (r13 != r9) goto L_0x025d
            goto L_0x0273
        L_0x025d:
            r9 = 12
            if (r13 != r9) goto L_0x0271
            if (r11 != 0) goto L_0x0271
            int r9 = r20 / 3
            r13 = 1
            int r9 = r9 << r13
            int r9 = r9 + r13
            int r13 = r7 + 1
            r7 = r16[r7]
            r12[r9] = r7
            r7 = r13
            r13 = 1
            goto L_0x0280
        L_0x0271:
            r13 = 1
            goto L_0x0280
        L_0x0273:
            int r9 = r20 / 3
            r13 = 1
            int r9 = r9 << r13
            int r9 = r9 + r13
            int r17 = r7 + 1
            r7 = r16[r7]
            r12[r9] = r7
            r7 = r17
        L_0x0280:
            int r9 = r15 << 1
            r13 = r16[r9]
            boolean r15 = r13 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x028b
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            goto L_0x0293
        L_0x028b:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = zza((java.lang.Class<?>) r6, (java.lang.String) r13)
            r16[r9] = r13
        L_0x0293:
            r30 = r4
            r31 = r5
            long r4 = r8.objectFieldOffset(r13)
            int r5 = (int) r4
            int r9 = r9 + 1
            r4 = r16[r9]
            boolean r13 = r4 instanceof java.lang.reflect.Field
            if (r13 == 0) goto L_0x02a7
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            goto L_0x02af
        L_0x02a7:
            java.lang.String r4 = (java.lang.String) r4
            java.lang.reflect.Field r4 = zza((java.lang.Class<?>) r6, (java.lang.String) r4)
            r16[r9] = r4
        L_0x02af:
            r9 = r5
            long r4 = r8.objectFieldOffset(r4)
            int r5 = (int) r4
            r17 = r3
            r4 = r5
            r5 = r9
            r15 = r29
            r13 = 0
            goto L_0x03ba
        L_0x02bf:
            r30 = r4
            r31 = r5
            int r4 = r7 + 1
            r5 = r16[r7]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.reflect.Field r5 = zza((java.lang.Class<?>) r6, (java.lang.String) r5)
            r7 = 49
            r9 = 9
            if (r10 == r9) goto L_0x0332
            r9 = 17
            if (r10 != r9) goto L_0x02d9
            r13 = 1
            goto L_0x0333
        L_0x02d9:
            r9 = 27
            if (r10 == r9) goto L_0x0324
            if (r10 != r7) goto L_0x02e0
            goto L_0x0324
        L_0x02e0:
            r9 = 12
            if (r10 == r9) goto L_0x0315
            r9 = 30
            if (r10 == r9) goto L_0x0315
            r9 = 44
            if (r10 != r9) goto L_0x02ed
            goto L_0x0315
        L_0x02ed:
            r9 = 50
            if (r10 != r9) goto L_0x033d
            int r9 = r21 + 1
            r14[r21] = r20
            int r13 = r20 / 3
            r17 = 1
            int r13 = r13 << 1
            int r21 = r4 + 1
            r4 = r16[r4]
            r12[r13] = r4
            r4 = r2 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x0310
            int r13 = r13 + 1
            int r4 = r21 + 1
            r21 = r16[r21]
            r12[r13] = r21
            r21 = r9
            goto L_0x033d
        L_0x0310:
            r4 = r21
            r21 = r9
            goto L_0x033d
        L_0x0315:
            if (r11 != 0) goto L_0x033d
            int r9 = r20 / 3
            r13 = 1
            int r9 = r9 << r13
            int r9 = r9 + r13
            int r13 = r4 + 1
            r4 = r16[r4]
            r12[r9] = r4
            r4 = r13
            goto L_0x033d
        L_0x0324:
            int r9 = r20 / 3
            r13 = 1
            int r9 = r9 << r13
            int r9 = r9 + r13
            int r17 = r4 + 1
            r4 = r16[r4]
            r12[r9] = r4
            r4 = r17
            goto L_0x033d
        L_0x0332:
            r13 = 1
        L_0x0333:
            int r9 = r20 / 3
            int r9 = r9 << r13
            int r9 = r9 + r13
            java.lang.Class r13 = r5.getType()
            r12[r9] = r13
        L_0x033d:
            r9 = r4
            long r4 = r8.objectFieldOffset(r5)
            int r5 = (int) r4
            r4 = r2 & 4096(0x1000, float:5.74E-42)
            r13 = 4096(0x1000, float:5.74E-42)
            if (r4 != r13) goto L_0x03a2
            r4 = 17
            if (r10 > r4) goto L_0x039c
            int r4 = r15 + 1
            char r13 = r1.charAt(r15)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r13 < r15) goto L_0x0372
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r18 = 13
        L_0x035c:
            int r25 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r15) goto L_0x036e
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r18
            r13 = r13 | r4
            int r18 = r18 + 13
            r4 = r25
            goto L_0x035c
        L_0x036e:
            int r4 = r4 << r18
            r13 = r13 | r4
            goto L_0x0374
        L_0x0372:
            r25 = r4
        L_0x0374:
            r4 = 1
            int r17 = r3 << 1
            int r18 = r13 / 32
            int r17 = r17 + r18
            r4 = r16[r17]
            boolean r15 = r4 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x0385
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            goto L_0x038d
        L_0x0385:
            java.lang.String r4 = (java.lang.String) r4
            java.lang.reflect.Field r4 = zza((java.lang.Class<?>) r6, (java.lang.String) r4)
            r16[r17] = r4
        L_0x038d:
            r17 = r3
            long r3 = r8.objectFieldOffset(r4)
            int r4 = (int) r3
            int r13 = r13 % 32
            r15 = r25
            r3 = 55296(0xd800, float:7.7486E-41)
            goto L_0x03ab
        L_0x039c:
            r17 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            goto L_0x03a7
        L_0x03a2:
            r17 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
        L_0x03a7:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r13 = 0
        L_0x03ab:
            r3 = 18
            if (r10 < r3) goto L_0x03b9
            if (r10 > r7) goto L_0x03b9
            int r3 = r22 + 1
            r14[r22] = r5
            r22 = r3
            r7 = r9
            goto L_0x03ba
        L_0x03b9:
            r7 = r9
        L_0x03ba:
            int r3 = r20 + 1
            r30[r20] = r31
            int r9 = r3 + 1
            r20 = r1
            r1 = r2 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x03c9
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03ca
        L_0x03c9:
            r1 = 0
        L_0x03ca:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03d1
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03d2
        L_0x03d1:
            r2 = 0
        L_0x03d2:
            r1 = r1 | r2
            int r2 = r10 << 20
            r1 = r1 | r2
            r1 = r1 | r5
            r30[r3] = r1
            int r1 = r9 + 1
            int r2 = r13 << 20
            r2 = r2 | r4
            r30[r9] = r2
            r5 = r15
            r3 = r17
            r9 = r23
            r2 = r24
            r15 = r26
            r10 = r27
            r13 = r28
            r4 = r30
            r32 = r20
            r20 = r1
            r1 = r32
            goto L_0x01a3
        L_0x03f7:
            r30 = r4
            r23 = r9
            r27 = r10
            r26 = r15
            com.google.android.gms.internal.ads.zzeid r1 = new com.google.android.gms.internal.ads.zzeid
            com.google.android.gms.internal.ads.zzehz r10 = r0.zzbgy()
            r0 = 0
            r5 = r1
            r6 = r30
            r7 = r12
            r8 = r23
            r9 = r27
            r12 = r0
            r13 = r14
            r14 = r26
            r15 = r19
            r16 = r35
            r17 = r36
            r18 = r37
            r19 = r38
            r20 = r39
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r1
        L_0x0422:
            com.google.android.gms.internal.ads.zzejk r0 = (com.google.android.gms.internal.ads.zzejk) r0
            int r0 = r0.zzbgw()
            int r1 = com.google.android.gms.internal.ads.zzegp.zze.zzigf
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeid.zza(java.lang.Class, com.google.android.gms.internal.ads.zzehx, com.google.android.gms.internal.ads.zzeih, com.google.android.gms.internal.ads.zzehj, com.google.android.gms.internal.ads.zzejn, com.google.android.gms.internal.ads.zzege, com.google.android.gms.internal.ads.zzehw):com.google.android.gms.internal.ads.zzeid");
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    public final T newInstance() {
        return this.zziim.newInstance(this.zziie);
    }

    public final boolean equals(T t, T t2) {
        int length = this.zziia.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int zzhi = zzhi(i);
                long j = (long) (zzhi & 1048575);
                switch ((zzhi & 267386880) >>> 20) {
                    case 0:
                        if (!zzc(t, t2, i) || Double.doubleToLongBits(zzejt.zzo(t, j)) != Double.doubleToLongBits(zzejt.zzo(t2, j))) {
                            z = false;
                            break;
                        }
                    case 1:
                        if (!zzc(t, t2, i) || Float.floatToIntBits(zzejt.zzn(t, j)) != Float.floatToIntBits(zzejt.zzn(t2, j))) {
                            z = false;
                            break;
                        }
                    case 2:
                        if (!zzc(t, t2, i) || zzejt.zzl(t, j) != zzejt.zzl(t2, j)) {
                            z = false;
                            break;
                        }
                    case 3:
                        if (!zzc(t, t2, i) || zzejt.zzl(t, j) != zzejt.zzl(t2, j)) {
                            z = false;
                            break;
                        }
                    case 4:
                        if (!zzc(t, t2, i) || zzejt.zzk(t, j) != zzejt.zzk(t2, j)) {
                            z = false;
                            break;
                        }
                    case 5:
                        if (!zzc(t, t2, i) || zzejt.zzl(t, j) != zzejt.zzl(t2, j)) {
                            z = false;
                            break;
                        }
                    case 6:
                        if (!zzc(t, t2, i) || zzejt.zzk(t, j) != zzejt.zzk(t2, j)) {
                            z = false;
                            break;
                        }
                    case 7:
                        if (!zzc(t, t2, i) || zzejt.zzm(t, j) != zzejt.zzm(t2, j)) {
                            z = false;
                            break;
                        }
                    case 8:
                        if (!zzc(t, t2, i) || !zzeix.zzh(zzejt.zzp(t, j), zzejt.zzp(t2, j))) {
                            z = false;
                            break;
                        }
                    case 9:
                        if (!zzc(t, t2, i) || !zzeix.zzh(zzejt.zzp(t, j), zzejt.zzp(t2, j))) {
                            z = false;
                            break;
                        }
                    case 10:
                        if (!zzc(t, t2, i) || !zzeix.zzh(zzejt.zzp(t, j), zzejt.zzp(t2, j))) {
                            z = false;
                            break;
                        }
                    case 11:
                        if (!zzc(t, t2, i) || zzejt.zzk(t, j) != zzejt.zzk(t2, j)) {
                            z = false;
                            break;
                        }
                    case 12:
                        if (!zzc(t, t2, i) || zzejt.zzk(t, j) != zzejt.zzk(t2, j)) {
                            z = false;
                            break;
                        }
                    case 13:
                        if (!zzc(t, t2, i) || zzejt.zzk(t, j) != zzejt.zzk(t2, j)) {
                            z = false;
                            break;
                        }
                    case 14:
                        if (!zzc(t, t2, i) || zzejt.zzl(t, j) != zzejt.zzl(t2, j)) {
                            z = false;
                            break;
                        }
                    case 15:
                        if (!zzc(t, t2, i) || zzejt.zzk(t, j) != zzejt.zzk(t2, j)) {
                            z = false;
                            break;
                        }
                    case 16:
                        if (!zzc(t, t2, i) || zzejt.zzl(t, j) != zzejt.zzl(t2, j)) {
                            z = false;
                            break;
                        }
                    case 17:
                        if (!zzc(t, t2, i) || !zzeix.zzh(zzejt.zzp(t, j), zzejt.zzp(t2, j))) {
                            z = false;
                            break;
                        }
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        z = zzeix.zzh(zzejt.zzp(t, j), zzejt.zzp(t2, j));
                        break;
                    case 50:
                        z = zzeix.zzh(zzejt.zzp(t, j), zzejt.zzp(t2, j));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long zzhj = (long) (zzhj(i) & 1048575);
                        if (zzejt.zzk(t, zzhj) != zzejt.zzk(t2, zzhj) || !zzeix.zzh(zzejt.zzp(t, j), zzejt.zzp(t2, j))) {
                            z = false;
                            break;
                        }
                }
                if (!z) {
                    return false;
                }
                i += 3;
            } else if (!this.zziio.zzax(t).equals(this.zziio.zzax(t2))) {
                return false;
            } else {
                if (this.zziif) {
                    return this.zziip.zzah(t).equals(this.zziip.zzah(t2));
                }
                return true;
            }
        }
    }

    public final int hashCode(T t) {
        int length = this.zziia.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int zzhi = zzhi(i2);
            int i3 = this.zziia[i2];
            long j = (long) (1048575 & zzhi);
            int i4 = 37;
            switch ((zzhi & 267386880) >>> 20) {
                case 0:
                    i = (i * 53) + zzegr.zzfr(Double.doubleToLongBits(zzejt.zzo(t, j)));
                    break;
                case 1:
                    i = (i * 53) + Float.floatToIntBits(zzejt.zzn(t, j));
                    break;
                case 2:
                    i = (i * 53) + zzegr.zzfr(zzejt.zzl(t, j));
                    break;
                case 3:
                    i = (i * 53) + zzegr.zzfr(zzejt.zzl(t, j));
                    break;
                case 4:
                    i = (i * 53) + zzejt.zzk(t, j);
                    break;
                case 5:
                    i = (i * 53) + zzegr.zzfr(zzejt.zzl(t, j));
                    break;
                case 6:
                    i = (i * 53) + zzejt.zzk(t, j);
                    break;
                case 7:
                    i = (i * 53) + zzegr.zzbu(zzejt.zzm(t, j));
                    break;
                case 8:
                    i = (i * 53) + ((String) zzejt.zzp(t, j)).hashCode();
                    break;
                case 9:
                    Object zzp = zzejt.zzp(t, j);
                    if (zzp != null) {
                        i4 = zzp.hashCode();
                    }
                    i = (i * 53) + i4;
                    break;
                case 10:
                    i = (i * 53) + zzejt.zzp(t, j).hashCode();
                    break;
                case 11:
                    i = (i * 53) + zzejt.zzk(t, j);
                    break;
                case 12:
                    i = (i * 53) + zzejt.zzk(t, j);
                    break;
                case 13:
                    i = (i * 53) + zzejt.zzk(t, j);
                    break;
                case 14:
                    i = (i * 53) + zzegr.zzfr(zzejt.zzl(t, j));
                    break;
                case 15:
                    i = (i * 53) + zzejt.zzk(t, j);
                    break;
                case 16:
                    i = (i * 53) + zzegr.zzfr(zzejt.zzl(t, j));
                    break;
                case 17:
                    Object zzp2 = zzejt.zzp(t, j);
                    if (zzp2 != null) {
                        i4 = zzp2.hashCode();
                    }
                    i = (i * 53) + i4;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = (i * 53) + zzejt.zzp(t, j).hashCode();
                    break;
                case 50:
                    i = (i * 53) + zzejt.zzp(t, j).hashCode();
                    break;
                case 51:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzegr.zzfr(Double.doubleToLongBits(zzf(t, j)));
                        break;
                    }
                case 52:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + Float.floatToIntBits(zzg(t, j));
                        break;
                    }
                case 53:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzegr.zzfr(zzi(t, j));
                        break;
                    }
                case 54:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzegr.zzfr(zzi(t, j));
                        break;
                    }
                case 55:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzh(t, j);
                        break;
                    }
                case 56:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzegr.zzfr(zzi(t, j));
                        break;
                    }
                case 57:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzh(t, j);
                        break;
                    }
                case 58:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzegr.zzbu(zzj(t, j));
                        break;
                    }
                case 59:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + ((String) zzejt.zzp(t, j)).hashCode();
                        break;
                    }
                case 60:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzejt.zzp(t, j).hashCode();
                        break;
                    }
                case 61:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzejt.zzp(t, j).hashCode();
                        break;
                    }
                case 62:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzh(t, j);
                        break;
                    }
                case 63:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzh(t, j);
                        break;
                    }
                case 64:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzh(t, j);
                        break;
                    }
                case 65:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzegr.zzfr(zzi(t, j));
                        break;
                    }
                case 66:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzh(t, j);
                        break;
                    }
                case 67:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzegr.zzfr(zzi(t, j));
                        break;
                    }
                case 68:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzejt.zzp(t, j).hashCode();
                        break;
                    }
            }
        }
        int hashCode = (i * 53) + this.zziio.zzax(t).hashCode();
        if (this.zziif) {
            return (hashCode * 53) + this.zziip.zzah(t).hashCode();
        }
        return hashCode;
    }

    public final void zzg(T t, T t2) {
        if (t2 != null) {
            for (int i = 0; i < this.zziia.length; i += 3) {
                int zzhi = zzhi(i);
                long j = (long) (1048575 & zzhi);
                int i2 = this.zziia[i];
                switch ((zzhi & 267386880) >>> 20) {
                    case 0:
                        if (!zze(t2, i)) {
                            break;
                        } else {
                            zzejt.zza((Object) t, j, zzejt.zzo(t2, j));
                            zzf(t, i);
                            break;
                        }
                    case 1:
                        if (!zze(t2, i)) {
                            break;
                        } else {
                            zzejt.zza((Object) t, j, zzejt.zzn(t2, j));
                            zzf(t, i);
                            break;
                        }
                    case 2:
                        if (!zze(t2, i)) {
                            break;
                        } else {
                            zzejt.zza((Object) t, j, zzejt.zzl(t2, j));
                            zzf(t, i);
                            break;
                        }
                    case 3:
                        if (!zze(t2, i)) {
                            break;
                        } else {
                            zzejt.zza((Object) t, j, zzejt.zzl(t2, j));
                            zzf(t, i);
                            break;
                        }
                    case 4:
                        if (!zze(t2, i)) {
                            break;
                        } else {
                            zzejt.zzb((Object) t, j, zzejt.zzk(t2, j));
                            zzf(t, i);
                            break;
                        }
                    case 5:
                        if (!zze(t2, i)) {
                            break;
                        } else {
                            zzejt.zza((Object) t, j, zzejt.zzl(t2, j));
                            zzf(t, i);
                            break;
                        }
                    case 6:
                        if (!zze(t2, i)) {
                            break;
                        } else {
                            zzejt.zzb((Object) t, j, zzejt.zzk(t2, j));
                            zzf(t, i);
                            break;
                        }
                    case 7:
                        if (!zze(t2, i)) {
                            break;
                        } else {
                            zzejt.zza((Object) t, j, zzejt.zzm(t2, j));
                            zzf(t, i);
                            break;
                        }
                    case 8:
                        if (!zze(t2, i)) {
                            break;
                        } else {
                            zzejt.zza((Object) t, j, zzejt.zzp(t2, j));
                            zzf(t, i);
                            break;
                        }
                    case 9:
                        zza(t, t2, i);
                        break;
                    case 10:
                        if (!zze(t2, i)) {
                            break;
                        } else {
                            zzejt.zza((Object) t, j, zzejt.zzp(t2, j));
                            zzf(t, i);
                            break;
                        }
                    case 11:
                        if (!zze(t2, i)) {
                            break;
                        } else {
                            zzejt.zzb((Object) t, j, zzejt.zzk(t2, j));
                            zzf(t, i);
                            break;
                        }
                    case 12:
                        if (!zze(t2, i)) {
                            break;
                        } else {
                            zzejt.zzb((Object) t, j, zzejt.zzk(t2, j));
                            zzf(t, i);
                            break;
                        }
                    case 13:
                        if (!zze(t2, i)) {
                            break;
                        } else {
                            zzejt.zzb((Object) t, j, zzejt.zzk(t2, j));
                            zzf(t, i);
                            break;
                        }
                    case 14:
                        if (!zze(t2, i)) {
                            break;
                        } else {
                            zzejt.zza((Object) t, j, zzejt.zzl(t2, j));
                            zzf(t, i);
                            break;
                        }
                    case 15:
                        if (!zze(t2, i)) {
                            break;
                        } else {
                            zzejt.zzb((Object) t, j, zzejt.zzk(t2, j));
                            zzf(t, i);
                            break;
                        }
                    case 16:
                        if (!zze(t2, i)) {
                            break;
                        } else {
                            zzejt.zza((Object) t, j, zzejt.zzl(t2, j));
                            zzf(t, i);
                            break;
                        }
                    case 17:
                        zza(t, t2, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.zziin.zza(t, t2, j);
                        break;
                    case 50:
                        zzeix.zza(this.zziiq, t, t2, j);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!zza(t2, i2, i)) {
                            break;
                        } else {
                            zzejt.zza((Object) t, j, zzejt.zzp(t2, j));
                            zzb(t, i2, i);
                            break;
                        }
                    case 60:
                        zzb(t, t2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!zza(t2, i2, i)) {
                            break;
                        } else {
                            zzejt.zza((Object) t, j, zzejt.zzp(t2, j));
                            zzb(t, i2, i);
                            break;
                        }
                    case 68:
                        zzb(t, t2, i);
                        break;
                }
            }
            zzeix.zza(this.zziio, t, t2);
            if (this.zziif) {
                zzeix.zza(this.zziip, t, t2);
                return;
            }
            return;
        }
        throw null;
    }

    private final void zza(T t, T t2, int i) {
        long zzhi = (long) (zzhi(i) & 1048575);
        if (zze(t2, i)) {
            Object zzp = zzejt.zzp(t, zzhi);
            Object zzp2 = zzejt.zzp(t2, zzhi);
            if (zzp != null && zzp2 != null) {
                zzejt.zza((Object) t, zzhi, zzegr.zze(zzp, zzp2));
                zzf(t, i);
            } else if (zzp2 != null) {
                zzejt.zza((Object) t, zzhi, zzp2);
                zzf(t, i);
            }
        }
    }

    private final void zzb(T t, T t2, int i) {
        int zzhi = zzhi(i);
        int i2 = this.zziia[i];
        long j = (long) (zzhi & 1048575);
        if (zza(t2, i2, i)) {
            Object zzp = zzejt.zzp(t, j);
            Object zzp2 = zzejt.zzp(t2, j);
            if (zzp != null && zzp2 != null) {
                zzejt.zza((Object) t, j, zzegr.zze(zzp, zzp2));
                zzb(t, i2, i);
            } else if (zzp2 != null) {
                zzejt.zza((Object) t, j, zzp2);
                zzb(t, i2, i);
            }
        }
    }

    public final int zzat(T t) {
        int i;
        int i2;
        long j;
        int i3;
        T t2 = t;
        int i4 = 267386880;
        if (this.zziih) {
            Unsafe unsafe = zzhop;
            int i5 = 0;
            int i6 = 0;
            while (i5 < this.zziia.length) {
                int zzhi = zzhi(i5);
                int i7 = (zzhi & i4) >>> 20;
                int i8 = this.zziia[i5];
                long j2 = (long) (zzhi & 1048575);
                if (i7 < zzegj.DOUBLE_LIST_PACKED.id() || i7 > zzegj.SINT64_LIST_PACKED.id()) {
                    i3 = 0;
                } else {
                    i3 = this.zziia[i5 + 2] & 1048575;
                }
                switch (i7) {
                    case 0:
                        if (!zze(t2, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzc(i8, 0.0d);
                            break;
                        }
                    case 1:
                        if (!zze(t2, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzb(i8, 0.0f);
                            break;
                        }
                    case 2:
                        if (!zze(t2, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzk(i8, zzejt.zzl(t2, j2));
                            break;
                        }
                    case 3:
                        if (!zze(t2, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzl(i8, zzejt.zzl(t2, j2));
                            break;
                        }
                    case 4:
                        if (!zze(t2, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzaf(i8, zzejt.zzk(t2, j2));
                            break;
                        }
                    case 5:
                        if (!zze(t2, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzn(i8, 0);
                            break;
                        }
                    case 6:
                        if (!zze(t2, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzai(i8, 0);
                            break;
                        }
                    case 7:
                        if (!zze(t2, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzi(i8, true);
                            break;
                        }
                    case 8:
                        if (!zze(t2, i5)) {
                            break;
                        } else {
                            Object zzp = zzejt.zzp(t2, j2);
                            if (!(zzp instanceof zzeff)) {
                                i6 += zzefz.zzj(i8, (String) zzp);
                                break;
                            } else {
                                i6 += zzefz.zzc(i8, (zzeff) zzp);
                                break;
                            }
                        }
                    case 9:
                        if (!zze(t2, i5)) {
                            break;
                        } else {
                            i6 += zzeix.zzc(i8, zzejt.zzp(t2, j2), zzhf(i5));
                            break;
                        }
                    case 10:
                        if (!zze(t2, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzc(i8, (zzeff) zzejt.zzp(t2, j2));
                            break;
                        }
                    case 11:
                        if (!zze(t2, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzag(i8, zzejt.zzk(t2, j2));
                            break;
                        }
                    case 12:
                        if (!zze(t2, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzak(i8, zzejt.zzk(t2, j2));
                            break;
                        }
                    case 13:
                        if (!zze(t2, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzaj(i8, 0);
                            break;
                        }
                    case 14:
                        if (!zze(t2, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzo(i8, 0);
                            break;
                        }
                    case 15:
                        if (!zze(t2, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzah(i8, zzejt.zzk(t2, j2));
                            break;
                        }
                    case 16:
                        if (!zze(t2, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzm(i8, zzejt.zzl(t2, j2));
                            break;
                        }
                    case 17:
                        if (!zze(t2, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzc(i8, (zzehz) zzejt.zzp(t2, j2), zzhf(i5));
                            break;
                        }
                    case 18:
                        i6 += zzeix.zzw(i8, zze((Object) t2, j2), false);
                        break;
                    case 19:
                        i6 += zzeix.zzv(i8, zze((Object) t2, j2), false);
                        break;
                    case 20:
                        i6 += zzeix.zzo(i8, zze((Object) t2, j2), false);
                        break;
                    case 21:
                        i6 += zzeix.zzp(i8, zze((Object) t2, j2), false);
                        break;
                    case 22:
                        i6 += zzeix.zzs(i8, zze((Object) t2, j2), false);
                        break;
                    case 23:
                        i6 += zzeix.zzw(i8, zze((Object) t2, j2), false);
                        break;
                    case 24:
                        i6 += zzeix.zzv(i8, zze((Object) t2, j2), false);
                        break;
                    case 25:
                        i6 += zzeix.zzx(i8, zze((Object) t2, j2), false);
                        break;
                    case 26:
                        i6 += zzeix.zzc(i8, zze((Object) t2, j2));
                        break;
                    case 27:
                        i6 += zzeix.zzc(i8, zze((Object) t2, j2), zzhf(i5));
                        break;
                    case 28:
                        i6 += zzeix.zzd(i8, zze((Object) t2, j2));
                        break;
                    case 29:
                        i6 += zzeix.zzt(i8, zze((Object) t2, j2), false);
                        break;
                    case 30:
                        i6 += zzeix.zzr(i8, zze((Object) t2, j2), false);
                        break;
                    case 31:
                        i6 += zzeix.zzv(i8, zze((Object) t2, j2), false);
                        break;
                    case 32:
                        i6 += zzeix.zzw(i8, zze((Object) t2, j2), false);
                        break;
                    case 33:
                        i6 += zzeix.zzu(i8, zze((Object) t2, j2), false);
                        break;
                    case 34:
                        i6 += zzeix.zzq(i8, zze((Object) t2, j2), false);
                        break;
                    case 35:
                        int zzai = zzeix.zzai((List) unsafe.getObject(t2, j2));
                        if (zzai > 0) {
                            if (this.zziii) {
                                unsafe.putInt(t2, (long) i3, zzai);
                            }
                            i6 += zzefz.zzgq(i8) + zzefz.zzgs(zzai) + zzai;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        int zzah = zzeix.zzah((List) unsafe.getObject(t2, j2));
                        if (zzah > 0) {
                            if (this.zziii) {
                                unsafe.putInt(t2, (long) i3, zzah);
                            }
                            i6 += zzefz.zzgq(i8) + zzefz.zzgs(zzah) + zzah;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        int zzaa = zzeix.zzaa((List) unsafe.getObject(t2, j2));
                        if (zzaa > 0) {
                            if (this.zziii) {
                                unsafe.putInt(t2, (long) i3, zzaa);
                            }
                            i6 += zzefz.zzgq(i8) + zzefz.zzgs(zzaa) + zzaa;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        int zzab = zzeix.zzab((List) unsafe.getObject(t2, j2));
                        if (zzab > 0) {
                            if (this.zziii) {
                                unsafe.putInt(t2, (long) i3, zzab);
                            }
                            i6 += zzefz.zzgq(i8) + zzefz.zzgs(zzab) + zzab;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        int zzae = zzeix.zzae((List) unsafe.getObject(t2, j2));
                        if (zzae > 0) {
                            if (this.zziii) {
                                unsafe.putInt(t2, (long) i3, zzae);
                            }
                            i6 += zzefz.zzgq(i8) + zzefz.zzgs(zzae) + zzae;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        int zzai2 = zzeix.zzai((List) unsafe.getObject(t2, j2));
                        if (zzai2 > 0) {
                            if (this.zziii) {
                                unsafe.putInt(t2, (long) i3, zzai2);
                            }
                            i6 += zzefz.zzgq(i8) + zzefz.zzgs(zzai2) + zzai2;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        int zzah2 = zzeix.zzah((List) unsafe.getObject(t2, j2));
                        if (zzah2 > 0) {
                            if (this.zziii) {
                                unsafe.putInt(t2, (long) i3, zzah2);
                            }
                            i6 += zzefz.zzgq(i8) + zzefz.zzgs(zzah2) + zzah2;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        int zzaj = zzeix.zzaj((List) unsafe.getObject(t2, j2));
                        if (zzaj > 0) {
                            if (this.zziii) {
                                unsafe.putInt(t2, (long) i3, zzaj);
                            }
                            i6 += zzefz.zzgq(i8) + zzefz.zzgs(zzaj) + zzaj;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        int zzaf = zzeix.zzaf((List) unsafe.getObject(t2, j2));
                        if (zzaf > 0) {
                            if (this.zziii) {
                                unsafe.putInt(t2, (long) i3, zzaf);
                            }
                            i6 += zzefz.zzgq(i8) + zzefz.zzgs(zzaf) + zzaf;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        int zzad = zzeix.zzad((List) unsafe.getObject(t2, j2));
                        if (zzad > 0) {
                            if (this.zziii) {
                                unsafe.putInt(t2, (long) i3, zzad);
                            }
                            i6 += zzefz.zzgq(i8) + zzefz.zzgs(zzad) + zzad;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        int zzah3 = zzeix.zzah((List) unsafe.getObject(t2, j2));
                        if (zzah3 > 0) {
                            if (this.zziii) {
                                unsafe.putInt(t2, (long) i3, zzah3);
                            }
                            i6 += zzefz.zzgq(i8) + zzefz.zzgs(zzah3) + zzah3;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        int zzai3 = zzeix.zzai((List) unsafe.getObject(t2, j2));
                        if (zzai3 > 0) {
                            if (this.zziii) {
                                unsafe.putInt(t2, (long) i3, zzai3);
                            }
                            i6 += zzefz.zzgq(i8) + zzefz.zzgs(zzai3) + zzai3;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        int zzag = zzeix.zzag((List) unsafe.getObject(t2, j2));
                        if (zzag > 0) {
                            if (this.zziii) {
                                unsafe.putInt(t2, (long) i3, zzag);
                            }
                            i6 += zzefz.zzgq(i8) + zzefz.zzgs(zzag) + zzag;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        int zzac = zzeix.zzac((List) unsafe.getObject(t2, j2));
                        if (zzac > 0) {
                            if (this.zziii) {
                                unsafe.putInt(t2, (long) i3, zzac);
                            }
                            i6 += zzefz.zzgq(i8) + zzefz.zzgs(zzac) + zzac;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        i6 += zzeix.zzd(i8, zze((Object) t2, j2), zzhf(i5));
                        break;
                    case 50:
                        i6 += this.zziiq.zzb(i8, zzejt.zzp(t2, j2), zzhg(i5));
                        break;
                    case 51:
                        if (!zza(t2, i8, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzc(i8, 0.0d);
                            break;
                        }
                    case 52:
                        if (!zza(t2, i8, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzb(i8, 0.0f);
                            break;
                        }
                    case 53:
                        if (!zza(t2, i8, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzk(i8, zzi(t2, j2));
                            break;
                        }
                    case 54:
                        if (!zza(t2, i8, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzl(i8, zzi(t2, j2));
                            break;
                        }
                    case 55:
                        if (!zza(t2, i8, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzaf(i8, zzh(t2, j2));
                            break;
                        }
                    case 56:
                        if (!zza(t2, i8, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzn(i8, 0);
                            break;
                        }
                    case 57:
                        if (!zza(t2, i8, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzai(i8, 0);
                            break;
                        }
                    case 58:
                        if (!zza(t2, i8, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzi(i8, true);
                            break;
                        }
                    case 59:
                        if (!zza(t2, i8, i5)) {
                            break;
                        } else {
                            Object zzp2 = zzejt.zzp(t2, j2);
                            if (!(zzp2 instanceof zzeff)) {
                                i6 += zzefz.zzj(i8, (String) zzp2);
                                break;
                            } else {
                                i6 += zzefz.zzc(i8, (zzeff) zzp2);
                                break;
                            }
                        }
                    case 60:
                        if (!zza(t2, i8, i5)) {
                            break;
                        } else {
                            i6 += zzeix.zzc(i8, zzejt.zzp(t2, j2), zzhf(i5));
                            break;
                        }
                    case 61:
                        if (!zza(t2, i8, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzc(i8, (zzeff) zzejt.zzp(t2, j2));
                            break;
                        }
                    case 62:
                        if (!zza(t2, i8, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzag(i8, zzh(t2, j2));
                            break;
                        }
                    case 63:
                        if (!zza(t2, i8, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzak(i8, zzh(t2, j2));
                            break;
                        }
                    case 64:
                        if (!zza(t2, i8, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzaj(i8, 0);
                            break;
                        }
                    case 65:
                        if (!zza(t2, i8, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzo(i8, 0);
                            break;
                        }
                    case 66:
                        if (!zza(t2, i8, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzah(i8, zzh(t2, j2));
                            break;
                        }
                    case 67:
                        if (!zza(t2, i8, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzm(i8, zzi(t2, j2));
                            break;
                        }
                    case 68:
                        if (!zza(t2, i8, i5)) {
                            break;
                        } else {
                            i6 += zzefz.zzc(i8, (zzehz) zzejt.zzp(t2, j2), zzhf(i5));
                            break;
                        }
                }
                i5 += 3;
                i4 = 267386880;
            }
            return i6 + zza(this.zziio, t2);
        }
        Unsafe unsafe2 = zzhop;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        int i12 = 0;
        while (i9 < this.zziia.length) {
            int zzhi2 = zzhi(i9);
            int[] iArr = this.zziia;
            int i13 = iArr[i9];
            int i14 = (zzhi2 & 267386880) >>> 20;
            if (i14 <= 17) {
                int i15 = iArr[i9 + 2];
                int i16 = i15 & 1048575;
                i = 1 << (i15 >>> 20);
                if (i16 != i11) {
                    i12 = unsafe2.getInt(t2, (long) i16);
                    i11 = i16;
                }
                i2 = i15;
            } else if (!this.zziii || i14 < zzegj.DOUBLE_LIST_PACKED.id() || i14 > zzegj.SINT64_LIST_PACKED.id()) {
                i2 = 0;
                i = 0;
            } else {
                i2 = this.zziia[i9 + 2] & 1048575;
                i = 0;
            }
            long j3 = (long) (zzhi2 & 1048575);
            switch (i14) {
                case 0:
                    j = 0;
                    if ((i12 & i) == 0) {
                        break;
                    } else {
                        i10 += zzefz.zzc(i13, 0.0d);
                        break;
                    }
                case 1:
                    j = 0;
                    if ((i12 & i) == 0) {
                        break;
                    } else {
                        i10 += zzefz.zzb(i13, 0.0f);
                        break;
                    }
                case 2:
                    j = 0;
                    if ((i12 & i) == 0) {
                        break;
                    } else {
                        i10 += zzefz.zzk(i13, unsafe2.getLong(t2, j3));
                        break;
                    }
                case 3:
                    j = 0;
                    if ((i12 & i) == 0) {
                        break;
                    } else {
                        i10 += zzefz.zzl(i13, unsafe2.getLong(t2, j3));
                        break;
                    }
                case 4:
                    j = 0;
                    if ((i12 & i) == 0) {
                        break;
                    } else {
                        i10 += zzefz.zzaf(i13, unsafe2.getInt(t2, j3));
                        break;
                    }
                case 5:
                    if ((i12 & i) == 0) {
                        j = 0;
                        break;
                    } else {
                        j = 0;
                        i10 += zzefz.zzn(i13, 0);
                        break;
                    }
                case 6:
                    if ((i12 & i) == 0) {
                        j = 0;
                        break;
                    } else {
                        i10 += zzefz.zzai(i13, 0);
                        j = 0;
                        break;
                    }
                case 7:
                    if ((i12 & i) == 0) {
                        j = 0;
                        break;
                    } else {
                        i10 += zzefz.zzi(i13, true);
                        j = 0;
                        break;
                    }
                case 8:
                    if ((i12 & i) == 0) {
                        j = 0;
                        break;
                    } else {
                        Object object = unsafe2.getObject(t2, j3);
                        if (!(object instanceof zzeff)) {
                            i10 += zzefz.zzj(i13, (String) object);
                            j = 0;
                            break;
                        } else {
                            i10 += zzefz.zzc(i13, (zzeff) object);
                            j = 0;
                            break;
                        }
                    }
                case 9:
                    if ((i12 & i) == 0) {
                        j = 0;
                        break;
                    } else {
                        i10 += zzeix.zzc(i13, unsafe2.getObject(t2, j3), zzhf(i9));
                        j = 0;
                        break;
                    }
                case 10:
                    if ((i12 & i) == 0) {
                        j = 0;
                        break;
                    } else {
                        i10 += zzefz.zzc(i13, (zzeff) unsafe2.getObject(t2, j3));
                        j = 0;
                        break;
                    }
                case 11:
                    if ((i12 & i) == 0) {
                        j = 0;
                        break;
                    } else {
                        i10 += zzefz.zzag(i13, unsafe2.getInt(t2, j3));
                        j = 0;
                        break;
                    }
                case 12:
                    if ((i12 & i) == 0) {
                        j = 0;
                        break;
                    } else {
                        i10 += zzefz.zzak(i13, unsafe2.getInt(t2, j3));
                        j = 0;
                        break;
                    }
                case 13:
                    if ((i12 & i) == 0) {
                        j = 0;
                        break;
                    } else {
                        i10 += zzefz.zzaj(i13, 0);
                        j = 0;
                        break;
                    }
                case 14:
                    if ((i12 & i) == 0) {
                        j = 0;
                        break;
                    } else {
                        i10 += zzefz.zzo(i13, 0);
                        j = 0;
                        break;
                    }
                case 15:
                    if ((i12 & i) == 0) {
                        j = 0;
                        break;
                    } else {
                        i10 += zzefz.zzah(i13, unsafe2.getInt(t2, j3));
                        j = 0;
                        break;
                    }
                case 16:
                    if ((i12 & i) == 0) {
                        j = 0;
                        break;
                    } else {
                        i10 += zzefz.zzm(i13, unsafe2.getLong(t2, j3));
                        j = 0;
                        break;
                    }
                case 17:
                    if ((i12 & i) == 0) {
                        j = 0;
                        break;
                    } else {
                        i10 += zzefz.zzc(i13, (zzehz) unsafe2.getObject(t2, j3), zzhf(i9));
                        j = 0;
                        break;
                    }
                case 18:
                    i10 += zzeix.zzw(i13, (List) unsafe2.getObject(t2, j3), false);
                    j = 0;
                    break;
                case 19:
                    i10 += zzeix.zzv(i13, (List) unsafe2.getObject(t2, j3), false);
                    j = 0;
                    break;
                case 20:
                    i10 += zzeix.zzo(i13, (List) unsafe2.getObject(t2, j3), false);
                    j = 0;
                    break;
                case 21:
                    i10 += zzeix.zzp(i13, (List) unsafe2.getObject(t2, j3), false);
                    j = 0;
                    break;
                case 22:
                    i10 += zzeix.zzs(i13, (List) unsafe2.getObject(t2, j3), false);
                    j = 0;
                    break;
                case 23:
                    i10 += zzeix.zzw(i13, (List) unsafe2.getObject(t2, j3), false);
                    j = 0;
                    break;
                case 24:
                    i10 += zzeix.zzv(i13, (List) unsafe2.getObject(t2, j3), false);
                    j = 0;
                    break;
                case 25:
                    i10 += zzeix.zzx(i13, (List) unsafe2.getObject(t2, j3), false);
                    j = 0;
                    break;
                case 26:
                    i10 += zzeix.zzc(i13, (List) unsafe2.getObject(t2, j3));
                    j = 0;
                    break;
                case 27:
                    i10 += zzeix.zzc(i13, (List<?>) (List) unsafe2.getObject(t2, j3), zzhf(i9));
                    j = 0;
                    break;
                case 28:
                    i10 += zzeix.zzd(i13, (List) unsafe2.getObject(t2, j3));
                    j = 0;
                    break;
                case 29:
                    i10 += zzeix.zzt(i13, (List) unsafe2.getObject(t2, j3), false);
                    j = 0;
                    break;
                case 30:
                    i10 += zzeix.zzr(i13, (List) unsafe2.getObject(t2, j3), false);
                    j = 0;
                    break;
                case 31:
                    i10 += zzeix.zzv(i13, (List) unsafe2.getObject(t2, j3), false);
                    j = 0;
                    break;
                case 32:
                    i10 += zzeix.zzw(i13, (List) unsafe2.getObject(t2, j3), false);
                    j = 0;
                    break;
                case 33:
                    i10 += zzeix.zzu(i13, (List) unsafe2.getObject(t2, j3), false);
                    j = 0;
                    break;
                case 34:
                    i10 += zzeix.zzq(i13, (List) unsafe2.getObject(t2, j3), false);
                    j = 0;
                    break;
                case 35:
                    int zzai4 = zzeix.zzai((List) unsafe2.getObject(t2, j3));
                    if (zzai4 <= 0) {
                        j = 0;
                        break;
                    } else {
                        if (this.zziii) {
                            unsafe2.putInt(t2, (long) i2, zzai4);
                        }
                        i10 += zzefz.zzgq(i13) + zzefz.zzgs(zzai4) + zzai4;
                        j = 0;
                        break;
                    }
                case 36:
                    int zzah4 = zzeix.zzah((List) unsafe2.getObject(t2, j3));
                    if (zzah4 <= 0) {
                        j = 0;
                        break;
                    } else {
                        if (this.zziii) {
                            unsafe2.putInt(t2, (long) i2, zzah4);
                        }
                        i10 += zzefz.zzgq(i13) + zzefz.zzgs(zzah4) + zzah4;
                        j = 0;
                        break;
                    }
                case 37:
                    int zzaa2 = zzeix.zzaa((List) unsafe2.getObject(t2, j3));
                    if (zzaa2 <= 0) {
                        j = 0;
                        break;
                    } else {
                        if (this.zziii) {
                            unsafe2.putInt(t2, (long) i2, zzaa2);
                        }
                        i10 += zzefz.zzgq(i13) + zzefz.zzgs(zzaa2) + zzaa2;
                        j = 0;
                        break;
                    }
                case 38:
                    int zzab2 = zzeix.zzab((List) unsafe2.getObject(t2, j3));
                    if (zzab2 <= 0) {
                        j = 0;
                        break;
                    } else {
                        if (this.zziii) {
                            unsafe2.putInt(t2, (long) i2, zzab2);
                        }
                        i10 += zzefz.zzgq(i13) + zzefz.zzgs(zzab2) + zzab2;
                        j = 0;
                        break;
                    }
                case 39:
                    int zzae2 = zzeix.zzae((List) unsafe2.getObject(t2, j3));
                    if (zzae2 <= 0) {
                        j = 0;
                        break;
                    } else {
                        if (this.zziii) {
                            unsafe2.putInt(t2, (long) i2, zzae2);
                        }
                        i10 += zzefz.zzgq(i13) + zzefz.zzgs(zzae2) + zzae2;
                        j = 0;
                        break;
                    }
                case 40:
                    int zzai5 = zzeix.zzai((List) unsafe2.getObject(t2, j3));
                    if (zzai5 <= 0) {
                        j = 0;
                        break;
                    } else {
                        if (this.zziii) {
                            unsafe2.putInt(t2, (long) i2, zzai5);
                        }
                        i10 += zzefz.zzgq(i13) + zzefz.zzgs(zzai5) + zzai5;
                        j = 0;
                        break;
                    }
                case 41:
                    int zzah5 = zzeix.zzah((List) unsafe2.getObject(t2, j3));
                    if (zzah5 <= 0) {
                        j = 0;
                        break;
                    } else {
                        if (this.zziii) {
                            unsafe2.putInt(t2, (long) i2, zzah5);
                        }
                        i10 += zzefz.zzgq(i13) + zzefz.zzgs(zzah5) + zzah5;
                        j = 0;
                        break;
                    }
                case 42:
                    int zzaj2 = zzeix.zzaj((List) unsafe2.getObject(t2, j3));
                    if (zzaj2 <= 0) {
                        j = 0;
                        break;
                    } else {
                        if (this.zziii) {
                            unsafe2.putInt(t2, (long) i2, zzaj2);
                        }
                        i10 += zzefz.zzgq(i13) + zzefz.zzgs(zzaj2) + zzaj2;
                        j = 0;
                        break;
                    }
                case 43:
                    int zzaf2 = zzeix.zzaf((List) unsafe2.getObject(t2, j3));
                    if (zzaf2 <= 0) {
                        j = 0;
                        break;
                    } else {
                        if (this.zziii) {
                            unsafe2.putInt(t2, (long) i2, zzaf2);
                        }
                        i10 += zzefz.zzgq(i13) + zzefz.zzgs(zzaf2) + zzaf2;
                        j = 0;
                        break;
                    }
                case 44:
                    int zzad2 = zzeix.zzad((List) unsafe2.getObject(t2, j3));
                    if (zzad2 <= 0) {
                        j = 0;
                        break;
                    } else {
                        if (this.zziii) {
                            unsafe2.putInt(t2, (long) i2, zzad2);
                        }
                        i10 += zzefz.zzgq(i13) + zzefz.zzgs(zzad2) + zzad2;
                        j = 0;
                        break;
                    }
                case 45:
                    int zzah6 = zzeix.zzah((List) unsafe2.getObject(t2, j3));
                    if (zzah6 <= 0) {
                        j = 0;
                        break;
                    } else {
                        if (this.zziii) {
                            unsafe2.putInt(t2, (long) i2, zzah6);
                        }
                        i10 += zzefz.zzgq(i13) + zzefz.zzgs(zzah6) + zzah6;
                        j = 0;
                        break;
                    }
                case 46:
                    int zzai6 = zzeix.zzai((List) unsafe2.getObject(t2, j3));
                    if (zzai6 <= 0) {
                        j = 0;
                        break;
                    } else {
                        if (this.zziii) {
                            unsafe2.putInt(t2, (long) i2, zzai6);
                        }
                        i10 += zzefz.zzgq(i13) + zzefz.zzgs(zzai6) + zzai6;
                        j = 0;
                        break;
                    }
                case 47:
                    int zzag2 = zzeix.zzag((List) unsafe2.getObject(t2, j3));
                    if (zzag2 <= 0) {
                        j = 0;
                        break;
                    } else {
                        if (this.zziii) {
                            unsafe2.putInt(t2, (long) i2, zzag2);
                        }
                        i10 += zzefz.zzgq(i13) + zzefz.zzgs(zzag2) + zzag2;
                        j = 0;
                        break;
                    }
                case 48:
                    int zzac2 = zzeix.zzac((List) unsafe2.getObject(t2, j3));
                    if (zzac2 <= 0) {
                        j = 0;
                        break;
                    } else {
                        if (this.zziii) {
                            unsafe2.putInt(t2, (long) i2, zzac2);
                        }
                        i10 += zzefz.zzgq(i13) + zzefz.zzgs(zzac2) + zzac2;
                        j = 0;
                        break;
                    }
                case 49:
                    i10 += zzeix.zzd(i13, (List) unsafe2.getObject(t2, j3), zzhf(i9));
                    j = 0;
                    break;
                case 50:
                    i10 += this.zziiq.zzb(i13, unsafe2.getObject(t2, j3), zzhg(i9));
                    j = 0;
                    break;
                case 51:
                    if (!zza(t2, i13, i9)) {
                        j = 0;
                        break;
                    } else {
                        i10 += zzefz.zzc(i13, 0.0d);
                        j = 0;
                        break;
                    }
                case 52:
                    if (!zza(t2, i13, i9)) {
                        j = 0;
                        break;
                    } else {
                        i10 += zzefz.zzb(i13, 0.0f);
                        j = 0;
                        break;
                    }
                case 53:
                    if (!zza(t2, i13, i9)) {
                        j = 0;
                        break;
                    } else {
                        i10 += zzefz.zzk(i13, zzi(t2, j3));
                        j = 0;
                        break;
                    }
                case 54:
                    if (!zza(t2, i13, i9)) {
                        j = 0;
                        break;
                    } else {
                        i10 += zzefz.zzl(i13, zzi(t2, j3));
                        j = 0;
                        break;
                    }
                case 55:
                    if (!zza(t2, i13, i9)) {
                        j = 0;
                        break;
                    } else {
                        i10 += zzefz.zzaf(i13, zzh(t2, j3));
                        j = 0;
                        break;
                    }
                case 56:
                    if (!zza(t2, i13, i9)) {
                        j = 0;
                        break;
                    } else {
                        i10 += zzefz.zzn(i13, 0);
                        j = 0;
                        break;
                    }
                case 57:
                    if (!zza(t2, i13, i9)) {
                        j = 0;
                        break;
                    } else {
                        i10 += zzefz.zzai(i13, 0);
                        j = 0;
                        break;
                    }
                case 58:
                    if (!zza(t2, i13, i9)) {
                        j = 0;
                        break;
                    } else {
                        i10 += zzefz.zzi(i13, true);
                        j = 0;
                        break;
                    }
                case 59:
                    if (!zza(t2, i13, i9)) {
                        j = 0;
                        break;
                    } else {
                        Object object2 = unsafe2.getObject(t2, j3);
                        if (!(object2 instanceof zzeff)) {
                            i10 += zzefz.zzj(i13, (String) object2);
                            j = 0;
                            break;
                        } else {
                            i10 += zzefz.zzc(i13, (zzeff) object2);
                            j = 0;
                            break;
                        }
                    }
                case 60:
                    if (!zza(t2, i13, i9)) {
                        j = 0;
                        break;
                    } else {
                        i10 += zzeix.zzc(i13, unsafe2.getObject(t2, j3), zzhf(i9));
                        j = 0;
                        break;
                    }
                case 61:
                    if (!zza(t2, i13, i9)) {
                        j = 0;
                        break;
                    } else {
                        i10 += zzefz.zzc(i13, (zzeff) unsafe2.getObject(t2, j3));
                        j = 0;
                        break;
                    }
                case 62:
                    if (!zza(t2, i13, i9)) {
                        j = 0;
                        break;
                    } else {
                        i10 += zzefz.zzag(i13, zzh(t2, j3));
                        j = 0;
                        break;
                    }
                case 63:
                    if (!zza(t2, i13, i9)) {
                        j = 0;
                        break;
                    } else {
                        i10 += zzefz.zzak(i13, zzh(t2, j3));
                        j = 0;
                        break;
                    }
                case 64:
                    if (!zza(t2, i13, i9)) {
                        j = 0;
                        break;
                    } else {
                        i10 += zzefz.zzaj(i13, 0);
                        j = 0;
                        break;
                    }
                case 65:
                    if (!zza(t2, i13, i9)) {
                        j = 0;
                        break;
                    } else {
                        i10 += zzefz.zzo(i13, 0);
                        j = 0;
                        break;
                    }
                case 66:
                    if (!zza(t2, i13, i9)) {
                        j = 0;
                        break;
                    } else {
                        i10 += zzefz.zzah(i13, zzh(t2, j3));
                        j = 0;
                        break;
                    }
                case 67:
                    if (!zza(t2, i13, i9)) {
                        j = 0;
                        break;
                    } else {
                        i10 += zzefz.zzm(i13, zzi(t2, j3));
                        j = 0;
                        break;
                    }
                case 68:
                    if (!zza(t2, i13, i9)) {
                        j = 0;
                        break;
                    } else {
                        i10 += zzefz.zzc(i13, (zzehz) unsafe2.getObject(t2, j3), zzhf(i9));
                        j = 0;
                        break;
                    }
                default:
                    j = 0;
                    break;
            }
            i9 += 3;
            long j4 = j;
        }
        int i17 = 0;
        int zza = i10 + zza(this.zziio, t2);
        if (!this.zziif) {
            return zza;
        }
        zzegi<?> zzah7 = this.zziip.zzah(t2);
        for (int i18 = 0; i18 < zzah7.zzict.zzbhq(); i18++) {
            Map.Entry<T, Object> zzhp = zzah7.zzict.zzhp(i18);
            i17 += zzegi.zzb((zzegk<?>) (zzegk) zzhp.getKey(), zzhp.getValue());
        }
        for (Map.Entry next : zzah7.zzict.zzbhr()) {
            i17 += zzegi.zzb((zzegk<?>) (zzegk) next.getKey(), next.getValue());
        }
        return zza + i17;
    }

    private static <UT, UB> int zza(zzejn<UT, UB> zzejn, T t) {
        return zzejn.zzat(zzejn.zzax(t));
    }

    private static List<?> zze(Object obj, long j) {
        return (List) zzejt.zzp(obj, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x05ad  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x05f0  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0b5e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r14, com.google.android.gms.internal.ads.zzekk r15) throws java.io.IOException {
        /*
            r13 = this;
            int r0 = r15.zzbew()
            int r1 = com.google.android.gms.internal.ads.zzegp.zze.zzigi
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x05c3
            com.google.android.gms.internal.ads.zzejn<?, ?> r0 = r13.zziio
            zza(r0, r14, (com.google.android.gms.internal.ads.zzekk) r15)
            boolean r0 = r13.zziif
            if (r0 == 0) goto L_0x0036
            com.google.android.gms.internal.ads.zzege<?> r0 = r13.zziip
            com.google.android.gms.internal.ads.zzegi r0 = r0.zzah(r14)
            com.google.android.gms.internal.ads.zzeja<T, java.lang.Object> r1 = r0.zzict
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0036
            java.util.Iterator r0 = r0.descendingIterator()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0038
        L_0x0036:
            r0 = r3
            r1 = r0
        L_0x0038:
            int[] r7 = r13.zziia
            int r7 = r7.length
            int r7 = r7 + -3
        L_0x003d:
            if (r7 < 0) goto L_0x05ab
            int r8 = r13.zzhi(r7)
            int[] r9 = r13.zziia
            r9 = r9[r7]
        L_0x0049:
            if (r1 == 0) goto L_0x0067
            com.google.android.gms.internal.ads.zzege<?> r10 = r13.zziip
            int r10 = r10.zza(r1)
            if (r10 <= r9) goto L_0x0067
            com.google.android.gms.internal.ads.zzege<?> r10 = r13.zziip
            r10.zza(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0065
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0049
        L_0x0065:
            r1 = r3
            goto L_0x0049
        L_0x0067:
            r10 = r8 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x0596;
                case 1: goto L_0x0584;
                case 2: goto L_0x0572;
                case 3: goto L_0x0560;
                case 4: goto L_0x054e;
                case 5: goto L_0x053c;
                case 6: goto L_0x052a;
                case 7: goto L_0x0517;
                case 8: goto L_0x0505;
                case 9: goto L_0x04ef;
                case 10: goto L_0x04db;
                case 11: goto L_0x04c8;
                case 12: goto L_0x04b5;
                case 13: goto L_0x04a2;
                case 14: goto L_0x048f;
                case 15: goto L_0x047c;
                case 16: goto L_0x0469;
                case 17: goto L_0x0453;
                case 18: goto L_0x043f;
                case 19: goto L_0x042b;
                case 20: goto L_0x0417;
                case 21: goto L_0x0403;
                case 22: goto L_0x03ef;
                case 23: goto L_0x03db;
                case 24: goto L_0x03c7;
                case 25: goto L_0x03b3;
                case 26: goto L_0x039f;
                case 27: goto L_0x0387;
                case 28: goto L_0x0373;
                case 29: goto L_0x035f;
                case 30: goto L_0x034b;
                case 31: goto L_0x0337;
                case 32: goto L_0x0323;
                case 33: goto L_0x030f;
                case 34: goto L_0x02fb;
                case 35: goto L_0x02e7;
                case 36: goto L_0x02d3;
                case 37: goto L_0x02bf;
                case 38: goto L_0x02ab;
                case 39: goto L_0x0297;
                case 40: goto L_0x0283;
                case 41: goto L_0x026f;
                case 42: goto L_0x025b;
                case 43: goto L_0x0247;
                case 44: goto L_0x0233;
                case 45: goto L_0x021f;
                case 46: goto L_0x020b;
                case 47: goto L_0x01f7;
                case 48: goto L_0x01e3;
                case 49: goto L_0x01cb;
                case 50: goto L_0x01bf;
                case 51: goto L_0x01ad;
                case 52: goto L_0x019b;
                case 53: goto L_0x0189;
                case 54: goto L_0x0177;
                case 55: goto L_0x0165;
                case 56: goto L_0x0153;
                case 57: goto L_0x0141;
                case 58: goto L_0x012f;
                case 59: goto L_0x011d;
                case 60: goto L_0x0107;
                case 61: goto L_0x00f3;
                case 62: goto L_0x00e1;
                case 63: goto L_0x00cf;
                case 64: goto L_0x00bd;
                case 65: goto L_0x00ab;
                case 66: goto L_0x0099;
                case 67: goto L_0x0087;
                case 68: goto L_0x0071;
                default: goto L_0x006f;
            }
        L_0x006f:
            goto L_0x05a7
        L_0x0071:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            com.google.android.gms.internal.ads.zzeiv r10 = r13.zzhf(r7)
            r15.zzb((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.ads.zzeiv) r10)
            goto L_0x05a7
        L_0x0087:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zzi(r14, r10)
            r15.zzi((int) r9, (long) r10)
            goto L_0x05a7
        L_0x0099:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzh(r14, r10)
            r15.zzad(r9, r8)
            goto L_0x05a7
        L_0x00ab:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zzi(r14, r10)
            r15.zzq(r9, r10)
            goto L_0x05a7
        L_0x00bd:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzh(r14, r10)
            r15.zzal(r9, r8)
            goto L_0x05a7
        L_0x00cf:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzh(r14, r10)
            r15.zzam(r9, r8)
            goto L_0x05a7
        L_0x00e1:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzh(r14, r10)
            r15.zzac(r9, r8)
            goto L_0x05a7
        L_0x00f3:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            com.google.android.gms.internal.ads.zzeff r8 = (com.google.android.gms.internal.ads.zzeff) r8
            r15.zza((int) r9, (com.google.android.gms.internal.ads.zzeff) r8)
            goto L_0x05a7
        L_0x0107:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            com.google.android.gms.internal.ads.zzeiv r10 = r13.zzhf(r7)
            r15.zza((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.ads.zzeiv) r10)
            goto L_0x05a7
        L_0x011d:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            zza((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.ads.zzekk) r15)
            goto L_0x05a7
        L_0x012f:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = zzj(r14, r10)
            r15.zzh((int) r9, (boolean) r8)
            goto L_0x05a7
        L_0x0141:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzh(r14, r10)
            r15.zzae(r9, r8)
            goto L_0x05a7
        L_0x0153:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zzi(r14, r10)
            r15.zzj(r9, r10)
            goto L_0x05a7
        L_0x0165:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzh(r14, r10)
            r15.zzab(r9, r8)
            goto L_0x05a7
        L_0x0177:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zzi(r14, r10)
            r15.zzh((int) r9, (long) r10)
            goto L_0x05a7
        L_0x0189:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zzi(r14, r10)
            r15.zzp(r9, r10)
            goto L_0x05a7
        L_0x019b:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = zzg(r14, (long) r10)
            r15.zza((int) r9, (float) r8)
            goto L_0x05a7
        L_0x01ad:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = zzf(r14, (long) r10)
            r15.zzb((int) r9, (double) r10)
            goto L_0x05a7
        L_0x01bf:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            r13.zza((com.google.android.gms.internal.ads.zzekk) r15, (int) r9, (java.lang.Object) r8, (int) r7)
            goto L_0x05a7
        L_0x01cb:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeiv r10 = r13.zzhf(r7)
            com.google.android.gms.internal.ads.zzeix.zzb((int) r9, (java.util.List<?>) r8, (com.google.android.gms.internal.ads.zzekk) r15, (com.google.android.gms.internal.ads.zzeiv) r10)
            goto L_0x05a7
        L_0x01e3:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zze(r9, r8, r15, r4)
            goto L_0x05a7
        L_0x01f7:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zzj(r9, r8, r15, r4)
            goto L_0x05a7
        L_0x020b:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zzg(r9, r8, r15, r4)
            goto L_0x05a7
        L_0x021f:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zzl(r9, r8, r15, r4)
            goto L_0x05a7
        L_0x0233:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zzm(r9, r8, r15, r4)
            goto L_0x05a7
        L_0x0247:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zzi(r9, r8, r15, r4)
            goto L_0x05a7
        L_0x025b:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zzn(r9, r8, r15, r4)
            goto L_0x05a7
        L_0x026f:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zzk(r9, r8, r15, r4)
            goto L_0x05a7
        L_0x0283:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zzf(r9, r8, r15, r4)
            goto L_0x05a7
        L_0x0297:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zzh(r9, r8, r15, r4)
            goto L_0x05a7
        L_0x02ab:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zzd(r9, r8, r15, r4)
            goto L_0x05a7
        L_0x02bf:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zzc(r9, r8, r15, r4)
            goto L_0x05a7
        L_0x02d3:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zzb((int) r9, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.ads.zzekk) r15, (boolean) r4)
            goto L_0x05a7
        L_0x02e7:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zza((int) r9, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.ads.zzekk) r15, (boolean) r4)
            goto L_0x05a7
        L_0x02fb:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zze(r9, r8, r15, r5)
            goto L_0x05a7
        L_0x030f:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zzj(r9, r8, r15, r5)
            goto L_0x05a7
        L_0x0323:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zzg(r9, r8, r15, r5)
            goto L_0x05a7
        L_0x0337:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zzl(r9, r8, r15, r5)
            goto L_0x05a7
        L_0x034b:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zzm(r9, r8, r15, r5)
            goto L_0x05a7
        L_0x035f:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zzi(r9, r8, r15, r5)
            goto L_0x05a7
        L_0x0373:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zzb(r9, r8, r15)
            goto L_0x05a7
        L_0x0387:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeiv r10 = r13.zzhf(r7)
            com.google.android.gms.internal.ads.zzeix.zza((int) r9, (java.util.List<?>) r8, (com.google.android.gms.internal.ads.zzekk) r15, (com.google.android.gms.internal.ads.zzeiv) r10)
            goto L_0x05a7
        L_0x039f:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zza((int) r9, (java.util.List<java.lang.String>) r8, (com.google.android.gms.internal.ads.zzekk) r15)
            goto L_0x05a7
        L_0x03b3:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zzn(r9, r8, r15, r5)
            goto L_0x05a7
        L_0x03c7:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zzk(r9, r8, r15, r5)
            goto L_0x05a7
        L_0x03db:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zzf(r9, r8, r15, r5)
            goto L_0x05a7
        L_0x03ef:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zzh(r9, r8, r15, r5)
            goto L_0x05a7
        L_0x0403:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zzd(r9, r8, r15, r5)
            goto L_0x05a7
        L_0x0417:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zzc(r9, r8, r15, r5)
            goto L_0x05a7
        L_0x042b:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zzb((int) r9, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.ads.zzekk) r15, (boolean) r5)
            goto L_0x05a7
        L_0x043f:
            int[] r9 = r13.zziia
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zza((int) r9, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.ads.zzekk) r15, (boolean) r5)
            goto L_0x05a7
        L_0x0453:
            boolean r10 = r13.zze(r14, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            com.google.android.gms.internal.ads.zzeiv r10 = r13.zzhf(r7)
            r15.zzb((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.ads.zzeiv) r10)
            goto L_0x05a7
        L_0x0469:
            boolean r10 = r13.zze(r14, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.ads.zzejt.zzl(r14, r10)
            r15.zzi((int) r9, (long) r10)
            goto L_0x05a7
        L_0x047c:
            boolean r10 = r13.zze(r14, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.ads.zzejt.zzk(r14, r10)
            r15.zzad(r9, r8)
            goto L_0x05a7
        L_0x048f:
            boolean r10 = r13.zze(r14, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.ads.zzejt.zzl(r14, r10)
            r15.zzq(r9, r10)
            goto L_0x05a7
        L_0x04a2:
            boolean r10 = r13.zze(r14, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.ads.zzejt.zzk(r14, r10)
            r15.zzal(r9, r8)
            goto L_0x05a7
        L_0x04b5:
            boolean r10 = r13.zze(r14, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.ads.zzejt.zzk(r14, r10)
            r15.zzam(r9, r8)
            goto L_0x05a7
        L_0x04c8:
            boolean r10 = r13.zze(r14, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.ads.zzejt.zzk(r14, r10)
            r15.zzac(r9, r8)
            goto L_0x05a7
        L_0x04db:
            boolean r10 = r13.zze(r14, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            com.google.android.gms.internal.ads.zzeff r8 = (com.google.android.gms.internal.ads.zzeff) r8
            r15.zza((int) r9, (com.google.android.gms.internal.ads.zzeff) r8)
            goto L_0x05a7
        L_0x04ef:
            boolean r10 = r13.zze(r14, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            com.google.android.gms.internal.ads.zzeiv r10 = r13.zzhf(r7)
            r15.zza((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.ads.zzeiv) r10)
            goto L_0x05a7
        L_0x0505:
            boolean r10 = r13.zze(r14, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r10)
            zza((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.ads.zzekk) r15)
            goto L_0x05a7
        L_0x0517:
            boolean r10 = r13.zze(r14, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = com.google.android.gms.internal.ads.zzejt.zzm(r14, r10)
            r15.zzh((int) r9, (boolean) r8)
            goto L_0x05a7
        L_0x052a:
            boolean r10 = r13.zze(r14, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.ads.zzejt.zzk(r14, r10)
            r15.zzae(r9, r8)
            goto L_0x05a7
        L_0x053c:
            boolean r10 = r13.zze(r14, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.ads.zzejt.zzl(r14, r10)
            r15.zzj(r9, r10)
            goto L_0x05a7
        L_0x054e:
            boolean r10 = r13.zze(r14, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.ads.zzejt.zzk(r14, r10)
            r15.zzab(r9, r8)
            goto L_0x05a7
        L_0x0560:
            boolean r10 = r13.zze(r14, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.ads.zzejt.zzl(r14, r10)
            r15.zzh((int) r9, (long) r10)
            goto L_0x05a7
        L_0x0572:
            boolean r10 = r13.zze(r14, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.ads.zzejt.zzl(r14, r10)
            r15.zzp(r9, r10)
            goto L_0x05a7
        L_0x0584:
            boolean r10 = r13.zze(r14, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = com.google.android.gms.internal.ads.zzejt.zzn(r14, r10)
            r15.zza((int) r9, (float) r8)
            goto L_0x05a7
        L_0x0596:
            boolean r10 = r13.zze(r14, (int) r7)
            if (r10 == 0) goto L_0x05a7
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = com.google.android.gms.internal.ads.zzejt.zzo(r14, r10)
            r15.zzb((int) r9, (double) r10)
        L_0x05a7:
            int r7 = r7 + -3
            goto L_0x003d
        L_0x05ab:
            if (r1 == 0) goto L_0x05c2
            com.google.android.gms.internal.ads.zzege<?> r14 = r13.zziip
            r14.zza(r15, r1)
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x05c0
            java.lang.Object r14 = r0.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            r1 = r14
            goto L_0x05ab
        L_0x05c0:
            r1 = r3
            goto L_0x05ab
        L_0x05c2:
            return
        L_0x05c3:
            boolean r0 = r13.zziih
            if (r0 == 0) goto L_0x0b78
            boolean r0 = r13.zziif
            if (r0 == 0) goto L_0x05e8
            com.google.android.gms.internal.ads.zzege<?> r0 = r13.zziip
            com.google.android.gms.internal.ads.zzegi r0 = r0.zzah(r14)
            com.google.android.gms.internal.ads.zzeja<T, java.lang.Object> r1 = r0.zzict
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x05e8
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x05ea
        L_0x05e8:
            r0 = r3
            r1 = r0
        L_0x05ea:
            int[] r7 = r13.zziia
            int r7 = r7.length
            r8 = 0
        L_0x05ee:
            if (r8 >= r7) goto L_0x0b5c
            int r9 = r13.zzhi(r8)
            int[] r10 = r13.zziia
            r10 = r10[r8]
        L_0x05fa:
            if (r1 == 0) goto L_0x0618
            com.google.android.gms.internal.ads.zzege<?> r11 = r13.zziip
            int r11 = r11.zza(r1)
            if (r11 > r10) goto L_0x0618
            com.google.android.gms.internal.ads.zzege<?> r11 = r13.zziip
            r11.zza(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0616
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x05fa
        L_0x0616:
            r1 = r3
            goto L_0x05fa
        L_0x0618:
            r11 = r9 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0b47;
                case 1: goto L_0x0b35;
                case 2: goto L_0x0b23;
                case 3: goto L_0x0b11;
                case 4: goto L_0x0aff;
                case 5: goto L_0x0aed;
                case 6: goto L_0x0adb;
                case 7: goto L_0x0ac8;
                case 8: goto L_0x0ab6;
                case 9: goto L_0x0aa0;
                case 10: goto L_0x0a8c;
                case 11: goto L_0x0a79;
                case 12: goto L_0x0a66;
                case 13: goto L_0x0a53;
                case 14: goto L_0x0a40;
                case 15: goto L_0x0a2d;
                case 16: goto L_0x0a1a;
                case 17: goto L_0x0a04;
                case 18: goto L_0x09f0;
                case 19: goto L_0x09dc;
                case 20: goto L_0x09c8;
                case 21: goto L_0x09b4;
                case 22: goto L_0x09a0;
                case 23: goto L_0x098c;
                case 24: goto L_0x0978;
                case 25: goto L_0x0964;
                case 26: goto L_0x0950;
                case 27: goto L_0x0938;
                case 28: goto L_0x0924;
                case 29: goto L_0x0910;
                case 30: goto L_0x08fc;
                case 31: goto L_0x08e8;
                case 32: goto L_0x08d4;
                case 33: goto L_0x08c0;
                case 34: goto L_0x08ac;
                case 35: goto L_0x0898;
                case 36: goto L_0x0884;
                case 37: goto L_0x0870;
                case 38: goto L_0x085c;
                case 39: goto L_0x0848;
                case 40: goto L_0x0834;
                case 41: goto L_0x0820;
                case 42: goto L_0x080c;
                case 43: goto L_0x07f8;
                case 44: goto L_0x07e4;
                case 45: goto L_0x07d0;
                case 46: goto L_0x07bc;
                case 47: goto L_0x07a8;
                case 48: goto L_0x0794;
                case 49: goto L_0x077c;
                case 50: goto L_0x0770;
                case 51: goto L_0x075e;
                case 52: goto L_0x074c;
                case 53: goto L_0x073a;
                case 54: goto L_0x0728;
                case 55: goto L_0x0716;
                case 56: goto L_0x0704;
                case 57: goto L_0x06f2;
                case 58: goto L_0x06e0;
                case 59: goto L_0x06ce;
                case 60: goto L_0x06b8;
                case 61: goto L_0x06a4;
                case 62: goto L_0x0692;
                case 63: goto L_0x0680;
                case 64: goto L_0x066e;
                case 65: goto L_0x065c;
                case 66: goto L_0x064a;
                case 67: goto L_0x0638;
                case 68: goto L_0x0622;
                default: goto L_0x0620;
            }
        L_0x0620:
            goto L_0x0b58
        L_0x0622:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            com.google.android.gms.internal.ads.zzeiv r11 = r13.zzhf(r8)
            r15.zzb((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.ads.zzeiv) r11)
            goto L_0x0b58
        L_0x0638:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zzi(r14, r11)
            r15.zzi((int) r10, (long) r11)
            goto L_0x0b58
        L_0x064a:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzh(r14, r11)
            r15.zzad(r10, r9)
            goto L_0x0b58
        L_0x065c:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zzi(r14, r11)
            r15.zzq(r10, r11)
            goto L_0x0b58
        L_0x066e:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzh(r14, r11)
            r15.zzal(r10, r9)
            goto L_0x0b58
        L_0x0680:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzh(r14, r11)
            r15.zzam(r10, r9)
            goto L_0x0b58
        L_0x0692:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzh(r14, r11)
            r15.zzac(r10, r9)
            goto L_0x0b58
        L_0x06a4:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            com.google.android.gms.internal.ads.zzeff r9 = (com.google.android.gms.internal.ads.zzeff) r9
            r15.zza((int) r10, (com.google.android.gms.internal.ads.zzeff) r9)
            goto L_0x0b58
        L_0x06b8:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            com.google.android.gms.internal.ads.zzeiv r11 = r13.zzhf(r8)
            r15.zza((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.ads.zzeiv) r11)
            goto L_0x0b58
        L_0x06ce:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            zza((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.ads.zzekk) r15)
            goto L_0x0b58
        L_0x06e0:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = zzj(r14, r11)
            r15.zzh((int) r10, (boolean) r9)
            goto L_0x0b58
        L_0x06f2:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzh(r14, r11)
            r15.zzae(r10, r9)
            goto L_0x0b58
        L_0x0704:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zzi(r14, r11)
            r15.zzj(r10, r11)
            goto L_0x0b58
        L_0x0716:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzh(r14, r11)
            r15.zzab(r10, r9)
            goto L_0x0b58
        L_0x0728:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zzi(r14, r11)
            r15.zzh((int) r10, (long) r11)
            goto L_0x0b58
        L_0x073a:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zzi(r14, r11)
            r15.zzp(r10, r11)
            goto L_0x0b58
        L_0x074c:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = zzg(r14, (long) r11)
            r15.zza((int) r10, (float) r9)
            goto L_0x0b58
        L_0x075e:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = zzf(r14, (long) r11)
            r15.zzb((int) r10, (double) r11)
            goto L_0x0b58
        L_0x0770:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            r13.zza((com.google.android.gms.internal.ads.zzekk) r15, (int) r10, (java.lang.Object) r9, (int) r8)
            goto L_0x0b58
        L_0x077c:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeiv r11 = r13.zzhf(r8)
            com.google.android.gms.internal.ads.zzeix.zzb((int) r10, (java.util.List<?>) r9, (com.google.android.gms.internal.ads.zzekk) r15, (com.google.android.gms.internal.ads.zzeiv) r11)
            goto L_0x0b58
        L_0x0794:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeix.zze(r10, r9, r15, r4)
            goto L_0x0b58
        L_0x07a8:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeix.zzj(r10, r9, r15, r4)
            goto L_0x0b58
        L_0x07bc:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeix.zzg(r10, r9, r15, r4)
            goto L_0x0b58
        L_0x07d0:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeix.zzl(r10, r9, r15, r4)
            goto L_0x0b58
        L_0x07e4:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeix.zzm(r10, r9, r15, r4)
            goto L_0x0b58
        L_0x07f8:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeix.zzi(r10, r9, r15, r4)
            goto L_0x0b58
        L_0x080c:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeix.zzn(r10, r9, r15, r4)
            goto L_0x0b58
        L_0x0820:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeix.zzk(r10, r9, r15, r4)
            goto L_0x0b58
        L_0x0834:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeix.zzf(r10, r9, r15, r4)
            goto L_0x0b58
        L_0x0848:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeix.zzh(r10, r9, r15, r4)
            goto L_0x0b58
        L_0x085c:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeix.zzd(r10, r9, r15, r4)
            goto L_0x0b58
        L_0x0870:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeix.zzc(r10, r9, r15, r4)
            goto L_0x0b58
        L_0x0884:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeix.zzb((int) r10, (java.util.List<java.lang.Float>) r9, (com.google.android.gms.internal.ads.zzekk) r15, (boolean) r4)
            goto L_0x0b58
        L_0x0898:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeix.zza((int) r10, (java.util.List<java.lang.Double>) r9, (com.google.android.gms.internal.ads.zzekk) r15, (boolean) r4)
            goto L_0x0b58
        L_0x08ac:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeix.zze(r10, r9, r15, r5)
            goto L_0x0b58
        L_0x08c0:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeix.zzj(r10, r9, r15, r5)
            goto L_0x0b58
        L_0x08d4:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeix.zzg(r10, r9, r15, r5)
            goto L_0x0b58
        L_0x08e8:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeix.zzl(r10, r9, r15, r5)
            goto L_0x0b58
        L_0x08fc:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeix.zzm(r10, r9, r15, r5)
            goto L_0x0b58
        L_0x0910:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeix.zzi(r10, r9, r15, r5)
            goto L_0x0b58
        L_0x0924:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeix.zzb(r10, r9, r15)
            goto L_0x0b58
        L_0x0938:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeiv r11 = r13.zzhf(r8)
            com.google.android.gms.internal.ads.zzeix.zza((int) r10, (java.util.List<?>) r9, (com.google.android.gms.internal.ads.zzekk) r15, (com.google.android.gms.internal.ads.zzeiv) r11)
            goto L_0x0b58
        L_0x0950:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeix.zza((int) r10, (java.util.List<java.lang.String>) r9, (com.google.android.gms.internal.ads.zzekk) r15)
            goto L_0x0b58
        L_0x0964:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeix.zzn(r10, r9, r15, r5)
            goto L_0x0b58
        L_0x0978:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeix.zzk(r10, r9, r15, r5)
            goto L_0x0b58
        L_0x098c:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeix.zzf(r10, r9, r15, r5)
            goto L_0x0b58
        L_0x09a0:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeix.zzh(r10, r9, r15, r5)
            goto L_0x0b58
        L_0x09b4:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeix.zzd(r10, r9, r15, r5)
            goto L_0x0b58
        L_0x09c8:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeix.zzc(r10, r9, r15, r5)
            goto L_0x0b58
        L_0x09dc:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeix.zzb((int) r10, (java.util.List<java.lang.Float>) r9, (com.google.android.gms.internal.ads.zzekk) r15, (boolean) r5)
            goto L_0x0b58
        L_0x09f0:
            int[] r10 = r13.zziia
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzeix.zza((int) r10, (java.util.List<java.lang.Double>) r9, (com.google.android.gms.internal.ads.zzekk) r15, (boolean) r5)
            goto L_0x0b58
        L_0x0a04:
            boolean r11 = r13.zze(r14, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            com.google.android.gms.internal.ads.zzeiv r11 = r13.zzhf(r8)
            r15.zzb((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.ads.zzeiv) r11)
            goto L_0x0b58
        L_0x0a1a:
            boolean r11 = r13.zze(r14, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.ads.zzejt.zzl(r14, r11)
            r15.zzi((int) r10, (long) r11)
            goto L_0x0b58
        L_0x0a2d:
            boolean r11 = r13.zze(r14, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.ads.zzejt.zzk(r14, r11)
            r15.zzad(r10, r9)
            goto L_0x0b58
        L_0x0a40:
            boolean r11 = r13.zze(r14, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.ads.zzejt.zzl(r14, r11)
            r15.zzq(r10, r11)
            goto L_0x0b58
        L_0x0a53:
            boolean r11 = r13.zze(r14, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.ads.zzejt.zzk(r14, r11)
            r15.zzal(r10, r9)
            goto L_0x0b58
        L_0x0a66:
            boolean r11 = r13.zze(r14, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.ads.zzejt.zzk(r14, r11)
            r15.zzam(r10, r9)
            goto L_0x0b58
        L_0x0a79:
            boolean r11 = r13.zze(r14, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.ads.zzejt.zzk(r14, r11)
            r15.zzac(r10, r9)
            goto L_0x0b58
        L_0x0a8c:
            boolean r11 = r13.zze(r14, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            com.google.android.gms.internal.ads.zzeff r9 = (com.google.android.gms.internal.ads.zzeff) r9
            r15.zza((int) r10, (com.google.android.gms.internal.ads.zzeff) r9)
            goto L_0x0b58
        L_0x0aa0:
            boolean r11 = r13.zze(r14, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            com.google.android.gms.internal.ads.zzeiv r11 = r13.zzhf(r8)
            r15.zza((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.ads.zzeiv) r11)
            goto L_0x0b58
        L_0x0ab6:
            boolean r11 = r13.zze(r14, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzejt.zzp(r14, r11)
            zza((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.ads.zzekk) r15)
            goto L_0x0b58
        L_0x0ac8:
            boolean r11 = r13.zze(r14, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = com.google.android.gms.internal.ads.zzejt.zzm(r14, r11)
            r15.zzh((int) r10, (boolean) r9)
            goto L_0x0b58
        L_0x0adb:
            boolean r11 = r13.zze(r14, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.ads.zzejt.zzk(r14, r11)
            r15.zzae(r10, r9)
            goto L_0x0b58
        L_0x0aed:
            boolean r11 = r13.zze(r14, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.ads.zzejt.zzl(r14, r11)
            r15.zzj(r10, r11)
            goto L_0x0b58
        L_0x0aff:
            boolean r11 = r13.zze(r14, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.ads.zzejt.zzk(r14, r11)
            r15.zzab(r10, r9)
            goto L_0x0b58
        L_0x0b11:
            boolean r11 = r13.zze(r14, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.ads.zzejt.zzl(r14, r11)
            r15.zzh((int) r10, (long) r11)
            goto L_0x0b58
        L_0x0b23:
            boolean r11 = r13.zze(r14, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.ads.zzejt.zzl(r14, r11)
            r15.zzp(r10, r11)
            goto L_0x0b58
        L_0x0b35:
            boolean r11 = r13.zze(r14, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = com.google.android.gms.internal.ads.zzejt.zzn(r14, r11)
            r15.zza((int) r10, (float) r9)
            goto L_0x0b58
        L_0x0b47:
            boolean r11 = r13.zze(r14, (int) r8)
            if (r11 == 0) goto L_0x0b58
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = com.google.android.gms.internal.ads.zzejt.zzo(r14, r11)
            r15.zzb((int) r10, (double) r11)
        L_0x0b58:
            int r8 = r8 + 3
            goto L_0x05ee
        L_0x0b5c:
            if (r1 == 0) goto L_0x0b72
            com.google.android.gms.internal.ads.zzege<?> r2 = r13.zziip
            r2.zza(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0b70
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0b5c
        L_0x0b70:
            r1 = r3
            goto L_0x0b5c
        L_0x0b72:
            com.google.android.gms.internal.ads.zzejn<?, ?> r0 = r13.zziio
            zza(r0, r14, (com.google.android.gms.internal.ads.zzekk) r15)
            return
        L_0x0b78:
            r13.zzb(r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeid.zza(java.lang.Object, com.google.android.gms.internal.ads.zzekk):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:188:0x0559  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzb(T r18, com.google.android.gms.internal.ads.zzekk r19) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.zziif
            if (r3 == 0) goto L_0x0025
            com.google.android.gms.internal.ads.zzege<?> r3 = r0.zziip
            com.google.android.gms.internal.ads.zzegi r3 = r3.zzah(r1)
            com.google.android.gms.internal.ads.zzeja<T, java.lang.Object> r5 = r3.zzict
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0025
            java.util.Iterator r3 = r3.iterator()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0027
        L_0x0025:
            r3 = 0
            r5 = 0
        L_0x0027:
            int[] r6 = r0.zziia
            int r6 = r6.length
            sun.misc.Unsafe r7 = zzhop
            r10 = 0
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
        L_0x0033:
            if (r10 >= r6) goto L_0x0557
            int r13 = r0.zzhi(r10)
            int[] r14 = r0.zziia
            r15 = r14[r10]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r16 = r13 & r16
            int r4 = r16 >>> 20
            boolean r9 = r0.zziih
            if (r9 != 0) goto L_0x0068
            r9 = 17
            if (r4 > r9) goto L_0x0068
            int r9 = r10 + 2
            r9 = r14[r9]
            r14 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r9 & r14
            if (r8 == r11) goto L_0x0062
            long r11 = (long) r8
            int r12 = r7.getInt(r1, r11)
            r11 = r8
        L_0x0062:
            int r8 = r9 >>> 20
            r9 = 1
            int r8 = r9 << r8
            goto L_0x0069
        L_0x0068:
            r8 = 0
        L_0x0069:
            if (r5 == 0) goto L_0x0087
            com.google.android.gms.internal.ads.zzege<?> r9 = r0.zziip
            int r9 = r9.zza(r5)
            if (r9 > r15) goto L_0x0087
            com.google.android.gms.internal.ads.zzege<?> r9 = r0.zziip
            r9.zza(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0085
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0069
        L_0x0085:
            r5 = 0
            goto L_0x0069
        L_0x0087:
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r13 & r9
            long r13 = (long) r13
            switch(r4) {
                case 0: goto L_0x0547;
                case 1: goto L_0x053a;
                case 2: goto L_0x052e;
                case 3: goto L_0x0522;
                case 4: goto L_0x0516;
                case 5: goto L_0x050a;
                case 6: goto L_0x04fe;
                case 7: goto L_0x04f1;
                case 8: goto L_0x04e5;
                case 9: goto L_0x04d4;
                case 10: goto L_0x04c5;
                case 11: goto L_0x04b8;
                case 12: goto L_0x04ab;
                case 13: goto L_0x049e;
                case 14: goto L_0x0491;
                case 15: goto L_0x0484;
                case 16: goto L_0x0477;
                case 17: goto L_0x0465;
                case 18: goto L_0x0452;
                case 19: goto L_0x043f;
                case 20: goto L_0x042c;
                case 21: goto L_0x0419;
                case 22: goto L_0x0406;
                case 23: goto L_0x03f3;
                case 24: goto L_0x03e0;
                case 25: goto L_0x03cd;
                case 26: goto L_0x03bb;
                case 27: goto L_0x03a4;
                case 28: goto L_0x0392;
                case 29: goto L_0x037f;
                case 30: goto L_0x036c;
                case 31: goto L_0x0359;
                case 32: goto L_0x0346;
                case 33: goto L_0x0333;
                case 34: goto L_0x0320;
                case 35: goto L_0x030d;
                case 36: goto L_0x02fa;
                case 37: goto L_0x02e7;
                case 38: goto L_0x02d4;
                case 39: goto L_0x02c1;
                case 40: goto L_0x02ae;
                case 41: goto L_0x029b;
                case 42: goto L_0x0288;
                case 43: goto L_0x0275;
                case 44: goto L_0x0262;
                case 45: goto L_0x024f;
                case 46: goto L_0x023c;
                case 47: goto L_0x0229;
                case 48: goto L_0x0216;
                case 49: goto L_0x01ff;
                case 50: goto L_0x01f5;
                case 51: goto L_0x01e2;
                case 52: goto L_0x01cf;
                case 53: goto L_0x01bc;
                case 54: goto L_0x01a9;
                case 55: goto L_0x0196;
                case 56: goto L_0x0183;
                case 57: goto L_0x0170;
                case 58: goto L_0x015d;
                case 59: goto L_0x014a;
                case 60: goto L_0x0133;
                case 61: goto L_0x011e;
                case 62: goto L_0x010b;
                case 63: goto L_0x00f8;
                case 64: goto L_0x00e5;
                case 65: goto L_0x00d2;
                case 66: goto L_0x00bf;
                case 67: goto L_0x00ac;
                case 68: goto L_0x0094;
                default: goto L_0x0091;
            }
        L_0x0091:
            r4 = 0
            goto L_0x0553
        L_0x0094:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x00a9
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.android.gms.internal.ads.zzeiv r8 = r0.zzhf(r10)
            r2.zzb((int) r15, (java.lang.Object) r4, (com.google.android.gms.internal.ads.zzeiv) r8)
            r4 = 0
            goto L_0x0553
        L_0x00a9:
            r4 = 0
            goto L_0x0553
        L_0x00ac:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x00bc
            long r13 = zzi(r1, r13)
            r2.zzi((int) r15, (long) r13)
            r4 = 0
            goto L_0x0553
        L_0x00bc:
            r4 = 0
            goto L_0x0553
        L_0x00bf:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x00cf
            int r4 = zzh(r1, r13)
            r2.zzad(r15, r4)
            r4 = 0
            goto L_0x0553
        L_0x00cf:
            r4 = 0
            goto L_0x0553
        L_0x00d2:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x00e2
            long r13 = zzi(r1, r13)
            r2.zzq(r15, r13)
            r4 = 0
            goto L_0x0553
        L_0x00e2:
            r4 = 0
            goto L_0x0553
        L_0x00e5:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x00f5
            int r4 = zzh(r1, r13)
            r2.zzal(r15, r4)
            r4 = 0
            goto L_0x0553
        L_0x00f5:
            r4 = 0
            goto L_0x0553
        L_0x00f8:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x0108
            int r4 = zzh(r1, r13)
            r2.zzam(r15, r4)
            r4 = 0
            goto L_0x0553
        L_0x0108:
            r4 = 0
            goto L_0x0553
        L_0x010b:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x011b
            int r4 = zzh(r1, r13)
            r2.zzac(r15, r4)
            r4 = 0
            goto L_0x0553
        L_0x011b:
            r4 = 0
            goto L_0x0553
        L_0x011e:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x0130
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.android.gms.internal.ads.zzeff r4 = (com.google.android.gms.internal.ads.zzeff) r4
            r2.zza((int) r15, (com.google.android.gms.internal.ads.zzeff) r4)
            r4 = 0
            goto L_0x0553
        L_0x0130:
            r4 = 0
            goto L_0x0553
        L_0x0133:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x0147
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.android.gms.internal.ads.zzeiv r8 = r0.zzhf(r10)
            r2.zza((int) r15, (java.lang.Object) r4, (com.google.android.gms.internal.ads.zzeiv) r8)
            r4 = 0
            goto L_0x0553
        L_0x0147:
            r4 = 0
            goto L_0x0553
        L_0x014a:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x015a
            java.lang.Object r4 = r7.getObject(r1, r13)
            zza((int) r15, (java.lang.Object) r4, (com.google.android.gms.internal.ads.zzekk) r2)
            r4 = 0
            goto L_0x0553
        L_0x015a:
            r4 = 0
            goto L_0x0553
        L_0x015d:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x016d
            boolean r4 = zzj(r1, r13)
            r2.zzh((int) r15, (boolean) r4)
            r4 = 0
            goto L_0x0553
        L_0x016d:
            r4 = 0
            goto L_0x0553
        L_0x0170:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x0180
            int r4 = zzh(r1, r13)
            r2.zzae(r15, r4)
            r4 = 0
            goto L_0x0553
        L_0x0180:
            r4 = 0
            goto L_0x0553
        L_0x0183:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x0193
            long r13 = zzi(r1, r13)
            r2.zzj(r15, r13)
            r4 = 0
            goto L_0x0553
        L_0x0193:
            r4 = 0
            goto L_0x0553
        L_0x0196:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x01a6
            int r4 = zzh(r1, r13)
            r2.zzab(r15, r4)
            r4 = 0
            goto L_0x0553
        L_0x01a6:
            r4 = 0
            goto L_0x0553
        L_0x01a9:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x01b9
            long r13 = zzi(r1, r13)
            r2.zzh((int) r15, (long) r13)
            r4 = 0
            goto L_0x0553
        L_0x01b9:
            r4 = 0
            goto L_0x0553
        L_0x01bc:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x01cc
            long r13 = zzi(r1, r13)
            r2.zzp(r15, r13)
            r4 = 0
            goto L_0x0553
        L_0x01cc:
            r4 = 0
            goto L_0x0553
        L_0x01cf:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x01df
            float r4 = zzg(r1, (long) r13)
            r2.zza((int) r15, (float) r4)
            r4 = 0
            goto L_0x0553
        L_0x01df:
            r4 = 0
            goto L_0x0553
        L_0x01e2:
            boolean r4 = r0.zza(r1, (int) r15, (int) r10)
            if (r4 == 0) goto L_0x01f2
            double r13 = zzf(r1, (long) r13)
            r2.zzb((int) r15, (double) r13)
            r4 = 0
            goto L_0x0553
        L_0x01f2:
            r4 = 0
            goto L_0x0553
        L_0x01f5:
            java.lang.Object r4 = r7.getObject(r1, r13)
            r0.zza((com.google.android.gms.internal.ads.zzekk) r2, (int) r15, (java.lang.Object) r4, (int) r10)
            r4 = 0
            goto L_0x0553
        L_0x01ff:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeiv r13 = r0.zzhf(r10)
            com.google.android.gms.internal.ads.zzeix.zzb((int) r4, (java.util.List<?>) r8, (com.google.android.gms.internal.ads.zzekk) r2, (com.google.android.gms.internal.ads.zzeiv) r13)
            r4 = 0
            goto L_0x0553
        L_0x0216:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r13 = 1
            com.google.android.gms.internal.ads.zzeix.zze(r4, r8, r2, r13)
            r4 = 0
            goto L_0x0553
        L_0x0229:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r13 = 1
            com.google.android.gms.internal.ads.zzeix.zzj(r4, r8, r2, r13)
            r4 = 0
            goto L_0x0553
        L_0x023c:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r13 = 1
            com.google.android.gms.internal.ads.zzeix.zzg(r4, r8, r2, r13)
            r4 = 0
            goto L_0x0553
        L_0x024f:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r13 = 1
            com.google.android.gms.internal.ads.zzeix.zzl(r4, r8, r2, r13)
            r4 = 0
            goto L_0x0553
        L_0x0262:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r13 = 1
            com.google.android.gms.internal.ads.zzeix.zzm(r4, r8, r2, r13)
            r4 = 0
            goto L_0x0553
        L_0x0275:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r13 = 1
            com.google.android.gms.internal.ads.zzeix.zzi(r4, r8, r2, r13)
            r4 = 0
            goto L_0x0553
        L_0x0288:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r13 = 1
            com.google.android.gms.internal.ads.zzeix.zzn(r4, r8, r2, r13)
            r4 = 0
            goto L_0x0553
        L_0x029b:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r13 = 1
            com.google.android.gms.internal.ads.zzeix.zzk(r4, r8, r2, r13)
            r4 = 0
            goto L_0x0553
        L_0x02ae:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r13 = 1
            com.google.android.gms.internal.ads.zzeix.zzf(r4, r8, r2, r13)
            r4 = 0
            goto L_0x0553
        L_0x02c1:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r13 = 1
            com.google.android.gms.internal.ads.zzeix.zzh(r4, r8, r2, r13)
            r4 = 0
            goto L_0x0553
        L_0x02d4:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r13 = 1
            com.google.android.gms.internal.ads.zzeix.zzd(r4, r8, r2, r13)
            r4 = 0
            goto L_0x0553
        L_0x02e7:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r13 = 1
            com.google.android.gms.internal.ads.zzeix.zzc(r4, r8, r2, r13)
            r4 = 0
            goto L_0x0553
        L_0x02fa:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r13 = 1
            com.google.android.gms.internal.ads.zzeix.zzb((int) r4, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.ads.zzekk) r2, (boolean) r13)
            r4 = 0
            goto L_0x0553
        L_0x030d:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r13 = 1
            com.google.android.gms.internal.ads.zzeix.zza((int) r4, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.ads.zzekk) r2, (boolean) r13)
            r4 = 0
            goto L_0x0553
        L_0x0320:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.android.gms.internal.ads.zzeix.zze(r4, r8, r2, r13)
            r4 = 0
            goto L_0x0553
        L_0x0333:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.android.gms.internal.ads.zzeix.zzj(r4, r8, r2, r13)
            r4 = 0
            goto L_0x0553
        L_0x0346:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.android.gms.internal.ads.zzeix.zzg(r4, r8, r2, r13)
            r4 = 0
            goto L_0x0553
        L_0x0359:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.android.gms.internal.ads.zzeix.zzl(r4, r8, r2, r13)
            r4 = 0
            goto L_0x0553
        L_0x036c:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.android.gms.internal.ads.zzeix.zzm(r4, r8, r2, r13)
            r4 = 0
            goto L_0x0553
        L_0x037f:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.android.gms.internal.ads.zzeix.zzi(r4, r8, r2, r13)
            r4 = 0
            goto L_0x0553
        L_0x0392:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zzb(r4, r8, r2)
            r4 = 0
            goto L_0x0553
        L_0x03a4:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeiv r13 = r0.zzhf(r10)
            com.google.android.gms.internal.ads.zzeix.zza((int) r4, (java.util.List<?>) r8, (com.google.android.gms.internal.ads.zzekk) r2, (com.google.android.gms.internal.ads.zzeiv) r13)
            r4 = 0
            goto L_0x0553
        L_0x03bb:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzeix.zza((int) r4, (java.util.List<java.lang.String>) r8, (com.google.android.gms.internal.ads.zzekk) r2)
            r4 = 0
            goto L_0x0553
        L_0x03cd:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.android.gms.internal.ads.zzeix.zzn(r4, r8, r2, r13)
            r4 = 0
            goto L_0x0553
        L_0x03e0:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.android.gms.internal.ads.zzeix.zzk(r4, r8, r2, r13)
            r4 = 0
            goto L_0x0553
        L_0x03f3:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.android.gms.internal.ads.zzeix.zzf(r4, r8, r2, r13)
            r4 = 0
            goto L_0x0553
        L_0x0406:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.android.gms.internal.ads.zzeix.zzh(r4, r8, r2, r13)
            r4 = 0
            goto L_0x0553
        L_0x0419:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.android.gms.internal.ads.zzeix.zzd(r4, r8, r2, r13)
            r4 = 0
            goto L_0x0553
        L_0x042c:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.android.gms.internal.ads.zzeix.zzc(r4, r8, r2, r13)
            r4 = 0
            goto L_0x0553
        L_0x043f:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.android.gms.internal.ads.zzeix.zzb((int) r4, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.ads.zzekk) r2, (boolean) r13)
            r4 = 0
            goto L_0x0553
        L_0x0452:
            int[] r4 = r0.zziia
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.android.gms.internal.ads.zzeix.zza((int) r4, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.ads.zzekk) r2, (boolean) r13)
            r4 = 0
            goto L_0x0553
        L_0x0465:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0553
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.android.gms.internal.ads.zzeiv r13 = r0.zzhf(r10)
            r2.zzb((int) r15, (java.lang.Object) r8, (com.google.android.gms.internal.ads.zzeiv) r13)
            goto L_0x0553
        L_0x0477:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0553
            long r13 = r7.getLong(r1, r13)
            r2.zzi((int) r15, (long) r13)
            goto L_0x0553
        L_0x0484:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0553
            int r8 = r7.getInt(r1, r13)
            r2.zzad(r15, r8)
            goto L_0x0553
        L_0x0491:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0553
            long r13 = r7.getLong(r1, r13)
            r2.zzq(r15, r13)
            goto L_0x0553
        L_0x049e:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0553
            int r8 = r7.getInt(r1, r13)
            r2.zzal(r15, r8)
            goto L_0x0553
        L_0x04ab:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0553
            int r8 = r7.getInt(r1, r13)
            r2.zzam(r15, r8)
            goto L_0x0553
        L_0x04b8:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0553
            int r8 = r7.getInt(r1, r13)
            r2.zzac(r15, r8)
            goto L_0x0553
        L_0x04c5:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0553
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.android.gms.internal.ads.zzeff r8 = (com.google.android.gms.internal.ads.zzeff) r8
            r2.zza((int) r15, (com.google.android.gms.internal.ads.zzeff) r8)
            goto L_0x0553
        L_0x04d4:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0553
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.android.gms.internal.ads.zzeiv r13 = r0.zzhf(r10)
            r2.zza((int) r15, (java.lang.Object) r8, (com.google.android.gms.internal.ads.zzeiv) r13)
            goto L_0x0553
        L_0x04e5:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0553
            java.lang.Object r8 = r7.getObject(r1, r13)
            zza((int) r15, (java.lang.Object) r8, (com.google.android.gms.internal.ads.zzekk) r2)
            goto L_0x0553
        L_0x04f1:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0553
            boolean r8 = com.google.android.gms.internal.ads.zzejt.zzm(r1, r13)
            r2.zzh((int) r15, (boolean) r8)
            goto L_0x0553
        L_0x04fe:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0553
            int r8 = r7.getInt(r1, r13)
            r2.zzae(r15, r8)
            goto L_0x0553
        L_0x050a:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0553
            long r13 = r7.getLong(r1, r13)
            r2.zzj(r15, r13)
            goto L_0x0553
        L_0x0516:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0553
            int r8 = r7.getInt(r1, r13)
            r2.zzab(r15, r8)
            goto L_0x0553
        L_0x0522:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0553
            long r13 = r7.getLong(r1, r13)
            r2.zzh((int) r15, (long) r13)
            goto L_0x0553
        L_0x052e:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0553
            long r13 = r7.getLong(r1, r13)
            r2.zzp(r15, r13)
            goto L_0x0553
        L_0x053a:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0553
            float r8 = com.google.android.gms.internal.ads.zzejt.zzn(r1, r13)
            r2.zza((int) r15, (float) r8)
            goto L_0x0553
        L_0x0547:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0553
            double r13 = com.google.android.gms.internal.ads.zzejt.zzo(r1, r13)
            r2.zzb((int) r15, (double) r13)
        L_0x0553:
            int r10 = r10 + 3
            goto L_0x0033
        L_0x0557:
            if (r5 == 0) goto L_0x056e
            com.google.android.gms.internal.ads.zzege<?> r4 = r0.zziip
            r4.zza(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x056c
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x0557
        L_0x056c:
            r5 = 0
            goto L_0x0557
        L_0x056e:
            com.google.android.gms.internal.ads.zzejn<?, ?> r3 = r0.zziio
            zza(r3, r1, (com.google.android.gms.internal.ads.zzekk) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeid.zzb(java.lang.Object, com.google.android.gms.internal.ads.zzekk):void");
    }

    private final <K, V> void zza(zzekk zzekk, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzekk.zza(i, this.zziiq.zzao(zzhg(i2)), this.zziiq.zzap(obj));
        }
    }

    private static <UT, UB> void zza(zzejn<UT, UB> zzejn, T t, zzekk zzekk) throws IOException {
        zzejn.zza(zzejn.zzax(t), zzekk);
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void zza(T r13, com.google.android.gms.internal.ads.zzeip r14, com.google.android.gms.internal.ads.zzegc r15) throws java.io.IOException {
        /*
            r12 = this;
            r0 = 0
            if (r15 == 0) goto L_0x0623
            com.google.android.gms.internal.ads.zzejn<?, ?> r8 = r12.zziio
            com.google.android.gms.internal.ads.zzege<?> r9 = r12.zziip
            r1 = r0
            r10 = r1
        L_0x000a:
            int r2 = r14.zzber()     // Catch:{ all -> 0x060b }
            int r3 = r12.zzhl(r2)     // Catch:{ all -> 0x060b }
            if (r3 >= 0) goto L_0x007b
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r3) goto L_0x0030
            int r14 = r12.zziik
        L_0x001b:
            int r15 = r12.zziil
            if (r14 >= r15) goto L_0x002a
            int[] r15 = r12.zziij
            r15 = r15[r14]
            java.lang.Object r10 = r12.zza((java.lang.Object) r13, (int) r15, r10, r8)
            int r14 = r14 + 1
            goto L_0x001b
        L_0x002a:
            if (r10 == 0) goto L_0x002f
            r8.zzj(r13, r10)
        L_0x002f:
            return
        L_0x0030:
            boolean r3 = r12.zziif     // Catch:{ all -> 0x060b }
            if (r3 != 0) goto L_0x0036
            r3 = r0
            goto L_0x003d
        L_0x0036:
            com.google.android.gms.internal.ads.zzehz r3 = r12.zziie     // Catch:{ all -> 0x060b }
            java.lang.Object r2 = r9.zza(r15, r3, r2)     // Catch:{ all -> 0x060b }
            r3 = r2
        L_0x003d:
            if (r3 == 0) goto L_0x0055
            if (r1 != 0) goto L_0x0047
            com.google.android.gms.internal.ads.zzegi r1 = r9.zzai(r13)     // Catch:{ all -> 0x060b }
            r11 = r1
            goto L_0x0048
        L_0x0047:
            r11 = r1
        L_0x0048:
            r1 = r9
            r2 = r14
            r4 = r15
            r5 = r11
            r6 = r10
            r7 = r8
            java.lang.Object r10 = r1.zza(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x060b }
            r1 = r11
            goto L_0x000a
        L_0x0055:
            r8.zza(r14)     // Catch:{ all -> 0x060b }
            if (r10 != 0) goto L_0x005e
            java.lang.Object r10 = r8.zzay(r13)     // Catch:{ all -> 0x060b }
        L_0x005e:
            boolean r2 = r8.zza(r10, (com.google.android.gms.internal.ads.zzeip) r14)     // Catch:{ all -> 0x060b }
            if (r2 != 0) goto L_0x000a
            int r14 = r12.zziik
        L_0x0066:
            int r15 = r12.zziil
            if (r14 >= r15) goto L_0x0075
            int[] r15 = r12.zziij
            r15 = r15[r14]
            java.lang.Object r10 = r12.zza((java.lang.Object) r13, (int) r15, r10, r8)
            int r14 = r14 + 1
            goto L_0x0066
        L_0x0075:
            if (r10 == 0) goto L_0x007a
            r8.zzj(r13, r10)
        L_0x007a:
            return
        L_0x007b:
            int r4 = r12.zzhi(r3)     // Catch:{ all -> 0x060b }
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r5 = r5 & r4
            int r5 = r5 >>> 20
            r6 = 1048575(0xfffff, float:1.469367E-39)
            switch(r5) {
                case 0: goto L_0x05b2;
                case 1: goto L_0x05a2;
                case 2: goto L_0x0592;
                case 3: goto L_0x0582;
                case 4: goto L_0x0572;
                case 5: goto L_0x0562;
                case 6: goto L_0x0552;
                case 7: goto L_0x0542;
                case 8: goto L_0x053a;
                case 9: goto L_0x0504;
                case 10: goto L_0x04f4;
                case 11: goto L_0x04e4;
                case 12: goto L_0x04c0;
                case 13: goto L_0x04b0;
                case 14: goto L_0x04a0;
                case 15: goto L_0x0490;
                case 16: goto L_0x0480;
                case 17: goto L_0x044a;
                case 18: goto L_0x043c;
                case 19: goto L_0x042e;
                case 20: goto L_0x0420;
                case 21: goto L_0x0412;
                case 22: goto L_0x0404;
                case 23: goto L_0x03f6;
                case 24: goto L_0x03e8;
                case 25: goto L_0x03da;
                case 26: goto L_0x03b7;
                case 27: goto L_0x03a1;
                case 28: goto L_0x0393;
                case 29: goto L_0x0385;
                case 30: goto L_0x036f;
                case 31: goto L_0x0361;
                case 32: goto L_0x0353;
                case 33: goto L_0x0345;
                case 34: goto L_0x0337;
                case 35: goto L_0x0329;
                case 36: goto L_0x031b;
                case 37: goto L_0x030d;
                case 38: goto L_0x02ff;
                case 39: goto L_0x02f1;
                case 40: goto L_0x02e3;
                case 41: goto L_0x02d5;
                case 42: goto L_0x02c7;
                case 43: goto L_0x02b9;
                case 44: goto L_0x02a3;
                case 45: goto L_0x0295;
                case 46: goto L_0x0287;
                case 47: goto L_0x0279;
                case 48: goto L_0x026b;
                case 49: goto L_0x0256;
                case 50: goto L_0x0212;
                case 51: goto L_0x01ff;
                case 52: goto L_0x01ec;
                case 53: goto L_0x01d9;
                case 54: goto L_0x01c6;
                case 55: goto L_0x01b3;
                case 56: goto L_0x01a0;
                case 57: goto L_0x018d;
                case 58: goto L_0x017a;
                case 59: goto L_0x0172;
                case 60: goto L_0x013c;
                case 61: goto L_0x012d;
                case 62: goto L_0x011a;
                case 63: goto L_0x00f3;
                case 64: goto L_0x00e0;
                case 65: goto L_0x00cd;
                case 66: goto L_0x00ba;
                case 67: goto L_0x00a7;
                case 68: goto L_0x0093;
                default: goto L_0x008b;
            }
        L_0x008b:
            if (r10 != 0) goto L_0x05c2
            java.lang.Object r10 = r8.zzbhy()     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x05c2
        L_0x0093:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzeiv r6 = r12.zzhf(r3)     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Object r6 = r14.zzb(r6, r15)     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x00a7:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzehc -> 0x05e1 }
            long r6 = r14.zzbeh()     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x00ba:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzehc -> 0x05e1 }
            int r6 = r14.zzbeg()     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x00cd:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzehc -> 0x05e1 }
            long r6 = r14.zzbef()     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x00e0:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzehc -> 0x05e1 }
            int r6 = r14.zzbee()     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x00f3:
            int r5 = r14.zzbed()     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzegw r7 = r12.zzhh(r3)     // Catch:{ zzehc -> 0x05e1 }
            if (r7 == 0) goto L_0x010b
            boolean r7 = r7.zzi(r5)     // Catch:{ zzehc -> 0x05e1 }
            if (r7 == 0) goto L_0x0104
            goto L_0x010b
        L_0x0104:
            java.lang.Object r10 = com.google.android.gms.internal.ads.zzeix.zza((int) r2, (int) r5, r10, r8)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x010b:
            r4 = r4 & r6
            long r6 = (long) r4     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r6, (java.lang.Object) r4)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x011a:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzehc -> 0x05e1 }
            int r6 = r14.zzbec()     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x012d:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzeff r6 = r14.zzbeb()     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x013c:
            boolean r5 = r12.zza(r13, (int) r2, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            if (r5 == 0) goto L_0x015b
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Object r6 = com.google.android.gms.internal.ads.zzejt.zzp(r13, r4)     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzeiv r7 = r12.zzhf(r3)     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Object r7 = r14.zza(r7, r15)     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Object r6 = com.google.android.gms.internal.ads.zzegr.zze(r6, r7)     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x016d
        L_0x015b:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzeiv r6 = r12.zzhf(r3)     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Object r6 = r14.zza(r6, r15)     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzf(r13, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
        L_0x016d:
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x0172:
            r12.zza((java.lang.Object) r13, (int) r4, (com.google.android.gms.internal.ads.zzeip) r14)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x017a:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzehc -> 0x05e1 }
            boolean r6 = r14.zzbdz()     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x018d:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzehc -> 0x05e1 }
            int r6 = r14.zzbdy()     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x01a0:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzehc -> 0x05e1 }
            long r6 = r14.zzbdx()     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x01b3:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzehc -> 0x05e1 }
            int r6 = r14.zzbdw()     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x01c6:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzehc -> 0x05e1 }
            long r6 = r14.zzbdu()     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x01d9:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzehc -> 0x05e1 }
            long r6 = r14.zzbdv()     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x01ec:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzehc -> 0x05e1 }
            float r6 = r14.readFloat()     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x01ff:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzehc -> 0x05e1 }
            double r6 = r14.readDouble()     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x0212:
            java.lang.Object r2 = r12.zzhg(r3)     // Catch:{ zzehc -> 0x05e1 }
            int r3 = r12.zzhi(r3)     // Catch:{ zzehc -> 0x05e1 }
            r3 = r3 & r6
            long r3 = (long) r3     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzejt.zzp(r13, r3)     // Catch:{ zzehc -> 0x05e1 }
            if (r5 != 0) goto L_0x022d
            com.google.android.gms.internal.ads.zzehw r5 = r12.zziiq     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Object r5 = r5.zzas(r2)     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x0245
        L_0x022d:
            com.google.android.gms.internal.ads.zzehw r6 = r12.zziiq     // Catch:{ zzehc -> 0x05e1 }
            boolean r6 = r6.zzaq(r5)     // Catch:{ zzehc -> 0x05e1 }
            if (r6 == 0) goto L_0x0245
            com.google.android.gms.internal.ads.zzehw r6 = r12.zziiq     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Object r6 = r6.zzas(r2)     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzehw r7 = r12.zziiq     // Catch:{ zzehc -> 0x05e1 }
            r7.zzf(r6, r5)     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r3, (java.lang.Object) r6)     // Catch:{ zzehc -> 0x05e1 }
            r5 = r6
        L_0x0245:
            com.google.android.gms.internal.ads.zzehw r3 = r12.zziiq     // Catch:{ zzehc -> 0x05e1 }
            java.util.Map r3 = r3.zzan(r5)     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzehw r4 = r12.zziiq     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzehu r2 = r4.zzao(r2)     // Catch:{ zzehc -> 0x05e1 }
            r14.zza(r3, r2, (com.google.android.gms.internal.ads.zzegc) r15)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x0256:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzeiv r2 = r12.zzhf(r3)     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzehj r3 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r3 = r3.zza(r13, r4)     // Catch:{ zzehc -> 0x05e1 }
            r14.zzb(r3, r2, r15)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x026b:
            com.google.android.gms.internal.ads.zzehj r2 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzehc -> 0x05e1 }
            r14.zzz(r2)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x0279:
            com.google.android.gms.internal.ads.zzehj r2 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzehc -> 0x05e1 }
            r14.zzy(r2)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x0287:
            com.google.android.gms.internal.ads.zzehj r2 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzehc -> 0x05e1 }
            r14.zzx(r2)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x0295:
            com.google.android.gms.internal.ads.zzehj r2 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzehc -> 0x05e1 }
            r14.zzw(r2)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x02a3:
            com.google.android.gms.internal.ads.zzehj r5 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            r4 = r4 & r6
            long r6 = (long) r4     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r4 = r5.zza(r13, r6)     // Catch:{ zzehc -> 0x05e1 }
            r14.zzv(r4)     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzegw r3 = r12.zzhh(r3)     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Object r10 = com.google.android.gms.internal.ads.zzeix.zza(r2, r4, r3, r10, r8)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x02b9:
            com.google.android.gms.internal.ads.zzehj r2 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzehc -> 0x05e1 }
            r14.zzu(r2)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x02c7:
            com.google.android.gms.internal.ads.zzehj r2 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzehc -> 0x05e1 }
            r14.zzr(r2)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x02d5:
            com.google.android.gms.internal.ads.zzehj r2 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzehc -> 0x05e1 }
            r14.zzq(r2)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x02e3:
            com.google.android.gms.internal.ads.zzehj r2 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzehc -> 0x05e1 }
            r14.zzp(r2)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x02f1:
            com.google.android.gms.internal.ads.zzehj r2 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzehc -> 0x05e1 }
            r14.zzo(r2)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x02ff:
            com.google.android.gms.internal.ads.zzehj r2 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzehc -> 0x05e1 }
            r14.zzm(r2)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x030d:
            com.google.android.gms.internal.ads.zzehj r2 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzehc -> 0x05e1 }
            r14.zzn(r2)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x031b:
            com.google.android.gms.internal.ads.zzehj r2 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzehc -> 0x05e1 }
            r14.zzl(r2)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x0329:
            com.google.android.gms.internal.ads.zzehj r2 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzehc -> 0x05e1 }
            r14.zzk(r2)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x0337:
            com.google.android.gms.internal.ads.zzehj r2 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzehc -> 0x05e1 }
            r14.zzz(r2)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x0345:
            com.google.android.gms.internal.ads.zzehj r2 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzehc -> 0x05e1 }
            r14.zzy(r2)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x0353:
            com.google.android.gms.internal.ads.zzehj r2 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzehc -> 0x05e1 }
            r14.zzx(r2)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x0361:
            com.google.android.gms.internal.ads.zzehj r2 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzehc -> 0x05e1 }
            r14.zzw(r2)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x036f:
            com.google.android.gms.internal.ads.zzehj r5 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            r4 = r4 & r6
            long r6 = (long) r4     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r4 = r5.zza(r13, r6)     // Catch:{ zzehc -> 0x05e1 }
            r14.zzv(r4)     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzegw r3 = r12.zzhh(r3)     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Object r10 = com.google.android.gms.internal.ads.zzeix.zza(r2, r4, r3, r10, r8)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x0385:
            com.google.android.gms.internal.ads.zzehj r2 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzehc -> 0x05e1 }
            r14.zzu(r2)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x0393:
            com.google.android.gms.internal.ads.zzehj r2 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzehc -> 0x05e1 }
            r14.zzt(r2)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x03a1:
            com.google.android.gms.internal.ads.zzeiv r2 = r12.zzhf(r3)     // Catch:{ zzehc -> 0x05e1 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzehj r5 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r3 = r5.zza(r13, r3)     // Catch:{ zzehc -> 0x05e1 }
            r14.zza(r3, r2, (com.google.android.gms.internal.ads.zzegc) r15)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x03b7:
            boolean r2 = zzhk(r4)     // Catch:{ zzehc -> 0x05e1 }
            if (r2 == 0) goto L_0x03cc
            com.google.android.gms.internal.ads.zzehj r2 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzehc -> 0x05e1 }
            r14.zzs(r2)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x03cc:
            com.google.android.gms.internal.ads.zzehj r2 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzehc -> 0x05e1 }
            r14.readStringList(r2)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x03da:
            com.google.android.gms.internal.ads.zzehj r2 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzehc -> 0x05e1 }
            r14.zzr(r2)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x03e8:
            com.google.android.gms.internal.ads.zzehj r2 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzehc -> 0x05e1 }
            r14.zzq(r2)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x03f6:
            com.google.android.gms.internal.ads.zzehj r2 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzehc -> 0x05e1 }
            r14.zzp(r2)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x0404:
            com.google.android.gms.internal.ads.zzehj r2 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzehc -> 0x05e1 }
            r14.zzo(r2)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x0412:
            com.google.android.gms.internal.ads.zzehj r2 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzehc -> 0x05e1 }
            r14.zzm(r2)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x0420:
            com.google.android.gms.internal.ads.zzehj r2 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzehc -> 0x05e1 }
            r14.zzn(r2)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x042e:
            com.google.android.gms.internal.ads.zzehj r2 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzehc -> 0x05e1 }
            r14.zzl(r2)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x043c:
            com.google.android.gms.internal.ads.zzehj r2 = r12.zziin     // Catch:{ zzehc -> 0x05e1 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzehc -> 0x05e1 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzehc -> 0x05e1 }
            r14.zzk(r2)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x044a:
            boolean r2 = r12.zze(r13, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            if (r2 == 0) goto L_0x046b
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzejt.zzp(r13, r4)     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzeiv r3 = r12.zzhf(r3)     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Object r3 = r14.zzb(r3, r15)     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzegr.zze(r2, r3)     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r2)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x046b:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzeiv r2 = r12.zzhf(r3)     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Object r2 = r14.zzb(r2, r15)     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r2)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzf(r13, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x0480:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzehc -> 0x05e1 }
            long r6 = r14.zzbeh()     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r4, (long) r6)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzf(r13, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x0490:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzehc -> 0x05e1 }
            int r2 = r14.zzbeg()     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zzb((java.lang.Object) r13, (long) r4, (int) r2)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzf(r13, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x04a0:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzehc -> 0x05e1 }
            long r6 = r14.zzbef()     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r4, (long) r6)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzf(r13, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x04b0:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzehc -> 0x05e1 }
            int r2 = r14.zzbee()     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zzb((java.lang.Object) r13, (long) r4, (int) r2)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzf(r13, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x04c0:
            int r5 = r14.zzbed()     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzegw r7 = r12.zzhh(r3)     // Catch:{ zzehc -> 0x05e1 }
            if (r7 == 0) goto L_0x04d8
            boolean r7 = r7.zzi(r5)     // Catch:{ zzehc -> 0x05e1 }
            if (r7 == 0) goto L_0x04d1
            goto L_0x04d8
        L_0x04d1:
            java.lang.Object r10 = com.google.android.gms.internal.ads.zzeix.zza((int) r2, (int) r5, r10, r8)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x04d8:
            r2 = r4 & r6
            long r6 = (long) r2     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zzb((java.lang.Object) r13, (long) r6, (int) r5)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzf(r13, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x04e4:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzehc -> 0x05e1 }
            int r2 = r14.zzbec()     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zzb((java.lang.Object) r13, (long) r4, (int) r2)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzf(r13, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x04f4:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzeff r2 = r14.zzbeb()     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r2)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzf(r13, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x0504:
            boolean r2 = r12.zze(r13, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            if (r2 == 0) goto L_0x0525
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzejt.zzp(r13, r4)     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzeiv r3 = r12.zzhf(r3)     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Object r3 = r14.zza(r3, r15)     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzegr.zze(r2, r3)     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r2)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x0525:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzeiv r2 = r12.zzhf(r3)     // Catch:{ zzehc -> 0x05e1 }
            java.lang.Object r2 = r14.zza(r2, r15)     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r2)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzf(r13, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x053a:
            r12.zza((java.lang.Object) r13, (int) r4, (com.google.android.gms.internal.ads.zzeip) r14)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzf(r13, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x0542:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzehc -> 0x05e1 }
            boolean r2 = r14.zzbdz()     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r4, (boolean) r2)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzf(r13, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x0552:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzehc -> 0x05e1 }
            int r2 = r14.zzbdy()     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zzb((java.lang.Object) r13, (long) r4, (int) r2)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzf(r13, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x0562:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzehc -> 0x05e1 }
            long r6 = r14.zzbdx()     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r4, (long) r6)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzf(r13, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x0572:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzehc -> 0x05e1 }
            int r2 = r14.zzbdw()     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zzb((java.lang.Object) r13, (long) r4, (int) r2)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzf(r13, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x0582:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzehc -> 0x05e1 }
            long r6 = r14.zzbdu()     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r4, (long) r6)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzf(r13, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x0592:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzehc -> 0x05e1 }
            long r6 = r14.zzbdv()     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r4, (long) r6)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzf(r13, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x05a2:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzehc -> 0x05e1 }
            float r2 = r14.readFloat()     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r4, (float) r2)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzf(r13, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x05b2:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzehc -> 0x05e1 }
            double r6 = r14.readDouble()     // Catch:{ zzehc -> 0x05e1 }
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r13, (long) r4, (double) r6)     // Catch:{ zzehc -> 0x05e1 }
            r12.zzf(r13, (int) r3)     // Catch:{ zzehc -> 0x05e1 }
            goto L_0x000a
        L_0x05c2:
            boolean r2 = r8.zza(r10, (com.google.android.gms.internal.ads.zzeip) r14)     // Catch:{ zzehc -> 0x05e1 }
            if (r2 != 0) goto L_0x05df
            int r14 = r12.zziik
        L_0x05ca:
            int r15 = r12.zziil
            if (r14 >= r15) goto L_0x05d9
            int[] r15 = r12.zziij
            r15 = r15[r14]
            java.lang.Object r10 = r12.zza((java.lang.Object) r13, (int) r15, r10, r8)
            int r14 = r14 + 1
            goto L_0x05ca
        L_0x05d9:
            if (r10 == 0) goto L_0x05de
            r8.zzj(r13, r10)
        L_0x05de:
            return
        L_0x05df:
            goto L_0x000a
        L_0x05e1:
            r2 = move-exception
            r8.zza(r14)     // Catch:{ all -> 0x060b }
            if (r10 != 0) goto L_0x05ec
            java.lang.Object r2 = r8.zzay(r13)     // Catch:{ all -> 0x060b }
            r10 = r2
        L_0x05ec:
            boolean r2 = r8.zza(r10, (com.google.android.gms.internal.ads.zzeip) r14)     // Catch:{ all -> 0x060b }
            if (r2 != 0) goto L_0x0609
            int r14 = r12.zziik
        L_0x05f4:
            int r15 = r12.zziil
            if (r14 >= r15) goto L_0x0603
            int[] r15 = r12.zziij
            r15 = r15[r14]
            java.lang.Object r10 = r12.zza((java.lang.Object) r13, (int) r15, r10, r8)
            int r14 = r14 + 1
            goto L_0x05f4
        L_0x0603:
            if (r10 == 0) goto L_0x0608
            r8.zzj(r13, r10)
        L_0x0608:
            return
        L_0x0609:
            goto L_0x000a
        L_0x060b:
            r14 = move-exception
            int r15 = r12.zziik
        L_0x060e:
            int r0 = r12.zziil
            if (r15 >= r0) goto L_0x061d
            int[] r0 = r12.zziij
            r0 = r0[r15]
            java.lang.Object r10 = r12.zza((java.lang.Object) r13, (int) r0, r10, r8)
            int r15 = r15 + 1
            goto L_0x060e
        L_0x061d:
            if (r10 == 0) goto L_0x0622
            r8.zzj(r13, r10)
        L_0x0622:
            throw r14
        L_0x0623:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeid.zza(java.lang.Object, com.google.android.gms.internal.ads.zzeip, com.google.android.gms.internal.ads.zzegc):void");
    }

    private static zzejq zzau(Object obj) {
        zzegp zzegp = (zzegp) obj;
        zzejq zzejq = zzegp.zzifo;
        if (zzejq != zzejq.zzbhz()) {
            return zzejq;
        }
        zzejq zzbia = zzejq.zzbia();
        zzegp.zzifo = zzbia;
        return zzbia;
    }

    private static int zza(byte[] bArr, int i, int i2, zzeke zzeke, Class<?> cls, zzefa zzefa) throws IOException {
        switch (zzeig.zzicc[zzeke.ordinal()]) {
            case 1:
                int zzb = zzefb.zzb(bArr, i, zzefa);
                zzefa.zziay = Boolean.valueOf(zzefa.zziax != 0);
                return zzb;
            case 2:
                return zzefb.zze(bArr, i, zzefa);
            case 3:
                zzefa.zziay = Double.valueOf(zzefb.zzi(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzefa.zziay = Integer.valueOf(zzefb.zzg(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzefa.zziay = Long.valueOf(zzefb.zzh(bArr, i));
                return i + 8;
            case 8:
                zzefa.zziay = Float.valueOf(zzefb.zzj(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int zza = zzefb.zza(bArr, i, zzefa);
                zzefa.zziay = Integer.valueOf(zzefa.zziaw);
                return zza;
            case 12:
            case 13:
                int zzb2 = zzefb.zzb(bArr, i, zzefa);
                zzefa.zziay = Long.valueOf(zzefa.zziax);
                return zzb2;
            case 14:
                return zzefb.zza((zzeiv) zzeio.zzbhg().zzh(cls), bArr, i, i2, zzefa);
            case 15:
                int zza2 = zzefb.zza(bArr, i, zzefa);
                zzefa.zziay = Integer.valueOf(zzefq.zzgc(zzefa.zziaw));
                return zza2;
            case 16:
                int zzb3 = zzefb.zzb(bArr, i, zzefa);
                zzefa.zziay = Long.valueOf(zzefq.zzfh(zzefa.zziax));
                return zzb3;
            case 17:
                return zzefb.zzd(bArr, i, zzefa);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzefa zzefa) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i12 = i;
        int i13 = i2;
        int i14 = i3;
        int i15 = i5;
        int i16 = i6;
        long j3 = j2;
        zzefa zzefa2 = zzefa;
        zzeha zzeha = (zzeha) zzhop.getObject(t2, j3);
        if (!zzeha.zzbdf()) {
            int size = zzeha.size();
            zzeha = zzeha.zzft(size == 0 ? 10 : size << 1);
            zzhop.putObject(t2, j3, zzeha);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i15 == 2) {
                    zzega zzega = (zzega) zzeha;
                    int zza = zzefb.zza(bArr2, i12, zzefa2);
                    int i17 = zzefa2.zziaw + zza;
                    while (zza < i17) {
                        zzega.zzd(zzefb.zzi(bArr2, zza));
                        zza += 8;
                    }
                    if (zza == i17) {
                        return zza;
                    }
                    throw zzegz.zzbgb();
                } else if (i15 == 1) {
                    zzega zzega2 = (zzega) zzeha;
                    zzega2.zzd(zzefb.zzi(bArr, i));
                    int i18 = i12 + 8;
                    while (i18 < i13) {
                        int zza2 = zzefb.zza(bArr2, i18, zzefa2);
                        if (i14 != zzefa2.zziaw) {
                            return i18;
                        }
                        zzega2.zzd(zzefb.zzi(bArr2, zza2));
                        i18 = zza2 + 8;
                    }
                    return i18;
                }
                break;
            case 19:
            case 36:
                if (i15 == 2) {
                    zzego zzego = (zzego) zzeha;
                    int zza3 = zzefb.zza(bArr2, i12, zzefa2);
                    int i19 = zzefa2.zziaw + zza3;
                    while (zza3 < i19) {
                        zzego.zzh(zzefb.zzj(bArr2, zza3));
                        zza3 += 4;
                    }
                    if (zza3 == i19) {
                        return zza3;
                    }
                    throw zzegz.zzbgb();
                } else if (i15 == 5) {
                    zzego zzego2 = (zzego) zzeha;
                    zzego2.zzh(zzefb.zzj(bArr, i));
                    int i20 = i12 + 4;
                    while (i20 < i13) {
                        int zza4 = zzefb.zza(bArr2, i20, zzefa2);
                        if (i14 != zzefa2.zziaw) {
                            return i20;
                        }
                        zzego2.zzh(zzefb.zzj(bArr2, zza4));
                        i20 = zza4 + 4;
                    }
                    return i20;
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i15 == 2) {
                    zzehn zzehn = (zzehn) zzeha;
                    int zza5 = zzefb.zza(bArr2, i12, zzefa2);
                    int i21 = zzefa2.zziaw + zza5;
                    while (zza5 < i21) {
                        zza5 = zzefb.zzb(bArr2, zza5, zzefa2);
                        zzehn.zzfs(zzefa2.zziax);
                    }
                    if (zza5 == i21) {
                        return zza5;
                    }
                    throw zzegz.zzbgb();
                } else if (i15 == 0) {
                    zzehn zzehn2 = (zzehn) zzeha;
                    int zzb = zzefb.zzb(bArr2, i12, zzefa2);
                    zzehn2.zzfs(zzefa2.zziax);
                    while (zzb < i13) {
                        int zza6 = zzefb.zza(bArr2, zzb, zzefa2);
                        if (i14 != zzefa2.zziaw) {
                            return zzb;
                        }
                        zzb = zzefb.zzb(bArr2, zza6, zzefa2);
                        zzehn2.zzfs(zzefa2.zziax);
                    }
                    return zzb;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i15 == 2) {
                    return zzefb.zza(bArr2, i12, (zzeha<?>) zzeha, zzefa2);
                }
                if (i15 == 0) {
                    return zzefb.zza(i3, bArr, i, i2, (zzeha<?>) zzeha, zzefa);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i15 == 2) {
                    zzehn zzehn3 = (zzehn) zzeha;
                    int zza7 = zzefb.zza(bArr2, i12, zzefa2);
                    int i22 = zzefa2.zziaw + zza7;
                    while (zza7 < i22) {
                        zzehn3.zzfs(zzefb.zzh(bArr2, zza7));
                        zza7 += 8;
                    }
                    if (zza7 == i22) {
                        return zza7;
                    }
                    throw zzegz.zzbgb();
                } else if (i15 == 1) {
                    zzehn zzehn4 = (zzehn) zzeha;
                    zzehn4.zzfs(zzefb.zzh(bArr, i));
                    int i23 = i12 + 8;
                    while (i23 < i13) {
                        int zza8 = zzefb.zza(bArr2, i23, zzefa2);
                        if (i14 != zzefa2.zziaw) {
                            return i23;
                        }
                        zzehn4.zzfs(zzefb.zzh(bArr2, zza8));
                        i23 = zza8 + 8;
                    }
                    return i23;
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i15 == 2) {
                    zzegs zzegs = (zzegs) zzeha;
                    int zza9 = zzefb.zza(bArr2, i12, zzefa2);
                    int i24 = zzefa2.zziaw + zza9;
                    while (zza9 < i24) {
                        zzegs.zzhc(zzefb.zzg(bArr2, zza9));
                        zza9 += 4;
                    }
                    if (zza9 == i24) {
                        return zza9;
                    }
                    throw zzegz.zzbgb();
                } else if (i15 == 5) {
                    zzegs zzegs2 = (zzegs) zzeha;
                    zzegs2.zzhc(zzefb.zzg(bArr, i));
                    int i25 = i12 + 4;
                    while (i25 < i13) {
                        int zza10 = zzefb.zza(bArr2, i25, zzefa2);
                        if (i14 != zzefa2.zziaw) {
                            return i25;
                        }
                        zzegs2.zzhc(zzefb.zzg(bArr2, zza10));
                        i25 = zza10 + 4;
                    }
                    return i25;
                }
                break;
            case 25:
            case 42:
                if (i15 == 2) {
                    zzefd zzefd = (zzefd) zzeha;
                    int zza11 = zzefb.zza(bArr2, i12, zzefa2);
                    int i26 = zzefa2.zziaw + zza11;
                    while (zza11 < i26) {
                        zza11 = zzefb.zzb(bArr2, zza11, zzefa2);
                        zzefd.addBoolean(zzefa2.zziax != 0);
                    }
                    if (zza11 == i26) {
                        return zza11;
                    }
                    throw zzegz.zzbgb();
                } else if (i15 == 0) {
                    zzefd zzefd2 = (zzefd) zzeha;
                    int zzb2 = zzefb.zzb(bArr2, i12, zzefa2);
                    zzefd2.addBoolean(zzefa2.zziax != 0);
                    while (zzb2 < i13) {
                        int zza12 = zzefb.zza(bArr2, zzb2, zzefa2);
                        if (i14 != zzefa2.zziaw) {
                            return zzb2;
                        }
                        zzb2 = zzefb.zzb(bArr2, zza12, zzefa2);
                        zzefd2.addBoolean(zzefa2.zziax != 0);
                    }
                    return zzb2;
                }
                break;
            case 26:
                if (i15 == 2) {
                    if ((j & 536870912) == 0) {
                        int zza13 = zzefb.zza(bArr2, i12, zzefa2);
                        int i27 = zzefa2.zziaw;
                        if (i27 >= 0) {
                            if (i27 == 0) {
                                zzeha.add("");
                            } else {
                                zzeha.add(new String(bArr2, zza13, i27, zzegr.UTF_8));
                                zza13 += i27;
                            }
                            while (i9 < i13) {
                                int zza14 = zzefb.zza(bArr2, i9, zzefa2);
                                if (i14 != zzefa2.zziaw) {
                                    return i9;
                                }
                                i9 = zzefb.zza(bArr2, zza14, zzefa2);
                                int i28 = zzefa2.zziaw;
                                if (i28 < 0) {
                                    throw zzegz.zzbgc();
                                } else if (i28 == 0) {
                                    zzeha.add("");
                                } else {
                                    zzeha.add(new String(bArr2, i9, i28, zzegr.UTF_8));
                                    i9 += i28;
                                }
                            }
                            return i9;
                        }
                        throw zzegz.zzbgc();
                    }
                    int zza15 = zzefb.zza(bArr2, i12, zzefa2);
                    int i29 = zzefa2.zziaw;
                    if (i29 >= 0) {
                        if (i29 == 0) {
                            zzeha.add("");
                        } else {
                            int i30 = zza15 + i29;
                            if (zzejw.zzm(bArr2, zza15, i30)) {
                                zzeha.add(new String(bArr2, zza15, i29, zzegr.UTF_8));
                                zza15 = i30;
                            } else {
                                throw zzegz.zzbgj();
                            }
                        }
                        while (i8 < i13) {
                            int zza16 = zzefb.zza(bArr2, i8, zzefa2);
                            if (i14 != zzefa2.zziaw) {
                                return i8;
                            }
                            i8 = zzefb.zza(bArr2, zza16, zzefa2);
                            int i31 = zzefa2.zziaw;
                            if (i31 < 0) {
                                throw zzegz.zzbgc();
                            } else if (i31 == 0) {
                                zzeha.add("");
                            } else {
                                int i32 = i8 + i31;
                                if (zzejw.zzm(bArr2, i8, i32)) {
                                    zzeha.add(new String(bArr2, i8, i31, zzegr.UTF_8));
                                    i8 = i32;
                                } else {
                                    throw zzegz.zzbgj();
                                }
                            }
                        }
                        return i8;
                    }
                    throw zzegz.zzbgc();
                }
                break;
            case 27:
                if (i15 == 2) {
                    return zzefb.zza(zzhf(i16), i3, bArr, i, i2, zzeha, zzefa);
                }
                break;
            case 28:
                if (i15 == 2) {
                    int zza17 = zzefb.zza(bArr2, i12, zzefa2);
                    int i33 = zzefa2.zziaw;
                    if (i33 < 0) {
                        throw zzegz.zzbgc();
                    } else if (i33 <= bArr2.length - zza17) {
                        if (i33 == 0) {
                            zzeha.add(zzeff.zzibd);
                        } else {
                            zzeha.add(zzeff.zzi(bArr2, zza17, i33));
                            zza17 += i33;
                        }
                        while (i10 < i13) {
                            int zza18 = zzefb.zza(bArr2, i10, zzefa2);
                            if (i14 != zzefa2.zziaw) {
                                return i10;
                            }
                            i10 = zzefb.zza(bArr2, zza18, zzefa2);
                            int i34 = zzefa2.zziaw;
                            if (i34 < 0) {
                                throw zzegz.zzbgc();
                            } else if (i34 > bArr2.length - i10) {
                                throw zzegz.zzbgb();
                            } else if (i34 == 0) {
                                zzeha.add(zzeff.zzibd);
                            } else {
                                zzeha.add(zzeff.zzi(bArr2, i10, i34));
                                i10 += i34;
                            }
                        }
                        return i10;
                    } else {
                        throw zzegz.zzbgb();
                    }
                }
                break;
            case 30:
            case 44:
                if (i15 == 2) {
                    i11 = zzefb.zza(bArr2, i12, (zzeha<?>) zzeha, zzefa2);
                } else if (i15 == 0) {
                    i11 = zzefb.zza(i3, bArr, i, i2, (zzeha<?>) zzeha, zzefa);
                }
                zzegp zzegp = (zzegp) t2;
                zzejq zzejq = zzegp.zzifo;
                if (zzejq == zzejq.zzbhz()) {
                    zzejq = null;
                }
                zzejq zzejq2 = (zzejq) zzeix.zza(i4, zzeha, zzhh(i16), zzejq, this.zziio);
                if (zzejq2 != null) {
                    zzegp.zzifo = zzejq2;
                }
                return i11;
            case 33:
            case 47:
                if (i15 == 2) {
                    zzegs zzegs3 = (zzegs) zzeha;
                    int zza19 = zzefb.zza(bArr2, i12, zzefa2);
                    int i35 = zzefa2.zziaw + zza19;
                    while (zza19 < i35) {
                        zza19 = zzefb.zza(bArr2, zza19, zzefa2);
                        zzegs3.zzhc(zzefq.zzgc(zzefa2.zziaw));
                    }
                    if (zza19 == i35) {
                        return zza19;
                    }
                    throw zzegz.zzbgb();
                } else if (i15 == 0) {
                    zzegs zzegs4 = (zzegs) zzeha;
                    int zza20 = zzefb.zza(bArr2, i12, zzefa2);
                    zzegs4.zzhc(zzefq.zzgc(zzefa2.zziaw));
                    while (zza20 < i13) {
                        int zza21 = zzefb.zza(bArr2, zza20, zzefa2);
                        if (i14 != zzefa2.zziaw) {
                            return zza20;
                        }
                        zza20 = zzefb.zza(bArr2, zza21, zzefa2);
                        zzegs4.zzhc(zzefq.zzgc(zzefa2.zziaw));
                    }
                    return zza20;
                }
                break;
            case 34:
            case 48:
                if (i15 == 2) {
                    zzehn zzehn5 = (zzehn) zzeha;
                    int zza22 = zzefb.zza(bArr2, i12, zzefa2);
                    int i36 = zzefa2.zziaw + zza22;
                    while (zza22 < i36) {
                        zza22 = zzefb.zzb(bArr2, zza22, zzefa2);
                        zzehn5.zzfs(zzefq.zzfh(zzefa2.zziax));
                    }
                    if (zza22 == i36) {
                        return zza22;
                    }
                    throw zzegz.zzbgb();
                } else if (i15 == 0) {
                    zzehn zzehn6 = (zzehn) zzeha;
                    int zzb3 = zzefb.zzb(bArr2, i12, zzefa2);
                    zzehn6.zzfs(zzefq.zzfh(zzefa2.zziax));
                    while (zzb3 < i13) {
                        int zza23 = zzefb.zza(bArr2, zzb3, zzefa2);
                        if (i14 != zzefa2.zziaw) {
                            return zzb3;
                        }
                        zzb3 = zzefb.zzb(bArr2, zza23, zzefa2);
                        zzehn6.zzfs(zzefq.zzfh(zzefa2.zziax));
                    }
                    return zzb3;
                }
                break;
            case 49:
                if (i15 == 3) {
                    zzeiv zzhf = zzhf(i16);
                    int i37 = (i14 & -8) | 4;
                    int zza24 = zzefb.zza(zzhf, bArr, i, i2, i37, zzefa);
                    zzeha.add(zzefa2.zziay);
                    while (zza24 < i13) {
                        int zza25 = zzefb.zza(bArr2, zza24, zzefa2);
                        if (i14 != zzefa2.zziaw) {
                            return zza24;
                        }
                        zza24 = zzefb.zza(zzhf, bArr, zza25, i2, i37, zzefa);
                        zzeha.add(zzefa2.zziay);
                    }
                    return zza24;
                }
                break;
        }
        return i12;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <K, V> int zza(T r8, byte[] r9, int r10, int r11, int r12, long r13, com.google.android.gms.internal.ads.zzefa r15) throws java.io.IOException {
        /*
            r7 = this;
            sun.misc.Unsafe r0 = zzhop
            java.lang.Object r12 = r7.zzhg(r12)
            java.lang.Object r1 = r0.getObject(r8, r13)
            com.google.android.gms.internal.ads.zzehw r2 = r7.zziiq
            boolean r2 = r2.zzaq(r1)
            if (r2 == 0) goto L_0x0022
            com.google.android.gms.internal.ads.zzehw r2 = r7.zziiq
            java.lang.Object r2 = r2.zzas(r12)
            com.google.android.gms.internal.ads.zzehw r3 = r7.zziiq
            r3.zzf(r2, r1)
            r0.putObject(r8, r13, r2)
            r1 = r2
        L_0x0022:
            com.google.android.gms.internal.ads.zzehw r8 = r7.zziiq
            com.google.android.gms.internal.ads.zzehu r8 = r8.zzao(r12)
            com.google.android.gms.internal.ads.zzehw r12 = r7.zziiq
            java.util.Map r12 = r12.zzan(r1)
            int r10 = com.google.android.gms.internal.ads.zzefb.zza(r9, r10, r15)
            int r13 = r15.zziaw
            if (r13 < 0) goto L_0x009c
            int r14 = r11 - r10
            if (r13 > r14) goto L_0x009c
            int r13 = r13 + r10
            K r14 = r8.zzihv
            V r0 = r8.zzckv
        L_0x0040:
            if (r10 >= r13) goto L_0x0090
            int r1 = r10 + 1
            byte r10 = r9[r10]
            if (r10 >= 0) goto L_0x0050
            int r1 = com.google.android.gms.internal.ads.zzefb.zza((int) r10, (byte[]) r9, (int) r1, (com.google.android.gms.internal.ads.zzefa) r15)
            int r10 = r15.zziaw
            r2 = r1
            goto L_0x0051
        L_0x0050:
            r2 = r1
        L_0x0051:
            int r1 = r10 >>> 3
            r3 = r10 & 7
            r4 = 1
            if (r1 == r4) goto L_0x0076
            r4 = 2
            if (r1 == r4) goto L_0x005c
            goto L_0x008b
        L_0x005c:
            com.google.android.gms.internal.ads.zzeke r1 = r8.zzihw
            int r1 = r1.zzbij()
            if (r3 != r1) goto L_0x008b
            com.google.android.gms.internal.ads.zzeke r4 = r8.zzihw
            V r10 = r8.zzckv
            java.lang.Class r5 = r10.getClass()
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = zza((byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.ads.zzeke) r4, (java.lang.Class<?>) r5, (com.google.android.gms.internal.ads.zzefa) r6)
            java.lang.Object r0 = r15.zziay
            goto L_0x0040
        L_0x0076:
            com.google.android.gms.internal.ads.zzeke r1 = r8.zzihu
            int r1 = r1.zzbij()
            if (r3 != r1) goto L_0x008b
            com.google.android.gms.internal.ads.zzeke r4 = r8.zzihu
            r5 = 0
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = zza((byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.ads.zzeke) r4, (java.lang.Class<?>) r5, (com.google.android.gms.internal.ads.zzefa) r6)
            java.lang.Object r14 = r15.zziay
            goto L_0x0040
        L_0x008b:
            int r10 = com.google.android.gms.internal.ads.zzefb.zza((int) r10, (byte[]) r9, (int) r2, (int) r11, (com.google.android.gms.internal.ads.zzefa) r15)
            goto L_0x0040
        L_0x0090:
            if (r10 != r13) goto L_0x0097
            r12.put(r14, r0)
            return r13
        L_0x0097:
            com.google.android.gms.internal.ads.zzegz r8 = com.google.android.gms.internal.ads.zzegz.zzbgi()
            throw r8
        L_0x009c:
            com.google.android.gms.internal.ads.zzegz r8 = com.google.android.gms.internal.ads.zzegz.zzbgb()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeid.zza(java.lang.Object, byte[], int, int, int, long, com.google.android.gms.internal.ads.zzefa):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a4, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zza(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.ads.zzefa r29) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = zzhop
            int[] r7 = r0.zziia
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x0193;
                case 52: goto L_0x0183;
                case 53: goto L_0x0173;
                case 54: goto L_0x0173;
                case 55: goto L_0x0163;
                case 56: goto L_0x0152;
                case 57: goto L_0x0142;
                case 58: goto L_0x0129;
                case 59: goto L_0x00f5;
                case 60: goto L_0x00c6;
                case 61: goto L_0x00b9;
                case 62: goto L_0x0163;
                case 63: goto L_0x008b;
                case 64: goto L_0x0142;
                case 65: goto L_0x0152;
                case 66: goto L_0x0076;
                case 67: goto L_0x0061;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x01a8
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x01a8
            r2 = r2 & -8
            r7 = r2 | 4
            com.google.android.gms.internal.ads.zzeiv r2 = r0.zzhf(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = com.google.android.gms.internal.ads.zzefb.zza((com.google.android.gms.internal.ads.zzeiv) r2, (byte[]) r3, (int) r4, (int) r5, (int) r6, (com.google.android.gms.internal.ads.zzefa) r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004c
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004d
        L_0x004c:
            r15 = 0
        L_0x004d:
            if (r15 != 0) goto L_0x0056
            java.lang.Object r3 = r11.zziay
            r12.putObject(r1, r9, r3)
            goto L_0x01a4
        L_0x0056:
            java.lang.Object r3 = r11.zziay
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzegr.zze(r15, r3)
            r12.putObject(r1, r9, r3)
            goto L_0x01a4
        L_0x0061:
            if (r5 != 0) goto L_0x01a8
            int r2 = com.google.android.gms.internal.ads.zzefb.zzb(r3, r4, r11)
            long r3 = r11.zziax
            long r3 = com.google.android.gms.internal.ads.zzefq.zzfh(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x01a4
        L_0x0076:
            if (r5 != 0) goto L_0x01a8
            int r2 = com.google.android.gms.internal.ads.zzefb.zza(r3, r4, r11)
            int r3 = r11.zziaw
            int r3 = com.google.android.gms.internal.ads.zzefq.zzgc(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x01a4
        L_0x008b:
            if (r5 != 0) goto L_0x01a8
            int r3 = com.google.android.gms.internal.ads.zzefb.zza(r3, r4, r11)
            int r4 = r11.zziaw
            com.google.android.gms.internal.ads.zzegw r5 = r0.zzhh(r6)
            if (r5 == 0) goto L_0x00af
            boolean r5 = r5.zzi(r4)
            if (r5 == 0) goto L_0x00a0
            goto L_0x00af
        L_0x00a0:
            com.google.android.gms.internal.ads.zzejq r1 = zzau(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.zzd(r2, r4)
            r2 = r3
            goto L_0x01a9
        L_0x00af:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x01a4
        L_0x00b9:
            if (r5 != r15) goto L_0x01a8
            int r2 = com.google.android.gms.internal.ads.zzefb.zze(r3, r4, r11)
            java.lang.Object r3 = r11.zziay
            r12.putObject(r1, r9, r3)
            goto L_0x01a4
        L_0x00c6:
            if (r5 != r15) goto L_0x01a8
            com.google.android.gms.internal.ads.zzeiv r2 = r0.zzhf(r6)
            r5 = r20
            int r2 = com.google.android.gms.internal.ads.zzefb.zza((com.google.android.gms.internal.ads.zzeiv) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.ads.zzefa) r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00de
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00df
        L_0x00de:
            r15 = 0
        L_0x00df:
            if (r15 != 0) goto L_0x00e7
            java.lang.Object r3 = r11.zziay
            r12.putObject(r1, r9, r3)
            goto L_0x00f0
        L_0x00e7:
            java.lang.Object r3 = r11.zziay
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzegr.zze(r15, r3)
            r12.putObject(r1, r9, r3)
        L_0x00f0:
            r12.putInt(r1, r13, r8)
            goto L_0x01a9
        L_0x00f5:
            if (r5 != r15) goto L_0x01a8
            int r2 = com.google.android.gms.internal.ads.zzefb.zza(r3, r4, r11)
            int r4 = r11.zziaw
            if (r4 != 0) goto L_0x0105
            java.lang.String r3 = ""
            r12.putObject(r1, r9, r3)
            goto L_0x0124
        L_0x0105:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x0119
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.ads.zzejw.zzm(r3, r2, r5)
            if (r5 == 0) goto L_0x0114
            goto L_0x0119
        L_0x0114:
            com.google.android.gms.internal.ads.zzegz r1 = com.google.android.gms.internal.ads.zzegz.zzbgj()
            throw r1
        L_0x0119:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.ads.zzegr.UTF_8
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x0124:
            r12.putInt(r1, r13, r8)
            goto L_0x01a9
        L_0x0129:
            if (r5 != 0) goto L_0x01a8
            int r2 = com.google.android.gms.internal.ads.zzefb.zzb(r3, r4, r11)
            long r3 = r11.zziax
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0139
            r15 = 1
            goto L_0x013a
        L_0x0139:
            r15 = 0
        L_0x013a:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            r12.putObject(r1, r9, r3)
            goto L_0x01a4
        L_0x0142:
            if (r5 != r7) goto L_0x01a8
            int r2 = com.google.android.gms.internal.ads.zzefb.zzg(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 4
            goto L_0x01a4
        L_0x0152:
            r2 = 1
            if (r5 != r2) goto L_0x01a8
            long r2 = com.google.android.gms.internal.ads.zzefb.zzh(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 8
            goto L_0x01a4
        L_0x0163:
            if (r5 != 0) goto L_0x01a8
            int r2 = com.google.android.gms.internal.ads.zzefb.zza(r3, r4, r11)
            int r3 = r11.zziaw
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x01a4
        L_0x0173:
            if (r5 != 0) goto L_0x01a8
            int r2 = com.google.android.gms.internal.ads.zzefb.zzb(r3, r4, r11)
            long r3 = r11.zziax
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x01a4
        L_0x0183:
            if (r5 != r7) goto L_0x01a8
            float r2 = com.google.android.gms.internal.ads.zzefb.zzj(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 4
            goto L_0x01a4
        L_0x0193:
            r2 = 1
            if (r5 != r2) goto L_0x01a8
            double r2 = com.google.android.gms.internal.ads.zzefb.zzi(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 8
        L_0x01a4:
            r12.putInt(r1, r13, r8)
            goto L_0x01a9
        L_0x01a8:
            r2 = r4
        L_0x01a9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeid.zza(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.ads.zzefa):int");
    }

    private final zzeiv zzhf(int i) {
        int i2 = (i / 3) << 1;
        zzeiv zzeiv = (zzeiv) this.zziib[i2];
        if (zzeiv != null) {
            return zzeiv;
        }
        zzeiv zzh = zzeio.zzbhg().zzh((Class) this.zziib[i2 + 1]);
        this.zziib[i2] = zzh;
        return zzh;
    }

    private final Object zzhg(int i) {
        return this.zziib[(i / 3) << 1];
    }

    private final zzegw zzhh(int i) {
        return (zzegw) this.zziib[((i / 3) << 1) + 1];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v45, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v40, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(T r28, byte[] r29, int r30, int r31, int r32, com.google.android.gms.internal.ads.zzefa r33) throws java.io.IOException {
        /*
            r27 = this;
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            r9 = r33
            sun.misc.Unsafe r10 = zzhop
            r16 = 0
            r0 = r30
            r1 = -1
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001d:
            if (r0 >= r13) goto L_0x0594
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002e
            int r0 = com.google.android.gms.internal.ads.zzefb.zza((int) r0, (byte[]) r12, (int) r3, (com.google.android.gms.internal.ads.zzefa) r9)
            int r3 = r9.zziaw
            r4 = r3
            r3 = r0
            goto L_0x002f
        L_0x002e:
            r4 = r0
        L_0x002f:
            int r0 = r4 >>> 3
            r7 = r4 & 7
            r8 = 3
            if (r0 <= r1) goto L_0x003d
            int r2 = r2 / r8
            int r1 = r15.zzan(r0, r2)
            r2 = r1
            goto L_0x0042
        L_0x003d:
            int r1 = r15.zzhl(r0)
            r2 = r1
        L_0x0042:
            r1 = -1
            if (r2 != r1) goto L_0x0055
            r30 = r0
            r2 = r3
            r19 = r4
            r22 = r5
            r26 = r10
            r17 = 0
            r18 = -1
            goto L_0x04e3
        L_0x0055:
            int[] r1 = r15.zziia
            int r19 = r2 + 1
            r8 = r1[r19]
            r19 = 267386880(0xff00000, float:2.3665827E-29)
            r19 = r8 & r19
            int r11 = r19 >>> 20
            r19 = r4
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r8 & r17
            long r12 = (long) r4
            r4 = 17
            r20 = r8
            if (r11 > r4) goto L_0x03bd
            int r4 = r2 + 2
            r1 = r1[r4]
            int r4 = r1 >>> 20
            r8 = 1
            int r22 = r8 << r4
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r4
            if (r1 == r6) goto L_0x0091
            if (r6 == r4) goto L_0x0088
            long r8 = (long) r6
            r10.putInt(r14, r8, r5)
        L_0x0088:
            long r5 = (long) r1
            int r5 = r10.getInt(r14, r5)
            r8 = r1
            r6 = r5
            goto L_0x0093
        L_0x0091:
            r8 = r6
            r6 = r5
        L_0x0093:
            r1 = 5
            switch(r11) {
                case 0: goto L_0x0384;
                case 1: goto L_0x035b;
                case 2: goto L_0x0329;
                case 3: goto L_0x0329;
                case 4: goto L_0x0300;
                case 5: goto L_0x02ca;
                case 6: goto L_0x02a0;
                case 7: goto L_0x026b;
                case 8: goto L_0x0235;
                case 9: goto L_0x01ee;
                case 10: goto L_0x01c4;
                case 11: goto L_0x0300;
                case 12: goto L_0x0175;
                case 13: goto L_0x02a0;
                case 14: goto L_0x02ca;
                case 15: goto L_0x0148;
                case 16: goto L_0x0107;
                case 17: goto L_0x00a8;
                default: goto L_0x0097;
            }
        L_0x0097:
            r12 = r29
            r13 = r33
            r9 = r0
            r11 = r2
            r30 = r8
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x03ae
        L_0x00a8:
            r1 = 3
            if (r7 != r1) goto L_0x00f4
            int r1 = r0 << 3
            r5 = r1 | 4
            com.google.android.gms.internal.ads.zzeiv r1 = r15.zzhf(r2)
            r9 = r0
            r0 = r1
            r18 = -1
            r1 = r29
            r11 = r2
            r2 = r3
            r3 = r31
            r7 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r5
            r5 = r33
            int r0 = com.google.android.gms.internal.ads.zzefb.zza((com.google.android.gms.internal.ads.zzeiv) r0, (byte[]) r1, (int) r2, (int) r3, (int) r4, (com.google.android.gms.internal.ads.zzefa) r5)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x00d6
            r4 = r33
            java.lang.Object r1 = r4.zziay
            r10.putObject(r14, r12, r1)
            goto L_0x00e5
        L_0x00d6:
            r4 = r33
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r4.zziay
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzegr.zze(r1, r2)
            r10.putObject(r14, r12, r1)
        L_0x00e5:
            r5 = r6 | r22
            r12 = r29
            r13 = r31
            r3 = r7
            r6 = r8
            r1 = r9
            r2 = r11
            r11 = r32
            r9 = r4
            goto L_0x001d
        L_0x00f4:
            r4 = r33
            r9 = r0
            r11 = r2
            r7 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r4
            r30 = r8
            r8 = r7
            goto L_0x03ae
        L_0x0107:
            r4 = r33
            r9 = r0
            r11 = r2
            r5 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x0140
            r1 = r12
            r12 = r29
            int r7 = com.google.android.gms.internal.ads.zzefb.zzb(r12, r3, r4)
            r20 = r1
            long r0 = r4.zziax
            long r23 = com.google.android.gms.internal.ads.zzefq.zzfh(r0)
            r0 = r10
            r2 = r20
            r1 = r28
            r13 = r4
            r30 = r8
            r8 = r5
            r4 = r23
            r0.putLong(r1, r2, r4)
            r5 = r6 | r22
            r6 = r30
            r0 = r7
            r3 = r8
            r1 = r9
            r2 = r11
            r9 = r13
            r13 = r31
            r11 = r32
            goto L_0x001d
        L_0x0140:
            r12 = r29
            r13 = r4
            r30 = r8
            r8 = r5
            goto L_0x03ae
        L_0x0148:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != 0) goto L_0x03ae
            int r0 = com.google.android.gms.internal.ads.zzefb.zza(r12, r3, r13)
            int r1 = r13.zziaw
            int r1 = com.google.android.gms.internal.ads.zzefq.zzgc(r1)
            r10.putInt(r14, r4, r1)
            r5 = r6 | r22
            r6 = r30
            r3 = r8
            r1 = r9
            r2 = r11
            r9 = r13
            r13 = r31
            r11 = r32
            goto L_0x001d
        L_0x0175:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != 0) goto L_0x03ae
            int r0 = com.google.android.gms.internal.ads.zzefb.zza(r12, r3, r13)
            int r1 = r13.zziaw
            com.google.android.gms.internal.ads.zzegw r2 = r15.zzhh(r11)
            if (r2 == 0) goto L_0x01b3
            boolean r2 = r2.zzi(r1)
            if (r2 == 0) goto L_0x019a
            goto L_0x01b3
        L_0x019a:
            com.google.android.gms.internal.ads.zzejq r2 = zzau(r28)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.zzd(r8, r1)
            r5 = r6
            r3 = r8
            r1 = r9
            r2 = r11
            r9 = r13
            r6 = r30
            r13 = r31
            r11 = r32
            goto L_0x001d
        L_0x01b3:
            r10.putInt(r14, r4, r1)
            r5 = r6 | r22
            r6 = r30
            r3 = r8
            r1 = r9
            r2 = r11
            r9 = r13
            r13 = r31
            r11 = r32
            goto L_0x001d
        L_0x01c4:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            r0 = 2
            if (r7 != r0) goto L_0x03ae
            int r0 = com.google.android.gms.internal.ads.zzefb.zze(r12, r3, r13)
            java.lang.Object r1 = r13.zziay
            r10.putObject(r14, r4, r1)
            r5 = r6 | r22
            r6 = r30
            r3 = r8
            r1 = r9
            r2 = r11
            r9 = r13
            r13 = r31
            r11 = r32
            goto L_0x001d
        L_0x01ee:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            r0 = 2
            if (r7 != r0) goto L_0x0231
            com.google.android.gms.internal.ads.zzeiv r0 = r15.zzhf(r11)
            r2 = r31
            int r0 = com.google.android.gms.internal.ads.zzefb.zza((com.google.android.gms.internal.ads.zzeiv) r0, (byte[]) r12, (int) r3, (int) r2, (com.google.android.gms.internal.ads.zzefa) r13)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x0216
            java.lang.Object r1 = r13.zziay
            r10.putObject(r14, r4, r1)
            goto L_0x0224
        L_0x0216:
            java.lang.Object r1 = r10.getObject(r14, r4)
            java.lang.Object r3 = r13.zziay
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzegr.zze(r1, r3)
            r10.putObject(r14, r4, r1)
        L_0x0224:
            r5 = r6 | r22
            r6 = r30
            r3 = r8
            r1 = r9
            r9 = r13
            r13 = r2
            r2 = r11
            r11 = r32
            goto L_0x001d
        L_0x0231:
            r2 = r31
            goto L_0x03ae
        L_0x0235:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r2 = r31
            r13 = r33
            r0 = 2
            if (r7 != r0) goto L_0x03ae
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r20 & r0
            if (r0 != 0) goto L_0x0255
            int r0 = com.google.android.gms.internal.ads.zzefb.zzc(r12, r3, r13)
            goto L_0x0259
        L_0x0255:
            int r0 = com.google.android.gms.internal.ads.zzefb.zzd(r12, r3, r13)
        L_0x0259:
            java.lang.Object r1 = r13.zziay
            r10.putObject(r14, r4, r1)
            r5 = r6 | r22
            r6 = r30
            r3 = r8
            r1 = r9
            r9 = r13
            r13 = r2
            r2 = r11
            r11 = r32
            goto L_0x001d
        L_0x026b:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r2 = r31
            r13 = r33
            if (r7 != 0) goto L_0x03ae
            int r0 = com.google.android.gms.internal.ads.zzefb.zzb(r12, r3, r13)
            r3 = r0
            long r0 = r13.zziax
            r20 = 0
            int r7 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r7 == 0) goto L_0x028e
            r0 = 1
            goto L_0x028f
        L_0x028e:
            r0 = 0
        L_0x028f:
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r14, (long) r4, (boolean) r0)
            r5 = r6 | r22
            r6 = r30
            r0 = r3
            r3 = r8
            r1 = r9
            r9 = r13
            r13 = r2
            r2 = r11
            r11 = r32
            goto L_0x001d
        L_0x02a0:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r2 = r31
            r13 = r33
            if (r7 != r1) goto L_0x03ae
            int r0 = com.google.android.gms.internal.ads.zzefb.zzg(r12, r3)
            r10.putInt(r14, r4, r0)
            int r0 = r3 + 4
            r5 = r6 | r22
            r6 = r30
            r3 = r8
            r1 = r9
            r9 = r13
            r13 = r2
            r2 = r11
            r11 = r32
            goto L_0x001d
        L_0x02ca:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r2 = r31
            r13 = r33
            r0 = 1
            if (r7 != r0) goto L_0x02fd
            long r20 = com.google.android.gms.internal.ads.zzefb.zzh(r12, r3)
            r0 = r10
            r1 = r28
            r7 = r3
            r2 = r4
            r4 = r20
            r0.putLong(r1, r2, r4)
            int r0 = r7 + 8
            r5 = r6 | r22
            r6 = r30
            r3 = r8
            r1 = r9
            r2 = r11
            r9 = r13
            r13 = r31
            r11 = r32
            goto L_0x001d
        L_0x02fd:
            r7 = r3
            goto L_0x03ae
        L_0x0300:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != 0) goto L_0x03ae
            int r0 = com.google.android.gms.internal.ads.zzefb.zza(r12, r3, r13)
            int r1 = r13.zziaw
            r10.putInt(r14, r4, r1)
            r5 = r6 | r22
            r6 = r30
            r3 = r8
            r1 = r9
            r2 = r11
            r9 = r13
            r13 = r31
            r11 = r32
            goto L_0x001d
        L_0x0329:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != 0) goto L_0x03ae
            int r7 = com.google.android.gms.internal.ads.zzefb.zzb(r12, r3, r13)
            long r2 = r13.zziax
            r0 = r10
            r1 = r28
            r20 = r2
            r2 = r4
            r4 = r20
            r0.putLong(r1, r2, r4)
            r5 = r6 | r22
            r6 = r30
            r0 = r7
            r3 = r8
            r1 = r9
            r2 = r11
            r9 = r13
            r13 = r31
            r11 = r32
            goto L_0x001d
        L_0x035b:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != r1) goto L_0x03ae
            float r0 = com.google.android.gms.internal.ads.zzefb.zzj(r12, r3)
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r14, (long) r4, (float) r0)
            int r0 = r3 + 4
            r5 = r6 | r22
            r6 = r30
            r3 = r8
            r1 = r9
            r2 = r11
            r9 = r13
            r13 = r31
            r11 = r32
            goto L_0x001d
        L_0x0384:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            r0 = 1
            if (r7 != r0) goto L_0x03ae
            double r0 = com.google.android.gms.internal.ads.zzefb.zzi(r12, r3)
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r14, (long) r4, (double) r0)
            int r0 = r3 + 8
            r5 = r6 | r22
            r6 = r30
            r3 = r8
            r1 = r9
            r2 = r11
            r9 = r13
            r13 = r31
            r11 = r32
            goto L_0x001d
        L_0x03ae:
            r2 = r3
            r22 = r6
            r19 = r8
            r26 = r10
            r17 = r11
            r6 = r30
            r30 = r9
            goto L_0x04e3
        L_0x03bd:
            r4 = r2
            r1 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r9
            r9 = r0
            r0 = 27
            if (r11 != r0) goto L_0x0428
            r0 = 2
            if (r7 != r0) goto L_0x0419
            java.lang.Object r0 = r10.getObject(r14, r1)
            com.google.android.gms.internal.ads.zzeha r0 = (com.google.android.gms.internal.ads.zzeha) r0
            boolean r7 = r0.zzbdf()
            if (r7 != 0) goto L_0x03f2
            int r7 = r0.size()
            if (r7 != 0) goto L_0x03e7
            r7 = 10
            goto L_0x03e9
        L_0x03e7:
            int r7 = r7 << 1
        L_0x03e9:
            com.google.android.gms.internal.ads.zzeha r0 = r0.zzft(r7)
            r10.putObject(r14, r1, r0)
            r7 = r0
            goto L_0x03f3
        L_0x03f2:
            r7 = r0
        L_0x03f3:
            com.google.android.gms.internal.ads.zzeiv r0 = r15.zzhf(r4)
            r1 = r8
            r2 = r29
            r17 = r4
            r4 = r31
            r22 = r5
            r5 = r7
            r23 = r6
            r6 = r33
            int r0 = com.google.android.gms.internal.ads.zzefb.zza(r0, r1, r2, r3, r4, r5, r6)
            r11 = r32
            r3 = r8
            r1 = r9
            r9 = r13
            r2 = r17
            r5 = r22
            r6 = r23
            r13 = r31
            goto L_0x001d
        L_0x0419:
            r17 = r4
            r22 = r5
            r23 = r6
            r15 = r3
            r19 = r8
            r30 = r9
            r26 = r10
            goto L_0x04bf
        L_0x0428:
            r17 = r4
            r22 = r5
            r23 = r6
            r0 = 49
            if (r11 > r0) goto L_0x0479
            r6 = r20
            long r5 = (long) r6
            r0 = r27
            r24 = r1
            r1 = r28
            r2 = r29
            r4 = r3
            r15 = r4
            r4 = r31
            r20 = r5
            r5 = r8
            r6 = r9
            r19 = r8
            r8 = r17
            r30 = r9
            r26 = r10
            r9 = r20
            r12 = r24
            r14 = r33
            int r0 = r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (com.google.android.gms.internal.ads.zzefa) r14)
            if (r0 != r15) goto L_0x045f
            r2 = r0
            r6 = r23
            goto L_0x04e3
        L_0x045f:
            r15 = r27
            r14 = r28
            r12 = r29
            r1 = r30
            r13 = r31
            r11 = r32
            r9 = r33
            r2 = r17
            r3 = r19
            r5 = r22
            r6 = r23
            r10 = r26
            goto L_0x001d
        L_0x0479:
            r24 = r1
            r15 = r3
            r19 = r8
            r30 = r9
            r26 = r10
            r6 = r20
            r0 = 50
            if (r11 != r0) goto L_0x04c3
            r0 = 2
            if (r7 != r0) goto L_0x04bf
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r17
            r6 = r24
            r8 = r33
            int r0 = r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (long) r6, (com.google.android.gms.internal.ads.zzefa) r8)
            if (r0 != r15) goto L_0x04a5
            r2 = r0
            r6 = r23
            goto L_0x04e3
        L_0x04a5:
            r15 = r27
            r14 = r28
            r12 = r29
            r1 = r30
            r13 = r31
            r11 = r32
            r9 = r33
            r2 = r17
            r3 = r19
            r5 = r22
            r6 = r23
            r10 = r26
            goto L_0x001d
        L_0x04bf:
            r2 = r15
            r6 = r23
            goto L_0x04e3
        L_0x04c3:
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r19
            r8 = r6
            r6 = r30
            r9 = r11
            r10 = r24
            r12 = r17
            r13 = r33
            int r0 = r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (com.google.android.gms.internal.ads.zzefa) r13)
            if (r0 != r15) goto L_0x0574
            r2 = r0
            r6 = r23
        L_0x04e3:
            r7 = r32
            r8 = r19
            if (r8 != r7) goto L_0x04f6
            if (r7 != 0) goto L_0x04ec
            goto L_0x04f6
        L_0x04ec:
            r9 = r27
            r12 = r28
            r0 = r2
            r3 = r8
            r5 = r22
            goto L_0x059d
        L_0x04f6:
            r9 = r27
            boolean r0 = r9.zziif
            if (r0 == 0) goto L_0x054c
            r10 = r33
            com.google.android.gms.internal.ads.zzegc r0 = r10.zziaz
            com.google.android.gms.internal.ads.zzegc r1 = com.google.android.gms.internal.ads.zzegc.zzbex()
            if (r0 == r1) goto L_0x0547
            com.google.android.gms.internal.ads.zzehz r0 = r9.zziie
            com.google.android.gms.internal.ads.zzegc r1 = r10.zziaz
            r11 = r30
            com.google.android.gms.internal.ads.zzegp$zzf r0 = r1.zza(r0, r11)
            if (r0 != 0) goto L_0x0536
            com.google.android.gms.internal.ads.zzejq r4 = zzau(r28)
            r0 = r8
            r1 = r29
            r3 = r31
            r5 = r33
            int r0 = com.google.android.gms.internal.ads.zzefb.zza((int) r0, (byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.ads.zzejq) r4, (com.google.android.gms.internal.ads.zzefa) r5)
            r14 = r28
            r12 = r29
            r13 = r31
            r3 = r8
            r15 = r9
            r9 = r10
            r1 = r11
            r2 = r17
            r5 = r22
            r10 = r26
            r11 = r7
            goto L_0x001d
        L_0x0536:
            r12 = r28
            r0 = r12
            com.google.android.gms.internal.ads.zzegp$zzd r0 = (com.google.android.gms.internal.ads.zzegp.zzd) r0
            r0.zzbfy()
            com.google.android.gms.internal.ads.zzegi<com.google.android.gms.internal.ads.zzegp$zzc> r0 = r0.zzifv
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x0547:
            r12 = r28
            r11 = r30
            goto L_0x0552
        L_0x054c:
            r12 = r28
            r11 = r30
            r10 = r33
        L_0x0552:
            com.google.android.gms.internal.ads.zzejq r4 = zzau(r28)
            r0 = r8
            r1 = r29
            r3 = r31
            r5 = r33
            int r0 = com.google.android.gms.internal.ads.zzefb.zza((int) r0, (byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.ads.zzejq) r4, (com.google.android.gms.internal.ads.zzefa) r5)
            r13 = r31
            r3 = r8
            r15 = r9
            r9 = r10
            r1 = r11
            r14 = r12
            r2 = r17
            r5 = r22
            r10 = r26
            r12 = r29
            r11 = r7
            goto L_0x001d
        L_0x0574:
            r9 = r27
            r12 = r28
            r11 = r30
            r7 = r32
            r10 = r33
            r8 = r19
            r13 = r31
            r3 = r8
            r15 = r9
            r9 = r10
            r1 = r11
            r14 = r12
            r2 = r17
            r5 = r22
            r6 = r23
            r10 = r26
            r12 = r29
            r11 = r7
            goto L_0x001d
        L_0x0594:
            r22 = r5
            r23 = r6
            r26 = r10
            r7 = r11
            r12 = r14
            r9 = r15
        L_0x059d:
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r1) goto L_0x05a8
            long r1 = (long) r6
            r4 = r26
            r4.putInt(r12, r1, r5)
        L_0x05a8:
            r1 = 0
            int r2 = r9.zziik
        L_0x05ab:
            int r4 = r9.zziil
            if (r2 >= r4) goto L_0x05be
            int[] r4 = r9.zziij
            r4 = r4[r2]
            com.google.android.gms.internal.ads.zzejn<?, ?> r5 = r9.zziio
            java.lang.Object r1 = r9.zza((java.lang.Object) r12, (int) r4, r1, r5)
            com.google.android.gms.internal.ads.zzejq r1 = (com.google.android.gms.internal.ads.zzejq) r1
            int r2 = r2 + 1
            goto L_0x05ab
        L_0x05be:
            if (r1 == 0) goto L_0x05c5
            com.google.android.gms.internal.ads.zzejn<?, ?> r2 = r9.zziio
            r2.zzj(r12, r1)
        L_0x05c5:
            if (r7 != 0) goto L_0x05d1
            r1 = r31
            if (r0 != r1) goto L_0x05cc
            goto L_0x05d7
        L_0x05cc:
            com.google.android.gms.internal.ads.zzegz r0 = com.google.android.gms.internal.ads.zzegz.zzbgi()
            throw r0
        L_0x05d1:
            r1 = r31
            if (r0 > r1) goto L_0x05d8
            if (r3 != r7) goto L_0x05d8
        L_0x05d7:
            return r0
        L_0x05d8:
            com.google.android.gms.internal.ads.zzegz r0 = com.google.android.gms.internal.ads.zzegz.zzbgi()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeid.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzefa):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r30, byte[] r31, int r32, int r33, com.google.android.gms.internal.ads.zzefa r34) throws java.io.IOException {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            boolean r0 = r15.zziih
            if (r0 == 0) goto L_0x042d
            sun.misc.Unsafe r9 = zzhop
            r10 = -1
            r16 = 0
            r0 = r32
            r1 = -1
            r2 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001f:
            if (r0 >= r13) goto L_0x040e
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0031
            int r0 = com.google.android.gms.internal.ads.zzefb.zza((int) r0, (byte[]) r12, (int) r3, (com.google.android.gms.internal.ads.zzefa) r11)
            int r3 = r11.zziaw
            r4 = r0
            r17 = r3
            goto L_0x0034
        L_0x0031:
            r17 = r0
            r4 = r3
        L_0x0034:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x0042
            int r2 = r2 / 3
            int r0 = r15.zzan(r5, r2)
            r2 = r0
            goto L_0x0047
        L_0x0042:
            int r0 = r15.zzhl(r5)
            r2 = r0
        L_0x0047:
            if (r2 != r10) goto L_0x0055
            r2 = r4
            r19 = r5
            r26 = r9
            r20 = 0
            r27 = -1
            goto L_0x03d3
        L_0x0055:
            int[] r0 = r15.zziia
            int r1 = r2 + 1
            r1 = r0[r1]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r1 & r18
            int r8 = r18 >>> 20
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r1 & r18
            r18 = r4
            r32 = r5
            long r4 = (long) r10
            r10 = 17
            r20 = r1
            if (r8 > r10) goto L_0x02a3
            int r10 = r2 + 2
            r0 = r0[r10]
            int r10 = r0 >>> 20
            r1 = 1
            int r10 = r1 << r10
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r13
            if (r0 == r7) goto L_0x0099
            if (r7 == r13) goto L_0x008d
            r19 = r2
            long r1 = (long) r7
            r9.putInt(r14, r1, r6)
            goto L_0x008f
        L_0x008d:
            r19 = r2
        L_0x008f:
            if (r0 == r13) goto L_0x0097
            long r1 = (long) r0
            int r1 = r9.getInt(r14, r1)
            r6 = r1
        L_0x0097:
            r7 = r0
            goto L_0x009b
        L_0x0099:
            r19 = r2
        L_0x009b:
            r0 = 5
            switch(r8) {
                case 0: goto L_0x027c;
                case 1: goto L_0x025f;
                case 2: goto L_0x0239;
                case 3: goto L_0x0239;
                case 4: goto L_0x021c;
                case 5: goto L_0x01f6;
                case 6: goto L_0x01d5;
                case 7: goto L_0x01a7;
                case 8: goto L_0x017a;
                case 9: goto L_0x013c;
                case 10: goto L_0x011c;
                case 11: goto L_0x021c;
                case 12: goto L_0x00fd;
                case 13: goto L_0x01d5;
                case 14: goto L_0x01f6;
                case 15: goto L_0x00da;
                case 16: goto L_0x00aa;
                default: goto L_0x009f;
            }
        L_0x009f:
            r8 = r18
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r32
            goto L_0x029a
        L_0x00aa:
            if (r3 != 0) goto L_0x00cf
            r8 = r18
            int r8 = com.google.android.gms.internal.ads.zzefb.zzb(r12, r8, r11)
            long r0 = r11.zziax
            long r17 = com.google.android.gms.internal.ads.zzefq.zzfh(r0)
            r0 = r9
            r1 = r30
            r13 = r19
            r2 = r4
            r19 = r32
            r4 = r17
            r0.putLong(r1, r2, r4)
            r6 = r6 | r10
            r0 = r8
            r2 = r13
            r1 = r19
            r10 = -1
            r13 = r33
            goto L_0x001f
        L_0x00cf:
            r8 = r18
            r13 = r19
            r19 = r32
            r18 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x029a
        L_0x00da:
            r8 = r18
            r13 = r19
            r19 = r32
            if (r3 != 0) goto L_0x00f8
            int r0 = com.google.android.gms.internal.ads.zzefb.zza(r12, r8, r11)
            int r1 = r11.zziaw
            int r1 = com.google.android.gms.internal.ads.zzefq.zzgc(r1)
            r9.putInt(r14, r4, r1)
            r6 = r6 | r10
            r2 = r13
            r1 = r19
            r10 = -1
            r13 = r33
            goto L_0x001f
        L_0x00f8:
            r18 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x029a
        L_0x00fd:
            r8 = r18
            r13 = r19
            r19 = r32
            if (r3 != 0) goto L_0x0117
            int r0 = com.google.android.gms.internal.ads.zzefb.zza(r12, r8, r11)
            int r1 = r11.zziaw
            r9.putInt(r14, r4, r1)
            r6 = r6 | r10
            r2 = r13
            r1 = r19
            r10 = -1
            r13 = r33
            goto L_0x001f
        L_0x0117:
            r18 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x029a
        L_0x011c:
            r8 = r18
            r13 = r19
            r19 = r32
            r0 = 2
            if (r3 != r0) goto L_0x0137
            int r0 = com.google.android.gms.internal.ads.zzefb.zze(r12, r8, r11)
            java.lang.Object r1 = r11.zziay
            r9.putObject(r14, r4, r1)
            r6 = r6 | r10
            r2 = r13
            r1 = r19
            r10 = -1
            r13 = r33
            goto L_0x001f
        L_0x0137:
            r18 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x029a
        L_0x013c:
            r8 = r18
            r13 = r19
            r19 = r32
            r0 = 2
            if (r3 != r0) goto L_0x0173
            com.google.android.gms.internal.ads.zzeiv r0 = r15.zzhf(r13)
            r2 = r33
            r18 = 1048575(0xfffff, float:1.469367E-39)
            int r0 = com.google.android.gms.internal.ads.zzefb.zza((com.google.android.gms.internal.ads.zzeiv) r0, (byte[]) r12, (int) r8, (int) r2, (com.google.android.gms.internal.ads.zzefa) r11)
            java.lang.Object r1 = r9.getObject(r14, r4)
            if (r1 != 0) goto L_0x015f
            java.lang.Object r1 = r11.zziay
            r9.putObject(r14, r4, r1)
            goto L_0x0168
        L_0x015f:
            java.lang.Object r3 = r11.zziay
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzegr.zze(r1, r3)
            r9.putObject(r14, r4, r1)
        L_0x0168:
            r6 = r6 | r10
            r1 = r19
            r10 = -1
            r28 = r13
            r13 = r2
            r2 = r28
            goto L_0x001f
        L_0x0173:
            r2 = r33
            r18 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x029a
        L_0x017a:
            r2 = r33
            r8 = r18
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r32
            r0 = 2
            if (r3 != r0) goto L_0x029a
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r20 & r0
            if (r0 != 0) goto L_0x0193
            int r0 = com.google.android.gms.internal.ads.zzefb.zzc(r12, r8, r11)
            goto L_0x0197
        L_0x0193:
            int r0 = com.google.android.gms.internal.ads.zzefb.zzd(r12, r8, r11)
        L_0x0197:
            java.lang.Object r1 = r11.zziay
            r9.putObject(r14, r4, r1)
            r6 = r6 | r10
            r1 = r19
            r10 = -1
            r28 = r13
            r13 = r2
            r2 = r28
            goto L_0x001f
        L_0x01a7:
            r2 = r33
            r8 = r18
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r32
            if (r3 != 0) goto L_0x029a
            int r0 = com.google.android.gms.internal.ads.zzefb.zzb(r12, r8, r11)
            r32 = r0
            long r0 = r11.zziax
            r20 = 0
            int r3 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r3 == 0) goto L_0x01c4
            r1 = 1
            goto L_0x01c5
        L_0x01c4:
            r1 = 0
        L_0x01c5:
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r14, (long) r4, (boolean) r1)
            r6 = r6 | r10
            r0 = r32
            r1 = r19
            r10 = -1
            r28 = r13
            r13 = r2
            r2 = r28
            goto L_0x001f
        L_0x01d5:
            r2 = r33
            r8 = r18
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r32
            if (r3 != r0) goto L_0x029a
            int r0 = com.google.android.gms.internal.ads.zzefb.zzg(r12, r8)
            r9.putInt(r14, r4, r0)
            int r0 = r8 + 4
            r6 = r6 | r10
            r1 = r19
            r10 = -1
            r28 = r13
            r13 = r2
            r2 = r28
            goto L_0x001f
        L_0x01f6:
            r2 = r33
            r8 = r18
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r32
            r0 = 1
            if (r3 != r0) goto L_0x029a
            long r20 = com.google.android.gms.internal.ads.zzefb.zzh(r12, r8)
            r0 = r9
            r1 = r30
            r2 = r4
            r4 = r20
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            r6 = r6 | r10
            r2 = r13
            r1 = r19
            r10 = -1
            r13 = r33
            goto L_0x001f
        L_0x021c:
            r8 = r18
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r32
            if (r3 != 0) goto L_0x029a
            int r0 = com.google.android.gms.internal.ads.zzefb.zza(r12, r8, r11)
            int r1 = r11.zziaw
            r9.putInt(r14, r4, r1)
            r6 = r6 | r10
            r2 = r13
            r1 = r19
            r10 = -1
            r13 = r33
            goto L_0x001f
        L_0x0239:
            r8 = r18
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r32
            if (r3 != 0) goto L_0x029a
            int r8 = com.google.android.gms.internal.ads.zzefb.zzb(r12, r8, r11)
            long r2 = r11.zziax
            r0 = r9
            r1 = r30
            r20 = r2
            r2 = r4
            r4 = r20
            r0.putLong(r1, r2, r4)
            r6 = r6 | r10
            r0 = r8
            r2 = r13
            r1 = r19
            r10 = -1
            r13 = r33
            goto L_0x001f
        L_0x025f:
            r8 = r18
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r32
            if (r3 != r0) goto L_0x029a
            float r0 = com.google.android.gms.internal.ads.zzefb.zzj(r12, r8)
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r14, (long) r4, (float) r0)
            int r0 = r8 + 4
            r6 = r6 | r10
            r2 = r13
            r1 = r19
            r10 = -1
            r13 = r33
            goto L_0x001f
        L_0x027c:
            r8 = r18
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r32
            r0 = 1
            if (r3 != r0) goto L_0x029a
            double r0 = com.google.android.gms.internal.ads.zzefb.zzi(r12, r8)
            com.google.android.gms.internal.ads.zzejt.zza((java.lang.Object) r14, (long) r4, (double) r0)
            int r0 = r8 + 8
            r6 = r6 | r10
            r2 = r13
            r1 = r19
            r10 = -1
            r13 = r33
            goto L_0x001f
        L_0x029a:
            r2 = r8
            r26 = r9
            r20 = r13
            r27 = -1
            goto L_0x03d3
        L_0x02a3:
            r19 = r32
            r13 = r2
            r10 = r18
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r0 = 27
            if (r8 != r0) goto L_0x02fe
            r0 = 2
            if (r3 != r0) goto L_0x02f0
            java.lang.Object r0 = r9.getObject(r14, r4)
            com.google.android.gms.internal.ads.zzeha r0 = (com.google.android.gms.internal.ads.zzeha) r0
            boolean r1 = r0.zzbdf()
            if (r1 != 0) goto L_0x02d3
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02c8
            r1 = 10
            goto L_0x02ca
        L_0x02c8:
            int r1 = r1 << 1
        L_0x02ca:
            com.google.android.gms.internal.ads.zzeha r0 = r0.zzft(r1)
            r9.putObject(r14, r4, r0)
            r5 = r0
            goto L_0x02d4
        L_0x02d3:
            r5 = r0
        L_0x02d4:
            com.google.android.gms.internal.ads.zzeiv r0 = r15.zzhf(r13)
            r1 = r17
            r2 = r31
            r3 = r10
            r4 = r33
            r8 = r6
            r6 = r34
            int r0 = com.google.android.gms.internal.ads.zzefb.zza(r0, r1, r2, r3, r4, r5, r6)
            r6 = r8
            r2 = r13
            r1 = r19
            r10 = -1
            r13 = r33
            goto L_0x001f
        L_0x02f0:
            r8 = r6
            r18 = r7
            r24 = r8
            r26 = r9
            r15 = r10
            r20 = r13
            r27 = -1
            goto L_0x03ab
        L_0x02fe:
            r0 = 49
            if (r8 > r0) goto L_0x035a
            r1 = r20
            long r1 = (long) r1
            r0 = r29
            r20 = r1
            r1 = r30
            r2 = r31
            r32 = r3
            r3 = r10
            r22 = r4
            r4 = r33
            r5 = r17
            r15 = r6
            r6 = r19
            r24 = r15
            r15 = r7
            r7 = r32
            r25 = r8
            r18 = r15
            r15 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r13
            r26 = r9
            r15 = r10
            r27 = -1
            r9 = r20
            r11 = r25
            r20 = r13
            r12 = r22
            r14 = r34
            int r0 = r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (com.google.android.gms.internal.ads.zzefa) r14)
            if (r0 != r15) goto L_0x0343
            r2 = r0
            r7 = r18
            r6 = r24
            goto L_0x03d3
        L_0x0343:
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r7 = r18
            r1 = r19
            r2 = r20
            r6 = r24
            r9 = r26
            r10 = -1
            goto L_0x001f
        L_0x035a:
            r32 = r3
            r22 = r4
            r24 = r6
            r18 = r7
            r25 = r8
            r26 = r9
            r15 = r10
            r1 = r20
            r27 = -1
            r20 = r13
            r0 = 50
            r9 = r25
            if (r9 != r0) goto L_0x03b1
            r7 = r32
            r0 = 2
            if (r7 != r0) goto L_0x03ab
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r20
            r6 = r22
            r8 = r34
            int r0 = r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (long) r6, (com.google.android.gms.internal.ads.zzefa) r8)
            if (r0 != r15) goto L_0x0394
            r2 = r0
            r7 = r18
            r6 = r24
            goto L_0x03d3
        L_0x0394:
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r7 = r18
            r1 = r19
            r2 = r20
            r6 = r24
            r9 = r26
            r10 = -1
            goto L_0x001f
        L_0x03ab:
            r2 = r15
            r7 = r18
            r6 = r24
            goto L_0x03d3
        L_0x03b1:
            r7 = r32
            r0 = r29
            r8 = r1
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r17
            r6 = r19
            r10 = r22
            r12 = r20
            r13 = r34
            int r0 = r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (com.google.android.gms.internal.ads.zzefa) r13)
            if (r0 != r15) goto L_0x03f7
            r2 = r0
            r7 = r18
            r6 = r24
        L_0x03d3:
            com.google.android.gms.internal.ads.zzejq r4 = zzau(r30)
            r0 = r17
            r1 = r31
            r3 = r33
            r5 = r34
            int r0 = com.google.android.gms.internal.ads.zzefb.zza((int) r0, (byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.ads.zzejq) r4, (com.google.android.gms.internal.ads.zzefa) r5)
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r1 = r19
            r2 = r20
            r9 = r26
            r10 = -1
            goto L_0x001f
        L_0x03f7:
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r7 = r18
            r1 = r19
            r2 = r20
            r6 = r24
            r9 = r26
            r10 = -1
            goto L_0x001f
        L_0x040e:
            r24 = r6
            r18 = r7
            r26 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x0423
            long r1 = (long) r7
            r3 = r30
            r6 = r24
            r4 = r26
            r4.putInt(r3, r1, r6)
        L_0x0423:
            r4 = r33
            if (r0 != r4) goto L_0x0428
            return
        L_0x0428:
            com.google.android.gms.internal.ads.zzegz r0 = com.google.android.gms.internal.ads.zzegz.zzbgi()
            throw r0
        L_0x042d:
            r4 = r13
            r3 = r14
            r5 = 0
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r33
            r6 = r34
            r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (com.google.android.gms.internal.ads.zzefa) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeid.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.zzefa):void");
    }

    public final void zzaj(T t) {
        int i;
        int i2 = this.zziik;
        while (true) {
            i = this.zziil;
            if (i2 >= i) {
                break;
            }
            long zzhi = (long) (zzhi(this.zziij[i2]) & 1048575);
            Object zzp = zzejt.zzp(t, zzhi);
            if (zzp != null) {
                zzejt.zza((Object) t, zzhi, this.zziiq.zzar(zzp));
            }
            i2++;
        }
        int length = this.zziij.length;
        while (i < length) {
            this.zziin.zzb(t, (long) this.zziij[i]);
            i++;
        }
        this.zziio.zzaj(t);
        if (this.zziif) {
            this.zziip.zzaj(t);
        }
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzejn<UT, UB> zzejn) {
        zzegw zzhh;
        int i2 = this.zziia[i];
        Object zzp = zzejt.zzp(obj, (long) (zzhi(i) & 1048575));
        if (zzp == null || (zzhh = zzhh(i)) == null) {
            return ub;
        }
        return zza(i, i2, this.zziiq.zzan(zzp), zzhh, ub, zzejn);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzegw zzegw, UB ub, zzejn<UT, UB> zzejn) {
        zzehu<?, ?> zzao = this.zziiq.zzao(zzhg(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!zzegw.zzi(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzejn.zzbhy();
                }
                zzefn zzfw = zzeff.zzfw(zzehr.zza(zzao, next.getKey(), next.getValue()));
                try {
                    zzehr.zza(zzfw.zzbds(), zzao, next.getKey(), next.getValue());
                    zzejn.zza(ub, i2, zzfw.zzbdr());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    public final boolean zzav(T t) {
        int i;
        int i2;
        T t2 = t;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z = true;
            if (i5 >= this.zziik) {
                return !this.zziif || this.zziip.zzah(t2).isInitialized();
            }
            int i6 = this.zziij[i5];
            int i7 = this.zziia[i6];
            int zzhi = zzhi(i6);
            int i8 = this.zziia[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 == i3) {
                i2 = i3;
                i = i4;
            } else if (i9 != 1048575) {
                i = zzhop.getInt(t2, (long) i9);
                i2 = i9;
            } else {
                i = i4;
                i2 = i9;
            }
            if (((268435456 & zzhi) != 0) && !zza(t, i6, i2, i, i10)) {
                return false;
            }
            int i11 = (267386880 & zzhi) >>> 20;
            if (i11 != 9 && i11 != 17) {
                if (i11 != 27) {
                    if (i11 == 60 || i11 == 68) {
                        if (zza(t2, i7, i6) && !zza((Object) t2, zzhi, zzhf(i6))) {
                            return false;
                        }
                    } else if (i11 != 49) {
                        if (i11 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzap = this.zziiq.zzap(zzejt.zzp(t2, (long) (zzhi & 1048575)));
                            if (!zzap.isEmpty()) {
                                if (this.zziiq.zzao(zzhg(i6)).zzihw.zzbii() == zzekh.MESSAGE) {
                                    zzeiv<?> zzeiv = null;
                                    Iterator<?> it = zzap.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (zzeiv == null) {
                                            zzeiv = zzeio.zzbhg().zzh(next.getClass());
                                        }
                                        if (!zzeiv.zzav(next)) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) zzejt.zzp(t2, (long) (zzhi & 1048575));
                if (!list.isEmpty()) {
                    zzeiv zzhf = zzhf(i6);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= list.size()) {
                            break;
                        } else if (!zzhf.zzav(list.get(i12))) {
                            z = false;
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (zza(t, i6, i2, i, i10) && !zza((Object) t2, zzhi, zzhf(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
    }

    private static boolean zza(Object obj, int i, zzeiv zzeiv) {
        return zzeiv.zzav(zzejt.zzp(obj, (long) (i & 1048575)));
    }

    private static void zza(int i, Object obj, zzekk zzekk) throws IOException {
        if (obj instanceof String) {
            zzekk.zzi(i, (String) obj);
        } else {
            zzekk.zza(i, (zzeff) obj);
        }
    }

    private final void zza(Object obj, int i, zzeip zzeip) throws IOException {
        if (zzhk(i)) {
            zzejt.zza(obj, (long) (i & 1048575), (Object) zzeip.zzbea());
        } else if (this.zziig) {
            zzejt.zza(obj, (long) (i & 1048575), (Object) zzeip.readString());
        } else {
            zzejt.zza(obj, (long) (i & 1048575), (Object) zzeip.zzbeb());
        }
    }

    private final int zzhi(int i) {
        return this.zziia[i + 1];
    }

    private final int zzhj(int i) {
        return this.zziia[i + 2];
    }

    private static boolean zzhk(int i) {
        return (i & 536870912) != 0;
    }

    private static <T> double zzf(T t, long j) {
        return ((Double) zzejt.zzp(t, j)).doubleValue();
    }

    private static <T> float zzg(T t, long j) {
        return ((Float) zzejt.zzp(t, j)).floatValue();
    }

    private static <T> int zzh(T t, long j) {
        return ((Integer) zzejt.zzp(t, j)).intValue();
    }

    private static <T> long zzi(T t, long j) {
        return ((Long) zzejt.zzp(t, j)).longValue();
    }

    private static <T> boolean zzj(T t, long j) {
        return ((Boolean) zzejt.zzp(t, j)).booleanValue();
    }

    private final boolean zzc(T t, T t2, int i) {
        return zze(t, i) == zze(t2, i);
    }

    private final boolean zza(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zze(t, i);
        }
        return (i3 & i4) != 0;
    }

    private final boolean zze(T t, int i) {
        int zzhj = zzhj(i);
        long j = (long) (zzhj & 1048575);
        if (j == 1048575) {
            int zzhi = zzhi(i);
            long j2 = (long) (zzhi & 1048575);
            switch ((zzhi & 267386880) >>> 20) {
                case 0:
                    return zzejt.zzo(t, j2) != 0.0d;
                case 1:
                    return zzejt.zzn(t, j2) != 0.0f;
                case 2:
                    return zzejt.zzl(t, j2) != 0;
                case 3:
                    return zzejt.zzl(t, j2) != 0;
                case 4:
                    return zzejt.zzk(t, j2) != 0;
                case 5:
                    return zzejt.zzl(t, j2) != 0;
                case 6:
                    return zzejt.zzk(t, j2) != 0;
                case 7:
                    return zzejt.zzm(t, j2);
                case 8:
                    Object zzp = zzejt.zzp(t, j2);
                    if (zzp instanceof String) {
                        return !((String) zzp).isEmpty();
                    }
                    if (zzp instanceof zzeff) {
                        return !zzeff.zzibd.equals(zzp);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return zzejt.zzp(t, j2) != null;
                case 10:
                    return !zzeff.zzibd.equals(zzejt.zzp(t, j2));
                case 11:
                    return zzejt.zzk(t, j2) != 0;
                case 12:
                    return zzejt.zzk(t, j2) != 0;
                case 13:
                    return zzejt.zzk(t, j2) != 0;
                case 14:
                    return zzejt.zzl(t, j2) != 0;
                case 15:
                    return zzejt.zzk(t, j2) != 0;
                case 16:
                    return zzejt.zzl(t, j2) != 0;
                case 17:
                    return zzejt.zzp(t, j2) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (zzejt.zzk(t, j) & (1 << (zzhj >>> 20))) != 0;
        }
    }

    private final void zzf(T t, int i) {
        int zzhj = zzhj(i);
        long j = (long) (1048575 & zzhj);
        if (j != 1048575) {
            zzejt.zzb((Object) t, j, (1 << (zzhj >>> 20)) | zzejt.zzk(t, j));
        }
    }

    private final boolean zza(T t, int i, int i2) {
        return zzejt.zzk(t, (long) (zzhj(i2) & 1048575)) == i;
    }

    private final void zzb(T t, int i, int i2) {
        zzejt.zzb((Object) t, (long) (zzhj(i2) & 1048575), i);
    }

    private final int zzhl(int i) {
        if (i < this.zziic || i > this.zziid) {
            return -1;
        }
        return zzao(i, 0);
    }

    private final int zzan(int i, int i2) {
        if (i < this.zziic || i > this.zziid) {
            return -1;
        }
        return zzao(i, i2);
    }

    private final int zzao(int i, int i2) {
        int length = (this.zziia.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zziia[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}
