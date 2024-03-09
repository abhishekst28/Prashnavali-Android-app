package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzapz implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzapx zzdmx;

    zzapz(zzapx zzapx) {
        this.zzdmx = zzapx;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzdmx.zzdx("User canceled the download.");
    }
}
