package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzczz implements zzden<zzdek<Bundle>> {
    private final Set<String> zzgss;

    zzczz(Set<String> set) {
        this.zzgss = set;
    }

    public final zzdvt<zzdek<Bundle>> zzaqs() {
        ArrayList arrayList = new ArrayList();
        for (String add : this.zzgss) {
            arrayList.add(add);
        }
        return zzdvl.zzaf(new zzczy(arrayList));
    }
}
