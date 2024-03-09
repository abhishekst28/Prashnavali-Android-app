package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcyq implements zzdsl {
    private final Uri zzeag;
    private final zzcyk zzgri;

    zzcyq(zzcyk zzcyk, Uri uri) {
        this.zzgri = zzcyk;
        this.zzeag = uri;
    }

    public final Object apply(Object obj) {
        return zzcyk.zzc(this.zzeag, (String) obj);
    }
}
