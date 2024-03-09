package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.instream.InstreamAd;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzaji {
    private final zzwr zzacr;
    private final Context zzvr;

    public zzaji(Context context, String str) {
        this((Context) Preconditions.checkNotNull(context, "context cannot be null"), zzwe.zzpr().zzb(context, str, new zzamr()));
    }

    private zzaji(Context context, zzwr zzwr) {
        this.zzvr = context;
        this.zzacr = zzwr;
    }

    public final zzaji zza(InstreamAd.InstreamAdLoadCallback instreamAdLoadCallback) {
        try {
            this.zzacr.zza((zzaiz) new zzajg(instreamAdLoadCallback));
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
        return this;
    }

    public final zzaji zza(zzajd zzajd) {
        try {
            this.zzacr.zza(new zzair(zzajd));
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
        return this;
    }

    public final zzajf zztc() {
        try {
            return new zzajf(this.zzvr, this.zzacr.zzqc());
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            return null;
        }
    }
}
