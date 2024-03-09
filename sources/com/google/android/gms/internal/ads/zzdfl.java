package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdfl implements zzden<zzdfi> {
    private final String packageName;
    private final zzdvw zzgay;
    private final zzass zzgwb;
    private final Context zzvr;

    public zzdfl(zzass zzass, Context context, String str, zzdvw zzdvw) {
        this.zzgwb = zzass;
        this.zzvr = context;
        this.packageName = str;
        this.zzgay = zzdvw;
    }

    public final zzdvt<zzdfi> zzaqs() {
        return this.zzgay.zze(new zzdfk(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdfi zzarl() throws Exception {
        JSONObject jSONObject = new JSONObject();
        zzass zzass = this.zzgwb;
        if (zzass != null) {
            zzass.zza(this.zzvr, this.packageName, jSONObject);
        }
        return new zzdfi(jSONObject);
    }
}
