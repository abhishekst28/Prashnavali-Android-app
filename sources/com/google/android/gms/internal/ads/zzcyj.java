package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcyj implements Callable {
    private final zzcyk zzgri;
    private final List zzgrj;
    private final IObjectWrapper zzgrk;

    zzcyj(zzcyk zzcyk, List list, IObjectWrapper iObjectWrapper) {
        this.zzgri = zzcyk;
        this.zzgrj = list;
        this.zzgrk = iObjectWrapper;
    }

    public final Object call() {
        return this.zzgri.zza(this.zzgrj, this.zzgrk);
    }
}
