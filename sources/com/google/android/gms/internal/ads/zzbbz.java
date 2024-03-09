package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbbz implements zzdvi<T> {
    private final /* synthetic */ zzbbu zzeej;
    private final /* synthetic */ zzbbs zzeek;

    zzbbz(zzbbx zzbbx, zzbbu zzbbu, zzbbs zzbbs) {
        this.zzeej = zzbbu;
        this.zzeek = zzbbs;
    }

    public final void onSuccess(T t) {
        this.zzeej.zzh(t);
    }

    public final void zzb(Throwable th) {
        this.zzeek.run();
    }
}
