package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzbgb implements zzduv {
    private final Context zzcxz;
    private final zzeg zzdgl;
    private final zzbbg zzene;
    private final zzb zzenf;
    private final String zzeng;

    zzbgb(Context context, zzeg zzeg, zzbbg zzbbg, zzb zzb, String str) {
        this.zzcxz = context;
        this.zzdgl = zzeg;
        this.zzene = zzbbg;
        this.zzenf = zzb;
        this.zzeng = str;
    }

    public final zzdvt zzf(Object obj) {
        Context context = this.zzcxz;
        zzeg zzeg = this.zzdgl;
        zzbbg zzbbg = this.zzene;
        zzb zzb = this.zzenf;
        String str = this.zzeng;
        zzp.zzkq();
        zzbfq zza = zzbfy.zza(context, zzbhj.zzacu(), "", false, false, zzeg, (zzabt) null, zzbbg, (zzabk) null, (zzk) null, zzb, zzto.zzmy(), (zzsq) null, false);
        zzbbr zzl = zzbbr.zzl(zza);
        zza.zzabe().zza((zzbhf) new zzbgd(zzl));
        zza.loadUrl(str);
        return zzl;
    }
}
