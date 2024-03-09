package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbms implements zzelo<View> {
    private final zzbmp zzfnq;

    public zzbms(zzbmp zzbmp) {
        this.zzfnq = zzbmp;
    }

    public static View zza(zzbmp zzbmp) {
        return (View) zzelu.zza(zzbmp.zzahf(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzfnq);
    }
}
