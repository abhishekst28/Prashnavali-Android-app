package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final /* synthetic */ class zzaml implements Runnable {
    private final Context zzcjx;
    private final zzamm zzdim;
    private final String zzdin;

    zzaml(zzamm zzamm, Context context, String str) {
        this.zzdim = zzamm;
        this.zzcjx = context;
        this.zzdin = str;
    }

    public final void run() {
        zzamm.zze(this.zzcjx, this.zzdin);
    }
}
