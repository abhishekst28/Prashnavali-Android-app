package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzaza implements DialogInterface.OnClickListener {
    private final zzayy zzeaw;
    private final int zzeax;
    private final int zzeay;
    private final int zzeaz;

    zzaza(zzayy zzayy, int i, int i2, int i3) {
        this.zzeaw = zzayy;
        this.zzeax = i;
        this.zzeay = i2;
        this.zzeaz = i3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzeaw.zza(this.zzeax, this.zzeay, this.zzeaz, dialogInterface, i);
    }
}
