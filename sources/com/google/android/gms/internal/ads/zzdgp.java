package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdgp implements zzelo<zzdgn> {
    private final zzelx<Context> zzert;
    private final zzelx<zzaqt> zzesv;
    private final zzelx<ScheduledExecutorService> zzflu;

    public zzdgp(zzelx<zzaqt> zzelx, zzelx<ScheduledExecutorService> zzelx2, zzelx<Context> zzelx3) {
        this.zzesv = zzelx;
        this.zzflu = zzelx2;
        this.zzert = zzelx3;
    }

    public final /* synthetic */ Object get() {
        return new zzdgn(this.zzesv.get(), this.zzflu.get(), this.zzert.get());
    }
}
