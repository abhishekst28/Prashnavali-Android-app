package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdux<V> extends zzduu<V, List<V>> {
    zzdux(zzdtf<? extends zzdvt<? extends V>> zzdtf, boolean z) {
        super(zzdtf, true);
        zzaxd();
    }

    public final /* synthetic */ Object zzj(List list) {
        ArrayList zzep = zzdto.zzep(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzduw zzduw = (zzduw) it.next();
            zzep.add(zzduw != null ? zzduw.value : null);
        }
        return Collections.unmodifiableList(zzep);
    }
}
