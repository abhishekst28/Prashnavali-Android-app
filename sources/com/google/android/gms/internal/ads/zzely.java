package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzely<T> implements zzelx<T> {
    private static final Object zzira = new Object();
    private volatile Object zzecl = zzira;
    private volatile zzelx<T> zzirb;

    private zzely(zzelx<T> zzelx) {
        this.zzirb = zzelx;
    }

    public final T get() {
        T t = this.zzecl;
        if (t != zzira) {
            return t;
        }
        zzelx<T> zzelx = this.zzirb;
        if (zzelx == null) {
            return this.zzecl;
        }
        T t2 = zzelx.get();
        this.zzecl = t2;
        this.zzirb = null;
        return t2;
    }

    public static <P extends zzelx<T>, T> zzelx<T> zzas(P p) {
        if ((p instanceof zzely) || (p instanceof zzell)) {
            return p;
        }
        return new zzely((zzelx) zzelu.checkNotNull(p));
    }
}
