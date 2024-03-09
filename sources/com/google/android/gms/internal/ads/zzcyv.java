package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import java.util.Collections;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzcyv implements zzdvi<Uri> {
    private final /* synthetic */ zzarc zzgru;

    zzcyv(zzcyk zzcyk, zzarc zzarc) {
        this.zzgru = zzarc;
    }

    public final void zzb(Throwable th) {
        try {
            zzarc zzarc = this.zzgru;
            String valueOf = String.valueOf(th.getMessage());
            zzarc.onError(valueOf.length() != 0 ? "Internal error: ".concat(valueOf) : new String("Internal error: "));
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }

    public final /* synthetic */ void onSuccess(@Nonnull Object obj) {
        try {
            this.zzgru.onSuccess(Collections.singletonList((Uri) obj));
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }
}
