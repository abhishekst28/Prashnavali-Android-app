package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcci implements zzelo<zzbyr> {
    private final zzelx<Context> zzert;
    private final zzelx<zzdkx> zzfpe;

    public zzcci(zzelx<Context> zzelx, zzelx<zzdkx> zzelx2) {
        this.zzert = zzelx;
        this.zzfpe = zzelx2;
    }

    public final /* synthetic */ Object get() {
        return (zzbyr) zzelu.zza(new zzbyr(this.zzert.get(), new HashSet(), this.zzfpe.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
