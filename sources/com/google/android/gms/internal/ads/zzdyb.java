package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebt;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdyb extends zzdwx<zzeah> {
    zzdyb() {
        super(zzeah.class, new zzdya(zzdwq.class));
    }

    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public final zzebt.zza zzaxs() {
        return zzebt.zza.SYMMETRIC;
    }

    public final zzdxa<zzeai, zzeah> zzaxv() {
        return new zzdyd(this, zzeai.class);
    }

    public final /* synthetic */ void zzc(zzehz zzehz) throws GeneralSecurityException {
        zzeah zzeah = (zzeah) zzehz;
        zzeej.zzy(zzeah.getVersion(), 0);
        zzeej.zzfp(zzeah.zzayi().size());
        if (zzeah.zzazg().zzazd() != 12 && zzeah.zzazg().zzazd() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    public final /* synthetic */ zzehz zzp(zzeff zzeff) throws zzegz {
        return zzeah.zzi(zzeff, zzegc.zzbex());
    }
}
