package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbfz implements zzo {
    private zzo zzdor;
    private zzbfq zzemr;

    public zzbfz(zzbfq zzbfq, zzo zzo) {
        this.zzemr = zzbfq;
        this.zzdor = zzo;
    }

    public final void zzuj() {
        zzo zzo = this.zzdor;
        if (zzo != null) {
            zzo.zzuj();
        }
        this.zzemr.zzuv();
    }

    public final void zzui() {
        zzo zzo = this.zzdor;
        if (zzo != null) {
            zzo.zzui();
        }
        this.zzemr.zzaax();
    }

    public final void onResume() {
    }

    public final void onPause() {
    }
}
