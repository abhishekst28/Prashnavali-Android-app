package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class zzbpd {
    protected final zzdlj zzflg;
    protected final zzdkx zzfpf;
    private final zzbto zzfps;
    private final zzbue zzfpt;
    private final zzdiw zzfpu;
    private final zzbsp zzfpv;
    private final zzbvi zzfpw;

    protected zzbpd(zzbpg zzbpg) {
        this.zzflg = zzbpg.zzflg;
        this.zzfpf = zzbpg.zzfpf;
        this.zzfps = zzbpg.zzfps;
        this.zzfpt = zzbpg.zzfpt;
        this.zzfpu = zzbpg.zzfpu;
        this.zzfpv = zzbpg.zzfpv;
        this.zzfpw = zzbpg.zzfpw;
    }

    public final zzbto zzail() {
        return this.zzfps;
    }

    public void zzahw() {
        this.zzfpt.onAdLoaded();
    }

    public final zzbsp zzaim() {
        return this.zzfpv;
    }

    public void destroy() {
        this.zzfps.zzcb((Context) null);
    }

    public final zzdiw zzain() {
        return this.zzfpu;
    }

    public final zzbwh zzaio() {
        return this.zzfpw.zzaio();
    }
}
