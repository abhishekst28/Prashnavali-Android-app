package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzarg extends zzaws {
    private final /* synthetic */ QueryInfoGenerationCallback zzdpf;

    zzarg(zzarh zzarh, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        this.zzdpf = queryInfoGenerationCallback;
    }

    public final void zzk(String str, String str2) {
        QueryInfo queryInfo = new QueryInfo(new zzzb(str, (Bundle) null));
        zzwe.zzpy().put(queryInfo, str2);
        this.zzdpf.onSuccess(queryInfo);
    }

    public final void onError(String str) {
        this.zzdpf.onFailure(str);
    }

    public final void zza(String str, String str2, Bundle bundle) {
        QueryInfo queryInfo = new QueryInfo(new zzzb(str, bundle));
        zzwe.zzpy().put(queryInfo, str2);
        this.zzdpf.onSuccess(queryInfo);
    }
}
