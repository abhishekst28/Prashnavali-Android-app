package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdbk implements zzelo<zzdbj<zzdeq>> {
    private final zzelx<zzdet> zzete;
    private final zzelx<Clock> zzfms;

    public zzdbk(zzelx<zzdet> zzelx, zzelx<Clock> zzelx2) {
        this.zzete = zzelx;
        this.zzfms = zzelx2;
    }

    public final /* synthetic */ Object get() {
        return (zzdbj) zzelu.zza(new zzdbj(this.zzete.get(), zzacg.zzczs.get().longValue(), this.zzfms.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
