package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzanv implements NativeMediationAdRequest {
    private final String zzadl;
    private final int zzcgw;
    private final boolean zzchh;
    private final int zzdkj;
    private final int zzdkk;
    private final zzadm zzdla;
    private final List<String> zzdlb = new ArrayList();
    private final Map<String, Boolean> zzdlc = new HashMap();
    private final Date zzmx;
    private final Set<String> zzmz;
    private final boolean zzna;
    private final Location zznb;

    public zzanv(Date date, int i, Set<String> set, Location location, boolean z, int i2, zzadm zzadm, List<String> list, boolean z2, int i3, String str) {
        this.zzmx = date;
        this.zzcgw = i;
        this.zzmz = set;
        this.zznb = location;
        this.zzna = z;
        this.zzdkj = i2;
        this.zzdla = zzadm;
        this.zzchh = z2;
        this.zzdkk = i3;
        this.zzadl = str;
        if (list != null) {
            for (String next : list) {
                if (next.startsWith("custom:")) {
                    String[] split = next.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.zzdlc.put(split[1], true);
                        } else if ("false".equals(split[2])) {
                            this.zzdlc.put(split[1], false);
                        }
                    }
                } else {
                    this.zzdlb.add(next);
                }
            }
        }
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zzmx;
    }

    @Deprecated
    public final int getGender() {
        return this.zzcgw;
    }

    public final Set<String> getKeywords() {
        return this.zzmz;
    }

    public final Location getLocation() {
        return this.zznb;
    }

    public final boolean isTesting() {
        return this.zzna;
    }

    public final int taggedForChildDirectedTreatment() {
        return this.zzdkj;
    }

    public final NativeAdOptions getNativeAdOptions() {
        if (this.zzdla == null) {
            return null;
        }
        NativeAdOptions.Builder requestMultipleImages = new NativeAdOptions.Builder().setReturnUrlsForImageAssets(this.zzdla.zzdcs).setImageOrientation(this.zzdla.zzbnj).setRequestMultipleImages(this.zzdla.zzbnl);
        if (this.zzdla.versionCode >= 2) {
            requestMultipleImages.setAdChoicesPlacement(this.zzdla.zzbnm);
        }
        if (this.zzdla.versionCode >= 3 && this.zzdla.zzdct != null) {
            requestMultipleImages.setVideoOptions(new VideoOptions(this.zzdla.zzdct));
        }
        return requestMultipleImages.build();
    }

    public final boolean isAdMuted() {
        return zzyv.zzqt().zzqe();
    }

    public final float getAdVolume() {
        return zzyv.zzqt().zzqd();
    }

    public final boolean isAppInstallAdRequested() {
        List<String> list = this.zzdlb;
        if (list != null) {
            return list.contains("2") || this.zzdlb.contains("6");
        }
        return false;
    }

    public final boolean isUnifiedNativeAdRequested() {
        List<String> list = this.zzdlb;
        return list != null && list.contains("6");
    }

    public final boolean isContentAdRequested() {
        List<String> list = this.zzdlb;
        if (list != null) {
            return list.contains("1") || this.zzdlb.contains("6");
        }
        return false;
    }

    public final boolean zzuf() {
        List<String> list = this.zzdlb;
        return list != null && list.contains("3");
    }

    public final Map<String, Boolean> zzug() {
        return this.zzdlc;
    }

    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzchh;
    }
}
