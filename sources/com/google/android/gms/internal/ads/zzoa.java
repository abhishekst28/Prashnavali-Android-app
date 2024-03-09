package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public abstract class zzoa extends zzog {
    private int zzaib = 0;
    private final SparseArray<Map<zznp, zzoc>> zzbhn = new SparseArray<>();
    private final SparseBooleanArray zzbho = new SparseBooleanArray();
    private zznz zzbhp;

    /* access modifiers changed from: protected */
    public abstract zzob[] zza(zzhw[] zzhwArr, zznp[] zznpArr, int[][][] iArr) throws zzhd;

    public final void zzf(int i, boolean z) {
        if (this.zzbho.get(i) != z) {
            this.zzbho.put(i, z);
            invalidate();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: com.google.android.gms.internal.ads.zzoc} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzoi zza(com.google.android.gms.internal.ads.zzhw[] r17, com.google.android.gms.internal.ads.zznp r18) throws com.google.android.gms.internal.ads.zzhd {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            int r3 = r1.length
            int r3 = r3 + 1
            int[] r3 = new int[r3]
            int r4 = r1.length
            int r4 = r4 + 1
            com.google.android.gms.internal.ads.zznq[][] r5 = new com.google.android.gms.internal.ads.zznq[r4][]
            int r6 = r1.length
            int r6 = r6 + 1
            int[][][] r11 = new int[r6][][]
            r7 = 0
        L_0x0016:
            if (r7 >= r4) goto L_0x0027
            int r8 = r2.length
            com.google.android.gms.internal.ads.zznq[] r8 = new com.google.android.gms.internal.ads.zznq[r8]
            r5[r7] = r8
            int r8 = r2.length
            int[][] r8 = new int[r8][]
            r11[r7] = r8
            int r7 = r7 + 1
            goto L_0x0016
        L_0x0027:
            int r4 = r1.length
            int[] r10 = new int[r4]
            r7 = 0
        L_0x002c:
            if (r7 >= r4) goto L_0x0039
            r8 = r1[r7]
            int r8 = r8.zzee()
            r10[r7] = r8
            int r7 = r7 + 1
            goto L_0x002c
        L_0x0039:
            r4 = 0
        L_0x003c:
            int r7 = r2.length
            if (r4 >= r7) goto L_0x00a2
            com.google.android.gms.internal.ads.zznq r7 = r2.zzbd(r4)
            int r8 = r1.length
            r9 = 0
            r12 = 0
        L_0x0049:
            int r13 = r1.length
            if (r9 >= r13) goto L_0x006b
            r13 = r1[r9]
            r14 = 0
        L_0x004f:
            int r15 = r7.length
            if (r14 >= r15) goto L_0x0068
            com.google.android.gms.internal.ads.zzho r15 = r7.zzbe(r14)
            int r15 = r13.zza(r15)
            r6 = 3
            r15 = r15 & r6
            if (r15 <= r12) goto L_0x0065
            r8 = r9
            if (r15 == r6) goto L_0x006b
            r12 = r15
        L_0x0065:
            int r14 = r14 + 1
            goto L_0x004f
        L_0x0068:
            int r9 = r9 + 1
            goto L_0x0049
        L_0x006b:
            int r6 = r1.length
            if (r8 != r6) goto L_0x0075
            int r6 = r7.length
            int[] r6 = new int[r6]
            goto L_0x008e
        L_0x0075:
            r6 = r1[r8]
            int r9 = r7.length
            int[] r9 = new int[r9]
            r12 = 0
        L_0x007c:
            int r13 = r7.length
            if (r12 >= r13) goto L_0x008d
            com.google.android.gms.internal.ads.zzho r13 = r7.zzbe(r12)
            int r13 = r6.zza(r13)
            r9[r12] = r13
            int r12 = r12 + 1
            goto L_0x007c
        L_0x008d:
            r6 = r9
        L_0x008e:
            r9 = r3[r8]
            r12 = r5[r8]
            r12[r9] = r7
            r7 = r11[r8]
            r7[r9] = r6
            r6 = r3[r8]
            int r6 = r6 + 1
            r3[r8] = r6
            int r4 = r4 + 1
            goto L_0x003c
        L_0x00a2:
            int r4 = r1.length
            com.google.android.gms.internal.ads.zznp[] r9 = new com.google.android.gms.internal.ads.zznp[r4]
            int r4 = r1.length
            int[] r8 = new int[r4]
            r4 = 0
        L_0x00a9:
            int r6 = r1.length
            if (r4 >= r6) goto L_0x00d2
            r6 = r3[r4]
            com.google.android.gms.internal.ads.zznp r7 = new com.google.android.gms.internal.ads.zznp
            r12 = r5[r4]
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r6)
            com.google.android.gms.internal.ads.zznq[] r12 = (com.google.android.gms.internal.ads.zznq[]) r12
            r7.<init>(r12)
            r9[r4] = r7
            r7 = r11[r4]
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r7, r6)
            int[][] r6 = (int[][]) r6
            r11[r4] = r6
            r6 = r1[r4]
            int r6 = r6.getTrackType()
            r8[r4] = r6
            int r4 = r4 + 1
            goto L_0x00a9
        L_0x00d2:
            int r4 = r1.length
            r3 = r3[r4]
            com.google.android.gms.internal.ads.zznp r12 = new com.google.android.gms.internal.ads.zznp
            int r4 = r1.length
            r4 = r5[r4]
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r4, r3)
            com.google.android.gms.internal.ads.zznq[] r3 = (com.google.android.gms.internal.ads.zznq[]) r3
            r12.<init>(r3)
            com.google.android.gms.internal.ads.zzob[] r3 = r0.zza(r1, r9, r11)
            r4 = 0
        L_0x00e8:
            int r5 = r1.length
            r6 = 0
            if (r4 >= r5) goto L_0x0116
            android.util.SparseBooleanArray r5 = r0.zzbho
            boolean r5 = r5.get(r4)
            if (r5 == 0) goto L_0x00f7
            r3[r4] = r6
            goto L_0x010d
        L_0x00f7:
            r5 = r9[r4]
            android.util.SparseArray<java.util.Map<com.google.android.gms.internal.ads.zznp, com.google.android.gms.internal.ads.zzoc>> r7 = r0.zzbhn
            java.lang.Object r7 = r7.get(r4)
            java.util.Map r7 = (java.util.Map) r7
            if (r7 != 0) goto L_0x0104
            goto L_0x010b
        L_0x0104:
            java.lang.Object r5 = r7.get(r5)
            r6 = r5
            com.google.android.gms.internal.ads.zzoc r6 = (com.google.android.gms.internal.ads.zzoc) r6
        L_0x010b:
            if (r6 != 0) goto L_0x0110
        L_0x010d:
            int r4 = r4 + 1
            goto L_0x00e8
        L_0x0110:
            java.lang.NoSuchMethodError r1 = new java.lang.NoSuchMethodError
            r1.<init>()
            throw r1
        L_0x0116:
            com.google.android.gms.internal.ads.zznz r4 = new com.google.android.gms.internal.ads.zznz
            r7 = r4
            r7.<init>(r8, r9, r10, r11, r12)
            int r5 = r1.length
            com.google.android.gms.internal.ads.zzhz[] r5 = new com.google.android.gms.internal.ads.zzhz[r5]
            r7 = 0
        L_0x0120:
            int r8 = r1.length
            if (r7 >= r8) goto L_0x0130
            r8 = r3[r7]
            if (r8 == 0) goto L_0x012a
            com.google.android.gms.internal.ads.zzhz r8 = com.google.android.gms.internal.ads.zzhz.zzaia
            goto L_0x012b
        L_0x012a:
            r8 = r6
        L_0x012b:
            r5[r7] = r8
            int r7 = r7 + 1
            goto L_0x0120
        L_0x0130:
            com.google.android.gms.internal.ads.zzoi r1 = new com.google.android.gms.internal.ads.zzoi
            com.google.android.gms.internal.ads.zzod r6 = new com.google.android.gms.internal.ads.zzod
            r6.<init>(r3)
            r1.<init>(r2, r6, r4, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzoa.zza(com.google.android.gms.internal.ads.zzhw[], com.google.android.gms.internal.ads.zznp):com.google.android.gms.internal.ads.zzoi");
    }

    public final void zzd(Object obj) {
        this.zzbhp = (zznz) obj;
    }
}
