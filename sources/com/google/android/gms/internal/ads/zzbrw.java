package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbrw implements zzdvi<Boolean> {
    private final /* synthetic */ zzbru zzfrv;

    zzbrw(zzbru zzbru) {
        this.zzfrv = zzbru;
    }

    public final void zzb(Throwable th) {
    }

    public final /* synthetic */ void onSuccess(@NullableDecl Object obj) {
        Boolean bool = (Boolean) obj;
        this.zzfrv.zzfrn.onAdImpression();
    }
}
