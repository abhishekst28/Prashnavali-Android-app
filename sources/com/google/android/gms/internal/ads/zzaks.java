package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzaks implements zzahf<zzali> {
    private final /* synthetic */ zzajx zzdgv;
    private final /* synthetic */ zzakk zzdgw;
    private final /* synthetic */ zzeg zzdgy;
    private final /* synthetic */ zzbai zzdgz;

    zzaks(zzakk zzakk, zzeg zzeg, zzajx zzajx, zzbai zzbai) {
        this.zzdgw = zzakk;
        this.zzdgy = zzeg;
        this.zzdgv = zzajx;
        this.zzdgz = zzbai;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzali zzali = (zzali) obj;
        synchronized (this.zzdgw.lock) {
            zzaxy.zzfd("JS Engine is requesting an update");
            if (this.zzdgw.status == 0) {
                zzaxy.zzfd("Starting reload.");
                int unused = this.zzdgw.status = 2;
                this.zzdgw.zza(this.zzdgy);
            }
            this.zzdgv.zzb("/requestReload", (zzahf) this.zzdgz.get());
        }
    }
}
