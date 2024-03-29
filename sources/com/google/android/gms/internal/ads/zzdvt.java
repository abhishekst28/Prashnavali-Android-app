package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public interface zzdvt<V> extends Future<V> {
    void addListener(Runnable runnable, Executor executor);
}
