package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdye extends zzdxa<zzeap, zzeam> {
    private final /* synthetic */ zzdyc zzhsh;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdye(zzdyc zzdyc, Class cls) {
        super(cls);
        this.zzhsh = zzdyc;
    }

    public final /* synthetic */ Object zze(zzehz zzehz) throws GeneralSecurityException {
        return (zzeam) ((zzegp) zzeam.zzazm().zzw(zzeff.zzu(zzeei.zzfo(((zzeap) zzehz).getKeySize()))).zzew(0).zzbfx());
    }

    public final /* synthetic */ zzehz zzr(zzeff zzeff) throws zzegz {
        return zzeap.zzl(zzeff, zzegc.zzbex());
    }

    public final /* synthetic */ void zzd(zzehz zzehz) throws GeneralSecurityException {
        zzeej.zzfp(((zzeap) zzehz).getKeySize());
    }
}
