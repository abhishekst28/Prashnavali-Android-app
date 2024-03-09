package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdmk implements zzaxq, zzbsz {
    private final zzaxv zzdxp;
    private final HashSet<zzaxj> zzhdd = new HashSet<>();
    private final Context zzvr;

    public zzdmk(Context context, zzaxv zzaxv) {
        this.zzvr = context;
        this.zzdxp = zzaxv;
    }

    public final synchronized void zzg(zzuw zzuw) {
        if (zzuw.errorCode != 3) {
            this.zzdxp.zzb(this.zzhdd);
        }
    }

    public final synchronized void zza(HashSet<zzaxj> hashSet) {
        this.zzhdd.clear();
        this.zzhdd.addAll(hashSet);
    }

    public final Bundle zzatb() {
        return this.zzdxp.zza(this.zzvr, (zzaxq) this);
    }
}
