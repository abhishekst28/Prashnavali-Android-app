package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdui;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
abstract class zzdus<OutputT> extends zzdui.zzj<OutputT> {
    private static final Logger zzhoi;
    private static final zzb zzhph;
    private volatile int remaining;
    /* access modifiers changed from: private */
    public volatile Set<Throwable> seenExceptions = null;

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    static abstract class zzb {
        private zzb() {
        }

        /* access modifiers changed from: package-private */
        public abstract void zza(zzdus zzdus, Set<Throwable> set, Set<Throwable> set2);

        /* access modifiers changed from: package-private */
        public abstract int zzc(zzdus zzdus);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    static final class zzc extends zzb {
        private zzc() {
            super();
        }

        /* access modifiers changed from: package-private */
        public final void zza(zzdus zzdus, Set<Throwable> set, Set<Throwable> set2) {
            synchronized (zzdus) {
                if (zzdus.seenExceptions == null) {
                    Set unused = zzdus.seenExceptions = set2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final int zzc(zzdus zzdus) {
            int zzb;
            synchronized (zzdus) {
                zzb = zzdus.zzb(zzdus);
            }
            return zzb;
        }
    }

    zzdus(int i) {
        this.remaining = i;
    }

    /* access modifiers changed from: package-private */
    public abstract void zzh(Set<Throwable> set);

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    static final class zza extends zzb {
        private final AtomicReferenceFieldUpdater<zzdus, Set<Throwable>> zzhpi;
        private final AtomicIntegerFieldUpdater<zzdus> zzhpj;

        zza(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.zzhpi = atomicReferenceFieldUpdater;
            this.zzhpj = atomicIntegerFieldUpdater;
        }

        /* access modifiers changed from: package-private */
        public final void zza(zzdus zzdus, Set<Throwable> set, Set<Throwable> set2) {
            this.zzhpi.compareAndSet(zzdus, (Object) null, set2);
        }

        /* access modifiers changed from: package-private */
        public final int zzc(zzdus zzdus) {
            return this.zzhpj.decrementAndGet(zzdus);
        }
    }

    /* access modifiers changed from: package-private */
    public final Set<Throwable> zzaxf() {
        Set<Throwable> set = this.seenExceptions;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzh(newSetFromMap);
        zzhph.zza(this, (Set<Throwable>) null, newSetFromMap);
        return this.seenExceptions;
    }

    /* access modifiers changed from: package-private */
    public final int zzaxg() {
        return zzhph.zzc(this);
    }

    /* access modifiers changed from: package-private */
    public final void zzaxh() {
        this.seenExceptions = null;
    }

    static /* synthetic */ int zzb(zzdus zzdus) {
        int i = zzdus.remaining - 1;
        zzdus.remaining = i;
        return i;
    }

    static {
        Throwable th;
        zzb zzb2;
        Class<zzdus> cls = zzdus.class;
        zzhoi = Logger.getLogger(cls.getName());
        try {
            zzb2 = new zza(AtomicReferenceFieldUpdater.newUpdater(cls, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(cls, "remaining"));
            th = null;
        } catch (Throwable th2) {
            zzb2 = new zzc();
            th = th2;
        }
        zzhph = zzb2;
        if (th != null) {
            zzhoi.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }
}
