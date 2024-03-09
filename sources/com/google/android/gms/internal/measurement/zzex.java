package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final /* synthetic */ class zzex {
    static final /* synthetic */ int[] zza;
    static final /* synthetic */ int[] zzb;

    static {
        int[] iArr = new int[zzfp.values().length];
        zzb = iArr;
        try {
            iArr[zzfp.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            zzb[zzfp.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            zzb[zzfp.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        int[] iArr2 = new int[zzfa.values().length];
        zza = iArr2;
        try {
            iArr2[zzfa.MAP.ordinal()] = 1;
        } catch (NoSuchFieldError e4) {
        }
        try {
            zza[zzfa.VECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError e5) {
        }
        try {
            zza[zzfa.SCALAR.ordinal()] = 3;
        } catch (NoSuchFieldError e6) {
        }
    }
}
