package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcfg implements zzelo<zzcfe> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzazt> zzfch;
    private final zzelx<Clock> zzfms;

    public zzcfg(zzelx<zzazt> zzelx, zzelx<Clock> zzelx2, zzelx<Executor> zzelx3) {
        this.zzfch = zzelx;
        this.zzfms = zzelx2;
        this.zzerr = zzelx3;
    }

    public final /* synthetic */ Object get() {
        return new zzcfe(this.zzfch.get(), this.zzfms.get(), this.zzerr.get());
    }
}
