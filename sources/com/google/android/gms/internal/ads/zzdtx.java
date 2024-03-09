package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
final class zzdtx extends zzdtg<Object> {
    private final transient int offset;
    private final transient int size;
    private final transient Object[] zzhnp;

    zzdtx(Object[] objArr, int i, int i2) {
        this.zzhnp = objArr;
        this.offset = i;
        this.size = i2;
    }

    public final Object get(int i) {
        zzdsv.zzs(i, this.size);
        return this.zzhnp[(i * 2) + this.offset];
    }

    /* access modifiers changed from: package-private */
    public final boolean zzaws() {
        return true;
    }

    public final int size() {
        return this.size;
    }
}
