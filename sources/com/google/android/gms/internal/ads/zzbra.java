package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbra implements zzelo<zza> {
    private final zzelx<Context> zzert;
    private final zzbqx zzfrg;
    private final zzelx<zzavu> zzfrh;

    private zzbra(zzbqx zzbqx, zzelx<Context> zzelx, zzelx<zzavu> zzelx2) {
        this.zzfrg = zzbqx;
        this.zzert = zzelx;
        this.zzfrh = zzelx2;
    }

    public static zzbra zza(zzbqx zzbqx, zzelx<Context> zzelx, zzelx<zzavu> zzelx2) {
        return new zzbra(zzbqx, zzelx, zzelx2);
    }

    public final /* synthetic */ Object get() {
        return (zza) zzelu.zza(new zza(this.zzert.get(), this.zzfrh.get(), (zzasa) null), "Cannot return null from a non-@Nullable @Provides method");
    }
}
