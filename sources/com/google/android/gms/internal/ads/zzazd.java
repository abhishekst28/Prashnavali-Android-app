package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzazd implements DialogInterface.OnClickListener {
    private final String zzdft;
    private final zzayy zzeaw;

    zzazd(zzayy zzayy, String str) {
        this.zzeaw = zzayy;
        this.zzdft = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzeaw.zza(this.zzdft, dialogInterface, i);
    }
}
