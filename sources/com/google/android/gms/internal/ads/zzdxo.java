package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxm;
import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdxo implements zzdxm.zzb {
    private final /* synthetic */ zzdwx zzhrr;

    zzdxo(zzdwx zzdwx) {
        this.zzhrr = zzdwx;
    }

    public final <Q> zzdww<Q> zzb(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new zzdwv(this.zzhrr, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    public final zzdww<?> zzayd() {
        zzdwx zzdwx = this.zzhrr;
        return new zzdwv(zzdwx, zzdwx.zzaxu());
    }

    public final Class<?> zzaye() {
        return this.zzhrr.getClass();
    }

    public final Set<Class<?>> zzaxt() {
        return this.zzhrr.zzaxt();
    }

    public final Class<?> zzayf() {
        return null;
    }
}
