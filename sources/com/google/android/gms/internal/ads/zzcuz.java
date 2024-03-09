package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcuz implements zzdsl {
    private final zzdkx zzfoo;
    private final zzbfq zzgak;
    private final zzcuv zzgns;
    private final zzchw zzgnt;

    zzcuz(zzcuv zzcuv, zzbfq zzbfq, zzdkx zzdkx, zzchw zzchw) {
        this.zzgns = zzcuv;
        this.zzgak = zzbfq;
        this.zzfoo = zzdkx;
        this.zzgnt = zzchw;
    }

    public final Object apply(Object obj) {
        zzbfq zzbfq = this.zzgak;
        zzdkx zzdkx = this.zzfoo;
        zzchw zzchw = this.zzgnt;
        if (zzdkx.zzduo) {
            zzbfq.zzabr();
        }
        zzbfq.zzaay();
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcns)).booleanValue()) {
            zzp.zzkr();
            zzaym.zza(zzbfq);
        }
        return zzchw.zzagh();
    }
}
