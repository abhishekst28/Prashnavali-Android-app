package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzk;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzbho implements zzdsz {
    private final Context zzcxz;
    private final String zzdin;
    private final zzbhj zzems;
    private final boolean zzemt;
    private final boolean zzemu;
    private final zzeg zzemv;
    private final zzabt zzemw;
    private final zzbbg zzemx;
    private final zzabk zzemy;
    private final zzk zzemz;
    private final zzb zzena;
    private final zzto zzenb;
    private final zzsq zzenc;
    private final boolean zzend;

    zzbho(Context context, zzbhj zzbhj, String str, boolean z, boolean z2, zzeg zzeg, zzabt zzabt, zzbbg zzbbg, zzabk zzabk, zzk zzk, zzb zzb, zzto zzto, zzsq zzsq, boolean z3) {
        this.zzcxz = context;
        this.zzems = zzbhj;
        this.zzdin = str;
        this.zzemt = z;
        this.zzemu = z2;
        this.zzemv = zzeg;
        this.zzemw = zzabt;
        this.zzemx = zzbbg;
        this.zzemy = zzabk;
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
        zzsq zzsq = this.zzenc;
        boolean z3 = this.zzend;
        zzbhi zzbhi = new zzbhi();
        boolean z4 = z3;
        zzto zzto2 = zzto;
        zzbhr zzbhr = new zzbhr(new zzbhg(context), zzbhi, zzbhj, str, z, z2, zzeg, zzabt, zzbbg, zzabk, zzk, zzb, zzto2, zzsq, z4);
        zzbgf zzbgf = new zzbgf(zzbhr);
        zzbhr.setWebChromeClient(new zzbfi(zzbgf));
        zzbhi.zza((zzbfq) zzbgf, z2);
        return zzbgf;
    }
}
