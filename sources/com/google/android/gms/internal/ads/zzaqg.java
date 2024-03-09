package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class zzaqg {
    private final zzbfq zzdgc;
    private final String zzdnk;

    public zzaqg(zzbfq zzbfq) {
        this(zzbfq, "");
    }

    public zzaqg(zzbfq zzbfq, String str) {
        this.zzdgc = zzbfq;
        this.zzdnk = str;
    }

    public final void zzdx(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.zzdnk);
            if (this.zzdgc != null) {
                this.zzdgc.zzb("onError", put);
            }
        } catch (JSONException e) {
            zzaxy.zzc("Error occurred while dispatching error event.", e);
        }
    }

    public final void zzdy(String str) {
        try {
            this.zzdgc.zzb("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            zzaxy.zzc("Error occurred while dispatching ready Event.", e);
        }
    }

    public final void zzb(int i, int i2, int i3, int i4) {
        try {
            this.zzdgc.zzb("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            zzaxy.zzc("Error occurred while dispatching size change.", e);
        }
    }

    public final void zzc(int i, int i2, int i3, int i4) {
        try {
            this.zzdgc.zzb("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            zzaxy.zzc("Error occurred while dispatching default position.", e);
        }
    }

    public final void zzdz(String str) {
        try {
            this.zzdgc.zzb("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            zzaxy.zzc("Error occurred while dispatching state change.", e);
        }
    }

    public final void zza(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.zzdgc.zzb("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", (double) f).put("rotation", i5));
        } catch (JSONException e) {
            zzaxy.zzc("Error occurred while obtaining screen information.", e);
        }
    }
}
