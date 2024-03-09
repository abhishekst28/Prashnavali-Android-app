package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzctl implements Callable {
    private final zzdvt zzfqe;
    private final zzdvt zzfsi;
    private final zzdlj zzgmh;
    private final zzcti zzgmo;
    private final zzdkx zzgmt;
    private final JSONObject zzgmu;

    zzctl(zzcti zzcti, zzdvt zzdvt, zzdvt zzdvt2, zzdlj zzdlj, zzdkx zzdkx, JSONObject jSONObject) {
        this.zzgmo = zzcti;
        this.zzfsi = zzdvt;
        this.zzfqe = zzdvt2;
        this.zzgmh = zzdlj;
        this.zzgmt = zzdkx;
        this.zzgmu = jSONObject;
    }

    public final Object call() {
        return this.zzgmo.zza(this.zzfsi, this.zzfqe, this.zzgmh, this.zzgmt, this.zzgmu);
    }
}
