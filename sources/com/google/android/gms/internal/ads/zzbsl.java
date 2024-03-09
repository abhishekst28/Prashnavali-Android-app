package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbsl implements zzelo<String> {
    private final zzelx<zzbqq> zzeyg;
    private final zzbsg zzfsm;

    private zzbsl(zzbsg zzbsg, zzelx<zzbqq> zzelx) {
        this.zzfsm = zzbsg;
        this.zzeyg = zzelx;
    }

    public static zzbsl zzb(zzbsg zzbsg, zzelx<zzbqq> zzelx) {
        return new zzbsl(zzbsg, zzelx);
    }

    public static String zza(zzbsg zzbsg, zzbqq zzbqq) {
        return (String) zzelu.zza(zzbqq.zzwc(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzfsm, this.zzeyg.get());
    }
}
