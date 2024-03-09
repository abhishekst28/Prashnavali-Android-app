package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbqf implements zzdvi<Void> {
    private final /* synthetic */ zzbqb zzfqz;

    zzbqf(zzbqb zzbqb) {
        this.zzfqz = zzbqb;
    }

    public final void zzb(Throwable th) {
        this.zzfqz.zzfqr.zzbh(false);
    }

    public final /* synthetic */ void onSuccess(@NullableDecl Object obj) {
        Void voidR = (Void) obj;
        this.zzfqz.zzfqr.zzbh(true);
    }
}
