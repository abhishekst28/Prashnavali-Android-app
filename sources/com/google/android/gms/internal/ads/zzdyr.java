package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebt;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdyr extends zzdwx<zzecs> {
    zzdyr() {
        super(zzecs.class, new zzdyq(zzdwq.class));
    }

    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public final zzebt.zza zzaxs() {
        return zzebt.zza.SYMMETRIC;
    }

    public final zzdxa<zzect, zzecs> zzaxv() {
        return new zzdyt(this, zzect.class);
    }

    public final /* synthetic */ void zzc(zzehz zzehz) throws GeneralSecurityException {
        zzecs zzecs = (zzecs) zzehz;
        zzeej.zzy(zzecs.getVersion(), 0);
        if (zzecs.zzayi().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    public final /* synthetic */ zzehz zzp(zzeff zzeff) throws zzegz {
        return zzecs.zzx(zzeff, zzegc.zzbex());
    }
}
