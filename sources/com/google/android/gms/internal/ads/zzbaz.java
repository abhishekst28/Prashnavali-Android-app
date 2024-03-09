package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final /* synthetic */ class zzbaz implements zzbba {
    private final int zzedo;
    private final Map zzedp;

    zzbaz(int i, Map map) {
        this.zzedo = i;
        this.zzedp = map;
    }

    public final void zzb(JsonWriter jsonWriter) {
        zzbax.zza(this.zzedo, this.zzedp, jsonWriter);
    }
}
