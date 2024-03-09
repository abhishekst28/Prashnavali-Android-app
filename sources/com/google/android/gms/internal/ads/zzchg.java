package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzchg implements zzdvi<zzbfq> {
    private final /* synthetic */ String zzemq;
    private final /* synthetic */ zzahf zzgco;

    zzchg(zzchc zzchc, String str, zzahf zzahf) {
        this.zzemq = str;
        this.zzgco = zzahf;
    }

    public final void zzb(Throwable th) {
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        ((zzbfq) obj).zza(this.zzemq, (zzahf<? super zzbfq>) this.zzgco);
    }
}
