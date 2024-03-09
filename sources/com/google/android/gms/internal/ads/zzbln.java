package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbln implements zzbsu, zzbti, zzbtm, zzbuj, zzut {
    private final Executor executor;
    private final View view;
    private final zzabt zzeno;
    private final ScheduledExecutorService zzflf;
    /* access modifiers changed from: private */
    public final zzdlj zzflg;
    /* access modifiers changed from: private */
    public final zzdkx zzflh;
    /* access modifiers changed from: private */
    public final zzdps zzfli;
    private final zzeg zzflj;
    private final zzaby zzflk;
    private boolean zzfll;
    private boolean zzflm;
    private final Context zzvr;

    public zzbln(Context context, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzdlj zzdlj, zzdkx zzdkx, zzdps zzdps, View view2, zzeg zzeg, zzabt zzabt, zzaby zzaby) {
        this.zzvr = context;
        this.executor = executor2;
        this.zzflf = scheduledExecutorService;
        this.zzflg = zzdlj;
        this.zzflh = zzdkx;
        this.zzfli = zzdps;
        this.zzflj = zzeg;
        this.view = view2;
        this.zzeno = zzabt;
        this.zzflk = zzaby;
    }

    public final synchronized void onAdLoaded() {
        if (this.zzfll) {
            ArrayList arrayList = new ArrayList(this.zzflh.zzdit);
            arrayList.addAll(this.zzflh.zzhai);
            this.zzfli.zza(this.zzflg, this.zzflh, true, (String) null, (String) null, arrayList);
        } else {
            this.zzfli.zza(this.zzflg, this.zzflh, this.zzflh.zzhak);
            this.zzfli.zza(this.zzflg, this.zzflh, this.zzflh.zzhai);
        }
        this.zzfll = true;
    }

    public final void onAdClicked() {
        if (!zzacl.zzdah.get().booleanValue()) {
            zzdps zzdps = this.zzfli;
            zzdlj zzdlj = this.zzflg;
            zzdkx zzdkx = this.zzflh;
            zzdps.zza(zzdlj, zzdkx, zzdkx.zzdis);
            return;
        }
        zzdvl.zza(zzdvc.zzg(this.zzflk.zza(this.zzvr, (String) null, this.zzeno.zzrs(), this.zzeno.zzrt())).zza(((Long) zzwe.zzpu().zzd(zzaat.zzcoh)).longValue(), TimeUnit.MILLISECONDS, this.zzflf), new zzblq(this), this.executor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onAdImpression() {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.zzflm     // Catch:{ all -> 0x007e }
            if (r0 != 0) goto L_0x007c
            com.google.android.gms.internal.ads.zzaai<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzaat.zzcre     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.ads.zzaap r1 = com.google.android.gms.internal.ads.zzwe.zzpu()     // Catch:{ all -> 0x007e }
            java.lang.Object r0 = r1.zzd(r0)     // Catch:{ all -> 0x007e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x007e }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x007e }
            r1 = 0
            if (r0 == 0) goto L_0x0028
            com.google.android.gms.internal.ads.zzeg r0 = r9.zzflj     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.ads.zzdw r0 = r0.zzca()     // Catch:{ all -> 0x007e }
            android.content.Context r2 = r9.zzvr     // Catch:{ all -> 0x007e }
            android.view.View r3 = r9.view     // Catch:{ all -> 0x007e }
            java.lang.String r0 = r0.zza((android.content.Context) r2, (android.view.View) r3, (android.app.Activity) r1)     // Catch:{ all -> 0x007e }
            r5 = r0
            goto L_0x0029
        L_0x0028:
            r5 = r1
        L_0x0029:
            com.google.android.gms.internal.ads.zzaca<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzacl.zzdai     // Catch:{ all -> 0x007e }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x007e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x007e }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x007e }
            r8 = 1
            if (r0 != 0) goto L_0x004b
            com.google.android.gms.internal.ads.zzdps r1 = r9.zzfli     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.ads.zzdlj r2 = r9.zzflg     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.ads.zzdkx r3 = r9.zzflh     // Catch:{ all -> 0x007e }
            r4 = 0
            r6 = 0
            com.google.android.gms.internal.ads.zzdkx r0 = r9.zzflh     // Catch:{ all -> 0x007e }
            java.util.List<java.lang.String> r7 = r0.zzdit     // Catch:{ all -> 0x007e }
            r1.zza(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x007e }
            r9.zzflm = r8     // Catch:{ all -> 0x007e }
            monitor-exit(r9)
            return
        L_0x004b:
            com.google.android.gms.internal.ads.zzaby r0 = r9.zzflk     // Catch:{ all -> 0x007e }
            android.content.Context r2 = r9.zzvr     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.ads.zzdvt r0 = r0.zzc(r2, r1)     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.ads.zzdvc r0 = com.google.android.gms.internal.ads.zzdvc.zzg(r0)     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.ads.zzaai<java.lang.Long> r1 = com.google.android.gms.internal.ads.zzaat.zzcoh     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.ads.zzaap r2 = com.google.android.gms.internal.ads.zzwe.zzpu()     // Catch:{ all -> 0x007e }
            java.lang.Object r1 = r2.zzd(r1)     // Catch:{ all -> 0x007e }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x007e }
            long r1 = r1.longValue()     // Catch:{ all -> 0x007e }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x007e }
            java.util.concurrent.ScheduledExecutorService r4 = r9.zzflf     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.ads.zzdvc r0 = r0.zza((long) r1, (java.util.concurrent.TimeUnit) r3, (java.util.concurrent.ScheduledExecutorService) r4)     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.ads.zzblp r1 = new com.google.android.gms.internal.ads.zzblp     // Catch:{ all -> 0x007e }
            r1.<init>(r9, r5)     // Catch:{ all -> 0x007e }
            java.util.concurrent.Executor r2 = r9.executor     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.ads.zzdvl.zza(r0, r1, r2)     // Catch:{ all -> 0x007e }
            r9.zzflm = r8     // Catch:{ all -> 0x007e }
        L_0x007c:
            monitor-exit(r9)
            return
        L_0x007e:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbln.onAdImpression():void");
    }

    public final void onAdOpened() {
    }

    public final void onAdClosed() {
    }

    public final void onAdLeftApplication() {
    }

    public final void zzb(zzatj zzatj, String str, String str2) {
        zzdps zzdps = this.zzfli;
        zzdlj zzdlj = this.zzflg;
        zzdkx zzdkx = this.zzflh;
        zzdps.zza(zzdlj, zzdkx, zzdkx.zzdsj, zzatj);
    }

    public final void onRewardedVideoStarted() {
        zzdps zzdps = this.zzfli;
        zzdlj zzdlj = this.zzflg;
        zzdkx zzdkx = this.zzflh;
        zzdps.zza(zzdlj, zzdkx, zzdkx.zzdsi);
    }

    public final void onRewardedVideoCompleted() {
        zzdps zzdps = this.zzfli;
        zzdlj zzdlj = this.zzflg;
        zzdkx zzdkx = this.zzflh;
        zzdps.zza(zzdlj, zzdkx, zzdkx.zzhaj);
    }

    public final void zzf(zzuw zzuw) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcpw)).booleanValue()) {
            zzdps zzdps = this.zzfli;
            zzdlj zzdlj = this.zzflg;
            zzdkx zzdkx = this.zzflh;
            zzdps.zza(zzdlj, zzdkx, zzdkx.zzhal);
        }
    }
}
