package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebt;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdyh extends zzdwx<zzeaq> {
    zzdyh() {
        super(zzeaq.class, new zzdyg(zzdwq.class));
    }

    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public final zzebt.zza zzaxs() {
        return zzebt.zza.SYMMETRIC;
    }

    public final zzdxa<zzeat, zzeaq> zzaxv() {
        return new zzdyj(this, zzeat.class);
    }

    public final /* synthetic */ void zzc(zzehz zzehz) throws GeneralSecurityException {
        zzeaq zzeaq = (zzeaq) zzehz;
        zzeej.zzy(zzeaq.getVersion(), 0);
        if (zzeaq.zzayi().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    public final /* synthetic */ zzehz zzp(zzeff zzeff) throws zzegz {
        return zzeaq.zzm(zzeff, zzegc.zzbex());
    }
}
