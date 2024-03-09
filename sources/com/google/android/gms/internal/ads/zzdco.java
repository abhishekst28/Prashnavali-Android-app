package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdco implements zzden<zzdcp> {
    private final PackageInfo zzdpx;
    private final zzaya zzdza;
    private final zzdln zzfqn;
    private final zzdvw zzgay;

    public zzdco(zzdvw zzdvw, zzdln zzdln, PackageInfo packageInfo, zzaya zzaya) {
        this.zzgay = zzdvw;
        this.zzfqn = zzdln;
        this.zzdpx = packageInfo;
        this.zzdza = zzaya;
    }

    public final zzdvt<zzdcp> zzaqs() {
        return this.zzgay.zze(new zzdcr(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(ArrayList arrayList, Bundle bundle) {
        String str;
        JSONArray optJSONArray;
        String str2;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", this.zzfqn.zzhbx);
        String str3 = "landscape";
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcrp)).booleanValue() && this.zzfqn.zzdla.versionCode > 3) {
            bundle.putBoolean("enable_native_media_orientation", true);
            int i = this.zzfqn.zzdla.zzbnk;
            if (i == 1) {
                str2 = "any";
            } else if (i == 2) {
                str2 = str3;
            } else if (i != 3) {
                str2 = i != 4 ? EnvironmentCompat.MEDIA_UNKNOWN : "square";
            } else {
                str2 = "portrait";
            }
            if (!EnvironmentCompat.MEDIA_UNKNOWN.equals(str2)) {
                bundle.putString("native_media_orientation", str2);
            }
        }
        int i2 = this.zzfqn.zzdla.zzbnj;
        if (i2 == 0) {
            str3 = "any";
        } else if (i2 == 1) {
            str3 = "portrait";
        } else if (i2 != 2) {
            str3 = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (!EnvironmentCompat.MEDIA_UNKNOWN.equals(str3)) {
            bundle.putString("native_image_orientation", str3);
        }
        bundle.putBoolean("native_multiple_images", this.zzfqn.zzdla.zzbnl);
        bundle.putBoolean("use_custom_mute", this.zzfqn.zzdla.zzbno);
        PackageInfo packageInfo = this.zzdpx;
        int i3 = packageInfo == null ? 0 : packageInfo.versionCode;
        if (i3 > this.zzdza.zzxd()) {
            this.zzdza.zzxj();
            this.zzdza.zzdf(i3);
        }
        JSONObject zzxi = this.zzdza.zzxi();
        if (zzxi == null || (optJSONArray = zzxi.optJSONArray(this.zzfqn.zzhbv)) == null) {
            str = null;
        } else {
            str = optJSONArray.toString();
        }
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("native_advanced_settings", str);
        }
        if (this.zzfqn.zzgra > 1) {
            bundle.putInt("max_num_ads", this.zzfqn.zzgra);
        }
        zzair zzair = this.zzfqn.zzdrn;
        if (zzair != null) {
            if (TextUtils.isEmpty(zzair.zzdfl)) {
                String str4 = "p";
                if (zzair.versionCode >= 2) {
                    int i4 = zzair.zzbnk;
                    if (i4 == 2) {
                        str4 = "l";
                    } else if (i4 != 3) {
                        str4 = "l";
                    }
                } else {
                    int i5 = zzair.zzdfk;
                    if (i5 == 1) {
                        str4 = "l";
                    } else if (i5 != 2) {
                        int i6 = zzair.zzdfk;
                        StringBuilder sb = new StringBuilder(52);
                        sb.append("Instream ad video aspect ratio ");
                        sb.append(i6);
                        sb.append(" is wrong.");
                        zzbbd.zzfc(sb.toString());
                        str4 = "l";
                    }
                }
                bundle.putString("ia_var", str4);
            } else {
                bundle.putString("ad_tag", zzair.zzdfl);
            }
            bundle.putBoolean("instr", true);
        }
        if (this.zzfqn.zzasp() != null) {
            bundle.putBoolean("has_delayed_banner_listener", true);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdcp zzara() throws Exception {
        ArrayList<String> arrayList = this.zzfqn.zzhbw;
        if (arrayList == null) {
            return zzdcq.zzgub;
        }
        if (arrayList.isEmpty()) {
            return zzdct.zzgub;
        }
        return new zzdcs(this, arrayList);
    }
}
