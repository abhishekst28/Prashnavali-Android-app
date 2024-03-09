package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class zzcvw extends zzamz {
    private final zzbue zzfpt;
    private final zzbtu zzfqj;
    private final zzbtb zzfuw;
    private final zzbur zzfvb;
    private final zzbtl zzfvu;
    private final zzbst zzfvv;
    private final zzbws zzgct;
    private final zzbwp zzgof;
    private final zzbzh zzgoq;

    public zzcvw(zzbst zzbst, zzbtl zzbtl, zzbtu zzbtu, zzbue zzbue, zzbws zzbws, zzbur zzbur, zzbzh zzbzh, zzbwp zzbwp, zzbtb zzbtb) {
        this.zzfvv = zzbst;
        this.zzfvu = zzbtl;
        this.zzfqj = zzbtu;
        this.zzfpt = zzbue;
        this.zzgct = zzbws;
        this.zzfvb = zzbur;
        this.zzgoq = zzbzh;
        this.zzgof = zzbwp;
        this.zzfuw = zzbtb;
    }

    public final void onAdClicked() {
        this.zzfvv.onAdClicked();
    }

    public final void onAdClosed() {
        this.zzfvb.zzui();
    }

    public final void onAdLeftApplication() {
        this.zzfqj.onAdLeftApplication();
    }

    public final void onAdOpened() {
        this.zzfvb.zzuj();
        this.zzgof.zzaja();
    }

    public final void onAppEvent(String str, String str2) {
        this.zzgct.onAppEvent(str, str2);
    }

    public final void onAdLoaded() {
        this.zzfpt.onAdLoaded();
    }

    public void onAdImpression() {
        this.zzfvu.onAdImpression();
        this.zzgof.zzaiy();
    }

    public final void onVideoPause() {
        this.zzgoq.onVideoPause();
    }

    public void zzty() {
        this.zzgoq.onVideoStart();
    }

    public void onVideoEnd() {
        this.zzgoq.onVideoEnd();
    }

    public final void onVideoPlay() throws RemoteException {
        this.zzgoq.onVideoPlay();
    }

    @Deprecated
    public final void zzdd(int i) throws RemoteException {
        this.zzfuw.zzh(zzdmb.zza(zzdmd.zzhcv, new zzuw(i, "", AdError.UNDEFINED_DOMAIN, (zzuw) null)));
    }

    public final void zzdo(String str) {
        this.zzfuw.zzh(zzdmb.zza(zzdmd.zzhcv, new zzuw(0, str, AdError.UNDEFINED_DOMAIN, (zzuw) null)));
    }

    public final void zza(zzaes zzaes, String str) {
    }

    public final void onAdFailedToLoad(int i) {
    }

    public final void zzc(int i, String str) {
    }

    public final void zzb(zzuw zzuw) {
    }

    public final void zza(zzanb zzanb) {
    }

    public final void zzdn(String str) {
    }

    public void zzb(zzaue zzaue) {
    }

    public void zza(zzaug zzaug) throws RemoteException {
    }

    public void zztz() throws RemoteException {
    }

    public final void zzb(Bundle bundle) throws RemoteException {
    }
}
