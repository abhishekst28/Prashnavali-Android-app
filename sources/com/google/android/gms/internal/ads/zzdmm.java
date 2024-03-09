package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdmm {
    private final Context zzaai;
    private final zzbbg zzbop;
    private final zzaxk zzbps;
    private final Map<String, zzdmo> zzhde = new HashMap();

    public zzdmm(Context context, zzbbg zzbbg, zzaxk zzaxk) {
        this.zzaai = context;
        this.zzbop = zzbbg;
        this.zzbps = zzaxk;
    }

    public final zzdmo zzgv(String str) {
        if (str == null) {
            return zzatc();
        }
        if (this.zzhde.containsKey(str)) {
            return this.zzhde.get(str);
        }
        zzdmo zzgw = zzgw(str);
        this.zzhde.put(str, zzgw);
        return zzgw;
    }

    private final zzdmo zzatc() {
        return new zzdmo(this.zzaai, this.zzbps.zzwj(), this.zzbps.zzwl());
    }

    private final zzdmo zzgw(String str) {
        zzatg zzaa = zzatg.zzaa(this.zzaai);
        try {
            zzaa.setAppPackageName(str);
            zzayd zzayd = new zzayd();
            zzayd.zza(this.zzaai, str, false);
            zzaye zzaye = new zzaye(this.zzbps.zzwj(), zzayd);
            return new zzdmo(zzaa, zzaye, new zzaxv(zzbat.zzyo(), zzaye));
        } catch (PackageManager.NameNotFoundException e) {
            return zzatc();
        }
    }
}
