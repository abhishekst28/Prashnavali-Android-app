package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
final class zzdtq<E> extends zzdtg<E> {
    static final zzdtg<Object> zzhnm = new zzdtq(new Object[0], 0);
    private final transient int size;
    private final transient Object[] zzhnn;

    zzdtq(Object[] objArr, int i) {
        this.zzhnn = objArr;
        this.size = i;
    }

    public final int size() {
        return this.size;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzaws() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzawo() {
        return this.zzhnn;
    }

    /* access modifiers changed from: package-private */
    public final int zzawp() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final int zzawq() {
        return this.size;
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzhnn, 0, objArr, i, this.size);
        return i + this.size;
    }

    public final E get(int i) {
        zzdsv.zzs(i, this.size);
        return this.zzhnn[i];
    }
}
