package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbcg implements Runnable {
    private final /* synthetic */ zzbcc zzefd;
    private final /* synthetic */ String zzeff;
    private final /* synthetic */ String zzefg;

    zzbcg(zzbcc zzbcc, String str, String str2) {
        this.zzefd = zzbcc;
        this.zzeff = str;
        this.zzefg = str2;
    }

    public final void run() {
        if (this.zzefd.zzefb != null) {
            this.zzefd.zzefb.zzm(this.zzeff, this.zzefg);
        }
    }
}
