package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdpe implements zzdvi<O> {
    private final /* synthetic */ zzdos zzhhb;
    private final /* synthetic */ zzdox zzhhc;

    zzdpe(zzdox zzdox, zzdos zzdos) {
        this.zzhhc = zzdox;
        this.zzhhb = zzdos;
    }

    public final void onSuccess(O o) {
        this.zzhhc.zzhgu.zzhgp.zzc(this.zzhhb);
    }

    public final void zzb(Throwable th) {
        this.zzhhc.zzhgu.zzhgp.zza(this.zzhhb, th);
    }
}
