package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcvm implements zzelo<zzcvf> {
    private final zzelx<Context> zzert;
    private final zzelx<Executor> zzfol;
    private final zzelx<zzchx> zzglj;

    public zzcvm(zzelx<Context> zzelx, zzelx<Executor> zzelx2, zzelx<zzchx> zzelx3) {
        this.zzert = zzelx;
        this.zzfol = zzelx2;
        this.zzglj = zzelx3;
    }

    public final /* synthetic */ Object get() {
        return new zzcvf(this.zzert.get(), this.zzfol.get(), this.zzglj.get());
    }
}
