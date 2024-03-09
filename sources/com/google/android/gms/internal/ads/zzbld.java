package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbld implements zzduv<zzdlj, zzdlj> {
    private Map<String, zzblg> zzflc;

    public zzbld(Map<String, zzblg> map) {
        this.zzflc = map;
    }

    public final /* synthetic */ zzdvt zzf(Object obj) throws Exception {
        zzdlj zzdlj = (zzdlj) obj;
        for (zzdlg next : zzdlj.zzhbq.zzhbo) {
            if (this.zzflc.containsKey(next.name)) {
                this.zzflc.get(next.name).zzl(next.zzhbl);
            }
        }
        return zzdvl.zzaf(zzdlj);
    }
}
