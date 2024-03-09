package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdwk extends zzdvs<zzdvt<V>> {
    private final /* synthetic */ zzdwh zzhqn;
    private final zzdut<V> zzhqo;

    zzdwk(zzdwh zzdwh, zzdut<V> zzdut) {
        this.zzhqn = zzdwh;
        this.zzhqo = (zzdut) zzdsv.checkNotNull(zzdut);
    }

    /* access modifiers changed from: package-private */
    public final boolean isDone() {
        return this.zzhqn.isDone();
    }

    /* access modifiers changed from: package-private */
    public final String zzaxj() {
        return this.zzhqo.toString();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Object obj, Throwable th) {
        zzdvt zzdvt = (zzdvt) obj;
        if (th == null) {
            this.zzhqn.setFuture(zzdvt);
        } else {
            this.zzhqn.setException(th);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzaxi() throws Exception {
        return (zzdvt) zzdsv.zza(this.zzhqo.zzard(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.zzhqo);
    }
}
