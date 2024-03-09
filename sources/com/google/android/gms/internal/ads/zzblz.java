package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzblz implements Runnable {
    private final zzbfq zzepi;
    private final JSONObject zzfmf;

    zzblz(zzbfq zzbfq, JSONObject jSONObject) {
        this.zzepi = zzbfq;
        this.zzfmf = jSONObject;
    }

    public final void run() {
        this.zzepi.zza("AFMA_updateActiveView", this.zzfmf);
    }
}
