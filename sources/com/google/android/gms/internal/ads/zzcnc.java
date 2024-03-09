package com.google.android.gms.internal.ads;

import android.webkit.CookieManager;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcnc implements Callable {
    private final CookieManager zzghh;

    zzcnc(CookieManager cookieManager) {
        this.zzghh = cookieManager;
    }

    public final Object call() {
        CookieManager cookieManager = this.zzghh;
        if (cookieManager == null) {
            return "";
        }
        return cookieManager.getCookie((String) zzwe.zzpu().zzd(zzaat.zzcny));
    }
}
