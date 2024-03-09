package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdgr implements zzelo<String> {
    private final zzdgo zzgws;

    public zzdgr(zzdgo zzdgo) {
        this.zzgws = zzdgo;
    }

    public static String zzc(zzdgo zzdgo) {
        return (String) zzelu.zza(zzdgo.zzarn(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zzc(this.zzgws);
    }
}
