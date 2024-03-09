package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzblw implements zzahf<Object> {
    final /* synthetic */ zzblr zzfmb;

    zzblw(zzblr zzblr) {
        this.zzfmb = zzblr;
    }

    public final void zza(Object obj, Map<String, String> map) {
        if (this.zzfmb.zzm(map)) {
            this.zzfmb.executor.execute(new zzblv(this));
        }
    }
}
