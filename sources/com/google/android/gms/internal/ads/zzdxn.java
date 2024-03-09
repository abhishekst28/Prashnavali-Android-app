package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxm;
import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdxn implements zzdxm.zzb {
    private final /* synthetic */ zzdxj zzhrp;
    private final /* synthetic */ zzdwx zzhrq;

    zzdxn(zzdxj zzdxj, zzdwx zzdwx) {
        this.zzhrp = zzdxj;
        this.zzhrq = zzdwx;
    }

    public final <Q> zzdww<Q> zzb(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new zzdxk(this.zzhrp, this.zzhrq, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    public final zzdww<?> zzayd() {
        zzdxj zzdxj = this.zzhrp;
        return new zzdxk(zzdxj, this.zzhrq, zzdxj.zzaxu());
    }

    public final Class<?> zzaye() {
        return this.zzhrp.getClass();
    }

    public final Set<Class<?>> zzaxt() {
        return this.zzhrp.zzaxt();
    }

    public final Class<?> zzayf() {
        return this.zzhrq.getClass();
    }
}
