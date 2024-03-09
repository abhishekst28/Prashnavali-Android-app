package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdzb implements zzdwt {
    private final zzdxf<zzdwt> zzhst;

    public zzdzb(zzdxf<zzdwt> zzdxf) {
        this.zzhst = zzdxf;
    }

    public final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzedd.zza(this.zzhst.zzaxy().zzayc(), this.zzhst.zzaxy().zzaxz().zzc(bArr, bArr2));
    }
}
