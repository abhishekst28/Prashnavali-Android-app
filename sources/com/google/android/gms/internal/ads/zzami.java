package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzami implements zzahn {
    private final zzbbq<O> zzdih;
    private final /* synthetic */ zzamg zzdik;

    public zzami(zzamg zzamg, zzbbq<O> zzbbq) {
        this.zzdik = zzamg;
        this.zzdih = zzbbq;
    }

    public final void zzc(JSONObject jSONObject) {
        try {
            this.zzdih.set(this.zzdik.zzdhy.zzd(jSONObject));
        } catch (IllegalStateException e) {
        } catch (JSONException e2) {
            this.zzdih.setException(e2);
        }
    }

    public final void onFailure(String str) {
        if (str == null) {
            try {
                this.zzdih.setException(new zzalj());
            } catch (IllegalStateException e) {
            }
        } else {
            this.zzdih.setException(new zzalj(str));
        }
    }
}
