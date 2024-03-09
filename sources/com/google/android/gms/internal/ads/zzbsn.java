package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbsn implements zzelo<zzdln> {
    private final zzbsg zzfsm;

    private zzbsn(zzbsg zzbsg) {
        this.zzfsm = zzbsg;
    }

    public static zzbsn zzm(zzbsg zzbsg) {
        return new zzbsn(zzbsg);
    }

    public static zzdln zzn(zzbsg zzbsg) {
        return (zzdln) zzelu.zza(zzbsg.zzajf(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zzn(this.zzfsm);
    }
}
