package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbup implements zzelo<zzbun> {
    private final zzelx<Set<zzbys<zzbuo>>> zzfor;

    private zzbup(zzelx<Set<zzbys<zzbuo>>> zzelx) {
        this.zzfor = zzelx;
    }

    public static zzbup zzn(zzelx<Set<zzbys<zzbuo>>> zzelx) {
        return new zzbup(zzelx);
    }

    public final /* synthetic */ Object get() {
        return new zzbun(this.zzfor.get());
    }
}
