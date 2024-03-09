package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdzj extends zzdwz<zzdxd, zzebl> {
    zzdzj(Class cls) {
        super(cls);
    }

    public final /* synthetic */ Object zzag(Object obj) throws GeneralSecurityException {
        zzebl zzebl = (zzebl) obj;
        zzebj zzbav = zzebl.zzbap().zzbav();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzebl.zzayi().toByteArray(), "HMAC");
        int zzayn = zzebl.zzbap().zzayn();
        int i = zzdzl.zzhsu[zzbav.ordinal()];
        if (i == 1) {
            return new zzeeg("HMACSHA1", secretKeySpec, zzayn);
        }
        if (i == 2) {
            return new zzeeg("HMACSHA256", secretKeySpec, zzayn);
        }
        if (i == 3) {
            return new zzeeg("HMACSHA512", secretKeySpec, zzayn);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
