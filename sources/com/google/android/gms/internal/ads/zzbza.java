package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbza implements zzbyx {
    private final List<String> zzdru;
    private final zzdps zzfli;
    private boolean zzfuo;

    public zzbza(zzdkx zzdkx, zzdps zzdps) {
        this.zzdru = zzdkx.zzdru;
        this.zzfli = zzdps;
    }

    public final void zzaki() {
        if (!this.zzfuo) {
            this.zzfli.zzi(this.zzdru);
            this.zzfuo = true;
        }
    }
}
