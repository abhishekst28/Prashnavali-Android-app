package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdcl implements zzdek<Bundle> {
    private final zzdkv zzfld;

    public zzdcl(zzdkv zzdkv) {
        this.zzfld = zzdkv;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzdkv zzdkv = this.zzfld;
        if (zzdkv != null) {
            bundle.putBoolean("render_in_browser", zzdkv.zzask());
            bundle.putBoolean("disable_ml", this.zzfld.zzasl());
        }
    }
}
