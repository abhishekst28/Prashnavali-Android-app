package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbkq implements zzelo<zzdqm> {
    private final zzelx<Context> zzert;

    public zzbkq(zzelx<Context> zzelx) {
        this.zzert = zzelx;
    }

    public final /* synthetic */ Object get() {
        return (zzdqm) zzelu.zza(new zzdqm(this.zzert.get(), zzp.zzld().zzyf()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
