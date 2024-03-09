package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbse;
import com.google.android.gms.internal.ads.zztw;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdid<R extends zzbse<AdT>, AdT extends zzbpd> implements zzdiz<R, AdT> {
    private final Executor executor;
    private final zzdiz<R, AdT> zzgwx;
    private final zzdiz<R, zzdim<AdT>> zzgyi;
    private final zzdnp<AdT> zzgyj;
    private R zzgyk;

    public zzdid(zzdiz<R, AdT> zzdiz, zzdiz<R, zzdim<AdT>> zzdiz2, zzdnp<AdT> zzdnp, Executor executor2) {
        this.zzgwx = zzdiz;
        this.zzgyi = zzdiz2;
        this.zzgyj = zzdnp;
        this.executor = executor2;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzasc */
    public final synchronized R zzasb() {
        return this.zzgyk;
    }

    public final synchronized zzdvt<AdT> zza(zzdja zzdja, zzdjb<R> zzdjb) {
        zzdln zzafj;
        zzdjb<R> zzdjb2;
        zzdja zzdja2;
        zzafj = ((zzbse) zzdjb.zzc(zzdja.zzgzc).zzael()).zzafj();
        zzdjb2 = zzdjb;
        zzdja2 = zzdja;
        return zzdvc.zzg(this.zzgyi.zza(zzdja, zzdjb)).zzb(new zzdic(this, zzdja, new zzdig(zzdjb2, zzdja2, zzafj.zzhbu, zzafj.zzhbv, this.executor, zzafj.zzhby, (zzdnk) null), zzdjb), this.executor);
    }

    private final zzdvt<AdT> zza(zzdnh<AdT> zzdnh, zzdja zzdja, zzdjb<R> zzdjb) {
        zzbsd<R> zzc = zzdjb.zzc(zzdja.zzgzc);
        if (zzdnh.zzhfi != null) {
            zzbse zzbse = (zzbse) zzc.zzael();
            if (zzbse.zzafk() != null) {
                zzdnh.zzhfi.zzain().zzb(zzbse.zzafk());
            }
            return zzdvl.zzaf(zzdnh.zzhfi);
        }
        zzc.zza(zzdnh.zzeua);
        zzdvt<AdT> zza = this.zzgwx.zza(zzdja, new zzdif(zzc));
        this.zzgyk = (zzbse) this.zzgwx.zzasb();
        return zza;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(zzdjb zzdjb, zzdnt zzdnt) throws Exception {
        if (zzdnt == null || zzdnt.zzgyw == null || zzdnt.zzhfx == null) {
            throw new zzcmt(zzdmd.zzhco, "Empty prefetch");
        }
        zzdnt.zzgyw.zzhfh.zzaiw().zze((zztw.zzb) ((zzegp) zztw.zzb.zzng().zza(zztw.zzb.zza.zzne().zzb(zztw.zzb.zzc.IN_MEMORY).zza(zztw.zzb.zzd.zzni())).zzbfx()));
        return zza(zzdnt.zzgyw, ((zzdig) zzdnt.zzhfx).zzgyo, zzdjb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(zzdja zzdja, zzdig zzdig, zzdjb zzdjb, zzdim zzdim) throws Exception {
        if (zzdim != null) {
            zzdig zzdig2 = new zzdig(zzdig.zzgyn, zzdig.zzgyo, zzdig.zzdpw, zzdig.zzbuo, zzdig.executor, zzdig.zzgsx, zzdim.zzgyp);
            if (zzdim.zzgyw != null) {
                this.zzgyk = null;
                this.zzgyj.zzb((zzdnv) zzdig2);
                return zza(zzdim.zzgyw, zzdja, zzdjb);
            }
            zzdvt<zzdnt<AdT>> zzc = this.zzgyj.zzc((zzdnv) zzdig2);
            if (zzc != null) {
                this.zzgyk = (zzbse) zzdjb.zzc(zzdja.zzgzc).zzael();
                return zzdvl.zzb(zzc, new zzdie(this, zzdjb), this.executor);
            }
            this.zzgyj.zzb((zzdnv) zzdig2);
            zzdja = new zzdja(zzdja.zzgzc, zzdim.zzgid);
        }
        zzdvt<AdT> zza = this.zzgwx.zza(zzdja, zzdjb);
        this.zzgyk = (zzbse) this.zzgwx.zzasb();
        return zza;
    }
}
