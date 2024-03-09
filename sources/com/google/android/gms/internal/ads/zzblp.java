package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzblp implements zzdvi<String> {
    private final /* synthetic */ String zzflo;
    private final /* synthetic */ zzbln zzflp;

    zzblp(zzbln zzbln, String str) {
        this.zzflp = zzbln;
        this.zzflo = str;
    }

    public final void zzb(Throwable th) {
        this.zzflp.zzfli.zza(this.zzflp.zzflg, this.zzflp.zzflh, false, this.zzflo, (String) null, this.zzflp.zzflh.zzdit);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        this.zzflp.zzfli.zza(this.zzflp.zzflg, this.zzflp.zzflh, false, this.zzflo, (String) obj, this.zzflp.zzflh.zzdit);
    }
}
