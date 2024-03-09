package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcze implements zzduv {
    private final zzasp zzftf;

    zzcze(zzasp zzasp) {
        this.zzftf = zzasp;
    }

    public final zzdvt zzf(Object obj) {
        return zzdvl.zzaf(new zzczg(new JsonReader(new InputStreamReader((InputStream) obj))).zzo(this.zzftf.zzdtd));
    }
}
