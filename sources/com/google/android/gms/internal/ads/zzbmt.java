package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbmt {
    private final zzdlj zzeua;
    private final zzcli zzfns;

    public zzbmt(zzcli zzcli, zzdlj zzdlj) {
        this.zzfns = zzcli;
        this.zzeua = zzdlj;
    }

    public final void zzfd(long j) {
        this.zzfns.zzaor().zza(this.zzeua.zzhbq.zzhbn).zzq("action", "ad_closed").zzq("show_time", String.valueOf(j)).zzq("ad_format", "appopen").zzaop();
    }
}
