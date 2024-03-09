package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzvz extends zzwf<zzwu> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzvj zzchw;
    private final /* synthetic */ String zzchx;
    private final /* synthetic */ zzamu zzchy;
    private final /* synthetic */ zzvr zzchz;

    zzvz(zzvr zzvr, Context context, zzvj zzvj, String str, zzamu zzamu) {
        this.zzchz = zzvr;
        this.val$context = context;
        this.zzchw = zzvj;
        this.zzchx = str;
        this.zzchy = zzamu;
    }

    public final /* synthetic */ Object zzpn() {
        zzvr.zza(this.val$context, "interstitial");
        return new zzzk();
    }

    public final /* synthetic */ Object zzpo() throws RemoteException {
        return this.zzchz.zzcia.zza(this.val$context, this.zzchw, this.zzchx, this.zzchy, 2);
    }

    public final /* synthetic */ Object zza(zzxh zzxh) throws RemoteException {
        return zzxh.zzb(ObjectWrapper.wrap(this.val$context), this.zzchw, this.zzchx, this.zzchy, 202006000);
    }
}
