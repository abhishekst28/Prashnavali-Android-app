package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzx;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class zzam extends zzx.zza {
    private final /* synthetic */ zzk zzc;
    private final /* synthetic */ zzx zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzam(zzx zzx, zzk zzk) {
        super(zzx);
        this.zzd = zzx;
        this.zzc = zzk;
    }

    /* access modifiers changed from: package-private */
    public final void zza() throws RemoteException {
        this.zzd.zzr.getGmpAppId(this.zzc);
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        this.zzc.zza((Bundle) null);
    }
}
