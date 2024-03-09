package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdin implements zzdvi<Void> {
    zzdin(zzdii zzdii) {
    }

    public final void zzb(Throwable th) {
        zzaxy.zzei("Notification of cache hit failed.");
    }

    public final /* synthetic */ void onSuccess(@NullableDecl Object obj) {
        Void voidR = (Void) obj;
        zzaxy.zzei("Notification of cache hit successful.");
    }
}
