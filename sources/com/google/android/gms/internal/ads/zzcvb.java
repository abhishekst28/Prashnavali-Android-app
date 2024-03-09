package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.ads.internal.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzcvb implements zzcaz {
    private final zzbbg zzbop;
    private final zzdkx zzfpf;
    private final zzdln zzfqn;
    private final zzcih zzfzy;
    private final zzdvt<zzchw> zzgmk;
    private final zzbfq zzgnu;
    private final Context zzvr;

    private zzcvb(Context context, zzcih zzcih, zzdln zzdln, zzbbg zzbbg, zzdkx zzdkx, zzdvt<zzchw> zzdvt, zzbfq zzbfq) {
        this.zzvr = context;
        this.zzfzy = zzcih;
        this.zzfqn = zzdln;
        this.zzbop = zzbbg;
        this.zzfpf = zzdkx;
        this.zzgmk = zzdvt;
        this.zzgnu = zzbfq;
    }

    public final void zza(boolean z, Context context) {
        zzbfq zzbfq;
        zzchw zzchw = (zzchw) zzdvl.zzb(this.zzgmk);
        try {
            zzdkx zzdkx = this.zzfpf;
            if (!this.zzgnu.zzabt()) {
                zzbfq = this.zzgnu;
            } else {
                if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcnw)).booleanValue()) {
                    zzbfq = this.zzgnu;
                } else {
                    zzbfq zzc = this.zzfzy.zzc(this.zzfqn.zzbpb);
                    zzahq.zza(zzc, (zzahp) zzchw.zzagi());
                    zzcix zzcix = new zzcix();
                    zzcix.zzc(this.zzvr, zzc.getView());
                    zzchw.zzafo().zzb(zzc, true);
                    zzc.zzabe().zza((zzbhf) new zzcve(zzcix, zzc));
                    zzbhc zzabe = zzc.zzabe();
                    zzc.getClass();
                    zzabe.zza(zzcvd.zzq(zzc));
                    zzc.zzb(zzdkx.zzhao.zzdos, zzdkx.zzhao.zzdou, (String) null);
                    zzbfq = zzc;
                }
            }
            zzbfq.zzax(true);
            zzp.zzkp();
            zzi zzi = new zzi(false, zzayh.zzbc(this.zzvr), false, 0.0f, -1, z, this.zzfpf.zzfnp, this.zzfpf.zzboz);
            zzp.zzko();
            Context context2 = context;
            zzn.zza(context2, new AdOverlayInfoParcel((zzut) null, (zzo) zzchw.zzagd(), (zzt) null, zzbfq, this.zzfpf.zzhaw, this.zzbop, this.zzfpf.zzdrx, zzi, this.zzfpf.zzhao.zzdos, this.zzfpf.zzhao.zzdou), true);
        } catch (zzbgc e) {
            zzbbd.zzc("", e);
        }
    }
}
