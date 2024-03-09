package com.google.android.gms.internal.ads;

import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcdt implements Runnable {
    private final zzcdr zzfzk;
    private final ViewGroup zzfzl;

    zzcdt(zzcdr zzcdr, ViewGroup viewGroup) {
        this.zzfzk = zzcdr;
        this.zzfzl = viewGroup;
    }

    public final void run() {
        this.zzfzk.zzb(this.zzfzl);
    }
}
