package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbof implements zzelo<zzcre<zzbni>> {
    private final zzelx<zzcvp<zzbni, zzdlx, zzcso>> zzfcc;
    private final zzelx<Boolean> zzfhk;
    private final zzelx<zzctx> zzfhm;

    public zzbof(zzelx<Boolean> zzelx, zzelx<zzctx> zzelx2, zzelx<zzcvp<zzbni, zzdlx, zzcso>> zzelx3) {
        this.zzfhk = zzelx;
        this.zzfhm = zzelx2;
        this.zzfcc = zzelx3;
    }

    public final /* synthetic */ Object get() {
        boolean booleanValue = this.zzfhk.get().booleanValue();
        zzcre zzcre = (zzctx) this.zzfhm.get();
        zzcre zzcre2 = (zzcvp) this.zzfcc.get();
        if (!booleanValue) {
            zzcre = zzcre2;
        }
        return (zzcre) zzelu.zza(zzcre, "Cannot return null from a non-@Nullable @Provides method");
    }
}
