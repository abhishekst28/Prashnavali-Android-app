package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcxa extends zzape {
    private final String zzdfe;
    private final zzapa zzgpn;
    private zzbbq<JSONObject> zzgpo;
    private final JSONObject zzgpp;
    private boolean zzgpq = false;

    public zzcxa(String str, zzapa zzapa, zzbbq<JSONObject> zzbbq) {
        JSONObject jSONObject = new JSONObject();
        this.zzgpp = jSONObject;
        this.zzgpo = zzbbq;
        this.zzdfe = str;
        this.zzgpn = zzapa;
        try {
            jSONObject.put("adapter_version", zzapa.zztw().toString());
            this.zzgpp.put("sdk_version", this.zzgpn.zztx().toString());
            this.zzgpp.put(AppMeasurementSdk.ConditionalUserProperty.NAME, this.zzdfe);
        } catch (RemoteException | NullPointerException | JSONException e) {
        }
    }

    public final synchronized void zzds(String str) throws RemoteException {
        if (!this.zzgpq) {
            if (str == null) {
                onFailure("Adapter returned null signals");
                return;
            }
            try {
                this.zzgpp.put("signals", str);
            } catch (JSONException e) {
            }
            this.zzgpo.set(this.zzgpp);
            this.zzgpq = true;
        }
    }

    public final synchronized void onFailure(String str) throws RemoteException {
        if (!this.zzgpq) {
            try {
                this.zzgpp.put("signal_error", str);
            } catch (JSONException e) {
            }
            this.zzgpo.set(this.zzgpp);
            this.zzgpq = true;
        }
    }
}
