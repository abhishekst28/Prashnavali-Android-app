package com.google.android.gms.internal.ads;

import android.webkit.JavascriptInterface;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzajq {
    private final zzajt zzdfv;

    private zzajq(zzajt zzajt) {
        this.zzdfv = zzajt;
    }

    @JavascriptInterface
    public final void notify(String str) {
        this.zzdfv.zzdg(str);
    }
}
