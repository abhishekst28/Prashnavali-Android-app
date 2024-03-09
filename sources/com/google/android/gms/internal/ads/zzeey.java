package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzeey {
    private static final Class<?> zziau = zzht("libcore.io.Memory");
    private static final boolean zziav = (zzht("org.robolectric.Robolectric") != null);

    static boolean zzbdd() {
        return zziau != null && !zziav;
    }

    static Class<?> zzbde() {
        return zziau;
    }

    private static <T> Class<T> zzht(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable th) {
            return null;
        }
    }
}
