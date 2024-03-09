package com.google.android.gms.internal.ads;

import java.lang.Throwable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzduj<V, X extends Throwable> extends zzduh<V, X, zzdsl<? super X, ? extends V>, V> {
    zzduj(zzdvt<? extends V> zzdvt, Class<X> cls, zzdsl<? super X, ? extends V> zzdsl) {
        super(zzdvt, cls, zzdsl);
    }

    /* access modifiers changed from: package-private */
    public final void setResult(@NullableDecl V v) {
        set(v);
    }

    /* access modifiers changed from: package-private */
    @NullableDecl
    public final /* synthetic */ Object zza(Object obj, Throwable th) throws Exception {
        return ((zzdsl) obj).apply(th);
    }
}
