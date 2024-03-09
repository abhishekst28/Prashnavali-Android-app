package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdxy extends zzdxa<zzead, zzeaa> {
    private final /* synthetic */ zzdxw zzhsf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdxy(zzdxw zzdxw, Class cls) {
        super(cls);
        this.zzhsf = zzdxw;
    }

    public final /* synthetic */ Object zze(zzehz zzehz) throws GeneralSecurityException {
        zzead zzead = (zzead) zzehz;
        return (zzeaa) ((zzegp) zzeaa.zzayy().zzc(zzead.zzayx()).zzu(zzeff.zzu(zzeei.zzfo(zzead.getKeySize()))).zzeu(0).zzbfx());
    }

    public final /* synthetic */ zzehz zzr(zzeff zzeff) throws zzegz {
        return zzead.zzh(zzeff, zzegc.zzbex());
    }

    public final /* synthetic */ void zzd(zzehz zzehz) throws GeneralSecurityException {
        zzead zzead = (zzead) zzehz;
        zzeej.zzfp(zzead.getKeySize());
        zzdxw.zza(zzead.zzayx());
    }
}
