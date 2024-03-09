package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzcny implements zzdvi<zzdlj> {
    private final /* synthetic */ zzcnt zzghu;

    zzcny(zzcnt zzcnt) {
        this.zzghu = zzcnt;
    }

    public final void zzb(Throwable th) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcvx)).booleanValue()) {
            Matcher matcher = zzcnt.zzghr.matcher(th.getMessage());
            if (matcher.matches()) {
                this.zzghu.zzghq.zzdz(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzdlj zzdlj = (zzdlj) obj;
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcvx)).booleanValue()) {
            this.zzghu.zzghq.zzdz(zzdlj.zzhbq.zzhbn.responseCode);
            this.zzghu.zzghq.zzeo(zzdlj.zzhbq.zzhbn.zzgjr);
        }
    }
}
