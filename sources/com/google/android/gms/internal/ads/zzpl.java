package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzpl implements zzpd {
    private boolean started;
    private zzhu zzafd = zzhu.zzahv;
    private long zzbkf;
    private long zzbkg;

    public final void start() {
        if (!this.started) {
            this.zzbkg = SystemClock.elapsedRealtime();
            this.started = true;
        }
    }

    public final void stop() {
        if (this.started) {
            zzel(zzfx());
            this.started = false;
        }
    }

    public final void zzel(long j) {
        this.zzbkf = j;
        if (this.started) {
            this.zzbkg = SystemClock.elapsedRealtime();
        }
    }

    public final void zza(zzpd zzpd) {
        zzel(zzpd.zzfx());
        this.zzafd = zzpd.zzfq();
    }

    public final long zzfx() {
        long j = this.zzbkf;
        if (!this.started) {
            return j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzbkg;
        if (this.zzafd.zzahw == 1.0f) {
            return j + zzha.zzdn(elapsedRealtime);
        }
        return j + this.zzafd.zzdu(elapsedRealtime);
    }

    public final zzhu zzb(zzhu zzhu) {
        if (this.started) {
            zzel(zzfx());
        }
        this.zzafd = zzhu;
        return zzhu;
    }

    public final zzhu zzfq() {
        return this.zzafd;
    }
}
