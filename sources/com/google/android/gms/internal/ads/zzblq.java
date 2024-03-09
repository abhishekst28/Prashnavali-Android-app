package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzblq implements zzdvi<String> {
    private final /* synthetic */ zzbln zzflp;

    zzblq(zzbln zzbln) {
        this.zzflp = zzbln;
    }

    public final void zzb(Throwable th) {
        this.zzflp.zzfli.zza(this.zzflp.zzflg, this.zzflp.zzflh, false, "", "failure_click_attok", this.zzflp.zzflh.zzdis);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        this.zzflp.zzfli.zza(this.zzflp.zzflg, this.zzflp.zzflh, false, "", (String) obj, this.zzflp.zzflh.zzdis);
    }
}
