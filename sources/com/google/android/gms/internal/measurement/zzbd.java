package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzx;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class zzbd extends zzx.zza {
    private final /* synthetic */ Activity zzc;
    private final /* synthetic */ zzx.zzd zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzbd(zzx.zzd zzd2, Activity activity) {
        super(zzx.this);
        this.zzd = zzd2;
        this.zzc = activity;
    }

    /* access modifiers changed from: package-private */
    public final void zza() throws RemoteException {
        zzx.this.zzr.onActivityResumed(ObjectWrapper.wrap(this.zzc), this.zzb);
    }
}
