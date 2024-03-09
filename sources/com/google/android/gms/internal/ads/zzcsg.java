package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcsg implements zzduv {
    private final Uri zzeag;
    private final zzcsd zzgls;
    private final zzdlj zzglt;
    private final zzdkx zzglu;

    zzcsg(zzcsd zzcsd, Uri uri, zzdlj zzdlj, zzdkx zzdkx) {
        this.zzgls = zzcsd;
        this.zzeag = uri;
        this.zzglt = zzdlj;
        this.zzglu = zzdkx;
    }

    public final zzdvt zzf(Object obj) {
        return this.zzgls.zza(this.zzeag, this.zzglt, this.zzglu, obj);
    }
}
