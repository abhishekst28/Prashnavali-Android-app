package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class zzbnl {
    private final View view;
    private final zzbfq zzdgc;
    private final zzdkw zzfnm;
    private final zzbpe zzfoc;

    public zzbnl(View view2, zzbfq zzbfq, zzbpe zzbpe, zzdkw zzdkw) {
        this.view = view2;
        this.zzdgc = zzbfq;
        this.zzfoc = zzbpe;
        this.zzfnm = zzdkw;
    }

    public final zzbfq zzahe() {
        return this.zzdgc;
    }

    public final View zzahq() {
        return this.view;
    }

    public final zzbpe zzahy() {
        return this.zzfoc;
    }

    public final zzdkw zzahz() {
        return this.zzfnm;
    }

    public zzbue zza(Set<zzbys<zzbuj>> set) {
        return new zzbue(set);
    }
}
