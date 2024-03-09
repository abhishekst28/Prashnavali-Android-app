package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcne implements Callable {
    private final Context zzcjx;
    private final zzeg zzghi;

    zzcne(zzeg zzeg, Context context) {
        this.zzghi = zzeg;
        this.zzcjx = context;
    }

    public final Object call() {
        zzeg zzeg = this.zzghi;
        return zzeg.zzca().zzb(this.zzcjx);
    }
}
