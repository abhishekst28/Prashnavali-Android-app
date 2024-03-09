package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbhu {
    private final String method;
    public final Uri uri;
    public final String url;
    public final Map<String, String> zzam;

    public zzbhu(WebResourceRequest webResourceRequest) {
        this(webResourceRequest.getUrl().toString(), webResourceRequest.getUrl(), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders());
    }

    public zzbhu(String str) {
        this(str, Uri.parse(str), (String) null, (Map<String, String>) null);
    }

    private zzbhu(String str, Uri uri2, String str2, Map<String, String> map) {
        this.url = str;
        this.uri = uri2;
        this.method = str2 == null ? "GET" : str2;
        this.zzam = map == null ? Collections.emptyMap() : map;
    }
}
