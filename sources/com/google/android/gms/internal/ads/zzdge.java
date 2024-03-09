package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdge implements zzden<zzdgf> {
    List<String> zzdqh;
    private zzdvw zzgay;
    zzaaf zzgwn;

    public zzdge(zzaaf zzaaf, zzdvw zzdvw, List<String> list) {
        this.zzgwn = zzaaf;
        this.zzgay = zzdvw;
        this.zzdqh = list;
    }

    public final zzdvt<zzdgf> zzaqs() {
        return this.zzgay.zze(new zzdgh(this));
    }
}
