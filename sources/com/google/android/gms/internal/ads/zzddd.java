package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzddd implements zzelo<zzdda> {
    private final zzelx<PackageInfo> zzfse;
    private final zzelx<ApplicationInfo> zzghj;

    private zzddd(zzelx<ApplicationInfo> zzelx, zzelx<PackageInfo> zzelx2) {
        this.zzghj = zzelx;
        this.zzfse = zzelx2;
    }

    public static zzddd zzbd(zzelx<ApplicationInfo> zzelx, zzelx<PackageInfo> zzelx2) {
        return new zzddd(zzelx, zzelx2);
    }

    public static zzdda zza(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        return new zzdda(applicationInfo, packageInfo);
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzghj.get(), this.zzfse.get());
    }
}
