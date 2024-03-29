package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzp;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzahg implements zzahf<zzbfq> {
    zzahg() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzbfq zzbfq = (zzbfq) obj;
        zzp.zzkp();
        DisplayMetrics zza = zzayh.zza((WindowManager) zzbfq.getContext().getSystemService("window"));
        int i = zza.widthPixels;
        int i2 = zza.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) zzbfq).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        zzbfq.zza("locationReady", hashMap);
        zzaxy.zzfe("GET LOCATION COMPILED");
    }
}
