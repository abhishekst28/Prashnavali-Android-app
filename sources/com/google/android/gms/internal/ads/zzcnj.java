package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcnj implements zzelo<PackageInfo> {
    private final zzelx<Context> zzert;
    private final zzelx<ApplicationInfo> zzghj;

    private zzcnj(zzelx<Context> zzelx, zzelx<ApplicationInfo> zzelx2) {
        this.zzert = zzelx;
        this.zzghj = zzelx2;
    }

    public static zzcnj zzaq(zzelx<Context> zzelx, zzelx<ApplicationInfo> zzelx2) {
        return new zzcnj(zzelx, zzelx2);
    }

    public final /* synthetic */ Object get() {
        return zzcmz.zza(this.zzert.get(), this.zzghj.get());
    }
}
