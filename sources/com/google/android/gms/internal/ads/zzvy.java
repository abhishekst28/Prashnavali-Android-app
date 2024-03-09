package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzvy extends zzwf<zzwr> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ String zzchx;
    private final /* synthetic */ zzamu zzchy;
    private final /* synthetic */ zzvr zzchz;

    zzvy(zzvr zzvr, Context context, String str, zzamu zzamu) {
        this.zzchz = zzvr;
        this.val$context = context;
        this.zzchx = str;
        this.zzchy = zzamu;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object zzpn() {
        zzvr.zza(this.val$context, "native_ad");
        return new zzzg();
    }

    public final /* synthetic */ Object zzpo() throws RemoteException {
        return this.zzchz.zzcib.zza(this.val$context, this.zzchx, this.zzchy);
    }

    public final /* synthetic */ Object zza(zzxh zzxh) throws RemoteException {
        return zzxh.zza(ObjectWrapper.wrap(this.val$context), this.zzchx, this.zzchy, 202006000);
    }
}
