package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
class zzdzn implements zzdxh<zzdxd> {
    private static final Logger logger = Logger.getLogger(zzdzn.class.getName());

    zzdzn() {
    }

    public final Class<zzdxd> zzaxp() {
        return zzdxd.class;
    }

    public final /* synthetic */ Object zza(zzdxf zzdxf) throws GeneralSecurityException {
        return new zza(zzdxf);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    static class zza implements zzdxd {
        private final zzdxf<zzdxd> zzhst;
        private final byte[] zzhte;

        private zza(zzdxf<zzdxd> zzdxf) {
            this.zzhte = new byte[]{0};
            this.zzhst = zzdxf;
        }

        public final byte[] zzl(byte[] bArr) throws GeneralSecurityException {
            if (this.zzhst.zzaxy().zzayb().equals(zzecn.LEGACY)) {
                return zzedd.zza(this.zzhst.zzaxy().zzayc(), this.zzhst.zzaxy().zzaxz().zzl(zzedd.zza(bArr, this.zzhte)));
            }
            return zzedd.zza(this.zzhst.zzaxy().zzayc(), this.zzhst.zzaxy().zzaxz().zzl(bArr));
        }
    }
}
