package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
final class zzdql implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    private final Object lock = new Object();
    private boolean zzgib = false;
    private boolean zzgic = false;
    private final zzdrf zzhjg;
    private final zzdra zzhjh;

    zzdql(Context context, Looper looper, zzdra zzdra) {
        this.zzhjh = zzdra;
        this.zzhjg = new zzdrf(context, looper, this, this, 12800000);
    }

    /* access modifiers changed from: package-private */
    public final void zzavh() {
        synchronized (this.lock) {
            if (!this.zzgib) {
                this.zzgib = true;
                this.zzhjg.checkAvailabilityAndConnect();
            }
        }
    }

    private final void zzapl() {
        synchronized (this.lock) {
            if (this.zzhjg.isConnected() || this.zzhjg.isConnecting()) {
                this.zzhjg.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.lock) {
            if (!this.zzgic) {
                this.zzgic = true;
                try {
                    this.zzhjg.zzavt().zza(new zzdrd(this.zzhjh.toByteArray()));
                    zzapl();
                } catch (Exception e) {
                    zzapl();
                } catch (Throwable th) {
                    zzapl();
                    throw th;
                }
            }
        }
    }

    public final void onConnectionSuspended(int i) {
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
    }
}
