package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zztw;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzcqw implements zzdvi<Bundle> {
    private final /* synthetic */ boolean zzgkt;
    final /* synthetic */ zzcqt zzgku;

    zzcqw(zzcqt zzcqt, boolean z) {
        this.zzgku = zzcqt;
        this.zzgkt = z;
    }

    public final void zzb(Throwable th) {
        zzaxy.zzfc("Failed to get signals bundle");
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        Bundle bundle = (Bundle) obj;
        ArrayList zza = zzcqt.zzm(bundle);
        zztw.zzo.zzb zzb = zzcqt.zzl(bundle);
        this.zzgku.zzgkl.zza(new zzcqv(this, this.zzgkt, zza, this.zzgku.zzk(bundle), zzb));
    }
}
