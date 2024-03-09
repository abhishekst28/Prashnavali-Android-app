package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzcf;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
final class zzdqh implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    private final String packageName;
    private final HandlerThread zzeci;
    private zzdrf zzhja;
    private final String zzhjb;
    private final LinkedBlockingQueue<zzcf.zza> zzhjc = new LinkedBlockingQueue<>();

    public zzdqh(Context context, String str, String str2) {
        this.packageName = str;
        this.zzhjb = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.zzeci = handlerThread;
        handlerThread.start();
        this.zzhja = new zzdrf(context, this.zzeci.getLooper(), this, this, 9200000);
        this.zzhja.checkAvailabilityAndConnect();
    }

    public final zzcf.zza zzee(int i) {
        zzcf.zza zza;
        try {
            zza = this.zzhjc.poll(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zza = null;
        }
        return zza == null ? zzavf() : zza;
    }

    private final zzdrm zzave() {
        try {
            return this.zzhja.zzavt();
        } catch (DeadObjectException | IllegalStateException e) {
            return null;
        }
    }

    public final void onConnectionSuspended(int i) {
        try {
            this.zzhjc.put(zzavf());
        } catch (InterruptedException e) {
        }
    }

    public final void onConnected(Bundle bundle) {
        zzdrm zzave = zzave();
        if (zzave != null) {
            try {
                this.zzhjc.put(zzave.zza(new zzdri(this.packageName, this.zzhjb)).zzavu());
                zzapl();
                this.zzeci.quit();
            } catch (Throwable th) {
                try {
                    this.zzhjc.put(zzavf());
                } catch (InterruptedException e) {
                } catch (Throwable th2) {
                    zzapl();
                    this.zzeci.quit();
                    throw th2;
                }
                zzapl();
                this.zzeci.quit();
            }
        }
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.zzhjc.put(zzavf());
        } catch (InterruptedException e) {
        }
    }

    private final void zzapl() {
        zzdrf zzdrf = this.zzhja;
        if (zzdrf == null) {
            return;
        }
        if (zzdrf.isConnected() || this.zzhja.isConnecting()) {
            this.zzhja.disconnect();
        }
    }

    private static zzcf.zza zzavf() {
        return (zzcf.zza) ((zzegp) zzcf.zza.zzaq().zzn(32768).zzbfx());
    }
}
