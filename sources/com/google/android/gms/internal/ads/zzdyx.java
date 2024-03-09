package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebt;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdyx extends zzdwx<zzebe> {
    public zzdyx() {
        super(zzebe.class, new zzdyw(zzdwt.class));
    }

    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    public final zzebt.zza zzaxs() {
        return zzebt.zza.ASYMMETRIC_PUBLIC;
    }

    public final /* synthetic */ void zzc(zzehz zzehz) throws GeneralSecurityException {
        zzebe zzebe = (zzebe) zzehz;
        zzeej.zzy(zzebe.getVersion(), 0);
        zzdze.zza(zzebe.zzazv());
    }

    public final /* synthetic */ zzehz zzp(zzeff zzeff) throws zzegz {
        return zzebe.zzq(zzeff, zzegc.zzbex());
    }
}
