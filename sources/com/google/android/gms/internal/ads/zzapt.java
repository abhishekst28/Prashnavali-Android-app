package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzapt implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzapr zzdmg;

    zzapt(zzapr zzapr) {
        this.zzdmg = zzapr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzdmg.zzdx("Operation denied by user.");
    }
}
