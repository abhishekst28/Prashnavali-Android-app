package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzwc extends zzwf<zzatm> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzamu zzchy;
    private final /* synthetic */ zzvr zzchz;

    zzwc(zzvr zzvr, Context context, zzamu zzamu) {
        this.zzchz = zzvr;
        this.val$context = context;
        this.zzchy = zzamu;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object zzpn() {
        zzvr.zza(this.val$context, "rewarded_video");
        return new zzzs();
    }

    public final /* synthetic */ Object zzpo() throws RemoteException {
        return this.zzchz.zzcie.zzb(this.val$context, this.zzchy);
    }

    public final /* synthetic */ Object zza(zzxh zzxh) throws RemoteException {
        return zzxh.zza(ObjectWrapper.wrap(this.val$context), this.zzchy, 202006000);
    }
}
