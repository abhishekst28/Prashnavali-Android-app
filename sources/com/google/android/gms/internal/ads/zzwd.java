package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzwd extends zzwf<zzaed> {
    private final /* synthetic */ zzvr zzchz;
    private final /* synthetic */ View zzcik;
    private final /* synthetic */ HashMap zzcil;
    private final /* synthetic */ HashMap zzcim;

    zzwd(zzvr zzvr, View view, HashMap hashMap, HashMap hashMap2) {
        this.zzchz = zzvr;
        this.zzcik = view;
        this.zzcil = hashMap;
        this.zzcim = hashMap2;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object zzpn() {
        zzvr.zza(this.zzcik.getContext(), "native_ad_view_holder_delegate");
        return new zzzn();
    }

    public final /* synthetic */ Object zzpo() throws RemoteException {
        return this.zzchz.zzcih.zzb(this.zzcik, this.zzcil, this.zzcim);
    }

    public final /* synthetic */ Object zza(zzxh zzxh) throws RemoteException {
        return zzxh.zza(ObjectWrapper.wrap(this.zzcik), ObjectWrapper.wrap(this.zzcil), ObjectWrapper.wrap(this.zzcim));
    }
}
