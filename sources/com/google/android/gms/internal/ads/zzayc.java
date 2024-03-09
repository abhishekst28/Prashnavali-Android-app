package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzayc implements Runnable {
    private final Context zzcjx;
    private final String zzdin;
    private final zzayd zzdzl;

    zzayc(zzayd zzayd, Context context, String str) {
        this.zzdzl = zzayd;
        this.zzcjx = context;
        this.zzdin = str;
    }

    public final void run() {
        this.zzdzl.zzq(this.zzcjx, this.zzdin);
    }
}
