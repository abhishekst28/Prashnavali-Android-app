package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzddm implements zzdek<Bundle> {
    private final String zzguk;

    public zzddm(String str) {
        this.zzguk = str;
    }

    public final /* synthetic */ void zzs(Object obj) {
        ((Bundle) obj).putString("rtb", this.zzguk);
    }
}
