package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzchi implements zzdvi<zzbfq> {
    private final /* synthetic */ String zzgcp;
    private final /* synthetic */ Map zzgcq;

    zzchi(zzchc zzchc, String str, Map map) {
        this.zzgcp = str;
        this.zzgcq = map;
    }

    public final void zzb(Throwable th) {
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        ((zzbfq) obj).zza(this.zzgcp, this.zzgcq);
    }
}
