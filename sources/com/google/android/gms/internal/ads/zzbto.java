package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbto extends zzbxe<zzbtp> {
    public zzbto(Set<zzbys<zzbtp>> set) {
        super(set);
    }

    public final void zzbz(Context context) {
        zza(new zzbtr(context));
    }

    public final void zzca(Context context) {
        zza(new zzbtq(context));
    }

    public final void zzcb(Context context) {
        zza(new zzbtt(context));
    }

    public final void zza(zzbzi zzbzi, Executor executor) {
        zza(zzbys.zzb(new zzbts(this, zzbzi), executor));
    }
}
