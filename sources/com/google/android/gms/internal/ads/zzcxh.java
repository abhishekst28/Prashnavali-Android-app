package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcxh implements zzbuy {
    private final AtomicReference<zzya> zzgqi = new AtomicReference<>();

    public final void zzb(zzya zzya) {
        this.zzgqi.set(zzya);
    }

    public final void zzb(zzvl zzvl) {
        zzdip.zza(this.zzgqi, new zzcxk(zzvl));
    }
}
