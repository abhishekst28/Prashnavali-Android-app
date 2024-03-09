package com.google.android.gms.internal.ads;

import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzdsu {
    private static final Logger logger = Logger.getLogger(zzdsu.class.getName());
    private static final zzdsr zzhlr = new zza();

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    static final class zza {
        private zza() {
        }
    }

    private zzdsu() {
    }

    static boolean zzhh(@NullableDecl String str) {
        return str == null || str.isEmpty();
    }

    static String zzhi(@NullableDecl String str) {
        return str == null ? "" : str;
    }

    static String emptyToNull(@NullableDecl String str) {
        if (zzhh(str)) {
            return null;
        }
        return str;
    }
}
