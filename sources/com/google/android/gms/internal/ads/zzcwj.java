package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcwj implements zzelo<zzcwh> {
    private final zzcwh zzgpe;

    private zzcwj(zzcwh zzcwh) {
        this.zzgpe = zzcwh;
    }

    public static zzcwj zzc(zzcwh zzcwh) {
        return new zzcwj(zzcwh);
    }

    public final /* synthetic */ Object get() {
        zzcwh zzcwh = this.zzgpe;
        if (zzcwh != null) {
            return (zzcwh) zzelu.zza(zzcwh, "Cannot return null from a non-@Nullable @Provides method");
        }
        throw null;
    }
}
