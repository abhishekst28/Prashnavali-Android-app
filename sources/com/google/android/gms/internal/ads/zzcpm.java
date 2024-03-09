package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcpm implements Callable {
    private final zzdvt zzfsi;
    private final zzdvt zzgbt;

    zzcpm(zzdvt zzdvt, zzdvt zzdvt2) {
        this.zzgbt = zzdvt;
        this.zzfsi = zzdvt2;
    }

    public final Object call() {
        return new zzcqb((JSONObject) this.zzgbt.get(), (zzasv) this.zzfsi.get());
    }
}
