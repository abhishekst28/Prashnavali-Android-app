package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.zzp;
import java.io.InputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcnq {
    private final ScheduledExecutorService zzflf;
    private final zzdvw zzgay;
    private final zzeli<zzcpj> zzghc;
    private final zzcol zzghn;

    public zzcnq(ScheduledExecutorService scheduledExecutorService, zzdvw zzdvw, zzcol zzcol, zzeli<zzcpj> zzeli) {
        this.zzflf = scheduledExecutorService;
        this.zzgay = zzdvw;
        this.zzghn = zzcol;
        this.zzghc = zzeli;
    }

    public final zzdvt<InputStream> zzg(zzasp zzasp) {
        zzdvt<InputStream> zzdvt;
        String str = zzasp.packageName;
        zzp.zzkp();
        if (zzayh.zzer(str)) {
            zzdvt = zzdvl.immediateFailedFuture(new zzcpa(zzdmd.zzhco));
        } else {
            zzdvt = this.zzghn.zzj(zzasp);
        }
        int callingUid = Binder.getCallingUid();
        return zzdvc.zzg(zzdvt).zza((long) ((Integer) zzwe.zzpu().zzd(zzaat.zzcuo)).intValue(), TimeUnit.SECONDS, this.zzflf).zza(Throwable.class, new zzcnp(this, zzasp, callingUid), (Executor) this.zzgay);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(zzasp zzasp, int i, Throwable th) throws Exception {
        return this.zzghc.get().zzd(zzasp, i);
    }
}
