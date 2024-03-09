package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdje extends AdMetadataListener implements zzbsu, zzbsz, zzbti, zzbuj, zzbuy, zzdiw {
    private final zzdmt zzgxs;
    private final AtomicReference<AdMetadataListener> zzgzd = new AtomicReference<>();
    private final AtomicReference<zzaut> zzgze = new AtomicReference<>();
    private final AtomicReference<zzaum> zzgzf = new AtomicReference<>();
    private final AtomicReference<zzatt> zzgzg = new AtomicReference<>();
    private final AtomicReference<zzauu> zzgzh = new AtomicReference<>();
    private final AtomicReference<zzatk> zzgzi = new AtomicReference<>();
    private final AtomicReference<zzya> zzgzj = new AtomicReference<>();
    private zzdje zzgzk = null;

    public zzdje(zzdmt zzdmt) {
        this.zzgxs = zzdmt;
    }

    public static zzdje zzb(zzdje zzdje) {
        zzdje zzdje2 = new zzdje(zzdje.zzgxs);
        zzdje2.zzb((zzdiw) zzdje);
        return zzdje2;
    }

    public final void zzb(zzaut zzaut) {
        this.zzgze.set(zzaut);
    }

    public final void zzb(zzaum zzaum) {
        this.zzgzf.set(zzaum);
    }

    public final void zzb(zzauu zzauu) {
        this.zzgzh.set(zzauu);
    }

    public final void zza(AdMetadataListener adMetadataListener) {
        this.zzgzd.set(adMetadataListener);
    }

    public final void zzc(zzya zzya) {
        this.zzgzj.set(zzya);
    }

    @Deprecated
    public final void zzb(zzatt zzatt) {
        this.zzgzg.set(zzatt);
    }

    @Deprecated
    public final void zzb(zzatk zzatk) {
        this.zzgzi.set(zzatk);
    }

    public final void onAdLoaded() {
        zzdje zzdje = this;
        while (true) {
            zzdje zzdje2 = zzdje.zzgzk;
            if (zzdje2 != null) {
                zzdje = zzdje2;
            } else {
                zzdip.zza(zzdje.zzgze, zzdjh.zzgxx);
                zzdip.zza(zzdje.zzgzg, zzdjg.zzgxx);
                return;
            }
        }
    }

    public final void zzg(zzuw zzuw) {
        zzdje zzdje = this;
        while (true) {
            zzdje zzdje2 = zzdje.zzgzk;
            if (zzdje2 != null) {
                zzdje = zzdje2;
            } else {
                int i = zzuw.errorCode;
                zzdip.zza(zzdje.zzgze, new zzdjt(zzuw));
                zzdip.zza(zzdje.zzgze, new zzdjs(i));
                zzdip.zza(zzdje.zzgzg, new zzdjv(i));
                return;
            }
        }
    }

    public final void onAdOpened() {
        zzdje zzdje = this;
        while (true) {
            zzdje zzdje2 = zzdje.zzgzk;
            if (zzdje2 != null) {
                zzdje = zzdje2;
            } else {
                zzdip.zza(zzdje.zzgzf, zzdju.zzgxx);
                zzdip.zza(zzdje.zzgzg, zzdjx.zzgxx);
                return;
            }
        }
    }

    public final void onAdClosed() {
        zzdje zzdje = this;
        while (true) {
            zzdje zzdje2 = zzdje.zzgzk;
            if (zzdje2 != null) {
                zzdje = zzdje2;
            } else {
                zzdje.zzgxs.onAdClosed();
                zzdip.zza(zzdje.zzgzf, zzdjw.zzgxx);
                zzdip.zza(zzdje.zzgzg, zzdjz.zzgxx);
                return;
            }
        }
    }

    public final void onAdLeftApplication() {
        zzdje zzdje = this;
        while (true) {
            zzdje zzdje2 = zzdje.zzgzk;
            if (zzdje2 != null) {
                zzdje = zzdje2;
            } else {
                zzdip.zza(zzdje.zzgzg, zzdjy.zzgxx);
                return;
            }
        }
    }

    public final void onRewardedVideoStarted() {
        zzdje zzdje = this;
        while (true) {
            zzdje zzdje2 = zzdje.zzgzk;
            if (zzdje2 != null) {
                zzdje = zzdje2;
            } else {
                zzdip.zza(zzdje.zzgzg, zzdjj.zzgxx);
                return;
            }
        }
    }

    public final void zzb(zzatj zzatj, String str, String str2) {
        zzdje zzdje = this;
        while (true) {
            zzdje zzdje2 = zzdje.zzgzk;
            if (zzdje2 != null) {
                zzdje = zzdje2;
            } else {
                zzdip.zza(zzdje.zzgzf, new zzdji(zzatj));
                zzdip.zza(zzdje.zzgzh, new zzdjl(zzatj, str, str2));
                zzdip.zza(zzdje.zzgzg, new zzdjk(zzatj));
                zzdip.zza(zzdje.zzgzi, new zzdjn(zzatj, str, str2));
                return;
            }
        }
    }

    public final void onRewardedVideoCompleted() {
        zzdje zzdje = this;
        while (true) {
            zzdje zzdje2 = zzdje.zzgzk;
            if (zzdje2 != null) {
                zzdje = zzdje2;
            } else {
                zzdip.zza(zzdje.zzgzg, zzdjm.zzgxx);
                return;
            }
        }
    }

    public final void zzf(zzuw zzuw) {
        zzdje zzdje = this;
        while (true) {
            zzdje zzdje2 = zzdje.zzgzk;
            if (zzdje2 != null) {
                zzdje = zzdje2;
            } else {
                zzdip.zza(zzdje.zzgzf, new zzdjp(zzuw));
                zzdip.zza(zzdje.zzgzf, new zzdjo(zzuw));
                return;
            }
        }
    }

    public final void onAdMetadataChanged() {
        zzdje zzdje = this.zzgzk;
        if (zzdje != null) {
            zzdje.onAdMetadataChanged();
        } else {
            zzdip.zza(this.zzgzd, zzdjr.zzgxx);
        }
    }

    public final void zzb(zzvl zzvl) {
        zzdje zzdje = this;
        while (true) {
            zzdje zzdje2 = zzdje.zzgzk;
            if (zzdje2 != null) {
                zzdje = zzdje2;
            } else {
                zzdip.zza(zzdje.zzgzj, new zzdjq(zzvl));
                return;
            }
        }
    }

    public final void zzb(zzdiw zzdiw) {
        this.zzgzk = (zzdje) zzdiw;
    }
}
