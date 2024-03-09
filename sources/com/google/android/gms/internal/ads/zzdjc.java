package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdjc implements zzelo<zzdiz<zzchx, zzchu>> {
    private final zzelx<Context> zzert;
    private final zzelx<zzdmt> zzetu;
    private final zzelx<zzdnl> zzetv;

    public zzdjc(zzelx<Context> zzelx, zzelx<zzdmt> zzelx2, zzelx<zzdnl> zzelx3) {
        this.zzert = zzelx;
        this.zzetu = zzelx2;
        this.zzetv = zzelx3;
    }

    public final /* synthetic */ Object get() {
        Object obj;
        Context context = this.zzert.get();
        zzdmt zzdmt = this.zzetu.get();
        zzdnl zzdnl = this.zzetv.get();
        if (((Integer) zzwe.zzpu().zzd(zzaat.zzcwe)).intValue() > 0) {
            zzdno zza = zzdnl.zza(zzdng.Rewarded, context, zzdmt, new zzdih(new zzdhy()));
            obj = new zzdid(new zzdiq(new zzdir()), new zzdii(zza.zzgyr, zzbbi.zzedu), zza.zzhfm, zzbbi.zzedu);
        } else {
            obj = new zzdir();
        }
        return (zzdiz) zzelu.zza(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
