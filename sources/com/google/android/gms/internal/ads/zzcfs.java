package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcfs implements zzduv {
    private final zzdvt zzgbt;

    zzcfs(zzdvt zzdvt) {
        this.zzgbt = zzdvt;
    }

    public final zzdvt zzf(Object obj) {
        zzdvt zzdvt = this.zzgbt;
        if (obj != null) {
            return zzdvt;
        }
        return zzdvl.immediateFailedFuture(new zzcuh(zzdmd.zzhco, "Retrieve required value in native ad response failed."));
    }
}
