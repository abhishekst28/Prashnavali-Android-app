package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzlj implements zzjv, zzke {
    private static final zzka zzapf = new zzlm();
    private static final int zzayq = zzpq.zzbl("qt  ");
    private long zzaid;
    private final zzpk zzapm = new zzpk(zzpf.zzbjn);
    private final zzpk zzapn = new zzpk(4);
    private int zzarb;
    private int zzarc;
    private zzjx zzarf;
    private final zzpk zzaxp = new zzpk(16);
    private final Stack<zzku> zzaxr = new Stack<>();
    private int zzaxt;
    private int zzaxu;
    private long zzaxv;
    private int zzaxw;
    private zzpk zzaxx;
    private zzll[] zzayr;
    private boolean zzays;

    public final boolean zza(zzjy zzjy) throws IOException, InterruptedException {
        return zzlo.zze(zzjy);
    }

    public final void zza(zzjx zzjx) {
        this.zzarf = zzjx;
    }

    public final void zzc(long j, long j2) {
        this.zzaxr.clear();
        this.zzaxw = 0;
        this.zzarc = 0;
        this.zzarb = 0;
        if (j == 0) {
            zzgz();
            return;
        }
        zzll[] zzllArr = this.zzayr;
        if (zzllArr != null) {
            for (zzll zzll : zzllArr) {
                zzls zzls = zzll.zzazx;
                int zzec = zzls.zzec(j2);
                if (zzec == -1) {
                    zzec = zzls.zzed(j2);
                }
                zzll.zzaxa = zzec;
            }
        }
    }

    public final void release() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:153:0x01a3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02bc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(com.google.android.gms.internal.ads.zzjy r24, com.google.android.gms.internal.ads.zzkb r25) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
        L_0x0006:
            int r3 = r0.zzaxt
            r4 = -1
            r5 = 8
            r6 = 1
            if (r3 == 0) goto L_0x01a5
            r8 = 262144(0x40000, double:1.295163E-318)
            r10 = 2
            if (r3 == r6) goto L_0x011f
            if (r3 != r10) goto L_0x0119
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 0
            r5 = -1
        L_0x0020:
            com.google.android.gms.internal.ads.zzll[] r14 = r0.zzayr
            int r15 = r14.length
            if (r3 >= r15) goto L_0x003f
            r14 = r14[r3]
            int r15 = r14.zzaxa
            com.google.android.gms.internal.ads.zzls r11 = r14.zzazx
            int r11 = r11.zzawy
            if (r15 == r11) goto L_0x003c
            com.google.android.gms.internal.ads.zzls r11 = r14.zzazx
            long[] r11 = r11.zzaok
            r14 = r11[r15]
            int r11 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r11 >= 0) goto L_0x003c
            r5 = r3
            r12 = r14
        L_0x003c:
            int r3 = r3 + 1
            goto L_0x0020
        L_0x003f:
            if (r5 != r4) goto L_0x0044
            return r4
        L_0x0044:
            r3 = r14[r5]
            com.google.android.gms.internal.ads.zzkg r4 = r3.zzazy
            int r5 = r3.zzaxa
            com.google.android.gms.internal.ads.zzls r11 = r3.zzazx
            long[] r11 = r11.zzaok
            r12 = r11[r5]
            com.google.android.gms.internal.ads.zzls r11 = r3.zzazx
            int[] r11 = r11.zzaoj
            r11 = r11[r5]
            com.google.android.gms.internal.ads.zzln r14 = r3.zzayi
            int r14 = r14.zzbaa
            if (r14 != r6) goto L_0x0061
            r14 = 8
            long r12 = r12 + r14
            int r11 = r11 + -8
        L_0x0061:
            long r14 = r24.getPosition()
            long r14 = r12 - r14
            int r10 = r0.zzarc
            long r6 = (long) r10
            long r14 = r14 + r6
            r6 = 0
            int r10 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r10 < 0) goto L_0x0115
            int r6 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x0077
            goto L_0x0115
        L_0x0077:
            int r2 = (int) r14
            r1.zzai(r2)
            com.google.android.gms.internal.ads.zzln r2 = r3.zzayi
            int r2 = r2.zzasn
            if (r2 == 0) goto L_0x00db
            com.google.android.gms.internal.ads.zzpk r2 = r0.zzapn
            byte[] r2 = r2.data
            r6 = 0
            r2[r6] = r6
            r7 = 1
            r2[r7] = r6
            r7 = 2
            r2[r7] = r6
            com.google.android.gms.internal.ads.zzln r2 = r3.zzayi
            int r2 = r2.zzasn
            com.google.android.gms.internal.ads.zzln r6 = r3.zzayi
            int r6 = r6.zzasn
            r7 = 4
            int r6 = 4 - r6
        L_0x0099:
            int r7 = r0.zzarc
            if (r7 >= r11) goto L_0x00d8
            int r7 = r0.zzarb
            if (r7 != 0) goto L_0x00c8
            com.google.android.gms.internal.ads.zzpk r7 = r0.zzapn
            byte[] r7 = r7.data
            r1.readFully(r7, r6, r2)
            com.google.android.gms.internal.ads.zzpk r7 = r0.zzapn
            r8 = 0
            r7.zzbo(r8)
            com.google.android.gms.internal.ads.zzpk r7 = r0.zzapn
            int r7 = r7.zzjd()
            r0.zzarb = r7
            com.google.android.gms.internal.ads.zzpk r7 = r0.zzapm
            r7.zzbo(r8)
            com.google.android.gms.internal.ads.zzpk r7 = r0.zzapm
            r8 = 4
            r4.zza(r7, r8)
            int r7 = r0.zzarc
            int r7 = r7 + r8
            r0.zzarc = r7
            int r11 = r11 + r6
            goto L_0x0099
        L_0x00c8:
            r8 = 0
            int r7 = r4.zza(r1, r7, r8)
            int r8 = r0.zzarc
            int r8 = r8 + r7
            r0.zzarc = r8
            int r8 = r0.zzarb
            int r8 = r8 - r7
            r0.zzarb = r8
            goto L_0x0099
        L_0x00d8:
            r20 = r11
            goto L_0x00f3
        L_0x00db:
            int r2 = r0.zzarc
            if (r2 >= r11) goto L_0x00f1
            int r2 = r11 - r2
            r6 = 0
            int r2 = r4.zza(r1, r2, r6)
            int r6 = r0.zzarc
            int r6 = r6 + r2
            r0.zzarc = r6
            int r6 = r0.zzarb
            int r6 = r6 - r2
            r0.zzarb = r6
            goto L_0x00db
        L_0x00f1:
            r20 = r11
        L_0x00f3:
            com.google.android.gms.internal.ads.zzls r1 = r3.zzazx
            long[] r1 = r1.zzbbd
            r17 = r1[r5]
            com.google.android.gms.internal.ads.zzls r1 = r3.zzazx
            int[] r1 = r1.zzaxg
            r19 = r1[r5]
            r21 = 0
            r22 = 0
            r16 = r4
            r16.zza(r17, r19, r20, r21, r22)
            int r1 = r3.zzaxa
            r2 = 1
            int r1 = r1 + r2
            r3.zzaxa = r1
            r1 = 0
            r0.zzarc = r1
            r0.zzarb = r1
            return r1
        L_0x0115:
            r2.position = r12
            r1 = 1
            return r1
        L_0x0119:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x011f:
            long r3 = r0.zzaxv
            int r6 = r0.zzaxw
            long r6 = (long) r6
            long r3 = r3 - r6
            long r6 = r24.getPosition()
            long r6 = r6 + r3
            com.google.android.gms.internal.ads.zzpk r10 = r0.zzaxx
            if (r10 == 0) goto L_0x0182
            byte[] r8 = r10.data
            int r9 = r0.zzaxw
            int r4 = (int) r3
            r1.readFully(r8, r9, r4)
            int r3 = r0.zzaxu
            int r4 = com.google.android.gms.internal.ads.zzkr.zzaso
            if (r3 != r4) goto L_0x0165
            com.google.android.gms.internal.ads.zzpk r3 = r0.zzaxx
            r3.zzbo(r5)
            int r4 = r3.readInt()
            int r5 = zzayq
            if (r4 != r5) goto L_0x014d
            r3 = 1
            goto L_0x0162
        L_0x014d:
            r4 = 4
            r3.zzbp(r4)
        L_0x0151:
            int r4 = r3.zziy()
            if (r4 <= 0) goto L_0x0161
            int r4 = r3.readInt()
            int r5 = zzayq
            if (r4 != r5) goto L_0x0151
            r3 = 1
            goto L_0x0162
        L_0x0161:
            r3 = 0
        L_0x0162:
            r0.zzays = r3
            goto L_0x018a
        L_0x0165:
            java.util.Stack<com.google.android.gms.internal.ads.zzku> r3 = r0.zzaxr
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x018a
            java.util.Stack<com.google.android.gms.internal.ads.zzku> r3 = r0.zzaxr
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.zzku r3 = (com.google.android.gms.internal.ads.zzku) r3
            com.google.android.gms.internal.ads.zzkt r4 = new com.google.android.gms.internal.ads.zzkt
            int r5 = r0.zzaxu
            com.google.android.gms.internal.ads.zzpk r8 = r0.zzaxx
            r4.<init>(r5, r8)
            r3.zza((com.google.android.gms.internal.ads.zzkt) r4)
            goto L_0x018a
        L_0x0182:
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x018c
            int r4 = (int) r3
            r1.zzai(r4)
        L_0x018a:
            r3 = 0
            goto L_0x0194
        L_0x018c:
            long r8 = r24.getPosition()
            long r8 = r8 + r3
            r2.position = r8
            r3 = 1
        L_0x0194:
            r0.zzeb(r6)
            if (r3 == 0) goto L_0x01a0
            int r3 = r0.zzaxt
            r4 = 2
            if (r3 == r4) goto L_0x01a0
            r7 = 1
            goto L_0x01a1
        L_0x01a0:
            r7 = 0
        L_0x01a1:
            if (r7 == 0) goto L_0x0006
            r3 = 1
            return r3
        L_0x01a5:
            r3 = 1
            int r6 = r0.zzaxw
            if (r6 != 0) goto L_0x01cf
            com.google.android.gms.internal.ads.zzpk r6 = r0.zzaxp
            byte[] r6 = r6.data
            r7 = 0
            boolean r6 = r1.zza(r6, r7, r5, r3)
            if (r6 != 0) goto L_0x01b8
            r6 = 0
            goto L_0x02ba
        L_0x01b8:
            r0.zzaxw = r5
            com.google.android.gms.internal.ads.zzpk r3 = r0.zzaxp
            r3.zzbo(r7)
            com.google.android.gms.internal.ads.zzpk r3 = r0.zzaxp
            long r6 = r3.zzja()
            r0.zzaxv = r6
            com.google.android.gms.internal.ads.zzpk r3 = r0.zzaxp
            int r3 = r3.readInt()
            r0.zzaxu = r3
        L_0x01cf:
            long r6 = r0.zzaxv
            r8 = 1
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x01ec
            com.google.android.gms.internal.ads.zzpk r3 = r0.zzaxp
            byte[] r3 = r3.data
            r1.readFully(r3, r5, r5)
            int r3 = r0.zzaxw
            int r3 = r3 + r5
            r0.zzaxw = r3
            com.google.android.gms.internal.ads.zzpk r3 = r0.zzaxp
            long r6 = r3.zzje()
            r0.zzaxv = r6
        L_0x01ec:
            int r3 = r0.zzaxu
            int r6 = com.google.android.gms.internal.ads.zzkr.zzatp
            if (r3 == r6) goto L_0x0209
            int r6 = com.google.android.gms.internal.ads.zzkr.zzatr
            if (r3 == r6) goto L_0x0209
            int r6 = com.google.android.gms.internal.ads.zzkr.zzats
            if (r3 == r6) goto L_0x0209
            int r6 = com.google.android.gms.internal.ads.zzkr.zzatt
            if (r3 == r6) goto L_0x0209
            int r6 = com.google.android.gms.internal.ads.zzkr.zzatu
            if (r3 == r6) goto L_0x0209
            int r6 = com.google.android.gms.internal.ads.zzkr.zzaud
            if (r3 != r6) goto L_0x0207
            goto L_0x0209
        L_0x0207:
            r6 = 0
            goto L_0x020a
        L_0x0209:
            r6 = 1
        L_0x020a:
            if (r6 == 0) goto L_0x0238
            long r5 = r24.getPosition()
            long r7 = r0.zzaxv
            long r5 = r5 + r7
            int r3 = r0.zzaxw
            long r7 = (long) r3
            long r5 = r5 - r7
            java.util.Stack<com.google.android.gms.internal.ads.zzku> r3 = r0.zzaxr
            com.google.android.gms.internal.ads.zzku r7 = new com.google.android.gms.internal.ads.zzku
            int r8 = r0.zzaxu
            r7.<init>(r8, r5)
            r3.add(r7)
            long r7 = r0.zzaxv
            int r3 = r0.zzaxw
            long r9 = (long) r3
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x0232
            r0.zzeb(r5)
            r3 = 1
            goto L_0x02b9
        L_0x0232:
            r23.zzgz()
            r3 = 1
            goto L_0x02b9
        L_0x0238:
            int r3 = r0.zzaxu
            int r6 = com.google.android.gms.internal.ads.zzkr.zzauf
            if (r3 == r6) goto L_0x027d
            int r6 = com.google.android.gms.internal.ads.zzkr.zzatq
            if (r3 == r6) goto L_0x027d
            int r6 = com.google.android.gms.internal.ads.zzkr.zzaug
            if (r3 == r6) goto L_0x027d
            int r6 = com.google.android.gms.internal.ads.zzkr.zzauh
            if (r3 == r6) goto L_0x027d
            int r6 = com.google.android.gms.internal.ads.zzkr.zzava
            if (r3 == r6) goto L_0x027d
            int r6 = com.google.android.gms.internal.ads.zzkr.zzavb
            if (r3 == r6) goto L_0x027d
            int r6 = com.google.android.gms.internal.ads.zzkr.zzavc
            if (r3 == r6) goto L_0x027d
            int r6 = com.google.android.gms.internal.ads.zzkr.zzaue
            if (r3 == r6) goto L_0x027d
            int r6 = com.google.android.gms.internal.ads.zzkr.zzavd
            if (r3 == r6) goto L_0x027d
            int r6 = com.google.android.gms.internal.ads.zzkr.zzave
            if (r3 == r6) goto L_0x027d
            int r6 = com.google.android.gms.internal.ads.zzkr.zzavf
            if (r3 == r6) goto L_0x027d
            int r6 = com.google.android.gms.internal.ads.zzkr.zzavg
            if (r3 == r6) goto L_0x027d
            int r6 = com.google.android.gms.internal.ads.zzkr.zzavh
            if (r3 == r6) goto L_0x027d
            int r6 = com.google.android.gms.internal.ads.zzkr.zzauc
            if (r3 == r6) goto L_0x027d
            int r6 = com.google.android.gms.internal.ads.zzkr.zzaso
            if (r3 == r6) goto L_0x027d
            int r6 = com.google.android.gms.internal.ads.zzkr.zzavo
            if (r3 != r6) goto L_0x027b
            goto L_0x027d
        L_0x027b:
            r6 = 0
            goto L_0x027e
        L_0x027d:
            r6 = 1
        L_0x027e:
            if (r6 == 0) goto L_0x02b3
            int r3 = r0.zzaxw
            if (r3 != r5) goto L_0x0286
            r6 = 1
            goto L_0x0287
        L_0x0286:
            r6 = 0
        L_0x0287:
            com.google.android.gms.internal.ads.zzoz.checkState(r6)
            long r6 = r0.zzaxv
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 > 0) goto L_0x0295
            r6 = 1
            goto L_0x0296
        L_0x0295:
            r6 = 0
        L_0x0296:
            com.google.android.gms.internal.ads.zzoz.checkState(r6)
            com.google.android.gms.internal.ads.zzpk r3 = new com.google.android.gms.internal.ads.zzpk
            long r6 = r0.zzaxv
            int r7 = (int) r6
            r3.<init>((int) r7)
            r0.zzaxx = r3
            com.google.android.gms.internal.ads.zzpk r3 = r0.zzaxp
            byte[] r3 = r3.data
            com.google.android.gms.internal.ads.zzpk r6 = r0.zzaxx
            byte[] r6 = r6.data
            r7 = 0
            java.lang.System.arraycopy(r3, r7, r6, r7, r5)
            r3 = 1
            r0.zzaxt = r3
            goto L_0x02b9
        L_0x02b3:
            r3 = 1
            r5 = 0
            r0.zzaxx = r5
            r0.zzaxt = r3
        L_0x02b9:
            r6 = 1
        L_0x02ba:
            if (r6 != 0) goto L_0x02bd
            return r4
        L_0x02bd:
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlj.zza(com.google.android.gms.internal.ads.zzjy, com.google.android.gms.internal.ads.zzkb):int");
    }

    public final boolean isSeekable() {
        return true;
    }

    public final long getDurationUs() {
        return this.zzaid;
    }

    public final long zzdz(long j) {
        long j2 = Long.MAX_VALUE;
        for (zzll zzll : this.zzayr) {
            zzls zzls = zzll.zzazx;
            int zzec = zzls.zzec(j);
            if (zzec == -1) {
                zzec = zzls.zzed(j);
            }
            long j3 = zzls.zzaok[zzec];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    private final void zzgz() {
        this.zzaxt = 0;
        this.zzaxw = 0;
    }

    private final void zzeb(long j) throws zzhv {
        zzmc zzmc;
        zzjz zzjz;
        while (!this.zzaxr.isEmpty() && this.zzaxr.peek().zzawf == j) {
            zzku pop = this.zzaxr.pop();
            if (pop.type == zzkr.zzatp) {
                long j2 = -9223372036854775807L;
                ArrayList arrayList = new ArrayList();
                long j3 = Long.MAX_VALUE;
                zzmc zzmc2 = null;
                zzjz zzjz2 = new zzjz();
                zzkt zzau = pop.zzau(zzkr.zzavo);
                if (!(zzau == null || (zzmc2 = zzkw.zza(zzau, this.zzays)) == null)) {
                    zzjz2.zzb(zzmc2);
                }
                int i = 0;
                while (i < pop.zzawh.size()) {
                    zzku zzku = pop.zzawh.get(i);
                    if (zzku.type == zzkr.zzatr) {
                        zzln zza = zzkw.zza(zzku, pop.zzau(zzkr.zzatq), -9223372036854775807L, (zzjn) null, this.zzays);
                        if (zza != null) {
                            zzls zza2 = zzkw.zza(zza, zzku.zzav(zzkr.zzats).zzav(zzkr.zzatt).zzav(zzkr.zzatu), zzjz2);
                            if (zza2.zzawy != 0) {
                                zzll zzll = new zzll(zza, zza2, this.zzarf.zzc(i, zza.type));
                                zzho zzv = zza.zzaht.zzv(zza2.zzaxe + 30);
                                if (zza.type == 1) {
                                    if (zzjz2.zzgq()) {
                                        zzv = zzv.zzb(zzjz2.zzahl, zzjz2.zzahm);
                                    }
                                    if (zzmc2 != null) {
                                        zzv = zzv.zza(zzmc2);
                                    }
                                }
                                zzll.zzazy.zze(zzv);
                                zzmc = zzmc2;
                                zzjz = zzjz2;
                                j2 = Math.max(j2, zza.zzaid);
                                arrayList.add(zzll);
                                long j4 = zza2.zzaok[0];
                                if (j4 < j3) {
                                    j3 = j4;
                                }
                            } else {
                                zzmc = zzmc2;
                                zzjz = zzjz2;
                            }
                        } else {
                            zzmc = zzmc2;
                            zzjz = zzjz2;
                        }
                    } else {
                        zzmc = zzmc2;
                        zzjz = zzjz2;
                    }
                    i++;
                    zzjz2 = zzjz;
                    zzmc2 = zzmc;
                }
                this.zzaid = j2;
                this.zzayr = (zzll[]) arrayList.toArray(new zzll[arrayList.size()]);
                this.zzarf.zzgp();
                this.zzarf.zza(this);
                this.zzaxr.clear();
                this.zzaxt = 2;
            } else if (!this.zzaxr.isEmpty()) {
                this.zzaxr.peek().zza(pop);
            }
        }
        if (this.zzaxt != 2) {
            zzgz();
        }
    }
}
