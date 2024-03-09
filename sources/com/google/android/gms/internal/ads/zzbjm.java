package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbjm implements zzdhq {
    private final /* synthetic */ zzbjc zzeud;
    private Context zzffg;
    private String zzffh;

    private zzbjm(zzbjc zzbjc) {
        this.zzeud = zzbjc;
    }

    public final zzdhr zzafm() {
        zzelu.zza(this.zzffg, Context.class);
        zzelu.zza(this.zzffh, String.class);
        return new zzbjp(this.zzeud, this.zzffg, this.zzffh);
    }

    public final /* synthetic */ zzdhq zzfv(String str) {
        this.zzffh = (String) zzelu.checkNotNull(str);
        return this;
    }

    public final /* synthetic */ zzdhq zzbx(Context context) {
        this.zzffg = (Context) zzelu.checkNotNull(context);
        return this;
    }
}
