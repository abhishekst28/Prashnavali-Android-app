package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbbp implements zzdvi<Object> {
    private final /* synthetic */ String zzeed;

    zzbbp(String str) {
        this.zzeed = str;
    }

    public final void onSuccess(Object obj) {
    }

    public final void zzb(Throwable th) {
        zzp.zzkt().zza(th, this.zzeed);
    }
}
