package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcsh implements zzcre<zzbni> {
    private final ScheduledExecutorService zzflf;
    /* access modifiers changed from: private */
    public final zzbsx zzfue;
    private final zzdvw zzgay;
    private final zzboe zzglv;
    private final zzcrn zzglw;

    public zzcsh(zzboe zzboe, zzcrn zzcrn, zzbsx zzbsx, ScheduledExecutorService scheduledExecutorService, zzdvw zzdvw) {
        this.zzglv = zzboe;
        this.zzglw = zzcrn;
        this.zzfue = zzbsx;
        this.zzflf = scheduledExecutorService;
        this.zzgay = zzdvw;
    }

    public final boolean zza(zzdlj zzdlj, zzdkx zzdkx) {
        return zzdlj.zzhbp.zzfqn.zzasp() != null && this.zzglw.zza(zzdlj, zzdkx);
    }

    public final zzdvt<zzbni> zzb(zzdlj zzdlj, zzdkx zzdkx) {
        return this.zzgay.zze(new zzcsk(this, zzdlj, zzdkx));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzbni zzc(zzdlj zzdlj, zzdkx zzdkx) throws Exception {
        return this.zzglv.zza(new zzbpt(zzdlj, zzdkx, (String) null), new zzbos(zzdlj.zzhbp.zzfqn.zzasp(), new zzcsj(this, zzdlj, zzdkx))).zzafy();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzdlj zzdlj, zzdkx zzdkx) {
        zzdvl.zza(zzdvl.zza(this.zzglw.zzb(zzdlj, zzdkx), (long) zzdkx.zzhax, TimeUnit.SECONDS, this.zzflf), new zzcsm(this), this.zzgay);
    }
}
