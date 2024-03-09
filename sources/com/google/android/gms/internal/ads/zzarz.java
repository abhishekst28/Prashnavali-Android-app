package com.google.android.gms.internal.ads;

import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzarz implements Parcelable.Creator<zzarw> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzarw[i];
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v5, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v6, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v7, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v8, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v9, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v10, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r70) {
        /*
            r69 = this;
            r0 = r70
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r70)
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r28 = r2
            r35 = r28
            r9 = r6
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
            r18 = r17
            r19 = r18
            r21 = r19
            r22 = r21
            r27 = r22
            r30 = r27
            r31 = r30
            r32 = r31
            r33 = r32
            r34 = r33
            r37 = r34
            r44 = r37
            r45 = r44
            r48 = r45
            r49 = r48
            r50 = r49
            r52 = r50
            r53 = r52
            r54 = r53
            r55 = r54
            r57 = r55
            r58 = r57
            r59 = r58
            r64 = r59
            r65 = r64
            r66 = r65
            r67 = r66
            r68 = r67
            r8 = 0
            r20 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r46 = 0
            r47 = 0
            r51 = 0
            r56 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
        L_0x00b3:
            int r2 = r70.dataPosition()
            if (r2 >= r1) goto L_0x0278
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r70)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 1: goto L_0x0271;
                case 2: goto L_0x026a;
                case 3: goto L_0x025f;
                case 4: goto L_0x0254;
                case 5: goto L_0x024d;
                case 6: goto L_0x0242;
                case 7: goto L_0x0237;
                case 8: goto L_0x0230;
                case 9: goto L_0x0229;
                case 10: goto L_0x0222;
                case 11: goto L_0x0216;
                case 12: goto L_0x020f;
                case 13: goto L_0x0208;
                case 14: goto L_0x0201;
                case 15: goto L_0x01fa;
                case 16: goto L_0x01f3;
                case 17: goto L_0x00c4;
                case 18: goto L_0x01ec;
                case 19: goto L_0x01e5;
                case 20: goto L_0x01de;
                case 21: goto L_0x01d7;
                case 22: goto L_0x00c4;
                case 23: goto L_0x00c4;
                case 24: goto L_0x00c4;
                case 25: goto L_0x01d0;
                case 26: goto L_0x01c9;
                case 27: goto L_0x01c2;
                case 28: goto L_0x01bb;
                case 29: goto L_0x01af;
                case 30: goto L_0x01a8;
                case 31: goto L_0x01a1;
                case 32: goto L_0x00c4;
                case 33: goto L_0x019a;
                case 34: goto L_0x0193;
                case 35: goto L_0x018c;
                case 36: goto L_0x0185;
                case 37: goto L_0x017e;
                case 38: goto L_0x0177;
                case 39: goto L_0x0170;
                case 40: goto L_0x0169;
                case 41: goto L_0x0162;
                case 42: goto L_0x015b;
                case 43: goto L_0x0154;
                case 44: goto L_0x014d;
                case 45: goto L_0x0146;
                case 46: goto L_0x013a;
                case 47: goto L_0x0133;
                case 48: goto L_0x012d;
                case 49: goto L_0x0127;
                case 50: goto L_0x0121;
                case 51: goto L_0x011b;
                case 52: goto L_0x0115;
                case 53: goto L_0x010f;
                case 54: goto L_0x0109;
                case 55: goto L_0x0103;
                case 56: goto L_0x00fd;
                case 57: goto L_0x00f7;
                case 58: goto L_0x00f1;
                case 59: goto L_0x00eb;
                case 60: goto L_0x00e5;
                case 61: goto L_0x00df;
                case 62: goto L_0x00c4;
                case 63: goto L_0x00d4;
                case 64: goto L_0x00ce;
                case 65: goto L_0x00c8;
                default: goto L_0x00c4;
            }
        L_0x00c4:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L_0x00b3
        L_0x00c8:
            android.os.Bundle r68 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r0, r2)
            goto L_0x00b3
        L_0x00ce:
            java.lang.String r67 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x00b3
        L_0x00d4:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzair> r3 = com.google.android.gms.internal.ads.zzair.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r66 = r2
            com.google.android.gms.internal.ads.zzair r66 = (com.google.android.gms.internal.ads.zzair) r66
            goto L_0x00b3
        L_0x00df:
            java.lang.String r65 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x00b3
        L_0x00e5:
            java.util.ArrayList r64 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r0, r2)
            goto L_0x00b3
        L_0x00eb:
            boolean r63 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x00b3
        L_0x00f1:
            boolean r62 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x00b3
        L_0x00f7:
            boolean r61 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x00b3
        L_0x00fd:
            int r60 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L_0x00b3
        L_0x0103:
            java.util.ArrayList r59 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r0, r2)
            goto L_0x00b3
        L_0x0109:
            java.lang.String r58 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x00b3
        L_0x010f:
            java.util.ArrayList r57 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createIntegerList(r0, r2)
            goto L_0x00b3
        L_0x0115:
            boolean r56 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x00b3
        L_0x011b:
            java.lang.String r55 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x00b3
        L_0x0121:
            java.lang.String r54 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x00b3
        L_0x0127:
            java.lang.String r53 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x00b3
        L_0x012d:
            android.os.Bundle r52 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r0, r2)
            goto L_0x00b3
        L_0x0133:
            boolean r51 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x00b3
        L_0x013a:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzym> r3 = com.google.android.gms.internal.ads.zzym.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r50 = r2
            com.google.android.gms.internal.ads.zzym r50 = (com.google.android.gms.internal.ads.zzym) r50
            goto L_0x00b3
        L_0x0146:
            java.lang.String r49 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x00b3
        L_0x014d:
            android.os.Bundle r48 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r0, r2)
            goto L_0x00b3
        L_0x0154:
            int r47 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L_0x00b3
        L_0x015b:
            boolean r46 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x00b3
        L_0x0162:
            java.lang.String r45 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x00b3
        L_0x0169:
            boolean r39 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x00b3
        L_0x0170:
            java.lang.String r44 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x00b3
        L_0x0177:
            boolean r43 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x00b3
        L_0x017e:
            boolean r42 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x00b3
        L_0x0185:
            int r41 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L_0x00b3
        L_0x018c:
            int r40 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L_0x00b3
        L_0x0193:
            float r38 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r0, r2)
            goto L_0x00b3
        L_0x019a:
            java.lang.String r37 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x00b3
        L_0x01a1:
            long r35 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            goto L_0x00b3
        L_0x01a8:
            java.util.ArrayList r34 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r0, r2)
            goto L_0x00b3
        L_0x01af:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzadm> r3 = com.google.android.gms.internal.ads.zzadm.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r33 = r2
            com.google.android.gms.internal.ads.zzadm r33 = (com.google.android.gms.internal.ads.zzadm) r33
            goto L_0x00b3
        L_0x01bb:
            java.lang.String r32 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x00b3
        L_0x01c2:
            java.util.ArrayList r31 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r0, r2)
            goto L_0x00b3
        L_0x01c9:
            java.lang.String r30 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x00b3
        L_0x01d0:
            long r28 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            goto L_0x00b3
        L_0x01d7:
            java.lang.String r27 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x00b3
        L_0x01de:
            float r26 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r0, r2)
            goto L_0x00b3
        L_0x01e5:
            int r25 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L_0x00b3
        L_0x01ec:
            int r24 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L_0x00b3
        L_0x01f3:
            boolean r23 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x00b3
        L_0x01fa:
            android.os.Bundle r22 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r0, r2)
            goto L_0x00b3
        L_0x0201:
            java.util.ArrayList r21 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r0, r2)
            goto L_0x00b3
        L_0x0208:
            int r20 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L_0x00b3
        L_0x020f:
            android.os.Bundle r19 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r0, r2)
            goto L_0x00b3
        L_0x0216:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbbg> r3 = com.google.android.gms.internal.ads.zzbbg.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r18 = r2
            com.google.android.gms.internal.ads.zzbbg r18 = (com.google.android.gms.internal.ads.zzbbg) r18
            goto L_0x00b3
        L_0x0222:
            java.lang.String r17 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x00b3
        L_0x0229:
            java.lang.String r16 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x00b3
        L_0x0230:
            java.lang.String r15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x00b3
        L_0x0237:
            android.os.Parcelable$Creator r3 = android.content.pm.PackageInfo.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r14 = r2
            android.content.pm.PackageInfo r14 = (android.content.pm.PackageInfo) r14
            goto L_0x00b3
        L_0x0242:
            android.os.Parcelable$Creator r3 = android.content.pm.ApplicationInfo.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r13 = r2
            android.content.pm.ApplicationInfo r13 = (android.content.pm.ApplicationInfo) r13
            goto L_0x00b3
        L_0x024d:
            java.lang.String r12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x00b3
        L_0x0254:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzvj> r3 = com.google.android.gms.internal.ads.zzvj.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r11 = r2
            com.google.android.gms.internal.ads.zzvj r11 = (com.google.android.gms.internal.ads.zzvj) r11
            goto L_0x00b3
        L_0x025f:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzvc> r3 = com.google.android.gms.internal.ads.zzvc.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r10 = r2
            com.google.android.gms.internal.ads.zzvc r10 = (com.google.android.gms.internal.ads.zzvc) r10
            goto L_0x00b3
        L_0x026a:
            android.os.Bundle r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r0, r2)
            goto L_0x00b3
        L_0x0271:
            int r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L_0x00b3
        L_0x0278:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.internal.ads.zzarw r0 = new com.google.android.gms.internal.ads.zzarw
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r31, r32, r33, r34, r35, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzarz.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
