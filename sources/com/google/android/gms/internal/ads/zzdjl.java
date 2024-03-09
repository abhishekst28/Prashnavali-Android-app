package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzdjl implements zzdio {
    private final String zzdft;
    private final String zzdin;
    private final zzatj zzfsy;

    zzdjl(zzatj zzatj, String str, String str2) {
        this.zzfsy = zzatj;
        this.zzdft = str;
        this.zzdin = str2;
    }

    public final void zzq(Object obj) {
        zzatj zzatj = this.zzfsy;
        ((zzauu) obj).zza(new zzavh(zzatj.getType(), zzatj.getAmount()), this.zzdft, this.zzdin);
    }
}
