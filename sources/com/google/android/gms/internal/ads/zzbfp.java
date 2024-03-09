package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbfp implements DialogInterface.OnClickListener {
    private final /* synthetic */ JsPromptResult zzels;

    zzbfp(JsPromptResult jsPromptResult) {
        this.zzels = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzels.cancel();
    }
}
