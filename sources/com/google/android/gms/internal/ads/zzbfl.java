package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbfl implements DialogInterface.OnCancelListener {
    private final /* synthetic */ JsResult zzelr;

    zzbfl(JsResult jsResult) {
        this.zzelr = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.zzelr.cancel();
    }
}
