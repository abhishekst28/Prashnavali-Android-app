package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzbxj;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcxd extends zzwx implements zzbvf {
    /* access modifiers changed from: private */
    public final ViewGroup zzfnx;
    /* access modifiers changed from: private */
    public final zzbii zzgmy;
    /* access modifiers changed from: private */
    public zzbni zzgpm;
    private final Context zzgpr;
    private final zzdlp zzgps = new zzdlp();
    /* access modifiers changed from: private */
    public final zzcxm zzgpw = new zzcxm();
    /* access modifiers changed from: private */
    public final zzcxj zzgpx = new zzcxj();
    /* access modifiers changed from: private */
    public final zzcxl zzgpy = new zzcxl();
    /* access modifiers changed from: private */
    public final zzcxh zzgpz = new zzcxh();
    /* access modifiers changed from: private */
    public final zzbvb zzgqa;
    private zzvj zzgqb;
    private zzabq zzgqc;
    /* access modifiers changed from: private */
    public zzdvt<zzbni> zzgqd;

    public zzcxd(zzbii zzbii, Context context, zzvj zzvj, String str) {
        this.zzfnx = new FrameLayout(context);
        this.zzgmy = zzbii;
        this.zzgpr = context;
        this.zzgps.zze(zzvj).zzgt(str);
        zzbvb zzadn = zzbii.zzadn();
        this.zzgqa = zzadn;
        zzadn.zza(this, this.zzgmy.zzadj());
        this.zzgqb = zzvj;
    }

    public final IObjectWrapper zzkc() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzfnx);
    }

    public final synchronized boolean zza(zzvc zzvc) {
        zzd(this.zzgqb);
        return zzg(zzvc);
    }

    private final synchronized void zzd(zzvj zzvj) {
        this.zzgps.zze(zzvj);
        this.zzgps.zzbo(this.zzgqb.zzchu);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean zzg(com.google.android.gms.internal.ads.zzvc r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch:{ all -> 0x008c }
            com.google.android.gms.ads.internal.zzp.zzkp()     // Catch:{ all -> 0x008c }
            android.content.Context r0 = r4.zzgpr     // Catch:{ all -> 0x008c }
            boolean r0 = com.google.android.gms.internal.ads.zzayh.zzbe(r0)     // Catch:{ all -> 0x008c }
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.zzuu r0 = r5.zzchi     // Catch:{ all -> 0x008c }
            if (r0 != 0) goto L_0x002d
            java.lang.String r5 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.zzaxy.zzfc(r5)     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzcxm r5 = r4.zzgpw     // Catch:{ all -> 0x008c }
            if (r5 == 0) goto L_0x002b
            com.google.android.gms.internal.ads.zzcxm r5 = r4.zzgpw     // Catch:{ all -> 0x008c }
            int r0 = com.google.android.gms.internal.ads.zzdmd.zzhcr     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzuw r0 = com.google.android.gms.internal.ads.zzdmb.zza(r0, r2, r2)     // Catch:{ all -> 0x008c }
            r5.zzg(r0)     // Catch:{ all -> 0x008c }
        L_0x002b:
            monitor-exit(r4)
            return r1
        L_0x002d:
            com.google.android.gms.internal.ads.zzdvt<com.google.android.gms.internal.ads.zzbni> r0 = r4.zzgqd     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x0033
            monitor-exit(r4)
            return r1
        L_0x0033:
            android.content.Context r0 = r4.zzgpr     // Catch:{ all -> 0x008c }
            boolean r3 = r5.zzcgy     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzdly.zze(r0, r3)     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzdlp r0 = r4.zzgps     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzdlp r5 = r0.zzh((com.google.android.gms.internal.ads.zzvc) r5)     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzdln r5 = r5.zzasu()     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzaca<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzacp.zzdbb     // Catch:{ all -> 0x008c }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x008c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x008c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x006d
            com.google.android.gms.internal.ads.zzdlp r0 = r4.zzgps     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzvj r0 = r0.zzke()     // Catch:{ all -> 0x008c }
            boolean r0 = r0.zzchr     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x006d
            com.google.android.gms.internal.ads.zzcxm r0 = r4.zzgpw     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x006d
            com.google.android.gms.internal.ads.zzcxm r5 = r4.zzgpw     // Catch:{ all -> 0x008c }
            int r0 = com.google.android.gms.internal.ads.zzdmd.zzhcu     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzuw r0 = com.google.android.gms.internal.ads.zzdmb.zza(r0, r2, r2)     // Catch:{ all -> 0x008c }
            r5.zzg(r0)     // Catch:{ all -> 0x008c }
            monitor-exit(r4)
            return r1
        L_0x006d:
            com.google.android.gms.internal.ads.zzboe r5 = r4.zzb((com.google.android.gms.internal.ads.zzdln) r5)     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzbqb r0 = r5.zzafc()     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzdvt r0 = r0.zzaiv()     // Catch:{ all -> 0x008c }
            r4.zzgqd = r0     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzcxg r1 = new com.google.android.gms.internal.ads.zzcxg     // Catch:{ all -> 0x008c }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzbii r5 = r4.zzgmy     // Catch:{ all -> 0x008c }
            java.util.concurrent.Executor r5 = r5.zzadj()     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzdvl.zza(r0, r1, r5)     // Catch:{ all -> 0x008c }
            r5 = 1
            monitor-exit(r4)
            return r5
        L_0x008c:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcxd.zzg(com.google.android.gms.internal.ads.zzvc):boolean");
    }

    private final synchronized zzboe zzb(zzdln zzdln) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxp)).booleanValue()) {
            return this.zzgmy.zzadq().zzc(new zzbsg.zza().zzcd(this.zzgpr).zza(zzdln).zzajj()).zzc(new zzbxj.zza().zzake()).zza(new zzcwh(this.zzgqc)).zzb(new zzcbj(zzcdg.zzfyr, (zzwl) null)).zza(new zzbpa(this.zzgqa)).zzb(new zzbnd(this.zzfnx)).zzafp();
        }
        return this.zzgmy.zzadq().zzc(new zzbsg.zza().zzcd(this.zzgpr).zza(zzdln).zzajj()).zzc(new zzbxj.zza().zza((zzut) this.zzgpw, this.zzgmy.zzadj()).zza((zzut) this.zzgpx, this.zzgmy.zzadj()).zza((zzbsu) this.zzgpw, this.zzgmy.zzadj()).zza((zzbuj) this.zzgpw, this.zzgmy.zzadj()).zza((zzbsz) this.zzgpw, this.zzgmy.zzadj()).zza((AppEventListener) this.zzgpy, this.zzgmy.zzadj()).zza((zzbuy) this.zzgpz, this.zzgmy.zzadj()).zzake()).zza(new zzcwh(this.zzgqc)).zzb(new zzcbj(zzcdg.zzfyr, (zzwl) null)).zza(new zzbpa(this.zzgqa)).zzb(new zzbnd(this.zzfnx)).zzafp();
    }

    public final synchronized void destroy() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        if (this.zzgpm != null) {
            this.zzgpm.destroy();
        }
    }

    public final synchronized void pause() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzgpm != null) {
            this.zzgpm.zzail().zzbz((Context) null);
        }
    }

    public final synchronized void resume() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzgpm != null) {
            this.zzgpm.zzail().zzca((Context) null);
        }
    }

    public final void zza(zzwl zzwl) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzgpw.zzc(zzwl);
    }

    public final zzwl zzki() {
        return this.zzgpw.zzaqc();
    }

    public final void zza(zzxc zzxc) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzgpy.zzb(zzxc);
    }

    public final zzxc zzkh() {
        return this.zzgpy.zzaqb();
    }

    public final synchronized void zzkd() {
        Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
        if (this.zzgpm != null) {
            this.zzgpm.zzkd();
        }
    }

    public final synchronized zzvj zzke() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        if (this.zzgpm != null) {
            return zzdls.zzb(this.zzgpr, Collections.singletonList(this.zzgpm.zzahp()));
        }
        return this.zzgps.zzke();
    }

    public final synchronized void zza(zzvj zzvj) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        this.zzgps.zze(zzvj);
        this.zzgqb = zzvj;
        if (this.zzgpm != null) {
            this.zzgpm.zza(this.zzfnx, zzvj);
        }
    }

    public final synchronized String getMediationAdapterClassName() {
        if (this.zzgpm == null || this.zzgpm.zzaim() == null) {
            return null;
        }
        return this.zzgpm.zzaim().getMediationAdapterClassName();
    }

    public final synchronized String zzkf() {
        if (this.zzgpm == null || this.zzgpm.zzaim() == null) {
            return null;
        }
        return this.zzgpm.zzaim().getMediationAdapterClassName();
    }

    public final synchronized zzyf zzkg() {
        if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcwy)).booleanValue()) {
            return null;
        }
        if (this.zzgpm == null) {
            return null;
        }
        return this.zzgpm.zzaim();
    }

    public final synchronized void zza(zzxi zzxi) {
        Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.zzgps.zzc(zzxi);
    }

    public final synchronized void setManualImpressionsEnabled(boolean z) {
        Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
        this.zzgps.zzbp(z);
    }

    public final synchronized boolean isLoading() {
        return this.zzgqd != null && !this.zzgqd.isDone();
    }

    public final synchronized zzyg getVideoController() {
        Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        if (this.zzgpm == null) {
            return null;
        }
        return this.zzgpm.getVideoController();
    }

    public final synchronized String getAdUnitId() {
        return this.zzgps.zzass();
    }

    public final synchronized void zza(zzaac zzaac) {
        Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
        this.zzgps.zzc(zzaac);
    }

    public final void zza(zzwg zzwg) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzgpx.zzb(zzwg);
    }

    public final synchronized void zza(zzabq zzabq) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzgqc = zzabq;
    }

    public final synchronized void zzajp() {
        boolean z;
        ViewParent parent = this.zzfnx.getParent();
        if (!(parent instanceof View)) {
            z = false;
        } else {
            View view = (View) parent;
            z = zzp.zzkp().zza(view, view.getContext());
        }
        if (z) {
            zzvj zzke = this.zzgps.zzke();
            if (!(this.zzgpm == null || this.zzgpm.zzahu() == null || !this.zzgps.zzasv())) {
                zzke = zzdls.zzb(this.zzgpr, Collections.singletonList(this.zzgpm.zzahu()));
            }
            zzd(zzke);
            zzg(this.zzgps.zzasr());
            return;
        }
        this.zzgqa.zzdw(60);
    }

    public final void zza(zzya zzya) {
        Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        this.zzgpz.zzb(zzya);
    }

    public final void zza(zzxb zzxb) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    public final Bundle getAdMetadata() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    public final boolean isReady() {
        return false;
    }

    public final void showInterstitial() {
    }

    public final void stopLoading() {
    }

    public final void zza(zzaqv zzaqv) {
    }

    public final void zza(zzarb zzarb, String str) {
    }

    public final void zza(zzatt zzatt) {
    }

    public final void setUserId(String str) {
    }

    public final void zzbp(String str) {
    }

    public final void zza(zzym zzym) {
    }

    public final void zza(zzvm zzvm) {
    }

    public final void setImmersiveMode(boolean z) {
    }

    public final void zza(zzsi zzsi) {
    }
}
