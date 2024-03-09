package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebt;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdyc extends zzdwx<zzeam> {
    zzdyc() {
        super(zzeam.class, new zzdyf(zzdwq.class));
    }

    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public final zzebt.zza zzaxs() {
        return zzebt.zza.SYMMETRIC;
    }

    public final zzdxa<zzeap, zzeam> zzaxv() {
        return new zzdye(this, zzeap.class);
    }

    public final /* synthetic */ void zzc(zzehz zzehz) throws GeneralSecurityException {
        zzeam zzeam = (zzeam) zzehz;
        zzeej.zzy(zzeam.getVersion(), 0);
        zzeej.zzfp(zzeam.zzayi().size());
    }

    public final /* synthetic */ zzehz zzp(zzeff zzeff) throws zzegz {
        return zzeam.zzk(zzeff, zzegc.zzbex());
    }
}
