package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebt;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdys extends zzdxj<zzebd, zzebe> {
    private static final byte[] zzhso = new byte[0];

    zzdys() {
        super(zzebd.class, zzebe.class, new zzdyv(zzdwu.class));
    }

    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    public final zzebt.zza zzaxs() {
        return zzebt.zza.ASYMMETRIC_PRIVATE;
    }

    public final zzdxa<zzeaz, zzebd> zzaxv() {
        return new zzdyu(this, zzeaz.class);
    }

    public final /* synthetic */ void zzc(zzehz zzehz) throws GeneralSecurityException {
        zzebd zzebd = (zzebd) zzehz;
        if (!zzebd.zzayi().isEmpty()) {
            zzeej.zzy(zzebd.getVersion(), 0);
            zzdze.zza(zzebd.zzbac().zzazv());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    public final /* synthetic */ zzehz zzp(zzeff zzeff) throws zzegz {
        return zzebd.zzp(zzeff, zzegc.zzbex());
    }
}
