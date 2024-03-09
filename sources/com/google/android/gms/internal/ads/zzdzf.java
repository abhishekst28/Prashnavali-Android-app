package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebt;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdzf extends zzdwx<zzdzr> {
    zzdzf() {
        super(zzdzr.class, new zzdzi(zzdxd.class));
    }

    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    public final zzebt.zza zzaxs() {
        return zzebt.zza.SYMMETRIC;
    }

    /* access modifiers changed from: private */
    public static void zza(zzdzv zzdzv) throws GeneralSecurityException {
        if (zzdzv.zzayn() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (zzdzv.zzayn() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* access modifiers changed from: private */
    public static void zzeq(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 16 bytes");
        }
    }

    public final zzdxa<zzdzs, zzdzr> zzaxv() {
        return new zzdzh(this, zzdzs.class);
    }

    public final /* synthetic */ void zzc(zzehz zzehz) throws GeneralSecurityException {
        zzdzr zzdzr = (zzdzr) zzehz;
        zzeej.zzy(zzdzr.getVersion(), 0);
        zzeq(zzdzr.zzayi().size());
        zza(zzdzr.zzayj());
    }

    public final /* synthetic */ zzehz zzp(zzeff zzeff) throws zzegz {
        return zzdzr.zzc(zzeff, zzegc.zzbex());
    }
}
