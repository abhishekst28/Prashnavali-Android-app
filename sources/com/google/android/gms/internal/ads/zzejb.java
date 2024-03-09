package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzejb extends zzejh {
    private final /* synthetic */ zzeja zzijy;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private zzejb(zzeja zzeja) {
        super(zzeja, (zzeiz) null);
        this.zzijy = zzeja;
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return new zzejc(this.zzijy, (zzeiz) null);
    }

    /* synthetic */ zzejb(zzeja zzeja, zzeiz zzeiz) {
        this(zzeja);
    }
}
