package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdda implements zzdek<Bundle>, zzden<zzdek<Bundle>> {
    private final ApplicationInfo applicationInfo;
    private final PackageInfo zzdpx;

    zzdda(ApplicationInfo applicationInfo2, PackageInfo packageInfo) {
        this.applicationInfo = applicationInfo2;
        this.zzdpx = packageInfo;
    }

    public final zzdvt<zzdek<Bundle>> zzaqs() {
        return zzdvl.zzaf(this);
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.applicationInfo.packageName;
        PackageInfo packageInfo = this.zzdpx;
        String str2 = null;
        Integer valueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        bundle.putString("pn", str);
        if (valueOf != null) {
            bundle.putInt("vc", valueOf.intValue());
        }
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcvi)).booleanValue()) {
            PackageInfo packageInfo2 = this.zzdpx;
            if (packageInfo2 != null) {
                str2 = packageInfo2.versionName;
            }
            if (str2 != null) {
                bundle.putString("vnm", str2);
            }
        }
    }
}
