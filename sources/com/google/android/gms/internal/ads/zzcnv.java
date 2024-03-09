package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcnv implements zzduv {
    static final zzduv zzbok = new zzcnv();

    private zzcnv() {
    }

    public final zzdvt zzf(Object obj) {
        TimeoutException timeoutException = (TimeoutException) obj;
        return zzdvl.immediateFailedFuture(new zzcmt(zzdmd.zzhcs, "Timed out waiting for ad response."));
    }
}
