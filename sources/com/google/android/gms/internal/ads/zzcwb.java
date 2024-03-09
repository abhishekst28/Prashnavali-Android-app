package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcwb implements zzelo<zzcvv> {
    private final zzelx<zzdvw> zzfol;
    private final zzelx<zzdpf> zzfow;
    private final zzelx<zzboe> zzglj;
    private final zzelx<Context> zzgov;
    private final zzelx<zzabq> zzgow;

    public zzcwb(zzelx<Context> zzelx, zzelx<zzboe> zzelx2, zzelx<zzdpf> zzelx3, zzelx<zzdvw> zzelx4, zzelx<zzabq> zzelx5) {
        this.zzgov = zzelx;
        this.zzglj = zzelx2;
        this.zzfow = zzelx3;
        this.zzfol = zzelx4;
        this.zzgow = zzelx5;
    }

    public final /* synthetic */ Object get() {
        return new zzcvv(this.zzgov.get(), this.zzglj.get(), this.zzfow.get(), this.zzfol.get(), this.zzgow.get());
    }
}
