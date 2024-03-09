package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzagc {
    /* access modifiers changed from: private */
    public final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener zzddj;
    /* access modifiers changed from: private */
    public final NativeCustomTemplateAd.OnCustomClickListener zzddk;
    private NativeCustomTemplateAd zzddl;

    public zzagc(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
        this.zzddj = onCustomTemplateAdLoadedListener;
        this.zzddk = onCustomClickListener;
    }

    public final zzafd zzst() {
        return new zzagd(this);
    }

    public final zzafc zzsu() {
        if (this.zzddk == null) {
            return null;
        }
        return new zzage(this);
    }

    /* access modifiers changed from: private */
    public final synchronized NativeCustomTemplateAd zzb(zzaes zzaes) {
        if (this.zzddl != null) {
            return this.zzddl;
        }
        zzaet zzaet = new zzaet(zzaes);
        this.zzddl = zzaet;
        return zzaet;
    }
}
