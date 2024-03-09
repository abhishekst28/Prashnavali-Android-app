package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcfq implements zzduv {
    private final zzdvt zzgbt;

    zzcfq(zzdvt zzdvt) {
        this.zzgbt = zzdvt;
    }

    public final zzdvt zzf(Object obj) {
        zzdvt zzdvt = this.zzgbt;
        zzbfq zzbfq = (zzbfq) obj;
        if (zzbfq != null && zzbfq.zzzo() != null) {
            return zzdvt;
        }
        throw new zzcuh(zzdmd.zzhco, "Retrieve video view in instream ad response failed.");
    }
}
