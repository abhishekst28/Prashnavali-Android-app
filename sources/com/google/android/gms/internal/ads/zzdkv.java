package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdkv {
    private final Object lock = new Object();
    private final Clock zzbpw;
    private volatile long zzdyt = 0;
    private volatile int zzhad = zzdku.zzgzz;

    public zzdkv(Clock clock) {
        this.zzbpw = clock;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzr(int r5, int r6) {
        /*
            r4 = this;
            r4.zzasj()
            com.google.android.gms.common.util.Clock r0 = r4.zzbpw
            long r0 = r0.currentTimeMillis()
            java.lang.Object r2 = r4.lock
            monitor-enter(r2)
            int r3 = r4.zzhad     // Catch:{ all -> 0x001e }
            if (r3 == r5) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x001e }
            return
        L_0x0012:
            r4.zzhad = r6     // Catch:{ all -> 0x001e }
            int r5 = r4.zzhad     // Catch:{ all -> 0x001e }
            int r6 = com.google.android.gms.internal.ads.zzdku.zzhab     // Catch:{ all -> 0x001e }
            if (r5 != r6) goto L_0x001c
            r4.zzdyt = r0     // Catch:{ all -> 0x001e }
        L_0x001c:
            monitor-exit(r2)     // Catch:{ all -> 0x001e }
            return
        L_0x001e:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001e }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdkv.zzr(int, int):void");
    }

    private final void zzasj() {
        long currentTimeMillis = this.zzbpw.currentTimeMillis();
        synchronized (this.lock) {
            if (this.zzhad == zzdku.zzhab) {
                if (this.zzdyt + ((Long) zzwe.zzpu().zzd(zzaat.zzcvk)).longValue() <= currentTimeMillis) {
                    this.zzhad = zzdku.zzgzz;
                }
            }
        }
    }

    public final void zzbn(boolean z) {
        if (z) {
            zzr(zzdku.zzgzz, zzdku.zzhaa);
        } else {
            zzr(zzdku.zzhaa, zzdku.zzgzz);
        }
    }

    public final boolean zzask() {
        boolean z;
        synchronized (this.lock) {
            zzasj();
            z = this.zzhad == zzdku.zzhaa;
        }
        return z;
    }

    public final boolean zzasl() {
        boolean z;
        synchronized (this.lock) {
            zzasj();
            z = this.zzhad == zzdku.zzhab;
        }
        return z;
    }

    public final void zzwf() {
        zzr(zzdku.zzhaa, zzdku.zzhab);
    }
}
