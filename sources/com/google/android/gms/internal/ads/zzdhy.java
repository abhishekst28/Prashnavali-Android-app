package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbse;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdhy<R extends zzbse<AdT>, AdT extends zzbpd> implements zzdiz<R, zzdnh<AdT>> {
    private final Executor executor = zzdvv.zzaxm();
    private R zzgxy;

    public final zzdvt<zzdnh<AdT>> zza(zzdja zzdja, zzdjb<R> zzdjb) {
        zzdvt<zzdlj> zzdvt;
        zzbsd<R> zzc = zzdjb.zzc(zzdja.zzgzc);
        zzc.zza(new zzdjf(true));
        R r = (zzbse) zzc.zzael();
        this.zzgxy = r;
        zzbqb zzafc = r.zzafc();
        zzdnh zzdnh = new zzdnh();
        if (zzdja.zzgzb != null) {
            zzdvt = zzafc.zza(zzdja.zzgzb);
        } else {
            zzdvt = zzafc.zzaiu();
        }
        return zzdvc.zzg(zzdvt).zzb(new zzdib(this, zzdnh, zzafc), this.executor).zza(new zzdia(zzdnh), this.executor);
    }

    public final /* synthetic */ Object zzasb() {
        return this.zzgxy;
    }
}
