package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class zzgi {
    private static final zzgg zza = zzc();
    private static final zzgg zzb = new zzgj();

    static zzgg zza() {
        return zza;
    }

    static zzgg zzb() {
        return zzb;
    }

    private static zzgg zzc() {
        try {
            return (zzgg) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }
}
