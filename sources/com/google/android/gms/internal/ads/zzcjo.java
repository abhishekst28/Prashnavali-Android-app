package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcjo implements zzelo<zzcjk> {
    private final zzelx<Executor> zzerr;

    public zzcjo(zzelx<Executor> zzelx) {
        this.zzerr = zzelx;
    }

    public final /* synthetic */ Object get() {
        return new zzcjk(this.zzerr.get());
    }
}
