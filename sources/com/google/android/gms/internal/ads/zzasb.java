package com.google.android.gms.internal.ads;

import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzasb implements Parcelable.Creator<zzary> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzary[i];
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v5, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v6, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r64) {
        /*
            r63 = this;
            r0 = r64
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r64)
            r2 = 0
            r4 = 0
            r5 = 0
            r13 = r2
            r16 = r13
            r19 = r16
            r23 = r19
            r8 = r5
            r9 = r8
            r10 = r9
            r12 = r10
            r18 = r12
            r22 = r18
            r25 = r22
            r27 = r25
            r28 = r27
            r34 = r28
            r35 = r34
            r36 = r35
            r39 = r36
            r40 = r39
            r41 = r40
            r43 = r41
            r45 = r43
            r46 = r45
            r48 = r46
            r49 = r48
            r50 = r49
            r53 = r50
            r57 = r53
            r59 = r57
            r60 = r59
            r7 = 0
            r11 = 0
            r15 = 0
            r21 = 0
            r26 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r37 = 0
            r38 = 0
            r42 = 0
            r44 = 0
            r47 = 0
            r51 = 0
            r52 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r58 = 0
            r61 = 0
            r62 = 0
        L_0x009d:
            int r2 = r64.dataPosition()
            if (r2 >= r1) goto L_0x0221
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r64)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 1: goto L_0x021a;
                case 2: goto L_0x0213;
                case 3: goto L_0x020c;
                case 4: goto L_0x0205;
                case 5: goto L_0x01fe;
                case 6: goto L_0x01f7;
                case 7: goto L_0x01f0;
                case 8: goto L_0x01e9;
                case 9: goto L_0x01e2;
                case 10: goto L_0x01db;
                case 11: goto L_0x01d4;
                case 12: goto L_0x01cd;
                case 13: goto L_0x01c6;
                case 14: goto L_0x01bf;
                case 15: goto L_0x01b8;
                case 16: goto L_0x00ae;
                case 17: goto L_0x00ae;
                case 18: goto L_0x01b1;
                case 19: goto L_0x01aa;
                case 20: goto L_0x00ae;
                case 21: goto L_0x01a3;
                case 22: goto L_0x019c;
                case 23: goto L_0x0195;
                case 24: goto L_0x018e;
                case 25: goto L_0x0187;
                case 26: goto L_0x0180;
                case 27: goto L_0x00ae;
                case 28: goto L_0x0174;
                case 29: goto L_0x016d;
                case 30: goto L_0x0166;
                case 31: goto L_0x015f;
                case 32: goto L_0x0158;
                case 33: goto L_0x014c;
                case 34: goto L_0x0145;
                case 35: goto L_0x013e;
                case 36: goto L_0x0137;
                case 37: goto L_0x012b;
                case 38: goto L_0x0124;
                case 39: goto L_0x011d;
                case 40: goto L_0x0117;
                case 41: goto L_0x00ae;
                case 42: goto L_0x0111;
                case 43: goto L_0x010b;
                case 44: goto L_0x0100;
                case 45: goto L_0x00fa;
                case 46: goto L_0x00f4;
                case 47: goto L_0x00ee;
                case 48: goto L_0x00e8;
                case 49: goto L_0x00e2;
                case 50: goto L_0x00dc;
                case 51: goto L_0x00d6;
                case 52: goto L_0x00d0;
                case 53: goto L_0x00ca;
                case 54: goto L_0x00c4;
                case 55: goto L_0x00be;
                case 56: goto L_0x00b8;
                case 57: goto L_0x00b2;
                default: goto L_0x00ae;
            }
        L_0x00ae:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L_0x009d
        L_0x00b2:
            boolean r62 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x009d
        L_0x00b8:
            boolean r61 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x009d
        L_0x00be:
            java.lang.String r60 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x009d
        L_0x00c4:
            java.lang.String r59 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x009d
        L_0x00ca:
            boolean r58 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x009d
        L_0x00d0:
            java.util.ArrayList r57 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r0, r2)
            goto L_0x009d
        L_0x00d6:
            boolean r56 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x009d
        L_0x00dc:
            int r55 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L_0x009d
        L_0x00e2:
            boolean r54 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x009d
        L_0x00e8:
            android.os.Bundle r53 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r0, r2)
            goto L_0x009d
        L_0x00ee:
            boolean r52 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x009d
        L_0x00f4:
            boolean r51 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x009d
        L_0x00fa:
            java.lang.String r50 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x009d
        L_0x0100:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzavt> r3 = com.google.android.gms.internal.ads.zzavt.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r49 = r2
            com.google.android.gms.internal.ads.zzavt r49 = (com.google.android.gms.internal.ads.zzavt) r49
            goto L_0x009d
        L_0x010b:
            java.lang.String r48 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x009d
        L_0x0111:
            boolean r47 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x009d
        L_0x0117:
            java.util.ArrayList r46 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r0, r2)
            goto L_0x009d
        L_0x011d:
            java.lang.String r45 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x009d
        L_0x0124:
            boolean r44 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x009d
        L_0x012b:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzasa> r3 = com.google.android.gms.internal.ads.zzasa.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r43 = r2
            com.google.android.gms.internal.ads.zzasa r43 = (com.google.android.gms.internal.ads.zzasa) r43
            goto L_0x009d
        L_0x0137:
            boolean r42 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x009d
        L_0x013e:
            java.util.ArrayList r41 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r0, r2)
            goto L_0x009d
        L_0x0145:
            java.util.ArrayList r40 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r0, r2)
            goto L_0x009d
        L_0x014c:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzaue> r3 = com.google.android.gms.internal.ads.zzaue.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r39 = r2
            com.google.android.gms.internal.ads.zzaue r39 = (com.google.android.gms.internal.ads.zzaue) r39
            goto L_0x009d
        L_0x0158:
            boolean r38 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x009d
        L_0x015f:
            boolean r37 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x009d
        L_0x0166:
            java.lang.String r36 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x009d
        L_0x016d:
            java.lang.String r35 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x009d
        L_0x0174:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzask> r3 = com.google.android.gms.internal.ads.zzask.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r34 = r2
            com.google.android.gms.internal.ads.zzask r34 = (com.google.android.gms.internal.ads.zzask) r34
            goto L_0x009d
        L_0x0180:
            boolean r33 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x009d
        L_0x0187:
            boolean r32 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x009d
        L_0x018e:
            boolean r31 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x009d
        L_0x0195:
            boolean r30 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x009d
        L_0x019c:
            boolean r29 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x009d
        L_0x01a3:
            java.lang.String r28 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x009d
        L_0x01aa:
            java.lang.String r27 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x009d
        L_0x01b1:
            boolean r26 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x009d
        L_0x01b8:
            java.lang.String r25 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x009d
        L_0x01bf:
            long r23 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            goto L_0x009d
        L_0x01c6:
            java.lang.String r22 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x009d
        L_0x01cd:
            int r21 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L_0x009d
        L_0x01d4:
            long r19 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            goto L_0x009d
        L_0x01db:
            java.util.ArrayList r18 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r0, r2)
            goto L_0x009d
        L_0x01e2:
            long r16 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            goto L_0x009d
        L_0x01e9:
            boolean r15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x009d
        L_0x01f0:
            long r13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            goto L_0x009d
        L_0x01f7:
            java.util.ArrayList r12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r0, r2)
            goto L_0x009d
        L_0x01fe:
            int r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L_0x009d
        L_0x0205:
            java.util.ArrayList r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r0, r2)
            goto L_0x009d
        L_0x020c:
            java.lang.String r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x009d
        L_0x0213:
            java.lang.String r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x009d
        L_0x021a:
            int r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L_0x009d
        L_0x0221:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.internal.ads.zzary r0 = new com.google.android.gms.internal.ads.zzary
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r15, r16, r18, r19, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzasb.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
