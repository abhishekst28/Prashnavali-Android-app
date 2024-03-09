package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zztm implements BaseGmsClient.BaseOnConnectionFailedListener {
    private final /* synthetic */ zztg zzbvg;
    private final /* synthetic */ zzbbq zzbvn;

    zztm(zztg zztg, zzbbq zzbbq) {
        this.zzbvg = zztg;
        this.zzbvn = zzbbq;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zzbvg.lock) {
            this.zzbvn.setException(new RuntimeException("Connection failed."));
        }
    }
}
