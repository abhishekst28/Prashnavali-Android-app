package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbwu implements zzelo<zzbws> {
    private final zzelx<Set<zzbys<AppEventListener>>> zzfor;

    private zzbwu(zzelx<Set<zzbys<AppEventListener>>> zzelx) {
        this.zzfor = zzelx;
    }

    public static zzbwu zzr(zzelx<Set<zzbys<AppEventListener>>> zzelx) {
        return new zzbwu(zzelx);
    }

    public final /* synthetic */ Object get() {
        return new zzbws(this.zzfor.get());
    }
}
