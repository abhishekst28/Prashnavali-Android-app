package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzvt extends zzwf<zzaul> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ String zzchx;
    private final /* synthetic */ zzamu zzchy;
    private final /* synthetic */ zzvr zzchz;

    zzvt(zzvr zzvr, Context context, String str, zzamu zzamu) {
        this.zzchz = zzvr;
        this.val$context = context;
        this.zzchx = str;
        this.zzchy = zzamu;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object zzpn() {
        zzvr.zza(this.val$context, "rewarded");
        return new zzzq();
    }

    public final /* synthetic */ Object zzpo() throws RemoteException {
        return zzavb.zzd(this.val$context, this.zzchx, this.zzchy);
    }

    public final /* synthetic */ Object zza(zzxh zzxh) throws RemoteException {
        return zzxh.zzb(ObjectWrapper.wrap(this.val$context), this.zzchx, this.zzchy, 202006000);
    }
}
