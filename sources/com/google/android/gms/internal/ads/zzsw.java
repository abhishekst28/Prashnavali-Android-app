package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzsw implements BaseGmsClient.BaseOnConnectionFailedListener {
    private final /* synthetic */ zzss zzbuu;

    zzsw(zzss zzss) {
        this.zzbuu = zzss;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zzbuu.lock) {
            zztb unused = this.zzbuu.zzbux = null;
            if (this.zzbuu.zzbuw != null) {
                zzsx unused2 = this.zzbuu.zzbuw = null;
            }
            this.zzbuu.lock.notifyAll();
        }
    }
}
