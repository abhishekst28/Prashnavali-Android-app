package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public abstract class zzdvg<V> extends zzdvh<V> implements zzdvt<V> {
    protected zzdvg() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: zzaxk */
    public abstract zzdvt<? extends V> zzaxl();

    public void addListener(Runnable runnable, Executor executor) {
        zzaxl().addListener(runnable, executor);
    }
}
