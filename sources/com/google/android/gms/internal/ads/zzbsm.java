package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbsg;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbsm implements zzelo<zzbsg.zza> {
    private final zzbsg zzfsm;

    private zzbsm(zzbsg zzbsg) {
        this.zzfsm = zzbsg;
    }

    public static zzbsm zzl(zzbsg zzbsg) {
        return new zzbsm(zzbsg);
    }

    public final /* synthetic */ Object get() {
        return (zzbsg.zza) zzelu.zza(this.zzfsm.zzaje(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
