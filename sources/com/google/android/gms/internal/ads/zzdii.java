package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbse;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdii<R extends zzbse<AdT>, AdT extends zzbpd> implements zzdiz<R, zzdim<AdT>> {
    private final Executor executor;
    private final zzdna zzgyr;
    private zzdvi<Void> zzgys = new zzdin(this);

    public zzdii(zzdna zzdna, Executor executor2) {
        this.zzgyr = zzdna;
        this.executor = executor2;
    }

    public final zzdvt<zzdim<AdT>> zza(zzdja zzdja, zzdjb<R> zzdjb) {
        return zzdvc.zzg(new zzdit(this.zzgyr, zzdja.zzgzc, zzdjb, this.executor).zzasg()).zzb(new zzdil(this, zzdja, zzdjb), this.executor).zza(Exception.class, new zzdik(this), this.executor);
    }

    public final /* bridge */ /* synthetic */ Object zzasb() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(zzdja zzdja, zzdjb zzdjb, zzdix zzdix) throws Exception {
        zzdnh<?> zzdnh;
        zzdnk zzdnk = zzdix.zzgyp;
        zzasp zzasp = zzdix.zzgid;
        if (zzdnk != null) {
            zzdnh = this.zzgyr.zza(zzdnk);
        } else {
            zzdnh = null;
        }
        if (zzdnk == null) {
            return zzdvl.zzaf(null);
        }
        if (!(zzdnh == null || zzasp == null)) {
            zzdvl.zza(((zzbse) zzdjb.zzc(zzdja.zzgzc).zzael()).zzafc().zzc(zzasp), this.zzgys, this.executor);
        }
        return zzdvl.zzaf(new zzdim(zzdnk, zzasp, zzdnh));
    }
}
