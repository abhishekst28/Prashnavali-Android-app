package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzads implements NativeCustomTemplateAd.DisplayOpenMeasurement {
    private final zzaes zzdcv;

    public zzads(zzaes zzaes) {
        this.zzdcv = zzaes;
        try {
            zzaes.zzso();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }

    public final boolean start() {
        try {
            return this.zzdcv.zzsn();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return false;
        }
    }

    public final void setView(View view) {
        try {
            this.zzdcv.zzq(ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }
}
