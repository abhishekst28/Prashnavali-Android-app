package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzclj implements zzelo<zzcli> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzcln> zzesn;

    public zzclj(zzelx<zzcln> zzelx, zzelx<Executor> zzelx2) {
        this.zzesn = zzelx;
        this.zzerr = zzelx2;
    }

    public final /* synthetic */ Object get() {
        return new zzcli(this.zzesn.get(), this.zzerr.get());
    }
}
