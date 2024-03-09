package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzvv extends zzwf<zzawu> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzamu zzchy;

    zzvv(zzvr zzvr, Context context, zzamu zzamu) {
        this.val$context = context;
        this.zzchy = zzamu;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzpp */
    public final zzawu zzpo() {
        try {
            return ((zzawz) zzbbc.zza(this.val$context, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", zzvu.zzbxs)).zzd(ObjectWrapper.wrap(this.val$context), this.zzchy, 202006000);
        } catch (RemoteException | zzbbe | NullPointerException e) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zzpn() {
        return null;
    }

    public final /* synthetic */ Object zza(zzxh zzxh) throws RemoteException {
        return zzxh.zzb(ObjectWrapper.wrap(this.val$context), this.zzchy, 202006000);
    }
}
