package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzehz;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class zzdwv<PrimitiveT, KeyProtoT extends zzehz> implements zzdww<PrimitiveT> {
    private final zzdwx<KeyProtoT> zzhqr;
    private final Class<PrimitiveT> zzhqs;

    public zzdwv(zzdwx<KeyProtoT> zzdwx, Class<PrimitiveT> cls) {
        if (zzdwx.zzaxt().contains(cls) || Void.class.equals(cls)) {
            this.zzhqr = zzdwx;
            this.zzhqs = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{zzdwx.toString(), cls.getName()}));
    }

    public final PrimitiveT zzm(zzeff zzeff) throws GeneralSecurityException {
        try {
            return zzb(this.zzhqr.zzp(zzeff));
        } catch (zzegz e) {
            String valueOf = String.valueOf(this.zzhqr.zzaxr().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e);
        }
    }

    public final PrimitiveT zza(zzehz zzehz) throws GeneralSecurityException {
        String valueOf = String.valueOf(this.zzhqr.zzaxr().getName());
        String concat = valueOf.length() != 0 ? "Expected proto of type ".concat(valueOf) : new String("Expected proto of type ");
        if (this.zzhqr.zzaxr().isInstance(zzehz)) {
            return zzb(zzehz);
        }
        throw new GeneralSecurityException(concat);
    }

    public final zzehz zzn(zzeff zzeff) throws GeneralSecurityException {
        try {
            return zzaxq().zzq(zzeff);
        } catch (zzegz e) {
            String valueOf = String.valueOf(this.zzhqr.zzaxv().zzaxw().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e);
        }
    }

    public final String getKeyType() {
        return this.zzhqr.getKeyType();
    }

    public final zzebt zzo(zzeff zzeff) throws GeneralSecurityException {
        try {
            return (zzebt) ((zzegp) zzebt.zzbbb().zzhq(this.zzhqr.getKeyType()).zzaf(zzaxq().zzq(zzeff).zzbda()).zzb(this.zzhqr.zzaxs()).zzbfx());
        } catch (zzegz e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    public final Class<PrimitiveT> zzaxp() {
        return this.zzhqs;
    }

    private final PrimitiveT zzb(KeyProtoT keyprotot) throws GeneralSecurityException {
        if (!Void.class.equals(this.zzhqs)) {
            this.zzhqr.zzc(keyprotot);
            return this.zzhqr.zza(keyprotot, this.zzhqs);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    private final zzdwy<?, KeyProtoT> zzaxq() {
        return new zzdwy<>(this.zzhqr.zzaxv());
    }
}
