package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcyl implements Callable {
    private final Uri zzeag;
    private final zzcyk zzgri;
    private final IObjectWrapper zzgrk;

    zzcyl(zzcyk zzcyk, Uri uri, IObjectWrapper iObjectWrapper) {
        this.zzgri = zzcyk;
        this.zzeag = uri;
        this.zzgrk = iObjectWrapper;
    }

    public final Object call() {
        return this.zzgri.zzb(this.zzeag, this.zzgrk);
    }
}
