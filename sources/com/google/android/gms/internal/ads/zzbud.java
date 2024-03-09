package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbud implements zzelo<zzbtu> {
    private final zzelx<Set<zzbys<zzbsu>>> zzfor;

    private zzbud(zzelx<Set<zzbys<zzbsu>>> zzelx) {
        this.zzfor = zzelx;
    }

    public static zzbud zzk(zzelx<Set<zzbys<zzbsu>>> zzelx) {
        return new zzbud(zzelx);
    }

    public final /* synthetic */ Object get() {
        return new zzbtu(this.zzfor.get());
    }
}
