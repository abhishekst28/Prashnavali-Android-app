package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzckp implements zzelo<Set<zzbys<zzdpl>>> {
    private final zzelx<Executor> zzerr;
    private final zzelx<Context> zzert;
    private final zzelx<String> zzgeo;
    private final zzelx<Map<zzdpg, zzcku>> zzgep;

    public zzckp(zzelx<String> zzelx, zzelx<Context> zzelx2, zzelx<Executor> zzelx3, zzelx<Map<zzdpg, zzcku>> zzelx4) {
        this.zzgeo = zzelx;
        this.zzert = zzelx2;
        this.zzerr = zzelx3;
        this.zzgep = zzelx4;
    }

    public final /* synthetic */ Object get() {
        Set set;
        String str = this.zzgeo.get();
        Context context = this.zzert.get();
        Executor executor = this.zzerr.get();
        Map map = this.zzgep.get();
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzctk)).booleanValue()) {
            zzto zzto = new zzto(new zztt(context));
            zzto.zza((zztn) new zzckr(str));
            set = Collections.singleton(new zzbys(new zzcks(zzto, map), executor));
        } else {
            set = Collections.emptySet();
        }
        return (Set) zzelu.zza(set, "Cannot return null from a non-@Nullable @Provides method");
    }
}
