package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzari extends zzarf {
    private final /* synthetic */ UpdateImpressionUrlsCallback zzdpi;

    zzari(zzarj zzarj, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zzdpi = updateImpressionUrlsCallback;
    }

    public final void onSuccess(List<Uri> list) {
        this.zzdpi.onSuccess(list);
    }

    public final void onError(String str) {
        this.zzdpi.onFailure(str);
    }
}
