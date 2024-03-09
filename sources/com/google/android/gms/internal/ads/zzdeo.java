package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzdeo implements Callable {
    private final Object zzdij;
    private final List zzgup;

    zzdeo(List list, Object obj) {
        this.zzgup = list;
        this.zzdij = obj;
    }

    public final Object call() {
        List<zzdvt> list = this.zzgup;
        Object obj = this.zzdij;
        for (zzdvt zzdvt : list) {
            zzdek zzdek = (zzdek) zzdvt.get();
            if (zzdek != null) {
                zzdek.zzs(obj);
            }
        }
        return obj;
    }
}
