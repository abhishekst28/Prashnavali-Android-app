package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public abstract class zzog {
    private zzof zzbhr;

    public abstract zzoi zza(zzhw[] zzhwArr, zznp zznp) throws zzhd;

    public abstract void zzd(Object obj);

    public final void zza(zzof zzof) {
        this.zzbhr = zzof;
    }

    /* access modifiers changed from: protected */
    public final void invalidate() {
        zzof zzof = this.zzbhr;
        if (zzof != null) {
            zzof.zzeq();
        }
    }
}
