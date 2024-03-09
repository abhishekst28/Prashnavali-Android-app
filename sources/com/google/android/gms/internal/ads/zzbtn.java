package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbtn implements zzelo<zzbtl> {
    private final zzelx<Set<zzbys<zzbtm>>> zzfor;

    private zzbtn(zzelx<Set<zzbys<zzbtm>>> zzelx) {
        this.zzfor = zzelx;
    }

    public static zzbtn zzi(zzelx<Set<zzbys<zzbtm>>> zzelx) {
        return new zzbtn(zzelx);
    }

    public final /* synthetic */ Object get() {
        return new zzbtl(this.zzfor.get());
    }
}
