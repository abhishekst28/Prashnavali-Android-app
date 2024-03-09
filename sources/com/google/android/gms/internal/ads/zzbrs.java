package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzbrs implements zzdsl {
    private final Context zzcxz;
    private final zzbbg zzfon;
    private final zzdln zzfrl;

    zzbrs(Context context, zzbbg zzbbg, zzdln zzdln) {
        this.zzcxz = context;
        this.zzfon = zzbbg;
        this.zzfrl = zzdln;
    }

    public final Object apply(Object obj) {
        Context context = this.zzcxz;
        zzbbg zzbbg = this.zzfon;
        zzdln zzdln = this.zzfrl;
        zzdkx zzdkx = (zzdkx) obj;
        zzayy zzayy = new zzayy(context);
        zzayy.zzet(zzdkx.zzdrx);
        zzayy.zzeu(zzdkx.zzhat.toString());
        zzayy.zzae(zzbbg.zzbra);
        zzayy.setAdUnitId(zzdln.zzhbv);
        return zzayy;
    }
}
