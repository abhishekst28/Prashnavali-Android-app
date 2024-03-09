package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdbs implements zzden<zzdbx> {
    private final Context zzaai;
    private final zzdvw zzgay;

    zzdbs(Context context, zzdvw zzdvw) {
        this.zzaai = context;
        this.zzgay = zzdvw;
    }

    public final zzdvt<zzdbx> zzaqs() {
        return this.zzgay.zze(new zzdbv(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdbx zzaqy() throws Exception {
        zzp.zzkp();
        String zzba = zzayh.zzba(this.zzaai);
        String str = "";
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcvs)).booleanValue()) {
            str = this.zzaai.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", str);
        }
        zzp.zzkp();
        return new zzdbx(zzba, str, zzayh.zzbb(this.zzaai));
    }
}
