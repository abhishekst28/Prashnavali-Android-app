package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbpy implements zzelo<zzdlj> {
    private final zzbpt zzfqi;

    private zzbpy(zzbpt zzbpt) {
        this.zzfqi = zzbpt;
    }

    public static zzbpy zze(zzbpt zzbpt) {
        return new zzbpy(zzbpt);
    }

    public static zzdlj zzf(zzbpt zzbpt) {
        return (zzdlj) zzelu.zza(zzbpt.zzair(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zzf(this.zzfqi);
    }
}
