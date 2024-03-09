package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbfm implements DialogInterface.OnCancelListener {
    private final /* synthetic */ JsPromptResult zzels;

    zzbfm(JsPromptResult jsPromptResult) {
        this.zzels = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.zzels.cancel();
    }
}
