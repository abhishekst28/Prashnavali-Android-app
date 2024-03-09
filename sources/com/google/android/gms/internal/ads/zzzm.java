package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzzm extends zzxn {
    private zzaim zzckn;

    public final void initialize() throws RemoteException {
        zzbbd.zzfc("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        zzbat.zzaah.post(new zzzl(this));
    }

    public final void zza(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final void setAppVolume(float f) throws RemoteException {
    }

    public final void zzch(String str) throws RemoteException {
    }

    public final void setAppMuted(boolean z) throws RemoteException {
    }

    public final void zzb(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
    }

    public final float zzqd() throws RemoteException {
        return 1.0f;
    }

    public final boolean zzqe() throws RemoteException {
        return false;
    }

    public final String getVersionString() {
        return "";
    }

    public final void zzci(String str) throws RemoteException {
    }

    public final void zza(zzamu zzamu) throws RemoteException {
    }

    public final void zza(zzaim zzaim) throws RemoteException {
        this.zzckn = zzaim;
    }

    public final List<zzaif> zzqf() throws RemoteException {
        return Collections.emptyList();
    }

    public final void zza(zzzw zzzw) throws RemoteException {
    }

    public final void zzqg() {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzqv() {
        zzaim zzaim = this.zzckn;
        if (zzaim != null) {
            try {
                zzaim.zze(Collections.emptyList());
            } catch (RemoteException e) {
                zzbbd.zzd("Could not notify onComplete event.", e);
            }
        }
    }
}
