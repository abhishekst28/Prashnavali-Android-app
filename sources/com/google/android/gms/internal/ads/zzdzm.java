package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdzm extends zzdxa<zzebp, zzebl> {
    private final /* synthetic */ zzdzk zzhtc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdzm(zzdzk zzdzk, Class cls) {
        super(cls);
        this.zzhtc = zzdzk;
    }

    public final /* synthetic */ Object zze(zzehz zzehz) throws GeneralSecurityException {
        zzebp zzebp = (zzebp) zzehz;
        return (zzebl) ((zzegp) zzebl.zzbaq().zzfd(0).zzd(zzebp.zzbap()).zzad(zzeff.zzu(zzeei.zzfo(zzebp.getKeySize()))).zzbfx());
    }

    public final /* synthetic */ zzehz zzr(zzeff zzeff) throws zzegz {
        return zzebp.zzs(zzeff, zzegc.zzbex());
    }

    public final /* synthetic */ void zzd(zzehz zzehz) throws GeneralSecurityException {
        zzebp zzebp = (zzebp) zzehz;
        if (zzebp.getKeySize() >= 16) {
            zzdzk.zza(zzebp.zzbap());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
