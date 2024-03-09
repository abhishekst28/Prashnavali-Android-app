package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzvs extends zzwf<zzaql> {
    private final /* synthetic */ Activity val$activity;
    private final /* synthetic */ zzvr zzchz;

    zzvs(zzvr zzvr, Activity activity) {
        this.zzchz = zzvr;
        this.val$activity = activity;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object zzpn() {
        zzvr.zza((Context) this.val$activity, "ad_overlay");
        return null;
    }

    public final /* synthetic */ Object zzpo() throws RemoteException {
        return this.zzchz.zzcig.zzc(this.val$activity);
    }

    public final /* synthetic */ Object zza(zzxh zzxh) throws RemoteException {
        return zzxh.zzb(ObjectWrapper.wrap(this.val$activity));
    }
}
