package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzehs implements zzeia {
    private zzeia[] zzihs;

    zzehs(zzeia... zzeiaArr) {
        this.zzihs = zzeiaArr;
    }

    public final boolean zze(Class<?> cls) {
        for (zzeia zze : this.zzihs) {
            if (zze.zze(cls)) {
                return true;
            }
        }
        return false;
    }

    public final zzehx zzf(Class<?> cls) {
        for (zzeia zzeia : this.zzihs) {
            if (zzeia.zze(cls)) {
                return zzeia.zzf(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
