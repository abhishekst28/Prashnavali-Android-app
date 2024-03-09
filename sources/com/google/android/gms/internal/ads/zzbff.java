package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbff extends zzbev {
    public zzbff(zzbde zzbde) {
        super(zzbde);
    }

    public final boolean zzfn(String str) {
        zzbde zzbde = (zzbde) this.zzekx.get();
        if (zzbde != null) {
            zzbde.zza(zzfo(str), (zzbev) this);
        }
        zzaxy.zzfe("VideoStreamNoopCache is doing nothing.");
        zza(str, zzfo(str), "noop", "Noop cache is a noop.");
        return false;
    }

    public final void abort() {
    }
}
