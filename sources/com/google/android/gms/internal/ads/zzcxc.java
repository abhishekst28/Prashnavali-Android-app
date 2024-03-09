package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcxc implements zzelo<zzcwz> {
    private final zzelx<Context> zzert;
    private final zzelx<zzdln> zzfos;
    private final zzelx<zzwl> zzgpu;
    private final zzelx<zzbni> zzgpv;

    public zzcxc(zzelx<Context> zzelx, zzelx<zzwl> zzelx2, zzelx<zzdln> zzelx3, zzelx<zzbni> zzelx4) {
        this.zzert = zzelx;
        this.zzgpu = zzelx2;
        this.zzfos = zzelx3;
        this.zzgpv = zzelx4;
    }

    public final /* synthetic */ Object get() {
        return new zzcwz(this.zzert.get(), this.zzgpu.get(), this.zzfos.get(), this.zzgpv.get());
    }
}
