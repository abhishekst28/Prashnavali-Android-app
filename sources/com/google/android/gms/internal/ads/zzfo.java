package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcf;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzfo extends zzgm {
    private static final zzgl<zzcy> zzaax = new zzgl<>();
    private final Context zzaav;
    private zzby.zza zzaay = null;

    public zzfo(zzex zzex, String str, String str2, zzcf.zza.C0004zza zza, int i, int i2, Context context, zzby.zza zza2) {
        super(zzex, str, str2, zza, i, 27);
        this.zzaav = context;
        this.zzaay = zza2;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzcw() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzgl<com.google.android.gms.internal.ads.zzcy> r0 = zzaax
            android.content.Context r1 = r8.zzaav
            java.lang.String r1 = r1.getPackageName()
            java.util.concurrent.atomic.AtomicReference r0 = r0.zzat(r1)
            monitor-enter(r0)
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0123 }
            com.google.android.gms.internal.ads.zzcy r1 = (com.google.android.gms.internal.ads.zzcy) r1     // Catch:{ all -> 0x0123 }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0036
            java.lang.String r4 = r1.zznw     // Catch:{ all -> 0x0123 }
            boolean r4 = com.google.android.gms.internal.ads.zzfg.zzas(r4)     // Catch:{ all -> 0x0123 }
            if (r4 != 0) goto L_0x0036
            java.lang.String r4 = r1.zznw     // Catch:{ all -> 0x0123 }
            java.lang.String r5 = "E"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0123 }
            if (r4 != 0) goto L_0x0036
            java.lang.String r1 = r1.zznw     // Catch:{ all -> 0x0123 }
            java.lang.String r4 = "0000000000000000000000000000000000000000000000000000000000000000"
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0123 }
            if (r1 == 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r1 = 0
            goto L_0x0037
        L_0x0036:
            r1 = 1
        L_0x0037:
            if (r1 == 0) goto L_0x00ef
            com.google.android.gms.internal.ads.zzby$zza r1 = r8.zzaay     // Catch:{ all -> 0x0123 }
            java.lang.String r1 = zza(r1)     // Catch:{ all -> 0x0123 }
            boolean r1 = com.google.android.gms.internal.ads.zzfg.zzas(r1)     // Catch:{ all -> 0x0123 }
            if (r1 != 0) goto L_0x0049
            com.google.android.gms.internal.ads.zzcb r1 = com.google.android.gms.internal.ads.zzcb.ENUM_SIGNAL_SOURCE_CALLER_PROVIDED     // Catch:{ all -> 0x0123 }
            goto L_0x0083
        L_0x0049:
            com.google.android.gms.internal.ads.zzby$zza r1 = r8.zzaay     // Catch:{ all -> 0x0123 }
            java.lang.String r4 = zza(r1)     // Catch:{ all -> 0x0123 }
            boolean r4 = com.google.android.gms.internal.ads.zzfg.zzas(r4)     // Catch:{ all -> 0x0123 }
            if (r4 == 0) goto L_0x006b
            if (r1 == 0) goto L_0x006b
            boolean r4 = r1.zzx()     // Catch:{ all -> 0x0123 }
            if (r4 == 0) goto L_0x006b
            com.google.android.gms.internal.ads.zzby$zzb r1 = r1.zzy()     // Catch:{ all -> 0x0123 }
            com.google.android.gms.internal.ads.zzcb r1 = r1.zzac()     // Catch:{ all -> 0x0123 }
            com.google.android.gms.internal.ads.zzcb r4 = com.google.android.gms.internal.ads.zzcb.ENUM_SIGNAL_SOURCE_GASS     // Catch:{ all -> 0x0123 }
            if (r1 != r4) goto L_0x006b
            r1 = 1
            goto L_0x006c
        L_0x006b:
            r1 = 0
        L_0x006c:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0123 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0123 }
            if (r1 == 0) goto L_0x0081
            com.google.android.gms.internal.ads.zzex r1 = r8.zzwg     // Catch:{ all -> 0x0123 }
            boolean r1 = r1.zzcm()     // Catch:{ all -> 0x0123 }
            if (r1 == 0) goto L_0x0081
            com.google.android.gms.internal.ads.zzcb r1 = com.google.android.gms.internal.ads.zzcb.ENUM_SIGNAL_SOURCE_GASS     // Catch:{ all -> 0x0123 }
            goto L_0x0083
        L_0x0081:
            com.google.android.gms.internal.ads.zzcb r1 = com.google.android.gms.internal.ads.zzcb.ENUM_SIGNAL_SOURCE_ADSHIELD     // Catch:{ all -> 0x0123 }
        L_0x0083:
            java.lang.reflect.Method r4 = r8.zzabm     // Catch:{ all -> 0x0123 }
            r5 = 0
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0123 }
            android.content.Context r7 = r8.zzaav     // Catch:{ all -> 0x0123 }
            r6[r2] = r7     // Catch:{ all -> 0x0123 }
            com.google.android.gms.internal.ads.zzcb r7 = com.google.android.gms.internal.ads.zzcb.ENUM_SIGNAL_SOURCE_ADSHIELD     // Catch:{ all -> 0x0123 }
            if (r1 != r7) goto L_0x0093
            r2 = 1
        L_0x0093:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0123 }
            r6[r3] = r2     // Catch:{ all -> 0x0123 }
            com.google.android.gms.internal.ads.zzaai<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.zzaat.zzcqr     // Catch:{ all -> 0x0123 }
            com.google.android.gms.internal.ads.zzaap r7 = com.google.android.gms.internal.ads.zzwe.zzpu()     // Catch:{ all -> 0x0123 }
            java.lang.Object r2 = r7.zzd(r2)     // Catch:{ all -> 0x0123 }
            r7 = 2
            r6[r7] = r2     // Catch:{ all -> 0x0123 }
            java.lang.Object r2 = r4.invoke(r5, r6)     // Catch:{ all -> 0x0123 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0123 }
            com.google.android.gms.internal.ads.zzcy r4 = new com.google.android.gms.internal.ads.zzcy     // Catch:{ all -> 0x0123 }
            r4.<init>(r2)     // Catch:{ all -> 0x0123 }
            java.lang.String r2 = r4.zznw     // Catch:{ all -> 0x0123 }
            boolean r2 = com.google.android.gms.internal.ads.zzfg.zzas(r2)     // Catch:{ all -> 0x0123 }
            if (r2 != 0) goto L_0x00c4
            java.lang.String r2 = r4.zznw     // Catch:{ all -> 0x0123 }
            java.lang.String r5 = "E"
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x0123 }
            if (r2 == 0) goto L_0x00eb
        L_0x00c4:
            int[] r2 = com.google.android.gms.internal.ads.zzfn.zzaaw     // Catch:{ all -> 0x0123 }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x0123 }
            r1 = r2[r1]     // Catch:{ all -> 0x0123 }
            if (r1 == r3) goto L_0x00de
            if (r1 == r7) goto L_0x00d1
            goto L_0x00eb
        L_0x00d1:
            java.lang.String r1 = r8.zzcx()     // Catch:{ all -> 0x0123 }
            boolean r2 = com.google.android.gms.internal.ads.zzfg.zzas(r1)     // Catch:{ all -> 0x0123 }
            if (r2 != 0) goto L_0x00eb
            r4.zznw = r1     // Catch:{ all -> 0x0123 }
            goto L_0x00eb
        L_0x00de:
            com.google.android.gms.internal.ads.zzby$zza r1 = r8.zzaay     // Catch:{ all -> 0x0123 }
            com.google.android.gms.internal.ads.zzby$zzc r1 = r1.zzaa()     // Catch:{ all -> 0x0123 }
            java.lang.String r1 = r1.zzaf()     // Catch:{ all -> 0x0123 }
            r4.zznw = r1     // Catch:{ all -> 0x0123 }
        L_0x00eb:
            r0.set(r4)     // Catch:{ all -> 0x0123 }
        L_0x00ef:
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0123 }
            com.google.android.gms.internal.ads.zzcy r1 = (com.google.android.gms.internal.ads.zzcy) r1     // Catch:{ all -> 0x0123 }
            monitor-exit(r0)     // Catch:{ all -> 0x0123 }
            com.google.android.gms.internal.ads.zzcf$zza$zza r2 = r8.zzabc
            monitor-enter(r2)
            if (r1 == 0) goto L_0x011e
            com.google.android.gms.internal.ads.zzcf$zza$zza r0 = r8.zzabc     // Catch:{ all -> 0x0120 }
            java.lang.String r3 = r1.zznw     // Catch:{ all -> 0x0120 }
            r0.zzw((java.lang.String) r3)     // Catch:{ all -> 0x0120 }
            com.google.android.gms.internal.ads.zzcf$zza$zza r0 = r8.zzabc     // Catch:{ all -> 0x0120 }
            long r3 = r1.zznx     // Catch:{ all -> 0x0120 }
            r0.zzt(r3)     // Catch:{ all -> 0x0120 }
            com.google.android.gms.internal.ads.zzcf$zza$zza r0 = r8.zzabc     // Catch:{ all -> 0x0120 }
            java.lang.String r3 = r1.zzny     // Catch:{ all -> 0x0120 }
            r0.zzy((java.lang.String) r3)     // Catch:{ all -> 0x0120 }
            com.google.android.gms.internal.ads.zzcf$zza$zza r0 = r8.zzabc     // Catch:{ all -> 0x0120 }
            java.lang.String r3 = r1.zznz     // Catch:{ all -> 0x0120 }
            r0.zzz((java.lang.String) r3)     // Catch:{ all -> 0x0120 }
            com.google.android.gms.internal.ads.zzcf$zza$zza r0 = r8.zzabc     // Catch:{ all -> 0x0120 }
            java.lang.String r1 = r1.zzoa     // Catch:{ all -> 0x0120 }
            r0.zzaa((java.lang.String) r1)     // Catch:{ all -> 0x0120 }
        L_0x011e:
            monitor-exit(r2)     // Catch:{ all -> 0x0120 }
            return
        L_0x0120:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0120 }
            throw r0
        L_0x0123:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0123 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfo.zzcw():void");
    }

    private static String zza(zzby.zza zza) {
        if (zza == null || !zza.zzz() || zzfg.zzas(zza.zzaa().zzaf())) {
            return null;
        }
        return zza.zzaa().zzaf();
    }

    private final String zzcx() {
        try {
            if (this.zzwg.zzcp() != null) {
                this.zzwg.zzcp().get();
            }
            zzcf.zza zzco = this.zzwg.zzco();
            if (zzco == null || !zzco.zzaj()) {
                return null;
            }
            return zzco.zzaf();
        } catch (InterruptedException | ExecutionException e) {
            return null;
        }
    }
}
