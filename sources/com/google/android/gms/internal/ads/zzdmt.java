package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdmt {
    private zzdmw zzhdi = null;
    private zzdmw zzhdj = null;
    private zzdmw zzhdk = null;
    private zzdmw zzhdl = null;
    private zzdmw zzhdm = null;
    private zzdmw zzhdn = null;
    private zzdmw zzhdo = null;
    private zzdmw zzhdp = null;

    public final void zza(zzdmw zzdmw) {
        this.zzhdl = zzdmw;
    }

    public final void onAdClosed() {
        zzdmw zzdmw = this.zzhdl;
        if (zzdmw != null) {
            zzdmw.execute();
        }
    }
}
