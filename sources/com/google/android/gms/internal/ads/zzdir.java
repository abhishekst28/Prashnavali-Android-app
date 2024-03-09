package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbse;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdir<RequestComponentT extends zzbse<AdT>, AdT> implements zzdiz<RequestComponentT, AdT> {
    private RequestComponentT zzgyk;

    /* access modifiers changed from: private */
    /* renamed from: zzasc */
    public final synchronized RequestComponentT zzasb() {
        return this.zzgyk;
    }

    public final synchronized zzdvt<AdT> zza(zzdja zzdja, zzdjb<RequestComponentT> zzdjb) {
        RequestComponentT requestcomponentt;
        requestcomponentt = (zzbse) zzdjb.zzc(zzdja.zzgzc).zzael();
        this.zzgyk = requestcomponentt;
        return requestcomponentt.zzafc().zzaiv();
    }
}
