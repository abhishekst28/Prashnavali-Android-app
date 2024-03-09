package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzarl extends zzarf {
    private final /* synthetic */ UpdateClickUrlCallback zzdpl;

    zzarl(zzarj zzarj, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zzdpl = updateClickUrlCallback;
    }

    public final void onSuccess(List<Uri> list) {
        this.zzdpl.onSuccess(list.get(0));
    }

    public final void onError(String str) {
        this.zzdpl.onFailure(str);
    }
}
