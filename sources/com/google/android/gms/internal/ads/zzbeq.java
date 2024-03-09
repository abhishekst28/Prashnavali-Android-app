package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbeq extends zzaxu {
    final zzbde zzefm;
    private final String zzefy;
    private final String[] zzefz;
    final zzbev zzekp;

    zzbeq(zzbde zzbde, zzbev zzbev, String str, String[] strArr) {
        this.zzefm = zzbde;
        this.zzekp = zzbev;
        this.zzefy = str;
        this.zzefz = strArr;
        zzp.zzll().zza(this);
    }

    public final void zzuy() {
        try {
            this.zzekp.zze(this.zzefy, this.zzefz);
        } finally {
            zzayh.zzeaj.post(new zzbet(this));
        }
    }
}
