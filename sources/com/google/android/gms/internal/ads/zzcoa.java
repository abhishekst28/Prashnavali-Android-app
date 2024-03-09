package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcoa implements zzcox {
    /* access modifiers changed from: private */
    public static final Pattern zzghr = Pattern.compile("Received error HTTP response code: (.*)");
    private final ScheduledExecutorService zzflf;
    private final zzdln zzfqn;
    private final zzdvw zzgay;
    private final zzcmw zzghp;
    /* access modifiers changed from: private */
    public final zzcqq zzghq;

    zzcoa(zzdln zzdln, zzcmw zzcmw, zzdvw zzdvw, ScheduledExecutorService scheduledExecutorService, zzcqq zzcqq) {
        this.zzfqn = zzdln;
        this.zzghp = zzcmw;
        this.zzgay = zzdvw;
        this.zzflf = scheduledExecutorService;
        this.zzghq = zzcqq;
    }

    public final zzdvt<zzdlj> zzh(zzasp zzasp) {
        zzdvt<zzdlj> zzb = zzdvl.zzb(this.zzghp.zze(zzasp), new zzcnz(this), (Executor) this.zzgay);
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcun)).booleanValue()) {
            zzb = zzdvl.zzb(zzdvl.zza(zzb, (long) ((Integer) zzwe.zzpu().zzd(zzaat.zzcuo)).intValue(), TimeUnit.SECONDS, this.zzflf), TimeoutException.class, zzcoc.zzbok, zzbbi.zzedz);
        }
        zzdvl.zza(zzb, new zzcob(this), zzbbi.zzedz);
        return zzb;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zze(InputStream inputStream) throws Exception {
        return zzdvl.zzaf(new zzdlj(new zzdle(this.zzfqn), zzdlh.zza(new InputStreamReader(inputStream))));
    }
}
