package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzcou implements zzbvj {
    private final zzawb zzbqm;
    private final Context zzvr;

    zzcou(Context context, zzawb zzawb) {
        this.zzvr = context;
        this.zzbqm = zzawb;
    }

    public final void zzd(zzasp zzasp) {
    }

    public final void zzb(zzdlj zzdlj) {
        if (!TextUtils.isEmpty(zzdlj.zzhbq.zzhbn.zzdst)) {
            this.zzbqm.zza(this.zzvr, zzdlj.zzhbp.zzfqn.zzhbu);
            this.zzbqm.zzk(this.zzvr, zzdlj.zzhbq.zzhbn.zzdst);
        }
    }
}
