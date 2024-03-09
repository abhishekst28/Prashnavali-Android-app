package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzakw implements zzbbs {
    private final /* synthetic */ zzakk zzdgw;
    private final /* synthetic */ zzalb zzdha;

    zzakw(zzakk zzakk, zzalb zzalb) {
        this.zzdgw = zzakk;
        this.zzdha = zzalb;
    }

    public final void run() {
        synchronized (this.zzdgw.lock) {
            int unused = this.zzdgw.status = 1;
            zzaxy.zzei("Failed loading new engine. Marking new engine destroyable.");
            this.zzdha.zzti();
        }
    }
}
