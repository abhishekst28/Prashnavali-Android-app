package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdxc {
    private final zzecb zzhqx;

    private zzdxc(zzecb zzecb) {
        this.zzhqx = zzecb;
    }

    static final zzdxc zza(zzecb zzecb) throws GeneralSecurityException {
        if (zzecb != null && zzecb.zzbbn() > 0) {
            return new zzdxc(zzecb);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* access modifiers changed from: package-private */
    public final zzecb zzaxx() {
        return this.zzhqx;
    }

    public final String toString() {
        return zzdxq.zzb(this.zzhqx).toString();
    }
}
