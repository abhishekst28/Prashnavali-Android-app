package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbnp implements zzelo<View> {
    private final zzbnl zzfoq;

    public zzbnp(zzbnl zzbnl) {
        this.zzfoq = zzbnl;
    }

    public static View zza(zzbnl zzbnl) {
        return (View) zzelu.zza(zzbnl.zzahq(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzfoq);
    }
}
