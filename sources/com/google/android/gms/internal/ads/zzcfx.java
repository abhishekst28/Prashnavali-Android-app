package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcfx implements zzelo<zzcft> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzcfj> zzgbo;

    public zzcfx(zzelx<Executor> zzelx, zzelx<zzcfj> zzelx2) {
        this.zzerr = zzelx;
        this.zzgbo = zzelx2;
    }

    public final /* synthetic */ Object get() {
        return new zzcft(this.zzerr.get(), this.zzgbo.get());
    }
}
