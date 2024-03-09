package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zznf {
    private int length;
    private int[] zzaoj = new int[1000];
    private long[] zzaok = new long[1000];
    private long[] zzaom = new long[1000];
    private int[] zzaxg = new int[1000];
    private int zzbfh = 1000;
    private int[] zzbfi = new int[1000];
    private zzkf[] zzbfj = new zzkf[1000];
    private zzho[] zzbfk = new zzho[1000];
    private int zzbfl;
    private int zzbfm;
    private int zzbfn;
    private long zzbfo = Long.MIN_VALUE;
    private long zzbfp = Long.MIN_VALUE;
    private boolean zzbfq = true;
    private boolean zzbfr = true;
    private zzho zzbfs;

    public final void zzhz() {
        this.zzbfl = 0;
        this.zzbfm = 0;
        this.zzbfn = 0;
        this.length = 0;
        this.zzbfq = true;
    }

    public final void zzia() {
        this.zzbfo = Long.MIN_VALUE;
        this.zzbfp = Long.MIN_VALUE;
    }

    public final int zzib() {
        return this.zzbfl + this.length;
    }

    public final synchronized boolean zzic() {
        return this.length != 0;
    }

    public final synchronized zzho zzid() {
        return this.zzbfr ? null : this.zzbfs;
    }

    public final synchronized long zzht() {
        return Math.max(this.zzbfo, this.zzbfp);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0023, code lost:
        return -3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int zza(com.google.android.gms.internal.ads.zzhq r5, com.google.android.gms.internal.ads.zzjk r6, boolean r7, boolean r8, com.google.android.gms.internal.ads.zzho r9, com.google.android.gms.internal.ads.zzni r10) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.zzic()     // Catch:{ all -> 0x00a5 }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x0024
            if (r8 == 0) goto L_0x0012
            r5 = 4
            r6.setFlags(r5)     // Catch:{ all -> 0x00a5 }
            monitor-exit(r4)
            return r3
        L_0x0012:
            com.google.android.gms.internal.ads.zzho r6 = r4.zzbfs     // Catch:{ all -> 0x00a5 }
            if (r6 == 0) goto L_0x0022
            if (r7 != 0) goto L_0x001c
            com.google.android.gms.internal.ads.zzho r6 = r4.zzbfs     // Catch:{ all -> 0x00a5 }
            if (r6 == r9) goto L_0x0022
        L_0x001c:
            com.google.android.gms.internal.ads.zzho r6 = r4.zzbfs     // Catch:{ all -> 0x00a5 }
            r5.zzaht = r6     // Catch:{ all -> 0x00a5 }
            monitor-exit(r4)
            return r1
        L_0x0022:
            monitor-exit(r4)
            return r2
        L_0x0024:
            if (r7 != 0) goto L_0x009b
            com.google.android.gms.internal.ads.zzho[] r7 = r4.zzbfk     // Catch:{ all -> 0x00a5 }
            int r8 = r4.zzbfm     // Catch:{ all -> 0x00a5 }
            r7 = r7[r8]     // Catch:{ all -> 0x00a5 }
            if (r7 == r9) goto L_0x002f
            goto L_0x009b
        L_0x002f:
            java.nio.ByteBuffer r5 = r6.zzdd     // Catch:{ all -> 0x00a5 }
            r7 = 0
            r8 = 1
            if (r5 != 0) goto L_0x0038
            r5 = 1
            goto L_0x0039
        L_0x0038:
            r5 = 0
        L_0x0039:
            if (r5 == 0) goto L_0x003d
            monitor-exit(r4)
            return r2
        L_0x003d:
            long[] r5 = r4.zzaom     // Catch:{ all -> 0x00a5 }
            int r9 = r4.zzbfm     // Catch:{ all -> 0x00a5 }
            r0 = r5[r9]     // Catch:{ all -> 0x00a5 }
            r6.zzanx = r0     // Catch:{ all -> 0x00a5 }
            int[] r5 = r4.zzaxg     // Catch:{ all -> 0x00a5 }
            int r9 = r4.zzbfm     // Catch:{ all -> 0x00a5 }
            r5 = r5[r9]     // Catch:{ all -> 0x00a5 }
            r6.setFlags(r5)     // Catch:{ all -> 0x00a5 }
            int[] r5 = r4.zzaoj     // Catch:{ all -> 0x00a5 }
            int r9 = r4.zzbfm     // Catch:{ all -> 0x00a5 }
            r5 = r5[r9]     // Catch:{ all -> 0x00a5 }
            r10.size = r5     // Catch:{ all -> 0x00a5 }
            long[] r5 = r4.zzaok     // Catch:{ all -> 0x00a5 }
            int r9 = r4.zzbfm     // Catch:{ all -> 0x00a5 }
            r0 = r5[r9]     // Catch:{ all -> 0x00a5 }
            r10.zzawj = r0     // Catch:{ all -> 0x00a5 }
            com.google.android.gms.internal.ads.zzkf[] r5 = r4.zzbfj     // Catch:{ all -> 0x00a5 }
            int r9 = r4.zzbfm     // Catch:{ all -> 0x00a5 }
            r5 = r5[r9]     // Catch:{ all -> 0x00a5 }
            r10.zzarm = r5     // Catch:{ all -> 0x00a5 }
            long r0 = r4.zzbfo     // Catch:{ all -> 0x00a5 }
            long r5 = r6.zzanx     // Catch:{ all -> 0x00a5 }
            long r5 = java.lang.Math.max(r0, r5)     // Catch:{ all -> 0x00a5 }
            r4.zzbfo = r5     // Catch:{ all -> 0x00a5 }
            int r5 = r4.length     // Catch:{ all -> 0x00a5 }
            int r5 = r5 - r8
            r4.length = r5     // Catch:{ all -> 0x00a5 }
            int r5 = r4.zzbfm     // Catch:{ all -> 0x00a5 }
            int r5 = r5 + r8
            r4.zzbfm = r5     // Catch:{ all -> 0x00a5 }
            int r6 = r4.zzbfl     // Catch:{ all -> 0x00a5 }
            int r6 = r6 + r8
            r4.zzbfl = r6     // Catch:{ all -> 0x00a5 }
            int r6 = r4.zzbfh     // Catch:{ all -> 0x00a5 }
            if (r5 != r6) goto L_0x0085
            r4.zzbfm = r7     // Catch:{ all -> 0x00a5 }
        L_0x0085:
            int r5 = r4.length     // Catch:{ all -> 0x00a5 }
            if (r5 <= 0) goto L_0x0090
            long[] r5 = r4.zzaok     // Catch:{ all -> 0x00a5 }
            int r6 = r4.zzbfm     // Catch:{ all -> 0x00a5 }
            r6 = r5[r6]     // Catch:{ all -> 0x00a5 }
            goto L_0x0097
        L_0x0090:
            long r5 = r10.zzawj     // Catch:{ all -> 0x00a5 }
            int r7 = r10.size     // Catch:{ all -> 0x00a5 }
            long r7 = (long) r7     // Catch:{ all -> 0x00a5 }
            long r6 = r5 + r7
        L_0x0097:
            r10.zzbgg = r6     // Catch:{ all -> 0x00a5 }
            monitor-exit(r4)
            return r3
        L_0x009b:
            com.google.android.gms.internal.ads.zzho[] r6 = r4.zzbfk     // Catch:{ all -> 0x00a5 }
            int r7 = r4.zzbfm     // Catch:{ all -> 0x00a5 }
            r6 = r6[r7]     // Catch:{ all -> 0x00a5 }
            r5.zzaht = r6     // Catch:{ all -> 0x00a5 }
            monitor-exit(r4)
            return r1
        L_0x00a5:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznf.zza(com.google.android.gms.internal.ads.zzhq, com.google.android.gms.internal.ads.zzjk, boolean, boolean, com.google.android.gms.internal.ads.zzho, com.google.android.gms.internal.ads.zzni):int");
    }

    public final synchronized long zzie() {
        if (!zzic()) {
            return -1;
        }
        int i = ((this.zzbfm + this.length) - 1) % this.zzbfh;
        this.zzbfm = (this.zzbfm + this.length) % this.zzbfh;
        this.zzbfl += this.length;
        this.length = 0;
        return this.zzaok[i] + ((long) this.zzaoj[i]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005e, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long zzd(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.zzic()     // Catch:{ all -> 0x005f }
            r1 = -1
            if (r0 == 0) goto L_0x005d
            long[] r0 = r8.zzaom     // Catch:{ all -> 0x005f }
            int r3 = r8.zzbfm     // Catch:{ all -> 0x005f }
            r3 = r0[r3]     // Catch:{ all -> 0x005f }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0014
            goto L_0x005d
        L_0x0014:
            long r3 = r8.zzbfp     // Catch:{ all -> 0x005f }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x001e
            if (r11 != 0) goto L_0x001e
            monitor-exit(r8)
            return r1
        L_0x001e:
            r11 = 0
            int r0 = r8.zzbfm     // Catch:{ all -> 0x005f }
            r3 = -1
            r4 = -1
        L_0x0024:
            int r5 = r8.zzbfn     // Catch:{ all -> 0x005f }
            if (r0 == r5) goto L_0x0041
            long[] r5 = r8.zzaom     // Catch:{ all -> 0x005f }
            r6 = r5[r0]     // Catch:{ all -> 0x005f }
            int r5 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r5 > 0) goto L_0x0041
            int[] r5 = r8.zzaxg     // Catch:{ all -> 0x005f }
            r5 = r5[r0]     // Catch:{ all -> 0x005f }
            r5 = r5 & 1
            if (r5 == 0) goto L_0x0039
            r4 = r11
        L_0x0039:
            int r0 = r0 + 1
            int r5 = r8.zzbfh     // Catch:{ all -> 0x005f }
            int r0 = r0 % r5
            int r11 = r11 + 1
            goto L_0x0024
        L_0x0041:
            if (r4 != r3) goto L_0x0045
            monitor-exit(r8)
            return r1
        L_0x0045:
            int r9 = r8.zzbfm     // Catch:{ all -> 0x005f }
            int r9 = r9 + r4
            int r10 = r8.zzbfh     // Catch:{ all -> 0x005f }
            int r9 = r9 % r10
            r8.zzbfm = r9     // Catch:{ all -> 0x005f }
            int r10 = r8.zzbfl     // Catch:{ all -> 0x005f }
            int r10 = r10 + r4
            r8.zzbfl = r10     // Catch:{ all -> 0x005f }
            int r10 = r8.length     // Catch:{ all -> 0x005f }
            int r10 = r10 - r4
            r8.length = r10     // Catch:{ all -> 0x005f }
            long[] r10 = r8.zzaok     // Catch:{ all -> 0x005f }
            r9 = r10[r9]     // Catch:{ all -> 0x005f }
            monitor-exit(r8)
            return r9
        L_0x005d:
            monitor-exit(r8)
            return r1
        L_0x005f:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznf.zzd(long, boolean):long");
    }

    public final synchronized boolean zzg(zzho zzho) {
        if (zzho == null) {
            this.zzbfr = true;
            return false;
        }
        this.zzbfr = false;
        if (zzpq.zza(zzho, this.zzbfs)) {
            return false;
        }
        this.zzbfs = zzho;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zza(long r6, int r8, long r9, int r11, com.google.android.gms.internal.ads.zzkf r12) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.zzbfq     // Catch:{ all -> 0x00e7 }
            r1 = 0
            if (r0 == 0) goto L_0x000e
            r0 = r8 & 1
            if (r0 != 0) goto L_0x000c
            monitor-exit(r5)
            return
        L_0x000c:
            r5.zzbfq = r1     // Catch:{ all -> 0x00e7 }
        L_0x000e:
            boolean r0 = r5.zzbfr     // Catch:{ all -> 0x00e7 }
            r2 = 1
            if (r0 != 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            com.google.android.gms.internal.ads.zzoz.checkState(r0)     // Catch:{ all -> 0x00e7 }
            r5.zzei(r6)     // Catch:{ all -> 0x00e7 }
            long[] r0 = r5.zzaom     // Catch:{ all -> 0x00e7 }
            int r3 = r5.zzbfn     // Catch:{ all -> 0x00e7 }
            r0[r3] = r6     // Catch:{ all -> 0x00e7 }
            long[] r6 = r5.zzaok     // Catch:{ all -> 0x00e7 }
            int r7 = r5.zzbfn     // Catch:{ all -> 0x00e7 }
            r6[r7] = r9     // Catch:{ all -> 0x00e7 }
            int[] r6 = r5.zzaoj     // Catch:{ all -> 0x00e7 }
            int r7 = r5.zzbfn     // Catch:{ all -> 0x00e7 }
            r6[r7] = r11     // Catch:{ all -> 0x00e7 }
            int[] r6 = r5.zzaxg     // Catch:{ all -> 0x00e7 }
            int r7 = r5.zzbfn     // Catch:{ all -> 0x00e7 }
            r6[r7] = r8     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.internal.ads.zzkf[] r6 = r5.zzbfj     // Catch:{ all -> 0x00e7 }
            int r7 = r5.zzbfn     // Catch:{ all -> 0x00e7 }
            r6[r7] = r12     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.internal.ads.zzho[] r6 = r5.zzbfk     // Catch:{ all -> 0x00e7 }
            int r7 = r5.zzbfn     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.internal.ads.zzho r8 = r5.zzbfs     // Catch:{ all -> 0x00e7 }
            r6[r7] = r8     // Catch:{ all -> 0x00e7 }
            int[] r6 = r5.zzbfi     // Catch:{ all -> 0x00e7 }
            int r7 = r5.zzbfn     // Catch:{ all -> 0x00e7 }
            r6[r7] = r1     // Catch:{ all -> 0x00e7 }
            int r6 = r5.length     // Catch:{ all -> 0x00e7 }
            int r6 = r6 + r2
            r5.length = r6     // Catch:{ all -> 0x00e7 }
            int r7 = r5.zzbfh     // Catch:{ all -> 0x00e7 }
            if (r6 != r7) goto L_0x00da
            int r6 = r5.zzbfh     // Catch:{ all -> 0x00e7 }
            int r6 = r6 + 1000
            int[] r7 = new int[r6]     // Catch:{ all -> 0x00e7 }
            long[] r8 = new long[r6]     // Catch:{ all -> 0x00e7 }
            long[] r9 = new long[r6]     // Catch:{ all -> 0x00e7 }
            int[] r10 = new int[r6]     // Catch:{ all -> 0x00e7 }
            int[] r11 = new int[r6]     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.internal.ads.zzkf[] r12 = new com.google.android.gms.internal.ads.zzkf[r6]     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.internal.ads.zzho[] r0 = new com.google.android.gms.internal.ads.zzho[r6]     // Catch:{ all -> 0x00e7 }
            int r2 = r5.zzbfh     // Catch:{ all -> 0x00e7 }
            int r3 = r5.zzbfm     // Catch:{ all -> 0x00e7 }
            int r2 = r2 - r3
            long[] r3 = r5.zzaok     // Catch:{ all -> 0x00e7 }
            int r4 = r5.zzbfm     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r3, r4, r8, r1, r2)     // Catch:{ all -> 0x00e7 }
            long[] r3 = r5.zzaom     // Catch:{ all -> 0x00e7 }
            int r4 = r5.zzbfm     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r3, r4, r9, r1, r2)     // Catch:{ all -> 0x00e7 }
            int[] r3 = r5.zzaxg     // Catch:{ all -> 0x00e7 }
            int r4 = r5.zzbfm     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r3, r4, r10, r1, r2)     // Catch:{ all -> 0x00e7 }
            int[] r3 = r5.zzaoj     // Catch:{ all -> 0x00e7 }
            int r4 = r5.zzbfm     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r3, r4, r11, r1, r2)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.internal.ads.zzkf[] r3 = r5.zzbfj     // Catch:{ all -> 0x00e7 }
            int r4 = r5.zzbfm     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r3, r4, r12, r1, r2)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.internal.ads.zzho[] r3 = r5.zzbfk     // Catch:{ all -> 0x00e7 }
            int r4 = r5.zzbfm     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r3, r4, r0, r1, r2)     // Catch:{ all -> 0x00e7 }
            int[] r3 = r5.zzbfi     // Catch:{ all -> 0x00e7 }
            int r4 = r5.zzbfm     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r3, r4, r7, r1, r2)     // Catch:{ all -> 0x00e7 }
            int r3 = r5.zzbfm     // Catch:{ all -> 0x00e7 }
            long[] r4 = r5.zzaok     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r4, r1, r8, r2, r3)     // Catch:{ all -> 0x00e7 }
            long[] r4 = r5.zzaom     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r4, r1, r9, r2, r3)     // Catch:{ all -> 0x00e7 }
            int[] r4 = r5.zzaxg     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r4, r1, r10, r2, r3)     // Catch:{ all -> 0x00e7 }
            int[] r4 = r5.zzaoj     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r4, r1, r11, r2, r3)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.internal.ads.zzkf[] r4 = r5.zzbfj     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r4, r1, r12, r2, r3)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.internal.ads.zzho[] r4 = r5.zzbfk     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r4, r1, r0, r2, r3)     // Catch:{ all -> 0x00e7 }
            int[] r4 = r5.zzbfi     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r4, r1, r7, r2, r3)     // Catch:{ all -> 0x00e7 }
            r5.zzaok = r8     // Catch:{ all -> 0x00e7 }
            r5.zzaom = r9     // Catch:{ all -> 0x00e7 }
            r5.zzaxg = r10     // Catch:{ all -> 0x00e7 }
            r5.zzaoj = r11     // Catch:{ all -> 0x00e7 }
            r5.zzbfj = r12     // Catch:{ all -> 0x00e7 }
            r5.zzbfk = r0     // Catch:{ all -> 0x00e7 }
            r5.zzbfi = r7     // Catch:{ all -> 0x00e7 }
            r5.zzbfm = r1     // Catch:{ all -> 0x00e7 }
            int r7 = r5.zzbfh     // Catch:{ all -> 0x00e7 }
            r5.zzbfn = r7     // Catch:{ all -> 0x00e7 }
            int r7 = r5.zzbfh     // Catch:{ all -> 0x00e7 }
            r5.length = r7     // Catch:{ all -> 0x00e7 }
            r5.zzbfh = r6     // Catch:{ all -> 0x00e7 }
            monitor-exit(r5)
            return
        L_0x00da:
            int r6 = r5.zzbfn     // Catch:{ all -> 0x00e7 }
            int r6 = r6 + r2
            r5.zzbfn = r6     // Catch:{ all -> 0x00e7 }
            int r7 = r5.zzbfh     // Catch:{ all -> 0x00e7 }
            if (r6 != r7) goto L_0x00e5
            r5.zzbfn = r1     // Catch:{ all -> 0x00e7 }
        L_0x00e5:
            monitor-exit(r5)
            return
        L_0x00e7:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznf.zza(long, int, long, int, com.google.android.gms.internal.ads.zzkf):void");
    }

    public final synchronized void zzei(long j) {
        this.zzbfp = Math.max(this.zzbfp, j);
    }
}
