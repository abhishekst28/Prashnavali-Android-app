package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxm;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdxl implements zzdxm.zzb {
    private final /* synthetic */ zzdww zzhrj;

    zzdxl(zzdww zzdww) {
        this.zzhrj = zzdww;
    }

    public final <Q> zzdww<Q> zzb(Class<Q> cls) throws GeneralSecurityException {
        if (this.zzhrj.zzaxp().equals(cls)) {
            return this.zzhrj;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    public final zzdww<?> zzayd() {
        return this.zzhrj;
    }

    public final Class<?> zzaye() {
        return this.zzhrj.getClass();
    }

    public final Set<Class<?>> zzaxt() {
        return Collections.singleton(this.zzhrj.zzaxp());
    }

    public final Class<?> zzayf() {
        return null;
    }
}
