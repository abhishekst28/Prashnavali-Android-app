package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzedp {
    static final /* synthetic */ int[] zzhzb;
    static final /* synthetic */ int[] zzhzc;

    static {
        int[] iArr = new int[zzeds.values().length];
        zzhzc = iArr;
        try {
            iArr[zzeds.NIST_P256.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            zzhzc[zzeds.NIST_P384.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            zzhzc[zzeds.NIST_P521.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        int[] iArr2 = new int[zzedr.values().length];
        zzhzb = iArr2;
        try {
            iArr2[zzedr.UNCOMPRESSED.ordinal()] = 1;
        } catch (NoSuchFieldError e4) {
        }
        try {
            zzhzb[zzedr.DO_NOT_USE_CRUNCHY_UNCOMPRESSED.ordinal()] = 2;
        } catch (NoSuchFieldError e5) {
        }
        try {
            zzhzb[zzedr.COMPRESSED.ordinal()] = 3;
        } catch (NoSuchFieldError e6) {
        }
    }
}
