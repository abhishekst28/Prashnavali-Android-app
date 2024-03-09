package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzeio {
    private static final zzeio zziiu = new zzeio();
    private final zzeiy zziiv = new zzehq();
    private final ConcurrentMap<Class<?>, zzeiv<?>> zziiw = new ConcurrentHashMap();

    public static zzeio zzbhg() {
        return zziiu;
    }

    public final <T> zzeiv<T> zzh(Class<T> cls) {
        zzegr.zza(cls, "messageType");
        zzeiv<T> zzeiv = (zzeiv) this.zziiw.get(cls);
        if (zzeiv != null) {
            return zzeiv;
        }
        zzeiv<T> zzg = this.zziiv.zzg(cls);
        zzegr.zza(cls, "messageType");
        zzegr.zza(zzg, "schema");
        zzeiv<T> putIfAbsent = this.zziiw.putIfAbsent(cls, zzg);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        return zzg;
    }

    public final <T> zzeiv<T> zzaw(T t) {
        return zzh(t.getClass());
    }

    private zzeio() {
    }
}
