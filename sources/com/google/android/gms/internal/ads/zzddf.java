package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzddf implements zzden<zzddc> {
    private final Bundle zzfsj;
    private final zzdvw zzgay;

    public zzddf(zzdvw zzdvw, Bundle bundle) {
        this.zzgay = zzdvw;
        this.zzfsj = bundle;
    }

    public final zzdvt<zzddc> zzaqs() {
        return this.zzgay.zze(new zzdde(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzddc zzarc() throws Exception {
        return new zzddc(this.zzfsj);
    }
}
