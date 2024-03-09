package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbsv implements zzelo<zzbst> {
    private final zzelx<Set<zzbys<zzut>>> zzfor;

    private zzbsv(zzelx<Set<zzbys<zzut>>> zzelx) {
        this.zzfor = zzelx;
    }

    public static zzbsv zzg(zzelx<Set<zzbys<zzut>>> zzelx) {
        return new zzbsv(zzelx);
    }

    public final /* synthetic */ Object get() {
        return new zzbst(this.zzfor.get());
    }
}
