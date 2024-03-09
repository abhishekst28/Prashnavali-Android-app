package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbci implements Runnable {
    private final /* synthetic */ zzbcc zzefd;
    private final /* synthetic */ int zzefh;
    private final /* synthetic */ int zzefi;

    zzbci(zzbcc zzbcc, int i, int i2) {
        this.zzefd = zzbcc;
        this.zzefh = i;
        this.zzefi = i2;
    }

    public final void run() {
        if (this.zzefd.zzefb != null) {
            this.zzefd.zzefb.zzk(this.zzefh, this.zzefi);
        }
    }
}
