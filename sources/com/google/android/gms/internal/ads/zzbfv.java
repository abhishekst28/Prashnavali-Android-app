package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzbfv implements Runnable {
    private final String zzdgb;

    zzbfv(String str) {
        this.zzdgb = str;
    }

    public final void run() {
        zzp.zzkt().zzwd().zzcv(this.zzdgb.substring(1));
    }
}
