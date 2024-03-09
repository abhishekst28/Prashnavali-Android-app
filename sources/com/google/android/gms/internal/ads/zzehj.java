package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
abstract class zzehj {
    private static final zzehj zzihl = new zzehl();
    private static final zzehj zzihm = new zzeho();

    private zzehj() {
    }

    /* access modifiers changed from: package-private */
    public abstract <L> List<L> zza(Object obj, long j);

    /* access modifiers changed from: package-private */
    public abstract <L> void zza(Object obj, Object obj2, long j);

    /* access modifiers changed from: package-private */
    public abstract void zzb(Object obj, long j);

    static zzehj zzbgp() {
        return zzihl;
    }

    static zzehj zzbgq() {
        return zzihm;
    }
}
