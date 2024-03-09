package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzeho extends zzehj {
    private zzeho() {
        super();
    }

    /* access modifiers changed from: package-private */
    public final <L> List<L> zza(Object obj, long j) {
        zzeha zzd = zzd(obj, j);
        if (zzd.zzbdf()) {
            return zzd;
        }
        int size = zzd.size();
        zzeha zzft = zzd.zzft(size == 0 ? 10 : size << 1);
        zzejt.zza(obj, j, (Object) zzft);
        return zzft;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Object obj, long j) {
        zzd(obj, j).zzbdg();
    }

    /* access modifiers changed from: package-private */
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzeha zzd = zzd(obj, j);
        zzeha zzd2 = zzd(obj2, j);
        int size = zzd.size();
        int size2 = zzd2.size();
        if (size > 0 && size2 > 0) {
            if (!zzd.zzbdf()) {
                zzd = zzd.zzft(size2 + size);
            }
            zzd.addAll(zzd2);
        }
        if (size > 0) {
            zzd2 = zzd;
        }
        zzejt.zza(obj, j, (Object) zzd2);
    }

    private static <E> zzeha<E> zzd(Object obj, long j) {
        return (zzeha) zzejt.zzp(obj, j);
    }
}
