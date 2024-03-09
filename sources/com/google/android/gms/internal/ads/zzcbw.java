package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzbsg;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcbw implements zzelo<zzbpi<zzbni>> {
    private final zzelx<zzbvb> zzfrw;
    private final zzelx<zzbii> zzfwi;
    private final zzelx<zzbsg.zza> zzfwj;
    private final zzelx<zzbxj> zzfwk;
    private final zzelx<zzcbj> zzfwl;

    public zzcbw(zzelx<zzbii> zzelx, zzelx<zzbsg.zza> zzelx2, zzelx<zzbxj> zzelx3, zzelx<zzcbj> zzelx4, zzelx<zzbvb> zzelx5) {
        this.zzfwi = zzelx;
        this.zzfwj = zzelx2;
        this.zzfwk = zzelx3;
        this.zzfwl = zzelx4;
        this.zzfrw = zzelx5;
    }

    public final /* synthetic */ Object get() {
        return (zzbpi) zzelu.zza(this.zzfwi.get().zzadq().zzc(this.zzfwj.get().zzajj()).zzc(this.zzfwk.get()).zzb(this.zzfwl.get()).zza(new zzcwh((zzabq) null)).zza(new zzbpa(this.zzfrw.get())).zzb(new zzbnd((ViewGroup) null)).zzafp().zzafw(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
