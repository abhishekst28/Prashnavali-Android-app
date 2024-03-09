package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzbgo implements zzbgq {
    private final zzbfq zzepi;

    zzbgo(zzbfq zzbfq) {
        this.zzepi = zzbfq;
    }

    public final void zzh(Uri uri) {
        zzbhc zzabe = this.zzepi.zzabe();
        if (zzabe == null) {
            zzaxy.zzfc("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            zzabe.zzh(uri);
        }
    }
}
