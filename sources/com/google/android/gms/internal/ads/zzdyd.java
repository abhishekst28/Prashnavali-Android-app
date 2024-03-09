package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdyd extends zzdxa<zzeai, zzeah> {
    private final /* synthetic */ zzdyb zzhsg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdyd(zzdyb zzdyb, Class cls) {
        super(cls);
        this.zzhsg = zzdyb;
    }

    public final /* synthetic */ Object zze(zzehz zzehz) throws GeneralSecurityException {
        zzeai zzeai = (zzeai) zzehz;
        return (zzeah) ((zzegp) zzeah.zzazh().zzv(zzeff.zzu(zzeei.zzfo(zzeai.getKeySize()))).zzb(zzeai.zzazg()).zzev(0).zzbfx());
    }

    public final /* synthetic */ zzehz zzr(zzeff zzeff) throws zzegz {
        return zzeai.zzj(zzeff, zzegc.zzbex());
    }

    public final /* synthetic */ void zzd(zzehz zzehz) throws GeneralSecurityException {
        zzeai zzeai = (zzeai) zzehz;
        zzeej.zzfp(zzeai.getKeySize());
        if (zzeai.zzazg().zzazd() != 12 && zzeai.zzazg().zzazd() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
