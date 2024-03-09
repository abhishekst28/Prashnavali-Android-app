package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public enum zzeke {
    DOUBLE(zzekh.DOUBLE, 1),
    FLOAT(zzekh.FLOAT, 5),
    INT64(zzekh.LONG, 0),
    UINT64(zzekh.LONG, 0),
    INT32(zzekh.INT, 0),
    FIXED64(zzekh.LONG, 1),
    FIXED32(zzekh.INT, 5),
    BOOL(zzekh.BOOLEAN, 0),
    STRING(zzekh.STRING, 2),
    GROUP(zzekh.MESSAGE, 3),
    MESSAGE(zzekh.MESSAGE, 2),
    BYTES(zzekh.BYTE_STRING, 2),
    UINT32(zzekh.INT, 0),
    ENUM(zzekh.ENUM, 0),
    SFIXED32(zzekh.INT, 5),
    SFIXED64(zzekh.LONG, 1),
    SINT32(zzekh.INT, 0),
    SINT64(zzekh.LONG, 0);
    
    private final zzekh zzima;
    private final int zzimb;

    private zzeke(zzekh zzekh, int i) {
        this.zzima = zzekh;
        this.zzimb = i;
    }

    public final zzekh zzbii() {
        return this.zzima;
    }

    public final int zzbij() {
        return this.zzimb;
    }
}
