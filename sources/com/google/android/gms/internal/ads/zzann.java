package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzann implements MediationAdRequest {
    private final String zzadl;
    private final int zzcgw;
    private final boolean zzchh;
    private final int zzdkj;
    private final int zzdkk;
    private final Date zzmx;
    private final Set<String> zzmz;
    private final boolean zzna;
    private final Location zznb;

    public zzann(Date date, int i, Set<String> set, Location location, boolean z, int i2, boolean z2, int i3, String str) {
        this.zzmx = date;
        this.zzcgw = i;
        this.zzmz = set;
        this.zznb = location;
        this.zzna = z;
        this.zzdkj = i2;
        this.zzchh = z2;
        this.zzdkk = i3;
        this.zzadl = str;
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

    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzchh;
    }
}
