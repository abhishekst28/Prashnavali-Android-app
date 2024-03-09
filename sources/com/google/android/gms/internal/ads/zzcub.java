package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbsg;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcub extends zzcty<zzchu> {
    private final zzbxj zzetx;
    private final zzbii zzgmy;
    private final zzbsg.zza zzgmz;

    public zzcub(zzbii zzbii, zzbsg.zza zza, zzbxj zzbxj) {
        this.zzgmy = zzbii;
        this.zzgmz = zza;
        this.zzetx = zzbxj;
    }

    /* access modifiers changed from: protected */
    public final zzdvt<zzchu> zza(zzdln zzdln, Bundle bundle) {
        return this.zzgmy.zzadv().zze(this.zzgmz.zza(zzdln).zzf(bundle).zzajj()).zze(this.zzetx).zzage().zzafc().zzaiv();
    }
}
