package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbfw implements zzdvi<Map<String, String>> {
    private final /* synthetic */ zzbft zzemo;
    private final /* synthetic */ List zzemp;
    private final /* synthetic */ String zzemq;

    zzbfw(zzbft zzbft, List list, String str) {
        this.zzemo = zzbft;
        this.zzemp = list;
        this.zzemq = str;
    }

    public final void zzb(Throwable th) {
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        this.zzemo.zza((Map<String, String>) (Map) obj, (List<zzahf<? super zzbfq>>) this.zzemp, this.zzemq);
    }
}
