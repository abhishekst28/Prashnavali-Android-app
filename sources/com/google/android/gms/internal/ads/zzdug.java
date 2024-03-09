package com.google.android.gms.internal.ads;

import java.lang.Throwable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdug<V, X extends Throwable> extends zzduh<V, X, zzduv<? super X, ? extends V>, zzdvt<? extends V>> {
    zzdug(zzdvt<? extends V> zzdvt, Class<X> cls, zzduv<? super X, ? extends V> zzduv) {
        super(zzdvt, cls, zzduv);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void setResult(Object obj) {
        setFuture((zzdvt) obj);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zza(Object obj, Throwable th) throws Exception {
        zzduv zzduv = (zzduv) obj;
        zzdvt zzf = zzduv.zzf(th);
        zzdsv.zza(zzf, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzduv);
        return zzf;
    }
}
