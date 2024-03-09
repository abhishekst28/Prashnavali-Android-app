package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbzq implements zzsq {
    private zzdsk zzfuq;

    public final void zza(Activity activity, WebView webView) {
        try {
            this.zzfuq = new zzdsk(activity, webView);
        } catch (RuntimeException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
            sb.append(" Failed to initialize the internal ArWebView: ");
            sb.append(valueOf);
            zzaxy.zzfc(sb.toString());
        }
    }

    public final void zzc(String str, String str2) {
        if (this.zzfuq == null) {
            zzaxy.zzfc("ArWebView is not initialized.");
        } else {
            zzdsk.getWebView().loadDataWithBaseURL(str, str2, "text/html", "UTF-8", (String) null);
        }
    }

    public final WebView getWebView() {
        if (this.zzfuq == null) {
            return null;
        }
        return zzdsk.getWebView();
    }

    public final View getView() {
        return this.zzfuq;
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (this.zzfuq != null) {
            zzdsk.onPageStarted(webView, str, bitmap);
        }
    }
}
