package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbcw extends zzbco {
    public final zzbcp zza(Context context, zzbde zzbde, int i, boolean z, zzabk zzabk, zzbdf zzbdf) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (!(applicationInfo == null || applicationInfo.targetSdkVersion >= 11)) {
            return null;
        }
        zzbdh zzbdh = new zzbdh(context, zzbde.zzzt(), zzbde.getRequestId(), zzabk, zzbde.zzzp());
        if (i == 2) {
            return new zzbdl(context, zzbdh, zzbde, z, zza(zzbde), zzbdf);
        }
        return new zzbcc(context, z, zza(zzbde), zzbdf, new zzbdh(context, zzbde.zzzt(), zzbde.getRequestId(), zzabk, zzbde.zzzp()));
    }
}
