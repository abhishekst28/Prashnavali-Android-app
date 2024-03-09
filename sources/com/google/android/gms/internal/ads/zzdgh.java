package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzdgh implements Callable {
    private final zzdge zzgwo;

    zzdgh(zzdge zzdge) {
        this.zzgwo = zzdge;
    }

    public final Object call() {
        zzdge zzdge = this.zzgwo;
        return new zzdgf(zzdge.zzgwn.zzf(zzdge.zzdqh));
    }
}
