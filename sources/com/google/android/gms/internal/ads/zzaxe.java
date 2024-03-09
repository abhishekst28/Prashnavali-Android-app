package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzaxe implements zzaxg {
    public final zzdvt<String> zza(String str, PackageInfo packageInfo) {
        return zzdvl.zzaf(str);
    }

    public final zzdvt<AdvertisingIdClient.Info> zzal(Context context) {
        zzbbq zzbbq = new zzbbq();
        zzwe.zzpq();
        if (zzbat.zzbo(context)) {
            zzbbi.zzedu.execute(new zzaxh(this, context, zzbbq));
        }
        return zzbbq;
    }

    public final zzdvt<String> zza(Context context, int i) {
        return zzdvl.zzaf(null);
    }
}
