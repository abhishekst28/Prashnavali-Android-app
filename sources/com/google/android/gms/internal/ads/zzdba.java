package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdba implements zzdek<Bundle> {
    private final double zzduc;
    private final boolean zzdud;

    public zzdba(double d, boolean z) {
        this.zzduc = d;
        this.zzdud = z;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle zza = zzdlu.zza(bundle, "device");
        bundle.putBundle("device", zza);
        Bundle zza2 = zzdlu.zza(zza, "battery");
        zza.putBundle("battery", zza2);
        zza2.putBoolean("is_charging", this.zzdud);
        zza2.putDouble("battery_level", this.zzduc);
    }
}
