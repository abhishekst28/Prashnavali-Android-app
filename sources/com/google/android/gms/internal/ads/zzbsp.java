package com.google.android.gms.internal.ads;

import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbsp extends zzye {
    private final String zzfso;
    private final String zzfsp;

    public zzbsp(zzdkx zzdkx, String str) {
        String str2 = null;
        this.zzfsp = zzdkx == null ? null : zzdkx.zzfsp;
        str2 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) ? zzc(zzdkx) : str2;
        this.zzfso = str2 != null ? str2 : str;
    }

    public final String getMediationAdapterClassName() {
        return this.zzfso;
    }

    public final String getResponseId() {
        return this.zzfsp;
    }

    private static String zzc(zzdkx zzdkx) {
        try {
            return zzdkx.zzhar.getString("class_name");
        } catch (JSONException e) {
            return null;
        }
    }
}
