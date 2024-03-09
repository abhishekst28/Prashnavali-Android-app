package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzg;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzcwq implements zzg {
    private final /* synthetic */ zzbzt zzgph;

    zzcwq(zzcwl zzcwl, zzbzt zzbzt) {
        this.zzgph = zzbzt;
    }

    public final void zzh(View view) {
    }

    public final void zzka() {
        this.zzgph.zzaeo().onAdClicked();
    }

    public final void zzkb() {
        this.zzgph.zzaep().onAdImpression();
        this.zzgph.zzaeq().zzaki();
    }
}
