package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
final class zzdtu<K> extends zzdtn<K> {
    private final transient zzdtg<K> zzhnc;
    private final transient zzdtk<K, ?> zzhno;

    zzdtu(zzdtk<K, ?> zzdtk, zzdtg<K> zzdtg) {
        this.zzhno = zzdtk;
        this.zzhnc = zzdtg;
    }

    public final zzdub<K> zzawn() {
        return (zzdub) zzawr().iterator();
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        return zzawr().zza(objArr, i);
    }

    public final zzdtg<K> zzawr() {
        return this.zzhnc;
    }

    public final boolean contains(@NullableDecl Object obj) {
        return this.zzhno.get(obj) != null;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzaws() {
        return true;
    }

    public final int size() {
        return this.zzhno.size();
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
