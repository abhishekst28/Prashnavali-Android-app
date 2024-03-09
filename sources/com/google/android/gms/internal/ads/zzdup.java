package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
abstract class zzdup<InputT, OutputT> extends zzdus<OutputT> {
    private static final Logger logger = Logger.getLogger(zzdup.class.getName());
    /* access modifiers changed from: private */
    @NullableDecl
    public zzdtf<? extends zzdvt<? extends InputT>> zzhpa;
    private final boolean zzhpb;
    private final boolean zzhpc;

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    enum zza {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    zzdup(zzdtf<? extends zzdvt<? extends InputT>> zzdtf, boolean z, boolean z2) {
        super(zzdtf.size());
        this.zzhpa = (zzdtf) zzdsv.checkNotNull(zzdtf);
        this.zzhpb = z;
        this.zzhpc = z2;
    }

    /* access modifiers changed from: package-private */
    public abstract void zzaxe();

    /* access modifiers changed from: package-private */
    public abstract void zzb(int i, @NullableDecl InputT inputt);

    /* access modifiers changed from: protected */
    public final void afterDone() {
        super.afterDone();
        zzdtf<? extends zzdvt<? extends InputT>> zzdtf = this.zzhpa;
        zza(zza.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (zzdtf != null)) {
            boolean wasInterrupted = wasInterrupted();
            zzdub zzdub = (zzdub) zzdtf.iterator();
            while (zzdub.hasNext()) {
                ((Future) zzdub.next()).cancel(wasInterrupted);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final String pendingToString() {
        zzdtf<? extends zzdvt<? extends InputT>> zzdtf = this.zzhpa;
        if (zzdtf == null) {
            return super.pendingToString();
        }
        String valueOf = String.valueOf(zzdtf);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("futures=");
        sb.append(valueOf);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final void zzaxd() {
        if (this.zzhpa.isEmpty()) {
            zzaxe();
        } else if (this.zzhpb) {
            int i = 0;
            zzdub zzdub = (zzdub) this.zzhpa.iterator();
            while (zzdub.hasNext()) {
                zzdvt zzdvt = (zzdvt) zzdub.next();
                zzdvt.addListener(new zzduo(this, zzdvt, i), zzdva.INSTANCE);
                i++;
            }
        } else {
            zzduq zzduq = new zzduq(this, this.zzhpc ? this.zzhpa : null);
            zzdub zzdub2 = (zzdub) this.zzhpa.iterator();
            while (zzdub2.hasNext()) {
                ((zzdvt) zzdub2.next()).addListener(zzduq, zzdva.INSTANCE);
            }
        }
    }

    private final void zzj(Throwable th) {
        zzdsv.checkNotNull(th);
        if (this.zzhpb && !setException(th) && zza(zzaxf(), th)) {
            zzk(th);
        } else if (th instanceof Error) {
            zzk(th);
        }
    }

    private static void zzk(Throwable th) {
        String str;
        if (th instanceof Error) {
            str = "Input Future failed with Error";
        } else {
            str = "Got more than one input Future failure. Logging failures after the first";
        }
        logger.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", str, th);
    }

    /* access modifiers changed from: package-private */
    public final void zzh(Set<Throwable> set) {
        zzdsv.checkNotNull(set);
        if (!isCancelled()) {
            zza(set, zzaxa());
        }
    }

    /* access modifiers changed from: private */
    public final void zza(int i, Future<? extends InputT> future) {
        try {
            zzb(i, zzdvl.zza(future));
        } catch (ExecutionException e) {
            zzj(e.getCause());
        } catch (Throwable th) {
            zzj(th);
        }
    }

    /* access modifiers changed from: private */
    public final void zza(@NullableDecl zzdtf<? extends Future<? extends InputT>> zzdtf) {
        int zzaxg = zzaxg();
        int i = 0;
        if (!(zzaxg >= 0)) {
            throw new IllegalStateException(String.valueOf("Less than 0 remaining futures"));
        } else if (zzaxg == 0) {
            if (zzdtf != null) {
                zzdub zzdub = (zzdub) zzdtf.iterator();
                while (zzdub.hasNext()) {
                    Future future = (Future) zzdub.next();
                    if (!future.isCancelled()) {
                        zza(i, future);
                    }
                    i++;
                }
            }
            zzaxh();
            zzaxe();
            zza(zza.ALL_INPUT_FUTURES_PROCESSED);
        }
    }

    /* access modifiers changed from: package-private */
    public void zza(zza zza2) {
        zzdsv.checkNotNull(zza2);
        this.zzhpa = null;
    }

    private static boolean zza(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }
}
