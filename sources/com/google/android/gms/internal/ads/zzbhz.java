package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.common.util.PlatformVersion;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbhz {
    private static Boolean zzeqa;

    private zzbhz() {
    }

    private static boolean zzb(WebView webView) {
        boolean booleanValue;
        synchronized (zzbhz.class) {
            if (zzeqa == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", (ValueCallback) null);
                    zzeqa = true;
                } catch (IllegalStateException e) {
                    zzeqa = false;
                }
            }
            booleanValue = zzeqa.booleanValue();
        }
        return booleanValue;
    }

    static void zza(WebView webView, String str) {
        if (!PlatformVersion.isAtLeastKitKat() || !zzb(webView)) {
            String valueOf = String.valueOf(str);
            webView.loadUrl(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
            return;
        }
        webView.evaluateJavascript(str, (ValueCallback) null);
    }
}
