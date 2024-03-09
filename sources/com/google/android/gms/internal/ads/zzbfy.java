package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.Executor;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbfy {
    public static zzdvt<zzbfq> zza(Context context, zzbbg zzbbg, String str, zzeg zzeg, zzb zzb) {
        return zzdvl.zzb(zzdvl.zzaf(null), new zzbgb(context, zzeg, zzbbg, zzb, str), (Executor) zzbbi.zzedy);
    }

    public static zzbfq zza(Context context, zzbhj zzbhj, String str, boolean z, boolean z2, zzeg zzeg, zzabt zzabt, zzbbg zzbbg, zzabk zzabk, zzk zzk, zzb zzb, zzto zzto, zzsq zzsq, boolean z3) throws zzbgc {
        zzaat.initialize(context);
        if (zzacz.zzdbz.get().booleanValue()) {
            return zzbhp.zza(context, zzbhj, str, z, z2, zzeg, zzabt, zzbbg, (zzabk) null, zzk, zzb, zzto, zzsq, z3);
        }
        try {
            return (zzbfq) zzbal.zza(new zzbga(context, zzbhj, str, z, z2, zzeg, zzabt, zzbbg, (zzabk) null, zzk, zzb, zzto, zzsq, z3));
        } catch (Throwable th) {
            throw new zzbgc("Webview initialization failed.", th);
        }
    }
}
