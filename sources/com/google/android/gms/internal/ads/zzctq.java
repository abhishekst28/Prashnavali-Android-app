package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzctq implements zzelo<zzctn> {
    private final zzelx<Context> zzert;
    private final zzelx<Executor> zzfol;
    private final zzelx<zzcbn> zzglj;

    public zzctq(zzelx<Context> zzelx, zzelx<zzcbn> zzelx2, zzelx<Executor> zzelx3) {
        this.zzert = zzelx;
        this.zzglj = zzelx2;
        this.zzfol = zzelx3;
    }

    public final /* synthetic */ Object get() {
        return new zzctn(this.zzert.get(), this.zzglj.get(), this.zzfol.get());
    }
}
