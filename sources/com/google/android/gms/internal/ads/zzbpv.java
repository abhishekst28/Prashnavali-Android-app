package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbpv implements zzelo<String> {
    private final zzbpt zzfqi;

    private zzbpv(zzbpt zzbpt) {
        this.zzfqi = zzbpt;
    }

    public static zzbpv zza(zzbpt zzbpt) {
        return new zzbpv(zzbpt);
    }

    public static String zzb(zzbpt zzbpt) {
        return (String) zzelu.zza(zzbpt.zzait(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zzb(this.zzfqi);
    }
}
