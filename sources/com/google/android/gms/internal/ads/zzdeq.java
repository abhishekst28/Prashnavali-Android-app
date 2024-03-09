package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdeq implements zzdek<Bundle> {
    private final boolean zzdtk;
    private final boolean zzdtl;
    private final String zzdtn;
    private final boolean zzdto;
    private final boolean zzdtp;
    private final boolean zzdtq;
    private final String zzdtt;
    private final String zzdtu;
    private final String zzdtv;
    private final boolean zzdui;
    private final ArrayList<String> zzgvl;
    private final String zzgvm;
    private final String zzgvn;
    private final long zzgvo;

    public zzdeq(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList<String> arrayList, @Nullable String str3, @Nullable String str4, String str5, boolean z6, String str6, long j) {
        this.zzdtk = z;
        this.zzdtl = z2;
        this.zzdtn = str;
        this.zzdto = z3;
        this.zzdtp = z4;
        this.zzdtq = z5;
        this.zzdtt = str2;
        this.zzgvl = arrayList;
        this.zzdtu = str3;
        this.zzdtv = str4;
        this.zzgvm = str5;
        this.zzdui = z6;
        this.zzgvn = str6;
        this.zzgvo = j;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.zzdtk);
        bundle.putBoolean("coh", this.zzdtl);
        bundle.putString("gl", this.zzdtn);
        bundle.putBoolean("simulator", this.zzdto);
        bundle.putBoolean("is_latchsky", this.zzdtp);
        bundle.putBoolean("is_sidewinder", this.zzdtq);
        bundle.putString("hl", this.zzdtt);
        if (!this.zzgvl.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.zzgvl);
        }
        bundle.putString("mv", this.zzdtu);
        bundle.putString("submodel", this.zzgvn);
        Bundle zza = zzdlu.zza(bundle, "device");
        bundle.putBundle("device", zza);
        zza.putString("build", this.zzgvm);
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcrg)).booleanValue()) {
            zza.putLong("remaining_data_partition_space", this.zzgvo);
        }
        Bundle zza2 = zzdlu.zza(zza, "browser");
        zza.putBundle("browser", zza2);
        zza2.putBoolean("is_browser_custom_tabs_capable", this.zzdui);
        if (!TextUtils.isEmpty(this.zzdtv)) {
            Bundle zza3 = zzdlu.zza(zza, "play_store");
            zza.putBundle("play_store", zza3);
            zza3.putString("package_version", this.zzdtv);
        }
    }
}
