package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public final class zzgf<K, V> {
    static <K, V> void zza(zzek zzek, zzge<K, V> zzge, K k, V v) throws IOException {
        zzet.zza(zzek, zzge.zza, 1, k);
        zzet.zza(zzek, zzge.zzc, 2, v);
    }

    static <K, V> int zza(zzge<K, V> zzge, K k, V v) {
        return zzet.zza(zzge.zza, 1, k) + zzet.zza(zzge.zzc, 2, v);
    }
}
