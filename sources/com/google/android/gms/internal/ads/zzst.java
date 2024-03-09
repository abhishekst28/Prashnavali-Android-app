package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzst implements BaseGmsClient.BaseConnectionCallbacks {
    private final /* synthetic */ zzss zzbuu;

    zzst(zzss zzss) {
        this.zzbuu = zzss;
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zzbuu.lock) {
            try {
                if (this.zzbuu.zzbuw != null) {
                    zztb unused = this.zzbuu.zzbux = this.zzbuu.zzbuw.zzmx();
                }
            } catch (DeadObjectException e) {
                zzaxy.zzc("Unable to obtain a cache service instance.", e);
                this.zzbuu.disconnect();
            }
            this.zzbuu.lock.notifyAll();
        }
    }

    public final void onConnectionSuspended(int i) {
        synchronized (this.zzbuu.lock) {
            zztb unused = this.zzbuu.zzbux = null;
            this.zzbuu.lock.notifyAll();
        }
    }
}
