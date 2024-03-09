package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzdep implements Runnable {
    private final zzden zzgvj;
    private final long zzgvk;

    zzdep(zzden zzden, long j) {
        this.zzgvj = zzden;
        this.zzgvk = j;
    }

    public final void run() {
        zzden zzden = this.zzgvj;
        long j = this.zzgvk;
        String canonicalName = zzden.getClass().getCanonicalName();
        long elapsedRealtime = zzp.zzkw().elapsedRealtime() - j;
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 40);
        sb.append("Signal runtime : ");
        sb.append(canonicalName);
        sb.append(" = ");
        sb.append(elapsedRealtime);
        zzaxy.zzei(sb.toString());
    }
}
