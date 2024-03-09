package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzddy implements zzden<zzddz> {
    private final zzbbg zzbpa;
    private final zzdvw zzgay;
    private final Context zzvr;

    public zzddy(zzdvw zzdvw, Context context, zzbbg zzbbg) {
        this.zzgay = zzdvw;
        this.zzvr = context;
        this.zzbpa = zzbbg;
    }

    public final zzdvt<zzddz> zzaqs() {
        return this.zzgay.zze(new zzdeb(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzddz zzarg() throws Exception {
        boolean isCallerInstantApp = Wrappers.packageManager(this.zzvr).isCallerInstantApp();
        zzp.zzkp();
        boolean zzaz = zzayh.zzaz(this.zzvr);
        String str = this.zzbpa.zzbra;
        zzp.zzkr();
        boolean zzxu = zzaym.zzxu();
        zzp.zzkp();
        return new zzddz(isCallerInstantApp, zzaz, str, zzxu, zzayh.zzaw(this.zzvr), DynamiteModule.getRemoteVersion(this.zzvr, ModuleDescriptor.MODULE_ID), DynamiteModule.getLocalVersion(this.zzvr, ModuleDescriptor.MODULE_ID));
    }
}
