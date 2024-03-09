package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbnz implements zzelo<zzbys<zzqu>> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzbpc> zzfnr;
    private final zzbnl zzfoq;

    public zzbnz(zzbnl zzbnl, zzelx<zzbpc> zzelx, zzelx<Executor> zzelx2) {
        this.zzfoq = zzbnl;
        this.zzfnr = zzelx;
        this.zzerr = zzelx2;
    }

    public final /* synthetic */ Object get() {
        return (zzbys) zzelu.zza(new zzbys(this.zzfnr.get(), this.zzerr.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
