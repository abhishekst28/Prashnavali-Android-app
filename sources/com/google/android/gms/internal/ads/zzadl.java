package com.google.android.gms.internal.ads;

import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzadl implements Parcelable.Creator<zzadm> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzadm[i];
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r13) {
        /*
            r12 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r13)
            r1 = 0
            r2 = 0
            r9 = r2
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
        L_0x0016:
            int r1 = r13.dataPosition()
            if (r1 >= r0) goto L_0x005f
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r13)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            switch(r2) {
                case 1: goto L_0x0059;
                case 2: goto L_0x0053;
                case 3: goto L_0x004d;
                case 4: goto L_0x0047;
                case 5: goto L_0x0041;
                case 6: goto L_0x0037;
                case 7: goto L_0x0031;
                case 8: goto L_0x002b;
                default: goto L_0x0027;
            }
        L_0x0027:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r13, r1)
            goto L_0x0016
        L_0x002b:
            int r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r13, r1)
            goto L_0x0016
        L_0x0031:
            boolean r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r13, r1)
            goto L_0x0016
        L_0x0037:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzaac> r2 = com.google.android.gms.internal.ads.zzaac.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r13, r1, r2)
            r9 = r1
            com.google.android.gms.internal.ads.zzaac r9 = (com.google.android.gms.internal.ads.zzaac) r9
            goto L_0x0016
        L_0x0041:
            int r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r13, r1)
            goto L_0x0016
        L_0x0047:
            boolean r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r13, r1)
            goto L_0x0016
        L_0x004d:
            int r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r13, r1)
            goto L_0x0016
        L_0x0053:
            boolean r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r13, r1)
            goto L_0x0016
        L_0x0059:
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r13, r1)
            goto L_0x0016
        L_0x005f:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r13, r0)
            com.google.android.gms.internal.ads.zzadm r13 = new com.google.android.gms.internal.ads.zzadm
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadl.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
