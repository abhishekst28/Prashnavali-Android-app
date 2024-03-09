package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzczr implements zzden<Object> {
    private final Executor executor;
    private final zzdvt<String> zzgsj;

    public zzczr(zzdvt<String> zzdvt, Executor executor2) {
        this.zzgsj = zzdvt;
        this.executor = executor2;
    }

    public final zzdvt<Object> zzaqs() {
        return zzdvl.zzb(this.zzgsj, zzczq.zzbok, this.executor);
    }
}
