package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzaay {
    static List<String> zzrj() {
        ArrayList arrayList = new ArrayList();
        zza(arrayList, zzaca.zzi("gad:dynamite_module:experiment_id", ""));
        zza(arrayList, zzacm.zzdal);
        zza(arrayList, zzacm.zzdam);
        zza(arrayList, zzacm.zzdan);
        zza(arrayList, zzacm.zzdao);
        zza(arrayList, zzacm.zzdap);
        zza(arrayList, zzacm.zzdav);
        zza(arrayList, zzacm.zzdaq);
        zza(arrayList, zzacm.zzdar);
        zza(arrayList, zzacm.zzdas);
        zza(arrayList, zzacm.zzdat);
        zza(arrayList, zzacm.zzdau);
        return arrayList;
    }

    static List<String> zzrk() {
        ArrayList arrayList = new ArrayList();
        zza(arrayList, zzacv.zzdbq);
        return arrayList;
    }

    private static void zza(List<String> list, zzaca<String> zzaca) {
        String str = zzaca.get();
        if (!TextUtils.isEmpty(str)) {
            list.add(str);
        }
    }
}
