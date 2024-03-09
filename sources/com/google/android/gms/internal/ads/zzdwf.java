package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdwf<V> implements Runnable {
    @NullableDecl
    private zzdwd<V> zzhql;

    zzdwf(zzdwd<V> zzdwd) {
        this.zzhql = zzdwd;
    }

    public final void run() {
        zzdvt zza;
        String str;
        zzdwd<V> zzdwd = this.zzhql;
        if (zzdwd != null && (zza = zzdwd.zzhqj) != null) {
            this.zzhql = null;
            if (zza.isDone()) {
                zzdwd.setFuture(zza);
                return;
            }
            try {
                ScheduledFuture zzb = zzdwd.zzhqk;
                ScheduledFuture unused = zzdwd.zzhqk = null;
                str = "Timed out";
                if (zzb != null) {
                    long abs = Math.abs(zzb.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        String valueOf = String.valueOf(str);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 66);
                        sb.append(valueOf);
                        sb.append(" (timeout delayed by ");
                        sb.append(abs);
                        sb.append(" ms after scheduled time)");
                        str = sb.toString();
                    }
                }
                String valueOf2 = String.valueOf(str);
                String valueOf3 = String.valueOf(zza);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 2 + String.valueOf(valueOf3).length());
                sb2.append(valueOf2);
                sb2.append(": ");
                sb2.append(valueOf3);
                zzdwd.setException(new zzdwi(sb2.toString()));
                zza.cancel(true);
            } catch (Throwable th) {
                zza.cancel(true);
                throw th;
            }
        }
    }
}
