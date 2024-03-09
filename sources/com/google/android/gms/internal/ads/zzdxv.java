package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebt;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdxv extends zzdwx<zzdzw> {
    zzdxv() {
        super(zzdzw.class, new zzdxu(zzdwq.class));
    }

    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public final zzebt.zza zzaxs() {
        return zzebt.zza.SYMMETRIC;
    }

    public final zzdxa<zzdzz, zzdzw> zzaxv() {
        return new zzdxx(this, zzdzz.class);
    }

    public final /* synthetic */ void zzc(zzehz zzehz) throws GeneralSecurityException {
        zzeej.zzy(((zzdzw) zzehz).getVersion(), 0);
    }

    public final /* synthetic */ zzehz zzp(zzeff zzeff) throws zzegz {
        return zzdzw.zze(zzeff, zzegc.zzbex());
    }
}
