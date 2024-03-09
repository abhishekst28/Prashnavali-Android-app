package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbsg;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzctw extends zzcty<zzbpj> {
    private final zzbxj zzetx;
    private final zzcbj zzetz;
    private final zzbii zzgmy;
    private final zzbsg.zza zzgmz;

    public zzctw(zzbii zzbii, zzcbj zzcbj, zzbsg.zza zza, zzbxj zzbxj) {
        this.zzgmy = zzbii;
        this.zzetz = zzcbj;
        this.zzgmz = zza;
        this.zzetx = zzbxj;
    }

    /* access modifiers changed from: protected */
    public final zzdvt<zzbpj> zza(zzdln zzdln, Bundle bundle) {
        return this.zzgmy.zzadu().zza(this.zzgmz.zza(zzdln).zzf(bundle).zzajj()).zza(this.zzetx).zza(this.zzetz).zzaek().zzafc().zzaiv();
    }
}
