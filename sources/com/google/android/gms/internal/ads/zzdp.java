package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdp implements zzdw {
    private static zzdp zzvq;
    private final Context zzvr;
    private final zzdrq zzvs;
    private final zzdrv zzvt;
    private final zzdsa zzvu;
    private final zzew zzvv;
    /* access modifiers changed from: private */
    public final zzdpy zzvw;
    private final Executor zzvx;
    private final zzgo zzvy;
    private final zzdrw zzvz;
    private volatile long zzwa = 0;
    /* access modifiers changed from: private */
    public final Object zzwb = new Object();
    /* access modifiers changed from: private */
    public volatile boolean zzwc;

    public static synchronized zzdp zza(String str, Context context, boolean z) {
        zzdp zzdp;
        synchronized (zzdp.class) {
            if (zzvq == null) {
                zzdqc zzava = zzdqc.zzavd().zzhb(str).zzbq(z).zzava();
                ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
                zzdp zza = zza(context, zzdpy.zza(context, newCachedThreadPool), zzava, (Executor) newCachedThreadPool);
                zzvq = zza;
                zza.zzbq();
                zzvq.zzbt();
            }
            zzdp = zzvq;
        }
        return zzdp;
    }

    static zzdp zza(Context context, zzdpy zzdpy, zzdqc zzdqc) {
        return zza(context, zzdpy, zzdqc, (Executor) Executors.newCachedThreadPool());
    }

    private static zzdp zza(Context context, zzdpy zzdpy, zzdqc zzdqc, Executor executor) {
        zzdqo zza = zzdqo.zza(context, executor, zzdpy, zzdqc);
        zzev zzev = new zzev(context);
        zzew zzew = new zzew(zzdqc, zza, new zzfi(context, zzev), zzev);
        zzgo zzavs = new zzdre(context, zzdpy).zzavs();
        zzdpx zzdpx = new zzdpx();
        return new zzdp(context, zzdpy, new zzdrq(context, zzavs), new zzdrv(context, zzavs), new zzdsa(context, zzew, zzdpy, zzdpx), zzew, executor, zzdpx, zzavs);
    }

    private zzdp(Context context, zzdpy zzdpy, zzdrq zzdrq, zzdrv zzdrv, zzdsa zzdsa, zzew zzew, Executor executor, zzdpx zzdpx, zzgo zzgo) {
        this.zzvr = context;
        this.zzvw = zzdpy;
        this.zzvs = zzdrq;
        this.zzvt = zzdrv;
        this.zzvu = zzdsa;
        this.zzvv = zzew;
        this.zzvx = executor;
        this.zzvy = zzgo;
        this.zzvz = new zzds(this, zzdpx);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzbq() {
        long currentTimeMillis = System.currentTimeMillis();
        zzdrn zzp = zzp(zzdry.zzhkz);
        if (zzp == null || zzp.zza()) {
            this.zzvw.zzg(4013, System.currentTimeMillis() - currentTimeMillis);
        } else {
            this.zzvu.zzb(zzp);
        }
    }

    public final void zzbr() {
        this.zzvx.execute(new zzdr(this));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b2 A[Catch:{ zzegz -> 0x0121 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf A[Catch:{ zzegz -> 0x0121 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzbs() {
        /*
            r11 = this;
            long r0 = java.lang.System.currentTimeMillis()
            int r2 = com.google.android.gms.internal.ads.zzdry.zzhkz
            com.google.android.gms.internal.ads.zzdrn r2 = r11.zzp(r2)
            r3 = 0
            if (r2 == 0) goto L_0x0022
            com.google.android.gms.internal.ads.zzgr r3 = r2.zzavw()
            java.lang.String r3 = r3.zzdg()
            com.google.android.gms.internal.ads.zzgr r2 = r2.zzavw()
            java.lang.String r2 = r2.zzdh()
            r8 = r2
            r7 = r3
            goto L_0x0024
        L_0x0022:
            r7 = r3
            r8 = r7
        L_0x0024:
            android.content.Context r4 = r11.zzvr     // Catch:{ zzegz -> 0x0121 }
            r5 = 1
            com.google.android.gms.internal.ads.zzgo r6 = r11.zzvy     // Catch:{ zzegz -> 0x0121 }
            java.lang.String r9 = "1"
            com.google.android.gms.internal.ads.zzdpy r10 = r11.zzvw     // Catch:{ zzegz -> 0x0121 }
            com.google.android.gms.internal.ads.zzdru r2 = com.google.android.gms.internal.ads.zzdqk.zza(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ zzegz -> 0x0121 }
            byte[] r3 = r2.zzhkv     // Catch:{ zzegz -> 0x0121 }
            if (r3 == 0) goto L_0x0114
            byte[] r3 = r2.zzhkv     // Catch:{ zzegz -> 0x0121 }
            int r3 = r3.length     // Catch:{ zzegz -> 0x0121 }
            if (r3 != 0) goto L_0x003e
            goto L_0x0114
        L_0x003e:
            byte[] r3 = r2.zzhkv     // Catch:{ zzegz -> 0x0121 }
            com.google.android.gms.internal.ads.zzeff r3 = com.google.android.gms.internal.ads.zzeff.zzu(r3)     // Catch:{ zzegz -> 0x0121 }
            com.google.android.gms.internal.ads.zzegc r4 = com.google.android.gms.internal.ads.zzegc.zzbey()     // Catch:{ zzegz -> 0x0121 }
            com.google.android.gms.internal.ads.zzgq r3 = com.google.android.gms.internal.ads.zzgq.zza(r3, r4)     // Catch:{ zzegz -> 0x0121 }
            com.google.android.gms.internal.ads.zzgr r4 = r3.zzdc()     // Catch:{ zzegz -> 0x0121 }
            java.lang.String r4 = r4.zzdg()     // Catch:{ zzegz -> 0x0121 }
            boolean r4 = r4.isEmpty()     // Catch:{ zzegz -> 0x0121 }
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L_0x00af
            com.google.android.gms.internal.ads.zzgr r4 = r3.zzdc()     // Catch:{ zzegz -> 0x0121 }
            java.lang.String r4 = r4.zzdh()     // Catch:{ zzegz -> 0x0121 }
            boolean r4 = r4.isEmpty()     // Catch:{ zzegz -> 0x0121 }
            if (r4 != 0) goto L_0x00af
            com.google.android.gms.internal.ads.zzeff r4 = r3.zzde()     // Catch:{ zzegz -> 0x0121 }
            byte[] r4 = r4.toByteArray()     // Catch:{ zzegz -> 0x0121 }
            int r4 = r4.length     // Catch:{ zzegz -> 0x0121 }
            if (r4 != 0) goto L_0x0077
            goto L_0x00af
        L_0x0077:
            int r4 = com.google.android.gms.internal.ads.zzdry.zzhkz     // Catch:{ zzegz -> 0x0121 }
            com.google.android.gms.internal.ads.zzdrn r4 = r11.zzp(r4)     // Catch:{ zzegz -> 0x0121 }
            if (r4 != 0) goto L_0x0080
            goto L_0x00b0
        L_0x0080:
            com.google.android.gms.internal.ads.zzgr r4 = r4.zzavw()     // Catch:{ zzegz -> 0x0121 }
            if (r4 != 0) goto L_0x0087
            goto L_0x00b0
        L_0x0087:
            com.google.android.gms.internal.ads.zzgr r7 = r3.zzdc()     // Catch:{ zzegz -> 0x0121 }
            java.lang.String r7 = r7.zzdg()     // Catch:{ zzegz -> 0x0121 }
            java.lang.String r8 = r4.zzdg()     // Catch:{ zzegz -> 0x0121 }
            boolean r7 = r7.equals(r8)     // Catch:{ zzegz -> 0x0121 }
            if (r7 == 0) goto L_0x00ae
            com.google.android.gms.internal.ads.zzgr r7 = r3.zzdc()     // Catch:{ zzegz -> 0x0121 }
            java.lang.String r7 = r7.zzdh()     // Catch:{ zzegz -> 0x0121 }
            java.lang.String r4 = r4.zzdh()     // Catch:{ zzegz -> 0x0121 }
            boolean r4 = r7.equals(r4)     // Catch:{ zzegz -> 0x0121 }
            if (r4 != 0) goto L_0x00ac
            goto L_0x00ae
        L_0x00ac:
            r5 = 0
            goto L_0x00b0
        L_0x00ae:
            goto L_0x00b0
        L_0x00af:
            r5 = 0
        L_0x00b0:
            if (r5 != 0) goto L_0x00bf
            com.google.android.gms.internal.ads.zzdpy r2 = r11.zzvw     // Catch:{ zzegz -> 0x0121 }
            r3 = 5010(0x1392, float:7.02E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ zzegz -> 0x0121 }
            long r4 = r4 - r0
            r2.zzg((int) r3, (long) r4)     // Catch:{ zzegz -> 0x0121 }
            return
        L_0x00bf:
            com.google.android.gms.internal.ads.zzdrw r4 = r11.zzvz     // Catch:{ zzegz -> 0x0121 }
            int r2 = r2.status     // Catch:{ zzegz -> 0x0121 }
            com.google.android.gms.internal.ads.zzaai<java.lang.Boolean> r5 = com.google.android.gms.internal.ads.zzaat.zzcqf     // Catch:{ zzegz -> 0x0121 }
            com.google.android.gms.internal.ads.zzaap r7 = com.google.android.gms.internal.ads.zzwe.zzpu()     // Catch:{ zzegz -> 0x0121 }
            java.lang.Object r5 = r7.zzd(r5)     // Catch:{ zzegz -> 0x0121 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ zzegz -> 0x0121 }
            boolean r5 = r5.booleanValue()     // Catch:{ zzegz -> 0x0121 }
            if (r5 == 0) goto L_0x00ea
            r5 = 3
            if (r2 != r5) goto L_0x00df
            com.google.android.gms.internal.ads.zzdrv r2 = r11.zzvt     // Catch:{ zzegz -> 0x0121 }
            boolean r6 = r2.zza(r3)     // Catch:{ zzegz -> 0x0121 }
            goto L_0x00f0
        L_0x00df:
            r5 = 4
            if (r2 != r5) goto L_0x00e9
            com.google.android.gms.internal.ads.zzdrv r2 = r11.zzvt     // Catch:{ zzegz -> 0x0121 }
            boolean r6 = r2.zza(r3, r4)     // Catch:{ zzegz -> 0x0121 }
            goto L_0x00f0
        L_0x00e9:
            goto L_0x00f0
        L_0x00ea:
            com.google.android.gms.internal.ads.zzdrq r2 = r11.zzvs     // Catch:{ zzegz -> 0x0121 }
            boolean r6 = r2.zza(r3, r4)     // Catch:{ zzegz -> 0x0121 }
        L_0x00f0:
            if (r6 != 0) goto L_0x00ff
            com.google.android.gms.internal.ads.zzdpy r2 = r11.zzvw     // Catch:{ zzegz -> 0x0121 }
            r3 = 4009(0xfa9, float:5.618E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ zzegz -> 0x0121 }
            long r4 = r4 - r0
            r2.zzg((int) r3, (long) r4)     // Catch:{ zzegz -> 0x0121 }
            return
        L_0x00ff:
            com.google.android.gms.internal.ads.zzdsa r2 = r11.zzvu     // Catch:{ zzegz -> 0x0121 }
            int r3 = com.google.android.gms.internal.ads.zzdry.zzhkz     // Catch:{ zzegz -> 0x0121 }
            com.google.android.gms.internal.ads.zzdrn r3 = r11.zzp(r3)     // Catch:{ zzegz -> 0x0121 }
            r2.zzb(r3)     // Catch:{ zzegz -> 0x0121 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ zzegz -> 0x0121 }
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r11.zzwa = r2     // Catch:{ zzegz -> 0x0121 }
            return
        L_0x0114:
            com.google.android.gms.internal.ads.zzdpy r2 = r11.zzvw     // Catch:{ zzegz -> 0x0121 }
            r3 = 5009(0x1391, float:7.019E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ zzegz -> 0x0121 }
            long r4 = r4 - r0
            r2.zzg((int) r3, (long) r4)     // Catch:{ zzegz -> 0x0121 }
            return
        L_0x0121:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzdpy r3 = r11.zzvw
            r4 = 4002(0xfa2, float:5.608E-42)
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r0
            r3.zza((int) r4, (long) r5, (java.lang.Exception) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdp.zzbs():void");
    }

    public final void zza(MotionEvent motionEvent) {
        zzdqe zzawh = this.zzvu.zzawh();
        if (zzawh != null) {
            try {
                zzawh.zza((String) null, motionEvent);
            } catch (zzdrx e) {
                this.zzvw.zza(e.zzawg(), -1, (Exception) e);
            }
        }
    }

    public final void zza(int i, int i2, int i3) {
    }

    public final String zza(Context context, String str, View view, Activity activity) {
        zzbt();
        zzdqe zzawh = this.zzvu.zzawh();
        if (zzawh == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zza = zzawh.zza(context, (String) null, str, view, activity);
        this.zzvw.zza(5000, System.currentTimeMillis() - currentTimeMillis, zza, (Map<String, String>) null);
        return zza;
    }

    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, (Activity) null);
    }

    public final void zzb(View view) {
        this.zzvv.zzc(view);
    }

    public final String zza(Context context, View view, Activity activity) {
        zzbt();
        zzdqe zzawh = this.zzvu.zzawh();
        if (zzawh == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzb = zzawh.zzb(context, (String) null, view, activity);
        this.zzvw.zza(5002, System.currentTimeMillis() - currentTimeMillis, zzb, (Map<String, String>) null);
        return zzb;
    }

    public final String zzb(Context context) {
        zzbt();
        zzdqe zzawh = this.zzvu.zzawh();
        if (zzawh == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzv = zzawh.zzv(context, (String) null);
        this.zzvw.zza(5001, System.currentTimeMillis() - currentTimeMillis, zzv, (Map<String, String>) null);
        return zzv;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzbt() {
        /*
            r6 = this;
            boolean r0 = r6.zzwc
            if (r0 != 0) goto L_0x0033
            java.lang.Object r0 = r6.zzwb
            monitor-enter(r0)
            boolean r1 = r6.zzwc     // Catch:{ all -> 0x0030 }
            if (r1 != 0) goto L_0x002e
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0030 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            long r3 = r6.zzwa     // Catch:{ all -> 0x0030 }
            long r1 = r1 - r3
            r3 = 3600(0xe10, double:1.7786E-320)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x001d:
            com.google.android.gms.internal.ads.zzdsa r1 = r6.zzvu     // Catch:{ all -> 0x0030 }
            com.google.android.gms.internal.ads.zzdrn r1 = r1.zzawi()     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002b
            boolean r1 = r1.zzfg(r3)     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002e
        L_0x002b:
            r6.zzbr()     // Catch:{ all -> 0x0030 }
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0030:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r1
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdp.zzbt():void");
    }

    private final zzdrn zzp(int i) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcqf)).booleanValue()) {
            return this.zzvt.zzp(i);
        }
        return this.zzvs.zzp(i);
    }
}
