package com.google.android.gms.internal.ads;

import java.lang.reflect.Type;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public enum zzegj {
    DOUBLE(0, zzegl.SCALAR, zzehb.DOUBLE),
    FLOAT(1, zzegl.SCALAR, zzehb.FLOAT),
    INT64(2, zzegl.SCALAR, zzehb.LONG),
    UINT64(3, zzegl.SCALAR, zzehb.LONG),
    INT32(4, zzegl.SCALAR, zzehb.INT),
    FIXED64(5, zzegl.SCALAR, zzehb.LONG),
    FIXED32(6, zzegl.SCALAR, zzehb.INT),
    BOOL(7, zzegl.SCALAR, zzehb.BOOLEAN),
    STRING(8, zzegl.SCALAR, zzehb.STRING),
    MESSAGE(9, zzegl.SCALAR, zzehb.MESSAGE),
    BYTES(10, zzegl.SCALAR, zzehb.BYTE_STRING),
    UINT32(11, zzegl.SCALAR, zzehb.INT),
    ENUM(12, zzegl.SCALAR, zzehb.ENUM),
    SFIXED32(13, zzegl.SCALAR, zzehb.INT),
    SFIXED64(14, zzegl.SCALAR, zzehb.LONG),
    SINT32(15, zzegl.SCALAR, zzehb.INT),
    SINT64(16, zzegl.SCALAR, zzehb.LONG),
    GROUP(17, zzegl.SCALAR, zzehb.MESSAGE),
    DOUBLE_LIST(18, zzegl.VECTOR, zzehb.DOUBLE),
    FLOAT_LIST(19, zzegl.VECTOR, zzehb.FLOAT),
    INT64_LIST(20, zzegl.VECTOR, zzehb.LONG),
    UINT64_LIST(21, zzegl.VECTOR, zzehb.LONG),
    INT32_LIST(22, zzegl.VECTOR, zzehb.INT),
    FIXED64_LIST(23, zzegl.VECTOR, zzehb.LONG),
    FIXED32_LIST(24, zzegl.VECTOR, zzehb.INT),
    BOOL_LIST(25, zzegl.VECTOR, zzehb.BOOLEAN),
    STRING_LIST(26, zzegl.VECTOR, zzehb.STRING),
    MESSAGE_LIST(27, zzegl.VECTOR, zzehb.MESSAGE),
    BYTES_LIST(28, zzegl.VECTOR, zzehb.BYTE_STRING),
    UINT32_LIST(29, zzegl.VECTOR, zzehb.INT),
    ENUM_LIST(30, zzegl.VECTOR, zzehb.ENUM),
    SFIXED32_LIST(31, zzegl.VECTOR, zzehb.INT),
    SFIXED64_LIST(32, zzegl.VECTOR, zzehb.LONG),
    SINT32_LIST(33, zzegl.VECTOR, zzehb.INT),
    SINT64_LIST(34, zzegl.VECTOR, zzehb.LONG),
    DOUBLE_LIST_PACKED(35, zzegl.PACKED_VECTOR, zzehb.DOUBLE),
    FLOAT_LIST_PACKED(36, zzegl.PACKED_VECTOR, zzehb.FLOAT),
    INT64_LIST_PACKED(37, zzegl.PACKED_VECTOR, zzehb.LONG),
    UINT64_LIST_PACKED(38, zzegl.PACKED_VECTOR, zzehb.LONG),
    INT32_LIST_PACKED(39, zzegl.PACKED_VECTOR, zzehb.INT),
    FIXED64_LIST_PACKED(40, zzegl.PACKED_VECTOR, zzehb.LONG),
    FIXED32_LIST_PACKED(41, zzegl.PACKED_VECTOR, zzehb.INT),
    BOOL_LIST_PACKED(42, zzegl.PACKED_VECTOR, zzehb.BOOLEAN),
    UINT32_LIST_PACKED(43, zzegl.PACKED_VECTOR, zzehb.INT),
    ENUM_LIST_PACKED(44, zzegl.PACKED_VECTOR, zzehb.ENUM),
    SFIXED32_LIST_PACKED(45, zzegl.PACKED_VECTOR, zzehb.INT),
    SFIXED64_LIST_PACKED(46, zzegl.PACKED_VECTOR, zzehb.LONG),
    SINT32_LIST_PACKED(47, zzegl.PACKED_VECTOR, zzehb.INT),
    SINT64_LIST_PACKED(48, zzegl.PACKED_VECTOR, zzehb.LONG),
    GROUP_LIST(49, zzegl.VECTOR, zzehb.MESSAGE),
    MAP(50, zzegl.MAP, zzehb.VOID);
    
    private static final zzegj[] zzifa = null;
    private static final Type[] zzifb = null;
    private final int id;
    private final zzehb zziew;
    private final zzegl zziex;
    private final Class<?> zziey;
    private final boolean zziez;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        r5 = com.google.android.gms.internal.ads.zzegm.zzifk[r6.ordinal()];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzegj(int r4, com.google.android.gms.internal.ads.zzegl r5, com.google.android.gms.internal.ads.zzehb r6) {
        /*
            r1 = this;
            r1.<init>(r2, r3)
            r1.id = r4
            r1.zziex = r5
            r1.zziew = r6
            int[] r2 = com.google.android.gms.internal.ads.zzegm.zzifj
            int r3 = r5.ordinal()
            r2 = r2[r3]
            r3 = 2
            r4 = 1
            if (r2 == r4) goto L_0x0022
            if (r2 == r3) goto L_0x001b
            r2 = 0
            r1.zziey = r2
            goto L_0x0029
        L_0x001b:
            java.lang.Class r2 = r6.zzbgk()
            r1.zziey = r2
            goto L_0x0029
        L_0x0022:
            java.lang.Class r2 = r6.zzbgk()
            r1.zziey = r2
        L_0x0029:
            r2 = 0
            com.google.android.gms.internal.ads.zzegl r0 = com.google.android.gms.internal.ads.zzegl.SCALAR
            if (r5 != r0) goto L_0x003e
            int[] r5 = com.google.android.gms.internal.ads.zzegm.zzifk
            int r6 = r6.ordinal()
            r5 = r5[r6]
            if (r5 == r4) goto L_0x003e
            if (r5 == r3) goto L_0x003e
            r3 = 3
            if (r5 == r3) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r4 = 0
        L_0x003f:
            r1.zziez = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegj.<init>(java.lang.String, int, int, com.google.android.gms.internal.ads.zzegl, com.google.android.gms.internal.ads.zzehb):void");
    }

    public final int id() {
        return this.id;
    }

    static {
        int i;
        zzifb = new Type[0];
        zzegj[] values = values();
        zzifa = new zzegj[values.length];
        for (zzegj zzegj : values) {
            zzifa[zzegj.id] = zzegj;
        }
    }
}
