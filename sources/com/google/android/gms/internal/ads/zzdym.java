package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebt;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdym extends zzdwx<zzecj> {
    zzdym() {
        super(zzecj.class, new zzdyp(zzdwq.class));
    }

    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    public final zzebt.zza zzaxs() {
        return zzebt.zza.REMOTE;
    }

    public final zzdxa<zzecm, zzecj> zzaxv() {
        return new zzdyo(this, zzecm.class);
    }

    public final /* synthetic */ void zzc(zzehz zzehz) throws GeneralSecurityException {
        zzeej.zzy(((zzecj) zzehz).getVersion(), 0);
    }

    public final /* synthetic */ zzehz zzp(zzeff zzeff) throws zzegz {
        return zzecj.zzv(zzeff, zzegc.zzbex());
    }
}
