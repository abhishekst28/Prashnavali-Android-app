package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzawq {
    public static String zzc(String str, Context context, boolean z) {
        String zzah;
        if ((((Boolean) zzwe.zzpu().zzd(zzaat.zzcnm)).booleanValue() && !z) || !zzp.zzln().zzac(context) || TextUtils.isEmpty(str) || (zzah = zzp.zzln().zzah(context)) == null) {
            return str;
        }
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcne)).booleanValue()) {
            String str2 = (String) zzwe.zzpu().zzd(zzaat.zzcnf);
            if (str.contains(str2)) {
                if (zzp.zzkp().zzep(str)) {
                    zzp.zzln().zzi(context, zzah);
                    return zzb(str, context).replace(str2, zzah);
                } else if (zzp.zzkp().zzeq(str)) {
                    zzp.zzln().zzj(context, zzah);
                    return zzb(str, context).replace(str2, zzah);
                }
            }
        } else if (!str.contains("fbs_aeid")) {
            if (zzp.zzkp().zzep(str)) {
                zzp.zzln().zzi(context, zzah);
                return zza(zzb(str, context), "fbs_aeid", zzah).toString();
            } else if (zzp.zzkp().zzeq(str)) {
                zzp.zzln().zzj(context, zzah);
                return zza(zzb(str, context), "fbs_aeid", zzah).toString();
            }
        }
        return str;
    }

    private static String zzb(String str, Context context) {
        String zzaf = zzp.zzln().zzaf(context);
        String zzag = zzp.zzln().zzag(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(zzaf)) {
            str = zza(str, "gmp_app_id", zzaf).toString();
        }
        if (str.contains("fbs_aiid") || TextUtils.isEmpty(zzag)) {
            return str;
        }
        return zza(str, "fbs_aiid", zzag).toString();
    }

    public static String zzb(Uri uri, Context context) {
        if (!zzp.zzln().zzac(context)) {
            return uri.toString();
        }
        String zzah = zzp.zzln().zzah(context);
        if (zzah == null) {
            return uri.toString();
        }
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcne)).booleanValue()) {
            String str = (String) zzwe.zzpu().zzd(zzaat.zzcnf);
            String uri2 = uri.toString();
            if (uri2.contains(str)) {
                zzp.zzln().zzi(context, zzah);
                return zzb(uri2, context).replace(str, zzah);
            }
        } else if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            String uri3 = zza(zzb(uri.toString(), context), "fbs_aeid", zzah).toString();
            zzp.zzln().zzi(context, zzah);
            return uri3;
        }
        return uri.toString();
    }

    private static Uri zza(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
    }
}
