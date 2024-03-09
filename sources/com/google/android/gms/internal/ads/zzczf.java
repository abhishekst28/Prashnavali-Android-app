package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzczf implements zzduv<zzasp, zzczg> {
    private Executor executor;
    private zzcnq zzgsa;

    public zzczf(Executor executor2, zzcnq zzcnq) {
        this.executor = executor2;
        this.zzgsa = zzcnq;
    }

    public final /* synthetic */ zzdvt zzf(Object obj) throws Exception {
        zzasp zzasp = (zzasp) obj;
        return zzdvl.zzb(this.zzgsa.zzg(zzasp), new zzcze(zzasp), this.executor);
    }
}
