package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzddv implements zzdek<Bundle> {
    private final String zzdwv;
    private final String zzguq;
    private final String zzgur;
    private final String zzgus;
    private final Long zzgut;

    public zzddv(String str, String str2, String str3, String str4, Long l) {
        this.zzdwv = str;
        this.zzguq = str2;
        this.zzgur = str3;
        this.zzgus = str4;
        this.zzgut = l;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzdlu.zza(bundle, "gmp_app_id", this.zzdwv);
        zzdlu.zza(bundle, "fbs_aiid", this.zzguq);
        zzdlu.zza(bundle, "fbs_aeid", this.zzgur);
        zzdlu.zza(bundle, "apm_id_origin", this.zzgus);
        Long l = this.zzgut;
        if (l != null) {
            bundle.putLong("sai_timeout", l.longValue());
        }
    }
}
