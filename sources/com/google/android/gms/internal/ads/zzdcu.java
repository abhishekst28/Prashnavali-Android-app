package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdcu implements zzdek<Bundle> {
    private final String zzgue;

    /* access modifiers changed from: private */
    public static boolean zze(Set<String> set) {
        if (set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner")) {
            return true;
        }
        return false;
    }

    public zzdcu(String str) {
        this.zzgue = str;
    }

    public final /* synthetic */ void zzs(Object obj) {
        zzdlu.zza((Bundle) obj, "omid_v", this.zzgue);
    }
}
