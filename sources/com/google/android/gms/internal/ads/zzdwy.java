package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzehz;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdwy<KeyFormatProtoT extends zzehz, KeyProtoT extends zzehz> {
    private final zzdxa<KeyFormatProtoT, KeyProtoT> zzhqw;

    zzdwy(zzdxa<KeyFormatProtoT, KeyProtoT> zzdxa) {
        this.zzhqw = zzdxa;
    }

    /* access modifiers changed from: package-private */
    public final KeyProtoT zzq(zzeff zzeff) throws GeneralSecurityException, zzegz {
        KeyFormatProtoT zzr = this.zzhqw.zzr(zzeff);
        this.zzhqw.zzd(zzr);
        return (zzehz) this.zzhqw.zze(zzr);
    }
}
