package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcxo extends zzwx {
    private final Executor zzfmk;
    /* access modifiers changed from: private */
    public final zzbii zzgmy;
    private final Context zzgpr;
    private final zzdlp zzgps;
    /* access modifiers changed from: private */
    public final zzcxm zzgpw = new zzcxm();
    /* access modifiers changed from: private */
    public final zzcxl zzgpy = new zzcxl();
    /* access modifiers changed from: private */
    public final zzcxh zzgpz = new zzcxh();
    private zzabq zzgqc;
    /* access modifiers changed from: private */
    public zzdvt<zzbzr> zzgqd;
    /* access modifiers changed from: private */
    public final zzdje zzgqq = new zzdje(new zzdmt());
    /* access modifiers changed from: private */
    public zzbzr zzgqr;
    private boolean zzgqs;

    public zzcxo(zzbii zzbii, Context context, zzvj zzvj, String str) {
        zzdlp zzdlp = new zzdlp();
        this.zzgps = zzdlp;
        this.zzgqs = false;
        this.zzgmy = zzbii;
        zzdlp.zze(zzvj).zzgt(str);
        this.zzfmk = zzbii.zzadj();
        this.zzgpr = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x015b, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zza(com.google.android.gms.internal.ads.zzvc r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch:{ all -> 0x015c }
            com.google.android.gms.ads.internal.zzp.zzkp()     // Catch:{ all -> 0x015c }
            android.content.Context r0 = r4.zzgpr     // Catch:{ all -> 0x015c }
            boolean r0 = com.google.android.gms.internal.ads.zzayh.zzbe(r0)     // Catch:{ all -> 0x015c }
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.zzuu r0 = r5.zzchi     // Catch:{ all -> 0x015c }
            if (r0 != 0) goto L_0x002d
            java.lang.String r5 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.zzaxy.zzfc(r5)     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzcxm r5 = r4.zzgpw     // Catch:{ all -> 0x015c }
            if (r5 == 0) goto L_0x002b
            com.google.android.gms.internal.ads.zzcxm r5 = r4.zzgpw     // Catch:{ all -> 0x015c }
            int r0 = com.google.android.gms.internal.ads.zzdmd.zzhcr     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzuw r0 = com.google.android.gms.internal.ads.zzdmb.zza(r0, r2, r2)     // Catch:{ all -> 0x015c }
            r5.zzg(r0)     // Catch:{ all -> 0x015c }
        L_0x002b:
            monitor-exit(r4)
            return r1
        L_0x002d:
            com.google.android.gms.internal.ads.zzdvt<com.google.android.gms.internal.ads.zzbzr> r0 = r4.zzgqd     // Catch:{ all -> 0x015c }
            if (r0 != 0) goto L_0x015a
            boolean r0 = r4.zzaqd()     // Catch:{ all -> 0x015c }
            if (r0 == 0) goto L_0x0039
            goto L_0x015a
        L_0x0039:
            android.content.Context r0 = r4.zzgpr     // Catch:{ all -> 0x015c }
            boolean r1 = r5.zzcgy     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzdly.zze(r0, r1)     // Catch:{ all -> 0x015c }
            r4.zzgqr = r2     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzdlp r0 = r4.zzgps     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzdlp r5 = r0.zzh((com.google.android.gms.internal.ads.zzvc) r5)     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzdln r5 = r5.zzasu()     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzaai<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzaat.zzcxs     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzaap r1 = com.google.android.gms.internal.ads.zzwe.zzpu()     // Catch:{ all -> 0x015c }
            java.lang.Object r0 = r1.zzd(r0)     // Catch:{ all -> 0x015c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x015c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x015c }
            if (r0 == 0) goto L_0x009a
            com.google.android.gms.internal.ads.zzbii r0 = r4.zzgmy     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzcau r0 = r0.zzadt()     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzbsg$zza r1 = new com.google.android.gms.internal.ads.zzbsg$zza     // Catch:{ all -> 0x015c }
            r1.<init>()     // Catch:{ all -> 0x015c }
            android.content.Context r2 = r4.zzgpr     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzbsg$zza r1 = r1.zzcd(r2)     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzbsg$zza r5 = r1.zza((com.google.android.gms.internal.ads.zzdln) r5)     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzbsg r5 = r5.zzajj()     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzcau r5 = r0.zzd((com.google.android.gms.internal.ads.zzbsg) r5)     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzbxj$zza r0 = new com.google.android.gms.internal.ads.zzbxj$zza     // Catch:{ all -> 0x015c }
            r0.<init>()     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzbxj r0 = r0.zzake()     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzcau r5 = r5.zzd((com.google.android.gms.internal.ads.zzbxj) r0)     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzcwh r0 = new com.google.android.gms.internal.ads.zzcwh     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzabq r1 = r4.zzgqc     // Catch:{ all -> 0x015c }
            r0.<init>(r1)     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzcau r5 = r5.zzb(r0)     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzcar r5 = r5.zzafz()     // Catch:{ all -> 0x015c }
            goto L_0x0142
        L_0x009a:
            com.google.android.gms.internal.ads.zzbxj$zza r0 = new com.google.android.gms.internal.ads.zzbxj$zza     // Catch:{ all -> 0x015c }
            r0.<init>()     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzdje r1 = r4.zzgqq     // Catch:{ all -> 0x015c }
            if (r1 == 0) goto L_0x00c6
            com.google.android.gms.internal.ads.zzdje r1 = r4.zzgqq     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzbii r2 = r4.zzgmy     // Catch:{ all -> 0x015c }
            java.util.concurrent.Executor r2 = r2.zzadj()     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzbxj$zza r1 = r0.zza((com.google.android.gms.internal.ads.zzbsu) r1, (java.util.concurrent.Executor) r2)     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzdje r2 = r4.zzgqq     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzbii r3 = r4.zzgmy     // Catch:{ all -> 0x015c }
            java.util.concurrent.Executor r3 = r3.zzadj()     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzbxj$zza r1 = r1.zza((com.google.android.gms.internal.ads.zzbuj) r2, (java.util.concurrent.Executor) r3)     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzdje r2 = r4.zzgqq     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzbii r3 = r4.zzgmy     // Catch:{ all -> 0x015c }
            java.util.concurrent.Executor r3 = r3.zzadj()     // Catch:{ all -> 0x015c }
            r1.zza((com.google.android.gms.internal.ads.zzbsz) r2, (java.util.concurrent.Executor) r3)     // Catch:{ all -> 0x015c }
        L_0x00c6:
            com.google.android.gms.internal.ads.zzbii r1 = r4.zzgmy     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzcau r1 = r1.zzadt()     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzbsg$zza r2 = new com.google.android.gms.internal.ads.zzbsg$zza     // Catch:{ all -> 0x015c }
            r2.<init>()     // Catch:{ all -> 0x015c }
            android.content.Context r3 = r4.zzgpr     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzbsg$zza r2 = r2.zzcd(r3)     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzbsg$zza r5 = r2.zza((com.google.android.gms.internal.ads.zzdln) r5)     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzbsg r5 = r5.zzajj()     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzcau r5 = r1.zzd((com.google.android.gms.internal.ads.zzbsg) r5)     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzcxm r1 = r4.zzgpw     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzbii r2 = r4.zzgmy     // Catch:{ all -> 0x015c }
            java.util.concurrent.Executor r2 = r2.zzadj()     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzbxj$zza r0 = r0.zza((com.google.android.gms.internal.ads.zzbsu) r1, (java.util.concurrent.Executor) r2)     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzcxm r1 = r4.zzgpw     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzbii r2 = r4.zzgmy     // Catch:{ all -> 0x015c }
            java.util.concurrent.Executor r2 = r2.zzadj()     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzbxj$zza r0 = r0.zza((com.google.android.gms.internal.ads.zzbuj) r1, (java.util.concurrent.Executor) r2)     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzcxm r1 = r4.zzgpw     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzbii r2 = r4.zzgmy     // Catch:{ all -> 0x015c }
            java.util.concurrent.Executor r2 = r2.zzadj()     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzbxj$zza r0 = r0.zza((com.google.android.gms.internal.ads.zzbsz) r1, (java.util.concurrent.Executor) r2)     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzcxm r1 = r4.zzgpw     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzbii r2 = r4.zzgmy     // Catch:{ all -> 0x015c }
            java.util.concurrent.Executor r2 = r2.zzadj()     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzbxj$zza r0 = r0.zza((com.google.android.gms.internal.ads.zzut) r1, (java.util.concurrent.Executor) r2)     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzcxl r1 = r4.zzgpy     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzbii r2 = r4.zzgmy     // Catch:{ all -> 0x015c }
            java.util.concurrent.Executor r2 = r2.zzadj()     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzbxj$zza r0 = r0.zza((com.google.android.gms.ads.doubleclick.AppEventListener) r1, (java.util.concurrent.Executor) r2)     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzcxh r1 = r4.zzgpz     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzbii r2 = r4.zzgmy     // Catch:{ all -> 0x015c }
            java.util.concurrent.Executor r2 = r2.zzadj()     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzbxj$zza r0 = r0.zza((com.google.android.gms.internal.ads.zzbuy) r1, (java.util.concurrent.Executor) r2)     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzbxj r0 = r0.zzake()     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzcau r5 = r5.zzd((com.google.android.gms.internal.ads.zzbxj) r0)     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzcwh r0 = new com.google.android.gms.internal.ads.zzcwh     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzabq r1 = r4.zzgqc     // Catch:{ all -> 0x015c }
            r0.<init>(r1)     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzcau r5 = r5.zzb(r0)     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzcar r5 = r5.zzafz()     // Catch:{ all -> 0x015c }
        L_0x0142:
            com.google.android.gms.internal.ads.zzbqb r0 = r5.zzafc()     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzdvt r0 = r0.zzaiv()     // Catch:{ all -> 0x015c }
            r4.zzgqd = r0     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzcxn r1 = new com.google.android.gms.internal.ads.zzcxn     // Catch:{ all -> 0x015c }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x015c }
            java.util.concurrent.Executor r5 = r4.zzfmk     // Catch:{ all -> 0x015c }
            com.google.android.gms.internal.ads.zzdvl.zza(r0, r1, r5)     // Catch:{ all -> 0x015c }
            r5 = 1
            monitor-exit(r4)
            return r5
        L_0x015a:
            monitor-exit(r4)
            return r1
        L_0x015c:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcxo.zza(com.google.android.gms.internal.ads.zzvc):boolean");
    }

    public final synchronized void destroy() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        if (this.zzgqr != null) {
            this.zzgqr.zzail().zzcb((Context) null);
        }
    }

    public final synchronized void pause() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzgqr != null) {
            this.zzgqr.zzail().zzbz((Context) null);
        }
    }

    public final synchronized void resume() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzgqr != null) {
            this.zzgqr.zzail().zzca((Context) null);
        }
    }

    public final void zza(zzwl zzwl) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzgpw.zzc(zzwl);
    }

    public final void zza(zzxc zzxc) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzgpy.zzb(zzxc);
    }

    public final synchronized void showInterstitial() {
        Preconditions.checkMainThread("showInterstitial must be called on the main UI thread.");
        if (this.zzgqr != null) {
            this.zzgqr.zzbi(this.zzgqs);
        }
    }

    public final synchronized String getMediationAdapterClassName() {
        if (this.zzgqr == null || this.zzgqr.zzaim() == null) {
            return null;
        }
        return this.zzgqr.zzaim().getMediationAdapterClassName();
    }

    public final synchronized String zzkf() {
        if (this.zzgqr == null || this.zzgqr.zzaim() == null) {
            return null;
        }
        return this.zzgqr.zzaim().getMediationAdapterClassName();
    }

    public final synchronized zzyf zzkg() {
        if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcwy)).booleanValue()) {
            return null;
        }
        if (this.zzgqr == null) {
            return null;
        }
        return this.zzgqr.zzaim();
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

    public final synchronized boolean isReady() {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzaqd();
    }

    public final synchronized String getAdUnitId() {
        return this.zzgps.zzass();
    }

    public final zzxc zzkh() {
        return this.zzgpy.zzaqb();
    }

    public final zzwl zzki() {
        return this.zzgpw.zzaqc();
    }

    public final synchronized void setImmersiveMode(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzgqs = z;
    }

    public final synchronized void zza(zzaac zzaac) {
        this.zzgps.zzc(zzaac);
    }

    public final synchronized void zza(zzabq zzabq) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzgqc = zzabq;
    }

    private final synchronized boolean zzaqd() {
        return this.zzgqr != null && !this.zzgqr.isClosed();
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

    public final IObjectWrapper zzkc() {
        return null;
    }

    public final zzvj zzke() {
        return null;
    }

    public final void zza(zzvj zzvj) {
    }

    public final void stopLoading() {
    }

    public final void zzkd() {
    }

    public final void zza(zzaqv zzaqv) {
    }

    public final void zza(zzarb zzarb, String str) {
    }

    public final void zza(zzwg zzwg) {
    }

    public final void zza(zzatt zzatt) {
        this.zzgqq.zzb(zzatt);
    }

    public final void setUserId(String str) {
    }

    public final void zzbp(String str) {
    }

    public final zzyg getVideoController() {
        return null;
    }

    public final void zza(zzym zzym) {
    }

    public final void zza(zzvm zzvm) {
    }

    public final void zza(zzsi zzsi) {
    }
}
