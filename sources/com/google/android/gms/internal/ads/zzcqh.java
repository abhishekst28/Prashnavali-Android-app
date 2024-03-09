package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcqh implements zzelo<zzcqi> {
    private final zzelx<Context> zzert;

    private zzcqh(zzelx<Context> zzelx) {
        this.zzert = zzelx;
    }

    public static zzcqh zzaf(zzelx<Context> zzelx) {
        return new zzcqh(zzelx);
    }

    public final /* synthetic */ Object get() {
        return new zzcqi(this.zzert.get());
    }
}
