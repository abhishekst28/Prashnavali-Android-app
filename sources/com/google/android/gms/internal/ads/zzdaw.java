package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdaw implements zzdek<Bundle> {
    private final float zzdqm;
    private final int zzdtj;
    private final boolean zzdtr;
    private final boolean zzdts;
    private final int zzdtw;
    private final int zzdua;
    private final int zzdub;
    private final boolean zzgth;

    public zzdaw(int i, boolean z, boolean z2, int i2, int i3, int i4, float f, boolean z3) {
        this.zzdtj = i;
        this.zzdtr = z;
        this.zzdts = z2;
        this.zzdtw = i2;
        this.zzdua = i3;
        this.zzdub = i4;
        this.zzdqm = f;
        this.zzgth = z3;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putInt("am", this.zzdtj);
        bundle.putBoolean("ma", this.zzdtr);
        bundle.putBoolean("sp", this.zzdts);
        bundle.putInt("muv", this.zzdtw);
        bundle.putInt("rm", this.zzdua);
        bundle.putInt("riv", this.zzdub);
        bundle.putFloat("android_app_volume", this.zzdqm);
        bundle.putBoolean("android_app_muted", this.zzgth);
    }
}
