package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdum<I, O> extends zzduk<I, O, zzdsl<? super I, ? extends O>, O> {
    zzdum(zzdvt<? extends I> zzdvt, zzdsl<? super I, ? extends O> zzdsl) {
        super(zzdvt, zzdsl);
    }

    /* access modifiers changed from: package-private */
    public final void setResult(@NullableDecl O o) {
        set(o);
    }

    /* access modifiers changed from: package-private */
    @NullableDecl
    public final /* synthetic */ Object zzd(Object obj, @NullableDecl Object obj2) throws Exception {
        return ((zzdsl) obj).apply(obj2);
    }
}
