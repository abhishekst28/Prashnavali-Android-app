package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbrx implements zzbtp, zzbuj {
    private final zzaqs zzboi;
    private final zzdkx zzfpf;
    private final Context zzvr;

    public zzbrx(Context context, zzdkx zzdkx, zzaqs zzaqs) {
        this.zzvr = context;
        this.zzfpf = zzdkx;
        this.zzboi = zzaqs;
    }

    public final void onAdLoaded() {
        if (this.zzfpf.zzhbb != null && this.zzfpf.zzhbb.zzdpd) {
            ArrayList arrayList = new ArrayList();
            if (!this.zzfpf.zzhbb.zzdpe.isEmpty()) {
                arrayList.add(this.zzfpf.zzhbb.zzdpe);
            }
            this.zzboi.zza(this.zzvr, arrayList);
        }
    }

    public final void zzbz(Context context) {
    }

    public final void zzca(Context context) {
    }

    public final void zzcb(Context context) {
        this.zzboi.detach();
    }
}
