package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdnu implements zzdvi<zzdnh<AdT>> {
    private final /* synthetic */ zzdnp zzhfy;

    zzdnu(zzdnp zzdnp) {
        this.zzhfy = zzdnp;
    }

    public final void zzb(Throwable th) {
        synchronized (this.zzhfy) {
            this.zzhfy.zzhfs.zzb(th);
            this.zzhfy.zzhfp.setException(th);
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzdnh zzdnh = (zzdnh) obj;
        synchronized (this.zzhfy) {
            this.zzhfy.zzhfs.zza(zzdnh);
            if (this.zzhfy.zzhfr != zzdnf.zzhfa) {
                this.zzhfy.zzgyr.zza(this.zzhfy.zzhfo.zzasd(), zzdnh);
            }
            if (this.zzhfy.zzhfr == zzdnf.zzhez) {
                this.zzhfy.zzd(this.zzhfy.zzhfo);
            }
            int unused = this.zzhfy.zzhfr = zzdnf.zzhez;
            this.zzhfy.zzhfp.set(zzdnh);
        }
    }
}
