package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzbmm implements Runnable {
    private final JSONObject zzfmf;
    private final zzbmj zzfng;

    zzbmm(zzbmj zzbmj, JSONObject jSONObject) {
        this.zzfng = zzbmj;
        this.zzfmf = jSONObject;
    }

    public final void run() {
        this.zzfng.zzi(this.zzfmf);
    }
}
