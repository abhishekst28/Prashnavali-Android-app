package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzehy {
    private static final zzehw zzihx = zzbhb();
    private static final zzehw zzihy = new zzehv();

    static zzehw zzbgz() {
        return zzihx;
    }

    static zzehw zzbha() {
        return zzihy;
    }

    private static zzehw zzbhb() {
        try {
            return (zzehw) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }
}
