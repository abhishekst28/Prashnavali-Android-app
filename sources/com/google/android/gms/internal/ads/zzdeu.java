package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdeu implements zzdek<Bundle> {
    private final String zzdtm;
    private final int zzdtx;
    private final int zzdty;
    private final int zzdtz;
    private final boolean zzdue;
    private final int zzduf;

    public zzdeu(String str, int i, int i2, int i3, boolean z, int i4) {
        this.zzdtm = str;
        this.zzdtx = i;
        this.zzdty = i2;
        this.zzdtz = i3;
        this.zzdue = z;
        this.zzduf = i4;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.zzdtm;
        boolean z = true;
        zzdlu.zza(bundle, "carrier", str, !TextUtils.isEmpty(str));
        Integer valueOf = Integer.valueOf(this.zzdtx);
        if (this.zzdtx == -2) {
            z = false;
        }
        zzdlu.zza(bundle, "cnt", valueOf, z);
        bundle.putInt("gnt", this.zzdty);
        bundle.putInt("pt", this.zzdtz);
        Bundle zza = zzdlu.zza(bundle, "device");
        bundle.putBundle("device", zza);
        Bundle zza2 = zzdlu.zza(zza, "network");
        zza.putBundle("network", zza2);
        zza2.putInt("active_network_state", this.zzduf);
        zza2.putBoolean("active_network_metered", this.zzdue);
    }
}
