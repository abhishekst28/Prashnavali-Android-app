package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
final class zzdtv extends zzdtg<Map.Entry<K, V>> {
    private final /* synthetic */ zzdts zzhnt;

    zzdtv(zzdts zzdts) {
        this.zzhnt = zzdts;
    }

    public final int size() {
        return this.zzhnt.size;
    }

    public final boolean zzaws() {
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        zzdsv.zzs(i, this.zzhnt.size);
        int i2 = i * 2;
        return new AbstractMap.SimpleImmutableEntry(this.zzhnt.zzhnp[i2], this.zzhnt.zzhnp[i2 + 1]);
    }
}
