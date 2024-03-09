package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcea implements zzelo<zzcdy> {
    private final zzelx<zzchc> zzewz;
    private final zzelx<Clock> zzfms;

    public zzcea(zzelx<zzchc> zzelx, zzelx<Clock> zzelx2) {
        this.zzewz = zzelx;
        this.zzfms = zzelx2;
    }

    public final /* synthetic */ Object get() {
        return new zzcdy(this.zzewz.get(), this.zzfms.get());
    }
}
