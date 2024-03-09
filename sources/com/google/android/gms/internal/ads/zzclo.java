package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzclo implements zzelo<zzclm> {
    private final zzelx<Clock> zzfms;
    private final zzelx<zzclg> zzgfn;
    private final zzelx<Set<zzcll>> zzgfo;

    private zzclo(zzelx<zzclg> zzelx, zzelx<Set<zzcll>> zzelx2, zzelx<Clock> zzelx3) {
        this.zzgfn = zzelx;
        this.zzgfo = zzelx2;
        this.zzfms = zzelx3;
    }

    public static zzclo zzn(zzelx<zzclg> zzelx, zzelx<Set<zzcll>> zzelx2, zzelx<Clock> zzelx3) {
        return new zzclo(zzelx, zzelx2, zzelx3);
    }

    public final /* synthetic */ Object get() {
        return new zzclm(this.zzgfn.get(), this.zzgfo.get(), this.zzfms.get());
    }
}
