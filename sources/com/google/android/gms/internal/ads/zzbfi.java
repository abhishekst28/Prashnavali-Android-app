package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.util.PlatformVersion;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbfi extends WebChromeClient {
    private final zzbfq zzdgc;

    public zzbfi(zzbfq zzbfq) {
        this.zzdgc = zzbfq;
    }

    private final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        zza zzabw;
        try {
            if (this.zzdgc == null || this.zzdgc.zzabe() == null || this.zzdgc.zzabe().zzabw() == null || (zzabw = this.zzdgc.zzabe().zzabw()) == null || zzabw.zzjx()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle(str2);
                if (z) {
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(context);
                    textView.setText(str3);
                    EditText editText = new EditText(context);
                    editText.setText(str4);
                    linearLayout.addView(textView);
                    linearLayout.addView(editText);
                    builder.setView(linearLayout).setPositiveButton(17039370, new zzbfo(jsPromptResult, editText)).setNegativeButton(17039360, new zzbfp(jsPromptResult)).setOnCancelListener(new zzbfm(jsPromptResult)).create().show();
                } else {
                    builder.setMessage(str3).setPositiveButton(17039370, new zzbfn(jsResult)).setNegativeButton(17039360, new zzbfk(jsResult)).setOnCancelListener(new zzbfl(jsResult)).create().show();
                }
                return true;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str3).length());
            sb.append("window.");
            sb.append(str);
            sb.append("('");
            sb.append(str3);
            sb.append("')");
            zzabw.zzbo(sb.toString());
            return false;
        } catch (WindowManager.BadTokenException e) {
            zzaxy.zzd("Fail to display Dialog.", e);
        }
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.zzdgc.zzabf() != null) {
            webView2.setWebViewClient(this.zzdgc.zzabf());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzbfq)) {
            zzaxy.zzfe("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        zzc zzaba = ((zzbfq) webView).zzaba();
        if (zzaba == null) {
            zzaxy.zzfe("Tried to close an AdWebView not associated with an overlay.");
        } else {
            zzaba.close();
        }
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 19 + String.valueOf(sourceId).length());
        sb.append("JS: ");
        sb.append(message);
        sb.append(" (");
        sb.append(sourceId);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        String sb2 = sb.toString();
        if (sb2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = zzbfr.zzelu[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            zzaxy.zzfc(sb2);
        } else if (i == 2) {
            zzaxy.zzfe(sb2);
        } else if (i == 3 || i == 4) {
            zzaxy.zzfd(sb2);
        } else if (i != 5) {
            zzaxy.zzfd(sb2);
        } else {
            zzaxy.zzef(sb2);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j != 0) {
            if (j2 == 0) {
                j = Math.min(j + Math.min(131072, j4), 1048576);
            } else if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        } else if (j2 > j4 || j2 > 1048576) {
            j2 = 0;
        }
        quotaUpdater.updateQuota(j2);
    }

    public final void onHideCustomView() {
        zzc zzaba = this.zzdgc.zzaba();
        if (zzaba == null) {
            zzaxy.zzfe("Could not get ad overlay when hiding custom view.");
        } else {
            zzaba.zzuo();
        }
    }

    private static Context zza(WebView webView) {
        if (!(webView instanceof zzbfq)) {
            return webView.getContext();
        }
        zzbfq zzbfq = (zzbfq) webView;
        Activity zzzq = zzbfq.zzzq();
        return zzzq != null ? zzzq : zzbfq.getContext();
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zza(webView), "alert", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zza(webView), "onBeforeUnload", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zza(webView), "confirm", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zza(webView), "prompt", str, str2, str3, (JsResult) null, jsPromptResult, true);
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        long j3 = j + 131072;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }

    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        zzc zzaba = this.zzdgc.zzaba();
        if (zzaba == null) {
            zzaxy.zzfe("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        zzaba.zza(view, customViewCallback);
        zzaba.setRequestedOrientation(i);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            zzp.zzkp();
            if (!zzayh.zzr(this.zzdgc.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                zzp.zzkp();
                if (!zzayh.zzr(this.zzdgc.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (!PlatformVersion.isAtLeastLollipop() || zzacz.zzdby.get().booleanValue()) {
            super.onPermissionRequest(permissionRequest);
            return;
        }
        zzbfq zzbfq = this.zzdgc;
        if (zzbfq == null || zzbfq.zzabe() == null || this.zzdgc.zzabe().zzacj() == null) {
            super.onPermissionRequest(permissionRequest);
            return;
        }
        String[] zza = this.zzdgc.zzabe().zzacj().zza(permissionRequest.getResources());
        if (zza.length > 0) {
            permissionRequest.grant(zza);
        } else {
            permissionRequest.deny();
        }
    }
}
