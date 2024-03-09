package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzvn extends zzxf {
    private final AppEventListener zzbnw;

    public zzvn(AppEventListener appEventListener) {
        this.zzbnw = appEventListener;
    }

    public final void onAppEvent(String str, String str2) {
        this.zzbnw.onAppEvent(str, str2);
    }

    public final AppEventListener getAppEventListener() {
        return this.zzbnw;
    }
}
