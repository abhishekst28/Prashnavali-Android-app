package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class zzcmt extends Exception {
    private final int zzggv;

    public static zzuw zze(Throwable th) {
        if (th instanceof zzcmt) {
            return ((zzcmt) th).zzapd();
        }
        if (!(th instanceof zzazk)) {
            return zzdmb.zza(zzdmd.zzhco, (String) null, (zzuw) null);
        }
        zzazk zzazk = (zzazk) th;
        return new zzuw(zzazk.getErrorCode(), zzdsw.zzhi(zzazk.getMessage()), MobileAds.ERROR_DOMAIN, (zzuw) null);
    }

    public zzcmt(int i) {
        this.zzggv = i;
    }

    public zzcmt(int i, String str) {
        super(str);
        this.zzggv = i;
    }

    public zzcmt(int i, String str, Throwable th) {
        super(str, th);
        this.zzggv = i;
    }

    public final zzuw zzapd() {
        if (getMessage() == null) {
            return zzdmb.zza(this.zzggv, (String) null, (zzuw) null);
        }
        return zzdmb.zza(this.zzggv, getMessage(), (zzuw) null);
    }
}
