package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbcn implements Runnable {
    private final /* synthetic */ zzbcc zzefd;

    zzbcn(zzbcc zzbcc) {
        this.zzefd = zzbcc;
    }

    public final void run() {
        if (this.zzefd.zzefb != null) {
            this.zzefd.zzefb.onPaused();
        }
    }
}
