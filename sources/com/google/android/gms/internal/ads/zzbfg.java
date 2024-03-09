package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbfg extends zzbev implements zzbei {
    private String zzefy;
    private boolean zzelf;
    private zzbeb zzeli;
    private Exception zzelj;
    private boolean zzelk;

    public zzbfg(zzbde zzbde, zzbdf zzbdf) {
        super(zzbde);
        zzbeb zzbeb = new zzbeb(zzbde.getContext(), zzbdf);
        this.zzeli = zzbeb;
        zzbeb.zza((zzbei) this);
    }

    public final void zzb(boolean z, long j) {
        zzbde zzbde = (zzbde) this.zzekx.get();
        if (zzbde != null) {
            zzbbi.zzedy.execute(new zzbfj(zzbde, z, j));
        }
    }

    public final void zzdq(int i) {
    }

    public final void zzn(int i, int i2) {
    }

    public final void zza(String str, Exception exc) {
        String str2 = (String) zzwe.zzpu().zzd(zzaat.zzclt);
        if (str2 != null) {
            List asList = Arrays.asList(str2.split(","));
            if (asList.contains("all") || asList.contains(exc.getClass().getCanonicalName())) {
                return;
            }
        }
        this.zzelj = exc;
        zzaxy.zzd("Precache error", exc);
        zzfq(str);
    }

    public final void zzdm(int i) {
        this.zzeli.zzaat().zzdt(i);
    }

    public final void zzdl(int i) {
        this.zzeli.zzaat().zzds(i);
    }

    public final void zzdn(int i) {
        this.zzeli.zzaat().zzdn(i);
    }

    public final void zzdo(int i) {
        this.zzeli.zzaat().zzdo(i);
    }

    public final void release() {
        zzbeb zzbeb = this.zzeli;
        if (zzbeb != null) {
            zzbeb.zza((zzbei) null);
            this.zzeli.release();
        }
        super.release();
    }

    /* access modifiers changed from: protected */
    public final String zzfo(String str) {
        String valueOf = String.valueOf("cache:");
        String valueOf2 = String.valueOf(super.zzfo(str));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public final boolean zzfn(String str) {
        return zze(str, new String[]{str});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0087, code lost:
        if (r11.zzelj == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        throw r11.zzelj;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008e, code lost:
        r1 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0097, code lost:
        throw new java.io.IOException("Abort requested before buffering finished. ");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zze(java.lang.String r34, java.lang.String[] r35) {
        /*
            r33 = this;
            r11 = r33
            r12 = r34
            r0 = r35
            r11.zzefy = r12
            java.lang.String r13 = r33.zzfo(r34)
            java.lang.String r14 = "error"
            int r1 = r0.length     // Catch:{ Exception -> 0x0165 }
            android.net.Uri[] r1 = new android.net.Uri[r1]     // Catch:{ Exception -> 0x0165 }
            r2 = 0
        L_0x0012:
            int r3 = r0.length     // Catch:{ Exception -> 0x0165 }
            if (r2 >= r3) goto L_0x0023
            r3 = r0[r2]     // Catch:{ Exception -> 0x0020 }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x0020 }
            r1[r2] = r3     // Catch:{ Exception -> 0x0020 }
            int r2 = r2 + 1
            goto L_0x0012
        L_0x0020:
            r0 = move-exception
            goto L_0x0168
        L_0x0023:
            com.google.android.gms.internal.ads.zzbeb r0 = r11.zzeli     // Catch:{ Exception -> 0x0165 }
            java.lang.String r2 = r11.zzecp     // Catch:{ Exception -> 0x0165 }
            r0.zza((android.net.Uri[]) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x0165 }
            java.lang.ref.WeakReference r0 = r11.zzekx     // Catch:{ Exception -> 0x0165 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0165 }
            com.google.android.gms.internal.ads.zzbde r0 = (com.google.android.gms.internal.ads.zzbde) r0     // Catch:{ Exception -> 0x0165 }
            if (r0 == 0) goto L_0x0037
            r0.zza((java.lang.String) r13, (com.google.android.gms.internal.ads.zzbev) r11)     // Catch:{ Exception -> 0x0020 }
        L_0x0037:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzp.zzkw()     // Catch:{ Exception -> 0x0165 }
            long r16 = r0.currentTimeMillis()     // Catch:{ Exception -> 0x0165 }
            com.google.android.gms.internal.ads.zzaai<java.lang.Long> r1 = com.google.android.gms.internal.ads.zzaat.zzcma     // Catch:{ Exception -> 0x0165 }
            com.google.android.gms.internal.ads.zzaap r2 = com.google.android.gms.internal.ads.zzwe.zzpu()     // Catch:{ Exception -> 0x0165 }
            java.lang.Object r1 = r2.zzd(r1)     // Catch:{ Exception -> 0x0165 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x0165 }
            long r9 = r1.longValue()     // Catch:{ Exception -> 0x0165 }
            com.google.android.gms.internal.ads.zzaai<java.lang.Long> r1 = com.google.android.gms.internal.ads.zzaat.zzclz     // Catch:{ Exception -> 0x0165 }
            com.google.android.gms.internal.ads.zzaap r2 = com.google.android.gms.internal.ads.zzwe.zzpu()     // Catch:{ Exception -> 0x0165 }
            java.lang.Object r1 = r2.zzd(r1)     // Catch:{ Exception -> 0x0165 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x0165 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x0165 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r6 = r1 * r3
            com.google.android.gms.internal.ads.zzaai<java.lang.Integer> r1 = com.google.android.gms.internal.ads.zzaat.zzcly     // Catch:{ Exception -> 0x0165 }
            com.google.android.gms.internal.ads.zzaap r2 = com.google.android.gms.internal.ads.zzwe.zzpu()     // Catch:{ Exception -> 0x0165 }
            java.lang.Object r1 = r2.zzd(r1)     // Catch:{ Exception -> 0x0165 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x0165 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x0165 }
            long r4 = (long) r1     // Catch:{ Exception -> 0x0165 }
            r1 = -1
        L_0x0076:
            monitor-enter(r33)     // Catch:{ Exception -> 0x0165 }
            long r18 = r0.currentTimeMillis()     // Catch:{ all -> 0x015e }
            long r18 = r18 - r16
            int r3 = (r18 > r6 ? 1 : (r18 == r6 ? 0 : -1))
            if (r3 > 0) goto L_0x0131
            boolean r3 = r11.zzelf     // Catch:{ all -> 0x015e }
            if (r3 == 0) goto L_0x0098
            java.lang.Exception r0 = r11.zzelj     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x008e
            java.lang.String r1 = "badUrl"
            java.lang.Exception r0 = r11.zzelj     // Catch:{ all -> 0x0157 }
            throw r0     // Catch:{ all -> 0x0157 }
        L_0x008e:
            java.lang.String r1 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0157 }
            java.lang.String r2 = "Abort requested before buffering finished. "
            r0.<init>(r2)     // Catch:{ all -> 0x0157 }
            throw r0     // Catch:{ all -> 0x0157 }
        L_0x0098:
            boolean r3 = r11.zzelk     // Catch:{ all -> 0x015e }
            r18 = 1
            if (r3 == 0) goto L_0x00a1
            monitor-exit(r33)     // Catch:{ all -> 0x0163 }
            goto L_0x0103
        L_0x00a1:
            com.google.android.gms.internal.ads.zzbeb r3 = r11.zzeli     // Catch:{ all -> 0x015e }
            com.google.android.gms.internal.ads.zzhc r3 = r3.zzaaq()     // Catch:{ all -> 0x015e }
            if (r3 == 0) goto L_0x0125
            r20 = r14
            long r14 = r3.getDuration()     // Catch:{ all -> 0x015a }
            r21 = 0
            int r8 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r8 <= 0) goto L_0x0104
            long r23 = r3.getBufferedPosition()     // Catch:{ all -> 0x015a }
            int r3 = (r23 > r1 ? 1 : (r23 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x00e5
            int r1 = (r23 > r21 ? 1 : (r23 == r21 ? 0 : -1))
            if (r1 <= 0) goto L_0x00c3
            r8 = 1
            goto L_0x00c4
        L_0x00c3:
            r8 = 0
        L_0x00c4:
            int r25 = com.google.android.gms.internal.ads.zzbeb.zzaar()     // Catch:{ all -> 0x015a }
            int r26 = com.google.android.gms.internal.ads.zzbeb.zzaas()     // Catch:{ all -> 0x015a }
            r1 = r33
            r2 = r34
            r3 = r13
            r27 = r4
            r4 = r23
            r29 = r6
            r6 = r14
            r31 = r9
            r9 = r25
            r10 = r26
            r1.zza(r2, r3, r4, r6, r8, r9, r10)     // Catch:{ all -> 0x015a }
            r1 = r23
            goto L_0x00eb
        L_0x00e5:
            r27 = r4
            r29 = r6
            r31 = r9
        L_0x00eb:
            int r3 = (r23 > r14 ? 1 : (r23 == r14 ? 0 : -1))
            if (r3 < 0) goto L_0x00f4
            r11.zzc(r12, r13, r14)     // Catch:{ all -> 0x015a }
            monitor-exit(r33)     // Catch:{ all -> 0x015a }
            goto L_0x0103
        L_0x00f4:
            com.google.android.gms.internal.ads.zzbeb r3 = r11.zzeli     // Catch:{ all -> 0x015a }
            long r3 = r3.getBytesTransferred()     // Catch:{ all -> 0x015a }
            int r5 = (r3 > r27 ? 1 : (r3 == r27 ? 0 : -1))
            if (r5 < 0) goto L_0x010a
            int r3 = (r23 > r21 ? 1 : (r23 == r21 ? 0 : -1))
            if (r3 <= 0) goto L_0x010a
            monitor-exit(r33)     // Catch:{ all -> 0x015a }
        L_0x0103:
            return r18
        L_0x0104:
            r27 = r4
            r29 = r6
            r31 = r9
        L_0x010a:
            r3 = r31
            r11.wait(r3)     // Catch:{ InterruptedException -> 0x011a }
            monitor-exit(r33)     // Catch:{ all -> 0x015a }
            r9 = r3
            r14 = r20
            r4 = r27
            r6 = r29
            goto L_0x0076
        L_0x011a:
            r0 = move-exception
            java.lang.String r1 = "interrupted"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0157 }
            java.lang.String r2 = "Wait interrupted."
            r0.<init>(r2)     // Catch:{ all -> 0x0157 }
            throw r0     // Catch:{ all -> 0x0157 }
        L_0x0125:
            r20 = r14
            java.lang.String r1 = "exoPlayerReleased"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0157 }
            java.lang.String r2 = "ExoPlayer was released during preloading."
            r0.<init>(r2)     // Catch:{ all -> 0x0157 }
            throw r0     // Catch:{ all -> 0x0157 }
        L_0x0131:
            r29 = r6
            r20 = r14
            java.lang.String r1 = "downloadTimeout"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0157 }
            r2 = 47
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0157 }
            r3.<init>(r2)     // Catch:{ all -> 0x0157 }
            java.lang.String r2 = "Timeout reached. Limit: "
            r3.append(r2)     // Catch:{ all -> 0x0157 }
            r4 = r29
            r3.append(r4)     // Catch:{ all -> 0x0157 }
            java.lang.String r2 = " ms"
            r3.append(r2)     // Catch:{ all -> 0x0157 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0157 }
            r0.<init>(r2)     // Catch:{ all -> 0x0157 }
            throw r0     // Catch:{ all -> 0x0157 }
        L_0x0157:
            r0 = move-exception
            r14 = r1
            goto L_0x0161
        L_0x015a:
            r0 = move-exception
            r14 = r20
            goto L_0x0161
        L_0x015e:
            r0 = move-exception
            r20 = r14
        L_0x0161:
            monitor-exit(r33)     // Catch:{ all -> 0x0163 }
            throw r0     // Catch:{ Exception -> 0x0020 }
        L_0x0163:
            r0 = move-exception
            goto L_0x0161
        L_0x0165:
            r0 = move-exception
            r20 = r14
        L_0x0168:
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r34)
            int r2 = r2.length()
            int r2 = r2 + 34
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Failed to preload url "
            r3.append(r2)
            r3.append(r12)
            java.lang.String r2 = " Exception: "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.google.android.gms.internal.ads.zzaxy.zzfe(r1)
            r33.release()
            java.lang.String r0 = zzb((java.lang.String) r14, (java.lang.Exception) r0)
            r11.zza(r12, r13, r14, r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbfg.zze(java.lang.String, java.lang.String[]):boolean");
    }

    public final void abort() {
        zzfq((String) null);
    }

    private final void zzfq(String str) {
        synchronized (this) {
            this.zzelf = true;
            notify();
            release();
        }
        String str2 = this.zzefy;
        if (str2 != null) {
            String zzfo = zzfo(str2);
            Exception exc = this.zzelj;
            if (exc != null) {
                zza(this.zzefy, zzfo, "badUrl", zzb(str, exc));
            } else {
                zza(this.zzefy, zzfo, "externalAbort", "Programmatic precache abort.");
            }
        }
    }

    public final zzbeb zzaav() {
        synchronized (this) {
            this.zzelk = true;
            notify();
        }
        this.zzeli.zza((zzbei) null);
        zzbeb zzbeb = this.zzeli;
        this.zzeli = null;
        return zzbeb;
    }

    private static String zzb(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }
}
