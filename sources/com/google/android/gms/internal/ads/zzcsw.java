package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.ads.internal.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzcsw implements zzcaz {
    private final zzbbg zzbop;
    private final zzdkx zzfyh;
    private final zzdvt<zzbzt> zzgmk;
    private final zzbfq zzgml;
    private final Context zzvr;

    private zzcsw(Context context, zzbbg zzbbg, zzdvt<zzbzt> zzdvt, zzdkx zzdkx, zzbfq zzbfq) {
        this.zzvr = context;
        this.zzbop = zzbbg;
        this.zzgmk = zzdvt;
        this.zzfyh = zzdkx;
        this.zzgml = zzbfq;
    }

    public final void zza(boolean z, Context context) {
        this.zzgml.zzax(true);
        zzp.zzkp();
        zzi zzi = new zzi(false, zzayh.zzbc(this.zzvr), false, 0.0f, -1, z, this.zzfyh.zzfnp, false);
        zzp.zzko();
        Context context2 = context;
        zzn.zza(context2, new AdOverlayInfoParcel((zzut) null, (zzo) ((zzbzt) zzdvl.zzb(this.zzgmk)).zzagd(), (zzt) null, this.zzgml, this.zzfyh.zzhaw, this.zzbop, this.zzfyh.zzdrx, zzi, this.zzfyh.zzhao.zzdos, this.zzfyh.zzhao.zzdou), true);
    }
}
