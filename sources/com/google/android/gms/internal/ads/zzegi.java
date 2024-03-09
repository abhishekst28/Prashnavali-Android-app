package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzegi<T extends zzegk<T>> {
    private static final zzegi zzicw = new zzegi(true);
    final zzeja<T, Object> zzict;
    private boolean zzicu;
    private boolean zzicv;

    private zzegi() {
        this.zzict = zzeja.zzho(16);
    }

    private zzegi(boolean z) {
        this(zzeja.zzho(0));
        zzbdg();
    }

    private zzegi(zzeja<T, Object> zzeja) {
        this.zzict = zzeja;
        zzbdg();
    }

    public static <T extends zzegk<T>> zzegi<T> zzbfc() {
        return zzicw;
    }

    public final void zzbdg() {
        if (!this.zzicu) {
            this.zzict.zzbdg();
            this.zzicu = true;
        }
    }

    public final boolean isImmutable() {
        return this.zzicu;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzegi)) {
            return false;
        }
        return this.zzict.equals(((zzegi) obj).zzict);
    }

    public final int hashCode() {
        return this.zzict.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> iterator() {
        if (this.zzicv) {
            return new zzehf(this.zzict.entrySet().iterator());
        }
        return this.zzict.entrySet().iterator();
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> descendingIterator() {
        if (this.zzicv) {
            return new zzehf(this.zzict.zzbhs().iterator());
        }
        return this.zzict.zzbhs().iterator();
    }

    private final Object zza(T t) {
        Object obj = this.zzict.get(t);
        if (!(obj instanceof zzehe)) {
            return obj;
        }
        zzehe zzehe = (zzehe) obj;
        return zzehe.zzbgl();
    }

    private final void zza(T t, Object obj) {
        if (!t.zzbfg()) {
            zza(t.zzbfe(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                zza(t.zzbfe(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzehe) {
            this.zzicv = true;
        }
        this.zzict.put(t, obj);
    }

    private static void zza(zzeke zzeke, Object obj) {
        zzegr.checkNotNull(obj);
        boolean z = true;
        switch (zzegh.zzics[zzeke.zzbii().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                break;
            case 2:
                z = obj instanceof Long;
                break;
            case 3:
                z = obj instanceof Float;
                break;
            case 4:
                z = obj instanceof Double;
                break;
            case 5:
                z = obj instanceof Boolean;
                break;
            case 6:
                z = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof zzeff) && !(obj instanceof byte[])) {
                    z = false;
                    break;
                }
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof zzegu)) {
                    z = false;
                    break;
                }
            case 9:
                if (!(obj instanceof zzehz) && !(obj instanceof zzehe)) {
                    z = false;
                    break;
                }
            default:
                z = false;
                break;
        }
        if (!z) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.zzict.zzbhq(); i++) {
            if (!zzb(this.zzict.zzhp(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> zzb : this.zzict.zzbhr()) {
            if (!zzb(zzb)) {
                return false;
            }
        }
        return true;
    }

    private static <T extends zzegk<T>> boolean zzb(Map.Entry<T, Object> entry) {
        zzegk zzegk = (zzegk) entry.getKey();
        if (zzegk.zzbff() == zzekh.MESSAGE) {
            if (zzegk.zzbfg()) {
                for (zzehz isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzehz) {
                    if (!((zzehz) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof zzehe) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public final void zza(zzegi<T> zzegi) {
        for (int i = 0; i < zzegi.zzict.zzbhq(); i++) {
            zzc(zzegi.zzict.zzhp(i));
        }
        for (Map.Entry<T, Object> zzc : zzegi.zzict.zzbhr()) {
            zzc(zzc);
        }
    }

    private static Object zzak(Object obj) {
        if (obj instanceof zzeii) {
            return ((zzeii) obj).zzbdc();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final void zzc(Map.Entry<T, Object> entry) {
        Object obj;
        zzegk zzegk = (zzegk) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzehe) {
            zzehe zzehe = (zzehe) value;
            value = zzehe.zzbgl();
        }
        if (zzegk.zzbfg()) {
            Object zza = zza(zzegk);
            if (zza == null) {
                zza = new ArrayList();
            }
            for (Object zzak : (List) value) {
                ((List) zza).add(zzak(zzak));
            }
            this.zzict.put(zzegk, zza);
        } else if (zzegk.zzbff() == zzekh.MESSAGE) {
            Object zza2 = zza(zzegk);
            if (zza2 == null) {
                this.zzict.put(zzegk, zzak(value));
                return;
            }
            if (zza2 instanceof zzeii) {
                obj = zzegk.zza((zzeii) zza2, (zzeii) value);
            } else {
                obj = zzegk.zza(((zzehz) zza2).zzbfp(), (zzehz) value).zzbfx();
            }
            this.zzict.put(zzegk, obj);
        } else {
            this.zzict.put(zzegk, zzak(value));
        }
    }

    static void zza(zzefz zzefz, zzeke zzeke, int i, Object obj) throws IOException {
        if (zzeke == zzeke.GROUP) {
            zzehz zzehz = (zzehz) obj;
            zzegr.zzk(zzehz);
            zzefz.writeTag(i, 3);
            zzehz.zzb(zzefz);
            zzefz.writeTag(i, 4);
            return;
        }
        zzefz.writeTag(i, zzeke.zzbij());
        switch (zzegh.zzicc[zzeke.ordinal()]) {
            case 1:
                zzefz.zzb(((Double) obj).doubleValue());
                return;
            case 2:
                zzefz.zzf(((Float) obj).floatValue());
                return;
            case 3:
                zzefz.zzfi(((Long) obj).longValue());
                return;
            case 4:
                zzefz.zzfi(((Long) obj).longValue());
                return;
            case 5:
                zzefz.zzgm(((Integer) obj).intValue());
                return;
            case 6:
                zzefz.zzfk(((Long) obj).longValue());
                return;
            case 7:
                zzefz.zzgp(((Integer) obj).intValue());
                return;
            case 8:
                zzefz.zzbs(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzehz) obj).zzb(zzefz);
                return;
            case 10:
                zzefz.zzg((zzehz) obj);
                return;
            case 11:
                if (obj instanceof zzeff) {
                    zzefz.zzah((zzeff) obj);
                    return;
                } else {
                    zzefz.zzhv((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzeff) {
                    zzefz.zzah((zzeff) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzefz.zzk(bArr, 0, bArr.length);
                return;
            case 13:
                zzefz.zzgn(((Integer) obj).intValue());
                return;
            case 14:
                zzefz.zzgp(((Integer) obj).intValue());
                return;
            case 15:
                zzefz.zzfk(((Long) obj).longValue());
                return;
            case 16:
                zzefz.zzgo(((Integer) obj).intValue());
                return;
            case 17:
                zzefz.zzfj(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzegu) {
                    zzefz.zzgm(((zzegu) obj).zzv());
                    return;
                } else {
                    zzefz.zzgm(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public final int zzbfd() {
        int i = 0;
        for (int i2 = 0; i2 < this.zzict.zzbhq(); i2++) {
            i += zzd(this.zzict.zzhp(i2));
        }
        for (Map.Entry<T, Object> zzd : this.zzict.zzbhr()) {
            i += zzd(zzd);
        }
        return i;
    }

    private static int zzd(Map.Entry<T, Object> entry) {
        zzegk zzegk = (zzegk) entry.getKey();
        Object value = entry.getValue();
        if (zzegk.zzbff() != zzekh.MESSAGE || zzegk.zzbfg() || zzegk.zzbfh()) {
            return zzb((zzegk<?>) zzegk, value);
        }
        if (value instanceof zzehe) {
            return zzefz.zzb(((zzegk) entry.getKey()).zzv(), (zzehi) (zzehe) value);
        }
        return zzefz.zzb(((zzegk) entry.getKey()).zzv(), (zzehz) value);
    }

    static int zza(zzeke zzeke, int i, Object obj) {
        int zzgq = zzefz.zzgq(i);
        if (zzeke == zzeke.GROUP) {
            zzegr.zzk((zzehz) obj);
            zzgq <<= 1;
        }
        return zzgq + zzb(zzeke, obj);
    }

    private static int zzb(zzeke zzeke, Object obj) {
        switch (zzegh.zzicc[zzeke.ordinal()]) {
            case 1:
                return zzefz.zzc(((Double) obj).doubleValue());
            case 2:
                return zzefz.zzg(((Float) obj).floatValue());
            case 3:
                return zzefz.zzfl(((Long) obj).longValue());
            case 4:
                return zzefz.zzfm(((Long) obj).longValue());
            case 5:
                return zzefz.zzgr(((Integer) obj).intValue());
            case 6:
                return zzefz.zzfo(((Long) obj).longValue());
            case 7:
                return zzefz.zzgu(((Integer) obj).intValue());
            case 8:
                return zzefz.zzbt(((Boolean) obj).booleanValue());
            case 9:
                return zzefz.zzi((zzehz) obj);
            case 10:
                if (obj instanceof zzehe) {
                    return zzefz.zza((zzehe) obj);
                }
                return zzefz.zzh((zzehz) obj);
            case 11:
                if (obj instanceof zzeff) {
                    return zzefz.zzai((zzeff) obj);
                }
                return zzefz.zzhw((String) obj);
            case 12:
                if (obj instanceof zzeff) {
                    return zzefz.zzai((zzeff) obj);
                }
                return zzefz.zzx((byte[]) obj);
            case 13:
                return zzefz.zzgs(((Integer) obj).intValue());
            case 14:
                return zzefz.zzgv(((Integer) obj).intValue());
            case 15:
                return zzefz.zzfp(((Long) obj).longValue());
            case 16:
                return zzefz.zzgt(((Integer) obj).intValue());
            case 17:
                return zzefz.zzfn(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzegu) {
                    return zzefz.zzgw(((zzegu) obj).zzv());
                }
                return zzefz.zzgw(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zzb(zzegk<?> zzegk, Object obj) {
        zzeke zzbfe = zzegk.zzbfe();
        int zzv = zzegk.zzv();
        if (!zzegk.zzbfg()) {
            return zza(zzbfe, zzv, obj);
        }
        int i = 0;
        if (zzegk.zzbfh()) {
            for (Object zzb : (List) obj) {
                i += zzb(zzbfe, zzb);
            }
            return zzefz.zzgq(zzv) + i + zzefz.zzgy(i);
        }
        for (Object zza : (List) obj) {
            i += zza(zzbfe, zzv, zza);
        }
        return i;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzegi zzegi = new zzegi();
        for (int i = 0; i < this.zzict.zzbhq(); i++) {
            Map.Entry<T, Object> zzhp = this.zzict.zzhp(i);
            zzegi.zza((zzegk) zzhp.getKey(), zzhp.getValue());
        }
        for (Map.Entry next : this.zzict.zzbhr()) {
            zzegi.zza((zzegk) next.getKey(), next.getValue());
        }
        zzegi.zzicv = this.zzicv;
        return zzegi;
    }
}
