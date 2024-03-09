package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbki implements zzelo<zzamh> {
    private final zzbke zzfkj;

    public zzbki(zzbke zzbke) {
        this.zzfkj = zzbke;
    }

    public static zzamh zzb(zzbke zzbke) {
        return (zzamh) zzelu.zza(zzbke.zzaei(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zzb(this.zzfkj);
    }
}
