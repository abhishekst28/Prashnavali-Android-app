package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdht implements zzbsz, zzbuo, zzdiw {
    private final zzdmt zzgxs;
    private final AtomicReference<zzsi> zzgxt = new AtomicReference<>();
    private final AtomicReference<zzsj> zzgxu = new AtomicReference<>();
    private final AtomicReference<zzbuo> zzgxv = new AtomicReference<>();
    private zzdht zzgxw = null;

    public zzdht(zzdmt zzdmt) {
        this.zzgxs = zzdmt;
    }

    public static zzdht zzb(zzdht zzdht) {
        zzdht zzdht2 = new zzdht(zzdht.zzgxs);
        zzdht2.zzb((zzdiw) zzdht);
        return zzdht2;
    }

    public final void zzb(zzsi zzsi) {
        this.zzgxt.set(zzsi);
    }

    public final void zzb(zzsj zzsj) {
        this.zzgxu.set(zzsj);
    }

    public final void zza(zzbuo zzbuo) {
        this.zzgxv.set(zzbuo);
    }

    public final void zzb(zzsd zzsd) {
        zzdht zzdht = this;
        while (true) {
            zzdht zzdht2 = zzdht.zzgxw;
            if (zzdht2 != null) {
                zzdht = zzdht2;
            } else {
                zzdip.zza(zzdht.zzgxt, new zzdhs(zzsd));
                return;
            }
        }
    }

    public final void zzg(zzuw zzuw) {
        zzdht zzdht = this;
        while (true) {
            zzdht zzdht2 = zzdht.zzgxw;
            if (zzdht2 != null) {
                zzdht = zzdht2;
            } else {
                zzdip.zza(zzdht.zzgxt, new zzdhv(zzuw));
                zzdip.zza(zzdht.zzgxt, new zzdhu(zzuw));
                return;
            }
        }
    }

    public final void onAdClosed() {
        zzdht zzdht = this;
        while (true) {
            zzdht zzdht2 = zzdht.zzgxw;
            if (zzdht2 != null) {
                zzdht = zzdht2;
            } else {
                zzdht.zzgxs.onAdClosed();
                zzdip.zza(zzdht.zzgxu, zzdhx.zzgxx);
                return;
            }
        }
    }

    public final void zzajl() {
        zzdht zzdht = this;
        while (true) {
            zzdht zzdht2 = zzdht.zzgxw;
            if (zzdht2 != null) {
                zzdht = zzdht2;
            } else {
                zzdip.zza(zzdht.zzgxv, zzdhw.zzgxx);
                return;
            }
        }
    }

    public final void zzb(zzdiw zzdiw) {
        this.zzgxw = (zzdht) zzdiw;
    }
}
