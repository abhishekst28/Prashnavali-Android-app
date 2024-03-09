package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdup;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
abstract class zzduu<V, C> extends zzdup<V, C> {
    private List<zzduw<V>> zzhpk;

    zzduu(zzdtf<? extends zzdvt<? extends V>> zzdtf, boolean z) {
        super(zzdtf, true, true);
        List<zzduw<V>> list;
        if (zzdtf.isEmpty()) {
            list = zzdtg.zzawt();
        } else {
            list = zzdto.zzep(zzdtf.size());
        }
        for (int i = 0; i < zzdtf.size(); i++) {
            list.add((Object) null);
        }
        this.zzhpk = list;
    }

    /* access modifiers changed from: package-private */
    public abstract C zzj(List<zzduw<V>> list);

    /* access modifiers changed from: package-private */
    public final void zzb(int i, @NullableDecl V v) {
        List<zzduw<V>> list = this.zzhpk;
        if (list != null) {
            list.set(i, new zzduw(v));
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzaxe() {
        List<zzduw<V>> list = this.zzhpk;
        if (list != null) {
            set(zzj(list));
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzdup.zza zza) {
        super.zza(zza);
        this.zzhpk = null;
    }
}
