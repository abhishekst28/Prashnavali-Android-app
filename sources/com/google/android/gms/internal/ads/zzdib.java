package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzdib implements zzduv {
    private final zzdhy zzgyb;
    private final zzdnh zzgyc;
    private final zzbqb zzgyd;

    zzdib(zzdhy zzdhy, zzdnh zzdnh, zzbqb zzbqb) {
        this.zzgyb = zzdhy;
        this.zzgyc = zzdnh;
        this.zzgyd = zzbqb;
    }

    public final zzdvt zzf(Object obj) {
        zzdnh zzdnh = this.zzgyc;
        zzbqb zzbqb = this.zzgyd;
        zzdlj zzdlj = (zzdlj) obj;
        zzdnh.zzeua = zzdlj;
        Iterator<zzdkx> it = zzdlj.zzhbq.zzhbm.iterator();
        boolean z = false;
        boolean z2 = false;
        loop0:
        while (true) {
            if (!it.hasNext()) {
                z = z2;
                break;
            }
            Iterator<String> it2 = it.next().zzhaf.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!it2.next().contains("FirstPartyRenderer")) {
                        break loop0;
                    }
                    z2 = true;
                }
            }
        }
        if (!z) {
            return zzdvl.zzaf(null);
        }
        return zzbqb.zzb((zzdvt<zzdlj>) zzdvl.zzaf(zzdlj));
    }
}
