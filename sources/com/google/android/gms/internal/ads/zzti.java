package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzti implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zztg zzbvg;
    private final /* synthetic */ zzta zzbvm;
    private final /* synthetic */ zzbbq zzbvn;

    zzti(zztg zztg, zzta zzta, zzbbq zzbbq) {
        this.zzbvg = zztg;
        this.zzbvm = zzta;
        this.zzbvn = zzbbq;
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zzbvg.lock) {
            if (!this.zzbvg.zzbvh) {
                boolean unused = this.zzbvg.zzbvh = true;
                zzsx zzd = this.zzbvg.zzbuw;
                if (zzd != null) {
                    this.zzbvn.addListener(new zztk(this.zzbvn, zzbbi.zzedu.zzf(new zzth(this, zzd, this.zzbvm, this.zzbvn))), zzbbi.zzedz);
                }
            }
        }
    }

    public final void onConnectionSuspended(int i) {
    }
}
