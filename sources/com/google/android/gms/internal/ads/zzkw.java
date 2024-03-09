package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzmc;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzkw {
    private static final int zzavp = zzpq.zzbl("meta");
    private static final int zzawp = zzpq.zzbl("vide");
    private static final int zzawq = zzpq.zzbl("soun");
    private static final int zzawr = zzpq.zzbl("text");
    private static final int zzaws = zzpq.zzbl("sbtl");
    private static final int zzawt = zzpq.zzbl("subt");
    private static final int zzawu = zzpq.zzbl("clcp");
    private static final int zzawv = zzpq.zzbl("cenc");

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v48, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v10, resolved type: byte[]} */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x05ec: MOVE  (r7v11 java.lang.String) = (r45v0 java.lang.String)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0402  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x040b  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0462  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x05f0  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0625  */
    public static com.google.android.gms.internal.ads.zzln zza(com.google.android.gms.internal.ads.zzku r49, com.google.android.gms.internal.ads.zzkt r50, long r51, com.google.android.gms.internal.ads.zzjn r53, boolean r54) throws com.google.android.gms.internal.ads.zzhv {
        /*
            r0 = r49
            r15 = r53
            int r1 = com.google.android.gms.internal.ads.zzkr.zzats
            com.google.android.gms.internal.ads.zzku r1 = r0.zzav(r1)
            int r2 = com.google.android.gms.internal.ads.zzkr.zzaug
            com.google.android.gms.internal.ads.zzkt r2 = r1.zzau(r2)
            com.google.android.gms.internal.ads.zzpk r2 = r2.zzawe
            r14 = 16
            r2.zzbo(r14)
            int r2 = r2.readInt()
            int r3 = zzawq
            r4 = 4
            r11 = -1
            if (r2 != r3) goto L_0x0023
            r10 = 1
            goto L_0x0043
        L_0x0023:
            int r3 = zzawp
            if (r2 != r3) goto L_0x0029
            r10 = 2
            goto L_0x0043
        L_0x0029:
            int r3 = zzawr
            if (r2 == r3) goto L_0x0042
            int r3 = zzaws
            if (r2 == r3) goto L_0x0042
            int r3 = zzawt
            if (r2 == r3) goto L_0x0042
            int r3 = zzawu
            if (r2 != r3) goto L_0x003a
            goto L_0x0042
        L_0x003a:
            int r3 = zzavp
            if (r2 != r3) goto L_0x0040
            r10 = 4
            goto L_0x0043
        L_0x0040:
            r10 = -1
            goto L_0x0043
        L_0x0042:
            r10 = 3
        L_0x0043:
            r8 = 0
            if (r10 != r11) goto L_0x0048
            return r8
        L_0x0048:
            int r2 = com.google.android.gms.internal.ads.zzkr.zzauc
            com.google.android.gms.internal.ads.zzkt r2 = r0.zzau(r2)
            com.google.android.gms.internal.ads.zzpk r2 = r2.zzawe
            r7 = 8
            r2.zzbo(r7)
            int r3 = r2.readInt()
            int r3 = com.google.android.gms.internal.ads.zzkr.zzaq(r3)
            if (r3 != 0) goto L_0x0062
            r5 = 8
            goto L_0x0064
        L_0x0062:
            r5 = 16
        L_0x0064:
            r2.zzbp(r5)
            int r5 = r2.readInt()
            r2.zzbp(r4)
            int r6 = r2.getPosition()
            if (r3 != 0) goto L_0x0077
            r12 = 4
            goto L_0x0079
        L_0x0077:
            r12 = 8
        L_0x0079:
            r9 = 0
        L_0x007a:
            if (r9 >= r12) goto L_0x008b
            byte[] r8 = r2.data
            int r20 = r6 + r9
            byte r8 = r8[r20]
            if (r8 == r11) goto L_0x0087
            r6 = 0
            goto L_0x008c
        L_0x0087:
            int r9 = r9 + 1
            r8 = 0
            goto L_0x007a
        L_0x008b:
            r6 = 1
        L_0x008c:
            r20 = 0
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 == 0) goto L_0x009a
            r2.zzbp(r12)
            r11 = r8
            goto L_0x00ad
        L_0x009a:
            if (r3 != 0) goto L_0x00a1
            long r22 = r2.zzja()
            goto L_0x00a5
        L_0x00a1:
            long r22 = r2.zzje()
        L_0x00a5:
            int r3 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1))
            if (r3 != 0) goto L_0x00ab
            r11 = r8
            goto L_0x00ad
        L_0x00ab:
            r11 = r22
        L_0x00ad:
            r2.zzbp(r14)
            int r3 = r2.readInt()
            int r6 = r2.readInt()
            r2.zzbp(r4)
            int r4 = r2.readInt()
            int r2 = r2.readInt()
            r14 = 65536(0x10000, float:9.18355E-41)
            r13 = -65536(0xffffffffffff0000, float:NaN)
            if (r3 != 0) goto L_0x00d2
            if (r6 != r14) goto L_0x00d2
            if (r4 != r13) goto L_0x00d2
            if (r2 != 0) goto L_0x00d2
            r2 = 90
            goto L_0x00e9
        L_0x00d2:
            if (r3 != 0) goto L_0x00dd
            if (r6 != r13) goto L_0x00dd
            if (r4 != r14) goto L_0x00dd
            if (r2 != 0) goto L_0x00dd
            r2 = 270(0x10e, float:3.78E-43)
            goto L_0x00e9
        L_0x00dd:
            if (r3 != r13) goto L_0x00e8
            if (r6 != 0) goto L_0x00e8
            if (r4 != 0) goto L_0x00e8
            if (r2 != r13) goto L_0x00e8
            r2 = 180(0xb4, float:2.52E-43)
            goto L_0x00e9
        L_0x00e8:
            r2 = 0
        L_0x00e9:
            com.google.android.gms.internal.ads.zzlc r14 = new com.google.android.gms.internal.ads.zzlc
            r14.<init>(r5, r11, r2)
            int r2 = (r51 > r8 ? 1 : (r51 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x00fa
            long r2 = r14.zzdh
            r26 = r2
            goto L_0x00fc
        L_0x00fa:
            r26 = r51
        L_0x00fc:
            r2 = r50
            com.google.android.gms.internal.ads.zzpk r2 = r2.zzawe
            r2.zzbo(r7)
            int r3 = r2.readInt()
            int r3 = com.google.android.gms.internal.ads.zzkr.zzaq(r3)
            if (r3 != 0) goto L_0x0110
            r3 = 8
            goto L_0x0112
        L_0x0110:
            r3 = 16
        L_0x0112:
            r2.zzbp(r3)
            long r32 = r2.zzja()
            int r2 = (r26 > r8 ? 1 : (r26 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0121
            r26 = r8
            goto L_0x012c
        L_0x0121:
            r28 = 1000000(0xf4240, double:4.940656E-318)
            r30 = r32
            long r2 = com.google.android.gms.internal.ads.zzpq.zza((long) r26, (long) r28, (long) r30)
            r26 = r2
        L_0x012c:
            int r2 = com.google.android.gms.internal.ads.zzkr.zzatt
            com.google.android.gms.internal.ads.zzku r2 = r1.zzav(r2)
            int r3 = com.google.android.gms.internal.ads.zzkr.zzatu
            com.google.android.gms.internal.ads.zzku r2 = r2.zzav(r3)
            int r3 = com.google.android.gms.internal.ads.zzkr.zzauf
            com.google.android.gms.internal.ads.zzkt r1 = r1.zzau(r3)
            com.google.android.gms.internal.ads.zzpk r1 = r1.zzawe
            r1.zzbo(r7)
            int r3 = r1.readInt()
            int r3 = com.google.android.gms.internal.ads.zzkr.zzaq(r3)
            if (r3 != 0) goto L_0x0150
            r4 = 8
            goto L_0x0152
        L_0x0150:
            r4 = 16
        L_0x0152:
            r1.zzbp(r4)
            long r4 = r1.zzja()
            if (r3 != 0) goto L_0x015d
            r3 = 4
            goto L_0x015f
        L_0x015d:
            r3 = 8
        L_0x015f:
            r1.zzbp(r3)
            int r1 = r1.readUnsignedShort()
            int r3 = r1 >> 10
            r3 = r3 & 31
            int r3 = r3 + 96
            char r3 = (char) r3
            int r6 = r1 >> 5
            r6 = r6 & 31
            int r6 = r6 + 96
            char r6 = (char) r6
            r1 = r1 & 31
            int r1 = r1 + 96
            char r1 = (char) r1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r9 = 3
            r8.<init>(r9)
            r8.append(r3)
            r8.append(r6)
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            android.util.Pair r13 = android.util.Pair.create(r3, r1)
            int r1 = com.google.android.gms.internal.ads.zzkr.zzauh
            com.google.android.gms.internal.ads.zzkt r1 = r2.zzau(r1)
            com.google.android.gms.internal.ads.zzpk r12 = r1.zzawe
            int r22 = r14.id
            int r28 = r14.zzahd
            java.lang.Object r1 = r13.second
            r11 = r1
            java.lang.String r11 = (java.lang.String) r11
            r1 = 12
            r12.zzbo(r1)
            int r9 = r12.readInt()
            com.google.android.gms.internal.ads.zzkx r8 = new com.google.android.gms.internal.ads.zzkx
            r8.<init>(r9)
            r6 = 0
        L_0x01ba:
            if (r6 >= r9) goto L_0x0885
            int r5 = r12.getPosition()
            int r4 = r12.readInt()
            if (r4 <= 0) goto L_0x01c8
            r1 = 1
            goto L_0x01c9
        L_0x01c8:
            r1 = 0
        L_0x01c9:
            java.lang.String r3 = "childAtomSize should be positive"
            com.google.android.gms.internal.ads.zzoz.checkArgument(r1, r3)
            int r1 = r12.readInt()
            int r2 = com.google.android.gms.internal.ads.zzkr.zzasp
            if (r1 == r2) goto L_0x063f
            int r2 = com.google.android.gms.internal.ads.zzkr.zzasq
            if (r1 == r2) goto L_0x063f
            int r2 = com.google.android.gms.internal.ads.zzkr.zzaun
            if (r1 == r2) goto L_0x063f
            int r2 = com.google.android.gms.internal.ads.zzkr.zzauz
            if (r1 == r2) goto L_0x063f
            int r2 = com.google.android.gms.internal.ads.zzkr.zzasr
            if (r1 == r2) goto L_0x063f
            int r2 = com.google.android.gms.internal.ads.zzkr.zzass
            if (r1 == r2) goto L_0x063f
            int r2 = com.google.android.gms.internal.ads.zzkr.zzast
            if (r1 == r2) goto L_0x063f
            int r2 = com.google.android.gms.internal.ads.zzkr.zzavy
            if (r1 == r2) goto L_0x063f
            int r2 = com.google.android.gms.internal.ads.zzkr.zzavz
            if (r1 != r2) goto L_0x020d
            r47 = r5
            r44 = r6
            r15 = r8
            r31 = r9
            r19 = r10
            r0 = r11
            r50 = r13
            r18 = r14
            r17 = -1
            r29 = 0
            r14 = r4
            r13 = r12
            r4 = r3
            goto L_0x0654
        L_0x020d:
            int r2 = com.google.android.gms.internal.ads.zzkr.zzasw
            if (r1 == r2) goto L_0x0375
            int r2 = com.google.android.gms.internal.ads.zzkr.zzauo
            if (r1 == r2) goto L_0x0375
            int r2 = com.google.android.gms.internal.ads.zzkr.zzatb
            if (r1 == r2) goto L_0x0375
            int r2 = com.google.android.gms.internal.ads.zzkr.zzatd
            if (r1 == r2) goto L_0x0375
            int r2 = com.google.android.gms.internal.ads.zzkr.zzatf
            if (r1 == r2) goto L_0x0375
            int r2 = com.google.android.gms.internal.ads.zzkr.zzati
            if (r1 == r2) goto L_0x0375
            int r2 = com.google.android.gms.internal.ads.zzkr.zzatg
            if (r1 == r2) goto L_0x0375
            int r2 = com.google.android.gms.internal.ads.zzkr.zzath
            if (r1 == r2) goto L_0x0375
            int r2 = com.google.android.gms.internal.ads.zzkr.zzavm
            if (r1 == r2) goto L_0x0375
            int r2 = com.google.android.gms.internal.ads.zzkr.zzavn
            if (r1 == r2) goto L_0x0375
            int r2 = com.google.android.gms.internal.ads.zzkr.zzasz
            if (r1 == r2) goto L_0x0375
            int r2 = com.google.android.gms.internal.ads.zzkr.zzata
            if (r1 == r2) goto L_0x0375
            int r2 = com.google.android.gms.internal.ads.zzkr.zzasx
            if (r1 == r2) goto L_0x0375
            int r2 = com.google.android.gms.internal.ads.zzkr.zzawc
            if (r1 != r2) goto L_0x0254
            r38 = r5
            r39 = r6
            r31 = r9
            r19 = r10
            r0 = r11
            r18 = r14
            r14 = r4
            r11 = r8
            goto L_0x0382
        L_0x0254:
            int r2 = com.google.android.gms.internal.ads.zzkr.zzaux
            if (r1 == r2) goto L_0x02b9
            int r2 = com.google.android.gms.internal.ads.zzkr.zzavi
            if (r1 == r2) goto L_0x02b9
            int r2 = com.google.android.gms.internal.ads.zzkr.zzavj
            if (r1 == r2) goto L_0x02b9
            int r2 = com.google.android.gms.internal.ads.zzkr.zzavk
            if (r1 == r2) goto L_0x02b9
            int r2 = com.google.android.gms.internal.ads.zzkr.zzavl
            if (r1 != r2) goto L_0x026b
            r3 = -1
            r7 = 0
            goto L_0x02bb
        L_0x026b:
            int r2 = com.google.android.gms.internal.ads.zzkr.zzawb
            if (r1 != r2) goto L_0x029a
            java.lang.String r1 = java.lang.Integer.toString(r22)
            java.lang.String r2 = "application/x-camera-motion"
            r3 = -1
            r7 = 0
            com.google.android.gms.internal.ads.zzho r1 = com.google.android.gms.internal.ads.zzho.zza(r1, r2, r7, r3, r15)
            r8.zzaht = r1
            r23 = r4
            r24 = r5
            r37 = r6
            r0 = r8
            r31 = r9
            r19 = r10
            r36 = r11
            r16 = r12
            r48 = r13
            r18 = r14
            r17 = -1
            r25 = 3
            r29 = 0
            r30 = 16
            goto L_0x0868
        L_0x029a:
            r3 = -1
            r7 = 0
            r23 = r4
            r24 = r5
            r37 = r6
            r0 = r8
            r31 = r9
            r19 = r10
            r36 = r11
            r16 = r12
            r48 = r13
            r18 = r14
            r17 = -1
            r25 = 3
            r29 = 0
            r30 = 16
            goto L_0x0868
        L_0x02b9:
            r3 = -1
            r7 = 0
        L_0x02bb:
            int r2 = r5 + 8
            r19 = 8
            int r2 = r2 + 8
            r12.zzbo(r2)
            r29 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = com.google.android.gms.internal.ads.zzkr.zzaux
            java.lang.String r24 = "application/ttml+xml"
            if (r1 != r2) goto L_0x02d8
            r17 = r7
            r2 = 1
            r7 = 0
            r19 = 8
            goto L_0x031d
        L_0x02d8:
            int r2 = com.google.android.gms.internal.ads.zzkr.zzavi
            if (r1 != r2) goto L_0x02f5
            int r1 = r4 + -8
            r19 = 8
            int r1 = r1 + -8
            byte[] r2 = new byte[r1]
            r7 = 0
            r12.zze(r2, r7, r1)
            java.util.List r1 = java.util.Collections.singletonList(r2)
            java.lang.String r2 = "application/x-quicktime-tx3g"
            r17 = r1
            r24 = r2
            r2 = 1
            goto L_0x031d
        L_0x02f5:
            r7 = 0
            r19 = 8
            int r2 = com.google.android.gms.internal.ads.zzkr.zzavj
            if (r1 != r2) goto L_0x0304
            java.lang.String r1 = "application/x-mp4-vtt"
            r24 = r1
            r2 = 1
            r17 = 0
            goto L_0x031d
        L_0x0304:
            int r2 = com.google.android.gms.internal.ads.zzkr.zzavk
            if (r1 != r2) goto L_0x030f
            r29 = r20
            r2 = 1
            r17 = 0
            goto L_0x031d
        L_0x030f:
            int r2 = com.google.android.gms.internal.ads.zzkr.zzavl
            if (r1 != r2) goto L_0x036f
            r2 = 1
            r8.zzawx = r2
            java.lang.String r1 = "application/x-mp4-cea-608"
            r24 = r1
            r17 = 0
        L_0x031d:
            java.lang.String r1 = java.lang.Integer.toString(r22)
            r18 = 0
            r34 = -1
            r35 = 0
            r36 = -1
            r37 = 1
            r2 = r24
            r24 = -1
            r3 = r18
            r18 = r14
            r14 = r4
            r4 = r34
            r38 = r5
            r5 = r35
            r39 = r6
            r6 = r11
            r19 = 0
            r31 = 0
            r7 = r36
            r40 = r8
            r8 = r53
            r31 = r9
            r19 = r10
            r9 = r29
            r0 = r11
            r11 = r17
            com.google.android.gms.internal.ads.zzho r1 = com.google.android.gms.internal.ads.zzho.zza(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11)
            r11 = r40
            r11.zzaht = r1
            r36 = r0
            r0 = r11
            r16 = r12
            r48 = r13
            r23 = r14
            r24 = r38
            r37 = r39
            r17 = -1
            r25 = 3
            r29 = 0
            r30 = 16
            goto L_0x0868
        L_0x036f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0375:
            r38 = r5
            r39 = r6
            r31 = r9
            r19 = r10
            r0 = r11
            r18 = r14
            r14 = r4
            r11 = r8
        L_0x0382:
            r10 = r38
            int r5 = r10 + 8
            r9 = 8
            int r5 = r5 + r9
            r12.zzbo(r5)
            r2 = 6
            if (r54 == 0) goto L_0x0399
            int r4 = r12.readUnsignedShort()
            r12.zzbp(r2)
            goto L_0x039d
        L_0x0399:
            r12.zzbp(r9)
            r4 = 0
        L_0x039d:
            if (r4 == 0) goto L_0x03db
            r8 = 1
            if (r4 != r8) goto L_0x03a4
            r7 = 2
            goto L_0x03dd
        L_0x03a4:
            r7 = 2
            if (r4 != r7) goto L_0x03c4
            r2 = 16
            r12.zzbp(r2)
            long r4 = r12.readLong()
            double r4 = java.lang.Double.longBitsToDouble(r4)
            long r4 = java.lang.Math.round(r4)
            int r2 = (int) r4
            int r4 = r12.zzjd()
            r5 = 20
            r12.zzbp(r5)
            goto L_0x03f0
        L_0x03c4:
            r36 = r0
            r24 = r10
            r0 = r11
            r16 = r12
            r48 = r13
            r23 = r14
            r37 = r39
            r17 = -1
            r25 = 3
            r29 = 0
            r30 = 16
            goto L_0x0868
        L_0x03db:
            r7 = 2
            r8 = 1
        L_0x03dd:
            int r5 = r12.readUnsignedShort()
            r12.zzbp(r2)
            int r2 = r12.zzjc()
            if (r4 != r8) goto L_0x03ef
            r4 = 16
            r12.zzbp(r4)
        L_0x03ef:
            r4 = r5
        L_0x03f0:
            int r5 = r12.getPosition()
            int r6 = com.google.android.gms.internal.ads.zzkr.zzauo
            if (r1 != r6) goto L_0x0402
            r6 = r39
            int r1 = zza((com.google.android.gms.internal.ads.zzpk) r12, (int) r10, (int) r14, (com.google.android.gms.internal.ads.zzkx) r11, (int) r6)
            r12.zzbo(r5)
            goto L_0x0404
        L_0x0402:
            r6 = r39
        L_0x0404:
            int r7 = com.google.android.gms.internal.ads.zzkr.zzatb
            java.lang.String r8 = "audio/raw"
            if (r1 != r7) goto L_0x040e
            java.lang.String r1 = "audio/ac3"
            goto L_0x0457
        L_0x040e:
            int r7 = com.google.android.gms.internal.ads.zzkr.zzatd
            if (r1 != r7) goto L_0x0415
            java.lang.String r1 = "audio/eac3"
            goto L_0x0457
        L_0x0415:
            int r7 = com.google.android.gms.internal.ads.zzkr.zzatf
            if (r1 != r7) goto L_0x041c
            java.lang.String r1 = "audio/vnd.dts"
            goto L_0x0457
        L_0x041c:
            int r7 = com.google.android.gms.internal.ads.zzkr.zzatg
            if (r1 == r7) goto L_0x0455
            int r7 = com.google.android.gms.internal.ads.zzkr.zzath
            if (r1 != r7) goto L_0x0425
            goto L_0x0455
        L_0x0425:
            int r7 = com.google.android.gms.internal.ads.zzkr.zzati
            if (r1 != r7) goto L_0x042c
            java.lang.String r1 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x0457
        L_0x042c:
            int r7 = com.google.android.gms.internal.ads.zzkr.zzavm
            if (r1 != r7) goto L_0x0433
            java.lang.String r1 = "audio/3gpp"
            goto L_0x0457
        L_0x0433:
            int r7 = com.google.android.gms.internal.ads.zzkr.zzavn
            if (r1 != r7) goto L_0x043a
            java.lang.String r1 = "audio/amr-wb"
            goto L_0x0457
        L_0x043a:
            int r7 = com.google.android.gms.internal.ads.zzkr.zzasz
            if (r1 == r7) goto L_0x0453
            int r7 = com.google.android.gms.internal.ads.zzkr.zzata
            if (r1 != r7) goto L_0x0443
            goto L_0x0453
        L_0x0443:
            int r7 = com.google.android.gms.internal.ads.zzkr.zzasx
            if (r1 != r7) goto L_0x044a
            java.lang.String r1 = "audio/mpeg"
            goto L_0x0457
        L_0x044a:
            int r7 = com.google.android.gms.internal.ads.zzkr.zzawc
            if (r1 != r7) goto L_0x0451
            java.lang.String r1 = "audio/alac"
            goto L_0x0457
        L_0x0451:
            r1 = 0
            goto L_0x0457
        L_0x0453:
            r1 = r8
            goto L_0x0457
        L_0x0455:
            java.lang.String r1 = "audio/vnd.dts.hd"
        L_0x0457:
            r7 = r1
            r29 = r2
            r17 = r4
            r30 = 0
        L_0x045e:
            int r1 = r5 - r10
            if (r1 >= r14) goto L_0x05db
            r12.zzbo(r5)
            int r4 = r12.readInt()
            if (r4 <= 0) goto L_0x046d
            r1 = 1
            goto L_0x046e
        L_0x046d:
            r1 = 0
        L_0x046e:
            com.google.android.gms.internal.ads.zzoz.checkArgument(r1, r3)
            int r1 = r12.readInt()
            int r2 = com.google.android.gms.internal.ads.zzkr.zzatx
            if (r1 == r2) goto L_0x0550
            if (r54 == 0) goto L_0x0490
            int r2 = com.google.android.gms.internal.ads.zzkr.zzasy
            if (r1 != r2) goto L_0x0490
            r41 = r3
            r2 = r4
            r44 = r6
            r45 = r7
            r46 = r8
            r47 = r10
            r15 = r11
            r11 = 0
            r16 = 2
            goto L_0x055f
        L_0x0490:
            int r2 = com.google.android.gms.internal.ads.zzkr.zzatc
            if (r1 != r2) goto L_0x04b4
            int r1 = r5 + 8
            r12.zzbo(r1)
            java.lang.String r1 = java.lang.Integer.toString(r22)
            com.google.android.gms.internal.ads.zzho r1 = com.google.android.gms.internal.ads.zzic.zza(r12, r1, r0, r15)
            r11.zzaht = r1
            r41 = r3
            r2 = r4
            r44 = r6
            r45 = r7
            r46 = r8
            r47 = r10
            r15 = r11
            r11 = 0
            r16 = 2
            goto L_0x0549
        L_0x04b4:
            int r2 = com.google.android.gms.internal.ads.zzkr.zzate
            if (r1 != r2) goto L_0x04d8
            int r1 = r5 + 8
            r12.zzbo(r1)
            java.lang.String r1 = java.lang.Integer.toString(r22)
            com.google.android.gms.internal.ads.zzho r1 = com.google.android.gms.internal.ads.zzic.zzb(r12, r1, r0, r15)
            r11.zzaht = r1
            r41 = r3
            r2 = r4
            r44 = r6
            r45 = r7
            r46 = r8
            r47 = r10
            r15 = r11
            r11 = 0
            r16 = 2
            goto L_0x0549
        L_0x04d8:
            int r2 = com.google.android.gms.internal.ads.zzkr.zzatj
            if (r1 != r2) goto L_0x0519
            java.lang.String r1 = java.lang.Integer.toString(r22)
            r34 = 0
            r35 = -1
            r36 = -1
            r37 = 0
            r38 = 0
            r2 = r7
            r41 = r3
            r3 = r34
            r42 = r4
            r4 = r35
            r43 = r5
            r5 = r36
            r44 = r6
            r6 = r17
            r45 = r7
            r16 = 2
            r7 = r29
            r46 = r8
            r8 = r37
            r9 = r53
            r47 = r10
            r10 = r38
            r15 = r11
            r11 = r0
            com.google.android.gms.internal.ads.zzho r1 = com.google.android.gms.internal.ads.zzho.zza(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r15.zzaht = r1
            r2 = r42
            r5 = r43
            r11 = 0
            goto L_0x0549
        L_0x0519:
            r41 = r3
            r42 = r4
            r43 = r5
            r44 = r6
            r45 = r7
            r46 = r8
            r47 = r10
            r15 = r11
            r16 = 2
            int r2 = com.google.android.gms.internal.ads.zzkr.zzawc
            if (r1 != r2) goto L_0x0544
            r2 = r42
            byte[] r1 = new byte[r2]
            r5 = r43
            r12.zzbo(r5)
            r11 = 0
            r12.zze(r1, r11, r2)
            r30 = r1
            r4 = r41
            r7 = r45
            r10 = -1
            goto L_0x05cc
        L_0x0544:
            r2 = r42
            r5 = r43
            r11 = 0
        L_0x0549:
            r4 = r41
            r7 = r45
            r10 = -1
            goto L_0x05cc
        L_0x0550:
            r41 = r3
            r2 = r4
            r44 = r6
            r45 = r7
            r46 = r8
            r47 = r10
            r15 = r11
            r11 = 0
            r16 = 2
        L_0x055f:
            int r3 = com.google.android.gms.internal.ads.zzkr.zzatx
            if (r1 != r3) goto L_0x0567
            r1 = r5
            r4 = r41
            goto L_0x0591
        L_0x0567:
            int r1 = r12.getPosition()
        L_0x056c:
            int r3 = r1 - r5
            if (r3 >= r2) goto L_0x058e
            r12.zzbo(r1)
            int r3 = r12.readInt()
            if (r3 <= 0) goto L_0x057b
            r9 = 1
            goto L_0x057c
        L_0x057b:
            r9 = 0
        L_0x057c:
            r4 = r41
            com.google.android.gms.internal.ads.zzoz.checkArgument(r9, r4)
            int r6 = r12.readInt()
            int r7 = com.google.android.gms.internal.ads.zzkr.zzatx
            if (r6 != r7) goto L_0x058a
            goto L_0x0591
        L_0x058a:
            int r1 = r1 + r3
            r41 = r4
            goto L_0x056c
        L_0x058e:
            r4 = r41
            r1 = -1
        L_0x0591:
            r10 = -1
            if (r1 == r10) goto L_0x05c9
            android.util.Pair r1 = zzb(r12, r1)
            java.lang.Object r3 = r1.first
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.second
            r30 = r1
            byte[] r30 = (byte[]) r30
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x05c7
            android.util.Pair r1 = com.google.android.gms.internal.ads.zzpc.zze(r30)
            java.lang.Object r6 = r1.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r17 = r1
            r7 = r3
            r29 = r6
            goto L_0x05cb
        L_0x05c7:
            r7 = r3
            goto L_0x05cb
        L_0x05c9:
            r7 = r45
        L_0x05cb:
        L_0x05cc:
            int r5 = r5 + r2
            r3 = r4
            r11 = r15
            r6 = r44
            r8 = r46
            r10 = r47
            r9 = 8
            r15 = r53
            goto L_0x045e
        L_0x05db:
            r44 = r6
            r45 = r7
            r46 = r8
            r47 = r10
            r15 = r11
            r10 = -1
            r11 = 0
            r16 = 2
            com.google.android.gms.internal.ads.zzho r1 = r15.zzaht
            if (r1 != 0) goto L_0x0625
            r7 = r45
            if (r7 == 0) goto L_0x0625
            r1 = r46
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x05fa
            r8 = 2
            goto L_0x05fb
        L_0x05fa:
            r8 = -1
        L_0x05fb:
            java.lang.String r1 = java.lang.Integer.toString(r22)
            r3 = 0
            r4 = -1
            r5 = -1
            if (r30 != 0) goto L_0x0606
            r9 = 0
            goto L_0x060b
        L_0x0606:
            java.util.List r2 = java.util.Collections.singletonList(r30)
            r9 = r2
        L_0x060b:
            r24 = 0
            r2 = r7
            r6 = r17
            r7 = r29
            r17 = -1
            r10 = r53
            r29 = 0
            r11 = r24
            r50 = r13
            r13 = r12
            r12 = r0
            com.google.android.gms.internal.ads.zzho r1 = com.google.android.gms.internal.ads.zzho.zza(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r15.zzaht = r1
            goto L_0x062c
        L_0x0625:
            r50 = r13
            r17 = -1
            r29 = 0
            r13 = r12
        L_0x062c:
            r48 = r50
            r36 = r0
            r16 = r13
            r23 = r14
            r0 = r15
            r37 = r44
            r24 = r47
            r25 = 3
            r30 = 16
            goto L_0x0868
        L_0x063f:
            r47 = r5
            r44 = r6
            r15 = r8
            r31 = r9
            r19 = r10
            r0 = r11
            r50 = r13
            r18 = r14
            r17 = -1
            r29 = 0
            r14 = r4
            r13 = r12
            r4 = r3
        L_0x0654:
            r12 = r47
            int r5 = r12 + 8
            r11 = 8
            int r5 = r5 + r11
            r13.zzbo(r5)
            r10 = 16
            r13.zzbp(r10)
            int r6 = r13.readUnsignedShort()
            int r7 = r13.readUnsignedShort()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 50
            r13.zzbp(r3)
            int r3 = r13.getPosition()
            int r5 = com.google.android.gms.internal.ads.zzkr.zzaun
            if (r1 != r5) goto L_0x0686
            r9 = r44
            int r1 = zza((com.google.android.gms.internal.ads.zzpk) r13, (int) r12, (int) r14, (com.google.android.gms.internal.ads.zzkx) r15, (int) r9)
            r13.zzbo(r3)
            goto L_0x0688
        L_0x0686:
            r9 = r44
        L_0x0688:
            r2 = 0
            r5 = 0
            r23 = 0
            r24 = 1065353216(0x3f800000, float:1.0)
            r30 = 0
            r34 = -1
        L_0x0695:
            int r8 = r3 - r12
            if (r8 >= r14) goto L_0x0816
            r13.zzbo(r3)
            int r8 = r13.getPosition()
            int r10 = r13.readInt()
            if (r10 != 0) goto L_0x06b6
            int r36 = r13.getPosition()
            int r11 = r36 - r12
            if (r11 == r14) goto L_0x06af
            goto L_0x06b6
        L_0x06af:
            r36 = r0
            r4 = 2
            r8 = 1
            r11 = 3
            goto L_0x081b
        L_0x06b6:
            if (r10 <= 0) goto L_0x06ba
            r11 = 1
            goto L_0x06bb
        L_0x06ba:
            r11 = 0
        L_0x06bb:
            com.google.android.gms.internal.ads.zzoz.checkArgument(r11, r4)
            int r11 = r13.readInt()
            r36 = r0
            int r0 = com.google.android.gms.internal.ads.zzkr.zzatv
            if (r11 != r0) goto L_0x06f4
            if (r2 != 0) goto L_0x06cc
            r0 = 1
            goto L_0x06cd
        L_0x06cc:
            r0 = 0
        L_0x06cd:
            com.google.android.gms.internal.ads.zzoz.checkState(r0)
            int r8 = r8 + 8
            r13.zzbo(r8)
            com.google.android.gms.internal.ads.zzps r0 = com.google.android.gms.internal.ads.zzps.zzg(r13)
            java.util.List<byte[]> r2 = r0.zzaha
            int r8 = r0.zzasn
            r15.zzasn = r8
            if (r5 != 0) goto L_0x06e6
            float r0 = r0.zzbjy
            r24 = r0
        L_0x06e6:
            java.lang.String r0 = "video/avc"
            r37 = r1
            r23 = r2
            r41 = r4
            r4 = 2
            r8 = 1
            r11 = 3
            r2 = r0
            goto L_0x0809
        L_0x06f4:
            int r0 = com.google.android.gms.internal.ads.zzkr.zzatw
            if (r11 != r0) goto L_0x071e
            if (r2 != 0) goto L_0x06fc
            r0 = 1
            goto L_0x06fd
        L_0x06fc:
            r0 = 0
        L_0x06fd:
            com.google.android.gms.internal.ads.zzoz.checkState(r0)
            int r8 = r8 + 8
            r13.zzbo(r8)
            com.google.android.gms.internal.ads.zzpy r0 = com.google.android.gms.internal.ads.zzpy.zzi(r13)
            java.util.List<byte[]> r2 = r0.zzaha
            int r0 = r0.zzasn
            r15.zzasn = r0
            java.lang.String r0 = "video/hevc"
            r37 = r1
            r23 = r2
            r41 = r4
            r4 = 2
            r8 = 1
            r11 = 3
            r2 = r0
            goto L_0x0809
        L_0x071e:
            int r0 = com.google.android.gms.internal.ads.zzkr.zzawa
            if (r11 != r0) goto L_0x073d
            if (r2 != 0) goto L_0x0726
            r0 = 1
            goto L_0x0727
        L_0x0726:
            r0 = 0
        L_0x0727:
            com.google.android.gms.internal.ads.zzoz.checkState(r0)
            int r0 = com.google.android.gms.internal.ads.zzkr.zzavy
            if (r1 != r0) goto L_0x0731
            java.lang.String r0 = "video/x-vnd.on2.vp8"
            goto L_0x0733
        L_0x0731:
            java.lang.String r0 = "video/x-vnd.on2.vp9"
        L_0x0733:
            r2 = r0
            r37 = r1
            r41 = r4
            r4 = 2
            r8 = 1
            r11 = 3
            goto L_0x0809
        L_0x073d:
            int r0 = com.google.android.gms.internal.ads.zzkr.zzasu
            if (r11 != r0) goto L_0x0754
            if (r2 != 0) goto L_0x0745
            r0 = 1
            goto L_0x0746
        L_0x0745:
            r0 = 0
        L_0x0746:
            com.google.android.gms.internal.ads.zzoz.checkState(r0)
            java.lang.String r2 = "video/3gpp"
            r37 = r1
            r41 = r4
            r4 = 2
            r8 = 1
            r11 = 3
            goto L_0x0809
        L_0x0754:
            int r0 = com.google.android.gms.internal.ads.zzkr.zzatx
            if (r11 != r0) goto L_0x077a
            if (r2 != 0) goto L_0x075c
            r0 = 1
            goto L_0x075d
        L_0x075c:
            r0 = 0
        L_0x075d:
            com.google.android.gms.internal.ads.zzoz.checkState(r0)
            android.util.Pair r0 = zzb(r13, r8)
            java.lang.Object r2 = r0.first
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.second
            byte[] r0 = (byte[]) r0
            java.util.List r23 = java.util.Collections.singletonList(r0)
            r37 = r1
            r41 = r4
            r4 = 2
            r8 = 1
            r11 = 3
            goto L_0x0809
        L_0x077a:
            int r0 = com.google.android.gms.internal.ads.zzkr.zzauw
            if (r11 != r0) goto L_0x079b
            int r8 = r8 + 8
            r13.zzbo(r8)
            int r0 = r13.zzjd()
            int r5 = r13.zzjd()
            float r0 = (float) r0
            float r5 = (float) r5
            float r24 = r0 / r5
            r37 = r1
            r41 = r4
            r4 = 2
            r5 = 1
            r8 = 1
            r11 = 3
            goto L_0x0809
        L_0x079b:
            int r0 = com.google.android.gms.internal.ads.zzkr.zzavw
            if (r11 != r0) goto L_0x07d2
            int r0 = r8 + 8
        L_0x07a2:
            int r11 = r0 - r8
            if (r11 >= r10) goto L_0x07c7
            r13.zzbo(r0)
            int r11 = r13.readInt()
            r37 = r1
            int r1 = r13.readInt()
            r41 = r4
            int r4 = com.google.android.gms.internal.ads.zzkr.zzavx
            if (r1 != r4) goto L_0x07c1
            byte[] r1 = r13.data
            int r11 = r11 + r0
            byte[] r8 = java.util.Arrays.copyOfRange(r1, r0, r11)
            goto L_0x07cc
        L_0x07c1:
            int r0 = r0 + r11
            r1 = r37
            r4 = r41
            goto L_0x07a2
        L_0x07c7:
            r37 = r1
            r41 = r4
            r8 = 0
        L_0x07cc:
            r30 = r8
            r4 = 2
            r8 = 1
            r11 = 3
            goto L_0x0809
        L_0x07d2:
            r37 = r1
            r41 = r4
            int r0 = com.google.android.gms.internal.ads.zzkr.zzavv
            if (r11 != r0) goto L_0x0806
            int r0 = r13.readUnsignedByte()
            r11 = 3
            r13.zzbp(r11)
            if (r0 != 0) goto L_0x0803
            int r0 = r13.readUnsignedByte()
            if (r0 == 0) goto L_0x07fe
            r8 = 1
            if (r0 == r8) goto L_0x07fa
            r4 = 2
            if (r0 == r4) goto L_0x07f6
            if (r0 == r11) goto L_0x07f3
            goto L_0x0809
        L_0x07f3:
            r34 = 3
            goto L_0x0809
        L_0x07f6:
            r34 = 2
            goto L_0x0809
        L_0x07fa:
            r4 = 2
            r34 = 1
            goto L_0x0809
        L_0x07fe:
            r4 = 2
            r8 = 1
            r34 = 0
            goto L_0x0809
        L_0x0803:
            r4 = 2
            r8 = 1
            goto L_0x0809
        L_0x0806:
            r4 = 2
            r8 = 1
            r11 = 3
        L_0x0809:
            int r3 = r3 + r10
            r0 = r36
            r1 = r37
            r4 = r41
            r10 = 16
            r11 = 8
            goto L_0x0695
        L_0x0816:
            r36 = r0
            r4 = 2
            r8 = 1
            r11 = 3
        L_0x081b:
            if (r2 == 0) goto L_0x0858
            java.lang.String r1 = java.lang.Integer.toString(r22)
            r3 = 0
            r0 = -1
            r5 = -1
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            r16 = 0
            r25 = 2
            r4 = r0
            r0 = 1
            r8 = r10
            r37 = r9
            r9 = r23
            r23 = 16
            r10 = r28
            r0 = 8
            r35 = 3
            r11 = r24
            r24 = r12
            r12 = r30
            r48 = r50
            r0 = r13
            r25 = 3
            r13 = r34
            r23 = r14
            r30 = 16
            r14 = r16
            r16 = r0
            r0 = r15
            r15 = r53
            com.google.android.gms.internal.ads.zzho r1 = com.google.android.gms.internal.ads.zzho.zza(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.zzaht = r1
            goto L_0x0867
        L_0x0858:
            r48 = r50
            r37 = r9
            r24 = r12
            r16 = r13
            r23 = r14
            r0 = r15
            r25 = 3
            r30 = 16
        L_0x0867:
        L_0x0868:
            int r5 = r24 + r23
            r1 = r16
            r1.zzbo(r5)
            int r6 = r37 + 1
            r15 = r53
            r8 = r0
            r12 = r1
            r14 = r18
            r10 = r19
            r9 = r31
            r11 = r36
            r13 = r48
            r7 = 8
            r0 = r49
            goto L_0x01ba
        L_0x0885:
            r0 = r8
            r19 = r10
            r48 = r13
            r18 = r14
            r29 = 0
            int r1 = com.google.android.gms.internal.ads.zzkr.zzaud
            r2 = r49
            com.google.android.gms.internal.ads.zzku r1 = r2.zzav(r1)
            if (r1 == 0) goto L_0x08f6
            int r2 = com.google.android.gms.internal.ads.zzkr.zzaue
            com.google.android.gms.internal.ads.zzkt r1 = r1.zzau(r2)
            if (r1 != 0) goto L_0x08a2
            goto L_0x08f6
        L_0x08a2:
            com.google.android.gms.internal.ads.zzpk r1 = r1.zzawe
            r2 = 8
            r1.zzbo(r2)
            int r2 = r1.readInt()
            int r2 = com.google.android.gms.internal.ads.zzkr.zzaq(r2)
            int r3 = r1.zzjd()
            long[] r4 = new long[r3]
            long[] r5 = new long[r3]
            r9 = 0
        L_0x08ba:
            if (r9 >= r3) goto L_0x08ef
            r6 = 1
            if (r2 != r6) goto L_0x08c5
            long r7 = r1.zzje()
            goto L_0x08c9
        L_0x08c5:
            long r7 = r1.zzja()
        L_0x08c9:
            r4[r9] = r7
            if (r2 != r6) goto L_0x08d2
            long r6 = r1.readLong()
            goto L_0x08d7
        L_0x08d2:
            int r6 = r1.readInt()
            long r6 = (long) r6
        L_0x08d7:
            r5[r9] = r6
            short r6 = r1.readShort()
            r7 = 1
            if (r6 != r7) goto L_0x08e7
            r6 = 2
            r1.zzbp(r6)
            int r9 = r9 + 1
            goto L_0x08ba
        L_0x08e7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x08ef:
            android.util.Pair r1 = android.util.Pair.create(r4, r5)
            r2 = r1
            r1 = 0
            goto L_0x08fb
        L_0x08f6:
            r1 = 0
            android.util.Pair r2 = android.util.Pair.create(r1, r1)
        L_0x08fb:
            com.google.android.gms.internal.ads.zzho r3 = r0.zzaht
            if (r3 != 0) goto L_0x0901
            return r1
        L_0x0901:
            com.google.android.gms.internal.ads.zzln r1 = new com.google.android.gms.internal.ads.zzln
            int r16 = r18.id
            r3 = r48
            java.lang.Object r3 = r3.first
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            com.google.android.gms.internal.ads.zzho r5 = r0.zzaht
            int r6 = r0.zzawx
            com.google.android.gms.internal.ads.zzlq[] r7 = r0.zzaww
            int r0 = r0.zzasn
            java.lang.Object r8 = r2.first
            r28 = r8
            long[] r28 = (long[]) r28
            java.lang.Object r2 = r2.second
            r29 = r2
            long[] r29 = (long[]) r29
            r15 = r1
            r17 = r19
            r18 = r3
            r20 = r32
            r22 = r26
            r24 = r5
            r25 = r6
            r26 = r7
            r27 = r0
            r15.<init>(r16, r17, r18, r20, r22, r24, r25, r26, r27, r28, r29)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkw.zza(com.google.android.gms.internal.ads.zzku, com.google.android.gms.internal.ads.zzkt, long, com.google.android.gms.internal.ads.zzjn, boolean):com.google.android.gms.internal.ads.zzln");
    }

    /* JADX WARNING: Removed duplicated region for block: B:208:0x04cb  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x04db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzls zza(com.google.android.gms.internal.ads.zzln r44, com.google.android.gms.internal.ads.zzku r45, com.google.android.gms.internal.ads.zzjz r46) throws com.google.android.gms.internal.ads.zzhv {
        /*
            r0 = r44
            r1 = r45
            r2 = r46
            int r3 = com.google.android.gms.internal.ads.zzkr.zzave
            com.google.android.gms.internal.ads.zzkt r3 = r1.zzau(r3)
            if (r3 == 0) goto L_0x0014
            com.google.android.gms.internal.ads.zzla r4 = new com.google.android.gms.internal.ads.zzla
            r4.<init>(r3)
            goto L_0x0021
        L_0x0014:
            int r3 = com.google.android.gms.internal.ads.zzkr.zzavf
            com.google.android.gms.internal.ads.zzkt r3 = r1.zzau(r3)
            if (r3 == 0) goto L_0x0500
            com.google.android.gms.internal.ads.zzkz r4 = new com.google.android.gms.internal.ads.zzkz
            r4.<init>(r3)
        L_0x0021:
            int r3 = r4.zzgw()
            r5 = 0
            if (r3 != 0) goto L_0x0038
            com.google.android.gms.internal.ads.zzls r0 = new com.google.android.gms.internal.ads.zzls
            long[] r7 = new long[r5]
            int[] r8 = new int[r5]
            r9 = 0
            long[] r10 = new long[r5]
            int[] r11 = new int[r5]
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            return r0
        L_0x0038:
            int r6 = com.google.android.gms.internal.ads.zzkr.zzavg
            com.google.android.gms.internal.ads.zzkt r6 = r1.zzau(r6)
            r7 = 1
            if (r6 != 0) goto L_0x004b
            int r6 = com.google.android.gms.internal.ads.zzkr.zzavh
            com.google.android.gms.internal.ads.zzkt r6 = r1.zzau(r6)
            r8 = 1
            goto L_0x004c
        L_0x004b:
            r8 = 0
        L_0x004c:
            com.google.android.gms.internal.ads.zzpk r6 = r6.zzawe
            int r9 = com.google.android.gms.internal.ads.zzkr.zzavd
            com.google.android.gms.internal.ads.zzkt r9 = r1.zzau(r9)
            com.google.android.gms.internal.ads.zzpk r9 = r9.zzawe
            int r10 = com.google.android.gms.internal.ads.zzkr.zzava
            com.google.android.gms.internal.ads.zzkt r10 = r1.zzau(r10)
            com.google.android.gms.internal.ads.zzpk r10 = r10.zzawe
            int r11 = com.google.android.gms.internal.ads.zzkr.zzavb
            com.google.android.gms.internal.ads.zzkt r11 = r1.zzau(r11)
            r12 = 0
            if (r11 == 0) goto L_0x006a
            com.google.android.gms.internal.ads.zzpk r11 = r11.zzawe
            goto L_0x006b
        L_0x006a:
            r11 = r12
        L_0x006b:
            int r13 = com.google.android.gms.internal.ads.zzkr.zzavc
            com.google.android.gms.internal.ads.zzkt r1 = r1.zzau(r13)
            if (r1 == 0) goto L_0x0076
            com.google.android.gms.internal.ads.zzpk r1 = r1.zzawe
            goto L_0x0077
        L_0x0076:
            r1 = r12
        L_0x0077:
            com.google.android.gms.internal.ads.zzkv r13 = new com.google.android.gms.internal.ads.zzkv
            r13.<init>(r9, r6, r8)
            r6 = 12
            r10.zzbo(r6)
            int r8 = r10.zzjd()
            int r8 = r8 - r7
            int r9 = r10.zzjd()
            int r14 = r10.zzjd()
            if (r1 == 0) goto L_0x009b
            r1.zzbo(r6)
            int r15 = r1.zzjd()
            goto L_0x009c
        L_0x009b:
            r15 = 0
        L_0x009c:
            r16 = -1
            if (r11 == 0) goto L_0x00b4
            r11.zzbo(r6)
            int r6 = r11.zzjd()
            if (r6 <= 0) goto L_0x00b3
            int r12 = r11.zzjd()
            int r16 = r12 + -1
            r12 = r11
            goto L_0x00b6
        L_0x00b3:
            goto L_0x00b6
        L_0x00b4:
            r12 = r11
            r6 = 0
        L_0x00b6:
            boolean r11 = r4.zzgy()
            if (r11 == 0) goto L_0x00d0
            com.google.android.gms.internal.ads.zzho r11 = r0.zzaht
            java.lang.String r11 = r11.zzagy
            java.lang.String r5 = "audio/raw"
            boolean r5 = r5.equals(r11)
            if (r5 == 0) goto L_0x00d0
            if (r8 != 0) goto L_0x00d0
            if (r15 != 0) goto L_0x00d0
            if (r6 != 0) goto L_0x00d0
            r5 = 1
            goto L_0x00d1
        L_0x00d0:
            r5 = 0
        L_0x00d1:
            r18 = 0
            if (r5 != 0) goto L_0x020c
            long[] r5 = new long[r3]
            int[] r11 = new int[r3]
            long[] r7 = new long[r3]
            r45 = r6
            int[] r6 = new int[r3]
            r23 = r10
            r2 = r16
            r25 = r18
            r27 = r25
            r0 = 0
            r10 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r16 = r15
            r15 = r14
            r14 = r9
            r9 = r8
            r8 = r45
        L_0x00fa:
            if (r0 >= r3) goto L_0x0198
        L_0x00fc:
            if (r22 != 0) goto L_0x0116
            boolean r22 = r13.zzgv()
            com.google.android.gms.internal.ads.zzoz.checkState(r22)
            r45 = r14
            r29 = r15
            long r14 = r13.zzawj
            r25 = r14
            int r14 = r13.zzawi
            r22 = r14
            r15 = r29
            r14 = r45
            goto L_0x00fc
        L_0x0116:
            r45 = r14
            r29 = r15
            if (r1 == 0) goto L_0x0130
        L_0x011c:
            if (r21 != 0) goto L_0x012b
            if (r16 <= 0) goto L_0x012b
            int r21 = r1.zzjd()
            int r24 = r1.readInt()
            int r16 = r16 + -1
            goto L_0x011c
        L_0x012b:
            int r21 = r21 + -1
            r14 = r24
            goto L_0x0132
        L_0x0130:
            r14 = r24
        L_0x0132:
            r5[r0] = r25
            int r15 = r4.zzgx()
            r11[r0] = r15
            r15 = r11[r0]
            if (r15 <= r10) goto L_0x0140
            r10 = r11[r0]
        L_0x0140:
            r24 = r3
            r15 = r4
            long r3 = (long) r14
            long r3 = r27 + r3
            r7[r0] = r3
            if (r12 != 0) goto L_0x014c
            r3 = 1
            goto L_0x014d
        L_0x014c:
            r3 = 0
        L_0x014d:
            r6[r0] = r3
            if (r0 != r2) goto L_0x015d
            r3 = 1
            r6[r0] = r3
            int r8 = r8 + -1
            if (r8 <= 0) goto L_0x015d
            int r2 = r12.zzjd()
            int r2 = r2 - r3
        L_0x015d:
            r3 = r29
            r29 = r5
            long r4 = (long) r3
            long r27 = r27 + r4
            int r4 = r45 + -1
            if (r4 != 0) goto L_0x0175
            if (r9 <= 0) goto L_0x0175
            int r3 = r23.zzjd()
            int r4 = r23.zzjd()
            int r9 = r9 + -1
            goto L_0x017a
        L_0x0175:
            r43 = r4
            r4 = r3
            r3 = r43
        L_0x017a:
            r5 = r11[r0]
            r30 = r2
            r45 = r3
            long r2 = (long) r5
            long r25 = r25 + r2
            int r22 = r22 + -1
            int r0 = r0 + 1
            r3 = r24
            r5 = r29
            r2 = r30
            r24 = r14
            r14 = r45
            r43 = r15
            r15 = r4
            r4 = r43
            goto L_0x00fa
        L_0x0198:
            r24 = r3
            r29 = r5
            r45 = r14
            if (r21 != 0) goto L_0x01a2
            r0 = 1
            goto L_0x01a3
        L_0x01a2:
            r0 = 0
        L_0x01a3:
            com.google.android.gms.internal.ads.zzoz.checkArgument(r0)
        L_0x01a6:
            if (r16 <= 0) goto L_0x01ba
            int r0 = r1.zzjd()
            if (r0 != 0) goto L_0x01b0
            r0 = 1
            goto L_0x01b1
        L_0x01b0:
            r0 = 0
        L_0x01b1:
            com.google.android.gms.internal.ads.zzoz.checkArgument(r0)
            r1.readInt()
            int r16 = r16 + -1
            goto L_0x01a6
        L_0x01ba:
            if (r8 != 0) goto L_0x01c8
            if (r45 != 0) goto L_0x01c8
            r0 = r22
            if (r0 != 0) goto L_0x01ca
            if (r9 == 0) goto L_0x01c5
            goto L_0x01ca
        L_0x01c5:
            r1 = r44
            goto L_0x0208
        L_0x01c8:
            r0 = r22
        L_0x01ca:
            r1 = r44
            int r2 = r1.id
            r3 = 215(0xd7, float:3.01E-43)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Inconsistent stbl box for track "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = ": remainingSynchronizationSamples "
            r4.append(r2)
            r4.append(r8)
            java.lang.String r2 = ", remainingSamplesAtTimestampDelta "
            r4.append(r2)
            r2 = r45
            r4.append(r2)
            java.lang.String r2 = ", remainingSamplesInChunk "
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = ", remainingTimestampDeltaChanges "
            r4.append(r0)
            r4.append(r9)
            java.lang.String r0 = r4.toString()
            java.lang.String r2 = "AtomParsers"
            android.util.Log.w(r2, r0)
        L_0x0208:
            r5 = r29
            goto L_0x02a9
        L_0x020c:
            r1 = r0
            r24 = r3
            r15 = r4
            int r0 = r13.length
            long[] r0 = new long[r0]
            int r2 = r13.length
            int[] r3 = new int[r2]
        L_0x0218:
            boolean r4 = r13.zzgv()
            if (r4 == 0) goto L_0x022b
            int r4 = r13.index
            long r5 = r13.zzawj
            r0[r4] = r5
            int r4 = r13.index
            int r5 = r13.zzawi
            r3[r4] = r5
            goto L_0x0218
        L_0x022b:
            int r4 = r15.zzgx()
            long r5 = (long) r14
            r7 = 8192(0x2000, float:1.14794E-41)
            int r7 = r7 / r4
            r8 = 0
            r9 = 0
        L_0x0236:
            if (r8 >= r2) goto L_0x0242
            r10 = r3[r8]
            int r10 = com.google.android.gms.internal.ads.zzpq.zzf(r10, r7)
            int r9 = r9 + r10
            int r8 = r8 + 1
            goto L_0x0236
        L_0x0242:
            long[] r11 = new long[r9]
            int[] r12 = new int[r9]
            long[] r14 = new long[r9]
            int[] r15 = new int[r9]
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = 0
        L_0x0251:
            if (r8 >= r2) goto L_0x0294
            r16 = r3[r8]
            r21 = r0[r8]
            r43 = r16
            r16 = r0
            r0 = r43
        L_0x025d:
            if (r0 <= 0) goto L_0x028b
            int r23 = java.lang.Math.min(r7, r0)
            r11[r10] = r21
            int r25 = r4 * r23
            r12[r10] = r25
            r25 = r2
            r2 = r12[r10]
            int r13 = java.lang.Math.max(r13, r2)
            r26 = r3
            long r2 = (long) r9
            long r2 = r2 * r5
            r14[r10] = r2
            r2 = 1
            r15[r10] = r2
            r2 = r12[r10]
            long r2 = (long) r2
            long r21 = r21 + r2
            int r9 = r9 + r23
            int r0 = r0 - r23
            int r10 = r10 + 1
            r2 = r25
            r3 = r26
            goto L_0x025d
        L_0x028b:
            r25 = r2
            r26 = r3
            int r8 = r8 + 1
            r0 = r16
            goto L_0x0251
        L_0x0294:
            com.google.android.gms.internal.ads.zzld r0 = new com.google.android.gms.internal.ads.zzld
            r16 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            long[] r5 = r0.zzaok
            int[] r11 = r0.zzaoj
            int r10 = r0.zzaxe
            long[] r7 = r0.zzaxf
            int[] r6 = r0.zzaxg
            r27 = r18
        L_0x02a9:
            long[] r0 = r1.zzbac
            if (r0 == 0) goto L_0x04e3
            boolean r0 = r46.zzgq()
            if (r0 == 0) goto L_0x02b8
            r9 = r5
            r45 = r10
            goto L_0x04e6
        L_0x02b8:
            long[] r0 = r1.zzbac
            int r0 = r0.length
            r4 = 1
            if (r0 != r4) goto L_0x034e
            int r0 = r1.type
            if (r0 != r4) goto L_0x034e
            int r0 = r7.length
            r4 = 2
            if (r0 < r4) goto L_0x034e
            long[] r0 = r1.zzbad
            r4 = 0
            r8 = r0[r4]
            long[] r0 = r1.zzbac
            r12 = r0[r4]
            long r14 = r1.zzdg
            long r2 = r1.zzazz
            r16 = r2
            long r2 = com.google.android.gms.internal.ads.zzpq.zza((long) r12, (long) r14, (long) r16)
            long r2 = r2 + r8
            r12 = r7[r4]
            int r0 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x034e
            r0 = 1
            r12 = r7[r0]
            int r4 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r4 >= 0) goto L_0x034e
            int r4 = r7.length
            int r4 = r4 - r0
            r12 = r7[r4]
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x034e
            int r0 = (r2 > r27 ? 1 : (r2 == r27 ? 0 : -1))
            if (r0 > 0) goto L_0x034e
            long r29 = r27 - r2
            r0 = 0
            r2 = r7[r0]
            long r31 = r8 - r2
            com.google.android.gms.internal.ads.zzho r0 = r1.zzaht
            int r0 = r0.zzahj
            long r2 = (long) r0
            long r8 = r1.zzdg
            r33 = r2
            r35 = r8
            long r2 = com.google.android.gms.internal.ads.zzpq.zza((long) r31, (long) r33, (long) r35)
            com.google.android.gms.internal.ads.zzho r0 = r1.zzaht
            int r0 = r0.zzahj
            long r8 = (long) r0
            long r12 = r1.zzdg
            r31 = r8
            r33 = r12
            long r8 = com.google.android.gms.internal.ads.zzpq.zza((long) r29, (long) r31, (long) r33)
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x0321
            int r0 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x034e
        L_0x0321:
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x034e
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x034e
            int r0 = (int) r2
            r2 = r46
            r2.zzahl = r0
            int r0 = (int) r8
            r2.zzahm = r0
            long r0 = r1.zzdg
            r2 = 1000000(0xf4240, double:4.940656E-318)
            com.google.android.gms.internal.ads.zzpq.zza((long[]) r7, (long) r2, (long) r0)
            com.google.android.gms.internal.ads.zzls r0 = new com.google.android.gms.internal.ads.zzls
            r25 = r0
            r26 = r5
            r27 = r11
            r28 = r10
            r29 = r7
            r30 = r6
            r25.<init>(r26, r27, r28, r29, r30)
            return r0
        L_0x034e:
            long[] r0 = r1.zzbac
            int r0 = r0.length
            r2 = 1
            if (r0 != r2) goto L_0x038e
            long[] r0 = r1.zzbac
            r17 = 0
            r2 = r0[r17]
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x038e
            r0 = 0
        L_0x035f:
            int r2 = r7.length
            if (r0 >= r2) goto L_0x037c
            r2 = r7[r0]
            long[] r4 = r1.zzbad
            r8 = r4[r17]
            long r18 = r2 - r8
            r20 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r1.zzdg
            r22 = r2
            long r2 = com.google.android.gms.internal.ads.zzpq.zza((long) r18, (long) r20, (long) r22)
            r7[r0] = r2
            int r0 = r0 + 1
            r17 = 0
            goto L_0x035f
        L_0x037c:
            com.google.android.gms.internal.ads.zzls r0 = new com.google.android.gms.internal.ads.zzls
            r25 = r0
            r26 = r5
            r27 = r11
            r28 = r10
            r29 = r7
            r30 = r6
            r25.<init>(r26, r27, r28, r29, r30)
            return r0
        L_0x038e:
            int r0 = r1.type
            r2 = 1
            if (r0 != r2) goto L_0x0395
            r3 = 1
            goto L_0x0396
        L_0x0395:
            r3 = 0
        L_0x0396:
            r0 = 0
            r2 = 0
            r4 = 0
            r8 = 0
        L_0x039d:
            long[] r9 = r1.zzbac
            int r9 = r9.length
            r12 = -1
            if (r4 >= r9) goto L_0x03db
            long[] r9 = r1.zzbad
            r14 = r9[r4]
            int r9 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r9 == 0) goto L_0x03d4
            long[] r9 = r1.zzbac
            r25 = r9[r4]
            long r12 = r1.zzdg
            r45 = r10
            long r9 = r1.zzazz
            r27 = r12
            r29 = r9
            long r9 = com.google.android.gms.internal.ads.zzpq.zza((long) r25, (long) r27, (long) r29)
            r12 = 1
            int r13 = com.google.android.gms.internal.ads.zzpq.zzb(r7, r14, r12, r12)
            long r14 = r14 + r9
            r9 = 0
            int r10 = com.google.android.gms.internal.ads.zzpq.zzb(r7, r14, r3, r9)
            int r9 = r10 - r13
            int r2 = r2 + r9
            if (r8 == r13) goto L_0x03d0
            r8 = 1
            goto L_0x03d1
        L_0x03d0:
            r8 = 0
        L_0x03d1:
            r0 = r0 | r8
            r8 = r10
            goto L_0x03d6
        L_0x03d4:
            r45 = r10
        L_0x03d6:
            int r4 = r4 + 1
            r10 = r45
            goto L_0x039d
        L_0x03db:
            r45 = r10
            r4 = r24
            if (r2 == r4) goto L_0x03e3
            r4 = 1
            goto L_0x03e4
        L_0x03e3:
            r4 = 0
        L_0x03e4:
            r0 = r0 | r4
            if (r0 == 0) goto L_0x03ea
            long[] r4 = new long[r2]
            goto L_0x03eb
        L_0x03ea:
            r4 = r5
        L_0x03eb:
            if (r0 == 0) goto L_0x03f0
            int[] r8 = new int[r2]
            goto L_0x03f1
        L_0x03f0:
            r8 = r11
        L_0x03f1:
            if (r0 == 0) goto L_0x03f5
            r10 = 0
            goto L_0x03f7
        L_0x03f5:
            r10 = r45
        L_0x03f7:
            if (r0 == 0) goto L_0x03fc
            int[] r9 = new int[r2]
            goto L_0x03fd
        L_0x03fc:
            r9 = r6
        L_0x03fd:
            long[] r2 = new long[r2]
            r24 = r10
            r10 = 0
            r14 = 0
        L_0x0405:
            long[] r15 = r1.zzbac
            int r15 = r15.length
            if (r10 >= r15) goto L_0x04ae
            long[] r15 = r1.zzbad
            r12 = r15[r10]
            long[] r15 = r1.zzbac
            r35 = r15[r10]
            r15 = -1
            int r21 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r21 == 0) goto L_0x0498
            r27 = r9
            r28 = r10
            long r9 = r1.zzdg
            r46 = r4
            r37 = r5
            long r4 = r1.zzazz
            r29 = r35
            r31 = r9
            r33 = r4
            long r4 = com.google.android.gms.internal.ads.zzpq.zza((long) r29, (long) r31, (long) r33)
            long r4 = r4 + r12
            r9 = 1
            int r10 = com.google.android.gms.internal.ads.zzpq.zzb(r7, r12, r9, r9)
            r9 = 0
            int r4 = com.google.android.gms.internal.ads.zzpq.zzb(r7, r4, r3, r9)
            if (r0 == 0) goto L_0x044f
            int r5 = r4 - r10
            r15 = r46
            r9 = r37
            java.lang.System.arraycopy(r9, r10, r15, r14, r5)
            java.lang.System.arraycopy(r11, r10, r8, r14, r5)
            r16 = r3
            r3 = r27
            java.lang.System.arraycopy(r6, r10, r3, r14, r5)
            goto L_0x0457
        L_0x044f:
            r15 = r46
            r16 = r3
            r3 = r27
            r9 = r37
        L_0x0457:
            r5 = r24
        L_0x0459:
            if (r10 >= r4) goto L_0x0493
            r23 = 1000000(0xf4240, double:4.940656E-318)
            r29 = r3
            r27 = r4
            long r3 = r1.zzazz
            r21 = r18
            r25 = r3
            long r3 = com.google.android.gms.internal.ads.zzpq.zza((long) r21, (long) r23, (long) r25)
            r21 = r7[r10]
            long r37 = r21 - r12
            r39 = 1000000(0xf4240, double:4.940656E-318)
            r21 = r12
            long r12 = r1.zzdg
            r41 = r12
            long r12 = com.google.android.gms.internal.ads.zzpq.zza((long) r37, (long) r39, (long) r41)
            long r3 = r3 + r12
            r2[r14] = r3
            if (r0 == 0) goto L_0x0488
            r3 = r8[r14]
            if (r3 <= r5) goto L_0x0488
            r5 = r11[r10]
        L_0x0488:
            int r14 = r14 + 1
            int r10 = r10 + 1
            r12 = r21
            r4 = r27
            r3 = r29
            goto L_0x0459
        L_0x0493:
            r29 = r3
            r24 = r5
            goto L_0x04a0
        L_0x0498:
            r16 = r3
            r15 = r4
            r29 = r9
            r28 = r10
            r9 = r5
        L_0x04a0:
            long r18 = r18 + r35
            int r10 = r28 + 1
            r5 = r9
            r4 = r15
            r3 = r16
            r9 = r29
            r12 = -1
            goto L_0x0405
        L_0x04ae:
            r15 = r4
            r29 = r9
            r0 = 0
            r4 = 0
        L_0x04b3:
            r6 = r29
            int r1 = r6.length
            if (r4 >= r1) goto L_0x04c9
            if (r0 != 0) goto L_0x04c9
            r1 = r6[r4]
            r3 = 1
            r1 = r1 & r3
            if (r1 == 0) goto L_0x04c2
            r1 = 1
            goto L_0x04c3
        L_0x04c2:
            r1 = 0
        L_0x04c3:
            r0 = r0 | r1
            int r4 = r4 + 1
            r29 = r6
            goto L_0x04b3
        L_0x04c9:
            if (r0 == 0) goto L_0x04db
            com.google.android.gms.internal.ads.zzls r0 = new com.google.android.gms.internal.ads.zzls
            r21 = r0
            r22 = r15
            r23 = r8
            r25 = r2
            r26 = r6
            r21.<init>(r22, r23, r24, r25, r26)
            return r0
        L_0x04db:
            com.google.android.gms.internal.ads.zzhv r0 = new com.google.android.gms.internal.ads.zzhv
            java.lang.String r1 = "The edited sample sequence does not contain a sync sample."
            r0.<init>(r1)
            throw r0
        L_0x04e3:
            r9 = r5
            r45 = r10
        L_0x04e6:
            long r0 = r1.zzdg
            r2 = 1000000(0xf4240, double:4.940656E-318)
            com.google.android.gms.internal.ads.zzpq.zza((long[]) r7, (long) r2, (long) r0)
            com.google.android.gms.internal.ads.zzls r0 = new com.google.android.gms.internal.ads.zzls
            r25 = r0
            r26 = r9
            r27 = r11
            r28 = r45
            r29 = r7
            r30 = r6
            r25.<init>(r26, r27, r28, r29, r30)
            return r0
        L_0x0500:
            com.google.android.gms.internal.ads.zzhv r0 = new com.google.android.gms.internal.ads.zzhv
            java.lang.String r1 = "Track has no sample table size information"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkw.zza(com.google.android.gms.internal.ads.zzln, com.google.android.gms.internal.ads.zzku, com.google.android.gms.internal.ads.zzjz):com.google.android.gms.internal.ads.zzls");
    }

    public static zzmc zza(zzkt zzkt, boolean z) {
        if (z) {
            return null;
        }
        zzpk zzpk = zzkt.zzawe;
        zzpk.zzbo(8);
        while (zzpk.zziy() >= 8) {
            int position = zzpk.getPosition();
            int readInt = zzpk.readInt();
            if (zzpk.readInt() == zzkr.zzavp) {
                zzpk.zzbo(position);
                int i = position + readInt;
                zzpk.zzbp(12);
                while (true) {
                    if (zzpk.getPosition() >= i) {
                        break;
                    }
                    int position2 = zzpk.getPosition();
                    int readInt2 = zzpk.readInt();
                    if (zzpk.readInt() == zzkr.zzavq) {
                        zzpk.zzbo(position2);
                        int i2 = position2 + readInt2;
                        zzpk.zzbp(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzpk.getPosition() < i2) {
                            zzmc.zza zzd = zzlk.zzd(zzpk);
                            if (zzd != null) {
                                arrayList.add(zzd);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new zzmc((List<? extends zzmc.zza>) arrayList);
                        }
                    } else {
                        zzpk.zzbp(readInt2 - 8);
                    }
                }
                return null;
            }
            zzpk.zzbp(readInt - 8);
        }
        return null;
    }

    private static Pair<String, byte[]> zzb(zzpk zzpk, int i) {
        zzpk.zzbo(i + 8 + 4);
        zzpk.zzbp(1);
        zzc(zzpk);
        zzpk.zzbp(2);
        int readUnsignedByte = zzpk.readUnsignedByte();
        if ((readUnsignedByte & 128) != 0) {
            zzpk.zzbp(2);
        }
        if ((readUnsignedByte & 64) != 0) {
            zzpk.zzbp(zzpk.readUnsignedShort());
        }
        if ((readUnsignedByte & 32) != 0) {
            zzpk.zzbp(2);
        }
        zzpk.zzbp(1);
        zzc(zzpk);
        int readUnsignedByte2 = zzpk.readUnsignedByte();
        String str = null;
        if (readUnsignedByte2 == 32) {
            str = "video/mp4v-es";
        } else if (readUnsignedByte2 == 33) {
            str = "video/avc";
        } else if (readUnsignedByte2 != 35) {
            if (readUnsignedByte2 != 64) {
                if (readUnsignedByte2 == 107) {
                    return Pair.create("audio/mpeg", (Object) null);
                }
                if (readUnsignedByte2 == 165) {
                    str = "audio/ac3";
                } else if (readUnsignedByte2 != 166) {
                    switch (readUnsignedByte2) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (readUnsignedByte2) {
                                case 169:
                                case 172:
                                    return Pair.create("audio/vnd.dts", (Object) null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", (Object) null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        zzpk.zzbp(12);
        zzpk.zzbp(1);
        int zzc = zzc(zzpk);
        byte[] bArr = new byte[zzc];
        zzpk.zze(bArr, 0, zzc);
        return Pair.create(str, bArr);
    }

    private static int zza(zzpk zzpk, int i, int i2, zzkx zzkx, int i3) {
        zzpk zzpk2 = zzpk;
        int position = zzpk.getPosition();
        while (true) {
            boolean z = false;
            if (position - i >= i2) {
                return 0;
            }
            zzpk.zzbo(position);
            int readInt = zzpk.readInt();
            zzoz.checkArgument(readInt > 0, "childAtomSize should be positive");
            if (zzpk.readInt() == zzkr.zzauj) {
                int i4 = position + 8;
                Pair pair = null;
                Integer num = null;
                zzlq zzlq = null;
                boolean z2 = false;
                while (i4 - position < readInt) {
                    zzpk.zzbo(i4);
                    int readInt2 = zzpk.readInt();
                    int readInt3 = zzpk.readInt();
                    if (readInt3 == zzkr.zzaup) {
                        num = Integer.valueOf(zzpk.readInt());
                    } else if (readInt3 == zzkr.zzauk) {
                        zzpk.zzbp(4);
                        z2 = zzpk.readInt() == zzawv;
                    } else if (readInt3 == zzkr.zzaul) {
                        int i5 = i4 + 8;
                        while (true) {
                            if (i5 - i4 >= readInt2) {
                                zzlq = null;
                                break;
                            }
                            zzpk.zzbo(i5);
                            int readInt4 = zzpk.readInt();
                            if (zzpk.readInt() == zzkr.zzaum) {
                                zzpk.zzbp(6);
                                boolean z3 = zzpk.readUnsignedByte() == 1;
                                int readUnsignedByte = zzpk.readUnsignedByte();
                                byte[] bArr = new byte[16];
                                zzpk.zze(bArr, 0, 16);
                                zzlq = new zzlq(z3, readUnsignedByte, bArr);
                            } else {
                                i5 += readInt4;
                            }
                        }
                    }
                    i4 += readInt2;
                }
                if (z2) {
                    zzoz.checkArgument(num != null, "frma atom is mandatory");
                    if (zzlq != null) {
                        z = true;
                    }
                    zzoz.checkArgument(z, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, zzlq);
                }
                if (pair != null) {
                    zzkx.zzaww[i3] = (zzlq) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            zzkx zzkx2 = zzkx;
            position += readInt;
        }
    }

    private static int zzc(zzpk zzpk) {
        int readUnsignedByte = zzpk.readUnsignedByte();
        int i = readUnsignedByte & 127;
        while ((readUnsignedByte & 128) == 128) {
            readUnsignedByte = zzpk.readUnsignedByte();
            i = (i << 7) | (readUnsignedByte & 127);
        }
        return i;
    }
}
