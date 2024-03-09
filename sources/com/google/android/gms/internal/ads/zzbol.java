package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbol implements zzelo<Boolean> {
    private final zzelx<zzdln> zzfos;

    public zzbol(zzelx<zzdln> zzelx) {
        this.zzfos = zzelx;
    }

    public final /* synthetic */ Object get() {
        boolean z;
        if (this.zzfos.get().zzasp() != null) {
            z = ((Boolean) zzwe.zzpu().zzd(zzaat.zzcos)).booleanValue();
        } else {
            z = ((Boolean) zzwe.zzpu().zzd(zzaat.zzcup)).booleanValue();
        }
        return Boolean.valueOf(z);
    }
}
