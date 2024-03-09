package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzbwv implements zzbxg {
    private final String zzdft;
    private final String zzdgb;

    zzbwv(String str, String str2) {
        this.zzdgb = str;
        this.zzdft = str2;
    }

    public final void zzp(Object obj) {
        ((AppEventListener) obj).onAppEvent(this.zzdgb, this.zzdft);
    }
}
