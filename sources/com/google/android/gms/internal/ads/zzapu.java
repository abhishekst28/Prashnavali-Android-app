package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzapu implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzapr zzdmg;

    zzapu(zzapr zzapr) {
        this.zzdmg = zzapr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent createIntent = this.zzdmg.createIntent();
        zzp.zzkp();
        zzayh.zza(this.zzdmg.zzvr, createIntent);
    }
}
