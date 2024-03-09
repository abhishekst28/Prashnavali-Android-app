package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbex implements Runnable {
    private final /* synthetic */ String zzeca;
    private final /* synthetic */ String zzeks;
    private final /* synthetic */ boolean zzekv;
    private final /* synthetic */ zzbev zzekw;
    private final /* synthetic */ long zzeky;
    private final /* synthetic */ long zzekz;
    private final /* synthetic */ int zzela;
    private final /* synthetic */ int zzelb;

    zzbex(zzbev zzbev, String str, String str2, long j, long j2, boolean z, int i, int i2) {
        this.zzekw = zzbev;
        this.zzeca = str;
        this.zzeks = str2;
        this.zzeky = j;
        this.zzekz = j2;
        this.zzekv = z;
        this.zzela = i;
        this.zzelb = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        hashMap.put("src", this.zzeca);
        hashMap.put("cachedSrc", this.zzeks);
        hashMap.put("bufferedDuration", Long.toString(this.zzeky));
        hashMap.put("totalDuration", Long.toString(this.zzekz));
        hashMap.put("cacheReady", this.zzekv ? "1" : "0");
        hashMap.put("playerCount", Integer.toString(this.zzela));
        hashMap.put("playerPreparedCount", Integer.toString(this.zzelb));
        this.zzekw.zza("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
