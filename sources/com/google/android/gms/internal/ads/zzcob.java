package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzcob implements zzdvi<zzdlj> {
    private final /* synthetic */ zzcoa zzghw;

    zzcob(zzcoa zzcoa) {
        this.zzghw = zzcoa;
    }

    public final void zzb(Throwable th) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcvx)).booleanValue()) {
            Matcher matcher = zzcoa.zzghr.matcher(th.getMessage());
            if (matcher.matches()) {
                this.zzghw.zzghq.zzdz(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzdlj zzdlj = (zzdlj) obj;
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcvx)).booleanValue()) {
            this.zzghw.zzghq.zzdz(zzdlj.zzhbq.zzhbn.responseCode);
            this.zzghw.zzghq.zzeo(zzdlj.zzhbq.zzhbn.zzgjr);
        }
    }
}
