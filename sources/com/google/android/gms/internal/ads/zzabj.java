package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzabj extends zzabo {
    private final zzg zzcyp;
    private final String zzcyq;
    private final String zzcyr;

    public zzabj(zzg zzg, String str, String str2) {
        this.zzcyp = zzg;
        this.zzcyq = str;
        this.zzcyr = str2;
    }

    public final String zzrp() {
        return this.zzcyq;
    }

    public final String getContent() {
        return this.zzcyr;
    }

    public final void zzn(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper != null) {
            this.zzcyp.zzh((View) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public final void recordClick() {
        this.zzcyp.zzka();
    }

    public final void recordImpression() {
        this.zzcyp.zzkb();
    }
}
