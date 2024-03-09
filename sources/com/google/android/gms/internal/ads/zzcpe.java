package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcpe implements zzduv {
    private final zzasp zzftf;

    zzcpe(zzasp zzasp) {
        this.zzftf = zzasp;
    }

    public final zzdvt zzf(Object obj) {
        zzasp zzasp = this.zzftf;
        zzasp.zzdth = new String(zzdud.toByteArray((InputStream) obj), zzdsj.UTF_8);
        return zzdvl.zzaf(zzasp);
    }
}
