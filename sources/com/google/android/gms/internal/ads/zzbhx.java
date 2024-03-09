package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.zzp;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class zzbhx extends zzbhs implements zzbhy {
    private boolean zzeoa;
    private boolean zzeot;
    private final zzbhv zzepz;

    public zzbhx(Context context, zzbhv zzbhv) {
        super(context);
        zzp.zzkt().zzwg();
        this.zzepz = zzbhv;
        super.setWebViewClient(zzbhv);
    }

    public final synchronized boolean isDestroyed() {
        return this.zzeoa;
    }

    /* access modifiers changed from: protected */
    public void zzbe(boolean z) {
    }

    public synchronized void destroy() {
        if (!this.zzeoa) {
            this.zzeoa = true;
            this.zzepz.zza((zzbhy) this);
            zzbe(false);
            zzaxy.zzei("Initiating WebView self destruct sequence in 3...");
            zzaxy.zzei("Loading blank page in WebView, 2...");
            try {
                super.loadUrl("about:blank");
            } catch (UnsatisfiedLinkError e) {
                zzp.zzkt().zza(e, "AdWebViewImpl.loadUrlUnsafe");
                zzaxy.zze("#007 Could not call remote method.", e);
            }
        }
    }

    public final synchronized void zza(zzbhu zzbhu) {
        zzaxy.zzei("Blank page loaded, 1...");
        zzabk();
    }

    /* access modifiers changed from: protected */
    public synchronized void zzabk() {
        zzaxy.zzei("Destroying WebView!");
        zzwh();
        zzbbi.zzedy.execute(new zzbhw(this));
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!isDestroyed()) {
                    zzbe(true);
                }
                zzwh();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    private final synchronized void zzwh() {
        if (!this.zzeot) {
            this.zzeot = true;
            zzp.zzkt().zzwh();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void evaluateJavascript(java.lang.String r2, android.webkit.ValueCallback<java.lang.String> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isDestroyed()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0014
            java.lang.String r2 = "#004 The webview is destroyed. Ignoring action."
            com.google.android.gms.internal.ads.zzaxy.zzfe(r2)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0012
            r2 = 0
            r3.onReceiveValue(r2)     // Catch:{ all -> 0x0019 }
        L_0x0012:
            monitor-exit(r1)
            return
        L_0x0014:
            super.evaluateJavascript(r2, r3)     // Catch:{ all -> 0x0019 }
            monitor-exit(r1)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbhx.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    public synchronized void loadUrl(String str) {
        if (!isDestroyed()) {
            super.loadUrl(str);
        } else {
            zzaxy.zzfe("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public synchronized void loadData(String str, String str2, String str3) {
        if (!isDestroyed()) {
            super.loadData(str, str2, str3);
        } else {
            zzaxy.zzfe("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!isDestroyed()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            zzaxy.zzfe("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !isDestroyed() && super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!isDestroyed()) {
            super.onDraw(canvas);
        }
    }

    public void onPause() {
        if (!isDestroyed()) {
            super.onPause();
        }
    }

    public void onResume() {
        if (!isDestroyed()) {
            super.onResume();
        }
    }

    public void stopLoading() {
        if (!isDestroyed()) {
            super.stopLoading();
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
    }

    public /* bridge */ /* synthetic */ void addJavascriptInterface(Object obj, String str) {
        super.addJavascriptInterface(obj, str);
    }

    public /* bridge */ /* synthetic */ void zzdc(String str) {
        super.zzdc(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzadb() {
        super.destroy();
    }
}
