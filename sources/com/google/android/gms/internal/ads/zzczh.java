package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzczh implements zzelo<zzczf> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzcnq> zzghe;

    public zzczh(zzelx<Executor> zzelx, zzelx<zzcnq> zzelx2) {
        this.zzerr = zzelx;
        this.zzghe = zzelx2;
    }

    public final /* synthetic */ Object get() {
        return new zzczf(this.zzerr.get(), this.zzghe.get());
    }
}
