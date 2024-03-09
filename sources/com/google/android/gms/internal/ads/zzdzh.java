package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdzh extends zzdxa<zzdzs, zzdzr> {
    zzdzh(zzdzf zzdzf, Class cls) {
        super(cls);
    }

    public final /* synthetic */ Object zze(zzehz zzehz) throws GeneralSecurityException {
        zzdzs zzdzs = (zzdzs) zzehz;
        return (zzdzr) ((zzegp) zzdzr.zzayk().zzes(0).zzt(zzeff.zzu(zzeei.zzfo(zzdzs.getKeySize()))).zzd(zzdzs.zzayj()).zzbfx());
    }

    public final /* synthetic */ zzehz zzr(zzeff zzeff) throws zzegz {
        return zzdzs.zzd(zzeff, zzegc.zzbex());
    }

    public final /* synthetic */ void zzd(zzehz zzehz) throws GeneralSecurityException {
        zzdzs zzdzs = (zzdzs) zzehz;
        zzdzf.zza(zzdzs.zzayj());
        zzdzf.zzeq(zzdzs.getKeySize());
    }
}
