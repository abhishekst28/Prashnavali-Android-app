package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzdan implements zzdek {
    private final ArrayList zzgsr;

    zzdan(ArrayList arrayList) {
        this.zzgsr = arrayList;
    }

    public final void zzs(Object obj) {
        ((Bundle) obj).putStringArrayList("android_permissions", this.zzgsr);
    }
}
