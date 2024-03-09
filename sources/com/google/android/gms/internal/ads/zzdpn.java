package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdpn implements zzelo<zzdpi> {
    private final zzelx<Set<zzbys<zzdpl>>> zzfor;

    private zzdpn(zzelx<Set<zzbys<zzdpl>>> zzelx) {
        this.zzfor = zzelx;
    }

    public static zzdpn zzar(zzelx<Set<zzbys<zzdpl>>> zzelx) {
        return new zzdpn(zzelx);
    }

    public final /* synthetic */ Object get() {
        return new zzdpi(this.zzfor.get());
    }
}
