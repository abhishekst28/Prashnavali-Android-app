package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.zzp;
import java.io.InputStream;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class zzays extends zzayt {
    public final CookieManager zzbg(Context context) {
        if (zzxu()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzaxy.zzc("Failed to obtain CookieManager.", th);
            zzp.zzkt().zza(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public final zzbft zza(zzbfq zzbfq, zzto zzto, boolean z) {
        return new zzbgx(zzbfq, zzto, z);
    }

    public final int zzxv() {
        return 16974374;
    }

    public final WebResourceResponse zza(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }
}
