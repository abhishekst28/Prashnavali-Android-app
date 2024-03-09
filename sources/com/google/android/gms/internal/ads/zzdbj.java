package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzdek;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdbj<S extends zzdek<?>> implements zzden<S> {
    private final Clock zzbpw;
    private final AtomicReference<zzdbi<S>> zzgto = new AtomicReference<>();
    private final zzden<S> zzgtp;
    private final long zzgtq;

    public zzdbj(zzden<S> zzden, long j, Clock clock) {
        this.zzbpw = clock;
        this.zzgtp = zzden;
        this.zzgtq = j;
    }

    public final zzdvt<S> zzaqs() {
        zzdbi zzdbi = this.zzgto.get();
        if (zzdbi == null || zzdbi.hasExpired()) {
            zzdbi = new zzdbi(this.zzgtp.zzaqs(), this.zzgtq, this.zzbpw);
            this.zzgto.set(zzdbi);
        }
        return zzdbi.zzgtm;
    }
}
