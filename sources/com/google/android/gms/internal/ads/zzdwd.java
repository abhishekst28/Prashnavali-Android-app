package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzdwd<V> extends zzdvf<V> {
    /* access modifiers changed from: private */
    @NullableDecl
    public zzdvt<V> zzhqj;
    /* access modifiers changed from: private */
    @NullableDecl
    public ScheduledFuture<?> zzhqk;

    static <V> zzdvt<V> zzb(zzdvt<V> zzdvt, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzdwd zzdwd = new zzdwd(zzdvt);
        zzdwf zzdwf = new zzdwf(zzdwd);
        zzdwd.zzhqk = scheduledExecutorService.schedule(zzdwf, j, timeUnit);
        zzdvt.addListener(zzdwf, zzdva.INSTANCE);
        return zzdwd;
    }

    private zzdwd(zzdvt<V> zzdvt) {
        this.zzhqj = (zzdvt) zzdsv.checkNotNull(zzdvt);
    }

    /* access modifiers changed from: protected */
    public final String pendingToString() {
        zzdvt<V> zzdvt = this.zzhqj;
        ScheduledFuture<?> scheduledFuture = this.zzhqk;
        if (zzdvt == null) {
            return null;
        }
        String valueOf = String.valueOf(zzdvt);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("inputFuture=[");
        sb.append(valueOf);
        sb.append("]");
        String sb2 = sb.toString();
        if (scheduledFuture == null) {
            return sb2;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return sb2;
        }
        String valueOf2 = String.valueOf(sb2);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 43);
        sb3.append(valueOf2);
        sb3.append(", remaining delay=[");
        sb3.append(delay);
        sb3.append(" ms]");
        return sb3.toString();
    }

    /* access modifiers changed from: protected */
    public final void afterDone() {
        maybePropagateCancellationTo(this.zzhqj);
        ScheduledFuture<?> scheduledFuture = this.zzhqk;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zzhqj = null;
        this.zzhqk = null;
    }
}
