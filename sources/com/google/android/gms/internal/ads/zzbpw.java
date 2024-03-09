package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbpw implements zzelo<zzdkx> {
    private final zzbpt zzfqi;

    private zzbpw(zzbpt zzbpt) {
        this.zzfqi = zzbpt;
    }

    public static zzbpw zzc(zzbpt zzbpt) {
        return new zzbpw(zzbpt);
    }

    public static zzdkx zzd(zzbpt zzbpt) {
        return (zzdkx) zzelu.zza(zzbpt.zzais(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zzd(this.zzfqi);
    }
}
