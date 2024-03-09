package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzczv implements zzdek<Bundle> {
    private final String zzacx;
    private final zzvj zzbpb;
    private final float zzbrw;
    private final boolean zzchp;
    private final int zzdng;
    private final int zzdnh;
    private final String zzgsm;
    private final String zzgsn;
    private final boolean zzgso;

    public zzczv(zzvj zzvj, String str, boolean z, String str2, float f, int i, int i2, String str3, boolean z2) {
        Preconditions.checkNotNull(zzvj, "the adSize must not be null");
        this.zzbpb = zzvj;
        this.zzacx = str;
        this.zzchp = z;
        this.zzgsm = str2;
        this.zzbrw = f;
        this.zzdng = i;
        this.zzdnh = i2;
        this.zzgsn = str3;
        this.zzgso = z2;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzdlu.zza(bundle, "smart_w", "full", this.zzbpb.width == -1);
        zzdlu.zza(bundle, "smart_h", "auto", this.zzbpb.height == -2);
        zzdlu.zza(bundle, "ene", (Boolean) true, this.zzbpb.zzchq);
        zzdlu.zza(bundle, "rafmt", "102", this.zzbpb.zzcht);
        zzdlu.zza(bundle, "rafmt", "103", this.zzbpb.zzchu);
        zzdlu.zza(bundle, "inline_adaptive_slot", (Boolean) true, this.zzgso);
        zzdlu.zza(bundle, "format", this.zzacx);
        zzdlu.zza(bundle, "fluid", "height", this.zzchp);
        String str = this.zzgsm;
        zzdlu.zza(bundle, "sz", str, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.zzbrw);
        bundle.putInt("sw", this.zzdng);
        bundle.putInt("sh", this.zzdnh);
        String str2 = this.zzgsn;
        zzdlu.zza(bundle, "sc", str2, true ^ TextUtils.isEmpty(str2));
        ArrayList arrayList = new ArrayList();
        if (this.zzbpb.zzcho == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.zzbpb.height);
            bundle2.putInt("width", this.zzbpb.width);
            bundle2.putBoolean("is_fluid_height", this.zzbpb.zzchp);
            arrayList.add(bundle2);
        } else {
            for (zzvj zzvj : this.zzbpb.zzcho) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzvj.zzchp);
                bundle3.putInt("height", zzvj.height);
                bundle3.putInt("width", zzvj.width);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
