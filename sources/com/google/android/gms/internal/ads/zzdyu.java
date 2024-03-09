package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdyu extends zzdxa<zzeaz, zzebd> {
    private final /* synthetic */ zzdys zzhsq;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdyu(zzdys zzdys, Class cls) {
        super(cls);
        this.zzhsq = zzdys;
    }

    public final /* synthetic */ Object zze(zzehz zzehz) throws GeneralSecurityException {
        zzeaz zzeaz = (zzeaz) zzehz;
        KeyPair zza = zzedq.zza(zzedq.zza(zzdze.zza(zzeaz.zzazv().zzazx().zzbak())));
        ECPoint w = ((ECPublicKey) zza.getPublic()).getW();
        return (zzebd) ((zzegp) zzebd.zzbad().zzez(0).zzb((zzebe) ((zzegp) zzebe.zzbah().zzfa(0).zzc(zzeaz.zzazv()).zzab(zzeff.zzu(w.getAffineX().toByteArray())).zzac(zzeff.zzu(w.getAffineY().toByteArray())).zzbfx())).zzaa(zzeff.zzu(((ECPrivateKey) zza.getPrivate()).getS().toByteArray())).zzbfx());
    }

    public final /* synthetic */ zzehz zzr(zzeff zzeff) throws zzegz {
        return zzeaz.zzo(zzeff, zzegc.zzbex());
    }

    public final /* synthetic */ void zzd(zzehz zzehz) throws GeneralSecurityException {
        zzdze.zza(((zzeaz) zzehz).zzazv());
    }
}
