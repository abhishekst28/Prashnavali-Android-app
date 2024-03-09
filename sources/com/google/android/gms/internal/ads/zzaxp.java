package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzaxp {
    private final Object lock;
    private volatile int zzdys;
    private volatile long zzdyt;

    private zzaxp() {
        this.lock = new Object();
        this.zzdys = zzaxo.zzdyo;
        this.zzdyt = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzwf() {
        /*
            r7 = this;
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzp.zzkw()
            long r0 = r0.currentTimeMillis()
            java.lang.Object r2 = r7.lock
            monitor-enter(r2)
            int r3 = r7.zzdys     // Catch:{ all -> 0x0052 }
            int r4 = com.google.android.gms.internal.ads.zzaxo.zzdyq     // Catch:{ all -> 0x0052 }
            if (r3 != r4) goto L_0x002f
            long r3 = r7.zzdyt     // Catch:{ all -> 0x0052 }
            com.google.android.gms.internal.ads.zzaai<java.lang.Long> r5 = com.google.android.gms.internal.ads.zzaat.zzcvk     // Catch:{ all -> 0x0052 }
            com.google.android.gms.internal.ads.zzaap r6 = com.google.android.gms.internal.ads.zzwe.zzpu()     // Catch:{ all -> 0x0052 }
            java.lang.Object r5 = r6.zzd(r5)     // Catch:{ all -> 0x0052 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x0052 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0052 }
            long r3 = r3 + r5
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 > 0) goto L_0x002f
            int r0 = com.google.android.gms.internal.ads.zzaxo.zzdyo     // Catch:{ all -> 0x0052 }
            r7.zzdys = r0     // Catch:{ all -> 0x0052 }
        L_0x002f:
            monitor-exit(r2)     // Catch:{ all -> 0x0052 }
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzp.zzkw()
            long r0 = r0.currentTimeMillis()
            java.lang.Object r3 = r7.lock
            monitor-enter(r3)
            int r2 = r7.zzdys     // Catch:{ all -> 0x004f }
            r4 = 2
            if (r2 == r4) goto L_0x0042
            monitor-exit(r3)     // Catch:{ all -> 0x004f }
            return
        L_0x0042:
            r2 = 3
            r7.zzdys = r2     // Catch:{ all -> 0x004f }
            int r2 = r7.zzdys     // Catch:{ all -> 0x004f }
            int r4 = com.google.android.gms.internal.ads.zzaxo.zzdyq     // Catch:{ all -> 0x004f }
            if (r2 != r4) goto L_0x004d
            r7.zzdyt = r0     // Catch:{ all -> 0x004f }
        L_0x004d:
            monitor-exit(r3)     // Catch:{ all -> 0x004f }
            return
        L_0x004f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004f }
            throw r0
        L_0x0052:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0052 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaxp.zzwf():void");
    }

    /* synthetic */ zzaxp(zzaxm zzaxm) {
        this();
    }
}
