package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebt;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdyi extends zzdwx<zzecf> {
    zzdyi() {
        super(zzecf.class, new zzdyl(zzdwq.class));
    }

    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    public final zzebt.zza zzaxs() {
        return zzebt.zza.REMOTE;
    }

    public final zzdxa<zzeci, zzecf> zzaxv() {
        return new zzdyk(this, zzeci.class);
    }

    public final /* synthetic */ void zzc(zzehz zzehz) throws GeneralSecurityException {
        zzeej.zzy(((zzecf) zzehz).getVersion(), 0);
    }

    public final /* synthetic */ zzehz zzp(zzeff zzeff) throws zzegz {
        return zzecf.zzt(zzeff, zzegc.zzbex());
    }
}
