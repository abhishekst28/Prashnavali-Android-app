package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class zzfz extends zzfx {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzfz() {
        super();
    }

    /* access modifiers changed from: package-private */
    public final <L> List<L> zza(Object obj, long j) {
        return zza(obj, j, 10);
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Object obj, long j) {
        Object obj2;
        List list = (List) zzia.zzf(obj, j);
        if (list instanceof zzfu) {
            obj2 = ((zzfu) list).i_();
        } else if (!zza.isAssignableFrom(list.getClass())) {
            if (!(list instanceof zzgz) || !(list instanceof zzfk)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                zzfk zzfk = (zzfk) list;
                if (zzfk.zza()) {
                    zzfk.j_();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        zzia.zza(obj, j, obj2);
    }

    private static <L> List<L> zza(Object obj, long j, int i) {
        List<L> list;
        List<L> zzc = zzc(obj, j);
        if (zzc.isEmpty()) {
            if (zzc instanceof zzfu) {
                list = new zzfv(i);
            } else if (!(zzc instanceof zzgz) || !(zzc instanceof zzfk)) {
                list = new ArrayList<>(i);
            } else {
                list = ((zzfk) zzc).zza(i);
            }
            zzia.zza(obj, j, (Object) list);
            return list;
        } else if (zza.isAssignableFrom(zzc.getClass())) {
            ArrayList arrayList = new ArrayList(zzc.size() + i);
            arrayList.addAll(zzc);
            zzia.zza(obj, j, (Object) arrayList);
            return arrayList;
        } else if (zzc instanceof zzhz) {
            zzfv zzfv = new zzfv(zzc.size() + i);
            zzfv.addAll((zzhz) zzc);
            zzia.zza(obj, j, (Object) zzfv);
            return zzfv;
        } else if (!(zzc instanceof zzgz) || !(zzc instanceof zzfk)) {
            return zzc;
        } else {
            zzfk zzfk = (zzfk) zzc;
            if (zzfk.zza()) {
                return zzc;
            }
            zzfk zza2 = zzfk.zza(zzc.size() + i);
            zzia.zza(obj, j, (Object) zza2);
            return zza2;
        }
    }

    /* access modifiers changed from: package-private */
    public final <E> void zza(Object obj, Object obj2, long j) {
        List zzc = zzc(obj2, j);
        List zza2 = zza(obj, j, zzc.size());
        int size = zza2.size();
        int size2 = zzc.size();
        if (size > 0 && size2 > 0) {
            zza2.addAll(zzc);
        }
        if (size > 0) {
            zzc = zza2;
        }
        zzia.zza(obj, j, (Object) zzc);
    }

    private static <E> List<E> zzc(Object obj, long j) {
        return (List) zzia.zzf(obj, j);
    }
}
