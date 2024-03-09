package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzqb {
    private final zzqe zzbmc;
    private final boolean zzbmd;
    private final long zzbme;
    private final long zzbmf;
    private long zzbmg;
    private long zzbmh;
    private long zzbmi;
    private boolean zzbmj;
    private long zzbmk;
    private long zzbml;
    private long zzbmm;

    public zzqb() {
        this(-1.0d);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzqb(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "window"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.view.Display r0 = r3.getDefaultDisplay()
            if (r0 == 0) goto L_0x0019
            android.view.Display r3 = r3.getDefaultDisplay()
            float r3 = r3.getRefreshRate()
            double r0 = (double) r3
            goto L_0x001b
        L_0x0019:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L_0x001b:
            r2.<init>((double) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqb.<init>(android.content.Context):void");
    }

    private zzqb(double d) {
        boolean z = d != -1.0d;
        this.zzbmd = z;
        if (z) {
            this.zzbmc = zzqe.zzjn();
            long j = (long) (1.0E9d / d);
            this.zzbme = j;
            this.zzbmf = (j * 80) / 100;
            return;
        }
        this.zzbmc = null;
        this.zzbme = -1;
        this.zzbmf = -1;
    }

    public final void enable() {
        this.zzbmj = false;
        if (this.zzbmd) {
            this.zzbmc.zzjo();
        }
    }

    public final void disable() {
        if (this.zzbmd) {
            this.zzbmc.zzjp();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long zzf(long r12, long r14) {
        /*
            r11 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r12
            boolean r2 = r11.zzbmj
            if (r2 == 0) goto L_0x0045
            long r2 = r11.zzbmg
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x001b
            long r2 = r11.zzbmm
            r4 = 1
            long r2 = r2 + r4
            r11.zzbmm = r2
            long r2 = r11.zzbmi
            r11.zzbmh = r2
        L_0x001b:
            long r2 = r11.zzbmm
            r4 = 6
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x003d
            long r4 = r11.zzbml
            long r4 = r0 - r4
            long r4 = r4 / r2
            long r2 = r11.zzbmh
            long r2 = r2 + r4
            boolean r4 = r11.zzg(r2, r14)
            if (r4 == 0) goto L_0x0035
            r11.zzbmj = r6
            goto L_0x0045
        L_0x0035:
            long r4 = r11.zzbmk
            long r4 = r4 + r2
            long r6 = r11.zzbml
            long r4 = r4 - r6
            goto L_0x0047
        L_0x003d:
            boolean r2 = r11.zzg(r0, r14)
            if (r2 == 0) goto L_0x0045
            r11.zzbmj = r6
        L_0x0045:
            r4 = r14
            r2 = r0
        L_0x0047:
            boolean r6 = r11.zzbmj
            r7 = 0
            if (r6 != 0) goto L_0x0056
            r11.zzbml = r0
            r11.zzbmk = r14
            r11.zzbmm = r7
            r14 = 1
            r11.zzbmj = r14
        L_0x0056:
            r11.zzbmg = r12
            r11.zzbmi = r2
            com.google.android.gms.internal.ads.zzqe r12 = r11.zzbmc
            if (r12 == 0) goto L_0x008a
            long r12 = r12.zzbmo
            int r14 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r14 != 0) goto L_0x0065
            goto L_0x008a
        L_0x0065:
            com.google.android.gms.internal.ads.zzqe r12 = r11.zzbmc
            long r12 = r12.zzbmo
            long r14 = r11.zzbme
            long r0 = r4 - r12
            long r0 = r0 / r14
            long r0 = r0 * r14
            long r12 = r12 + r0
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x0078
            long r14 = r12 - r14
            goto L_0x007d
        L_0x0078:
            long r14 = r14 + r12
            r9 = r12
            r12 = r14
            r14 = r9
        L_0x007d:
            long r0 = r12 - r4
            long r4 = r4 - r14
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r12 = r14
        L_0x0086:
            long r14 = r11.zzbmf
            long r12 = r12 - r14
            return r12
        L_0x008a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqb.zzf(long, long):long");
    }

    private final boolean zzg(long j, long j2) {
        return Math.abs((j2 - this.zzbmk) - (j - this.zzbml)) > 20000000;
    }
}
