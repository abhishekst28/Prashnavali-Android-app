package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzcxg implements zzdvi<zzbni> {
    private final /* synthetic */ zzboe zzgqg;
    final /* synthetic */ zzcxd zzgqh;

    zzcxg(zzcxd zzcxd, zzboe zzboe) {
        this.zzgqh = zzcxd;
        this.zzgqg = zzboe;
    }

    public final void zzb(Throwable th) {
        zzuw zze = zzcmt.zze(th);
        synchronized (this.zzgqh) {
            zzdvt unused = this.zzgqh.zzgqd = null;
            this.zzgqg.zzafd().zzg(zze);
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxp)).booleanValue()) {
                this.zzgqh.zzgmy.zzadj().execute(new zzcxi(this, zze));
            }
            this.zzgqh.zzgqa.zzdw(60);
            zzdly.zza(zze.errorCode, th, "BannerAdManagerShim.onFailure");
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzbni zzbni = (zzbni) obj;
        synchronized (this.zzgqh) {
            zzdvt unused = this.zzgqh.zzgqd = null;
            if (this.zzgqh.zzgpm != null) {
                this.zzgqh.zzgpm.destroy();
            }
            zzbni unused2 = this.zzgqh.zzgpm = zzbni;
            this.zzgqh.zzfnx.removeAllViews();
            if (zzbni.zzahq() != null) {
                ViewParent parent = zzbni.zzahq().getParent();
                if (parent instanceof ViewGroup) {
                    String mediationAdapterClassName = this.zzgqh.getMediationAdapterClassName();
                    StringBuilder sb = new StringBuilder(String.valueOf(mediationAdapterClassName).length() + 78);
                    sb.append("Banner view provided from ");
                    sb.append(mediationAdapterClassName);
                    sb.append(" already has a parent view. Removing its old parent.");
                    zzaxy.zzfe(sb.toString());
                    ((ViewGroup) parent).removeView(zzbni.zzahq());
                }
            }
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxp)).booleanValue()) {
                zzbni.zzaio().zza(this.zzgqh.zzgpw).zza(this.zzgqh.zzgpx).zza(this.zzgqh.zzgpy).zza(this.zzgqh.zzgpz);
            }
            this.zzgqh.zzfnx.addView(zzbni.zzahq());
            zzbni.zzahw();
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxp)).booleanValue()) {
                Executor zzadj = this.zzgqh.zzgmy.zzadj();
                zzcxm zzf = this.zzgqh.zzgpw;
                zzf.getClass();
                zzadj.execute(zzcxf.zzb(zzf));
            }
            this.zzgqh.zzgqa.zzdw(zzbni.zzahv());
        }
    }
}
