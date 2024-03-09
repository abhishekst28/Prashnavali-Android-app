package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zztw;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcbb implements zzo, zzbuj {
    private final zzbbg zzbpa;
    private final zzbfq zzdgc;
    private final zzdkx zzfpf;
    private IObjectWrapper zzfpg;
    private final zztw.zza.C0016zza zzfvf;
    private final Context zzvr;

    public zzcbb(Context context, zzbfq zzbfq, zzdkx zzdkx, zzbbg zzbbg, zztw.zza.C0016zza zza) {
        this.zzvr = context;
        this.zzdgc = zzbfq;
        this.zzfpf = zzdkx;
        this.zzbpa = zzbbg;
        this.zzfvf = zza;
    }

    public final void onAdLoaded() {
        if ((this.zzfvf == zztw.zza.C0016zza.REWARD_BASED_VIDEO_AD || this.zzfvf == zztw.zza.C0016zza.INTERSTITIAL) && this.zzfpf.zzdsr && this.zzdgc != null && zzp.zzle().zzp(this.zzvr)) {
            int i = this.zzbpa.zzedq;
            int i2 = this.zzbpa.zzedr;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            IObjectWrapper zza = zzp.zzle().zza(sb.toString(), this.zzdgc.getWebView(), "", "javascript", this.zzfpf.zzhay.getVideoEventsOwner());
            this.zzfpg = zza;
            if (zza != null && this.zzdgc.getView() != null) {
                zzp.zzle().zza(this.zzfpg, this.zzdgc.getView());
                this.zzdgc.zzap(this.zzfpg);
                zzp.zzle().zzab(this.zzfpg);
            }
        }
    }

    public final void zzui() {
        this.zzfpg = null;
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public final void zzuj() {
        zzbfq zzbfq;
        if (this.zzfpg != null && (zzbfq = this.zzdgc) != null) {
            zzbfq.zza("onSdkImpression", new HashMap());
        }
    }
}
