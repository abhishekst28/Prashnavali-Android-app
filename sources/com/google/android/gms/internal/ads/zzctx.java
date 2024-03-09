package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzbsg;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzctx extends zzcty<zzbni> {
    private final zzbxj zzetx;
    private final zzcbj zzetz;
    private final zzcwh zzfga;
    private final ViewGroup zzfnx;
    private final zzbvb zzfpp;
    private final zzbii zzgmy;
    private final zzbsg.zza zzgmz;

    public zzctx(zzbii zzbii, zzbsg.zza zza, zzcwh zzcwh, zzbxj zzbxj, zzcbj zzcbj, zzbvb zzbvb, ViewGroup viewGroup) {
        this.zzgmy = zzbii;
        this.zzgmz = zza;
        this.zzfga = zzcwh;
        this.zzetx = zzbxj;
        this.zzetz = zzcbj;
        this.zzfpp = zzbvb;
        this.zzfnx = viewGroup;
    }

    /* access modifiers changed from: protected */
    public final zzdvt<zzbni> zza(zzdln zzdln, Bundle bundle) {
        return this.zzgmy.zzadq().zzc(this.zzgmz.zza(zzdln).zzf(bundle).zzajj()).zzc(this.zzetx).zza(this.zzfga).zzb(this.zzetz).zza(new zzbpa(this.zzfpp)).zzb(new zzbnd(this.zzfnx)).zzafp().zzafc().zzaiv();
    }
}
