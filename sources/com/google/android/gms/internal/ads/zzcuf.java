package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcuf {
    private final zzcli zzfns;
    private final zzcjd zzgdx;
    private final zzdlt zzgex;

    public zzcuf(zzdlt zzdlt, zzcjd zzcjd, zzcli zzcli) {
        this.zzgex = zzdlt;
        this.zzgdx = zzcjd;
        this.zzfns = zzcli;
    }

    public final void zza(zzdkz zzdkz, zzdkx zzdkx, int i, @Nullable zzcri zzcri, long j) {
        zzcje zzcje;
        zzclh zzq = this.zzfns.zzaor().zza(zzdkz).zzd(zzdkx).zzq("action", "adapter_status").zzq("adapter_l", String.valueOf(j));
        zzq.zzq("sc", Integer.toString(i));
        if (zzcri != null) {
            zzq.zzq("arec", Integer.toString(zzcri.zzapu().errorCode));
            String zzgu = this.zzgex.zzgu(zzcri.getMessage());
            if (zzgu != null) {
                zzq.zzq("areec", zzgu);
            }
        }
        zzcjd zzcjd = this.zzgdx;
        Iterator<String> it = zzdkx.zzhap.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzcje = null;
                break;
            }
            zzcje = zzcjd.zzgg(it.next());
            if (zzcje != null) {
                break;
            }
        }
        if (zzcje != null) {
            zzq.zzq("ancn", zzcje.zzdfe);
            if (zzcje.zzgdu != null) {
                zzq.zzq("adapter_v", zzcje.zzgdu.toString());
            }
            if (zzcje.zzgdv != null) {
                zzq.zzq("adapter_sv", zzcje.zzgdv.toString());
            }
        }
        zzq.zzaop();
    }
}
