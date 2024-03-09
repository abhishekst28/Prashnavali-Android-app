package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbjw implements zzdko {
    private final /* synthetic */ zzbjc zzeud;
    private Context zzffg;
    private String zzffh;

    private zzbjw(zzbjc zzbjc) {
        this.zzeud = zzbjc;
    }

    public final zzdkp zzaga() {
        zzelu.zza(this.zzffg, Context.class);
        return new zzbjz(this.zzeud, this.zzffg, this.zzffh);
    }

    public final /* synthetic */ zzdko zzfw(String str) {
        this.zzffh = str;
        return this;
    }

    public final /* synthetic */ zzdko zzby(Context context) {
        this.zzffg = (Context) zzelu.checkNotNull(context);
        return this;
    }
}
