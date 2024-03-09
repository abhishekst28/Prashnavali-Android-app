package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzwb extends zzwf<zzxk> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzvr zzchz;

    zzwb(zzvr zzvr, Context context) {
        this.zzchz = zzvr;
        this.val$context = context;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object zzpn() {
        zzvr.zza(this.val$context, "mobile_ads_settings");
        return new zzzm();
    }

    public final /* synthetic */ Object zzpo() throws RemoteException {
        return this.zzchz.zzcic.zzi(this.val$context);
    }

    public final /* synthetic */ Object zza(zzxh zzxh) throws RemoteException {
        return zzxh.zza(ObjectWrapper.wrap(this.val$context), 202006000);
    }
}
