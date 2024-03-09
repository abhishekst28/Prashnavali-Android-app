package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcjd {
    private final Map<String, zzcje> zzgdt = new HashMap();

    zzcjd() {
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zza(String str, zzdlx zzdlx) {
        if (!this.zzgdt.containsKey(str)) {
            try {
                this.zzgdt.put(str, new zzcje(str, zzdlx.zztw(), zzdlx.zztx()));
            } catch (zzdlr e) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zza(String str, zzapa zzapa) {
        if (!this.zzgdt.containsKey(str)) {
            try {
                this.zzgdt.put(str, new zzcje(str, zzapa.zztw(), zzapa.zztx()));
            } catch (Throwable th) {
            }
        }
    }

    @Nullable
    public final synchronized zzcje zzgg(String str) {
        return this.zzgdt.get(str);
    }
}
