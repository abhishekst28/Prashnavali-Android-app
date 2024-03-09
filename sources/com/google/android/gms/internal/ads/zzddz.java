package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzddz implements zzdek<Bundle> {
    private final String zzbra;
    private final int zzdqn;
    private final boolean zzdrk;
    private final boolean zzedt;
    private final boolean zzguv;
    private final int zzguw;
    private final int zzgux;

    public zzddz(boolean z, boolean z2, String str, boolean z3, int i, int i2, int i3) {
        this.zzguv = z;
        this.zzedt = z2;
        this.zzbra = str;
        this.zzdrk = z3;
        this.zzdqn = i;
        this.zzguw = i2;
        this.zzgux = i3;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.zzbra);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) zzwe.zzpu().zzd(zzaat.zzcri));
        bundle.putInt("target_api", this.zzdqn);
        bundle.putInt("dv", this.zzguw);
        bundle.putInt("lv", this.zzgux);
        Bundle zza = zzdlu.zza(bundle, "sdk_env");
        zza.putBoolean("mf", zzaco.zzdax.get().booleanValue());
        zza.putBoolean("instant_app", this.zzguv);
        zza.putBoolean("lite", this.zzedt);
        zza.putBoolean("is_privileged_process", this.zzdrk);
        bundle.putBundle("sdk_env", zza);
        Bundle zza2 = zzdlu.zza(zza, "build_meta");
        zza2.putString("cl", "317778048");
        zza2.putString("rapid_rc", "dev");
        zza2.putString("rapid_rollup", "HEAD");
        zza.putBundle("build_meta", zza2);
    }
}
