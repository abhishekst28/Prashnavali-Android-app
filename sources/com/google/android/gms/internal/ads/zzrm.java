package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzrm implements Runnable {
    final /* synthetic */ zzrk zzbta;
    private ValueCallback<String> zzbto = new zzrl(this);
    final /* synthetic */ zzre zzbtp;
    final /* synthetic */ WebView zzbtq;
    final /* synthetic */ boolean zzbtr;

    zzrm(zzrk zzrk, zzre zzre, WebView webView, boolean z) {
        this.zzbta = zzrk;
        this.zzbtp = zzre;
        this.zzbtq = webView;
        this.zzbtr = z;
    }

    public final void run() {
        if (this.zzbtq.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzbtq.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zzbto);
            } catch (Throwable th) {
                this.zzbto.onReceiveValue("");
            }
        }
    }
}
