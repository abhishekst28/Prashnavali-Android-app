package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.zzp;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcmw {
    private final zzdvw zzgay;
    private final zzdvw zzgha;
    private final zzcoh zzghb;
    private final zzeli<zzcpj> zzghc;

    public zzcmw(zzdvw zzdvw, zzdvw zzdvw2, zzcoh zzcoh, zzeli<zzcpj> zzeli) {
        this.zzgha = zzdvw;
        this.zzgay = zzdvw2;
        this.zzghb = zzcoh;
        this.zzghc = zzeli;
    }

    public final zzdvt<InputStream> zze(zzasp zzasp) {
        zzdvt<V> zzdvt;
        String str = zzasp.packageName;
        zzp.zzkp();
        if (zzayh.zzer(str)) {
            zzdvt = zzdvl.immediateFailedFuture(new zzcpa(zzdmd.zzhco));
        } else {
            zzdvt = zzdvl.zzb(this.zzgha.zze(new zzcmv(this, zzasp)), ExecutionException.class, zzcmy.zzbok, this.zzgay);
        }
        return zzdvl.zzb(zzdvt, zzcpa.class, new zzcmx(this, zzasp, Binder.getCallingUid()), this.zzgay);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(zzasp zzasp, int i, zzcpa zzcpa) throws Exception {
        return this.zzghc.get().zzb(zzasp, i);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ InputStream zzf(zzasp zzasp) throws Exception {
        return (InputStream) this.zzghb.zzi(zzasp).get((long) ((Integer) zzwe.zzpu().zzd(zzaat.zzcuo)).intValue(), TimeUnit.SECONDS);
    }
}
