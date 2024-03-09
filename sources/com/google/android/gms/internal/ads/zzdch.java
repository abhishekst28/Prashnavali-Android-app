package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdch implements zzdek<Bundle> {
    private final Bundle zzdqv;

    public zzdch(Bundle bundle) {
        this.zzdqv = bundle;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle zza = zzdlu.zza(bundle, "device");
        zza.putBundle("android_mem_info", this.zzdqv);
        bundle.putBundle("device", zza);
    }
}
