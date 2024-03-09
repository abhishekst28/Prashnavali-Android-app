package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzazj implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzazg zzebi;

    zzazj(zzazg zzazg) {
        this.zzebi = zzazg;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        zzp.zzkp();
        zzayh.zza(this.zzebi.val$context, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
