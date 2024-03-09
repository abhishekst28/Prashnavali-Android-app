package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.PublisherAdView;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzagh implements Runnable {
    private final /* synthetic */ PublisherAdView zzddp;
    private final /* synthetic */ zzwu zzddq;
    private final /* synthetic */ zzagi zzddr;

    zzagh(zzagi zzagi, PublisherAdView publisherAdView, zzwu zzwu) {
        this.zzddr = zzagi;
        this.zzddp = publisherAdView;
        this.zzddq = zzwu;
    }

    public final void run() {
        if (this.zzddp.zza(this.zzddq)) {
            this.zzddr.zzdds.onPublisherAdViewLoaded(this.zzddp);
        } else {
            zzbbd.zzfe("Could not bind.");
        }
    }
}
