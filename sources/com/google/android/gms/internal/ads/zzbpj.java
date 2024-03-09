package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbpj {
    public final List<? extends zzdvt<? extends zzbpd>> zzfpy;

    public zzbpj(List<? extends zzdvt<? extends zzbpd>> list) {
        this.zzfpy = list;
    }

    public zzbpj(zzbpd zzbpd) {
        this.zzfpy = Collections.singletonList(zzdvl.zzaf(zzbpd));
    }

    public static zzcre<zzbpj> zza(zzctf<? extends zzbpd> zzctf) {
        return new zzcrd(zzctf, zzbpm.zzdwg);
    }

    public static zzcre<zzbpj> zza(zzcre<? extends zzbpd> zzcre) {
        return new zzcrd(zzcre, zzbpl.zzdwg);
    }
}
