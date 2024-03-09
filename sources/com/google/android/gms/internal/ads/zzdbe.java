package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdbe implements zzden<zzdek<Bundle>> {
    private final zzdij zzgtk;

    zzdbe(zzdij zzdij) {
        this.zzgtk = zzdij;
    }

    public final zzdvt<zzdek<Bundle>> zzaqs() {
        zzdbh zzdbh;
        zzdij zzdij = this.zzgtk;
        if (zzdij == null || zzdij.zzasf() == null || this.zzgtk.zzasf().isEmpty()) {
            zzdbh = null;
        } else {
            zzdbh = new zzdbh(this);
        }
        return zzdvl.zzaf(zzdbh);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(Bundle bundle) {
        bundle.putString("key_schema", this.zzgtk.zzasf());
    }
}
