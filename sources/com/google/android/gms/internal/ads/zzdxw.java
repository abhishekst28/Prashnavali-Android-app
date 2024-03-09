package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebt;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdxw extends zzdwx<zzeaa> {
    zzdxw() {
        super(zzeaa.class, new zzdxz(zzeed.class));
    }

    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    public final zzebt.zza zzaxs() {
        return zzebt.zza.SYMMETRIC;
    }

    public final zzdxa<zzead, zzeaa> zzaxv() {
        return new zzdxy(this, zzead.class);
    }

    /* access modifiers changed from: private */
    public static void zza(zzeae zzeae) throws GeneralSecurityException {
        if (zzeae.zzazd() < 12 || zzeae.zzazd() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    public final /* synthetic */ void zzc(zzehz zzehz) throws GeneralSecurityException {
        zzeaa zzeaa = (zzeaa) zzehz;
        zzeej.zzy(zzeaa.getVersion(), 0);
        zzeej.zzfp(zzeaa.zzayi().size());
        zza(zzeaa.zzayx());
    }

    public final /* synthetic */ zzehz zzp(zzeff zzeff) throws zzegz {
        return zzeaa.zzg(zzeff, zzegc.zzbex());
    }
}
