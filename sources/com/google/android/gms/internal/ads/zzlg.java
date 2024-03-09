package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzjn;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzlg implements zzjv {
    private static final zzka zzapf = new zzlf();
    private static final int zzaxh = zzpq.zzbl("seig");
    private static final byte[] zzaxi = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private final int flags;
    private long zzaid;
    private final zzpk zzapm;
    private int zzarb;
    private int zzarc;
    private zzjx zzarf;
    private final zzln zzaxj;
    private final SparseArray<zzlh> zzaxk;
    private final zzpk zzaxl;
    private final zzpk zzaxm;
    private final zzpk zzaxn;
    private final zzpo zzaxo;
    private final zzpk zzaxp;
    private final byte[] zzaxq;
    private final Stack<zzku> zzaxr;
    private final LinkedList<zzli> zzaxs;
    private int zzaxt;
    private int zzaxu;
    private long zzaxv;
    private int zzaxw;
    private zzpk zzaxx;
    private long zzaxy;
    private int zzaxz;
    private long zzaya;
    private zzlh zzayb;
    private int zzayc;
    private boolean zzayd;
    private zzkg zzaye;
    private zzkg[] zzayf;
    private boolean zzayg;

    public zzlg() {
        this(0);
    }

    private zzlg(int i) {
        this(0, (zzpo) null);
    }

    private zzlg(int i, zzpo zzpo) {
        this(0, (zzpo) null, (zzln) null);
    }

    private zzlg(int i, zzpo zzpo, zzln zzln) {
        this.flags = i;
        this.zzaxo = null;
        this.zzaxj = null;
        this.zzaxp = new zzpk(16);
        this.zzapm = new zzpk(zzpf.zzbjn);
        this.zzaxl = new zzpk(5);
        this.zzaxm = new zzpk();
        this.zzaxn = new zzpk(1);
        this.zzaxq = new byte[16];
        this.zzaxr = new Stack<>();
        this.zzaxs = new LinkedList<>();
        this.zzaxk = new SparseArray<>();
        this.zzaid = -9223372036854775807L;
        this.zzaya = -9223372036854775807L;
        zzgz();
    }

    public final boolean zza(zzjy zzjy) throws IOException, InterruptedException {
        return zzlo.zzd(zzjy);
    }

    public final void zza(zzjx zzjx) {
        this.zzarf = zzjx;
    }

    public final void zzc(long j, long j2) {
        int size = this.zzaxk.size();
        for (int i = 0; i < size; i++) {
            this.zzaxk.valueAt(i).reset();
        }
        this.zzaxs.clear();
        this.zzaxz = 0;
        this.zzaxr.clear();
        zzgz();
    }

    public final void release() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:254:0x0609 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x02a1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0004 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0004 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(com.google.android.gms.internal.ads.zzjy r27, com.google.android.gms.internal.ads.zzkb r28) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
        L_0x0004:
            int r2 = r0.zzaxt
            r3 = 2
            r5 = 8
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x0474
            r8 = 4
            if (r2 == r6) goto L_0x0308
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 3
            if (r2 == r3) goto L_0x02a9
            if (r2 != r11) goto L_0x010f
            com.google.android.gms.internal.ads.zzlh r2 = r0.zzayb
            if (r2 != 0) goto L_0x0089
            android.util.SparseArray<com.google.android.gms.internal.ads.zzlh> r2 = r0.zzaxk
            int r12 = r2.size()
            r13 = 0
            r14 = 0
        L_0x0029:
            if (r13 >= r12) goto L_0x004d
            java.lang.Object r15 = r2.valueAt(r13)
            com.google.android.gms.internal.ads.zzlh r15 = (com.google.android.gms.internal.ads.zzlh) r15
            int r11 = r15.zzaym
            com.google.android.gms.internal.ads.zzlp r4 = r15.zzayh
            int r4 = r4.zzbaj
            if (r11 == r4) goto L_0x0049
            com.google.android.gms.internal.ads.zzlp r4 = r15.zzayh
            long[] r4 = r4.zzbak
            int r11 = r15.zzaym
            r17 = r4[r11]
            int r4 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r4 >= 0) goto L_0x0049
            r14 = r15
            r9 = r17
        L_0x0049:
            int r13 = r13 + 1
            r11 = 3
            goto L_0x0029
        L_0x004d:
            if (r14 != 0) goto L_0x006c
            long r2 = r0.zzaxy
            long r4 = r27.getPosition()
            long r2 = r2 - r4
            int r3 = (int) r2
            if (r3 < 0) goto L_0x0064
            r1.zzai(r3)
            r26.zzgz()
            r6 = 0
            goto L_0x029f
        L_0x0064:
            com.google.android.gms.internal.ads.zzhv r1 = new com.google.android.gms.internal.ads.zzhv
            java.lang.String r2 = "Offset to end of mdat was negative."
            r1.<init>(r2)
            throw r1
        L_0x006c:
            com.google.android.gms.internal.ads.zzlp r2 = r14.zzayh
            long[] r2 = r2.zzbak
            int r4 = r14.zzaym
            r9 = r2[r4]
            long r11 = r27.getPosition()
            long r9 = r9 - r11
            int r2 = (int) r9
            if (r2 >= 0) goto L_0x0084
            java.lang.String r2 = "FragmentedMp4Extractor"
            java.lang.String r4 = "Ignoring negative offset to sample data."
            android.util.Log.w(r2, r4)
            r2 = 0
        L_0x0084:
            r1.zzai(r2)
            r0.zzayb = r14
        L_0x0089:
            com.google.android.gms.internal.ads.zzlh r2 = r0.zzayb
            com.google.android.gms.internal.ads.zzlp r2 = r2.zzayh
            int[] r2 = r2.zzbam
            com.google.android.gms.internal.ads.zzlh r4 = r0.zzayb
            int r4 = r4.zzayk
            r2 = r2[r4]
            r0.zzayc = r2
            com.google.android.gms.internal.ads.zzlh r2 = r0.zzayb
            com.google.android.gms.internal.ads.zzlp r2 = r2.zzayh
            boolean r2 = r2.zzbaq
            if (r2 == 0) goto L_0x00f9
            com.google.android.gms.internal.ads.zzlh r2 = r0.zzayb
            com.google.android.gms.internal.ads.zzlp r4 = r2.zzayh
            com.google.android.gms.internal.ads.zzpk r9 = r4.zzbau
            com.google.android.gms.internal.ads.zzlb r10 = r4.zzbaf
            int r10 = r10.zzaxd
            com.google.android.gms.internal.ads.zzlq r11 = r4.zzbas
            if (r11 == 0) goto L_0x00b0
            com.google.android.gms.internal.ads.zzlq r10 = r4.zzbas
            goto L_0x00b6
        L_0x00b0:
            com.google.android.gms.internal.ads.zzln r11 = r2.zzayi
            com.google.android.gms.internal.ads.zzlq[] r11 = r11.zzbab
            r10 = r11[r10]
        L_0x00b6:
            int r10 = r10.zzbay
            boolean[] r4 = r4.zzbar
            int r11 = r2.zzayk
            boolean r4 = r4[r11]
            com.google.android.gms.internal.ads.zzpk r11 = r0.zzaxn
            byte[] r11 = r11.data
            if (r4 == 0) goto L_0x00c7
            r12 = 128(0x80, float:1.794E-43)
            goto L_0x00c8
        L_0x00c7:
            r12 = 0
        L_0x00c8:
            r12 = r12 | r10
            byte r12 = (byte) r12
            r11[r7] = r12
            com.google.android.gms.internal.ads.zzpk r11 = r0.zzaxn
            r11.zzbo(r7)
            com.google.android.gms.internal.ads.zzkg r2 = r2.zzasm
            com.google.android.gms.internal.ads.zzpk r11 = r0.zzaxn
            r2.zza(r11, r6)
            r2.zza(r9, r10)
            if (r4 != 0) goto L_0x00e0
            int r10 = r10 + 1
            goto L_0x00f1
        L_0x00e0:
            int r4 = r9.readUnsignedShort()
            r11 = -2
            r9.zzbp(r11)
            int r4 = r4 * 6
            int r4 = r4 + r3
            r2.zza(r9, r4)
            int r10 = r10 + 1
            int r10 = r10 + r4
        L_0x00f1:
            r0.zzarc = r10
            int r2 = r0.zzayc
            int r2 = r2 + r10
            r0.zzayc = r2
            goto L_0x00fb
        L_0x00f9:
            r0.zzarc = r7
        L_0x00fb:
            com.google.android.gms.internal.ads.zzlh r2 = r0.zzayb
            com.google.android.gms.internal.ads.zzln r2 = r2.zzayi
            int r2 = r2.zzbaa
            if (r2 != r6) goto L_0x010b
            int r2 = r0.zzayc
            int r2 = r2 - r5
            r0.zzayc = r2
            r1.zzai(r5)
        L_0x010b:
            r0.zzaxt = r8
            r0.zzarb = r7
        L_0x010f:
            com.google.android.gms.internal.ads.zzlh r2 = r0.zzayb
            com.google.android.gms.internal.ads.zzlp r2 = r2.zzayh
            com.google.android.gms.internal.ads.zzlh r4 = r0.zzayb
            com.google.android.gms.internal.ads.zzln r4 = r4.zzayi
            com.google.android.gms.internal.ads.zzlh r5 = r0.zzayb
            com.google.android.gms.internal.ads.zzkg r9 = r5.zzasm
            com.google.android.gms.internal.ads.zzlh r5 = r0.zzayb
            int r5 = r5.zzayk
            int r10 = r4.zzasn
            r11 = 1000(0x3e8, double:4.94E-321)
            if (r10 == 0) goto L_0x01e1
            com.google.android.gms.internal.ads.zzpk r10 = r0.zzaxl
            byte[] r10 = r10.data
            r10[r7] = r7
            r10[r6] = r7
            r10[r3] = r7
            int r3 = r4.zzasn
            int r3 = r3 + r6
            int r13 = r4.zzasn
            int r13 = 4 - r13
        L_0x0136:
            int r14 = r0.zzarc
            int r15 = r0.zzayc
            if (r14 >= r15) goto L_0x01e0
            int r14 = r0.zzarb
            if (r14 != 0) goto L_0x0181
            r1.readFully(r10, r13, r3)
            com.google.android.gms.internal.ads.zzpk r14 = r0.zzaxl
            r14.zzbo(r7)
            com.google.android.gms.internal.ads.zzpk r14 = r0.zzaxl
            int r14 = r14.zzjd()
            int r14 = r14 - r6
            r0.zzarb = r14
            com.google.android.gms.internal.ads.zzpk r14 = r0.zzapm
            r14.zzbo(r7)
            com.google.android.gms.internal.ads.zzpk r14 = r0.zzapm
            r9.zza(r14, r8)
            com.google.android.gms.internal.ads.zzpk r14 = r0.zzaxl
            r9.zza(r14, r6)
            com.google.android.gms.internal.ads.zzkg[] r14 = r0.zzayf
            if (r14 == 0) goto L_0x0172
            com.google.android.gms.internal.ads.zzho r14 = r4.zzaht
            java.lang.String r14 = r14.zzagy
            byte r15 = r10[r8]
            boolean r14 = com.google.android.gms.internal.ads.zzpf.zza(r14, r15)
            if (r14 == 0) goto L_0x0172
            r14 = 1
            goto L_0x0173
        L_0x0172:
            r14 = 0
        L_0x0173:
            r0.zzayd = r14
            int r14 = r0.zzarc
            int r14 = r14 + 5
            r0.zzarc = r14
            int r14 = r0.zzayc
            int r14 = r14 + r13
            r0.zzayc = r14
            goto L_0x0136
        L_0x0181:
            boolean r15 = r0.zzayd
            if (r15 == 0) goto L_0x01cc
            com.google.android.gms.internal.ads.zzpk r15 = r0.zzaxm
            r15.reset(r14)
            com.google.android.gms.internal.ads.zzpk r14 = r0.zzaxm
            byte[] r14 = r14.data
            int r15 = r0.zzarb
            r1.readFully(r14, r7, r15)
            com.google.android.gms.internal.ads.zzpk r14 = r0.zzaxm
            int r15 = r0.zzarb
            r9.zza(r14, r15)
            int r14 = r0.zzarb
            com.google.android.gms.internal.ads.zzpk r15 = r0.zzaxm
            byte[] r15 = r15.data
            com.google.android.gms.internal.ads.zzpk r8 = r0.zzaxm
            int r8 = r8.limit()
            int r8 = com.google.android.gms.internal.ads.zzpf.zzb(r15, r8)
            com.google.android.gms.internal.ads.zzpk r15 = r0.zzaxm
            com.google.android.gms.internal.ads.zzho r6 = r4.zzaht
            java.lang.String r6 = r6.zzagy
            java.lang.String r7 = "video/hevc"
            boolean r6 = r7.equals(r6)
            r15.zzbo(r6)
            com.google.android.gms.internal.ads.zzpk r6 = r0.zzaxm
            r6.zzbn(r8)
            long r6 = r2.zzax(r5)
            long r6 = r6 * r11
            com.google.android.gms.internal.ads.zzpk r8 = r0.zzaxm
            com.google.android.gms.internal.ads.zzkg[] r15 = r0.zzayf
            com.google.android.gms.internal.ads.zznr.zza(r6, r8, r15)
            goto L_0x01d1
        L_0x01cc:
            r6 = 0
            int r14 = r9.zza(r1, r14, r6)
        L_0x01d1:
            int r6 = r0.zzarc
            int r6 = r6 + r14
            r0.zzarc = r6
            int r6 = r0.zzarb
            int r6 = r6 - r14
            r0.zzarb = r6
            r6 = 1
            r7 = 0
            r8 = 4
            goto L_0x0136
        L_0x01e0:
            goto L_0x01f3
        L_0x01e1:
            int r3 = r0.zzarc
            int r6 = r0.zzayc
            if (r3 >= r6) goto L_0x01f3
            int r6 = r6 - r3
            r3 = 0
            int r6 = r9.zza(r1, r6, r3)
            int r3 = r0.zzarc
            int r3 = r3 + r6
            r0.zzarc = r3
            goto L_0x01e1
        L_0x01f3:
            long r6 = r2.zzax(r5)
            long r6 = r6 * r11
            com.google.android.gms.internal.ads.zzpo r3 = r0.zzaxo
            if (r3 != 0) goto L_0x02a3
            boolean r3 = r2.zzbaq
            if (r3 == 0) goto L_0x0204
            r3 = 1073741824(0x40000000, float:2.0)
            goto L_0x0205
        L_0x0204:
            r3 = 0
        L_0x0205:
            boolean[] r8 = r2.zzbap
            boolean r5 = r8[r5]
            r12 = r3 | r5
            boolean r3 = r2.zzbaq
            if (r3 == 0) goto L_0x0236
            com.google.android.gms.internal.ads.zzlq r3 = r2.zzbas
            if (r3 == 0) goto L_0x0218
            com.google.android.gms.internal.ads.zzlq r3 = r2.zzbas
            goto L_0x0220
        L_0x0218:
            com.google.android.gms.internal.ads.zzlq[] r3 = r4.zzbab
            com.google.android.gms.internal.ads.zzlb r4 = r2.zzbaf
            int r4 = r4.zzaxd
            r3 = r3[r4]
        L_0x0220:
            com.google.android.gms.internal.ads.zzlh r4 = r0.zzayb
            com.google.android.gms.internal.ads.zzlq r4 = r4.zzayo
            if (r3 == r4) goto L_0x0230
            com.google.android.gms.internal.ads.zzkf r4 = new com.google.android.gms.internal.ads.zzkf
            byte[] r5 = r3.zzbaz
            r8 = 1
            r4.<init>(r8, r5)
            r15 = r4
            goto L_0x0238
        L_0x0230:
            com.google.android.gms.internal.ads.zzlh r4 = r0.zzayb
            com.google.android.gms.internal.ads.zzkf r4 = r4.zzayn
            r15 = r4
            goto L_0x0238
        L_0x0236:
            r3 = 0
            r15 = 0
        L_0x0238:
            com.google.android.gms.internal.ads.zzlh r4 = r0.zzayb
            r4.zzayn = r15
            com.google.android.gms.internal.ads.zzlh r4 = r0.zzayb
            r4.zzayo = r3
            int r13 = r0.zzayc
            r14 = 0
            r10 = r6
            r9.zza(r10, r12, r13, r14, r15)
        L_0x0247:
            java.util.LinkedList<com.google.android.gms.internal.ads.zzli> r3 = r0.zzaxs
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x026e
            java.util.LinkedList<com.google.android.gms.internal.ads.zzli> r3 = r0.zzaxs
            java.lang.Object r3 = r3.removeFirst()
            com.google.android.gms.internal.ads.zzli r3 = (com.google.android.gms.internal.ads.zzli) r3
            int r4 = r0.zzaxz
            int r5 = r3.size
            int r4 = r4 - r5
            r0.zzaxz = r4
            com.google.android.gms.internal.ads.zzkg r8 = r0.zzaye
            long r4 = r3.zzayp
            long r9 = r6 + r4
            r11 = 1
            int r12 = r3.size
            int r13 = r0.zzaxz
            r14 = 0
            r8.zza(r9, r11, r12, r13, r14)
            goto L_0x0247
        L_0x026e:
            com.google.android.gms.internal.ads.zzlh r3 = r0.zzayb
            int r4 = r3.zzayk
            r5 = 1
            int r4 = r4 + r5
            r3.zzayk = r4
            com.google.android.gms.internal.ads.zzlh r3 = r0.zzayb
            int r4 = r3.zzayl
            int r4 = r4 + r5
            r3.zzayl = r4
            com.google.android.gms.internal.ads.zzlh r3 = r0.zzayb
            int r3 = r3.zzayl
            int[] r2 = r2.zzbal
            com.google.android.gms.internal.ads.zzlh r4 = r0.zzayb
            int r4 = r4.zzaym
            r2 = r2[r4]
            if (r3 != r2) goto L_0x029b
            com.google.android.gms.internal.ads.zzlh r2 = r0.zzayb
            int r3 = r2.zzaym
            r4 = 1
            int r3 = r3 + r4
            r2.zzaym = r3
            com.google.android.gms.internal.ads.zzlh r2 = r0.zzayb
            r3 = 0
            r2.zzayl = r3
            r2 = 0
            r0.zzayb = r2
        L_0x029b:
            r2 = 3
            r0.zzaxt = r2
            r6 = 1
        L_0x029f:
            if (r6 == 0) goto L_0x0004
            r1 = 0
            return r1
        L_0x02a3:
            java.lang.NoSuchMethodError r1 = new java.lang.NoSuchMethodError
            r1.<init>()
            throw r1
        L_0x02a9:
            android.util.SparseArray<com.google.android.gms.internal.ads.zzlh> r2 = r0.zzaxk
            int r2 = r2.size()
            r3 = 0
            r4 = 0
        L_0x02b4:
            if (r3 >= r2) goto L_0x02d9
            android.util.SparseArray<com.google.android.gms.internal.ads.zzlh> r5 = r0.zzaxk
            java.lang.Object r5 = r5.valueAt(r3)
            com.google.android.gms.internal.ads.zzlh r5 = (com.google.android.gms.internal.ads.zzlh) r5
            com.google.android.gms.internal.ads.zzlp r5 = r5.zzayh
            boolean r6 = r5.zzbav
            if (r6 == 0) goto L_0x02d6
            long r6 = r5.zzbai
            int r8 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x02d6
            long r4 = r5.zzbai
            android.util.SparseArray<com.google.android.gms.internal.ads.zzlh> r6 = r0.zzaxk
            java.lang.Object r6 = r6.valueAt(r3)
            com.google.android.gms.internal.ads.zzlh r6 = (com.google.android.gms.internal.ads.zzlh) r6
            r9 = r4
            r4 = r6
        L_0x02d6:
            int r3 = r3 + 1
            goto L_0x02b4
        L_0x02d9:
            if (r4 != 0) goto L_0x02e0
            r2 = 3
            r0.zzaxt = r2
            goto L_0x0004
        L_0x02e0:
            long r2 = r27.getPosition()
            long r9 = r9 - r2
            int r2 = (int) r9
            if (r2 < 0) goto L_0x0300
            r1.zzai(r2)
            com.google.android.gms.internal.ads.zzlp r2 = r4.zzayh
            com.google.android.gms.internal.ads.zzpk r3 = r2.zzbau
            byte[] r3 = r3.data
            int r4 = r2.zzbat
            r5 = 0
            r1.readFully(r3, r5, r4)
            com.google.android.gms.internal.ads.zzpk r3 = r2.zzbau
            r3.zzbo(r5)
            r2.zzbav = r5
            goto L_0x0004
        L_0x0300:
            com.google.android.gms.internal.ads.zzhv r1 = new com.google.android.gms.internal.ads.zzhv
            java.lang.String r2 = "Offset to encryption data was negative."
            r1.<init>(r2)
            throw r1
        L_0x0308:
            long r6 = r0.zzaxv
            int r2 = (int) r6
            int r4 = r0.zzaxw
            int r2 = r2 - r4
            com.google.android.gms.internal.ads.zzpk r4 = r0.zzaxx
            if (r4 == 0) goto L_0x0466
            byte[] r4 = r4.data
            r1.readFully(r4, r5, r2)
            com.google.android.gms.internal.ads.zzkt r2 = new com.google.android.gms.internal.ads.zzkt
            int r4 = r0.zzaxu
            com.google.android.gms.internal.ads.zzpk r6 = r0.zzaxx
            r2.<init>(r4, r6)
            long r6 = r27.getPosition()
            java.util.Stack<com.google.android.gms.internal.ads.zzku> r4 = r0.zzaxr
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x033a
            java.util.Stack<com.google.android.gms.internal.ads.zzku> r3 = r0.zzaxr
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.zzku r3 = (com.google.android.gms.internal.ads.zzku) r3
            r3.zza((com.google.android.gms.internal.ads.zzkt) r2)
            goto L_0x046b
        L_0x033a:
            int r4 = r2.type
            int r8 = com.google.android.gms.internal.ads.zzkr.zzato
            if (r4 != r8) goto L_0x0409
            com.google.android.gms.internal.ads.zzpk r2 = r2.zzawe
            r2.zzbo(r5)
            int r4 = r2.readInt()
            int r4 = com.google.android.gms.internal.ads.zzkr.zzaq(r4)
            r5 = 4
            r2.zzbp(r5)
            long r14 = r2.zzja()
            if (r4 != 0) goto L_0x0362
            long r4 = r2.zzja()
            long r8 = r2.zzja()
            long r6 = r6 + r8
            goto L_0x036b
        L_0x0362:
            long r4 = r2.zzje()
            long r8 = r2.zzje()
            long r6 = r6 + r8
        L_0x036b:
            r10 = 1000000(0xf4240, double:4.940656E-318)
            r8 = r4
            r12 = r14
            long r20 = com.google.android.gms.internal.ads.zzpq.zza((long) r8, (long) r10, (long) r12)
            r2.zzbp(r3)
            int r3 = r2.readUnsignedShort()
            int[] r12 = new int[r3]
            long[] r13 = new long[r3]
            long[] r10 = new long[r3]
            long[] r11 = new long[r3]
            r22 = r20
            r8 = 0
        L_0x0388:
            if (r8 >= r3) goto L_0x03de
            int r9 = r2.readInt()
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r16 = r9 & r16
            if (r16 != 0) goto L_0x03d6
            long r24 = r2.zzja()
            r16 = 2147483647(0x7fffffff, float:NaN)
            r9 = r9 & r16
            r12[r8] = r9
            r13[r8] = r6
            r11[r8] = r22
            long r4 = r4 + r24
            r22 = 1000000(0xf4240, double:4.940656E-318)
            r19 = r8
            r8 = r4
            r28 = r3
            r24 = r4
            r3 = r10
            r4 = r11
            r10 = r22
            r5 = r12
            r1 = r13
            r12 = r14
            long r22 = com.google.android.gms.internal.ads.zzpq.zza((long) r8, (long) r10, (long) r12)
            r8 = r4[r19]
            long r8 = r22 - r8
            r3[r19] = r8
            r8 = 4
            r2.zzbp(r8)
            r9 = r5[r19]
            long r9 = (long) r9
            long r6 = r6 + r9
            int r9 = r19 + 1
            r13 = r1
            r10 = r3
            r11 = r4
            r12 = r5
            r8 = r9
            r4 = r24
            r1 = r27
            r3 = r28
            goto L_0x0388
        L_0x03d6:
            com.google.android.gms.internal.ads.zzhv r1 = new com.google.android.gms.internal.ads.zzhv
            java.lang.String r2 = "Unhandled indirect reference"
            r1.<init>(r2)
            throw r1
        L_0x03de:
            r3 = r10
            r4 = r11
            r5 = r12
            r1 = r13
            java.lang.Long r2 = java.lang.Long.valueOf(r20)
            com.google.android.gms.internal.ads.zzjt r6 = new com.google.android.gms.internal.ads.zzjt
            r6.<init>(r5, r1, r3, r4)
            android.util.Pair r1 = android.util.Pair.create(r2, r6)
            java.lang.Object r2 = r1.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r0.zzaya = r2
            com.google.android.gms.internal.ads.zzjx r2 = r0.zzarf
            java.lang.Object r1 = r1.second
            com.google.android.gms.internal.ads.zzke r1 = (com.google.android.gms.internal.ads.zzke) r1
            r2.zza(r1)
            r1 = 1
            r0.zzayg = r1
            r1 = r27
            goto L_0x046b
        L_0x0409:
            int r1 = r2.type
            int r3 = com.google.android.gms.internal.ads.zzkr.zzavu
            if (r1 != r3) goto L_0x0463
            com.google.android.gms.internal.ads.zzpk r1 = r2.zzawe
            com.google.android.gms.internal.ads.zzkg r2 = r0.zzaye
            if (r2 == 0) goto L_0x0463
            r2 = 12
            r1.zzbo(r2)
            r1.zzjf()
            r1.zzjf()
            long r7 = r1.zzja()
            long r3 = r1.zzja()
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = com.google.android.gms.internal.ads.zzpq.zza((long) r3, (long) r5, (long) r7)
            r1.zzbo(r2)
            int r9 = r1.zziy()
            com.google.android.gms.internal.ads.zzkg r2 = r0.zzaye
            r2.zza(r1, r9)
            long r1 = r0.zzaya
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0454
            com.google.android.gms.internal.ads.zzkg r5 = r0.zzaye
            long r6 = r1 + r3
            r8 = 1
            r10 = 0
            r11 = 0
            r5.zza(r6, r8, r9, r10, r11)
            r1 = r27
            goto L_0x046b
        L_0x0454:
            java.util.LinkedList<com.google.android.gms.internal.ads.zzli> r1 = r0.zzaxs
            com.google.android.gms.internal.ads.zzli r2 = new com.google.android.gms.internal.ads.zzli
            r2.<init>(r3, r9)
            r1.addLast(r2)
            int r1 = r0.zzaxz
            int r1 = r1 + r9
            r0.zzaxz = r1
        L_0x0463:
            r1 = r27
            goto L_0x046b
        L_0x0466:
            r1 = r27
            r1.zzai(r2)
        L_0x046b:
            long r2 = r27.getPosition()
            r0.zzeb(r2)
            goto L_0x0004
        L_0x0474:
            int r2 = r0.zzaxw
            if (r2 != 0) goto L_0x049e
            com.google.android.gms.internal.ads.zzpk r2 = r0.zzaxp
            byte[] r2 = r2.data
            r4 = 1
            r6 = 0
            boolean r2 = r1.zza(r2, r6, r5, r4)
            if (r2 != 0) goto L_0x0487
            goto L_0x0607
        L_0x0487:
            r0.zzaxw = r5
            com.google.android.gms.internal.ads.zzpk r2 = r0.zzaxp
            r2.zzbo(r6)
            com.google.android.gms.internal.ads.zzpk r2 = r0.zzaxp
            long r6 = r2.zzja()
            r0.zzaxv = r6
            com.google.android.gms.internal.ads.zzpk r2 = r0.zzaxp
            int r2 = r2.readInt()
            r0.zzaxu = r2
        L_0x049e:
            long r6 = r0.zzaxv
            r8 = 1
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x04bb
            com.google.android.gms.internal.ads.zzpk r2 = r0.zzaxp
            byte[] r2 = r2.data
            r1.readFully(r2, r5, r5)
            int r2 = r0.zzaxw
            int r2 = r2 + r5
            r0.zzaxw = r2
            com.google.android.gms.internal.ads.zzpk r2 = r0.zzaxp
            long r6 = r2.zzje()
            r0.zzaxv = r6
        L_0x04bb:
            long r6 = r0.zzaxv
            int r2 = r0.zzaxw
            long r8 = (long) r2
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 < 0) goto L_0x0613
            long r6 = r27.getPosition()
            int r2 = r0.zzaxw
            long r8 = (long) r2
            long r6 = r6 - r8
            int r2 = r0.zzaxu
            int r4 = com.google.android.gms.internal.ads.zzkr.zzaty
            if (r2 != r4) goto L_0x04ee
            android.util.SparseArray<com.google.android.gms.internal.ads.zzlh> r2 = r0.zzaxk
            int r2 = r2.size()
            r4 = 0
        L_0x04d9:
            if (r4 >= r2) goto L_0x04ee
            android.util.SparseArray<com.google.android.gms.internal.ads.zzlh> r8 = r0.zzaxk
            java.lang.Object r8 = r8.valueAt(r4)
            com.google.android.gms.internal.ads.zzlh r8 = (com.google.android.gms.internal.ads.zzlh) r8
            com.google.android.gms.internal.ads.zzlp r8 = r8.zzayh
            r8.zzbag = r6
            r8.zzbai = r6
            r8.zzbah = r6
            int r4 = r4 + 1
            goto L_0x04d9
        L_0x04ee:
            int r2 = r0.zzaxu
            int r4 = com.google.android.gms.internal.ads.zzkr.zzasv
            if (r2 != r4) goto L_0x0514
            r2 = 0
            r0.zzayb = r2
            long r4 = r0.zzaxv
            long r6 = r6 + r4
            r0.zzaxy = r6
            boolean r2 = r0.zzayg
            if (r2 != 0) goto L_0x050f
            com.google.android.gms.internal.ads.zzjx r2 = r0.zzarf
            com.google.android.gms.internal.ads.zzkd r4 = new com.google.android.gms.internal.ads.zzkd
            long r5 = r0.zzaid
            r4.<init>(r5)
            r2.zza(r4)
            r2 = 1
            r0.zzayg = r2
        L_0x050f:
            r0.zzaxt = r3
            r2 = 1
            goto L_0x0606
        L_0x0514:
            int r2 = r0.zzaxu
            int r3 = com.google.android.gms.internal.ads.zzkr.zzatp
            if (r2 == r3) goto L_0x053d
            int r3 = com.google.android.gms.internal.ads.zzkr.zzatr
            if (r2 == r3) goto L_0x053d
            int r3 = com.google.android.gms.internal.ads.zzkr.zzats
            if (r2 == r3) goto L_0x053d
            int r3 = com.google.android.gms.internal.ads.zzkr.zzatt
            if (r2 == r3) goto L_0x053d
            int r3 = com.google.android.gms.internal.ads.zzkr.zzatu
            if (r2 == r3) goto L_0x053d
            int r3 = com.google.android.gms.internal.ads.zzkr.zzaty
            if (r2 == r3) goto L_0x053d
            int r3 = com.google.android.gms.internal.ads.zzkr.zzatz
            if (r2 == r3) goto L_0x053d
            int r3 = com.google.android.gms.internal.ads.zzkr.zzaua
            if (r2 == r3) goto L_0x053d
            int r3 = com.google.android.gms.internal.ads.zzkr.zzaud
            if (r2 != r3) goto L_0x053b
            goto L_0x053d
        L_0x053b:
            r2 = 0
            goto L_0x053e
        L_0x053d:
            r2 = 1
        L_0x053e:
            if (r2 == 0) goto L_0x056b
            long r2 = r27.getPosition()
            long r4 = r0.zzaxv
            long r2 = r2 + r4
            r4 = 8
            long r2 = r2 - r4
            java.util.Stack<com.google.android.gms.internal.ads.zzku> r4 = r0.zzaxr
            com.google.android.gms.internal.ads.zzku r5 = new com.google.android.gms.internal.ads.zzku
            int r6 = r0.zzaxu
            r5.<init>(r6, r2)
            r4.add(r5)
            long r4 = r0.zzaxv
            int r6 = r0.zzaxw
            long r6 = (long) r6
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0565
            r0.zzeb(r2)
            r2 = 1
            goto L_0x0606
        L_0x0565:
            r26.zzgz()
            r2 = 1
            goto L_0x0606
        L_0x056b:
            int r2 = r0.zzaxu
            int r3 = com.google.android.gms.internal.ads.zzkr.zzaug
            if (r2 == r3) goto L_0x05c0
            int r3 = com.google.android.gms.internal.ads.zzkr.zzauf
            if (r2 == r3) goto L_0x05c0
            int r3 = com.google.android.gms.internal.ads.zzkr.zzatq
            if (r2 == r3) goto L_0x05c0
            int r3 = com.google.android.gms.internal.ads.zzkr.zzato
            if (r2 == r3) goto L_0x05c0
            int r3 = com.google.android.gms.internal.ads.zzkr.zzauh
            if (r2 == r3) goto L_0x05c0
            int r3 = com.google.android.gms.internal.ads.zzkr.zzatk
            if (r2 == r3) goto L_0x05c0
            int r3 = com.google.android.gms.internal.ads.zzkr.zzatl
            if (r2 == r3) goto L_0x05c0
            int r3 = com.google.android.gms.internal.ads.zzkr.zzauc
            if (r2 == r3) goto L_0x05c0
            int r3 = com.google.android.gms.internal.ads.zzkr.zzatm
            if (r2 == r3) goto L_0x05c0
            int r3 = com.google.android.gms.internal.ads.zzkr.zzatn
            if (r2 == r3) goto L_0x05c0
            int r3 = com.google.android.gms.internal.ads.zzkr.zzaui
            if (r2 == r3) goto L_0x05c0
            int r3 = com.google.android.gms.internal.ads.zzkr.zzauq
            if (r2 == r3) goto L_0x05c0
            int r3 = com.google.android.gms.internal.ads.zzkr.zzaur
            if (r2 == r3) goto L_0x05c0
            int r3 = com.google.android.gms.internal.ads.zzkr.zzauv
            if (r2 == r3) goto L_0x05c0
            int r3 = com.google.android.gms.internal.ads.zzkr.zzauu
            if (r2 == r3) goto L_0x05c0
            int r3 = com.google.android.gms.internal.ads.zzkr.zzaus
            if (r2 == r3) goto L_0x05c0
            int r3 = com.google.android.gms.internal.ads.zzkr.zzaut
            if (r2 == r3) goto L_0x05c0
            int r3 = com.google.android.gms.internal.ads.zzkr.zzaue
            if (r2 == r3) goto L_0x05c0
            int r3 = com.google.android.gms.internal.ads.zzkr.zzaub
            if (r2 == r3) goto L_0x05c0
            int r3 = com.google.android.gms.internal.ads.zzkr.zzavu
            if (r2 != r3) goto L_0x05be
            goto L_0x05c0
        L_0x05be:
            r2 = 0
            goto L_0x05c1
        L_0x05c0:
            r2 = 1
        L_0x05c1:
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r2 == 0) goto L_0x05fa
            int r2 = r0.zzaxw
            if (r2 != r5) goto L_0x05f2
            long r6 = r0.zzaxv
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x05ea
            com.google.android.gms.internal.ads.zzpk r2 = new com.google.android.gms.internal.ads.zzpk
            long r3 = r0.zzaxv
            int r4 = (int) r3
            r2.<init>((int) r4)
            r0.zzaxx = r2
            com.google.android.gms.internal.ads.zzpk r2 = r0.zzaxp
            byte[] r2 = r2.data
            com.google.android.gms.internal.ads.zzpk r3 = r0.zzaxx
            byte[] r3 = r3.data
            r4 = 0
            java.lang.System.arraycopy(r2, r4, r3, r4, r5)
            r2 = 1
            r0.zzaxt = r2
            goto L_0x0606
        L_0x05ea:
            com.google.android.gms.internal.ads.zzhv r1 = new com.google.android.gms.internal.ads.zzhv
            java.lang.String r2 = "Leaf atom with length > 2147483647 (unsupported)."
            r1.<init>(r2)
            throw r1
        L_0x05f2:
            com.google.android.gms.internal.ads.zzhv r1 = new com.google.android.gms.internal.ads.zzhv
            java.lang.String r2 = "Leaf atom defines extended atom size (unsupported)."
            r1.<init>(r2)
            throw r1
        L_0x05fa:
            long r5 = r0.zzaxv
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x060b
            r2 = 0
            r0.zzaxx = r2
            r2 = 1
            r0.zzaxt = r2
        L_0x0606:
            r6 = 1
        L_0x0607:
            if (r6 != 0) goto L_0x0004
            r1 = -1
            return r1
        L_0x060b:
            com.google.android.gms.internal.ads.zzhv r1 = new com.google.android.gms.internal.ads.zzhv
            java.lang.String r2 = "Skipping atom with length > 2147483647 (unsupported)."
            r1.<init>(r2)
            throw r1
        L_0x0613:
            com.google.android.gms.internal.ads.zzhv r1 = new com.google.android.gms.internal.ads.zzhv
            java.lang.String r2 = "Atom size less than header length (unsupported)."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlg.zza(com.google.android.gms.internal.ads.zzjy, com.google.android.gms.internal.ads.zzkb):int");
    }

    private final void zzgz() {
        this.zzaxt = 0;
        this.zzaxw = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:157:0x03f1  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x03f3  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03ff  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0404  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x040e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzeb(long r53) throws com.google.android.gms.internal.ads.zzhv {
        /*
            r52 = this;
            r0 = r52
        L_0x0002:
            java.util.Stack<com.google.android.gms.internal.ads.zzku> r1 = r0.zzaxr
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0728
            java.util.Stack<com.google.android.gms.internal.ads.zzku> r1 = r0.zzaxr
            java.lang.Object r1 = r1.peek()
            com.google.android.gms.internal.ads.zzku r1 = (com.google.android.gms.internal.ads.zzku) r1
            long r1 = r1.zzawf
            int r3 = (r1 > r53 ? 1 : (r1 == r53 ? 0 : -1))
            if (r3 != 0) goto L_0x0728
            java.util.Stack<com.google.android.gms.internal.ads.zzku> r1 = r0.zzaxr
            java.lang.Object r1 = r1.pop()
            com.google.android.gms.internal.ads.zzku r1 = (com.google.android.gms.internal.ads.zzku) r1
            int r2 = r1.type
            int r3 = com.google.android.gms.internal.ads.zzkr.zzatp
            r4 = 0
            r5 = 12
            r6 = 4
            r7 = 8
            r9 = 1
            if (r2 != r3) goto L_0x01cf
            java.lang.String r2 = "Unexpected moov box."
            com.google.android.gms.internal.ads.zzoz.checkState(r9, r2)
            java.util.List<com.google.android.gms.internal.ads.zzkt> r2 = r1.zzawg
            com.google.android.gms.internal.ads.zzjn r2 = zzb(r2)
            int r3 = com.google.android.gms.internal.ads.zzkr.zzaua
            com.google.android.gms.internal.ads.zzku r3 = r1.zzav(r3)
            android.util.SparseArray r15 = new android.util.SparseArray
            r15.<init>()
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List<com.google.android.gms.internal.ads.zzkt> r12 = r3.zzawg
            int r12 = r12.size()
            r16 = r10
            r10 = 0
        L_0x0052:
            if (r10 >= r12) goto L_0x00c2
            java.util.List<com.google.android.gms.internal.ads.zzkt> r11 = r3.zzawg
            java.lang.Object r11 = r11.get(r10)
            com.google.android.gms.internal.ads.zzkt r11 = (com.google.android.gms.internal.ads.zzkt) r11
            int r13 = r11.type
            int r14 = com.google.android.gms.internal.ads.zzkr.zzatm
            if (r13 != r14) goto L_0x009a
            com.google.android.gms.internal.ads.zzpk r11 = r11.zzawe
            r11.zzbo(r5)
            int r13 = r11.readInt()
            int r14 = r11.zzjd()
            int r14 = r14 - r9
            int r5 = r11.zzjd()
            int r8 = r11.zzjd()
            int r11 = r11.readInt()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            com.google.android.gms.internal.ads.zzlb r9 = new com.google.android.gms.internal.ads.zzlb
            r9.<init>(r14, r5, r8, r11)
            android.util.Pair r5 = android.util.Pair.create(r13, r9)
            java.lang.Object r8 = r5.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Object r5 = r5.second
            com.google.android.gms.internal.ads.zzlb r5 = (com.google.android.gms.internal.ads.zzlb) r5
            r15.put(r8, r5)
            goto L_0x00bb
        L_0x009a:
            int r5 = r11.type
            int r8 = com.google.android.gms.internal.ads.zzkr.zzaub
            if (r5 != r8) goto L_0x00bb
            com.google.android.gms.internal.ads.zzpk r5 = r11.zzawe
            r5.zzbo(r7)
            int r8 = r5.readInt()
            int r8 = com.google.android.gms.internal.ads.zzkr.zzaq(r8)
            if (r8 != 0) goto L_0x00b4
            long r8 = r5.zzja()
            goto L_0x00b8
        L_0x00b4:
            long r8 = r5.zzje()
        L_0x00b8:
            r16 = r8
            goto L_0x00bc
        L_0x00bb:
        L_0x00bc:
            int r10 = r10 + 1
            r5 = 12
            r9 = 1
            goto L_0x0052
        L_0x00c2:
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            java.util.List<com.google.android.gms.internal.ads.zzku> r5 = r1.zzawh
            int r5 = r5.size()
            r8 = 0
        L_0x00ce:
            if (r8 >= r5) goto L_0x00fe
            java.util.List<com.google.android.gms.internal.ads.zzku> r9 = r1.zzawh
            java.lang.Object r9 = r9.get(r8)
            r10 = r9
            com.google.android.gms.internal.ads.zzku r10 = (com.google.android.gms.internal.ads.zzku) r10
            int r9 = r10.type
            int r11 = com.google.android.gms.internal.ads.zzkr.zzatr
            if (r9 != r11) goto L_0x00f7
            int r9 = com.google.android.gms.internal.ads.zzkr.zzatq
            com.google.android.gms.internal.ads.zzkt r11 = r1.zzau(r9)
            r9 = 0
            r12 = r16
            r14 = r2
            r7 = r15
            r15 = r9
            com.google.android.gms.internal.ads.zzln r9 = com.google.android.gms.internal.ads.zzkw.zza((com.google.android.gms.internal.ads.zzku) r10, (com.google.android.gms.internal.ads.zzkt) r11, (long) r12, (com.google.android.gms.internal.ads.zzjn) r14, (boolean) r15)
            if (r9 == 0) goto L_0x00f8
            int r10 = r9.id
            r3.put(r10, r9)
            goto L_0x00f8
        L_0x00f7:
            r7 = r15
        L_0x00f8:
            int r8 = r8 + 1
            r15 = r7
            r7 = 8
            goto L_0x00ce
        L_0x00fe:
            r7 = r15
            int r1 = r3.size()
            android.util.SparseArray<com.google.android.gms.internal.ads.zzlh> r2 = r0.zzaxk
            int r2 = r2.size()
            if (r2 != 0) goto L_0x019e
            r2 = 0
        L_0x010c:
            if (r2 >= r1) goto L_0x0140
            java.lang.Object r5 = r3.valueAt(r2)
            com.google.android.gms.internal.ads.zzln r5 = (com.google.android.gms.internal.ads.zzln) r5
            com.google.android.gms.internal.ads.zzlh r8 = new com.google.android.gms.internal.ads.zzlh
            com.google.android.gms.internal.ads.zzjx r9 = r0.zzarf
            int r10 = r5.type
            com.google.android.gms.internal.ads.zzkg r9 = r9.zzc(r2, r10)
            r8.<init>(r9)
            int r9 = r5.id
            java.lang.Object r9 = r7.get(r9)
            com.google.android.gms.internal.ads.zzlb r9 = (com.google.android.gms.internal.ads.zzlb) r9
            r8.zza(r5, r9)
            android.util.SparseArray<com.google.android.gms.internal.ads.zzlh> r9 = r0.zzaxk
            int r10 = r5.id
            r9.put(r10, r8)
            long r8 = r0.zzaid
            long r10 = r5.zzaid
            long r8 = java.lang.Math.max(r8, r10)
            r0.zzaid = r8
            int r2 = r2 + 1
            goto L_0x010c
        L_0x0140:
            int r1 = r0.flags
            r1 = r1 & r6
            if (r1 == 0) goto L_0x0166
            com.google.android.gms.internal.ads.zzkg r1 = r0.zzaye
            if (r1 != 0) goto L_0x0166
            com.google.android.gms.internal.ads.zzjx r1 = r0.zzarf
            android.util.SparseArray<com.google.android.gms.internal.ads.zzlh> r2 = r0.zzaxk
            int r2 = r2.size()
            com.google.android.gms.internal.ads.zzkg r1 = r1.zzc(r2, r6)
            r0.zzaye = r1
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r5 = "application/x-emsg"
            com.google.android.gms.internal.ads.zzho r2 = com.google.android.gms.internal.ads.zzho.zza((java.lang.String) r4, (java.lang.String) r5, (long) r2)
            r1.zze(r2)
        L_0x0166:
            int r1 = r0.flags
            r2 = 8
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0197
            com.google.android.gms.internal.ads.zzkg[] r1 = r0.zzayf
            if (r1 != 0) goto L_0x0197
            com.google.android.gms.internal.ads.zzjx r1 = r0.zzarf
            android.util.SparseArray<com.google.android.gms.internal.ads.zzlh> r2 = r0.zzaxk
            int r2 = r2.size()
            r3 = 1
            int r2 = r2 + r3
            r3 = 3
            com.google.android.gms.internal.ads.zzkg r1 = r1.zzc(r2, r3)
            r2 = 0
            r4 = 0
            r5 = -1
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r3 = "application/cea-608"
            com.google.android.gms.internal.ads.zzho r2 = com.google.android.gms.internal.ads.zzho.zza((java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r4, (int) r5, (int) r6, (java.lang.String) r7, (com.google.android.gms.internal.ads.zzjn) r8)
            r1.zze(r2)
            r2 = 1
            com.google.android.gms.internal.ads.zzkg[] r2 = new com.google.android.gms.internal.ads.zzkg[r2]
            r3 = 0
            r2[r3] = r1
            r0.zzayf = r2
        L_0x0197:
            com.google.android.gms.internal.ads.zzjx r1 = r0.zzarf
            r1.zzgp()
            goto L_0x0002
        L_0x019e:
            android.util.SparseArray<com.google.android.gms.internal.ads.zzlh> r2 = r0.zzaxk
            int r2 = r2.size()
            if (r2 != r1) goto L_0x01a8
            r9 = 1
            goto L_0x01a9
        L_0x01a8:
            r9 = 0
        L_0x01a9:
            com.google.android.gms.internal.ads.zzoz.checkState(r9)
            r8 = 0
        L_0x01ad:
            if (r8 >= r1) goto L_0x01cd
            java.lang.Object r2 = r3.valueAt(r8)
            com.google.android.gms.internal.ads.zzln r2 = (com.google.android.gms.internal.ads.zzln) r2
            android.util.SparseArray<com.google.android.gms.internal.ads.zzlh> r4 = r0.zzaxk
            int r5 = r2.id
            java.lang.Object r4 = r4.get(r5)
            com.google.android.gms.internal.ads.zzlh r4 = (com.google.android.gms.internal.ads.zzlh) r4
            int r5 = r2.id
            java.lang.Object r5 = r7.get(r5)
            com.google.android.gms.internal.ads.zzlb r5 = (com.google.android.gms.internal.ads.zzlb) r5
            r4.zza(r2, r5)
            int r8 = r8 + 1
            goto L_0x01ad
        L_0x01cd:
            goto L_0x0002
        L_0x01cf:
            int r2 = r1.type
            int r3 = com.google.android.gms.internal.ads.zzkr.zzaty
            if (r2 != r3) goto L_0x0711
            android.util.SparseArray<com.google.android.gms.internal.ads.zzlh> r2 = r0.zzaxk
            int r3 = r0.flags
            byte[] r5 = r0.zzaxq
            java.util.List<com.google.android.gms.internal.ads.zzku> r7 = r1.zzawh
            int r7 = r7.size()
            r8 = 0
        L_0x01e3:
            if (r8 >= r7) goto L_0x06de
            java.util.List<com.google.android.gms.internal.ads.zzku> r9 = r1.zzawh
            java.lang.Object r9 = r9.get(r8)
            com.google.android.gms.internal.ads.zzku r9 = (com.google.android.gms.internal.ads.zzku) r9
            int r10 = r9.type
            int r11 = com.google.android.gms.internal.ads.zzkr.zzatz
            if (r10 != r11) goto L_0x06bd
            int r10 = com.google.android.gms.internal.ads.zzkr.zzatl
            com.google.android.gms.internal.ads.zzkt r10 = r9.zzau(r10)
            com.google.android.gms.internal.ads.zzpk r10 = r10.zzawe
            r11 = 8
            r10.zzbo(r11)
            int r11 = r10.readInt()
            int r11 = com.google.android.gms.internal.ads.zzkr.zzar(r11)
            int r12 = r10.readInt()
            r13 = r3 & 16
            if (r13 != 0) goto L_0x0212
            goto L_0x0213
        L_0x0212:
            r12 = 0
        L_0x0213:
            java.lang.Object r12 = r2.get(r12)
            com.google.android.gms.internal.ads.zzlh r12 = (com.google.android.gms.internal.ads.zzlh) r12
            if (r12 != 0) goto L_0x021d
            r12 = r4
            goto L_0x0269
        L_0x021d:
            r13 = r11 & 1
            if (r13 == 0) goto L_0x022d
            long r13 = r10.zzje()
            com.google.android.gms.internal.ads.zzlp r15 = r12.zzayh
            r15.zzbah = r13
            com.google.android.gms.internal.ads.zzlp r15 = r12.zzayh
            r15.zzbai = r13
        L_0x022d:
            com.google.android.gms.internal.ads.zzlb r13 = r12.zzayj
            r14 = r11 & 2
            if (r14 == 0) goto L_0x023a
            int r14 = r10.zzjd()
            r15 = 1
            int r14 = r14 - r15
            goto L_0x023c
        L_0x023a:
            int r14 = r13.zzaxd
        L_0x023c:
            r15 = r11 & 8
            if (r15 == 0) goto L_0x0245
            int r15 = r10.zzjd()
            goto L_0x0247
        L_0x0245:
            int r15 = r13.duration
        L_0x0247:
            r16 = r11 & 16
            if (r16 == 0) goto L_0x0252
            int r16 = r10.zzjd()
            r4 = r16
            goto L_0x0254
        L_0x0252:
            int r4 = r13.size
        L_0x0254:
            r11 = r11 & 32
            if (r11 == 0) goto L_0x025d
            int r10 = r10.zzjd()
            goto L_0x025f
        L_0x025d:
            int r10 = r13.flags
        L_0x025f:
            com.google.android.gms.internal.ads.zzlp r11 = r12.zzayh
            com.google.android.gms.internal.ads.zzlb r13 = new com.google.android.gms.internal.ads.zzlb
            r13.<init>(r14, r15, r4, r10)
            r11.zzbaf = r13
        L_0x0269:
            if (r12 == 0) goto L_0x06ac
            com.google.android.gms.internal.ads.zzlp r4 = r12.zzayh
            long r10 = r4.zzbaw
            r12.reset()
            int r13 = com.google.android.gms.internal.ads.zzkr.zzatk
            com.google.android.gms.internal.ads.zzkt r13 = r9.zzau(r13)
            if (r13 == 0) goto L_0x02a0
            r13 = r3 & 2
            if (r13 != 0) goto L_0x02a0
            int r10 = com.google.android.gms.internal.ads.zzkr.zzatk
            com.google.android.gms.internal.ads.zzkt r10 = r9.zzau(r10)
            com.google.android.gms.internal.ads.zzpk r10 = r10.zzawe
            r11 = 8
            r10.zzbo(r11)
            int r11 = r10.readInt()
            int r11 = com.google.android.gms.internal.ads.zzkr.zzaq(r11)
            r13 = 1
            if (r11 != r13) goto L_0x029c
            long r10 = r10.zzje()
            goto L_0x02a0
        L_0x029c:
            long r10 = r10.zzja()
        L_0x02a0:
            java.util.List<com.google.android.gms.internal.ads.zzkt> r13 = r9.zzawg
            int r14 = r13.size()
            r19 = r2
            r2 = 0
            r6 = 0
            r15 = 0
        L_0x02ae:
            if (r15 >= r14) goto L_0x02dc
            java.lang.Object r20 = r13.get(r15)
            r21 = r7
            r7 = r20
            com.google.android.gms.internal.ads.zzkt r7 = (com.google.android.gms.internal.ads.zzkt) r7
            r22 = r10
            int r10 = r7.type
            int r11 = com.google.android.gms.internal.ads.zzkr.zzatn
            if (r10 != r11) goto L_0x02d3
            com.google.android.gms.internal.ads.zzpk r7 = r7.zzawe
            r10 = 12
            r7.zzbo(r10)
            int r7 = r7.zzjd()
            if (r7 <= 0) goto L_0x02d5
            int r2 = r2 + r7
            int r6 = r6 + 1
            goto L_0x02d5
        L_0x02d3:
            r10 = 12
        L_0x02d5:
            int r15 = r15 + 1
            r7 = r21
            r10 = r22
            goto L_0x02ae
        L_0x02dc:
            r21 = r7
            r22 = r10
            r10 = 12
            r7 = 0
            r12.zzaym = r7
            r12.zzayl = r7
            r12.zzayk = r7
            com.google.android.gms.internal.ads.zzlp r7 = r12.zzayh
            r7.zzbaj = r6
            r7.zzawy = r2
            int[] r11 = r7.zzbal
            if (r11 == 0) goto L_0x02f8
            int[] r11 = r7.zzbal
            int r11 = r11.length
            if (r11 >= r6) goto L_0x0300
        L_0x02f8:
            long[] r11 = new long[r6]
            r7.zzbak = r11
            int[] r6 = new int[r6]
            r7.zzbal = r6
        L_0x0300:
            int[] r6 = r7.zzbam
            if (r6 == 0) goto L_0x0309
            int[] r6 = r7.zzbam
            int r6 = r6.length
            if (r6 >= r2) goto L_0x0321
        L_0x0309:
            int r2 = r2 * 125
            int r2 = r2 / 100
            int[] r6 = new int[r2]
            r7.zzbam = r6
            int[] r6 = new int[r2]
            r7.zzban = r6
            long[] r6 = new long[r2]
            r7.zzbao = r6
            boolean[] r6 = new boolean[r2]
            r7.zzbap = r6
            boolean[] r2 = new boolean[r2]
            r7.zzbar = r2
        L_0x0321:
            r2 = 0
            r6 = 0
            r7 = 0
        L_0x0326:
            r24 = 0
            if (r2 >= r14) goto L_0x04c3
            java.lang.Object r18 = r13.get(r2)
            r10 = r18
            com.google.android.gms.internal.ads.zzkt r10 = (com.google.android.gms.internal.ads.zzkt) r10
            int r15 = r10.type
            int r11 = com.google.android.gms.internal.ads.zzkr.zzatn
            if (r15 != r11) goto L_0x0493
            int r11 = r6 + 1
            com.google.android.gms.internal.ads.zzpk r10 = r10.zzawe
            r15 = 8
            r10.zzbo(r15)
            int r15 = r10.readInt()
            int r15 = com.google.android.gms.internal.ads.zzkr.zzar(r15)
            r27 = r11
            com.google.android.gms.internal.ads.zzln r11 = r12.zzayi
            r28 = r13
            com.google.android.gms.internal.ads.zzlp r13 = r12.zzayh
            r29 = r14
            com.google.android.gms.internal.ads.zzlb r14 = r13.zzbaf
            int[] r0 = r13.zzbal
            int r30 = r10.zzjd()
            r0[r6] = r30
            long[] r0 = r13.zzbak
            r31 = r4
            r30 = r5
            long r4 = r13.zzbah
            r0[r6] = r4
            r0 = r15 & 1
            if (r0 == 0) goto L_0x037e
            long[] r0 = r13.zzbak
            r4 = r0[r6]
            r32 = r1
            int r1 = r10.readInt()
            r33 = r8
            r34 = r9
            long r8 = (long) r1
            long r4 = r4 + r8
            r0[r6] = r4
            goto L_0x0384
        L_0x037e:
            r32 = r1
            r33 = r8
            r34 = r9
        L_0x0384:
            r0 = r15 & 4
            if (r0 == 0) goto L_0x038a
            r0 = 1
            goto L_0x038b
        L_0x038a:
            r0 = 0
        L_0x038b:
            int r1 = r14.flags
            if (r0 == 0) goto L_0x0393
            int r1 = r10.zzjd()
        L_0x0393:
            r4 = r15 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x0399
            r4 = 1
            goto L_0x039a
        L_0x0399:
            r4 = 0
        L_0x039a:
            r5 = r15 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x03a0
            r5 = 1
            goto L_0x03a1
        L_0x03a0:
            r5 = 0
        L_0x03a1:
            r8 = r15 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L_0x03a7
            r8 = 1
            goto L_0x03a8
        L_0x03a7:
            r8 = 0
        L_0x03a8:
            r9 = r15 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x03ae
            r9 = 1
            goto L_0x03af
        L_0x03ae:
            r9 = 0
        L_0x03af:
            long[] r15 = r11.zzbac
            if (r15 == 0) goto L_0x03d5
            long[] r15 = r11.zzbac
            int r15 = r15.length
            r35 = r1
            r1 = 1
            if (r15 != r1) goto L_0x03d7
            long[] r1 = r11.zzbac
            r15 = 0
            r36 = r1[r15]
            int r1 = (r36 > r24 ? 1 : (r36 == r24 ? 0 : -1))
            if (r1 != 0) goto L_0x03d7
            long[] r1 = r11.zzbad
            r36 = r1[r15]
            r38 = 1000(0x3e8, double:4.94E-321)
            r15 = r2
            long r1 = r11.zzdg
            r40 = r1
            long r24 = com.google.android.gms.internal.ads.zzpq.zza((long) r36, (long) r38, (long) r40)
            goto L_0x03d8
        L_0x03d5:
            r35 = r1
        L_0x03d7:
            r15 = r2
        L_0x03d8:
            int[] r1 = r13.zzbam
            int[] r2 = r13.zzban
            r36 = r12
            long[] r12 = r13.zzbao
            r37 = r15
            boolean[] r15 = r13.zzbap
            r38 = r15
            int r15 = r11.type
            r39 = r1
            r1 = 2
            if (r15 != r1) goto L_0x03f3
            r1 = r3 & 1
            if (r1 == 0) goto L_0x03f3
            r1 = 1
            goto L_0x03f4
        L_0x03f3:
            r1 = 0
        L_0x03f4:
            int[] r15 = r13.zzbal
            r15 = r15[r6]
            int r15 = r15 + r7
            r26 = r12
            long r11 = r11.zzdg
            if (r6 <= 0) goto L_0x0404
            r40 = r7
            long r6 = r13.zzbaw
            goto L_0x0408
        L_0x0404:
            r40 = r7
            r6 = r22
        L_0x0408:
            r46 = r3
            r3 = r40
        L_0x040c:
            if (r3 >= r15) goto L_0x048c
            if (r4 == 0) goto L_0x0419
            int r40 = r10.zzjd()
            r47 = r4
            r4 = r40
            goto L_0x041d
        L_0x0419:
            r47 = r4
            int r4 = r14.duration
        L_0x041d:
            if (r5 == 0) goto L_0x0428
            int r40 = r10.zzjd()
            r48 = r5
            r5 = r40
            goto L_0x042c
        L_0x0428:
            r48 = r5
            int r5 = r14.size
        L_0x042c:
            if (r3 != 0) goto L_0x0435
            if (r0 == 0) goto L_0x0435
            r49 = r0
            r0 = r35
            goto L_0x0444
        L_0x0435:
            if (r8 == 0) goto L_0x0440
            int r40 = r10.readInt()
            r49 = r0
            r0 = r40
            goto L_0x0444
        L_0x0440:
            r49 = r0
            int r0 = r14.flags
        L_0x0444:
            if (r9 == 0) goto L_0x0456
            r50 = r8
            int r8 = r10.readInt()
            int r8 = r8 * 1000
            r51 = r9
            long r8 = (long) r8
            long r8 = r8 / r11
            int r9 = (int) r8
            r2[r3] = r9
            goto L_0x045d
        L_0x0456:
            r50 = r8
            r51 = r9
            r8 = 0
            r2[r3] = r8
        L_0x045d:
            r42 = 1000(0x3e8, double:4.94E-321)
            r40 = r6
            r44 = r11
            long r8 = com.google.android.gms.internal.ads.zzpq.zza((long) r40, (long) r42, (long) r44)
            long r8 = r8 - r24
            r26[r3] = r8
            r39[r3] = r5
            r5 = 16
            int r0 = r0 >> r5
            r5 = 1
            r0 = r0 & r5
            if (r0 != 0) goto L_0x047a
            if (r1 == 0) goto L_0x0478
            if (r3 != 0) goto L_0x047a
        L_0x0478:
            r0 = 1
            goto L_0x047b
        L_0x047a:
            r0 = 0
        L_0x047b:
            r38[r3] = r0
            long r4 = (long) r4
            long r6 = r6 + r4
            int r3 = r3 + 1
            r4 = r47
            r5 = r48
            r0 = r49
            r8 = r50
            r9 = r51
            goto L_0x040c
        L_0x048c:
            r13.zzbaw = r6
            r7 = r15
            r6 = r27
            goto L_0x04a9
        L_0x0493:
            r32 = r1
            r37 = r2
            r46 = r3
            r31 = r4
            r30 = r5
            r40 = r7
            r33 = r8
            r34 = r9
            r36 = r12
            r28 = r13
            r29 = r14
        L_0x04a9:
            int r2 = r37 + 1
            r10 = 12
            r0 = r52
            r13 = r28
            r14 = r29
            r5 = r30
            r4 = r31
            r1 = r32
            r8 = r33
            r9 = r34
            r12 = r36
            r3 = r46
            goto L_0x0326
        L_0x04c3:
            r32 = r1
            r46 = r3
            r31 = r4
            r30 = r5
            r33 = r8
            r34 = r9
            r36 = r12
            int r0 = com.google.android.gms.internal.ads.zzkr.zzauq
            com.google.android.gms.internal.ads.zzkt r0 = r9.zzau(r0)
            if (r0 == 0) goto L_0x055a
            r4 = r36
            com.google.android.gms.internal.ads.zzln r1 = r4.zzayi
            com.google.android.gms.internal.ads.zzlq[] r1 = r1.zzbab
            r2 = r31
            com.google.android.gms.internal.ads.zzlb r3 = r2.zzbaf
            int r3 = r3.zzaxd
            r1 = r1[r3]
            com.google.android.gms.internal.ads.zzpk r0 = r0.zzawe
            int r1 = r1.zzbay
            r3 = 8
            r0.zzbo(r3)
            int r4 = r0.readInt()
            int r4 = com.google.android.gms.internal.ads.zzkr.zzar(r4)
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L_0x04ff
            r0.zzbp(r3)
        L_0x04ff:
            int r3 = r0.readUnsignedByte()
            int r4 = r0.zzjd()
            int r5 = r2.zzawy
            if (r4 != r5) goto L_0x0537
            if (r3 != 0) goto L_0x0524
            boolean[] r3 = r2.zzbar
            r5 = 0
            r6 = 0
        L_0x0512:
            if (r5 >= r4) goto L_0x0523
            int r7 = r0.readUnsignedByte()
            int r6 = r6 + r7
            if (r7 <= r1) goto L_0x051d
            r7 = 1
            goto L_0x051e
        L_0x051d:
            r7 = 0
        L_0x051e:
            r3[r5] = r7
            int r5 = r5 + 1
            goto L_0x0512
        L_0x0523:
            goto L_0x0533
        L_0x0524:
            if (r3 <= r1) goto L_0x0528
            r0 = 1
            goto L_0x0529
        L_0x0528:
            r0 = 0
        L_0x0529:
            int r3 = r3 * r4
            r1 = 0
            int r6 = r3 + 0
            boolean[] r3 = r2.zzbar
            java.util.Arrays.fill(r3, r1, r4, r0)
        L_0x0533:
            r2.zzaw(r6)
            goto L_0x055c
        L_0x0537:
            com.google.android.gms.internal.ads.zzhv r0 = new com.google.android.gms.internal.ads.zzhv
            int r1 = r2.zzawy
            r2 = 41
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Length mismatch: "
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = ", "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L_0x055a:
            r2 = r31
        L_0x055c:
            int r0 = com.google.android.gms.internal.ads.zzkr.zzaur
            com.google.android.gms.internal.ads.zzkt r0 = r9.zzau(r0)
            if (r0 == 0) goto L_0x05ae
            com.google.android.gms.internal.ads.zzpk r0 = r0.zzawe
            r1 = 8
            r0.zzbo(r1)
            int r3 = r0.readInt()
            int r4 = com.google.android.gms.internal.ads.zzkr.zzar(r3)
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L_0x057a
            r0.zzbp(r1)
        L_0x057a:
            int r1 = r0.zzjd()
            if (r1 != r5) goto L_0x0595
            int r1 = com.google.android.gms.internal.ads.zzkr.zzaq(r3)
            long r3 = r2.zzbai
            if (r1 != 0) goto L_0x058d
            long r0 = r0.zzja()
            goto L_0x0591
        L_0x058d:
            long r0 = r0.zzje()
        L_0x0591:
            long r3 = r3 + r0
            r2.zzbai = r3
            goto L_0x05ae
        L_0x0595:
            com.google.android.gms.internal.ads.zzhv r0 = new com.google.android.gms.internal.ads.zzhv
            r2 = 40
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Unexpected saio entry count: "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L_0x05ae:
            int r0 = com.google.android.gms.internal.ads.zzkr.zzauv
            com.google.android.gms.internal.ads.zzkt r0 = r9.zzau(r0)
            if (r0 == 0) goto L_0x05bc
            com.google.android.gms.internal.ads.zzpk r0 = r0.zzawe
            r1 = 0
            zza(r0, r1, r2)
        L_0x05bc:
            int r0 = com.google.android.gms.internal.ads.zzkr.zzaus
            com.google.android.gms.internal.ads.zzkt r0 = r9.zzau(r0)
            int r1 = com.google.android.gms.internal.ads.zzkr.zzaut
            com.google.android.gms.internal.ads.zzkt r1 = r9.zzau(r1)
            if (r0 == 0) goto L_0x0666
            if (r1 == 0) goto L_0x0666
            com.google.android.gms.internal.ads.zzpk r0 = r0.zzawe
            com.google.android.gms.internal.ads.zzpk r1 = r1.zzawe
            r3 = 8
            r0.zzbo(r3)
            int r3 = r0.readInt()
            int r4 = r0.readInt()
            int r5 = zzaxh
            if (r4 != r5) goto L_0x0663
            int r3 = com.google.android.gms.internal.ads.zzkr.zzaq(r3)
            r4 = 1
            if (r3 != r4) goto L_0x05ec
            r3 = 4
            r0.zzbp(r3)
        L_0x05ec:
            int r0 = r0.readInt()
            if (r0 != r4) goto L_0x065b
            r0 = 8
            r1.zzbo(r0)
            int r0 = r1.readInt()
            int r3 = r1.readInt()
            int r4 = zzaxh
            if (r3 != r4) goto L_0x0658
            int r0 = com.google.android.gms.internal.ads.zzkr.zzaq(r0)
            r3 = 1
            if (r0 != r3) goto L_0x061c
            long r3 = r1.zzja()
            int r0 = (r3 > r24 ? 1 : (r3 == r24 ? 0 : -1))
            if (r0 == 0) goto L_0x0614
            r0 = 4
            goto L_0x0625
        L_0x0614:
            com.google.android.gms.internal.ads.zzhv r0 = new com.google.android.gms.internal.ads.zzhv
            java.lang.String r1 = "Variable length decription in sgpd found (unsupported)"
            r0.<init>(r1)
            throw r0
        L_0x061c:
            r3 = 2
            if (r0 < r3) goto L_0x0624
            r0 = 4
            r1.zzbp(r0)
            goto L_0x0625
        L_0x0624:
            r0 = 4
        L_0x0625:
            long r3 = r1.zzja()
            r5 = 1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0650
            r3 = 2
            r1.zzbp(r3)
            int r3 = r1.readUnsignedByte()
            r4 = 1
            if (r3 != r4) goto L_0x0668
            int r3 = r1.readUnsignedByte()
            r5 = 16
            byte[] r6 = new byte[r5]
            r7 = 0
            r1.zze(r6, r7, r5)
            r2.zzbaq = r4
            com.google.android.gms.internal.ads.zzlq r1 = new com.google.android.gms.internal.ads.zzlq
            r1.<init>(r4, r3, r6)
            r2.zzbas = r1
            goto L_0x0668
        L_0x0650:
            com.google.android.gms.internal.ads.zzhv r0 = new com.google.android.gms.internal.ads.zzhv
            java.lang.String r1 = "Entry count in sgpd != 1 (unsupported)."
            r0.<init>(r1)
            throw r0
        L_0x0658:
            r0 = 4
            r4 = 1
            goto L_0x0668
        L_0x065b:
            com.google.android.gms.internal.ads.zzhv r0 = new com.google.android.gms.internal.ads.zzhv
            java.lang.String r1 = "Entry count in sbgp != 1 (unsupported)."
            r0.<init>(r1)
            throw r0
        L_0x0663:
            r0 = 4
            r4 = 1
            goto L_0x0668
        L_0x0666:
            r0 = 4
            r4 = 1
        L_0x0668:
            java.util.List<com.google.android.gms.internal.ads.zzkt> r1 = r9.zzawg
            int r1 = r1.size()
            r3 = 0
        L_0x066f:
            if (r3 >= r1) goto L_0x06a6
            java.util.List<com.google.android.gms.internal.ads.zzkt> r5 = r9.zzawg
            java.lang.Object r5 = r5.get(r3)
            com.google.android.gms.internal.ads.zzkt r5 = (com.google.android.gms.internal.ads.zzkt) r5
            int r6 = r5.type
            int r7 = com.google.android.gms.internal.ads.zzkr.zzauu
            if (r6 != r7) goto L_0x069a
            com.google.android.gms.internal.ads.zzpk r5 = r5.zzawe
            r6 = 8
            r5.zzbo(r6)
            r7 = r30
            r8 = 16
            r10 = 0
            r5.zze(r7, r10, r8)
            byte[] r11 = zzaxi
            boolean r11 = java.util.Arrays.equals(r7, r11)
            if (r11 == 0) goto L_0x06a1
            zza(r5, r8, r2)
            goto L_0x06a1
        L_0x069a:
            r7 = r30
            r6 = 8
            r8 = 16
            r10 = 0
        L_0x06a1:
            int r3 = r3 + 1
            r30 = r7
            goto L_0x066f
        L_0x06a6:
            r7 = r30
            r6 = 8
            r10 = 0
            goto L_0x06cd
        L_0x06ac:
            r32 = r1
            r19 = r2
            r46 = r3
            r21 = r7
            r33 = r8
            r0 = 4
            r4 = 1
            r6 = 8
            r10 = 0
            r7 = r5
            goto L_0x06cd
        L_0x06bd:
            r32 = r1
            r19 = r2
            r46 = r3
            r21 = r7
            r33 = r8
            r0 = 4
            r4 = 1
            r6 = 8
            r10 = 0
            r7 = r5
        L_0x06cd:
            int r8 = r33 + 1
            r0 = r52
            r5 = r7
            r2 = r19
            r7 = r21
            r1 = r32
            r3 = r46
            r4 = 0
            r6 = 4
            goto L_0x01e3
        L_0x06de:
            r32 = r1
            r10 = 0
            java.util.List<com.google.android.gms.internal.ads.zzkt> r0 = r1.zzawg
            com.google.android.gms.internal.ads.zzjn r0 = zzb(r0)
            if (r0 == 0) goto L_0x070c
            r2 = r52
            android.util.SparseArray<com.google.android.gms.internal.ads.zzlh> r1 = r2.zzaxk
            int r1 = r1.size()
            r8 = 0
        L_0x06f2:
            if (r8 >= r1) goto L_0x070e
            android.util.SparseArray<com.google.android.gms.internal.ads.zzlh> r3 = r2.zzaxk
            java.lang.Object r3 = r3.valueAt(r8)
            com.google.android.gms.internal.ads.zzlh r3 = (com.google.android.gms.internal.ads.zzlh) r3
            com.google.android.gms.internal.ads.zzkg r4 = r3.zzasm
            com.google.android.gms.internal.ads.zzln r3 = r3.zzayi
            com.google.android.gms.internal.ads.zzho r3 = r3.zzaht
            com.google.android.gms.internal.ads.zzho r3 = r3.zza((com.google.android.gms.internal.ads.zzjn) r0)
            r4.zze(r3)
            int r8 = r8 + 1
            goto L_0x06f2
        L_0x070c:
            r2 = r52
        L_0x070e:
            r0 = r2
            goto L_0x0002
        L_0x0711:
            r2 = r0
            java.util.Stack<com.google.android.gms.internal.ads.zzku> r0 = r2.zzaxr
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0725
            java.util.Stack<com.google.android.gms.internal.ads.zzku> r0 = r2.zzaxr
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.zzku r0 = (com.google.android.gms.internal.ads.zzku) r0
            r0.zza((com.google.android.gms.internal.ads.zzku) r1)
        L_0x0725:
            r0 = r2
            goto L_0x0002
        L_0x0728:
            r2 = r0
            r52.zzgz()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlg.zzeb(long):void");
    }

    private static void zza(zzpk zzpk, int i, zzlp zzlp) throws zzhv {
        zzpk.zzbo(i + 8);
        int zzar = zzkr.zzar(zzpk.readInt());
        if ((zzar & 1) == 0) {
            boolean z = (zzar & 2) != 0;
            int zzjd = zzpk.zzjd();
            if (zzjd == zzlp.zzawy) {
                Arrays.fill(zzlp.zzbar, 0, zzjd, z);
                zzlp.zzaw(zzpk.zziy());
                zzpk.zze(zzlp.zzbau.data, 0, zzlp.zzbat);
                zzlp.zzbau.zzbo(0);
                zzlp.zzbav = false;
                return;
            }
            int i2 = zzlp.zzawy;
            StringBuilder sb = new StringBuilder(41);
            sb.append("Length mismatch: ");
            sb.append(zzjd);
            sb.append(", ");
            sb.append(i2);
            throw new zzhv(sb.toString());
        }
        throw new zzhv("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private static zzjn zzb(List<zzkt> list) {
        Pair pair;
        UUID uuid;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            zzkt zzkt = list.get(i);
            if (zzkt.type == zzkr.zzaui) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = zzkt.zzawe.data;
                zzpk zzpk = new zzpk(bArr);
                if (zzpk.limit() < 32) {
                    pair = null;
                } else {
                    zzpk.zzbo(0);
                    if (zzpk.readInt() != zzpk.zziy() + 4) {
                        pair = null;
                    } else if (zzpk.readInt() != zzkr.zzaui) {
                        pair = null;
                    } else {
                        int zzaq = zzkr.zzaq(zzpk.readInt());
                        if (zzaq > 1) {
                            StringBuilder sb = new StringBuilder(37);
                            sb.append("Unsupported pssh version: ");
                            sb.append(zzaq);
                            Log.w("PsshAtomUtil", sb.toString());
                            pair = null;
                        } else {
                            UUID uuid2 = new UUID(zzpk.readLong(), zzpk.readLong());
                            if (zzaq == 1) {
                                zzpk.zzbp(zzpk.zzjd() << 4);
                            }
                            int zzjd = zzpk.zzjd();
                            if (zzjd != zzpk.zziy()) {
                                pair = null;
                            } else {
                                byte[] bArr2 = new byte[zzjd];
                                zzpk.zze(bArr2, 0, zzjd);
                                pair = Pair.create(uuid2, bArr2);
                            }
                        }
                    }
                }
                if (pair == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) pair.first;
                }
                if (uuid == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new zzjn.zza(uuid, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zzjn((List<zzjn.zza>) arrayList);
    }
}
