package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzddu implements zzden<zzddv> {
    private final zzawb zzbqm;
    private final zzdvw zzgay;
    private final Context zzvr;

    public zzddu(zzawb zzawb, zzdvw zzdvw, Context context) {
        this.zzbqm = zzawb;
        this.zzgay = zzdvw;
        this.zzvr = context;
    }

    public final zzdvt<zzddv> zzaqs() {
        return this.zzgay.zze(new zzddx(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzddv zzarf() throws Exception {
        String str;
        String str2;
        String str3;
        Long l;
        if (!this.zzbqm.zzac(this.zzvr)) {
            return new zzddv((String) null, (String) null, (String) null, (String) null, (Long) null);
        }
        String zzaf = this.zzbqm.zzaf(this.zzvr);
        String str4 = zzaf == null ? "" : zzaf;
        String zzag = this.zzbqm.zzag(this.zzvr);
        if (zzag == null) {
            str = "";
        } else {
            str = zzag;
        }
        String zzah = this.zzbqm.zzah(this.zzvr);
        if (zzah == null) {
            str2 = "";
        } else {
            str2 = zzah;
        }
        String zzai = this.zzbqm.zzai(this.zzvr);
        if (zzai == null) {
            str3 = "";
        } else {
            str3 = zzai;
        }
        if ("TIME_OUT".equals(str)) {
            l = (Long) zzwe.zzpu().zzd(zzaat.zzcng);
        } else {
            l = null;
        }
        return new zzddv(str4, str, str2, str3, l);
    }
}
