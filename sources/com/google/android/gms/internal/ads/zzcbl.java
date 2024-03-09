package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcbl implements zzelo<zzcbj> {
    private final zzcbj zzfvo;

    private zzcbl(zzcbj zzcbj) {
        this.zzfvo = zzcbj;
    }

    public static zzcbl zzc(zzcbj zzcbj) {
        return new zzcbl(zzcbj);
    }

    public final /* synthetic */ Object get() {
        zzcbj zzcbj = this.zzfvo;
        if (zzcbj != null) {
            return (zzcbj) zzelu.zza(zzcbj, "Cannot return null from a non-@Nullable @Provides method");
        }
        throw null;
    }
}
