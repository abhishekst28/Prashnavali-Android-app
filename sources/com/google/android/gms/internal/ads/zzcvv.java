package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcvv implements zzcre<zzbni> {
    private final zzdpf zzfqo;
    private final zzboe zzglh;
    private final zzdvw zzgoi;
    private final Context zzgoo;
    private final zzabq zzgop;

    public zzcvv(Context context, zzboe zzboe, zzdpf zzdpf, zzdvw zzdvw, zzabq zzabq) {
        this.zzgoo = context;
        this.zzglh = zzboe;
        this.zzfqo = zzdpf;
        this.zzgoi = zzdvw;
        this.zzgop = zzabq;
    }

    public final boolean zza(zzdlj zzdlj, zzdkx zzdkx) {
        return (this.zzgop == null || zzdkx.zzhao == null || zzdkx.zzhao.zzdou == null) ? false : true;
    }

    public final zzdvt<zzbni> zzb(zzdlj zzdlj, zzdkx zzdkx) {
        zzbnh zza = this.zzglh.zza(new zzbpt(zzdlj, zzdkx, (String) null), (zzbnl) new zzcwa(this, new View(this.zzgoo), (zzbfq) null, zzcvy.zzgot, zzdkx.zzhaq.get(0)));
        return this.zzfqo.zzu(zzdpg.CUSTOM_RENDER_SYN).zza((zzdop) new zzcvx(this, new zzabj(zza.zzafu(), zzdkx.zzhao.zzdos, zzdkx.zzhao.zzdou)), this.zzgoi).zzw(zzdpg.CUSTOM_RENDER_ACK).zze(zzdvl.zzaf(zza.zzafs())).zzauz();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzabj zzabj) throws Exception {
        this.zzgop.zza(zzabj);
    }
}
