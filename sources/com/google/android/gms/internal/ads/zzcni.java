package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcni implements zzelo<ApplicationInfo> {
    private final zzelx<Context> zzert;

    private zzcni(zzelx<Context> zzelx) {
        this.zzert = zzelx;
    }

    public static zzcni zzac(zzelx<Context> zzelx) {
        return new zzcni(zzelx);
    }

    public static ApplicationInfo zzce(Context context) {
        return (ApplicationInfo) zzelu.zza(context.getApplicationInfo(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zzce(this.zzert.get());
    }
}
