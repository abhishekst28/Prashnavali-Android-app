package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public class zzarh {
    private static zzawu zzdph;
    private final zzyo zzacu;
    private final AdFormat zzdpg;
    private final Context zzvr;

    public static zzawu zzs(Context context) {
        zzawu zzawu;
        synchronized (zzarh.class) {
            if (zzdph == null) {
                zzdph = zzwe.zzpr().zza(context, (zzamu) new zzamr());
            }
            zzawu = zzdph;
        }
        return zzawu;
    }

    public zzarh(Context context, AdFormat adFormat, zzyo zzyo) {
        this.zzvr = context;
        this.zzdpg = adFormat;
        this.zzacu = zzyo;
    }

    public final void zza(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzvc zzvc;
        zzawu zzs = zzs(this.zzvr);
        if (zzs == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        IObjectWrapper wrap = ObjectWrapper.wrap(this.zzvr);
        zzyo zzyo = this.zzacu;
        if (zzyo == null) {
            zzvc = new zzvf().zzph();
        } else {
            zzvc = zzvh.zza(this.zzvr, zzyo);
        }
        try {
            zzs.zza(wrap, new zzaxa((String) null, this.zzdpg.name(), (zzvj) null, zzvc), (zzawt) new zzarg(this, queryInfoGenerationCallback));
        } catch (RemoteException e) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
