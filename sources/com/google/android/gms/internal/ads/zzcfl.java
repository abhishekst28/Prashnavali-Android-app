package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcfl implements zzdsl {
    private final String zzdgb;
    private final int zzeay;
    private final int zzeaz;
    private final double zzgbq;

    zzcfl(String str, double d, int i, int i2) {
        this.zzdgb = str;
        this.zzgbq = d;
        this.zzeay = i;
        this.zzeaz = i2;
    }

    public final Object apply(Object obj) {
        String str = this.zzdgb;
        return new zzadi(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), this.zzgbq, this.zzeay, this.zzeaz);
    }
}
