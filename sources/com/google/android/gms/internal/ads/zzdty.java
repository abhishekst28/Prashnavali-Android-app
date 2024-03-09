package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
final class zzdty<E> extends zzdtn<E> {
    private final transient E zzhnx;
    private transient int zzhny;

    zzdty(E e) {
        this.zzhnx = zzdsv.checkNotNull(e);
    }

    zzdty(E e, int i) {
        this.zzhnx = e;
        this.zzhny = i;
    }

    public final int size() {
        return 1;
    }

    public final boolean contains(Object obj) {
        return this.zzhnx.equals(obj);
    }

    public final zzdub<E> zzawn() {
        return new zzdtp(this.zzhnx);
    }

    /* access modifiers changed from: package-private */
    public final zzdtg<E> zzawz() {
        return zzdtg.zzac(this.zzhnx);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzaws() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        objArr[i] = this.zzhnx;
        return i + 1;
    }

    public final int hashCode() {
        int i = this.zzhny;
        if (i != 0) {
            return i;
        }
        int hashCode = this.zzhnx.hashCode();
        this.zzhny = hashCode;
        return hashCode;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzawy() {
        return this.zzhny != 0;
    }

    public final String toString() {
        String obj = this.zzhnx.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
