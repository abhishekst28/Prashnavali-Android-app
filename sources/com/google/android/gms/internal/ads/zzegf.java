package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzegf {
    private static final zzege<?> zzicq = new zzegg();
    private static final zzege<?> zzicr = zzbez();

    private static zzege<?> zzbez() {
        try {
            return (zzege) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }

    static zzege<?> zzbfa() {
        return zzicq;
    }

    static zzege<?> zzbfb() {
        zzege<?> zzege = zzicr;
        if (zzege != null) {
            return zzege;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
