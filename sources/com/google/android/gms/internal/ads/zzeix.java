package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzeix {
    private static final Class<?> zzijo = zzbho();
    private static final zzejn<?, ?> zzijp = zzbv(false);
    private static final zzejn<?, ?> zzijq = zzbv(true);
    private static final zzejn<?, ?> zzijr = new zzejp();

    public static void zzi(Class<?> cls) {
        Class<?> cls2;
        if (!zzegp.class.isAssignableFrom(cls) && (cls2 = zzijo) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zza(int i, List<Double> list, zzekk zzekk, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzekk.zzg(i, list, z);
        }
    }

    public static void zzb(int i, List<Float> list, zzekk zzekk, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzekk.zzf(i, list, z);
        }
    }

    public static void zzc(int i, List<Long> list, zzekk zzekk, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzekk.zzc(i, list, z);
        }
    }

    public static void zzd(int i, List<Long> list, zzekk zzekk, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzekk.zzd(i, list, z);
        }
    }

    public static void zze(int i, List<Long> list, zzekk zzekk, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzekk.zzn(i, list, z);
        }
    }

    public static void zzf(int i, List<Long> list, zzekk zzekk, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzekk.zze(i, list, z);
        }
    }

    public static void zzg(int i, List<Long> list, zzekk zzekk, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzekk.zzl(i, list, z);
        }
    }

    public static void zzh(int i, List<Integer> list, zzekk zzekk, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzekk.zza(i, list, z);
        }
    }

    public static void zzi(int i, List<Integer> list, zzekk zzekk, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzekk.zzj(i, list, z);
        }
    }

    public static void zzj(int i, List<Integer> list, zzekk zzekk, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzekk.zzm(i, list, z);
        }
    }

    public static void zzk(int i, List<Integer> list, zzekk zzekk, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzekk.zzb(i, list, z);
        }
    }

    public static void zzl(int i, List<Integer> list, zzekk zzekk, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzekk.zzk(i, list, z);
        }
    }

    public static void zzm(int i, List<Integer> list, zzekk zzekk, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzekk.zzh(i, list, z);
        }
    }

    public static void zzn(int i, List<Boolean> list, zzekk zzekk, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzekk.zzi(i, list, z);
        }
    }

    public static void zza(int i, List<String> list, zzekk zzekk) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzekk.zza(i, list);
        }
    }

    public static void zzb(int i, List<zzeff> list, zzekk zzekk) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzekk.zzb(i, list);
        }
    }

    public static void zza(int i, List<?> list, zzekk zzekk, zzeiv zzeiv) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzekk.zza(i, list, zzeiv);
        }
    }

    public static void zzb(int i, List<?> list, zzekk zzekk, zzeiv zzeiv) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzekk.zzb(i, list, zzeiv);
        }
    }

    static int zzaa(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzehn) {
            zzehn zzehn = (zzehn) list;
            i = 0;
            while (i2 < size) {
                i += zzefz.zzfl(zzehn.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzefz.zzfl(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzo(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzaa(list) + (list.size() * zzefz.zzgq(i));
    }

    static int zzab(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzehn) {
            zzehn zzehn = (zzehn) list;
            i = 0;
            while (i2 < size) {
                i += zzefz.zzfm(zzehn.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzefz.zzfm(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzp(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzab(list) + (size * zzefz.zzgq(i));
    }

    static int zzac(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzehn) {
            zzehn zzehn = (zzehn) list;
            i = 0;
            while (i2 < size) {
                i += zzefz.zzfn(zzehn.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzefz.zzfn(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzq(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzac(list) + (size * zzefz.zzgq(i));
    }

    static int zzad(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzegs) {
            zzegs zzegs = (zzegs) list;
            i = 0;
            while (i2 < size) {
                i += zzefz.zzgw(zzegs.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzefz.zzgw(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzr(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzad(list) + (size * zzefz.zzgq(i));
    }

    static int zzae(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzegs) {
            zzegs zzegs = (zzegs) list;
            i = 0;
            while (i2 < size) {
                i += zzefz.zzgr(zzegs.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzefz.zzgr(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzs(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzae(list) + (size * zzefz.zzgq(i));
    }

    static int zzaf(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzegs) {
            zzegs zzegs = (zzegs) list;
            i = 0;
            while (i2 < size) {
                i += zzefz.zzgs(zzegs.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzefz.zzgs(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzt(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzaf(list) + (size * zzefz.zzgq(i));
    }

    static int zzag(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzegs) {
            zzegs zzegs = (zzegs) list;
            i = 0;
            while (i2 < size) {
                i += zzefz.zzgt(zzegs.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzefz.zzgt(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzu(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzag(list) + (size * zzefz.zzgq(i));
    }

    static int zzah(List<?> list) {
        return list.size() << 2;
    }

    static int zzv(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzefz.zzai(i, 0);
    }

    static int zzai(List<?> list) {
        return list.size() << 3;
    }

    static int zzw(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzefz.zzn(i, 0);
    }

    static int zzaj(List<?> list) {
        return list.size();
    }

    static int zzx(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzefz.zzi(i, true);
    }

    static int zzc(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int zzgq = zzefz.zzgq(i) * size;
        if (list instanceof zzehk) {
            zzehk zzehk = (zzehk) list;
            while (i4 < size) {
                Object zzhe = zzehk.zzhe(i4);
                if (zzhe instanceof zzeff) {
                    i3 = zzefz.zzai((zzeff) zzhe);
                } else {
                    i3 = zzefz.zzhw((String) zzhe);
                }
                zzgq += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzeff) {
                    i2 = zzefz.zzai((zzeff) obj);
                } else {
                    i2 = zzefz.zzhw((String) obj);
                }
                zzgq += i2;
                i4++;
            }
        }
        return zzgq;
    }

    static int zzc(int i, Object obj, zzeiv zzeiv) {
        if (obj instanceof zzehi) {
            return zzefz.zza(i, (zzehi) obj);
        }
        return zzefz.zzb(i, (zzehz) obj, zzeiv);
    }

    static int zzc(int i, List<?> list, zzeiv zzeiv) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzgq = zzefz.zzgq(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzehi) {
                i2 = zzefz.zza((zzehi) obj);
            } else {
                i2 = zzefz.zza((zzehz) obj, zzeiv);
            }
            zzgq += i2;
        }
        return zzgq;
    }

    static int zzd(int i, List<zzeff> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzgq = size * zzefz.zzgq(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgq += zzefz.zzai(list.get(i2));
        }
        return zzgq;
    }

    static int zzd(int i, List<zzehz> list, zzeiv zzeiv) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzefz.zzc(i, list.get(i3), zzeiv);
        }
        return i2;
    }

    public static zzejn<?, ?> zzbhl() {
        return zzijp;
    }

    public static zzejn<?, ?> zzbhm() {
        return zzijq;
    }

    public static zzejn<?, ?> zzbhn() {
        return zzijr;
    }

    private static zzejn<?, ?> zzbv(boolean z) {
        try {
            Class<?> zzbhp = zzbhp();
            if (zzbhp == null) {
                return null;
            }
            return (zzejn) zzbhp.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable th) {
            return null;
        }
    }

    private static Class<?> zzbho() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable th) {
            return null;
        }
    }

    private static Class<?> zzbhp() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable th) {
            return null;
        }
    }

    static boolean zzh(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static <T> void zza(zzehw zzehw, T t, T t2, long j) {
        zzejt.zza((Object) t, j, zzehw.zzf(zzejt.zzp(t, j), zzejt.zzp(t2, j)));
    }

    static <T, FT extends zzegk<FT>> void zza(zzege<FT> zzege, T t, T t2) {
        zzegi<FT> zzah = zzege.zzah(t2);
        if (!zzah.zzict.isEmpty()) {
            zzege.zzai(t).zza(zzah);
        }
    }

    static <T, UT, UB> void zza(zzejn<UT, UB> zzejn, T t, T t2) {
        zzejn.zzi(t, zzejn.zzk(zzejn.zzax(t), zzejn.zzax(t2)));
    }

    static <UT, UB> UB zza(int i, List<Integer> list, zzegw zzegw, UB ub, zzejn<UT, UB> zzejn) {
        if (zzegw == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (zzegw.zzi(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = zza(i, intValue, ub, zzejn);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzegw.zzi(intValue2)) {
                    ub = zza(i, intValue2, ub, zzejn);
                    it.remove();
                }
            }
        }
        return ub;
    }

    static <UT, UB> UB zza(int i, int i2, UB ub, zzejn<UT, UB> zzejn) {
        if (ub == null) {
            ub = zzejn.zzbhy();
        }
        zzejn.zza(ub, i, (long) i2);
        return ub;
    }
}
