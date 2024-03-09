package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcgz implements zzahf<Object> {
    private final zzeli<zzcgw> zzfxe;
    private final zzchc zzfzs;
    private final zzafc zzgci;

    public zzcgz(zzcdg zzcdg, zzccv zzccv, zzchc zzchc, zzeli<zzcgw> zzeli) {
        this.zzgci = zzcdg.zzge(zzccv.getCustomTemplateId());
        this.zzfzs = zzchc;
        this.zzfxe = zzeli;
    }

    public final void zzanf() {
        if (this.zzgci != null) {
            this.zzfzs.zza("/nativeAdCustomClick", (zzahf<Object>) this);
        }
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("asset");
        try {
            this.zzgci.zza(this.zzfxe.get(), str);
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            zzaxy.zzd(sb.toString(), e);
        }
    }
}
