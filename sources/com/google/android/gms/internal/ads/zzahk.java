package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzahk implements zzahf<zzbfq> {
    private static final Map<String, Integer> zzdeu = CollectionUtils.mapOfKeyValueArrays(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final zza zzder;
    private final zzapw zzdes;
    private final zzaqf zzdet;

    public zzahk(zza zza, zzapw zzapw, zzaqf zzaqf) {
        this.zzder = zza;
        this.zzdes = zzapw;
        this.zzdet = zzaqf;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zza zza;
        zzbfq zzbfq = (zzbfq) obj;
        int intValue = zzdeu.get((String) map.get("a")).intValue();
        if (intValue != 5 && intValue != 7 && (zza = this.zzder) != null && !zza.zzjx()) {
            this.zzder.zzbo((String) null);
        } else if (intValue == 1) {
            this.zzdes.zzg(map);
        } else if (intValue == 3) {
            new zzapx(zzbfq, map).execute();
        } else if (intValue == 4) {
            new zzapr(zzbfq, map).execute();
        } else if (intValue == 5) {
            new zzapy(zzbfq, map).execute();
        } else if (intValue == 6) {
            this.zzdes.zzac(true);
        } else if (intValue != 7) {
            zzaxy.zzfd("Unknown MRAID command called.");
        } else {
            this.zzdet.zzun();
        }
    }
}
