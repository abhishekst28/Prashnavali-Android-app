package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcfw implements zzdsl {
    static final zzdsl zzdwg = new zzcfw();

    private zzcfw() {
    }

    public final Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (zzcfy zzcfy : (List) obj) {
            if (zzcfy != null) {
                arrayList.add(zzcfy);
            }
        }
        return arrayList;
    }
}
