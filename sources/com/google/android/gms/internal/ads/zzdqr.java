package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.ads.zzcf;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
final class zzdqr implements zzdqu {
    private static final zzcf.zza zzhjo = ((zzcf.zza) ((zzegp) zzcf.zza.zzaq().zzw("E").zzbfx()));

    zzdqr() {
    }

    public final zzcf.zza zzcj(Context context) throws PackageManager.NameNotFoundException {
        return zzdqi.zzj(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    public final zzcf.zza zzavl() {
        return zzhjo;
    }
}
