package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.zzp;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class zzbgu extends zzbft {
    public zzbgu(zzbfq zzbfq, zzto zzto, boolean z) {
        super(zzbfq, zzto, z);
    }

    /* access modifiers changed from: protected */
    public final WebResourceResponse zza(WebView webView, String str, Map<String, String> map) {
        String str2;
        if (!(webView instanceof zzbfq)) {
            zzaxy.zzfe("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzbfq zzbfq = (zzbfq) webView;
        if (this.zzemh != null) {
            this.zzemh.zza(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzd(str, map);
        }
        if (zzbfq.zzabe() != null) {
            zzbfq.zzabe().zzur();
        }
        if (zzbfq.zzabc().zzacx()) {
            str2 = (String) zzwe.zzpu().zzd(zzaat.zzcmp);
        } else if (zzbfq.zzabj()) {
            str2 = (String) zzwe.zzpu().zzd(zzaat.zzcmo);
        } else {
            str2 = (String) zzwe.zzpu().zzd(zzaat.zzcmn);
        }
        zzp.zzkp();
        return zzayh.zzd(zzbfq.getContext(), zzbfq.zzzt().zzbra, str2);
    }
}
