package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcom extends zzasi {
    private final /* synthetic */ zzcoj zzgig;

    protected zzcom(zzcoj zzcoj) {
        this.zzgig = zzcoj;
    }

    public final void zzb(ParcelFileDescriptor parcelFileDescriptor) {
        this.zzgig.zzdih.set(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }

    public final void zza(zzazl zzazl) {
        this.zzgig.zzdih.setException(new zzazk(zzazl.zzacm, zzazl.errorCode));
    }
}
