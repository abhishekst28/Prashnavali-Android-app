package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzama implements zzahn {
    private final /* synthetic */ zzalv zzdid;
    private final zzakx zzdig;
    private final zzbbq<O> zzdih;

    public zzama(zzalv zzalv, zzakx zzakx, zzbbq<O> zzbbq) {
        this.zzdid = zzalv;
        this.zzdig = zzakx;
        this.zzdih = zzbbq;
    }

    public final void zzc(JSONObject jSONObject) {
        try {
            this.zzdih.set(this.zzdid.zzdhy.zzd(jSONObject));
        } catch (IllegalStateException e) {
        } catch (JSONException e2) {
            this.zzdih.setException(e2);
        } finally {
            this.zzdig.release();
        }
    }

    public final void onFailure(String str) {
        if (str == null) {
            try {
                this.zzdih.setException(new zzalj());
            } catch (IllegalStateException e) {
                this.zzdig.release();
                return;
            } catch (Throwable th) {
                this.zzdig.release();
                throw th;
            }
        } else {
            this.zzdih.setException(new zzalj(str));
        }
        this.zzdig.release();
    }
}
