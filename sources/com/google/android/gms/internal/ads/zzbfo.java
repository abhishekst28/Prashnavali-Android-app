package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbfo implements DialogInterface.OnClickListener {
    private final /* synthetic */ JsPromptResult zzels;
    private final /* synthetic */ EditText zzelt;

    zzbfo(JsPromptResult jsPromptResult, EditText editText) {
        this.zzels = jsPromptResult;
        this.zzelt = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzels.confirm(this.zzelt.getText().toString());
    }
}
