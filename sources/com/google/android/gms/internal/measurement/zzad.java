package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzx;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class zzad extends zzx.zza {
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ zzx zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzad(zzx zzx, boolean z) {
        super(zzx);
        this.zzd = zzx;
        this.zzc = z;
    }

    /* access modifiers changed from: package-private */
    public final void zza() throws RemoteException {
        this.zzd.zzr.setMeasurementEnabled(this.zzc, this.zza);
    }
}
