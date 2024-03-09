package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzvw extends zzwf<zzwu> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzvj zzchw;
    private final /* synthetic */ String zzchx;
    private final /* synthetic */ zzvr zzchz;

    zzvw(zzvr zzvr, Context context, zzvj zzvj, String str) {
        this.zzchz = zzvr;
        this.val$context = context;
        this.zzchw = zzvj;
        this.zzchx = str;
    }

    public final /* synthetic */ Object zzpn() {
        zzvr.zza(this.val$context, "search");
        return new zzzk();
    }

    public final /* synthetic */ Object zzpo() throws RemoteException {
        return this.zzchz.zzcia.zza(this.val$context, this.zzchw, this.zzchx, (zzamu) null, 3);
    }

    public final /* synthetic */ Object zza(zzxh zzxh) throws RemoteException {
        return zzxh.zza(ObjectWrapper.wrap(this.val$context), this.zzchw, this.zzchx, 202006000);
    }
}
