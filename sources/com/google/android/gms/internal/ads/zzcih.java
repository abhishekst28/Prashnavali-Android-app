package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzb;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcih {
    private final zzbbg zzbpa;
    private final zzbfy zzbpp;
    private final zzto zzelx;
    private final zzeg zzenn;
    private final zzabt zzeno;
    private final zzb zzenq;
    private final zzsq zzens;
    private final zzdln zzfqn;
    /* access modifiers changed from: private */
    public final zzbvb zzgdg;
    private final Context zzvr;

    public zzcih(zzbfy zzbfy, Context context, zzdln zzdln, zzeg zzeg, zzabt zzabt, zzbbg zzbbg, zzb zzb, zzto zzto, zzbvb zzbvb, zzbzq zzbzq) {
        this.zzbpp = zzbfy;
        this.zzvr = context;
        this.zzfqn = zzdln;
        this.zzenn = zzeg;
        this.zzeno = zzabt;
        this.zzbpa = zzbbg;
        this.zzenq = zzb;
        this.zzelx = zzto;
        this.zzgdg = zzbvb;
        this.zzens = zzbzq;
    }

    public final zzbfq zzc(zzvj zzvj) throws zzbgc {
        return zza(zzvj, false);
    }

    public final zzbfq zza(zzvj zzvj, boolean z) throws zzbgc {
        return zzbfy.zza(this.zzvr, zzbhj.zzb(zzvj), zzvj.zzacx, false, false, this.zzenn, this.zzeno, this.zzbpa, (zzabk) null, new zzcik(this), this.zzenq, this.zzelx, this.zzens, z);
    }
}
