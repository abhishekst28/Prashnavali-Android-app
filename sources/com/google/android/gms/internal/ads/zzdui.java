package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class zzdui<V> extends zzdwo implements zzdvt<V> {
    /* access modifiers changed from: private */
    public static final boolean GENERATE_CANCELLATION_CAUSES;
    private static final Object NULL = new Object();
    private static final Logger zzhoi;
    /* access modifiers changed from: private */
    public static final zza zzhoj;
    /* access modifiers changed from: private */
    @NullableDecl
    public volatile zzd listeners;
    /* access modifiers changed from: private */
    @NullableDecl
    public volatile Object value;
    /* access modifiers changed from: private */
    @NullableDecl
    public volatile zzk waiters;

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    static abstract class zza {
        private zza() {
        }

        /* access modifiers changed from: package-private */
        public abstract void zza(zzk zzk, zzk zzk2);

        /* access modifiers changed from: package-private */
        public abstract void zza(zzk zzk, Thread thread);

        /* access modifiers changed from: package-private */
        public abstract boolean zza(zzdui<?> zzdui, zzd zzd, zzd zzd2);

        /* access modifiers changed from: package-private */
        public abstract boolean zza(zzdui<?> zzdui, zzk zzk, zzk zzk2);

        /* access modifiers changed from: package-private */
        public abstract boolean zza(zzdui<?> zzdui, Object obj, Object obj2);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    static final class zzb {
        static final zzb zzhok = new zzb(new Throwable("Failure occurred while trying to finish a future.") {
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable exception;

        zzb(Throwable th) {
            this.exception = (Throwable) zzdsv.checkNotNull(th);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    static final class zzd {
        static final zzd zzhon = new zzd((Runnable) null, (Executor) null);
        final Executor executor;
        @NullableDecl
        zzd next;
        final Runnable task;

        zzd(Runnable runnable, Executor executor2) {
            this.task = runnable;
            this.executor = executor2;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    interface zzg<V> extends zzdvt<V> {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    static final class zzh extends zza {
        private zzh() {
            super();
        }

        /* access modifiers changed from: package-private */
        public final void zza(zzk zzk, Thread thread) {
            zzk.thread = thread;
        }

        /* access modifiers changed from: package-private */
        public final void zza(zzk zzk, zzk zzk2) {
            zzk.next = zzk2;
        }

        /* access modifiers changed from: package-private */
        public final boolean zza(zzdui<?> zzdui, zzk zzk, zzk zzk2) {
            synchronized (zzdui) {
                if (zzdui.waiters != zzk) {
                    return false;
                }
                zzk unused = zzdui.waiters = zzk2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean zza(zzdui<?> zzdui, zzd zzd, zzd zzd2) {
            synchronized (zzdui) {
                if (zzdui.listeners != zzd) {
                    return false;
                }
                zzd unused = zzdui.listeners = zzd2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean zza(zzdui<?> zzdui, Object obj, Object obj2) {
            synchronized (zzdui) {
                if (zzdui.value != obj) {
                    return false;
                }
                Object unused = zzdui.value = obj2;
                return true;
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    static final class zzi extends zza {
        static final Unsafe zzhop;
        static final long zzhoq;
        static final long zzhor;
        static final long zzhos;
        static final long zzhot;
        static final long zzhou;

        private zzi() {
            super();
        }

        /* access modifiers changed from: package-private */
        public final void zza(zzk zzk, Thread thread) {
            zzhop.putObject(zzk, zzhot, thread);
        }

        /* access modifiers changed from: package-private */
        public final void zza(zzk zzk, zzk zzk2) {
            zzhop.putObject(zzk, zzhou, zzk2);
        }

        /* access modifiers changed from: package-private */
        public final boolean zza(zzdui<?> zzdui, zzk zzk, zzk zzk2) {
            return zzhop.compareAndSwapObject(zzdui, zzhor, zzk, zzk2);
        }

        /* access modifiers changed from: package-private */
        public final boolean zza(zzdui<?> zzdui, zzd zzd, zzd zzd2) {
            return zzhop.compareAndSwapObject(zzdui, zzhoq, zzd, zzd2);
        }

        /* access modifiers changed from: package-private */
        public final boolean zza(zzdui<?> zzdui, Object obj, Object obj2) {
            return zzhop.compareAndSwapObject(zzdui, zzhos, obj, obj2);
        }

        static {
            Unsafe unsafe;
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException e) {
                try {
                    unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() {
                        public /* synthetic */ Object run() throws Exception {
                            Class<Unsafe> cls = Unsafe.class;
                            for (Field field : cls.getDeclaredFields()) {
                                field.setAccessible(true);
                                Object obj = field.get((Object) null);
                                if (cls.isInstance(obj)) {
                                    return cls.cast(obj);
                                }
                            }
                            throw new NoSuchFieldError("the Unsafe");
                        }
                    });
                } catch (PrivilegedActionException e2) {
                    throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
                }
            }
            Class<zzdui> cls = zzdui.class;
            try {
                zzhor = unsafe.objectFieldOffset(cls.getDeclaredField("waiters"));
                zzhoq = unsafe.objectFieldOffset(cls.getDeclaredField("listeners"));
                zzhos = unsafe.objectFieldOffset(cls.getDeclaredField(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                zzhot = unsafe.objectFieldOffset(zzk.class.getDeclaredField("thread"));
                zzhou = unsafe.objectFieldOffset(zzk.class.getDeclaredField("next"));
                zzhop = unsafe;
            } catch (Exception e3) {
                zzdsy.zzh(e3);
                throw new RuntimeException(e3);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    static abstract class zzj<V> extends zzdui<V> implements zzg<V> {
        zzj() {
        }

        public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return zzdui.super.get(j, timeUnit);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    static final class zzk {
        static final zzk zzhov = new zzk(false);
        @NullableDecl
        volatile zzk next;
        @NullableDecl
        volatile Thread thread;

        private zzk(boolean z) {
        }

        zzk() {
            zzdui.zzhoj.zza(this, Thread.currentThread());
        }

        /* access modifiers changed from: package-private */
        public final void zzb(zzk zzk) {
            zzdui.zzhoj.zza(this, zzk);
        }
    }

    private final void zza(zzk zzk2) {
        zzk2.thread = null;
        while (true) {
            zzk zzk3 = this.waiters;
            if (zzk3 != zzk.zzhov) {
                zzk zzk4 = null;
                while (zzk3 != null) {
                    zzk zzk5 = zzk3.next;
                    if (zzk3.thread != null) {
                        zzk4 = zzk3;
                    } else if (zzk4 != null) {
                        zzk4.next = zzk5;
                        if (zzk4.thread == null) {
                        }
                    } else if (zzhoj.zza((zzdui<?>) this, zzk3, zzk5)) {
                    }
                    zzk3 = zzk5;
                }
                return;
            }
            return;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    static final class zzc {
        static final zzc zzhol;
        static final zzc zzhom;
        @NullableDecl
        final Throwable cause;
        final boolean wasInterrupted;

        zzc(boolean z, @NullableDecl Throwable th) {
            this.wasInterrupted = z;
            this.cause = th;
        }

        static {
            if (zzdui.GENERATE_CANCELLATION_CAUSES) {
                zzhom = null;
                zzhol = null;
                return;
            }
            zzhom = new zzc(false, (Throwable) null);
            zzhol = new zzc(true, (Throwable) null);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    static final class zze<V> implements Runnable {
        final zzdvt<? extends V> future;
        final zzdui<V> zzhoo;

        zze(zzdui<V> zzdui, zzdvt<? extends V> zzdvt) {
            this.zzhoo = zzdui;
            this.future = zzdvt;
        }

        public final void run() {
            if (this.zzhoo.value == this) {
                if (zzdui.zzhoj.zza((zzdui<?>) this.zzhoo, (Object) this, zzdui.getFutureValue(this.future))) {
                    zzdui.zza((zzdui<?>) this.zzhoo);
                }
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    static final class zzf extends zza {
        final AtomicReferenceFieldUpdater<zzdui, zzd> listenersUpdater;
        final AtomicReferenceFieldUpdater<zzdui, Object> valueUpdater;
        final AtomicReferenceFieldUpdater<zzk, zzk> waiterNextUpdater;
        final AtomicReferenceFieldUpdater<zzk, Thread> waiterThreadUpdater;
        final AtomicReferenceFieldUpdater<zzdui, zzk> waitersUpdater;

        zzf(AtomicReferenceFieldUpdater<zzk, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<zzk, zzk> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<zzdui, zzk> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<zzdui, zzd> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<zzdui, Object> atomicReferenceFieldUpdater5) {
            super();
            this.waiterThreadUpdater = atomicReferenceFieldUpdater;
            this.waiterNextUpdater = atomicReferenceFieldUpdater2;
            this.waitersUpdater = atomicReferenceFieldUpdater3;
            this.listenersUpdater = atomicReferenceFieldUpdater4;
            this.valueUpdater = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        public final void zza(zzk zzk, Thread thread) {
            this.waiterThreadUpdater.lazySet(zzk, thread);
        }

        /* access modifiers changed from: package-private */
        public final void zza(zzk zzk, zzk zzk2) {
            this.waiterNextUpdater.lazySet(zzk, zzk2);
        }

        /* access modifiers changed from: package-private */
        public final boolean zza(zzdui<?> zzdui, zzk zzk, zzk zzk2) {
            return this.waitersUpdater.compareAndSet(zzdui, zzk, zzk2);
        }

        /* access modifiers changed from: package-private */
        public final boolean zza(zzdui<?> zzdui, zzd zzd, zzd zzd2) {
            return this.listenersUpdater.compareAndSet(zzdui, zzd, zzd2);
        }

        /* access modifiers changed from: package-private */
        public final boolean zza(zzdui<?> zzdui, Object obj, Object obj2) {
            return this.valueUpdater.compareAndSet(zzdui, obj, obj2);
        }
    }

    protected zzdui() {
    }

    public V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            if ((obj != null) && (!(obj instanceof zze))) {
                return zzae(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                zzk zzk2 = this.waiters;
                if (zzk2 != zzk.zzhov) {
                    zzk zzk3 = new zzk();
                    do {
                        zzk3.zzb(zzk2);
                        if (zzhoj.zza((zzdui<?>) this, zzk2, zzk3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) && (!(obj2 instanceof zze))) {
                                        return zzae(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    zza(zzk3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            zza(zzk3);
                        } else {
                            zzk2 = this.waiters;
                        }
                    } while (zzk2 != zzk.zzhov);
                }
                return zzae(this.value);
            }
            while (nanos > 0) {
                Object obj3 = this.value;
                if ((obj3 != null) && (!(obj3 instanceof zze))) {
                    return zzae(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String zzdui = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String lowerCase2 = timeUnit.toString().toLowerCase(Locale.ROOT);
            StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb.append("Waited ");
            sb.append(j2);
            sb.append(" ");
            sb.append(lowerCase2);
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                String concat = String.valueOf(sb2).concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                int i = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z = i == 0 || nanos2 > 1000;
                if (i > 0) {
                    String valueOf = String.valueOf(concat);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(lowerCase).length());
                    sb3.append(valueOf);
                    sb3.append(convert);
                    sb3.append(" ");
                    sb3.append(lowerCase);
                    String sb4 = sb3.toString();
                    if (z) {
                        sb4 = String.valueOf(sb4).concat(",");
                    }
                    concat = String.valueOf(sb4).concat(" ");
                }
                if (z) {
                    String valueOf2 = String.valueOf(concat);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
                    sb5.append(valueOf2);
                    sb5.append(nanos2);
                    sb5.append(" nanoseconds ");
                    concat = sb5.toString();
                }
                sb2 = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(sb2).concat(" but future completed as timeout expired"));
            }
            StringBuilder sb6 = new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(zzdui).length());
            sb6.append(sb2);
            sb6.append(" for ");
            sb6.append(zzdui);
            throw new TimeoutException(sb6.toString());
        }
        throw new InterruptedException();
    }

    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) && (!(obj2 instanceof zze))) {
                return zzae(obj2);
            }
            zzk zzk2 = this.waiters;
            if (zzk2 != zzk.zzhov) {
                zzk zzk3 = new zzk();
                do {
                    zzk3.zzb(zzk2);
                    if (zzhoj.zza((zzdui<?>) this, zzk2, zzk3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                zza(zzk3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof zze))));
                        return zzae(obj);
                    }
                    zzk2 = this.waiters;
                } while (zzk2 != zzk.zzhov);
            }
            return zzae(this.value);
        }
        throw new InterruptedException();
    }

    private static V zzae(Object obj) throws ExecutionException {
        if (obj instanceof zzc) {
            Throwable th = ((zzc) obj).cause;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof zzb) {
            throw new ExecutionException(((zzb) obj).exception);
        } else if (obj == NULL) {
            return null;
        } else {
            return obj;
        }
    }

    public boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof zze)) & (obj != null);
    }

    public boolean isCancelled() {
        return this.value instanceof zzc;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.zzdvt, com.google.android.gms.internal.ads.zzdvt<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.value
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0009
            r3 = 1
            goto L_0x000a
        L_0x0009:
            r3 = 0
        L_0x000a:
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzdui.zze
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0065
            boolean r3 = GENERATE_CANCELLATION_CAUSES
            if (r3 == 0) goto L_0x0020
            com.google.android.gms.internal.ads.zzdui$zzc r3 = new com.google.android.gms.internal.ads.zzdui$zzc
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0027
        L_0x0020:
            if (r8 == 0) goto L_0x0025
            com.google.android.gms.internal.ads.zzdui$zzc r3 = com.google.android.gms.internal.ads.zzdui.zzc.zzhol
            goto L_0x0027
        L_0x0025:
            com.google.android.gms.internal.ads.zzdui$zzc r3 = com.google.android.gms.internal.ads.zzdui.zzc.zzhom
        L_0x0027:
            r5 = 0
            r4 = r7
        L_0x0029:
            com.google.android.gms.internal.ads.zzdui$zza r6 = zzhoj
            boolean r6 = r6.zza((com.google.android.gms.internal.ads.zzdui<?>) r4, (java.lang.Object) r0, (java.lang.Object) r3)
            if (r6 == 0) goto L_0x005d
            if (r8 == 0) goto L_0x0037
            r4.interruptTask()
        L_0x0037:
            zza((com.google.android.gms.internal.ads.zzdui<?>) r4)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzdui.zze
            if (r4 == 0) goto L_0x0066
            com.google.android.gms.internal.ads.zzdui$zze r0 = (com.google.android.gms.internal.ads.zzdui.zze) r0
            com.google.android.gms.internal.ads.zzdvt<? extends V> r0 = r0.future
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzdui.zzg
            if (r4 == 0) goto L_0x0059
            r4 = r0
            com.google.android.gms.internal.ads.zzdui r4 = (com.google.android.gms.internal.ads.zzdui) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L_0x004f
            r5 = 1
            goto L_0x0050
        L_0x004f:
            r5 = 0
        L_0x0050:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzdui.zze
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0058
            r5 = 1
            goto L_0x0029
        L_0x0058:
            goto L_0x0066
        L_0x0059:
            r0.cancel(r8)
            goto L_0x0066
        L_0x005d:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzdui.zze
            if (r6 != 0) goto L_0x0029
            r1 = r5
            goto L_0x0066
        L_0x0065:
            r1 = 0
        L_0x0066:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdui.cancel(boolean):boolean");
    }

    /* access modifiers changed from: protected */
    public void interruptTask() {
    }

    /* access modifiers changed from: protected */
    public final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof zzc) && ((zzc) obj).wasInterrupted;
    }

    public void addListener(Runnable runnable, Executor executor) {
        zzd zzd2;
        zzdsv.checkNotNull(runnable, "Runnable was null.");
        zzdsv.checkNotNull(executor, "Executor was null.");
        if (isDone() || (zzd2 = this.listeners) == zzd.zzhon) {
            zza(runnable, executor);
        }
        zzd zzd3 = new zzd(runnable, executor);
        do {
            zzd3.next = zzd2;
            if (!zzhoj.zza((zzdui<?>) this, zzd2, zzd3)) {
                zzd2 = this.listeners;
            } else {
                return;
            }
        } while (zzd2 != zzd.zzhon);
        zza(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public boolean set(@NullableDecl V v) {
        if (v == null) {
            v = NULL;
        }
        if (!zzhoj.zza((zzdui<?>) this, (Object) null, (Object) v)) {
            return false;
        }
        zza((zzdui<?>) this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean setException(Throwable th) {
        if (!zzhoj.zza((zzdui<?>) this, (Object) null, (Object) new zzb((Throwable) zzdsv.checkNotNull(th)))) {
            return false;
        }
        zza((zzdui<?>) this);
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean setFuture(zzdvt<? extends V> zzdvt) {
        zze zze2;
        zzb zzb2;
        zzdsv.checkNotNull(zzdvt);
        Object obj = this.value;
        if (obj == null) {
            if (zzdvt.isDone()) {
                if (!zzhoj.zza((zzdui<?>) this, (Object) null, getFutureValue(zzdvt))) {
                    return false;
                }
                zza((zzdui<?>) this);
                return true;
            }
            zze2 = new zze(this, zzdvt);
            if (zzhoj.zza((zzdui<?>) this, (Object) null, (Object) zze2)) {
                try {
                    zzdvt.addListener(zze2, zzdva.INSTANCE);
                } catch (Throwable th) {
                    zzb2 = zzb.zzhok;
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof zzc) {
            zzdvt.cancel(((zzc) obj).wasInterrupted);
        }
        return false;
        zzhoj.zza((zzdui<?>) this, (Object) zze2, (Object) zzb2);
        return true;
    }

    /* access modifiers changed from: private */
    public static Object getFutureValue(zzdvt<?> zzdvt) {
        Throwable zza2;
        if (zzdvt instanceof zzg) {
            Object obj = ((zzdui) zzdvt).value;
            if (!(obj instanceof zzc)) {
                return obj;
            }
            zzc zzc2 = (zzc) obj;
            if (!zzc2.wasInterrupted) {
                return obj;
            }
            if (zzc2.cause != null) {
                return new zzc(false, zzc2.cause);
            }
            return zzc.zzhom;
        } else if ((zzdvt instanceof zzdwo) && (zza2 = zzdwn.zza((zzdwo) zzdvt)) != null) {
            return new zzb(zza2);
        } else {
            boolean isCancelled = zzdvt.isCancelled();
            if ((!GENERATE_CANCELLATION_CAUSES) && isCancelled) {
                return zzc.zzhom;
            }
            try {
                Object uninterruptibly = getUninterruptibly(zzdvt);
                if (!isCancelled) {
                    return uninterruptibly == null ? NULL : uninterruptibly;
                }
                String valueOf = String.valueOf(zzdvt);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(valueOf);
                return new zzc(false, new IllegalArgumentException(sb.toString()));
            } catch (ExecutionException e) {
                if (!isCancelled) {
                    return new zzb(e.getCause());
                }
                String valueOf2 = String.valueOf(zzdvt);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 84);
                sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb2.append(valueOf2);
                return new zzc(false, new IllegalArgumentException(sb2.toString(), e));
            } catch (CancellationException e2) {
                if (isCancelled) {
                    return new zzc(false, e2);
                }
                String valueOf3 = String.valueOf(zzdvt);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 77);
                sb3.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                sb3.append(valueOf3);
                return new zzb(new IllegalArgumentException(sb3.toString(), e2));
            } catch (Throwable th) {
                return new zzb(th);
            }
        }
    }

    private static <V> V getUninterruptibly(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException e) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* access modifiers changed from: private */
    public static void zza(zzdui<?> zzdui) {
        zzdui<V> zzdui2;
        zzd zzd2;
        zzd zzd3 = null;
        zzdui<?> zzdui3 = zzdui;
        while (true) {
            zzk zzk2 = zzdui3.waiters;
            if (zzhoj.zza(zzdui3, zzk2, zzk.zzhov)) {
                while (zzk2 != null) {
                    Thread thread = zzk2.thread;
                    if (thread != null) {
                        zzk2.thread = null;
                        LockSupport.unpark(thread);
                    }
                    zzk2 = zzk2.next;
                }
                zzdui3.afterDone();
                do {
                    zzd2 = zzdui3.listeners;
                } while (!zzhoj.zza(zzdui3, zzd2, zzd.zzhon));
                zzd zzd4 = zzd3;
                zzd zzd5 = zzd2;
                while (zzd5 != null) {
                    zzd zzd6 = zzd5.next;
                    zzd5.next = zzd4;
                    zzd4 = zzd5;
                    zzd5 = zzd6;
                }
                while (zzd4 != null) {
                    zzd3 = zzd4.next;
                    Runnable runnable = zzd4.task;
                    if (runnable instanceof zze) {
                        zze zze2 = (zze) runnable;
                        zzdui<V> zzdui4 = zze2.zzhoo;
                        if (zzdui4.value == zze2) {
                            if (zzhoj.zza((zzdui<?>) zzdui4, (Object) zze2, getFutureValue(zze2.future))) {
                                zzdui2 = zzdui4;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        zza(runnable, zzd4.executor);
                    }
                    zzd4 = zzd3;
                }
                return;
            }
            zzdui2 = zzdui3;
            zzdui3 = zzdui2;
        }
    }

    /* access modifiers changed from: protected */
    public void afterDone() {
    }

    /* access modifiers changed from: protected */
    @NullableDecl
    public final Throwable zzaxa() {
        if (!(this instanceof zzg)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof zzb) {
            return ((zzb) obj).exception;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void maybePropagateCancellationTo(@NullableDecl Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zza(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.value;
            if (obj instanceof zze) {
                sb.append(", setFuture=[");
                zza(sb, (Object) ((zze) obj).future);
                sb.append("]");
            } else {
                try {
                    str = zzdsw.emptyToNull(pendingToString());
                } catch (RuntimeException | StackOverflowError e) {
                    String valueOf = String.valueOf(e.getClass());
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 38);
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(valueOf);
                    str = sb2.toString();
                }
                if (str != null) {
                    sb.append(", info=[");
                    sb.append(str);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                zza(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    @NullableDecl
    public String pendingToString() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    private final void zza(StringBuilder sb) {
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb.append("SUCCESS, result=[");
            zza(sb, uninterruptibly);
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException e2) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private final void zza(StringBuilder sb, Object obj) {
        if (obj == this) {
            try {
                sb.append("this future");
            } catch (RuntimeException | StackOverflowError e) {
                sb.append("Exception thrown from implementation: ");
                sb.append(e.getClass());
            }
        } else {
            sb.append(obj);
        }
    }

    private static void zza(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = zzhoi;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), e);
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        zza zza2;
        Class<zzdui> cls = zzdui.class;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException e) {
            z = false;
        }
        GENERATE_CANCELLATION_CAUSES = z;
        zzhoi = Logger.getLogger(cls.getName());
        try {
            zza2 = new zzi();
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            th = th3;
            th2 = th;
            zza2 = new zzh();
        }
        zzhoj = zza2;
        if (th != null) {
            zzhoi.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            zzhoi.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }
}
