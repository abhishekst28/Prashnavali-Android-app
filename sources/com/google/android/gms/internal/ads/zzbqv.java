package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbqv implements zzelo<zzbys<zzbuj>> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzbln> zzfnr;

    private zzbqv(zzelx<zzbln> zzelx, zzelx<Executor> zzelx2) {
        this.zzfnr = zzelx;
        this.zzerr = zzelx2;
    }

    public static zzbqv zzi(zzelx<zzbln> zzelx, zzelx<Executor> zzelx2) {
        return new zzbqv(zzelx, zzelx2);
    }

    public static zzbys<zzbuj> zza(zzbln zzbln, Executor executor) {
        return (zzbys) zzelu.zza(new zzbys(zzbln, executor), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzfnr.get(), this.zzerr.get());
    }
}
