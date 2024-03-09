package com.google.android.gms.ads.internal.overlay;

import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.internal.ads.zzaxu;
import com.google.android.gms.internal.ads.zzayh;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzl extends zzaxu {
    final /* synthetic */ zzc zzdop;

    private zzl(zzc zzc) {
        this.zzdop = zzc;
    }

    public final void zzuy() {
        Bitmap zza = zzp.zzli().zza(Integer.valueOf(this.zzdop.zzdno.zzdoy.zzbow));
        if (zza != null) {
            zzayh.zzeaj.post(new zzk(this, zzp.zzkr().zza(this.zzdop.zzaas, zza, this.zzdop.zzdno.zzdoy.zzbou, this.zzdop.zzdno.zzdoy.zzbov)));
        }
    }
}
