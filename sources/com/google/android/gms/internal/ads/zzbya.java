package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbya implements zzelo<zzbxj> {
    private final zzbxj zzfug;

    private zzbya(zzbxj zzbxj) {
        this.zzfug = zzbxj;
    }

    public static zzbya zzx(zzbxj zzbxj) {
        return new zzbya(zzbxj);
    }

    public final /* synthetic */ Object get() {
        zzbxj zzbxj = this.zzfug;
        if (zzbxj != null) {
            return (zzbxj) zzelu.zza(zzbxj, "Cannot return null from a non-@Nullable @Provides method");
        }
        throw null;
    }
}
