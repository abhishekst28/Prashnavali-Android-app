package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class zzbzw {
    private final zzbfq zzdgc;
    private final zzcaz zzfuz;

    public zzbzw(zzcaz zzcaz) {
        this(zzcaz, (zzbfq) null);
    }

    public zzbzw(zzcaz zzcaz, zzbfq zzbfq) {
        this.zzfuz = zzcaz;
        this.zzdgc = zzbfq;
    }

    public final zzcaz zzakm() {
        return this.zzfuz;
    }

    public final zzbfq zzahe() {
        return this.zzdgc;
    }

    public final View zzakn() {
        zzbfq zzbfq = this.zzdgc;
        if (zzbfq != null) {
            return zzbfq.getWebView();
        }
        return null;
    }

    public final View zzako() {
        zzbfq zzbfq = this.zzdgc;
        if (zzbfq == null) {
            return null;
        }
        return zzbfq.getWebView();
    }

    public Set<zzbys<zzbsu>> zzb(zzbru zzbru) {
        return Collections.singleton(zzbys.zzb(zzbru, zzbbi.zzedz));
    }

    public Set<zzbys<zzbyh>> zzc(zzbru zzbru) {
        return Collections.singleton(zzbys.zzb(zzbru, zzbbi.zzedz));
    }

    public final zzbys<zzbwm> zzb(Executor executor) {
        return new zzbys<>(new zzbzy(this.zzdgc), executor);
    }
}
