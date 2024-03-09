package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbro implements zzbvj {
    private final Context zzaai;
    private final zzbbg zzbop;
    private final zzaya zzdza;
    private final zzcmi zzfkn;
    private final zzdln zzfqn;

    public zzbro(Context context, zzdln zzdln, zzbbg zzbbg, zzaya zzaya, zzcmi zzcmi) {
        this.zzaai = context;
        this.zzfqn = zzdln;
        this.zzbop = zzbbg;
        this.zzdza = zzaya;
        this.zzfkn = zzcmi;
    }

    public final void zzd(zzasp zzasp) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcse)).booleanValue()) {
            zzp.zzkx().zza(this.zzaai, this.zzbop, this.zzfqn.zzhbv, this.zzdza.zzxe());
        }
        this.zzfkn.zzaox();
    }

    public final void zzb(zzdlj zzdlj) {
    }
}
