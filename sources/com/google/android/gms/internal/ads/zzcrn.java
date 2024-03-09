package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcrn implements zzcre<zzbni> {
    private final Executor zzfmk;
    private final zzdln zzfqn;
    private final zzcih zzfzy;
    private final zzboe zzglh;
    private final zzdsl<zzdkx, zzayy> zzgli;
    private final Context zzvr;

    public zzcrn(zzboe zzboe, Context context, Executor executor, zzcih zzcih, zzdln zzdln, zzdsl<zzdkx, zzayy> zzdsl) {
        this.zzvr = context;
        this.zzglh = zzboe;
        this.zzfmk = executor;
        this.zzfzy = zzcih;
        this.zzfqn = zzdln;
        this.zzgli = zzdsl;
    }

    public final boolean zza(zzdlj zzdlj, zzdkx zzdkx) {
        return (zzdkx.zzhao == null || zzdkx.zzhao.zzdou == null) ? false : true;
    }

    public final zzdvt<zzbni> zzb(zzdlj zzdlj, zzdkx zzdkx) {
        return zzdvl.zzb(zzdvl.zzaf(null), new zzcrq(this, zzdlj, zzdkx), this.zzfmk);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(zzbfq zzbfq) {
        zzbfq.zzaay();
        zzbgk zzzo = zzbfq.zzzo();
        if (this.zzfqn.zzhbt != null && zzzo != null) {
            zzzo.zzb(this.zzfqn.zzhbt);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zzb(zzdlj zzdlj, zzdkx zzdkx, Object obj) throws Exception {
        zzvj zzb = zzdls.zzb(this.zzvr, zzdkx.zzhaq);
        zzbfq zzc = this.zzfzy.zzc(zzb);
        zzc.zzba(zzdkx.zzdsu);
        zzboe zzboe = this.zzglh;
        zzbpt zzbpt = new zzbpt(zzdlj, zzdkx, (String) null);
        zzciy zzciy = new zzciy(this.zzvr, zzc.getView(), this.zzgli.apply(zzdkx));
        zzc.getClass();
        zzbnh zza = zzboe.zza(zzbpt, new zzbnl(zzciy, zzc, zzcrp.zzp(zzc), zzdls.zzf(zzb)));
        zza.zzafo().zzb(zzc, false);
        zza.zzaep().zza(new zzcrs(zzc), zzbbi.zzedz);
        zza.zzafo();
        zzdvt<?> zza2 = zzcij.zza(zzc, zzdkx.zzhao.zzdos, zzdkx.zzhao.zzdou);
        if (zzdkx.zzduo) {
            zzc.getClass();
            zza2.addListener(zzcrr.zzh(zzc), this.zzfmk);
        }
        zza2.addListener(new zzcru(this, zzc), this.zzfmk);
        return zzdvl.zzb(zza2, new zzcrt(zza), (Executor) zzbbi.zzedz);
    }
}
