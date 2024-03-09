package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzark {
    /* access modifiers changed from: private */
    @Nonnull
    public View zzaat;
    /* access modifiers changed from: private */
    public final Map<String, WeakReference<View>> zzdpj = new HashMap();

    public final zzark zzk(View view) {
        this.zzaat = view;
        return this;
    }

    public final zzark zzh(Map<String, View> map) {
        this.zzdpj.clear();
        for (Map.Entry next : map.entrySet()) {
            View view = (View) next.getValue();
            if (view != null) {
                this.zzdpj.put((String) next.getKey(), new WeakReference(view));
            }
        }
        return this;
    }
}
