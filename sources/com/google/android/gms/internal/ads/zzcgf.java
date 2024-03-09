package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcgf {
    private final Executor zzfmk;
    private final zzbyr zzfvy;
    private final zzbmj zzgca;

    zzcgf(Executor executor, zzbmj zzbmj, zzbyr zzbyr) {
        this.zzfmk = executor;
        this.zzfvy = zzbyr;
        this.zzgca = zzbmj;
    }

    public final void zzl(zzbfq zzbfq) {
        if (zzbfq != null) {
            this.zzfvy.zzv(zzbfq.getView());
            this.zzfvy.zza(new zzcgi(zzbfq), this.zzfmk);
            this.zzfvy.zza(new zzcgh(zzbfq), this.zzfmk);
            this.zzfvy.zza(this.zzgca, this.zzfmk);
            this.zzgca.zzg(zzbfq);
            zzbfq.zza("/trackActiveViewUnit", (zzahf<? super zzbfq>) new zzcgk(this));
            zzbfq.zza("/untrackActiveViewUnit", (zzahf<? super zzbfq>) new zzcgj(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzbfq zzbfq, Map map) {
        this.zzgca.disable();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(zzbfq zzbfq, Map map) {
        this.zzgca.enable();
    }
}
