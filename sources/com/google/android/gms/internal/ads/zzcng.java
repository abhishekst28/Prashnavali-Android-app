package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzp;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcng implements zzelo<zzdvt<String>> {
    private final zzelx<Context> zzert;
    private final zzelx<zzdpf> zzfow;

    private zzcng(zzelx<zzdpf> zzelx, zzelx<Context> zzelx2) {
        this.zzfow = zzelx;
        this.zzert = zzelx2;
    }

    public static zzcng zzap(zzelx<zzdpf> zzelx, zzelx<Context> zzelx2) {
        return new zzcng(zzelx, zzelx2);
    }

    public final /* synthetic */ Object get() {
        return (zzdvt) zzelu.zza(this.zzfow.get().zzu(zzdpg.WEBVIEW_COOKIE).zzc(new zzcnc(zzp.zzkr().zzbg(this.zzert.get()))).zza(1, TimeUnit.SECONDS).zza(Exception.class, zzcnb.zzghg).zzauz(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
