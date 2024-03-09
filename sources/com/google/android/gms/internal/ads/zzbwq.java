package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbwq implements zzelo<zzbwp> {
    private final zzelx<Set<zzbys<zzbwt>>> zzfor;

    private zzbwq(zzelx<Set<zzbys<zzbwt>>> zzelx) {
        this.zzfor = zzelx;
    }

    public static zzbwq zzq(zzelx<Set<zzbys<zzbwt>>> zzelx) {
        return new zzbwq(zzelx);
    }

    public final /* synthetic */ Object get() {
        return new zzbwp(this.zzfor.get());
    }
}
