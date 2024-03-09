package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbfb implements Runnable {
    private final /* synthetic */ String val$message;
    private final /* synthetic */ String zzeca;
    private final /* synthetic */ String zzeks;
    private final /* synthetic */ zzbev zzekw;
    private final /* synthetic */ String zzelc;

    zzbfb(zzbev zzbev, String str, String str2, String str3, String str4) {
        this.zzekw = zzbev;
        this.zzeca = str;
        this.zzeks = str2;
        this.zzelc = str3;
        this.val$message = str4;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheCanceled");
        hashMap.put("src", this.zzeca);
        if (!TextUtils.isEmpty(this.zzeks)) {
            hashMap.put("cachedSrc", this.zzeks);
        }
        hashMap.put("type", zzbev.zzfp(this.zzelc));
        hashMap.put("reason", this.zzelc);
        if (!TextUtils.isEmpty(this.val$message)) {
            hashMap.put("message", this.val$message);
        }
        this.zzekw.zza("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
