package com.google.android.gms.internal.measurement;

import java.lang.reflect.Type;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public enum zzey {
    DOUBLE(0, zzfa.SCALAR, zzfp.DOUBLE),
    FLOAT(1, zzfa.SCALAR, zzfp.FLOAT),
    INT64(2, zzfa.SCALAR, zzfp.LONG),
    UINT64(3, zzfa.SCALAR, zzfp.LONG),
    INT32(4, zzfa.SCALAR, zzfp.INT),
    FIXED64(5, zzfa.SCALAR, zzfp.LONG),
    FIXED32(6, zzfa.SCALAR, zzfp.INT),
    BOOL(7, zzfa.SCALAR, zzfp.BOOLEAN),
    STRING(8, zzfa.SCALAR, zzfp.STRING),
    MESSAGE(9, zzfa.SCALAR, zzfp.MESSAGE),
    BYTES(10, zzfa.SCALAR, zzfp.BYTE_STRING),
    UINT32(11, zzfa.SCALAR, zzfp.INT),
    ENUM(12, zzfa.SCALAR, zzfp.ENUM),
    SFIXED32(13, zzfa.SCALAR, zzfp.INT),
    SFIXED64(14, zzfa.SCALAR, zzfp.LONG),
    SINT32(15, zzfa.SCALAR, zzfp.INT),
    SINT64(16, zzfa.SCALAR, zzfp.LONG),
    GROUP(17, zzfa.SCALAR, zzfp.MESSAGE),
    DOUBLE_LIST(18, zzfa.VECTOR, zzfp.DOUBLE),
    FLOAT_LIST(19, zzfa.VECTOR, zzfp.FLOAT),
    INT64_LIST(20, zzfa.VECTOR, zzfp.LONG),
    UINT64_LIST(21, zzfa.VECTOR, zzfp.LONG),
    INT32_LIST(22, zzfa.VECTOR, zzfp.INT),
    FIXED64_LIST(23, zzfa.VECTOR, zzfp.LONG),
    FIXED32_LIST(24, zzfa.VECTOR, zzfp.INT),
    BOOL_LIST(25, zzfa.VECTOR, zzfp.BOOLEAN),
    STRING_LIST(26, zzfa.VECTOR, zzfp.STRING),
    MESSAGE_LIST(27, zzfa.VECTOR, zzfp.MESSAGE),
    BYTES_LIST(28, zzfa.VECTOR, zzfp.BYTE_STRING),
    UINT32_LIST(29, zzfa.VECTOR, zzfp.INT),
    ENUM_LIST(30, zzfa.VECTOR, zzfp.ENUM),
    SFIXED32_LIST(31, zzfa.VECTOR, zzfp.INT),
    SFIXED64_LIST(32, zzfa.VECTOR, zzfp.LONG),
    SINT32_LIST(33, zzfa.VECTOR, zzfp.INT),
    SINT64_LIST(34, zzfa.VECTOR, zzfp.LONG),
    DOUBLE_LIST_PACKED(35, zzfa.PACKED_VECTOR, zzfp.DOUBLE),
    FLOAT_LIST_PACKED(36, zzfa.PACKED_VECTOR, zzfp.FLOAT),
    INT64_LIST_PACKED(37, zzfa.PACKED_VECTOR, zzfp.LONG),
    UINT64_LIST_PACKED(38, zzfa.PACKED_VECTOR, zzfp.LONG),
    INT32_LIST_PACKED(39, zzfa.PACKED_VECTOR, zzfp.INT),
    FIXED64_LIST_PACKED(40, zzfa.PACKED_VECTOR, zzfp.LONG),
    FIXED32_LIST_PACKED(41, zzfa.PACKED_VECTOR, zzfp.INT),
    BOOL_LIST_PACKED(42, zzfa.PACKED_VECTOR, zzfp.BOOLEAN),
    UINT32_LIST_PACKED(43, zzfa.PACKED_VECTOR, zzfp.INT),
    ENUM_LIST_PACKED(44, zzfa.PACKED_VECTOR, zzfp.ENUM),
    SFIXED32_LIST_PACKED(45, zzfa.PACKED_VECTOR, zzfp.INT),
    SFIXED64_LIST_PACKED(46, zzfa.PACKED_VECTOR, zzfp.LONG),
    SINT32_LIST_PACKED(47, zzfa.PACKED_VECTOR, zzfp.INT),
    SINT64_LIST_PACKED(48, zzfa.PACKED_VECTOR, zzfp.LONG),
    GROUP_LIST(49, zzfa.VECTOR, zzfp.MESSAGE),
    MAP(50, zzfa.MAP, zzfp.VOID);
    
    private static final zzey[] zzbe = null;
    private static final Type[] zzbf = null;
    private final zzfp zzaz;
    private final int zzba;
    private final zzfa zzbb;
    private final Class<?> zzbc;
    private final boolean zzbd;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        r5 = com.google.android.gms.internal.measurement.zzex.zzb[r6.ordinal()];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzey(int r4, com.google.android.gms.internal.measurement.zzfa r5, com.google.android.gms.internal.measurement.zzfp r6) {
        /*
            r1 = this;
            r1.<init>(r2, r3)
            r1.zzba = r4
            r1.zzbb = r5
            r1.zzaz = r6
            int[] r2 = com.google.android.gms.internal.measurement.zzex.zza
            int r3 = r5.ordinal()
            r2 = r2[r3]
            r3 = 2
            r4 = 1
            if (r2 == r4) goto L_0x0022
            if (r2 == r3) goto L_0x001b
            r2 = 0
            r1.zzbc = r2
            goto L_0x0029
        L_0x001b:
            java.lang.Class r2 = r6.zza()
            r1.zzbc = r2
            goto L_0x0029
        L_0x0022:
            java.lang.Class r2 = r6.zza()
            r1.zzbc = r2
        L_0x0029:
            r2 = 0
            com.google.android.gms.internal.measurement.zzfa r0 = com.google.android.gms.internal.measurement.zzfa.SCALAR
            if (r5 != r0) goto L_0x003e
            int[] r5 = com.google.android.gms.internal.measurement.zzex.zzb
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
            r1.zzbd = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzey.<init>(java.lang.String, int, int, com.google.android.gms.internal.measurement.zzfa, com.google.android.gms.internal.measurement.zzfp):void");
    }

    public final int zza() {
        return this.zzba;
    }

    static {
        int i;
        zzbf = new Type[0];
        zzey[] values = values();
        zzbe = new zzey[values.length];
        for (zzey zzey : values) {
            zzbe[zzey.zzba] = zzey;
        }
    }
}
