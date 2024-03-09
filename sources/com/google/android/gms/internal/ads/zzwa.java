package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzwa extends zzwf<zzaea> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzvr zzchz;
    private final /* synthetic */ FrameLayout zzcii;
    private final /* synthetic */ FrameLayout zzcij;

    zzwa(zzvr zzvr, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.zzchz = zzvr;
        this.zzcii = frameLayout;
        this.zzcij = frameLayout2;
        this.val$context = context;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object zzpn() {
        zzvr.zza(this.val$context, "native_ad_view_delegate");
        return new zzzo();
    }

    public final /* synthetic */ Object zzpo() throws RemoteException {
        return this.zzchz.zzcid.zzb(this.val$context, this.zzcii, this.zzcij);
    }

    public final /* synthetic */ Object zza(zzxh zzxh) throws RemoteException {
        return zzxh.zza(ObjectWrapper.wrap(this.zzcii), ObjectWrapper.wrap(this.zzcij));
    }
}
