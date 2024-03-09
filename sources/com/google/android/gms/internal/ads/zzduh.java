package com.google.android.gms.internal.ads;

import java.lang.Throwable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
abstract class zzduh<V, X extends Throwable, F, T> extends zzdvf<V> implements Runnable {
    @NullableDecl
    private zzdvt<? extends V> zzhof;
    @NullableDecl
    private Class<X> zzhog;
    @NullableDecl
    private F zzhoh;

    static <X extends Throwable, V> zzdvt<V> zza(zzdvt<? extends V> zzdvt, Class<X> cls, zzduv<? super X, ? extends V> zzduv, Executor executor) {
        zzdug zzdug = new zzdug(zzdvt, cls, zzduv);
        zzdvt.addListener(zzdug, zzdvv.zza(executor, zzdug));
        return zzdug;
    }

    /* access modifiers changed from: package-private */
    public abstract void setResult(@NullableDecl T t);

    /* access modifiers changed from: package-private */
    @NullableDecl
    public abstract T zza(F f, X x) throws Exception;

    zzduh(zzdvt<? extends V> zzdvt, Class<X> cls, F f) {
        this.zzhof = (zzdvt) zzdsv.checkNotNull(zzdvt);
        this.zzhog = (Class) zzdsv.checkNotNull(cls);
        this.zzhoh = zzdsv.checkNotNull(f);
    }

    public final void run() {
        Object obj;
        Throwable th;
        NullPointerException nullPointerException;
        zzdvt<? extends V> zzdvt = this.zzhof;
        Class<X> cls = this.zzhog;
        F f = this.zzhoh;
        boolean z = true;
        boolean z2 = (zzdvt == null) | (cls == null);
        if (f != null) {
            z = false;
        }
        if ((!z && !z2) && !isCancelled()) {
            this.zzhof = null;
            try {
                if (zzdvt instanceof zzdwo) {
                    th = zzdwn.zza((zzdwo) zzdvt);
                } else {
                    th = null;
                }
                if (th == null) {
                    obj = zzdvl.zza(zzdvt);
                } else {
                    obj = null;
                }
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    String valueOf = String.valueOf(zzdvt.getClass());
                    String valueOf2 = String.valueOf(e.getClass());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35 + String.valueOf(valueOf2).length());
                    sb.append("Future type ");
                    sb.append(valueOf);
                    sb.append(" threw ");
                    sb.append(valueOf2);
                    sb.append(" without a cause");
                    nullPointerException = new NullPointerException(sb.toString());
                } else {
                    nullPointerException = cause;
                }
                obj = null;
            } catch (Throwable th2) {
                th = th2;
                obj = null;
            }
            if (th == null) {
                set(obj);
            } else if (!cls.isInstance(th)) {
                setFuture(zzdvt);
            } else {
                try {
                    Object zza = zza(f, th);
                    this.zzhog = null;
                    this.zzhoh = null;
                    setResult(zza);
                } catch (Throwable th3) {
                    this.zzhog = null;
                    this.zzhoh = null;
                    throw th3;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final String pendingToString() {
        String str;
        zzdvt<? extends V> zzdvt = this.zzhof;
        Class<X> cls = this.zzhog;
        F f = this.zzhoh;
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
        if (cls != null && f != null) {
            String valueOf2 = String.valueOf(cls);
            String valueOf3 = String.valueOf(f);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 29 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
            sb2.append(str);
            sb2.append("exceptionType=[");
            sb2.append(valueOf2);
            sb2.append("], fallback=[");
            sb2.append(valueOf3);
            sb2.append("]");
            return sb2.toString();
        } else if (pendingToString == null) {
            return null;
        } else {
            String valueOf4 = String.valueOf(str);
            String valueOf5 = String.valueOf(pendingToString);
            return valueOf5.length() != 0 ? valueOf4.concat(valueOf5) : new String(valueOf4);
        }
    }

    /* access modifiers changed from: protected */
    public final void afterDone() {
        maybePropagateCancellationTo(this.zzhof);
        this.zzhof = null;
        this.zzhog = null;
        this.zzhoh = null;
    }
}
