package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcji {
    private final zzcjd zzgdx;
    private final AtomicReference<zzamu> zzgdy = new AtomicReference<>();

    zzcji(zzcjd zzcjd) {
        this.zzgdx = zzcjd;
    }

    public final void zzb(zzamu zzamu) {
        this.zzgdy.compareAndSet((Object) null, zzamu);
    }

    public final zzdlx zzd(String str, JSONObject jSONObject) throws zzdlr {
        zzamv zzamv;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzamv = new zzanq((MediationAdapter) new AdMobAdapter());
            } else if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                zzamv = new zzanq((MediationAdapter) new AdUrlAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzamv = new zzanq((MediationAdapter) new zzapq());
            } else {
                zzamv = zze(str, jSONObject);
            }
            zzdlx zzdlx = new zzdlx(zzamv);
            this.zzgdx.zza(str, zzdlx);
            return zzdlx;
        } catch (Throwable th) {
            throw new zzdlr(th);
        }
    }

    public final zzapa zzdm(String str) throws RemoteException {
        zzapa zzdm = zzant().zzdm(str);
        this.zzgdx.zza(str, zzdm);
        return zzdm;
    }

    public final boolean zzans() {
        return this.zzgdy.get() != null;
    }

    private final zzamv zze(String str, JSONObject jSONObject) throws RemoteException {
        zzamu zzant = zzant();
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                if (zzant.zzdj(jSONObject.getString("class_name"))) {
                    return zzant.zzdi("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                }
                return zzant.zzdi("com.google.ads.mediation.customevent.CustomEventAdapter");
            } catch (JSONException e) {
                zzaxy.zzc("Invalid custom event.", e);
            }
        }
        return zzant.zzdi(str);
    }

    private final zzamu zzant() throws RemoteException {
        zzamu zzamu = this.zzgdy.get();
        if (zzamu != null) {
            return zzamu;
        }
        zzaxy.zzfe("Unexpected call to adapter creator.");
        throw new RemoteException();
    }
}
