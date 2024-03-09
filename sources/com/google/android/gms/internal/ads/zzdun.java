package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdun<I, O> extends zzduk<I, O, zzduv<? super I, ? extends O>, zzdvt<? extends O>> {
    zzdun(zzdvt<? extends I> zzdvt, zzduv<? super I, ? extends O> zzduv) {
        super(zzdvt, zzduv);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void setResult(Object obj) {
        setFuture((zzdvt) obj);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzd(Object obj, @NullableDecl Object obj2) throws Exception {
        zzduv zzduv = (zzduv) obj;
        zzdvt zzf = zzduv.zzf(obj2);
        zzdsv.zza(zzf, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzduv);
        return zzf;
    }
}
