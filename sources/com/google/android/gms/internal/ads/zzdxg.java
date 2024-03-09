package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebt;
import com.google.android.gms.internal.ads.zzecb;
import java.security.GeneralSecurityException;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdxg {
    @Deprecated
    public static final zzdxc zzm(byte[] bArr) throws GeneralSecurityException {
        try {
            zzecb zzc = zzecb.zzc(bArr, zzegc.zzbex());
            for (zzecb.zzb next : zzc.zzbbm()) {
                if (next.zzbbq().zzbba() == zzebt.zza.UNKNOWN_KEYMATERIAL || next.zzbbq().zzbba() == zzebt.zza.SYMMETRIC || next.zzbbq().zzbba() == zzebt.zza.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return zzdxc.zza(zzc);
        } catch (zzegz e) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
