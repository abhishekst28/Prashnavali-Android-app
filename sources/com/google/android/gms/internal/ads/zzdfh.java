package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdfh implements zzden<zzdfe> {
    private final Executor executor;
    private final PackageInfo zzdpx;
    private final zzaxg zzgvu;
    private final String zzgvx;

    public zzdfh(zzaxg zzaxg, Executor executor2, String str, PackageInfo packageInfo) {
        this.zzgvu = zzaxg;
        this.executor = executor2;
        this.zzgvx = str;
        this.zzdpx = packageInfo;
    }

    public final zzdvt<zzdfe> zzaqs() {
        return zzdvl.zzb(zzdvl.zzb(this.zzgvu.zza(this.zzgvx, this.zzdpx), zzdfg.zzdwg, this.executor), Throwable.class, new zzdfj(this), this.executor);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zzg(Throwable th) throws Exception {
        return zzdvl.zzaf(new zzdfe(this.zzgvx));
    }
}
