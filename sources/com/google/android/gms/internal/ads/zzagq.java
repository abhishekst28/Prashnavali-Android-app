package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.database.core.ServerValues;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzagq implements zzahf<zzbfq> {
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzbfq zzbfq = (zzbfq) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get(ServerValues.NAME_OP_TIMESTAMP);
            if (TextUtils.isEmpty(str2)) {
                zzaxy.zzfe("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                zzaxy.zzfe("No timestamp given for CSI tick.");
            } else {
                try {
                    long elapsedRealtime = zzp.zzkw().elapsedRealtime() + (Long.parseLong(str4) - zzp.zzkw().currentTimeMillis());
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    zzbfq.zzzs().zzb(str2, str3, elapsedRealtime);
                } catch (NumberFormatException e) {
                    zzaxy.zzd("Malformed timestamp for CSI tick.", e);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (TextUtils.isEmpty(str5)) {
                zzaxy.zzfe("No value given for CSI experiment.");
                return;
            }
            zzabk zzrm = zzbfq.zzzs().zzrm();
            if (zzrm == null) {
                zzaxy.zzfe("No ticker for WebView, dropping experiment ID.");
            } else {
                zzrm.zzh("e", str5);
            }
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
            String str7 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (TextUtils.isEmpty(str7)) {
                zzaxy.zzfe("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                zzaxy.zzfe("No name given for CSI extra.");
            } else {
                zzabk zzrm2 = zzbfq.zzzs().zzrm();
                if (zzrm2 == null) {
                    zzaxy.zzfe("No ticker for WebView, dropping extra parameter.");
                } else {
                    zzrm2.zzh(str6, str7);
                }
            }
        }
    }
}
