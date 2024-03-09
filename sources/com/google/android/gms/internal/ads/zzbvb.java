package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbvb extends zzbxe<zzbvf> {
    private final Clock zzbpw;
    private boolean zzfmt = false;
    private final ScheduledExecutorService zzfnh;
    private long zzfnj = -1;
    private long zzfnk = -1;
    private ScheduledFuture<?> zzftc;

    public zzbvb(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        super(Collections.emptySet());
        this.zzfnh = scheduledExecutorService;
        this.zzbpw = clock;
    }

    public final synchronized void onPause() {
        if (!this.zzfmt) {
            if (this.zzftc == null || this.zzftc.isCancelled()) {
                this.zzfnk = -1;
            } else {
                this.zzftc.cancel(true);
                this.zzfnk = this.zzfnj - this.zzbpw.elapsedRealtime();
            }
            this.zzfmt = true;
        }
    }

    public final synchronized void onResume() {
        if (this.zzfmt) {
            if (this.zzfnk > 0 && this.zzftc.isCancelled()) {
                zzfe(this.zzfnk);
            }
            this.zzfmt = false;
        }
    }

    public final synchronized void zzajn() {
        this.zzfmt = false;
        zzfe(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzdw(int r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            if (r7 > 0) goto L_0x0005
            monitor-exit(r6)
            return
        L_0x0005:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0044 }
            long r1 = (long) r7     // Catch:{ all -> 0x0044 }
            long r0 = r0.toMillis(r1)     // Catch:{ all -> 0x0044 }
            boolean r7 = r6.zzfmt     // Catch:{ all -> 0x0044 }
            if (r7 == 0) goto L_0x0026
            long r2 = r6.zzfnk     // Catch:{ all -> 0x0044 }
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x0020
            long r2 = r6.zzfnk     // Catch:{ all -> 0x0044 }
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            long r0 = r6.zzfnk     // Catch:{ all -> 0x0044 }
        L_0x0022:
            r6.zzfnk = r0     // Catch:{ all -> 0x0044 }
            monitor-exit(r6)
            return
        L_0x0026:
            com.google.android.gms.common.util.Clock r7 = r6.zzbpw     // Catch:{ all -> 0x0044 }
            long r2 = r7.elapsedRealtime()     // Catch:{ all -> 0x0044 }
            long r4 = r6.zzfnj     // Catch:{ all -> 0x0044 }
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x003f
            long r2 = r6.zzfnj     // Catch:{ all -> 0x0044 }
            com.google.android.gms.common.util.Clock r7 = r6.zzbpw     // Catch:{ all -> 0x0044 }
            long r4 = r7.elapsedRealtime()     // Catch:{ all -> 0x0044 }
            long r2 = r2 - r4
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x0042
        L_0x003f:
            r6.zzfe(r0)     // Catch:{ all -> 0x0044 }
        L_0x0042:
            monitor-exit(r6)
            return
        L_0x0044:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbvb.zzdw(int):void");
    }

    private final synchronized void zzfe(long j) {
        if (this.zzftc != null && !this.zzftc.isDone()) {
            this.zzftc.cancel(true);
        }
        this.zzfnj = this.zzbpw.elapsedRealtime() + j;
        this.zzftc = this.zzfnh.schedule(new zzbvc(this), j, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: private */
    public final void zzajo() {
        zza(zzbva.zzfst);
    }
}
