package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbse;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdiq<RequestComponentT extends zzbse<AdT>, AdT> implements zzdiz<RequestComponentT, AdT> {
    private RequestComponentT zzgyk;
    private final zzdiz<RequestComponentT, AdT> zzgyx;

    public zzdiq(zzdiz<RequestComponentT, AdT> zzdiz) {
        this.zzgyx = zzdiz;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzasc */
    public final synchronized RequestComponentT zzasb() {
        return this.zzgyk;
    }

    public final synchronized zzdvt<AdT> zza(zzdja zzdja, zzdjb<RequestComponentT> zzdjb) {
        if (zzdja.zzgzb != null) {
            RequestComponentT requestcomponentt = (zzbse) zzdjb.zzc(zzdja.zzgzc).zzael();
            this.zzgyk = requestcomponentt;
            return requestcomponentt.zzafc().zzb(zzdja.zzgzb);
        }
        zzdvt<AdT> zza = this.zzgyx.zza(zzdja, zzdjb);
        this.zzgyk = (zzbse) this.zzgyx.zzasb();
        return zza;
    }
}
