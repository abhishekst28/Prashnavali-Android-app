package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzcfd implements zzdsl<zzy, Bitmap> {
    private final /* synthetic */ double zzgau;
    private final /* synthetic */ boolean zzgav;
    private final /* synthetic */ zzcfe zzgaw;

    zzcfd(zzcfe zzcfe, double d, boolean z) {
        this.zzgaw = zzcfe;
        this.zzgau = d;
        this.zzgav = z;
    }

    public final /* synthetic */ Object apply(Object obj) {
        return this.zzgaw.zza(((zzy) obj).data, this.zzgau, this.zzgav);
    }
}
