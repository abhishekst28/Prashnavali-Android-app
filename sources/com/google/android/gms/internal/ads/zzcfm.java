package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcfm implements zzdsl {
    static final zzdsl zzdwg = new zzcfm();

    private zzcfm() {
    }

    public final Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (zzadi zzadi : (List) obj) {
            if (zzadi != null) {
                arrayList.add(zzadi);
            }
        }
        return arrayList;
    }
}
