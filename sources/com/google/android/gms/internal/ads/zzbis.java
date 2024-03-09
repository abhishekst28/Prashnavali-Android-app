package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbis implements zzelo<zzbbg> {
    private final zzbih zzern;

    public zzbis(zzbih zzbih) {
        this.zzern = zzbih;
    }

    public static zzbbg zzb(zzbih zzbih) {
        return (zzbbg) zzelu.zza(zzbih.zzadg(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zzb(this.zzern);
    }
}
