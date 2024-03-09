package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzawn implements Callable {
    private final Context zzcjx;
    private final zzawb zzdxh;

    zzawn(zzawb zzawb, Context context) {
        this.zzdxh = zzawb;
        this.zzcjx = context;
    }

    public final Object call() {
        return this.zzdxh.zzak(this.zzcjx);
    }
}
