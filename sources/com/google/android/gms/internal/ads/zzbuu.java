package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbuu implements zzelo<zzbur> {
    private final zzelx<Set<zzbys<zzo>>> zzfor;

    private zzbuu(zzelx<Set<zzbys<zzo>>> zzelx) {
        this.zzfor = zzelx;
    }

    public static zzbuu zzo(zzelx<Set<zzbys<zzo>>> zzelx) {
        return new zzbuu(zzelx);
    }

    public final /* synthetic */ Object get() {
        return new zzbur(this.zzfor.get());
    }
}
