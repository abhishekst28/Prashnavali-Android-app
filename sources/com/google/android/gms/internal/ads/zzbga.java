package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzbga implements zzdsz {
    private final Context zzcxz;
    private final String zzdin;
    private final zzbhj zzems;
    private final boolean zzemt;
    private final boolean zzemu;
    private final zzeg zzemv;
    private final zzabt zzemw;
    private final zzbbg zzemx;
    private final zzabk zzemy = null;
    private final zzk zzemz;
    private final zzb zzena;
    private final zzto zzenb;
    private final zzsq zzenc;
    private final boolean zzend;

    zzbga(Context context, zzbhj zzbhj, String str, boolean z, boolean z2, zzeg zzeg, zzabt zzabt, zzbbg zzbbg, zzabk zzabk, zzk zzk, zzb zzb, zzto zzto, zzsq zzsq, boolean z3) {
        this.zzcxz = context;
        this.zzems = zzbhj;
        this.zzdin = str;
        this.zzemt = z;
        this.zzemu = z2;
        this.zzemv = zzeg;
        this.zzemw = zzabt;
        this.zzemx = zzbbg;
        this.zzemz = zzk;
        this.zzena = zzb;
        this.zzenb = zzto;
        this.zzenc = zzsq;
        this.zzend = z3;
    }

    public final Object get() {
        Context context = this.zzcxz;
        zzbhj zzbhj = this.zzems;
        String str = this.zzdin;
        boolean z = this.zzemt;
        boolean z2 = this.zzemu;
        zzeg zzeg = this.zzemv;
        zzabt zzabt = this.zzemw;
        zzbbg zzbbg = this.zzemx;
        zzabk zzabk = this.zzemy;
        zzk zzk = this.zzemz;
        zzb zzb = this.zzena;
        zzto zzto = this.zzenb;
        boolean z3 = z2;
        zzbgf zzbgf = new zzbgf(zzbgg.zzb(context, zzbhj, str, z, z2, zzeg, zzabt, zzbbg, zzabk, zzk, zzb, zzto, this.zzenc, this.zzend));
        zzbgf.setWebViewClient(zzp.zzkr().zza(zzbgf, zzto, z3));
        zzbgf.setWebChromeClient(new zzbfi(zzbgf));
        return zzbgf;
    }
}
