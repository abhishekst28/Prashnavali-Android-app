package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbbw implements zzdvi<T> {
    private final /* synthetic */ zzbbx zzeeg;

    zzbbw(zzbbx zzbbx) {
        this.zzeeg = zzbbx;
    }

    public final void onSuccess(T t) {
        this.zzeeg.zzeei.set(1);
    }

    public final void zzb(Throwable th) {
        this.zzeeg.zzeei.set(-1);
    }
}
