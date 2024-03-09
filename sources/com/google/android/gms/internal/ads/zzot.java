package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzot {
    /* access modifiers changed from: private */
    public final ExecutorService zzbja;
    /* access modifiers changed from: private */
    public zzov<? extends zzoy> zzbjb;
    /* access modifiers changed from: private */
    public IOException zzbjc;

    public zzot(String str) {
        this.zzbja = zzpq.zzbi(str);
    }

    public final <T extends zzoy> long zza(T t, zzow<T> zzow, int i) {
        Looper myLooper = Looper.myLooper();
        zzoz.checkState(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzov(this, myLooper, t, zzow, i, elapsedRealtime).zzek(0);
        return elapsedRealtime;
    }

    public final boolean isLoading() {
        return this.zzbjb != null;
    }

    public final void zziq() {
        this.zzbjb.zzl(false);
    }

    public final void zza(Runnable runnable) {
        zzov<? extends zzoy> zzov = this.zzbjb;
        if (zzov != null) {
            zzov.zzl(true);
        }
        this.zzbja.execute(runnable);
        this.zzbja.shutdown();
    }

    public final void zzbj(int i) throws IOException {
        IOException iOException = this.zzbjc;
        if (iOException == null) {
            zzov<? extends zzoy> zzov = this.zzbjb;
            if (zzov != null) {
                zzov.zzbj(zzov.zzbjh);
                return;
            }
            return;
        }
        throw iOException;
    }
}
