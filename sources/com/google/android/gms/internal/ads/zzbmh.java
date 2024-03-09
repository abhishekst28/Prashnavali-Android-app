package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbmh implements zzelo<Set<zzbys<zzqu>>> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzbma> zzfmx;
    private final zzelx<JSONObject> zzfmy;

    private zzbmh(zzelx<zzbma> zzelx, zzelx<Executor> zzelx2, zzelx<JSONObject> zzelx3) {
        this.zzfmx = zzelx;
        this.zzerr = zzelx2;
        this.zzfmy = zzelx3;
    }

    public static zzbmh zzc(zzelx<zzbma> zzelx, zzelx<Executor> zzelx2, zzelx<JSONObject> zzelx3) {
        return new zzbmh(zzelx, zzelx2, zzelx3);
    }

    public final /* synthetic */ Object get() {
        Set set;
        zzbma zzbma = this.zzfmx.get();
        Executor executor = this.zzerr.get();
        if (this.zzfmy.get() == null) {
            set = Collections.emptySet();
        } else {
            set = Collections.singleton(new zzbys(zzbma, executor));
        }
        return (Set) zzelu.zza(set, "Cannot return null from a non-@Nullable @Provides method");
    }
}
