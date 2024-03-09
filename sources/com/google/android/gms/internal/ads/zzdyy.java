package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class zzdyy implements zzdxh<zzdwu> {
    private static final Logger logger = Logger.getLogger(zzdyy.class.getName());

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    static class zza implements zzdwu {
        private final zzdxf<zzdwu> zzhst;

        public zza(zzdxf<zzdwu> zzdxf) {
            this.zzhst = zzdxf;
        }
    }

    zzdyy() {
    }

    public final Class<zzdwu> zzaxp() {
        return zzdwu.class;
    }

    public final /* synthetic */ Object zza(zzdxf zzdxf) throws GeneralSecurityException {
        return new zza(zzdxf);
    }
}
