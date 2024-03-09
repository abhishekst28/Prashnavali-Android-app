package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdcz implements zzelo<zzdcx> {
    private final zzelx<Context> zzert;
    private final zzelx<zzdvw> zzgsh;
    private final zzelx<Set<String>> zzgsu;

    private zzdcz(zzelx<zzdvw> zzelx, zzelx<Context> zzelx2, zzelx<Set<String>> zzelx3) {
        this.zzgsh = zzelx;
        this.zzert = zzelx2;
        this.zzgsu = zzelx3;
    }

    public static zzdcz zzs(zzelx<zzdvw> zzelx, zzelx<Context> zzelx2, zzelx<Set<String>> zzelx3) {
        return new zzdcz(zzelx, zzelx2, zzelx3);
    }

    public final /* synthetic */ Object get() {
        return new zzdcx(this.zzgsh.get(), this.zzert.get(), this.zzgsu.get());
    }
}
