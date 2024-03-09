package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzehr<K, V> {
    static <K, V> void zza(zzefz zzefz, zzehu<K, V> zzehu, K k, V v) throws IOException {
        zzegi.zza(zzefz, zzehu.zzihu, 1, k);
        zzegi.zza(zzefz, zzehu.zzihw, 2, v);
    }

    static <K, V> int zza(zzehu<K, V> zzehu, K k, V v) {
        return zzegi.zza(zzehu.zzihu, 1, k) + zzegi.zza(zzehu.zzihw, 2, v);
    }
}
