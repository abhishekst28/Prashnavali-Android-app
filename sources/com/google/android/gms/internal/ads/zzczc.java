package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzczc implements zzelo<zzdvt<zzczg>> {
    private final zzelx<zzdpf> zzfow;
    private final zzelx<zzczf> zzgry;
    private final zzelx<zzbrz> zzgrz;

    public zzczc(zzelx<zzdpf> zzelx, zzelx<zzczf> zzelx2, zzelx<zzbrz> zzelx3) {
        this.zzfow = zzelx;
        this.zzgry = zzelx2;
        this.zzgrz = zzelx3;
    }

    public final /* synthetic */ Object get() {
        return (zzdvt) zzelu.zza(this.zzfow.get().zza(zzdpg.GENERATE_SIGNALS, this.zzgrz.get().zzajd()).zza(this.zzgry.get()).zza((long) ((Integer) zzwe.zzpu().zzd(zzaat.zzcuo)).intValue(), TimeUnit.SECONDS).zzauz(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
