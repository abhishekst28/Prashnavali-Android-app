package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzeg;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzo implements Callable<zzeg> {
    private final /* synthetic */ zzj zzbpi;

    zzo(zzj zzj) {
        this.zzbpi = zzj;
    }

    public final /* synthetic */ Object call() throws Exception {
        return new zzeg(zzed.zzb(this.zzbpi.zzbpa.zzbra, this.zzbpi.zzvr, false));
    }
}
