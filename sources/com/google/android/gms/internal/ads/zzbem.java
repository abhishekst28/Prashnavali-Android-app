package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbem implements zzbfd {
    public final zzbev zza(zzbde zzbde, int i, String str, zzbdf zzbdf) {
        if (i <= 0) {
            return new zzbfc(zzbde);
        }
        int zzaas = zzbeb.zzaas();
        if (zzaas < zzbdf.zzeib) {
            return new zzbfg(zzbde, zzbdf);
        }
        if (zzaas < zzbdf.zzehv) {
            return new zzbfh(zzbde, zzbdf);
        }
        return new zzbff(zzbde);
    }
}
