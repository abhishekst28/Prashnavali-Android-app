package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcwl implements zzcwf<zzbzr> {
    private final zzcar zzglr;
    private final Context zzvr;

    public zzcwl(Context context, zzcar zzcar) {
        this.zzvr = context;
        this.zzglr = zzcar;
    }

    public final /* synthetic */ Object zza(zzdlj zzdlj, zzdkx zzdkx, View view, zzcwm zzcwm) {
        zzbzt zza = this.zzglr.zza(new zzbpt(zzdlj, zzdkx, (String) null), new zzcwn(this, zzcwo.zzgpg));
        zzcwm.zza(new zzcwq(this, zza));
        return zza.zzagb();
    }
}
