package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzabb {
    public static boolean zza(zzabk zzabk, zzabi zzabi, String... strArr) {
        if (zzabk == null || zzabi == null || !zzabk.zzcys || zzabi == null) {
            return false;
        }
        return zzabk.zza(zzabi, zzp.zzkw().elapsedRealtime(), strArr);
    }

    public static zzabi zzb(zzabk zzabk) {
        if (zzabk == null) {
            return null;
        }
        return zzabk.zzex(zzp.zzkw().elapsedRealtime());
    }
}
