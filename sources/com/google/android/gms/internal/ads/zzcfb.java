package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcfb implements zzelo<zzbys<VideoController.VideoLifecycleCallbacks>> {
    private final zzelx<zzchq> zzfmx;
    private final zzelx<Executor> zzfol;
    private final zzcew zzgat;

    public zzcfb(zzcew zzcew, zzelx<zzchq> zzelx, zzelx<Executor> zzelx2) {
        this.zzgat = zzcew;
        this.zzfmx = zzelx;
        this.zzfol = zzelx2;
    }

    public final /* synthetic */ Object get() {
        return (zzbys) zzelu.zza(new zzbys(this.zzfmx.get(), this.zzfol.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
