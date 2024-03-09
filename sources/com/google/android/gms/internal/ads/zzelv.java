package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzelv<T> {
    private final List<zzelx<T>> zzirg;
    private final List<zzelx<Collection<T>>> zzirh;

    private zzelv(int i, int i2) {
        this.zzirg = zzelj.zzhy(i);
        this.zzirh = zzelj.zzhy(i2);
    }

    public final zzelv<T> zzau(zzelx<? extends T> zzelx) {
        this.zzirg.add(zzelx);
        return this;
    }

    public final zzelv<T> zzav(zzelx<? extends Collection<? extends T>> zzelx) {
        this.zzirh.add(zzelx);
        return this;
    }

    public final zzelt<T> zzbjo() {
        return new zzelt<>(this.zzirg, this.zzirh);
    }
}
