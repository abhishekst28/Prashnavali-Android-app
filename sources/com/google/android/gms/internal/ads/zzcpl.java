package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcpl implements Callable {
    private final zzdvt zzfqe;
    private final zzdvt zzfsi;
    private final zzdvt zzgbt;

    zzcpl(zzdvt zzdvt, zzdvt zzdvt2, zzdvt zzdvt3) {
        this.zzgbt = zzdvt;
        this.zzfsi = zzdvt2;
        this.zzfqe = zzdvt3;
    }

    public final Object call() {
        return new zzcpx((zzcqe) this.zzgbt.get(), (JSONObject) this.zzfsi.get(), (zzasv) this.zzfqe.get());
    }
}
