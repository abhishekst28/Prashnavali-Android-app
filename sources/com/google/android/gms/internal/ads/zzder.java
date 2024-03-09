package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzder<T> implements zzelo<zzdem<T>> {
    private final zzelx<Executor> zzerr;
    private final zzelx<Set<zzden<? extends zzdek<T>>>> zzgvp;

    private zzder(zzelx<Executor> zzelx, zzelx<Set<zzden<? extends zzdek<T>>>> zzelx2) {
        this.zzerr = zzelx;
        this.zzgvp = zzelx2;
    }

    public static <T> zzder<T> zzbh(zzelx<Executor> zzelx, zzelx<Set<zzden<? extends zzdek<T>>>> zzelx2) {
        return new zzder<>(zzelx, zzelx2);
    }

    public static <T> zzdem<T> zza(Executor executor, Set<zzden<? extends zzdek<T>>> set) {
        return new zzdem<>(executor, set);
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzerr.get(), this.zzgvp.get());
    }
}
