package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzchs implements zzahp {
    private final zzbtu zzfqj;
    private final zzaue zzgcz;
    private final String zzgda;
    private final String zzgdb;

    public zzchs(zzbtu zzbtu, zzdkx zzdkx) {
        this.zzfqj = zzbtu;
        this.zzgcz = zzdkx.zzdsh;
        this.zzgda = zzdkx.zzdjz;
        this.zzgdb = zzdkx.zzdka;
    }

    public final void zzsv() {
        this.zzfqj.onRewardedVideoStarted();
    }

    @ParametersAreNonnullByDefault
    public final void zza(zzaue zzaue) {
        int i;
        String str;
        zzaue zzaue2 = this.zzgcz;
        if (zzaue2 != null) {
            zzaue = zzaue2;
        }
        if (zzaue != null) {
            str = zzaue.type;
            i = zzaue.zzdva;
        } else {
            str = "";
            i = 1;
        }
        this.zzfqj.zzb(new zzath(str, i), this.zzgda, this.zzgdb);
    }

    public final void zzsw() {
        this.zzfqj.onRewardedVideoCompleted();
    }
}
