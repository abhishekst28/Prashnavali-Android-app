package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
abstract class zzduk<I, O, F, T> extends zzdvf<O> implements Runnable {
    @NullableDecl
    private zzdvt<? extends I> zzhof;
    @NullableDecl
    private F zzhow;

    static <I, O> zzdvt<O> zza(zzdvt<I> zzdvt, zzduv<? super I, ? extends O> zzduv, Executor executor) {
        zzdsv.checkNotNull(executor);
        zzdun zzdun = new zzdun(zzdvt, zzduv);
        zzdvt.addListener(zzdun, zzdvv.zza(executor, zzdun));
        return zzdun;
    }

    /* access modifiers changed from: package-private */
    public abstract void setResult(@NullableDecl T t);

    /* access modifiers changed from: package-private */
    @NullableDecl
    public abstract T zzd(F f, @NullableDecl I i) throws Exception;

    static <I, O> zzdvt<O> zza(zzdvt<I> zzdvt, zzdsl<? super I, ? extends O> zzdsl, Executor executor) {
        zzdsv.checkNotNull(zzdsl);
        zzdum zzdum = new zzdum(zzdvt, zzdsl);
        zzdvt.addListener(zzdum, zzdvv.zza(executor, zzdum));
        return zzdum;
    }

    zzduk(zzdvt<? extends I> zzdvt, F f) {
        this.zzhof = (zzdvt) zzdsv.checkNotNull(zzdvt);
        this.zzhow = zzdsv.checkNotNull(f);
    }

    public final void run() {
        zzdvt<? extends I> zzdvt = this.zzhof;
        F f = this.zzhow;
        boolean z = true;
        boolean isCancelled = isCancelled() | (zzdvt == null);
        if (f != null) {
            z = false;
        }
        if (!isCancelled && !z) {
            this.zzhof = null;
            if (zzdvt.isCancelled()) {
                setFuture(zzdvt);
                return;
            }
            try {
                try {
                    Object zzd = zzd(f, zzdvl.zza(zzdvt));
                    this.zzhow = null;
                    setResult(zzd);
                } catch (Throwable th) {
                    this.zzhow = null;
                    throw th;
                }
            } catch (CancellationException e) {
                cancel(false);
            } catch (ExecutionException e2) {
                setException(e2.getCause());
            } catch (RuntimeException e3) {
                setException(e3);
            } catch (Error e4) {
                setException(e4);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void afterDone() {
        maybePropagateCancellationTo(this.zzhof);
        this.zzhof = null;
        this.zzhow = null;
    }

    /* access modifiers changed from: protected */
    public final String pendingToString() {
        String str;
        zzdvt<? extends I> zzdvt = this.zzhof;
        F f = this.zzhow;
        String pendingToString = super.pendingToString();
        if (zzdvt != null) {
            String valueOf = String.valueOf(zzdvt);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (f != null) {
            String valueOf2 = String.valueOf(f);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(valueOf2).length());
            sb2.append(str);
            sb2.append("function=[");
            sb2.append(valueOf2);
            sb2.append("]");
            return sb2.toString();
        } else if (pendingToString == null) {
            return null;
        } else {
            String valueOf3 = String.valueOf(str);
            String valueOf4 = String.valueOf(pendingToString);
            return valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
        }
    }
}
