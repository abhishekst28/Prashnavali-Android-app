package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzss {
    /* access modifiers changed from: private */
    public final Object lock = new Object();
    private final Runnable zzbuv = new zzsr(this);
    /* access modifiers changed from: private */
    public zzsx zzbuw;
    /* access modifiers changed from: private */
    public zztb zzbux;
    private Context zzvr;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void initialize(android.content.Context r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            android.content.Context r1 = r2.zzvr     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x000c:
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0048 }
            r2.zzvr = r3     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzaai<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.zzaat.zzcsn     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzaap r1 = com.google.android.gms.internal.ads.zzwe.zzpu()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.zzd(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0028
            r2.connect()     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x0028:
            com.google.android.gms.internal.ads.zzaai<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.zzaat.zzcsm     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzaap r1 = com.google.android.gms.internal.ads.zzwe.zzpu()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.zzd(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.zzsu r3 = new com.google.android.gms.internal.ads.zzsu     // Catch:{ all -> 0x0048 }
            r3.<init>(r2)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzrg r1 = com.google.android.gms.ads.internal.zzp.zzks()     // Catch:{ all -> 0x0048 }
            r1.zza(r3)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzss.initialize(android.content.Context):void");
    }

    public final void zzmt() {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcso)).booleanValue()) {
            synchronized (this.lock) {
                connect();
                zzp.zzkp();
                zzayh.zzeaj.removeCallbacks(this.zzbuv);
                zzp.zzkp();
                zzayh.zzeaj.postDelayed(this.zzbuv, ((Long) zzwe.zzpu().zzd(zzaat.zzcsp)).longValue());
            }
        }
    }

    public final zzsv zza(zzta zzta) {
        synchronized (this.lock) {
            if (this.zzbux == null) {
                zzsv zzsv = new zzsv();
                return zzsv;
            }
            try {
                zzsv zza = this.zzbux.zza(zzta);
                return zza;
            } catch (RemoteException e) {
                zzaxy.zzc("Unable to call into cache service.", e);
                return new zzsv();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void connect() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            android.content.Context r1 = r3.zzvr     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0021
            com.google.android.gms.internal.ads.zzsx r1 = r3.zzbuw     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0021
        L_0x000c:
            com.google.android.gms.internal.ads.zzst r1 = new com.google.android.gms.internal.ads.zzst     // Catch:{ all -> 0x0023 }
            r1.<init>(r3)     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.ads.zzsw r2 = new com.google.android.gms.internal.ads.zzsw     // Catch:{ all -> 0x0023 }
            r2.<init>(r3)     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.ads.zzsx r1 = r3.zza((com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks) r1, (com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener) r2)     // Catch:{ all -> 0x0023 }
            r3.zzbuw = r1     // Catch:{ all -> 0x0023 }
            r1.checkAvailabilityAndConnect()     // Catch:{ all -> 0x0023 }
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0023:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzss.connect():void");
    }

    private final synchronized zzsx zza(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzsx(this.zzvr, zzp.zzld().zzyf(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    /* access modifiers changed from: private */
    public final void disconnect() {
        synchronized (this.lock) {
            if (this.zzbuw != null) {
                if (this.zzbuw.isConnected() || this.zzbuw.isConnecting()) {
                    this.zzbuw.disconnect();
                }
                this.zzbuw = null;
                this.zzbux = null;
                Binder.flushPendingCommands();
            }
        }
    }
}
