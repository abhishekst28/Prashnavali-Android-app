package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzelm<T> implements zzelo<T> {
    private zzelx<T> zzirc;

    public final T get() {
        zzelx<T> zzelx = this.zzirc;
        if (zzelx != null) {
            return zzelx.get();
        }
        throw new IllegalStateException();
    }

    public static <T> void zzbk(zzelx<T> zzelx, zzelx<T> zzelx2) {
        zzelu.checkNotNull(zzelx2);
        zzelm zzelm = (zzelm) zzelx;
        if (zzelm.zzirc == null) {
            zzelm.zzirc = zzelx2;
            return;
        }
        throw new IllegalStateException();
    }
}
