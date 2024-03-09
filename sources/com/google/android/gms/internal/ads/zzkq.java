package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzkq {
    public int height;
    public int number;
    public int type;
    public int width;
    public zzjn zzahb;
    public int zzahf;
    public byte[] zzahg;
    public int zzahi;
    public int zzahj;
    /* access modifiers changed from: private */
    public String zzahp;
    public String zzari;
    public int zzarj;
    public boolean zzark;
    public byte[] zzarl;
    public zzkf zzarm;
    public byte[] zzarn;
    public int zzaro;
    public int zzarp;
    public int zzarq;
    public boolean zzarr;
    public int zzars;
    public int zzart;
    public int zzaru;
    public int zzarv;
    public int zzarw;
    public float zzarx;
    public float zzary;
    public float zzarz;
    public float zzasa;
    public float zzasb;
    public float zzasc;
    public float zzasd;
    public float zzase;
    public float zzasf;
    public float zzasg;
    public int zzash;
    public long zzasi;
    public long zzasj;
    public boolean zzask;
    public boolean zzasl;
    public zzkg zzasm;
    public int zzasn;

    private zzkq() {
        this.width = -1;
        this.height = -1;
        this.zzaro = -1;
        this.zzarp = -1;
        this.zzarq = 0;
        this.zzahg = null;
        this.zzahf = -1;
        this.zzarr = false;
        this.zzars = -1;
        this.zzart = -1;
        this.zzaru = -1;
        this.zzarv = 1000;
        this.zzarw = ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION;
        this.zzarx = -1.0f;
        this.zzary = -1.0f;
        this.zzarz = -1.0f;
        this.zzasa = -1.0f;
        this.zzasb = -1.0f;
        this.zzasc = -1.0f;
        this.zzasd = -1.0f;
        this.zzase = -1.0f;
        this.zzasf = -1.0f;
        this.zzasg = -1.0f;
        this.zzahi = 1;
        this.zzash = -1;
        this.zzahj = 8000;
        this.zzasi = 0;
        this.zzasj = 0;
        this.zzasl = true;
        this.zzahp = "eng";
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.ads.zzjx r43, int r44) throws com.google.android.gms.internal.ads.zzhv {
        /*
            r42 = this;
            r0 = r42
            java.lang.String r1 = r0.zzari
            int r2 = r1.hashCode()
            r4 = 4
            r5 = 8
            r6 = 1
            r7 = 2
            r8 = 0
            r9 = 3
            r10 = -1
            switch(r2) {
                case -2095576542: goto L_0x014c;
                case -2095575984: goto L_0x0142;
                case -1985379776: goto L_0x0137;
                case -1784763192: goto L_0x012c;
                case -1730367663: goto L_0x0121;
                case -1482641358: goto L_0x0116;
                case -1482641357: goto L_0x010b;
                case -1373388978: goto L_0x0100;
                case -933872740: goto L_0x00f5;
                case -538363189: goto L_0x00ea;
                case -538363109: goto L_0x00df;
                case -425012669: goto L_0x00d3;
                case -356037306: goto L_0x00c7;
                case 62923557: goto L_0x00bb;
                case 62923603: goto L_0x00af;
                case 62927045: goto L_0x00a3;
                case 82338133: goto L_0x0098;
                case 82338134: goto L_0x008d;
                case 99146302: goto L_0x0081;
                case 444813526: goto L_0x0075;
                case 542569478: goto L_0x0069;
                case 725957860: goto L_0x005d;
                case 855502857: goto L_0x0052;
                case 1422270023: goto L_0x0046;
                case 1809237540: goto L_0x003b;
                case 1950749482: goto L_0x002f;
                case 1950789798: goto L_0x0023;
                case 1951062397: goto L_0x0017;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0156
        L_0x0017:
            java.lang.String r2 = "A_OPUS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0015
            r1 = 11
            goto L_0x0157
        L_0x0023:
            java.lang.String r2 = "A_FLAC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0015
            r1 = 21
            goto L_0x0157
        L_0x002f:
            java.lang.String r2 = "A_EAC3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0015
            r1 = 16
            goto L_0x0157
        L_0x003b:
            java.lang.String r2 = "V_MPEG2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0015
            r1 = 2
            goto L_0x0157
        L_0x0046:
            java.lang.String r2 = "S_TEXT/UTF8"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0015
            r1 = 24
            goto L_0x0157
        L_0x0052:
            java.lang.String r2 = "V_MPEGH/ISO/HEVC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0015
            r1 = 7
            goto L_0x0157
        L_0x005d:
            java.lang.String r2 = "A_PCM/INT/LIT"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0015
            r1 = 23
            goto L_0x0157
        L_0x0069:
            java.lang.String r2 = "A_DTS/EXPRESS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0015
            r1 = 19
            goto L_0x0157
        L_0x0075:
            java.lang.String r2 = "V_THEORA"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0015
            r1 = 9
            goto L_0x0157
        L_0x0081:
            java.lang.String r2 = "S_HDMV/PGS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0015
            r1 = 26
            goto L_0x0157
        L_0x008d:
            java.lang.String r2 = "V_VP9"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0015
            r1 = 1
            goto L_0x0157
        L_0x0098:
            java.lang.String r2 = "V_VP8"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0015
            r1 = 0
            goto L_0x0157
        L_0x00a3:
            java.lang.String r2 = "A_DTS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0015
            r1 = 18
            goto L_0x0157
        L_0x00af:
            java.lang.String r2 = "A_AC3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0015
            r1 = 15
            goto L_0x0157
        L_0x00bb:
            java.lang.String r2 = "A_AAC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0015
            r1 = 12
            goto L_0x0157
        L_0x00c7:
            java.lang.String r2 = "A_DTS/LOSSLESS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0015
            r1 = 20
            goto L_0x0157
        L_0x00d3:
            java.lang.String r2 = "S_VOBSUB"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0015
            r1 = 25
            goto L_0x0157
        L_0x00df:
            java.lang.String r2 = "V_MPEG4/ISO/AVC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0015
            r1 = 6
            goto L_0x0157
        L_0x00ea:
            java.lang.String r2 = "V_MPEG4/ISO/ASP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0015
            r1 = 4
            goto L_0x0157
        L_0x00f5:
            java.lang.String r2 = "S_DVBSUB"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0015
            r1 = 27
            goto L_0x0157
        L_0x0100:
            java.lang.String r2 = "V_MS/VFW/FOURCC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0015
            r1 = 8
            goto L_0x0157
        L_0x010b:
            java.lang.String r2 = "A_MPEG/L3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0015
            r1 = 14
            goto L_0x0157
        L_0x0116:
            java.lang.String r2 = "A_MPEG/L2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0015
            r1 = 13
            goto L_0x0157
        L_0x0121:
            java.lang.String r2 = "A_VORBIS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0015
            r1 = 10
            goto L_0x0157
        L_0x012c:
            java.lang.String r2 = "A_TRUEHD"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0015
            r1 = 17
            goto L_0x0157
        L_0x0137:
            java.lang.String r2 = "A_MS/ACM"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0015
            r1 = 22
            goto L_0x0157
        L_0x0142:
            java.lang.String r2 = "V_MPEG4/ISO/SP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0015
            r1 = 3
            goto L_0x0157
        L_0x014c:
            java.lang.String r2 = "V_MPEG4/ISO/AP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0015
            r1 = 5
            goto L_0x0157
        L_0x0156:
            r1 = -1
        L_0x0157:
            java.lang.String r2 = "application/dvbsubs"
            java.lang.String r11 = "application/pgs"
            java.lang.String r12 = "application/vobsub"
            java.lang.String r13 = "application/x-subrip"
            java.lang.String r14 = "audio/raw"
            java.lang.String r16 = "video/x-unknown"
            java.lang.String r15 = "audio/x-unknown"
            java.lang.String r3 = "MatroskaExtractor"
            r17 = 0
            switch(r1) {
                case 0: goto L_0x03e0;
                case 1: goto L_0x03d6;
                case 2: goto L_0x03cc;
                case 3: goto L_0x03b4;
                case 4: goto L_0x03b4;
                case 5: goto L_0x03b4;
                case 6: goto L_0x039b;
                case 7: goto L_0x0382;
                case 8: goto L_0x035a;
                case 9: goto L_0x034f;
                case 10: goto L_0x0339;
                case 11: goto L_0x02eb;
                case 12: goto L_0x02da;
                case 13: goto L_0x02cd;
                case 14: goto L_0x02c0;
                case 15: goto L_0x02b4;
                case 16: goto L_0x02a8;
                case 17: goto L_0x029c;
                case 18: goto L_0x0290;
                case 19: goto L_0x0290;
                case 20: goto L_0x0284;
                case 21: goto L_0x0273;
                case 22: goto L_0x01fd;
                case 23: goto L_0x01b8;
                case 24: goto L_0x01ae;
                case 25: goto L_0x019f;
                case 26: goto L_0x0195;
                case 27: goto L_0x0174;
                default: goto L_0x016c;
            }
        L_0x016c:
            com.google.android.gms.internal.ads.zzhv r1 = new com.google.android.gms.internal.ads.zzhv
            java.lang.String r2 = "Unrecognized codec identifier."
            r1.<init>(r2)
            throw r1
        L_0x0174:
            byte[] r1 = new byte[r4]
            byte[] r3 = r0.zzarn
            byte r4 = r3[r8]
            r1[r8] = r4
            byte r4 = r3[r6]
            r1[r6] = r4
            byte r4 = r3[r7]
            r1[r7] = r4
            byte r3 = r3[r9]
            r1[r9] = r3
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r3 = r1
            r1 = r2
            r25 = -1
            r30 = -1
            goto L_0x03e9
        L_0x0195:
            r1 = r11
            r3 = r17
            r25 = -1
            r30 = -1
            goto L_0x03e9
        L_0x019f:
            byte[] r1 = r0.zzarn
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r3 = r1
            r1 = r12
            r25 = -1
            r30 = -1
            goto L_0x03e9
        L_0x01ae:
            r1 = r13
            r3 = r17
            r25 = -1
            r30 = -1
            goto L_0x03e9
        L_0x01b8:
            int r1 = r0.zzash
            int r1 = com.google.android.gms.internal.ads.zzpq.zzbr(r1)
            if (r1 != 0) goto L_0x01f4
            int r1 = r0.zzash
            java.lang.String r4 = java.lang.String.valueOf(r15)
            int r4 = r4.length()
            int r4 = r4 + 60
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Unsupported PCM bit depth: "
            r5.append(r4)
            r5.append(r1)
            java.lang.String r1 = ". Setting mimeType to "
            r5.append(r1)
            r5.append(r15)
            java.lang.String r1 = r5.toString()
            android.util.Log.w(r3, r1)
            r1 = r15
            r3 = r17
            r25 = -1
            r30 = -1
            goto L_0x03e9
        L_0x01f4:
            r25 = r1
            r1 = r14
            r3 = r17
            r30 = -1
            goto L_0x03e9
        L_0x01fd:
            com.google.android.gms.internal.ads.zzpk r1 = new com.google.android.gms.internal.ads.zzpk
            byte[] r4 = r0.zzarn
            r1.<init>((byte[]) r4)
            boolean r1 = zzb(r1)
            if (r1 == 0) goto L_0x024f
            int r1 = r0.zzash
            int r1 = com.google.android.gms.internal.ads.zzpq.zzbr(r1)
            if (r1 != 0) goto L_0x0246
            int r1 = r0.zzash
            java.lang.String r4 = java.lang.String.valueOf(r15)
            int r4 = r4.length()
            int r4 = r4 + 60
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Unsupported PCM bit depth: "
            r5.append(r4)
            r5.append(r1)
            java.lang.String r1 = ". Setting mimeType to "
            r5.append(r1)
            r5.append(r15)
            java.lang.String r1 = r5.toString()
            android.util.Log.w(r3, r1)
            r1 = r15
            r3 = r17
            r25 = -1
            r30 = -1
            goto L_0x03e9
        L_0x0246:
            r25 = r1
            r1 = r14
            r3 = r17
            r30 = -1
            goto L_0x03e9
        L_0x024f:
            java.lang.String r1 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
            java.lang.String r4 = java.lang.String.valueOf(r15)
            int r5 = r4.length()
            if (r5 == 0) goto L_0x0261
            java.lang.String r1 = r1.concat(r4)
            goto L_0x0267
        L_0x0261:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1)
            r1 = r4
        L_0x0267:
            android.util.Log.w(r3, r1)
            r1 = r15
            r3 = r17
            r25 = -1
            r30 = -1
            goto L_0x03e9
        L_0x0273:
            byte[] r1 = r0.zzarn
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r14 = "audio/x-flac"
            r3 = r1
            r1 = r14
            r25 = -1
            r30 = -1
            goto L_0x03e9
        L_0x0284:
            java.lang.String r14 = "audio/vnd.dts.hd"
            r1 = r14
            r3 = r17
            r25 = -1
            r30 = -1
            goto L_0x03e9
        L_0x0290:
            java.lang.String r14 = "audio/vnd.dts"
            r1 = r14
            r3 = r17
            r25 = -1
            r30 = -1
            goto L_0x03e9
        L_0x029c:
            java.lang.String r14 = "audio/true-hd"
            r1 = r14
            r3 = r17
            r25 = -1
            r30 = -1
            goto L_0x03e9
        L_0x02a8:
            java.lang.String r14 = "audio/eac3"
            r1 = r14
            r3 = r17
            r25 = -1
            r30 = -1
            goto L_0x03e9
        L_0x02b4:
            java.lang.String r14 = "audio/ac3"
            r1 = r14
            r3 = r17
            r25 = -1
            r30 = -1
            goto L_0x03e9
        L_0x02c0:
            java.lang.String r14 = "audio/mpeg"
            r1 = r14
            r3 = r17
            r25 = -1
            r30 = 4096(0x1000, float:5.74E-42)
            goto L_0x03e9
        L_0x02cd:
            java.lang.String r14 = "audio/mpeg-L2"
            r1 = r14
            r3 = r17
            r25 = -1
            r30 = 4096(0x1000, float:5.74E-42)
            goto L_0x03e9
        L_0x02da:
            byte[] r1 = r0.zzarn
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r14 = "audio/mp4a-latm"
            r3 = r1
            r1 = r14
            r25 = -1
            r30 = -1
            goto L_0x03e9
        L_0x02eb:
            r15 = 5760(0x1680, float:8.071E-42)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r9)
            byte[] r3 = r0.zzarn
            r1.add(r3)
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r5)
            java.nio.ByteOrder r4 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r3 = r3.order(r4)
            long r6 = r0.zzasi
            java.nio.ByteBuffer r3 = r3.putLong(r6)
            byte[] r3 = r3.array()
            r1.add(r3)
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r5)
            java.nio.ByteOrder r5 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r3 = r3.order(r5)
            long r5 = r0.zzasj
            java.nio.ByteBuffer r3 = r3.putLong(r5)
            byte[] r3 = r3.array()
            r1.add(r3)
            java.lang.String r3 = "audio/opus"
            r25 = -1
            r30 = 5760(0x1680, float:8.071E-42)
            r41 = r3
            r3 = r1
            r1 = r41
            goto L_0x03e9
        L_0x0339:
            r15 = 8192(0x2000, float:1.14794E-41)
            byte[] r1 = r0.zzarn
            java.util.List r1 = zzd(r1)
            java.lang.String r3 = "audio/vorbis"
            r25 = -1
            r30 = 8192(0x2000, float:1.14794E-41)
            r41 = r3
            r3 = r1
            r1 = r41
            goto L_0x03e9
        L_0x034f:
            r1 = r16
            r3 = r17
            r25 = -1
            r30 = -1
            goto L_0x03e9
        L_0x035a:
            com.google.android.gms.internal.ads.zzpk r1 = new com.google.android.gms.internal.ads.zzpk
            byte[] r5 = r0.zzarn
            r1.<init>((byte[]) r5)
            java.util.List r1 = zza(r1)
            if (r1 == 0) goto L_0x0374
            java.lang.String r3 = "video/wvc1"
            r25 = -1
            r30 = -1
            r41 = r3
            r3 = r1
            r1 = r41
            goto L_0x03e9
        L_0x0374:
            java.lang.String r5 = "Unsupported FourCC. Setting mimeType to video/x-unknown"
            android.util.Log.w(r3, r5)
            r3 = r1
            r1 = r16
            r25 = -1
            r30 = -1
            goto L_0x03e9
        L_0x0382:
            com.google.android.gms.internal.ads.zzpk r1 = new com.google.android.gms.internal.ads.zzpk
            byte[] r3 = r0.zzarn
            r1.<init>((byte[]) r3)
            com.google.android.gms.internal.ads.zzpy r1 = com.google.android.gms.internal.ads.zzpy.zzi(r1)
            java.util.List<byte[]> r3 = r1.zzaha
            int r1 = r1.zzasn
            r0.zzasn = r1
            java.lang.String r1 = "video/hevc"
            r25 = -1
            r30 = -1
            goto L_0x03e9
        L_0x039b:
            com.google.android.gms.internal.ads.zzpk r1 = new com.google.android.gms.internal.ads.zzpk
            byte[] r3 = r0.zzarn
            r1.<init>((byte[]) r3)
            com.google.android.gms.internal.ads.zzps r1 = com.google.android.gms.internal.ads.zzps.zzg(r1)
            java.util.List<byte[]> r3 = r1.zzaha
            int r1 = r1.zzasn
            r0.zzasn = r1
            java.lang.String r1 = "video/avc"
            r25 = -1
            r30 = -1
            goto L_0x03e9
        L_0x03b4:
            byte[] r1 = r0.zzarn
            if (r1 != 0) goto L_0x03bc
            r1 = r17
            goto L_0x03c0
        L_0x03bc:
            java.util.List r1 = java.util.Collections.singletonList(r1)
        L_0x03c0:
            java.lang.String r3 = "video/mp4v-es"
            r25 = -1
            r30 = -1
            r41 = r3
            r3 = r1
            r1 = r41
            goto L_0x03e9
        L_0x03cc:
            java.lang.String r1 = "video/mpeg2"
            r3 = r17
            r25 = -1
            r30 = -1
            goto L_0x03e9
        L_0x03d6:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            r3 = r17
            r25 = -1
            r30 = -1
            goto L_0x03e9
        L_0x03e0:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            r3 = r17
            r25 = -1
            r30 = -1
        L_0x03e9:
            boolean r5 = r0.zzasl
            r5 = r5 | r8
            boolean r6 = r0.zzask
            if (r6 == 0) goto L_0x03f3
            r6 = 2
            goto L_0x03f4
        L_0x03f3:
            r6 = 0
        L_0x03f4:
            r5 = r5 | r6
            boolean r6 = com.google.android.gms.internal.ads.zzpg.zzbf(r1)
            if (r6 == 0) goto L_0x0423
            java.lang.String r18 = java.lang.Integer.toString(r44)
            r20 = 0
            r21 = -1
            int r2 = r0.zzahi
            int r6 = r0.zzahj
            com.google.android.gms.internal.ads.zzjn r7 = r0.zzahb
            java.lang.String r8 = r0.zzahp
            r19 = r1
            r22 = r30
            r23 = r2
            r24 = r6
            r26 = r3
            r27 = r7
            r28 = r5
            r29 = r8
            com.google.android.gms.internal.ads.zzho r1 = com.google.android.gms.internal.ads.zzho.zza(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r6 = 1
            goto L_0x05ad
        L_0x0423:
            boolean r4 = com.google.android.gms.internal.ads.zzpg.zzbg(r1)
            if (r4 == 0) goto L_0x0557
            int r2 = r0.zzarq
            if (r2 != 0) goto L_0x043e
            int r2 = r0.zzaro
            if (r2 != r10) goto L_0x0434
            int r2 = r0.width
        L_0x0434:
            r0.zzaro = r2
            int r2 = r0.zzarp
            if (r2 != r10) goto L_0x043c
            int r2 = r0.height
        L_0x043c:
            r0.zzarp = r2
        L_0x043e:
            int r2 = r0.zzaro
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == r10) goto L_0x0457
            int r5 = r0.zzarp
            if (r5 == r10) goto L_0x0457
            int r6 = r0.height
            int r6 = r6 * r2
            float r2 = (float) r6
            int r6 = r0.width
            int r6 = r6 * r5
            float r5 = (float) r6
            float r2 = r2 / r5
            r36 = r2
            goto L_0x0459
        L_0x0457:
            r36 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0459:
            boolean r2 = r0.zzarr
            if (r2 == 0) goto L_0x052b
            float r2 = r0.zzarx
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x051a
            float r2 = r0.zzary
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x051a
            float r2 = r0.zzarz
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x051a
            float r2 = r0.zzasa
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x051a
            float r2 = r0.zzasb
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x051a
            float r2 = r0.zzasc
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x051a
            float r2 = r0.zzasd
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x051a
            float r2 = r0.zzase
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x051a
            float r2 = r0.zzasf
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x051a
            float r2 = r0.zzasg
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x049d
            goto L_0x051a
        L_0x049d:
            r2 = 25
            byte[] r2 = new byte[r2]
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r2)
            r4.put(r8)
            float r5 = r0.zzarx
            r6 = 1195593728(0x47435000, float:50000.0)
            float r5 = r5 * r6
            r7 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 + r7
            int r5 = (int) r5
            short r5 = (short) r5
            r4.putShort(r5)
            float r5 = r0.zzary
            float r5 = r5 * r6
            float r5 = r5 + r7
            int r5 = (int) r5
            short r5 = (short) r5
            r4.putShort(r5)
            float r5 = r0.zzarz
            float r5 = r5 * r6
            float r5 = r5 + r7
            int r5 = (int) r5
            short r5 = (short) r5
            r4.putShort(r5)
            float r5 = r0.zzasa
            float r5 = r5 * r6
            float r5 = r5 + r7
            int r5 = (int) r5
            short r5 = (short) r5
            r4.putShort(r5)
            float r5 = r0.zzasb
            float r5 = r5 * r6
            float r5 = r5 + r7
            int r5 = (int) r5
            short r5 = (short) r5
            r4.putShort(r5)
            float r5 = r0.zzasc
            float r5 = r5 * r6
            float r5 = r5 + r7
            int r5 = (int) r5
            short r5 = (short) r5
            r4.putShort(r5)
            float r5 = r0.zzasd
            float r5 = r5 * r6
            float r5 = r5 + r7
            int r5 = (int) r5
            short r5 = (short) r5
            r4.putShort(r5)
            float r5 = r0.zzase
            float r5 = r5 * r6
            float r5 = r5 + r7
            int r5 = (int) r5
            short r5 = (short) r5
            r4.putShort(r5)
            float r5 = r0.zzasf
            float r5 = r5 + r7
            int r5 = (int) r5
            short r5 = (short) r5
            r4.putShort(r5)
            float r5 = r0.zzasg
            float r5 = r5 + r7
            int r5 = (int) r5
            short r5 = (short) r5
            r4.putShort(r5)
            int r5 = r0.zzarv
            short r5 = (short) r5
            r4.putShort(r5)
            int r5 = r0.zzarw
            short r5 = (short) r5
            r4.putShort(r5)
            goto L_0x051c
        L_0x051a:
            r2 = r17
        L_0x051c:
            com.google.android.gms.internal.ads.zzpr r4 = new com.google.android.gms.internal.ads.zzpr
            int r5 = r0.zzars
            int r6 = r0.zzaru
            int r7 = r0.zzart
            r4.<init>(r5, r6, r7, r2)
            r39 = r4
            goto L_0x052d
        L_0x052b:
            r39 = r17
        L_0x052d:
            java.lang.String r26 = java.lang.Integer.toString(r44)
            r28 = 0
            r29 = -1
            int r2 = r0.width
            int r4 = r0.height
            r33 = -1082130432(0xffffffffbf800000, float:-1.0)
            r35 = -1
            byte[] r5 = r0.zzahg
            int r6 = r0.zzahf
            com.google.android.gms.internal.ads.zzjn r7 = r0.zzahb
            r27 = r1
            r31 = r2
            r32 = r4
            r34 = r3
            r37 = r5
            r38 = r6
            r40 = r7
            com.google.android.gms.internal.ads.zzho r1 = com.google.android.gms.internal.ads.zzho.zza(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r6 = 2
            goto L_0x05ad
        L_0x0557:
            boolean r4 = r13.equals(r1)
            if (r4 == 0) goto L_0x0578
            java.lang.String r18 = java.lang.Integer.toString(r44)
            r20 = 0
            r21 = -1
            java.lang.String r2 = r0.zzahp
            com.google.android.gms.internal.ads.zzjn r3 = r0.zzahb
            r19 = r1
            r22 = r5
            r23 = r2
            r24 = r3
            com.google.android.gms.internal.ads.zzho r1 = com.google.android.gms.internal.ads.zzho.zza((java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20, (int) r21, (int) r22, (java.lang.String) r23, (com.google.android.gms.internal.ads.zzjn) r24)
            r6 = 3
            goto L_0x05ad
        L_0x0578:
            boolean r4 = r12.equals(r1)
            if (r4 != 0) goto L_0x0593
            boolean r4 = r11.equals(r1)
            if (r4 != 0) goto L_0x0593
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x058b
            goto L_0x0593
        L_0x058b:
            com.google.android.gms.internal.ads.zzhv r1 = new com.google.android.gms.internal.ads.zzhv
            java.lang.String r2 = "Unexpected MIME type."
            r1.<init>(r2)
            throw r1
        L_0x0593:
            java.lang.String r18 = java.lang.Integer.toString(r44)
            r20 = 0
            r21 = -1
            java.lang.String r2 = r0.zzahp
            com.google.android.gms.internal.ads.zzjn r4 = r0.zzahb
            r19 = r1
            r22 = r3
            r23 = r2
            r24 = r4
            com.google.android.gms.internal.ads.zzho r1 = com.google.android.gms.internal.ads.zzho.zza((java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20, (int) r21, (java.util.List<byte[]>) r22, (java.lang.String) r23, (com.google.android.gms.internal.ads.zzjn) r24)
            r6 = 3
        L_0x05ad:
            int r2 = r0.number
            r3 = r43
            com.google.android.gms.internal.ads.zzkg r2 = r3.zzc(r2, r6)
            r0.zzasm = r2
            r2.zze(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkq.zza(com.google.android.gms.internal.ads.zzjx, int):void");
    }

    private static List<byte[]> zza(zzpk zzpk) throws zzhv {
        try {
            zzpk.zzbp(16);
            if (zzpk.zzjb() != 826496599) {
                return null;
            }
            byte[] bArr = zzpk.data;
            for (int position = zzpk.getPosition() + 20; position < bArr.length - 4; position++) {
                if (bArr[position] == 0 && bArr[position + 1] == 0 && bArr[position + 2] == 1 && bArr[position + 3] == 15) {
                    return Collections.singletonList(Arrays.copyOfRange(bArr, position, bArr.length));
                }
            }
            throw new zzhv("Failed to find FourCC VC1 initialization data");
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzhv("Error parsing FourCC VC1 codec private");
        }
    }

    private static List<byte[]> zzd(byte[] bArr) throws zzhv {
        try {
            if (bArr[0] == 2) {
                int i = 1;
                int i2 = 0;
                while (bArr[i] == -1) {
                    i2 += 255;
                    i++;
                }
                int i3 = i + 1;
                int i4 = i2 + bArr[i];
                int i5 = 0;
                while (bArr[i3] == -1) {
                    i5 += 255;
                    i3++;
                }
                int i6 = i3 + 1;
                int i7 = i5 + bArr[i3];
                if (bArr[i6] == 1) {
                    byte[] bArr2 = new byte[i4];
                    System.arraycopy(bArr, i6, bArr2, 0, i4);
                    int i8 = i6 + i4;
                    if (bArr[i8] == 3) {
                        int i9 = i8 + i7;
                        if (bArr[i9] == 5) {
                            byte[] bArr3 = new byte[(bArr.length - i9)];
                            System.arraycopy(bArr, i9, bArr3, 0, bArr.length - i9);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw new zzhv("Error parsing vorbis codec private");
                    }
                    throw new zzhv("Error parsing vorbis codec private");
                }
                throw new zzhv("Error parsing vorbis codec private");
            }
            throw new zzhv("Error parsing vorbis codec private");
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzhv("Error parsing vorbis codec private");
        }
    }

    private static boolean zzb(zzpk zzpk) throws zzhv {
        try {
            int zziz = zzpk.zziz();
            if (zziz == 1) {
                return true;
            }
            if (zziz != 65534) {
                return false;
            }
            zzpk.zzbo(24);
            if (zzpk.readLong() == zzkl.zzapi.getMostSignificantBits() && zzpk.readLong() == zzkl.zzapi.getLeastSignificantBits()) {
                return true;
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzhv("Error parsing MS/ACM codec private");
        }
    }

    /* synthetic */ zzkq(zzko zzko) {
        this();
    }
}
