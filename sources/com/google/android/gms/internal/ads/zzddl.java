package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzddl implements zzden<zzdek<Bundle>> {
    private final String zzfsk;
    private final Context zzvr;

    zzddl(Context context, String str) {
        this.zzvr = context;
        this.zzfsk = str;
    }

    public final zzdvt<zzdek<Bundle>> zzaqs() {
        zzddk zzddk;
        if (this.zzfsk == null) {
            zzddk = null;
        } else {
            zzddk = new zzddk(this);
        }
        return zzdvl.zzaf(zzddk);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(Bundle bundle) {
        bundle.putString("rewarded_sku_package", this.zzvr.getPackageName());
    }
}
