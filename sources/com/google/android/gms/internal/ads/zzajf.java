package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzajf {
    private final zzvh zzacs;
    private final zzwm zzact;
    private final Context zzvr;

    zzajf(Context context, zzwm zzwm) {
        this(context, zzwm, zzvh.zzchm);
    }

    private zzajf(Context context, zzwm zzwm, zzvh zzvh) {
        this.zzvr = context;
        this.zzact = zzwm;
        this.zzacs = zzvh;
    }

    private final void zza(zzyo zzyo) {
        try {
            this.zzact.zzb(zzvh.zza(this.zzvr, zzyo));
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    public final void loadAd(AdRequest adRequest) {
        zza(adRequest.zzdp());
    }

    public final void loadAd(PublisherAdRequest publisherAdRequest) {
        zza(publisherAdRequest.zzdp());
    }
}
