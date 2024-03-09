package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzcbh implements zzbpi<zzbpj> {
    private final zzcdg zzfod;
    private final Map<String, zzcre<zzbpj>> zzfpx;
    private final Map<String, zzcre<zzcco>> zzfvi;
    private final Map<String, zzctf<zzcco>> zzfvj;
    private final zzelx<zzbpi<zzbni>> zzfvk;

    zzcbh(Map<String, zzcre<zzbpj>> map, Map<String, zzcre<zzcco>> map2, Map<String, zzctf<zzcco>> map3, zzelx<zzbpi<zzbni>> zzelx, zzcdg zzcdg) {
        this.zzfpx = map;
        this.zzfvi = map2;
        this.zzfvj = map3;
        this.zzfvk = zzelx;
        this.zzfod = zzcdg;
    }

    public final zzcre<zzbpj> zze(int i, String str) {
        zzcre zze;
        zzcre<zzbpj> zzcre = this.zzfpx.get(str);
        if (zzcre != null) {
            return zzcre;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            zzctf zzctf = this.zzfvj.get(str);
            if (zzctf != null) {
                return zzbpj.zza((zzctf<? extends zzbpd>) zzctf);
            }
            zzcre zzcre2 = this.zzfvi.get(str);
            if (zzcre2 != null) {
                return zzbpj.zza((zzcre<? extends zzbpd>) zzcre2);
            }
            return null;
        } else if (this.zzfod.zzamf() == null || (zze = this.zzfvk.get().zze(i, str)) == null) {
            return null;
        } else {
            return zzbpj.zza((zzcre<? extends zzbpd>) zze);
        }
    }
}
