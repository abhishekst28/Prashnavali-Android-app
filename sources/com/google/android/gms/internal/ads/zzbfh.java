package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbfh extends zzbev implements zzpa<zzom> {
    private String url;
    private ByteBuffer zzami;
    private final zzbdf zzeiw;
    private boolean zzelf;
    private final zzbfe zzell = new zzbfe();
    private final zzben zzelm = new zzben();
    private boolean zzeln;
    private final Object zzelo = new Object();
    private boolean zzelp;

    public zzbfh(zzbde zzbde, zzbdf zzbdf) {
        super(zzbde);
        this.zzeiw = zzbdf;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean zzaaw() {
        return this.zzelp;
    }

    /* access modifiers changed from: protected */
    public final String zzfo(String str) {
        String valueOf = String.valueOf("cache:");
        String valueOf2 = String.valueOf(super.zzfo(str));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private final void zzzg() {
        int zzaau = (int) this.zzell.zzaau();
        int zzq = (int) this.zzelm.zzq(this.zzami);
        int position = this.zzami.position();
        int round = Math.round(((float) zzq) * (((float) position) / ((float) zzaau)));
        boolean z = round > 0;
        int zzaar = zzbeb.zzaar();
        int zzaas = zzbeb.zzaas();
        String str = this.url;
        zza(str, zzfo(str), position, zzaau, (long) round, (long) zzq, z, zzaar, zzaas);
    }

    /* JADX WARNING: type inference failed for: r1v32, types: [com.google.android.gms.internal.ads.zzbdw] */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c5, code lost:
        if (r9.zzami.remaining() > 0) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c7, code lost:
        zzzg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cf, code lost:
        if (r9.zzelf != false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d1, code lost:
        r12 = r1.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d9, code lost:
        if ((r12 - r16) < r4) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00db, code lost:
        zzzg();
        r16 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e7, code lost:
        if ((r12 - r2) > (1000 * r6)) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r1 = new java.lang.StringBuilder(49);
        r1.append("Timeout exceeded. Limit: ");
        r1.append(r6);
        r1.append(" sec");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        throw new java.io.IOException(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010f, code lost:
        r12 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r1 = r9.zzami.limit();
        r3 = new java.lang.StringBuilder(35);
        r3.append("Precache abort at ");
        r3.append(r1);
        r3.append(" bytes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0134, code lost:
        throw new java.io.IOException(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x013b, code lost:
        r12 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzfn(java.lang.String r22) {
        /*
            r21 = this;
            r9 = r21
            r10 = r22
            r9.url = r10
            java.lang.String r11 = r21.zzfo(r22)
            java.lang.String r12 = "error"
            r13 = 0
            com.google.android.gms.internal.ads.zzop r0 = new com.google.android.gms.internal.ads.zzop     // Catch:{ Exception -> 0x0140 }
            java.lang.String r2 = r9.zzecp     // Catch:{ Exception -> 0x0140 }
            r3 = 0
            com.google.android.gms.internal.ads.zzbdf r1 = r9.zzeiw     // Catch:{ Exception -> 0x0140 }
            int r5 = r1.zzehx     // Catch:{ Exception -> 0x0140 }
            com.google.android.gms.internal.ads.zzbdf r1 = r9.zzeiw     // Catch:{ Exception -> 0x0140 }
            int r6 = r1.zzehz     // Catch:{ Exception -> 0x0140 }
            r7 = 1
            r8 = 0
            r1 = r0
            r4 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0140 }
            com.google.android.gms.internal.ads.zzbdf r1 = r9.zzeiw     // Catch:{ Exception -> 0x0140 }
            boolean r1 = r1.zzeid     // Catch:{ Exception -> 0x0140 }
            if (r1 == 0) goto L_0x0036
            com.google.android.gms.internal.ads.zzbdw r1 = new com.google.android.gms.internal.ads.zzbdw     // Catch:{ Exception -> 0x0033 }
            android.content.Context r2 = r9.mContext     // Catch:{ Exception -> 0x0033 }
            r3 = 0
            r1.<init>(r2, r0, r3, r3)     // Catch:{ Exception -> 0x0033 }
            r0 = r1
            goto L_0x0037
        L_0x0033:
            r0 = move-exception
            goto L_0x0143
        L_0x0036:
        L_0x0037:
            android.net.Uri r1 = android.net.Uri.parse(r22)     // Catch:{ Exception -> 0x0140 }
            com.google.android.gms.internal.ads.zzon r2 = new com.google.android.gms.internal.ads.zzon     // Catch:{ Exception -> 0x0140 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0140 }
            r0.zza(r2)     // Catch:{ Exception -> 0x0140 }
            java.lang.ref.WeakReference r1 = r9.zzekx     // Catch:{ Exception -> 0x0140 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x0140 }
            com.google.android.gms.internal.ads.zzbde r1 = (com.google.android.gms.internal.ads.zzbde) r1     // Catch:{ Exception -> 0x0140 }
            if (r1 == 0) goto L_0x0051
            r1.zza((java.lang.String) r11, (com.google.android.gms.internal.ads.zzbev) r9)     // Catch:{ Exception -> 0x0033 }
        L_0x0051:
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzp.zzkw()     // Catch:{ Exception -> 0x0140 }
            long r2 = r1.currentTimeMillis()     // Catch:{ Exception -> 0x0140 }
            com.google.android.gms.internal.ads.zzaai<java.lang.Long> r4 = com.google.android.gms.internal.ads.zzaat.zzcma     // Catch:{ Exception -> 0x0140 }
            com.google.android.gms.internal.ads.zzaap r5 = com.google.android.gms.internal.ads.zzwe.zzpu()     // Catch:{ Exception -> 0x0140 }
            java.lang.Object r4 = r5.zzd(r4)     // Catch:{ Exception -> 0x0140 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ Exception -> 0x0140 }
            long r4 = r4.longValue()     // Catch:{ Exception -> 0x0140 }
            com.google.android.gms.internal.ads.zzaai<java.lang.Long> r6 = com.google.android.gms.internal.ads.zzaat.zzclz     // Catch:{ Exception -> 0x0140 }
            com.google.android.gms.internal.ads.zzaap r7 = com.google.android.gms.internal.ads.zzwe.zzpu()     // Catch:{ Exception -> 0x0140 }
            java.lang.Object r6 = r7.zzd(r6)     // Catch:{ Exception -> 0x0140 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ Exception -> 0x0140 }
            long r6 = r6.longValue()     // Catch:{ Exception -> 0x0140 }
            com.google.android.gms.internal.ads.zzbdf r8 = r9.zzeiw     // Catch:{ Exception -> 0x0140 }
            int r8 = r8.zzehw     // Catch:{ Exception -> 0x0140 }
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r8)     // Catch:{ Exception -> 0x0140 }
            r9.zzami = r8     // Catch:{ Exception -> 0x0140 }
            r8 = 8192(0x2000, float:1.14794E-41)
            byte[] r15 = new byte[r8]     // Catch:{ Exception -> 0x0140 }
            r16 = r2
        L_0x008a:
            java.nio.ByteBuffer r14 = r9.zzami     // Catch:{ Exception -> 0x0140 }
            int r14 = r14.remaining()     // Catch:{ Exception -> 0x0140 }
            int r14 = java.lang.Math.min(r14, r8)     // Catch:{ Exception -> 0x0140 }
            int r14 = r0.read(r15, r13, r14)     // Catch:{ Exception -> 0x0140 }
            r8 = -1
            if (r14 != r8) goto L_0x00ac
            r1 = 1
            r9.zzelp = r1     // Catch:{ Exception -> 0x0033 }
            com.google.android.gms.internal.ads.zzben r0 = r9.zzelm     // Catch:{ Exception -> 0x0033 }
            java.nio.ByteBuffer r1 = r9.zzami     // Catch:{ Exception -> 0x0033 }
            long r0 = r0.zzq(r1)     // Catch:{ Exception -> 0x0033 }
            int r1 = (int) r0     // Catch:{ Exception -> 0x0033 }
            long r0 = (long) r1     // Catch:{ Exception -> 0x0033 }
            r9.zzc(r10, r11, r0)     // Catch:{ Exception -> 0x0033 }
            goto L_0x00cb
        L_0x00ac:
            java.lang.Object r8 = r9.zzelo     // Catch:{ Exception -> 0x0140 }
            monitor-enter(r8)     // Catch:{ Exception -> 0x0140 }
            boolean r13 = r9.zzelf     // Catch:{ all -> 0x0135 }
            if (r13 != 0) goto L_0x00bc
            java.nio.ByteBuffer r13 = r9.zzami     // Catch:{ all -> 0x0135 }
            r18 = r12
            r12 = 0
            r13.put(r15, r12, r14)     // Catch:{ all -> 0x013e }
            goto L_0x00be
        L_0x00bc:
            r18 = r12
        L_0x00be:
            monitor-exit(r8)     // Catch:{ all -> 0x013e }
            java.nio.ByteBuffer r8 = r9.zzami     // Catch:{ Exception -> 0x013a }
            int r8 = r8.remaining()     // Catch:{ Exception -> 0x013a }
            if (r8 > 0) goto L_0x00cd
            r21.zzzg()     // Catch:{ Exception -> 0x013a }
        L_0x00cb:
            r1 = 1
            return r1
        L_0x00cd:
            boolean r8 = r9.zzelf     // Catch:{ Exception -> 0x013a }
            if (r8 != 0) goto L_0x010f
            long r12 = r1.currentTimeMillis()     // Catch:{ Exception -> 0x013a }
            long r19 = r12 - r16
            int r8 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r8 < 0) goto L_0x00e0
            r21.zzzg()     // Catch:{ Exception -> 0x013a }
            r16 = r12
        L_0x00e0:
            long r12 = r12 - r2
            r19 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 * r6
            int r8 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r8 > 0) goto L_0x00ef
            r12 = r18
            r8 = 8192(0x2000, float:1.14794E-41)
            r13 = 0
            goto L_0x008a
        L_0x00ef:
            java.lang.String r12 = "downloadTimeout"
            r0 = 49
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0033 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0033 }
            java.lang.String r0 = "Timeout exceeded. Limit: "
            r1.append(r0)     // Catch:{ Exception -> 0x0033 }
            r1.append(r6)     // Catch:{ Exception -> 0x0033 }
            java.lang.String r0 = " sec"
            r1.append(r0)     // Catch:{ Exception -> 0x0033 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0033 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ Exception -> 0x0033 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0033 }
            throw r1     // Catch:{ Exception -> 0x0033 }
        L_0x010f:
            java.lang.String r12 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x0033 }
            java.nio.ByteBuffer r1 = r9.zzami     // Catch:{ Exception -> 0x0033 }
            int r1 = r1.limit()     // Catch:{ Exception -> 0x0033 }
            r2 = 35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0033 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0033 }
            java.lang.String r2 = "Precache abort at "
            r3.append(r2)     // Catch:{ Exception -> 0x0033 }
            r3.append(r1)     // Catch:{ Exception -> 0x0033 }
            java.lang.String r1 = " bytes"
            r3.append(r1)     // Catch:{ Exception -> 0x0033 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x0033 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0033 }
            throw r0     // Catch:{ Exception -> 0x0033 }
        L_0x0135:
            r0 = move-exception
            r18 = r12
        L_0x0138:
            monitor-exit(r8)     // Catch:{ all -> 0x013e }
            throw r0     // Catch:{ Exception -> 0x013a }
        L_0x013a:
            r0 = move-exception
            r12 = r18
            goto L_0x0143
        L_0x013e:
            r0 = move-exception
            goto L_0x0138
        L_0x0140:
            r0 = move-exception
            r18 = r12
        L_0x0143:
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getCanonicalName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            r3 = 1
            int r2 = r2 + r3
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r1)
            java.lang.String r1 = ":"
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = java.lang.String.valueOf(r22)
            int r1 = r1.length()
            int r1 = r1 + 34
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Failed to preload url "
            r2.append(r1)
            r2.append(r10)
            java.lang.String r1 = " Exception: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzaxy.zzfe(r1)
            r9.zza(r10, r11, r12, r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbfh.zzfn(java.lang.String):boolean");
    }

    public final void abort() {
        this.zzelf = true;
    }

    public final ByteBuffer getByteBuffer() {
        synchronized (this.zzelo) {
            if (this.zzami != null && !this.zzeln) {
                this.zzami.flip();
                this.zzeln = true;
            }
            this.zzelf = true;
        }
        return this.zzami;
    }

    public final /* bridge */ /* synthetic */ void zze(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzc(Object obj, int i) {
    }

    public final /* synthetic */ void zza(Object obj, zzon zzon) {
        zzom zzom = (zzom) obj;
        if (zzom instanceof zzop) {
            this.zzell.zza((zzop) zzom);
        }
    }
}
