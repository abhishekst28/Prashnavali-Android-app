package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdvn<V> implements Runnable {
    private final Future<V> zzhpu;
    private final zzdvi<? super V> zzhpv;

    zzdvn(Future<V> future, zzdvi<? super V> zzdvi) {
        this.zzhpu = future;
        this.zzhpv = zzdvi;
    }

    public final void run() {
        Throwable zza;
        Future<V> future = this.zzhpu;
        if (!(future instanceof zzdwo) || (zza = zzdwn.zza((zzdwo) future)) == null) {
            try {
                this.zzhpv.onSuccess(zzdvl.zza(this.zzhpu));
            } catch (ExecutionException e) {
                this.zzhpv.zzb(e.getCause());
            } catch (Error | RuntimeException e2) {
                this.zzhpv.zzb(e2);
            }
        } else {
            this.zzhpv.zzb(zza);
        }
    }

    public final String toString() {
        return zzdso.zzx(this).zzy(this.zzhpv).toString();
    }
}
