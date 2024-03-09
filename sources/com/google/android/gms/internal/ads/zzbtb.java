package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbtb extends zzbxe<zzbsy> implements zzbsy {
    public zzbtb(zzbtf zzbtf, Set<zzbys<zzbsy>> set, Executor executor) {
        super(set);
        zza(zzbtf, executor);
    }

    public final void zzh(zzuw zzuw) {
        zza(new zzbta(zzuw));
    }

    public final void zza(zzcbc zzcbc) {
        zza(new zzbtd(zzcbc));
    }

    public final void zzajk() {
        zza(zzbtc.zzfst);
    }
}
