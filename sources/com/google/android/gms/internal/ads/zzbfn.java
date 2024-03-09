package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbfn implements DialogInterface.OnClickListener {
    private final /* synthetic */ JsResult zzelr;

    zzbfn(JsResult jsResult) {
        this.zzelr = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzelr.confirm();
    }
}
