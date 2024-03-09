package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzblr {
    /* access modifiers changed from: private */
    public final Executor executor;
    private final String zzbqz;
    private final zzalz zzflq;
    /* access modifiers changed from: private */
    public zzbma zzflr;
    private final zzahf<Object> zzfls = new zzblu(this);
    private final zzahf<Object> zzflt = new zzblw(this);

    public zzblr(String str, zzalz zzalz, Executor executor2) {
        this.zzbqz = str;
        this.zzflq = zzalz;
        this.executor = executor2;
    }

    public final void zza(zzbma zzbma) {
        this.zzflq.zzc("/updateActiveView", this.zzfls);
        this.zzflq.zzc("/untrackActiveViewUnit", this.zzflt);
        this.zzflr = zzbma;
    }

    public final void zzd(zzbfq zzbfq) {
        zzbfq.zza("/updateActiveView", (zzahf<? super zzbfq>) this.zzfls);
        zzbfq.zza("/untrackActiveViewUnit", (zzahf<? super zzbfq>) this.zzflt);
    }

    public final void zze(zzbfq zzbfq) {
        zzbfq.zzb("/updateActiveView", (zzahf<? super zzbfq>) this.zzfls);
        zzbfq.zzb("/untrackActiveViewUnit", (zzahf<? super zzbfq>) this.zzflt);
    }

    public final void zzagx() {
        this.zzflq.zzd("/updateActiveView", this.zzfls);
        this.zzflq.zzd("/untrackActiveViewUnit", this.zzflt);
    }

    /* access modifiers changed from: private */
    public final boolean zzm(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = map.get("hashCode");
        if (TextUtils.isEmpty(str) || !str.equals(this.zzbqz)) {
            return false;
        }
        return true;
    }
}
