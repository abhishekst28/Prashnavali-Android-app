package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebt;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdzk extends zzdwx<zzebl> {
    public zzdzk() {
        super(zzebl.class, new zzdzj(zzdxd.class));
    }

    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    public final zzebt.zza zzaxs() {
        return zzebt.zza.SYMMETRIC;
    }

    /* access modifiers changed from: private */
    public static void zza(zzebq zzebq) throws GeneralSecurityException {
        if (zzebq.zzayn() >= 10) {
            int i = zzdzl.zzhsu[zzebq.zzbav().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new GeneralSecurityException("unknown hash type");
                    } else if (zzebq.zzayn() > 64) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (zzebq.zzayn() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (zzebq.zzayn() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    public final zzdxa<zzebp, zzebl> zzaxv() {
        return new zzdzm(this, zzebp.class);
    }

    public final /* synthetic */ void zzc(zzehz zzehz) throws GeneralSecurityException {
        zzebl zzebl = (zzebl) zzehz;
        zzeej.zzy(zzebl.getVersion(), 0);
        if (zzebl.zzayi().size() >= 16) {
            zza(zzebl.zzbap());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    public final /* synthetic */ zzehz zzp(zzeff zzeff) throws zzegz {
        return zzebl.zzr(zzeff, zzegc.zzbex());
    }
}
