package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcsd implements zzcre<zzbzr> {
    private final zzdkv zzfld;
    private final Executor zzfmk;
    private final zzcar zzglr;
    private final Context zzvr;

    public zzcsd(Context context, Executor executor, zzcar zzcar, zzdkv zzdkv) {
        this.zzvr = context;
        this.zzglr = zzcar;
        this.zzfmk = executor;
        this.zzfld = zzdkv;
    }

    public final boolean zza(zzdlj zzdlj, zzdkx zzdkx) {
        return (this.zzvr instanceof Activity) && PlatformVersion.isAtLeastIceCreamSandwichMR1() && zzabu.zzk(this.zzvr) && !TextUtils.isEmpty(zze(zzdkx));
    }

    public final zzdvt<zzbzr> zzb(zzdlj zzdlj, zzdkx zzdkx) {
        String zze = zze(zzdkx);
        return zzdvl.zzb(zzdvl.zzaf(null), new zzcsg(this, zze != null ? Uri.parse(zze) : null, zzdlj, zzdkx), this.zzfmk);
    }

    private static String zze(zzdkx zzdkx) {
        try {
            return zzdkx.zzhar.getString("tab_url");
        } catch (Exception e) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(Uri uri, zzdlj zzdlj, zzdkx zzdkx, Object obj) throws Exception {
        try {
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            build.intent.setData(uri);
            zzd zzd = new zzd(build.intent);
            zzbbq zzbbq = new zzbbq();
            zzbzt zza = this.zzglr.zza(new zzbpt(zzdlj, zzdkx, (String) null), new zzbzw(new zzcsf(zzbbq)));
            zzbbq.set(new AdOverlayInfoParcel(zzd, (zzut) null, zza.zzagc(), (zzt) null, new zzbbg(0, 0, false)));
            this.zzfld.zzwf();
            return zzdvl.zzaf(zza.zzagb());
        } catch (Throwable th) {
            zzaxy.zzc("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
