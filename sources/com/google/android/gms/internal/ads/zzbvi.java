package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.reward.AdMetadataListener;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbvi extends AdMetadataListener implements AppEventListener, zzbsu, zzbti, zzbtm, zzbuo, zzbuy, zzut {
    private final zzbwh zzftg = new zzbwh(this);
    /* access modifiers changed from: private */
    @Nullable
    public zzcxm zzfth;
    /* access modifiers changed from: private */
    @Nullable
    public zzcxj zzfti;
    /* access modifiers changed from: private */
    @Nullable
    public zzcxl zzftj;
    /* access modifiers changed from: private */
    @Nullable
    public zzcxh zzftk;
    /* access modifiers changed from: private */
    @Nullable
    public zzdht zzftl;
    /* access modifiers changed from: private */
    @Nullable
    public zzdje zzftm;

    public final zzbwh zzaio() {
        return this.zzftg;
    }

    public final void onAdOpened() {
        zza(this.zzfth, zzbvl.zzftn);
        zza(this.zzftm, zzbvk.zzftn);
    }

    public final void onAdClosed() {
        zza(this.zzfth, zzbvx.zzftn);
        zza(this.zzftm, zzbvz.zzftn);
    }

    public final void onAdLeftApplication() {
        zza(this.zzfth, zzbvy.zzftn);
        zza(this.zzftm, zzbwb.zzftn);
    }

    public final void onRewardedVideoStarted() {
        zza(this.zzfth, zzbwa.zzftn);
        zza(this.zzftm, zzbwd.zzftn);
    }

    public final void zzb(zzatj zzatj, String str, String str2) {
        zza(this.zzfth, new zzbwc(zzatj, str, str2));
        zza(this.zzftm, new zzbwf(zzatj, str, str2));
    }

    public final void onRewardedVideoCompleted() {
        zza(this.zzfth, zzbvn.zzftn);
        zza(this.zzftm, zzbvm.zzftn);
    }

    public final void onAdClicked() {
        zza(this.zzfth, zzbvp.zzftn);
        zza(this.zzfti, zzbvo.zzftn);
    }

    public final void onAppEvent(String str, String str2) {
        zza(this.zzftj, new zzbvr(str, str2));
    }

    public final void zzb(zzvl zzvl) {
        zza(this.zzftk, new zzbvq(zzvl));
        zza(this.zzftm, new zzbvt(zzvl));
    }

    public final void onAdImpression() {
        zza(this.zzfth, zzbvs.zzftn);
    }

    public final void zzajl() {
        zza(this.zzftl, zzbvv.zzftn);
    }

    public final void onAdMetadataChanged() {
        zza(this.zzftm, zzbvu.zzftn);
    }

    public final void zzf(zzuw zzuw) {
        zza(this.zzftm, new zzbvw(zzuw));
    }

    private static <T> void zza(T t, zzbwg<T> zzbwg) {
        if (t != null) {
            zzbwg.zzq(t);
        }
    }
}
