package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdxx extends zzdxa<zzdzz, zzdzw> {
    private final /* synthetic */ zzdxv zzhse;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdxx(zzdxv zzdxv, Class cls) {
        super(cls);
        this.zzhse = zzdxv;
    }

    public final /* synthetic */ Object zze(zzehz zzehz) throws GeneralSecurityException {
        zzdzz zzdzz = (zzdzz) zzehz;
        return (zzdzw) ((zzegp) zzdzw.zzays().zzb((zzeaa) new zzdxw().zzaxv().zze(zzdzz.zzayu())).zzb((zzebl) new zzdzk().zzaxv().zze(zzdzz.zzayv())).zzet(0).zzbfx());
    }

    public final /* synthetic */ zzehz zzr(zzeff zzeff) throws zzegz {
        return zzdzz.zzf(zzeff, zzegc.zzbex());
    }

    public final /* synthetic */ void zzd(zzehz zzehz) throws GeneralSecurityException {
        zzdzz zzdzz = (zzdzz) zzehz;
        new zzdxw().zzaxv().zzd(zzdzz.zzayu());
        new zzdzk().zzaxv().zzd(zzdzz.zzayv());
        zzeej.zzfp(zzdzz.zzayu().getKeySize());
    }
}
