package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class zzdxr implements zzdxh<zzdwq> {
    private static final Logger logger = Logger.getLogger(zzdxr.class.getName());

    zzdxr() {
    }

    public final Class<zzdwq> zzaxp() {
        return zzdwq.class;
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    static class zza implements zzdwq {
        private final zzdxf<zzdwq> zzhsd;

        private zza(zzdxf<zzdwq> zzdxf) {
            this.zzhsd = zzdxf;
        }

        public final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            return zzedd.zza(this.zzhsd.zzaxy().zzayc(), this.zzhsd.zzaxy().zzaxz().zzc(bArr, bArr2));
        }
    }

    public final /* synthetic */ Object zza(zzdxf zzdxf) throws GeneralSecurityException {
        return new zza(zzdxf);
    }
}
