package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcmy implements zzduv {
    static final zzduv zzbok = new zzcmy();

    private zzcmy() {
    }

    public final zzdvt zzf(Object obj) {
        return zzdvl.immediateFailedFuture(((ExecutionException) obj).getCause());
    }
}
