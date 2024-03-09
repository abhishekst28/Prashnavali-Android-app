package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.zzp;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcoz {
    private final zzdvw zzgay;
    private final zzeli<zzcpj> zzghc;
    private final zzcoq zzgit;

    public zzcoz(zzdvw zzdvw, zzcoq zzcoq, zzeli<zzcpj> zzeli) {
        this.zzgay = zzdvw;
        this.zzgit = zzcoq;
        this.zzghc = zzeli;
    }

    private final <RetT> zzdvt<RetT> zza(zzasp zzasp, zzcpk<InputStream> zzcpk, zzcpk<InputStream> zzcpk2, zzduv<InputStream, RetT> zzduv) {
        zzdvt<V> zzdvt;
        String str = zzasp.packageName;
        zzp.zzkp();
        if (zzayh.zzer(str)) {
            zzdvt = zzdvl.immediateFailedFuture(new zzcpa(zzdmd.zzhco));
        } else {
            zzdvt = zzdvl.zzb(zzcpk.zzq(zzasp), ExecutionException.class, zzcpc.zzbok, this.zzgay);
        }
        return zzdvc.zzg(zzdvt).zzb(zzduv, this.zzgay).zza(zzcpa.class, new zzcpb(this, zzcpk2, zzasp, zzduv), (Executor) this.zzgay);
    }

    public final zzdvt<zzasp> zzl(zzasp zzasp) {
        zzcpe zzcpe = new zzcpe(zzasp);
        zzcoq zzcoq = this.zzgit;
        zzcoq.getClass();
        return zza(zzasp, (zzcpk<InputStream>) zzcpd.zza(zzcoq), (zzcpk<InputStream>) new zzcpg(this), zzcpe);
    }

    public final zzdvt<Void> zzm(zzasp zzasp) {
        if (zzfg.zzas(zzasp.zzdth)) {
            return zzdvl.immediateFailedFuture(new zzcmt(zzdmd.zzhcp, "Pool key missing from removeUrl call."));
        }
        return zza(zzasp, (zzcpk<InputStream>) new zzcpi(this), (zzcpk<InputStream>) new zzcph(this), zzcpf.zzbok);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zzn(zzasp zzasp) {
        return this.zzghc.get().zzgn(zzasp.zzdth);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zzo(zzasp zzasp) {
        return this.zzgit.zzgm(zzasp.zzdth);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zzp(zzasp zzasp) {
        return this.zzghc.get().zzc(zzasp, Binder.getCallingUid());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(zzcpk zzcpk, zzasp zzasp, zzduv zzduv, zzcpa zzcpa) throws Exception {
        return zzdvl.zzb(zzcpk.zzq(zzasp), zzduv, (Executor) this.zzgay);
    }
}
