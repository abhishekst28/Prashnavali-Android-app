package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbkp implements zzelo<zzazt> {
    private final zzelx<Context> zzert;

    public zzbkp(zzelx<Context> zzelx) {
        this.zzert = zzelx;
    }

    public final /* synthetic */ Object get() {
        return (zzazt) zzelu.zza(new zzazt(this.zzert.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
