package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcsu implements zzdsl {
    private final zzdkx zzfoo;
    private final zzbfq zzgak;
    private final zzcsq zzgme;
    private final zzbzt zzgmj;

    zzcsu(zzcsq zzcsq, zzbfq zzbfq, zzdkx zzdkx, zzbzt zzbzt) {
        this.zzgme = zzcsq;
        this.zzgak = zzbfq;
        this.zzfoo = zzdkx;
        this.zzgmj = zzbzt;
    }

    public final Object apply(Object obj) {
        zzbfq zzbfq = this.zzgak;
        zzdkx zzdkx = this.zzfoo;
        zzbzt zzbzt = this.zzgmj;
        if (zzdkx.zzduo) {
            zzbfq.zzabr();
        }
        zzbfq.zzaay();
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcns)).booleanValue()) {
            zzp.zzkr();
            zzaym.zza(zzbfq);
        }
        return zzbzt.zzagb();
    }
}
