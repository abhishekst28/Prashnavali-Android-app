package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzbzv implements zzbuj {
    private final Context zzcxz;
    private final zzbbg zzfon;
    private final zzdkx zzfoo;
    private final zzdln zzfop;

    zzbzv(Context context, zzbbg zzbbg, zzdkx zzdkx, zzdln zzdln) {
        this.zzcxz = context;
        this.zzfon = zzbbg;
        this.zzfoo = zzdkx;
        this.zzfop = zzdln;
    }

    public final void onAdLoaded() {
        zzp.zzkz().zzb(this.zzcxz, this.zzfon.zzbra, this.zzfoo.zzhat.toString(), this.zzfop.zzhbv);
    }
}
