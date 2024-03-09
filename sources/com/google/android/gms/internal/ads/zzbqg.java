package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbqg implements zzdvi<zzasp> {
    private final /* synthetic */ zzbqb zzfqz;

    zzbqg(zzbqb zzbqb) {
        this.zzfqz = zzbqb;
    }

    public final void zzb(Throwable th) {
        this.zzfqz.zzfqr.zzbg(false);
    }

    public final /* synthetic */ void onSuccess(@NullableDecl Object obj) {
        zzasp zzasp = (zzasp) obj;
        this.zzfqz.zzfqr.zzbg(true);
    }
}
