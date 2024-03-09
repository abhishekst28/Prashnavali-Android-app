package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzawj implements zzawr {
    private final Context zzcxz;
    private final String zzdft;

    zzawj(Context context, String str) {
        this.zzcxz = context;
        this.zzdft = str;
    }

    public final void zza(zzbib zzbib) {
        Context context = this.zzcxz;
        zzbib.zzb(ObjectWrapper.wrap(context), this.zzdft, context.getPackageName());
    }
}
