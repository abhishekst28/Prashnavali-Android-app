package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class zzau implements zzx {
    private static final boolean DEBUG = zzaq.DEBUG;
    @Deprecated
    private final zzbe zzcf;
    private final zzar zzcg;
    private final zzat zzch;

    public zzau(zzar zzar) {
        this(zzar, new zzat(4096));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.zzbe, com.google.android.gms.internal.ads.zzar] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzau(com.google.android.gms.internal.ads.zzar r1, com.google.android.gms.internal.ads.zzat r2) {
        /*
            r0 = this;
            r0.<init>()
            r0.zzcg = r1
            r0.zzcf = r1
            r0.zzch = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzau.<init>(com.google.android.gms.internal.ads.zzar, com.google.android.gms.internal.ads.zzat):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01f6, code lost:
        throw new com.google.android.gms.internal.ads.zzam(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01f7, code lost:
        zza("auth", r2, new com.google.android.gms.internal.ads.zzl(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0203, code lost:
        zza("network", r2, new com.google.android.gms.internal.ads.zzz());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0214, code lost:
        throw new com.google.android.gms.internal.ads.zzab(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0215, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0216, code lost:
        r2 = java.lang.String.valueOf(r22.getUrl());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0226, code lost:
        if (r2.length() != 0) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0228, code lost:
        r2 = "Bad URL ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x022d, code lost:
        r2 = new java.lang.String("Bad URL ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0235, code lost:
        throw new java.lang.RuntimeException(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0237, code lost:
        zza("socket", r2, new com.google.android.gms.internal.ads.zzap());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0198, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0199, code lost:
        r17 = r5;
        r8 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x019d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x019e, code lost:
        r17 = r5;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a1, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a4, code lost:
        r0 = r8.getStatusCode();
        com.google.android.gms.internal.ads.zzaq.e("Unexpected response code %d for %s", java.lang.Integer.valueOf(r0), r22.getUrl());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bb, code lost:
        if (r13 != null) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01bd, code lost:
        r11 = new com.google.android.gms.internal.ads.zzy(r0, r13, false, android.os.SystemClock.elapsedRealtime() - r3, r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01cd, code lost:
        if (r0 == 401) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d6, code lost:
        if (r0 < 400) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01e2, code lost:
        throw new com.google.android.gms.internal.ads.zzr(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01e5, code lost:
        if (r0 < 500) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01f0, code lost:
        throw new com.google.android.gms.internal.ads.zzam(r11);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0215 A[ExcHandler: MalformedURLException (r0v2 'e' java.net.MalformedURLException A[CUSTOM_DECLARE]), Splitter:B:2:0x0012] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0236 A[ExcHandler: SocketTimeoutException (e java.net.SocketTimeoutException), Splitter:B:2:0x0012] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x020f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.ads.zzy zzc(com.google.android.gms.internal.ads.zzaa<?> r22) throws com.google.android.gms.internal.ads.zzao {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            long r3 = android.os.SystemClock.elapsedRealtime()
        L_0x0008:
            java.util.List r5 = java.util.Collections.emptyList()
            r6 = 1
            r7 = 2
            r9 = 0
            com.google.android.gms.internal.ads.zzn r0 = r22.zzf()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x019d }
            if (r0 != 0) goto L_0x001d
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x019d }
            goto L_0x0041
        L_0x001d:
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x019d }
            r10.<init>()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x019d }
            java.lang.String r11 = r0.zzr     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x019d }
            if (r11 == 0) goto L_0x002d
            java.lang.String r11 = "If-None-Match"
            java.lang.String r12 = r0.zzr     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x019d }
            r10.put(r11, r12)     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x019d }
        L_0x002d:
            long r11 = r0.zzt     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x019d }
            r13 = 0
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x0040
            java.lang.String r11 = "If-Modified-Since"
            long r12 = r0.zzt     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x019d }
            java.lang.String r0 = com.google.android.gms.internal.ads.zzbc.zzb((long) r12)     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x019d }
            r10.put(r11, r0)     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x019d }
        L_0x0040:
            r0 = r10
        L_0x0041:
            com.google.android.gms.internal.ads.zzar r10 = r1.zzcg     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x019d }
            com.google.android.gms.internal.ads.zzbb r10 = r10.zza(r2, r0)     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x019d }
            int r12 = r10.getStatusCode()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            java.util.List r5 = r10.zzq()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            r0 = 304(0x130, float:4.26E-43)
            if (r12 != r0) goto L_0x011e
            com.google.android.gms.internal.ads.zzn r0 = r22.zzf()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            if (r0 != 0) goto L_0x006e
            com.google.android.gms.internal.ads.zzy r0 = new com.google.android.gms.internal.ads.zzy     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            r14 = 304(0x130, float:4.26E-43)
            r15 = 0
            r16 = 1
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            long r17 = r11 - r3
            r13 = r0
            r19 = r5
            r13.<init>((int) r14, (byte[]) r15, (boolean) r16, (long) r17, (java.util.List<com.google.android.gms.internal.ads.zzu>) r19)     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            return r0
        L_0x006e:
            java.util.TreeSet r11 = new java.util.TreeSet     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            java.util.Comparator r12 = java.lang.String.CASE_INSENSITIVE_ORDER     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            r11.<init>(r12)     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            boolean r12 = r5.isEmpty()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            if (r12 != 0) goto L_0x0094
            java.util.Iterator r12 = r5.iterator()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
        L_0x0080:
            boolean r13 = r12.hasNext()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            if (r13 == 0) goto L_0x0094
            java.lang.Object r13 = r12.next()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            com.google.android.gms.internal.ads.zzu r13 = (com.google.android.gms.internal.ads.zzu) r13     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            java.lang.String r13 = r13.getName()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            r11.add(r13)     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            goto L_0x0080
        L_0x0094:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            r12.<init>(r5)     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            java.util.List<com.google.android.gms.internal.ads.zzu> r13 = r0.zzx     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            if (r13 == 0) goto L_0x00c6
            java.util.List<com.google.android.gms.internal.ads.zzu> r13 = r0.zzx     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            boolean r13 = r13.isEmpty()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            if (r13 != 0) goto L_0x0105
            java.util.List<com.google.android.gms.internal.ads.zzu> r13 = r0.zzx     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
        L_0x00ab:
            boolean r14 = r13.hasNext()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            if (r14 == 0) goto L_0x00c5
            java.lang.Object r14 = r13.next()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            com.google.android.gms.internal.ads.zzu r14 = (com.google.android.gms.internal.ads.zzu) r14     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            java.lang.String r15 = r14.getName()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            boolean r15 = r11.contains(r15)     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            if (r15 != 0) goto L_0x00c4
            r12.add(r14)     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
        L_0x00c4:
            goto L_0x00ab
        L_0x00c5:
            goto L_0x0105
        L_0x00c6:
            java.util.Map<java.lang.String, java.lang.String> r13 = r0.zzw     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            boolean r13 = r13.isEmpty()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            if (r13 != 0) goto L_0x0105
            java.util.Map<java.lang.String, java.lang.String> r13 = r0.zzw     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            java.util.Set r13 = r13.entrySet()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
        L_0x00d8:
            boolean r14 = r13.hasNext()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            if (r14 == 0) goto L_0x0105
            java.lang.Object r14 = r13.next()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            java.lang.Object r15 = r14.getKey()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            boolean r15 = r11.contains(r15)     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            if (r15 != 0) goto L_0x0104
            com.google.android.gms.internal.ads.zzu r15 = new com.google.android.gms.internal.ads.zzu     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            java.lang.Object r16 = r14.getKey()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            r8 = r16
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            java.lang.Object r14 = r14.getValue()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            r15.<init>(r8, r14)     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            r12.add(r15)     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
        L_0x0104:
            goto L_0x00d8
        L_0x0105:
            com.google.android.gms.internal.ads.zzy r8 = new com.google.android.gms.internal.ads.zzy     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            r15 = 304(0x130, float:4.26E-43)
            byte[] r0 = r0.data     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            r17 = 1
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            long r18 = r13 - r3
            r14 = r8
            r16 = r0
            r20 = r12
            r14.<init>((int) r15, (byte[]) r16, (boolean) r17, (long) r18, (java.util.List<com.google.android.gms.internal.ads.zzu>) r20)     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            return r8
        L_0x011e:
            java.io.InputStream r0 = r10.getContent()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            if (r0 == 0) goto L_0x012f
            int r8 = r10.getContentLength()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            byte[] r0 = r1.zza(r0, r8)     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            r8 = r0
            goto L_0x0132
        L_0x012f:
            byte[] r0 = new byte[r9]     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0198 }
            r8 = r0
        L_0x0132:
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0192 }
            long r13 = r13 - r3
            boolean r0 = DEBUG     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0192 }
            if (r0 != 0) goto L_0x0142
            r15 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x0174
        L_0x0142:
            java.lang.String r0 = "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]"
            r11 = 5
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0192 }
            r11[r9] = r2     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0192 }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0192 }
            r11[r6] = r13     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0192 }
            if (r8 == 0) goto L_0x0157
            int r13 = r8.length     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0192 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0192 }
            goto L_0x0159
        L_0x0157:
            java.lang.String r13 = "null"
        L_0x0159:
            r11[r7] = r13     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0192 }
            r13 = 3
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0192 }
            r11[r13] = r14     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0192 }
            r13 = 4
            com.google.android.gms.internal.ads.zzan r14 = r22.zzj()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0192 }
            int r14 = r14.zzc()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0192 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0192 }
            r11[r13] = r14     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0192 }
            com.google.android.gms.internal.ads.zzaq.d(r0, r11)     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0192 }
        L_0x0174:
            r0 = 200(0xc8, float:2.8E-43)
            if (r12 < r0) goto L_0x018c
            r0 = 299(0x12b, float:4.19E-43)
            if (r12 > r0) goto L_0x018c
            com.google.android.gms.internal.ads.zzy r0 = new com.google.android.gms.internal.ads.zzy     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0192 }
            r14 = 0
            long r15 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0192 }
            long r15 = r15 - r3
            r11 = r0
            r13 = r8
            r17 = r5
            r11.<init>((int) r12, (byte[]) r13, (boolean) r14, (long) r15, (java.util.List<com.google.android.gms.internal.ads.zzu>) r17)     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0192 }
            return r0
        L_0x018c:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0192 }
            r0.<init>()     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0192 }
            throw r0     // Catch:{ SocketTimeoutException -> 0x0236, MalformedURLException -> 0x0215, IOException -> 0x0192 }
        L_0x0192:
            r0 = move-exception
            r17 = r5
            r13 = r8
            r8 = r10
            goto L_0x01a2
        L_0x0198:
            r0 = move-exception
            r17 = r5
            r8 = r10
            goto L_0x01a1
        L_0x019d:
            r0 = move-exception
            r17 = r5
            r8 = 0
        L_0x01a1:
            r13 = 0
        L_0x01a2:
            if (r8 == 0) goto L_0x020f
            int r0 = r8.getStatusCode()
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r5[r9] = r7
            java.lang.String r7 = r22.getUrl()
            r5[r6] = r7
            java.lang.String r6 = "Unexpected response code %d for %s"
            com.google.android.gms.internal.ads.zzaq.e(r6, r5)
            if (r13 == 0) goto L_0x0203
            com.google.android.gms.internal.ads.zzy r5 = new com.google.android.gms.internal.ads.zzy
            r14 = 0
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r15 = r6 - r3
            r11 = r5
            r12 = r0
            r11.<init>((int) r12, (byte[]) r13, (boolean) r14, (long) r15, (java.util.List<com.google.android.gms.internal.ads.zzu>) r17)
            r6 = 401(0x191, float:5.62E-43)
            if (r0 == r6) goto L_0x01f7
            r6 = 403(0x193, float:5.65E-43)
            if (r0 != r6) goto L_0x01d4
            goto L_0x01f7
        L_0x01d4:
            r2 = 400(0x190, float:5.6E-43)
            if (r0 < r2) goto L_0x01e3
            r2 = 499(0x1f3, float:6.99E-43)
            if (r0 <= r2) goto L_0x01dd
            goto L_0x01e3
        L_0x01dd:
            com.google.android.gms.internal.ads.zzr r0 = new com.google.android.gms.internal.ads.zzr
            r0.<init>(r5)
            throw r0
        L_0x01e3:
            r2 = 500(0x1f4, float:7.0E-43)
            if (r0 < r2) goto L_0x01f1
            r2 = 599(0x257, float:8.4E-43)
            if (r0 > r2) goto L_0x01f1
            com.google.android.gms.internal.ads.zzam r0 = new com.google.android.gms.internal.ads.zzam
            r0.<init>(r5)
            throw r0
        L_0x01f1:
            com.google.android.gms.internal.ads.zzam r0 = new com.google.android.gms.internal.ads.zzam
            r0.<init>(r5)
            throw r0
        L_0x01f7:
            com.google.android.gms.internal.ads.zzl r0 = new com.google.android.gms.internal.ads.zzl
            r0.<init>(r5)
            java.lang.String r5 = "auth"
            zza(r5, r2, r0)
            goto L_0x0008
        L_0x0203:
            com.google.android.gms.internal.ads.zzz r0 = new com.google.android.gms.internal.ads.zzz
            r0.<init>()
            java.lang.String r5 = "network"
            zza(r5, r2, r0)
            goto L_0x0008
        L_0x020f:
            com.google.android.gms.internal.ads.zzab r2 = new com.google.android.gms.internal.ads.zzab
            r2.<init>(r0)
            throw r2
        L_0x0215:
            r0 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "Bad URL "
            java.lang.String r2 = r22.getUrl()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r5 = r2.length()
            if (r5 == 0) goto L_0x022d
            java.lang.String r2 = r4.concat(r2)
            goto L_0x0232
        L_0x022d:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r4)
        L_0x0232:
            r3.<init>(r2, r0)
            throw r3
        L_0x0236:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzap r0 = new com.google.android.gms.internal.ads.zzap
            r0.<init>()
            java.lang.String r5 = "socket"
            zza(r5, r2, r0)
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzau.zzc(com.google.android.gms.internal.ads.zzaa):com.google.android.gms.internal.ads.zzy");
    }

    private static void zza(String str, zzaa<?> zzaa, zzao zzao) throws zzao {
        zzan zzj = zzaa.zzj();
        int zzi = zzaa.zzi();
        try {
            zzj.zza(zzao);
            zzaa.zzc(String.format("%s-retry [timeout=%s]", new Object[]{str, Integer.valueOf(zzi)}));
        } catch (zzao e) {
            zzaa.zzc(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{str, Integer.valueOf(zzi)}));
            throw e;
        }
    }

    private final byte[] zza(InputStream inputStream, int i) throws IOException, zzam {
        zzbi zzbi = new zzbi(this.zzch, i);
        byte[] bArr = null;
        if (inputStream != null) {
            try {
                bArr = this.zzch.zzf(1024);
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    zzbi.write(bArr, 0, read);
                }
                return zzbi.toByteArray();
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        zzaq.v("Error occurred when closing InputStream", new Object[0]);
                    }
                }
                this.zzch.zza(bArr);
                zzbi.close();
            }
        } else {
            throw new zzam();
        }
    }
}
