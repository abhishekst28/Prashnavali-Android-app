package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzakt implements zzbbu<zzajx> {
    private final /* synthetic */ zzakk zzdgw;
    private final /* synthetic */ zzalb zzdha;

    zzakt(zzakk zzakk, zzalb zzalb) {
        this.zzdgw = zzakk;
        this.zzdha = zzalb;
    }

    public final /* synthetic */ void zzh(Object obj) {
        zzajx zzajx = (zzajx) obj;
        synchronized (this.zzdgw.lock) {
            int unused = this.zzdgw.status = 0;
            if (!(this.zzdgw.zzdgq == null || this.zzdha == this.zzdgw.zzdgq)) {
                zzaxy.zzei("New JS engine is loaded, marking previous one as destroyable.");
                this.zzdgw.zzdgq.zzti();
            }
            zzalb unused2 = this.zzdgw.zzdgq = this.zzdha;
        }
    }
}
