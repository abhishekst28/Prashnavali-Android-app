package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzddh implements zzelo<zzddf> {
    private final zzelx<zzdvw> zzerr;
    private final zzelx<Bundle> zzgui;

    private zzddh(zzelx<zzdvw> zzelx, zzelx<Bundle> zzelx2) {
        this.zzerr = zzelx;
        this.zzgui = zzelx2;
    }

    public static zzddh zzbe(zzelx<zzdvw> zzelx, zzelx<Bundle> zzelx2) {
        return new zzddh(zzelx, zzelx2);
    }

    public final /* synthetic */ Object get() {
        return new zzddf(this.zzerr.get(), this.zzgui.get());
    }
}
