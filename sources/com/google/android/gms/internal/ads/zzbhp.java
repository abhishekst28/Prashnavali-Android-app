package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzp;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbhp {
    public static zzbfq zza(Context context, zzbhj zzbhj, String str, boolean z, boolean z2, zzeg zzeg, zzabt zzabt, zzbbg zzbbg, zzabk zzabk, zzk zzk, zzb zzb, zzto zzto, zzsq zzsq, boolean z3) throws zzbgc {
        try {
            return (zzbfq) zzbal.zza(new zzbho(context, zzbhj, str, z, z2, zzeg, zzabt, zzbbg, (zzabk) null, zzk, zzb, zzto, zzsq, z3));
        } catch (Throwable th) {
            zzp.zzkt().zza(th, "AdWebViewFactory.newAdWebView2");
            throw new zzbgc("Webview initialization failed.", th);
        }
    }
}
