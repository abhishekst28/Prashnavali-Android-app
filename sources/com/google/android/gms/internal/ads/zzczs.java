package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzczs implements zzelo<zzczr> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzdvt<String>> zzgsk;

    private zzczs(zzelx<zzdvt<String>> zzelx, zzelx<Executor> zzelx2) {
        this.zzgsk = zzelx;
        this.zzerr = zzelx2;
    }

    public static zzczs zzaw(zzelx<zzdvt<String>> zzelx, zzelx<Executor> zzelx2) {
        return new zzczs(zzelx, zzelx2);
    }

    public final /* synthetic */ Object get() {
        return new zzczr(this.zzgsk.get(), this.zzerr.get());
    }
}
