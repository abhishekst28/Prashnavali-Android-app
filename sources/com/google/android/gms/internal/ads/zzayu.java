package com.google.android.gms.internal.ads;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class zzayu extends zzayv {
    public final zzug zza(Context context, TelephonyManager telephonyManager) {
        zzp.zzkp();
        if (zzayh.zzr(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return telephonyManager.isDataEnabled() ? zzug.ENUM_TRUE : zzug.ENUM_FALSE;
        }
        return zzug.ENUM_FALSE;
    }
}
