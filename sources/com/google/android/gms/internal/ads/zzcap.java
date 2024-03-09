package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcap implements zzo {
    private final zzbur zzfvb;
    private final zzbyo zzfvc;

    public zzcap(zzbur zzbur, zzbyo zzbyo) {
        this.zzfvb = zzbur;
        this.zzfvc = zzbyo;
    }

    public final void zzui() {
        this.zzfvb.zzui();
        this.zzfvc.onHide();
    }

    public final void onPause() {
        this.zzfvb.onPause();
    }

    public final void onResume() {
        this.zzfvb.onResume();
    }

    public final void zzuj() {
        this.zzfvb.zzuj();
        this.zzfvc.zzakg();
    }
}
