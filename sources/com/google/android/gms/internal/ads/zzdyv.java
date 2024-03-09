package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdyv extends zzdwz<zzdwu, zzebd> {
    zzdyv(Class cls) {
        super(cls);
    }

    public final /* synthetic */ Object zzag(Object obj) throws GeneralSecurityException {
        zzebd zzebd = (zzebd) obj;
        zzeba zzazv = zzebd.zzbac().zzazv();
        zzebh zzazx = zzazv.zzazx();
        zzeds zza = zzdze.zza(zzazx.zzbak());
        byte[] byteArray = zzebd.zzayi().toByteArray();
        ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(new BigInteger(1, byteArray), zzedq.zza(zza));
        return new zzedj((ECPrivateKey) zzedt.zzhzs.zzhs("EC").generatePrivate(eCPrivateKeySpec), zzazx.zzbam().toByteArray(), zzdze.zza(zzazx.zzbal()), zzdze.zza(zzazv.zzazz()), new zzdzg(zzazv.zzazy().zzazs()));
    }
}
