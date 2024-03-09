package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbux extends zzbxe<zzbuy> implements zzbtm, zzbuo {
    private final zzdkx zzflh;
    private AtomicBoolean zzftb = new AtomicBoolean();

    public zzbux(Set<zzbys<zzbuy>> set, zzdkx zzdkx) {
        super(set);
        this.zzflh = zzdkx;
    }

    public final void onAdImpression() {
        if (this.zzflh.zzhag == 2 || this.zzflh.zzhag == 5 || this.zzflh.zzhag == 4) {
            zzajm();
        }
    }

    public final void zzajl() {
        if (this.zzflh.zzhag == 1) {
            zzajm();
        }
    }

    private final void zzajm() {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxg)).booleanValue() && this.zzftb.compareAndSet(false, true) && this.zzflh.zzhbc != null && this.zzflh.zzhbc.type == 3) {
            zza(new zzbuw(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzbuy zzbuy) throws Exception {
        zzbuy.zzb(this.zzflh.zzhbc);
    }
}
