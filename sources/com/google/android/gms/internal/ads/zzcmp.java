package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzp;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzcmp implements zzdvi<String> {
    final /* synthetic */ zzcmi zzggp;

    zzcmp(zzcmi zzcmi) {
        this.zzggp = zzcmi;
    }

    public final void zzb(Throwable th) {
        synchronized (this) {
            boolean unused = this.zzggp.zzggc = true;
            this.zzggp.zza("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (zzp.zzkw().elapsedRealtime() - this.zzggp.zzggd));
            this.zzggp.zzgge.setException(new Exception());
        }
    }

    public final /* synthetic */ void onSuccess(@Nullable Object obj) {
        String str = (String) obj;
        synchronized (this) {
            boolean unused = this.zzggp.zzggc = true;
            this.zzggp.zza("com.google.android.gms.ads.MobileAds", true, "", (int) (zzp.zzkw().elapsedRealtime() - this.zzggp.zzggd));
            this.zzggp.executor.execute(new zzcms(this, str));
        }
    }
}
