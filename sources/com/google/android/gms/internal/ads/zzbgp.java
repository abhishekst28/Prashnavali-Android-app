package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.gms.internal.ads.zzbgt;
import com.google.android.gms.internal.ads.zzbhb;
import com.google.android.gms.internal.ads.zzbhd;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbgp<WebViewT extends zzbgt & zzbhb & zzbhd> {
    private final zzbgq zzepj;
    private final WebViewT zzepk;

    public static zzbgp<zzbfq> zzc(zzbfq zzbfq) {
        return new zzbgp<>(zzbfq, new zzbgo(zzbfq));
    }

    private zzbgp(WebViewT webviewt, zzbgq zzbgq) {
        this.zzepj = zzbgq;
        this.zzepk = webviewt;
    }

    @JavascriptInterface
    public final void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            zzaxy.zzfe("URL is empty, ignoring message");
        } else {
            zzayh.zzeaj.post(new zzbgr(this, str));
        }
    }

    @JavascriptInterface
    public final String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            zzaxy.zzei("Click string is empty, not proceeding.");
            return "";
        }
        zzeg zzabh = ((zzbhb) this.zzepk).zzabh();
        if (zzabh == null) {
            zzaxy.zzei("Signal utils is empty, ignoring.");
            return "";
        }
        zzdw zzca = zzabh.zzca();
        if (zzca == null) {
            zzaxy.zzei("Signals object is empty, ignoring.");
            return "";
        } else if (this.zzepk.getContext() != null) {
            return zzca.zza(this.zzepk.getContext(), str, ((zzbhd) this.zzepk).getView(), this.zzepk.zzzq());
        } else {
            zzaxy.zzei("Context is null, ignoring.");
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzfu(String str) {
        this.zzepj.zzh(Uri.parse(str));
    }
}
