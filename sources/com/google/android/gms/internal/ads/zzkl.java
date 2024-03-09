package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzjn;
import com.google.firebase.FirebaseError;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzkl implements zzjv {
    private static final zzka zzapf = new zzko();
    private static final byte[] zzapg = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzaph = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    /* access modifiers changed from: private */
    public static final UUID zzapi = new UUID(72057594037932032L, -9223371306706625679L);
    private long zzaid;
    private final zzks zzaoz;
    private final zzkj zzapj;
    private final SparseArray<zzkq> zzapk;
    private final boolean zzapl;
    private final zzpk zzapm;
    private final zzpk zzapn;
    private final zzpk zzapo;
    private final zzpk zzapp;
    private final zzpk zzapq;
    private final zzpk zzapr;
    private final zzpk zzaps;
    private final zzpk zzapt;
    private final zzpk zzapu;
    private ByteBuffer zzapv;
    private long zzapw;
    private long zzapx;
    private long zzapy;
    private long zzapz;
    private zzkq zzaqa;
    private boolean zzaqb;
    private int zzaqc;
    private long zzaqd;
    private boolean zzaqe;
    private long zzaqf;
    private long zzaqg;
    private long zzaqh;
    private zzpe zzaqi;
    private zzpe zzaqj;
    private boolean zzaqk;
    private int zzaql;
    private long zzaqm;
    private long zzaqn;
    private int zzaqo;
    private int zzaqp;
    private int[] zzaqq;
    private int zzaqr;
    private int zzaqs;
    private int zzaqt;
    private int zzaqu;
    private boolean zzaqv;
    private boolean zzaqw;
    private boolean zzaqx;
    private boolean zzaqy;
    private byte zzaqz;
    private int zzara;
    private int zzarb;
    private int zzarc;
    private boolean zzard;
    private boolean zzare;
    private zzjx zzarf;

    public zzkl() {
        this(0);
    }

    private zzkl(int i) {
        this(new zzki(), 0);
    }

    private zzkl(zzkj zzkj, int i) {
        this.zzapx = -1;
        this.zzapy = -9223372036854775807L;
        this.zzapz = -9223372036854775807L;
        this.zzaid = -9223372036854775807L;
        this.zzaqf = -1;
        this.zzaqg = -1;
        this.zzaqh = -9223372036854775807L;
        this.zzapj = zzkj;
        zzkj.zza(new zzkn(this, (zzko) null));
        this.zzapl = true;
        this.zzaoz = new zzks();
        this.zzapk = new SparseArray<>();
        this.zzapo = new zzpk(4);
        this.zzapp = new zzpk(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzapq = new zzpk(4);
        this.zzapm = new zzpk(zzpf.zzbjn);
        this.zzapn = new zzpk(4);
        this.zzapr = new zzpk();
        this.zzaps = new zzpk();
        this.zzapt = new zzpk(8);
        this.zzapu = new zzpk();
    }

    public final boolean zza(zzjy zzjy) throws IOException, InterruptedException {
        return new zzkp().zza(zzjy);
    }

    public final void zza(zzjx zzjx) {
        this.zzarf = zzjx;
    }

    public final void zzc(long j, long j2) {
        this.zzaqh = -9223372036854775807L;
        this.zzaql = 0;
        this.zzapj.reset();
        this.zzaoz.reset();
        zzgs();
    }

    public final void release() {
    }

    public final int zza(zzjy zzjy, zzkb zzkb) throws IOException, InterruptedException {
        boolean z;
        this.zzard = false;
        boolean z2 = true;
        while (z2 && !this.zzard) {
            z2 = this.zzapj.zzb(zzjy);
            if (z2) {
                long position = zzjy.getPosition();
                if (this.zzaqe) {
                    this.zzaqg = position;
                    zzkb.position = this.zzaqf;
                    this.zzaqe = false;
                    z = true;
                } else {
                    if (this.zzaqb) {
                        long j = this.zzaqg;
                        if (j != -1) {
                            zzkb.position = j;
                            this.zzaqg = -1;
                            z = true;
                        }
                    }
                    z = false;
                }
                if (z) {
                    return 1;
                }
            }
        }
        if (z2) {
            return 0;
        }
        return -1;
    }

    static int zzan(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case FirebaseError.ERROR_WEAK_PASSWORD /*17026*/:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    static boolean zzao(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    /* access modifiers changed from: package-private */
    public final void zzd(int i, long j, long j2) throws zzhv {
        if (i == 160) {
            this.zzare = false;
        } else if (i == 174) {
            this.zzaqa = new zzkq((zzko) null);
        } else if (i == 187) {
            this.zzaqk = false;
        } else if (i == 19899) {
            this.zzaqc = -1;
            this.zzaqd = -1;
        } else if (i == 20533) {
            this.zzaqa.zzark = true;
        } else if (i == 21968) {
            this.zzaqa.zzarr = true;
        } else if (i == 408125543) {
            long j3 = this.zzapx;
            if (j3 == -1 || j3 == j) {
                this.zzapx = j;
                this.zzapw = j2;
                return;
            }
            throw new zzhv("Multiple Segment elements not supported");
        } else if (i == 475249515) {
            this.zzaqi = new zzpe();
            this.zzaqj = new zzpe();
        } else if (i != 524531317 || this.zzaqb) {
        } else {
            if (!this.zzapl || this.zzaqf == -1) {
                this.zzarf.zza(new zzkd(this.zzaid));
                this.zzaqb = true;
                return;
            }
            this.zzaqe = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzap(int i) throws zzhv {
        zzke zzke;
        zzpe zzpe;
        zzpe zzpe2;
        int i2;
        int i3 = 0;
        if (i != 160) {
            if (i == 174) {
                String str = this.zzaqa.zzari;
                if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                    i3 = 1;
                }
                if (i3 != 0) {
                    zzkq zzkq = this.zzaqa;
                    zzkq.zza(this.zzarf, zzkq.number);
                    this.zzapk.put(this.zzaqa.number, this.zzaqa);
                }
                this.zzaqa = null;
            } else if (i == 19899) {
                int i4 = this.zzaqc;
                if (i4 != -1) {
                    long j = this.zzaqd;
                    if (j != -1) {
                        if (i4 == 475249515) {
                            this.zzaqf = j;
                            return;
                        }
                        return;
                    }
                }
                throw new zzhv("Mandatory element SeekID or SeekPosition not found");
            } else if (i != 25152) {
                if (i != 28032) {
                    if (i == 357149030) {
                        if (this.zzapy == -9223372036854775807L) {
                            this.zzapy = 1000000;
                        }
                        long j2 = this.zzapz;
                        if (j2 != -9223372036854775807L) {
                            this.zzaid = zzea(j2);
                        }
                    } else if (i != 374648427) {
                        if (i == 475249515 && !this.zzaqb) {
                            zzjx zzjx = this.zzarf;
                            if (this.zzapx == -1 || this.zzaid == -9223372036854775807L || (zzpe = this.zzaqi) == null || zzpe.size() == 0 || (zzpe2 = this.zzaqj) == null || zzpe2.size() != this.zzaqi.size()) {
                                this.zzaqi = null;
                                this.zzaqj = null;
                                zzke = new zzkd(this.zzaid);
                            } else {
                                int size = this.zzaqi.size();
                                int[] iArr = new int[size];
                                long[] jArr = new long[size];
                                long[] jArr2 = new long[size];
                                long[] jArr3 = new long[size];
                                for (int i5 = 0; i5 < size; i5++) {
                                    jArr3[i5] = this.zzaqi.get(i5);
                                    jArr[i5] = this.zzapx + this.zzaqj.get(i5);
                                }
                                while (true) {
                                    i2 = size - 1;
                                    if (i3 >= i2) {
                                        break;
                                    }
                                    int i6 = i3 + 1;
                                    iArr[i3] = (int) (jArr[i6] - jArr[i3]);
                                    jArr2[i3] = jArr3[i6] - jArr3[i3];
                                    i3 = i6;
                                }
                                iArr[i2] = (int) ((this.zzapx + this.zzapw) - jArr[i2]);
                                jArr2[i2] = this.zzaid - jArr3[i2];
                                this.zzaqi = null;
                                this.zzaqj = null;
                                zzke = new zzjt(iArr, jArr, jArr2, jArr3);
                            }
                            zzjx.zza(zzke);
                            this.zzaqb = true;
                        }
                    } else if (this.zzapk.size() != 0) {
                        this.zzarf.zzgp();
                    } else {
                        throw new zzhv("No valid tracks were found");
                    }
                } else if (this.zzaqa.zzark && this.zzaqa.zzarl != null) {
                    throw new zzhv("Combining encryption and compression is not supported");
                }
            } else if (!this.zzaqa.zzark) {
            } else {
                if (this.zzaqa.zzarm != null) {
                    this.zzaqa.zzahb = new zzjn(new zzjn.zza(zzha.UUID_NIL, "video/webm", this.zzaqa.zzarm.zzaow));
                    return;
                }
                throw new zzhv("Encrypted Track found but ContentEncKeyID was not found");
            }
        } else if (this.zzaql == 2) {
            if (!this.zzare) {
                this.zzaqt |= 1;
            }
            zza(this.zzapk.get(this.zzaqr), this.zzaqm);
            this.zzaql = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzc(int i, long j) throws zzhv {
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        this.zzaqa.type = (int) j;
                        return;
                    case 136:
                        zzkq zzkq = this.zzaqa;
                        if (j == 1) {
                            z = true;
                        }
                        zzkq.zzask = z;
                        return;
                    case 155:
                        this.zzaqn = zzea(j);
                        return;
                    case 159:
                        this.zzaqa.zzahi = (int) j;
                        return;
                    case 176:
                        this.zzaqa.width = (int) j;
                        return;
                    case 179:
                        this.zzaqi.add(zzea(j));
                        return;
                    case 186:
                        this.zzaqa.height = (int) j;
                        return;
                    case 215:
                        this.zzaqa.number = (int) j;
                        return;
                    case 231:
                        this.zzaqh = zzea(j);
                        return;
                    case 241:
                        if (!this.zzaqk) {
                            this.zzaqj.add(j);
                            this.zzaqk = true;
                            return;
                        }
                        return;
                    case 251:
                        this.zzare = true;
                        return;
                    case 16980:
                        if (j != 3) {
                            StringBuilder sb = new StringBuilder(50);
                            sb.append("ContentCompAlgo ");
                            sb.append(j);
                            sb.append(" not supported");
                            throw new zzhv(sb.toString());
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            StringBuilder sb2 = new StringBuilder(53);
                            sb2.append("DocTypeReadVersion ");
                            sb2.append(j);
                            sb2.append(" not supported");
                            throw new zzhv(sb2.toString());
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            StringBuilder sb3 = new StringBuilder(50);
                            sb3.append("EBMLReadVersion ");
                            sb3.append(j);
                            sb3.append(" not supported");
                            throw new zzhv(sb3.toString());
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            StringBuilder sb4 = new StringBuilder(49);
                            sb4.append("ContentEncAlgo ");
                            sb4.append(j);
                            sb4.append(" not supported");
                            throw new zzhv(sb4.toString());
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            StringBuilder sb5 = new StringBuilder(56);
                            sb5.append("AESSettingsCipherMode ");
                            sb5.append(j);
                            sb5.append(" not supported");
                            throw new zzhv(sb5.toString());
                        }
                        return;
                    case 21420:
                        this.zzaqd = j + this.zzapx;
                        return;
                    case 21432:
                        int i2 = (int) j;
                        if (i2 == 0) {
                            this.zzaqa.zzahf = 0;
                            return;
                        } else if (i2 == 1) {
                            this.zzaqa.zzahf = 2;
                            return;
                        } else if (i2 == 3) {
                            this.zzaqa.zzahf = 1;
                            return;
                        } else if (i2 == 15) {
                            this.zzaqa.zzahf = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        this.zzaqa.zzaro = (int) j;
                        return;
                    case 21682:
                        this.zzaqa.zzarq = (int) j;
                        return;
                    case 21690:
                        this.zzaqa.zzarp = (int) j;
                        return;
                    case 21930:
                        zzkq zzkq2 = this.zzaqa;
                        if (j == 1) {
                            z = true;
                        }
                        zzkq2.zzasl = z;
                        return;
                    case 22186:
                        this.zzaqa.zzasi = j;
                        return;
                    case 22203:
                        this.zzaqa.zzasj = j;
                        return;
                    case 25188:
                        this.zzaqa.zzash = (int) j;
                        return;
                    case 2352003:
                        this.zzaqa.zzarj = (int) j;
                        return;
                    case 2807729:
                        this.zzapy = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                int i3 = (int) j;
                                if (i3 == 1) {
                                    this.zzaqa.zzaru = 2;
                                    return;
                                } else if (i3 == 2) {
                                    this.zzaqa.zzaru = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                int i4 = (int) j;
                                if (i4 != 1) {
                                    if (i4 == 16) {
                                        this.zzaqa.zzart = 6;
                                        return;
                                    } else if (i4 == 18) {
                                        this.zzaqa.zzart = 7;
                                        return;
                                    } else if (!(i4 == 6 || i4 == 7)) {
                                        return;
                                    }
                                }
                                this.zzaqa.zzart = 3;
                                return;
                            case 21947:
                                this.zzaqa.zzarr = true;
                                int i5 = (int) j;
                                if (i5 == 1) {
                                    this.zzaqa.zzars = 1;
                                    return;
                                } else if (i5 == 9) {
                                    this.zzaqa.zzars = 6;
                                    return;
                                } else if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                    this.zzaqa.zzars = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case 21948:
                                this.zzaqa.zzarv = (int) j;
                                return;
                            case 21949:
                                this.zzaqa.zzarw = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                StringBuilder sb6 = new StringBuilder(55);
                sb6.append("ContentEncodingScope ");
                sb6.append(j);
                sb6.append(" not supported");
                throw new zzhv(sb6.toString());
            }
        } else if (j != 0) {
            StringBuilder sb7 = new StringBuilder(55);
            sb7.append("ContentEncodingOrder ");
            sb7.append(j);
            sb7.append(" not supported");
            throw new zzhv(sb7.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(int i, double d) {
        if (i == 181) {
            this.zzaqa.zzahj = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    this.zzaqa.zzarx = (float) d;
                    return;
                case 21970:
                    this.zzaqa.zzary = (float) d;
                    return;
                case 21971:
                    this.zzaqa.zzarz = (float) d;
                    return;
                case 21972:
                    this.zzaqa.zzasa = (float) d;
                    return;
                case 21973:
                    this.zzaqa.zzasb = (float) d;
                    return;
                case 21974:
                    this.zzaqa.zzasc = (float) d;
                    return;
                case 21975:
                    this.zzaqa.zzasd = (float) d;
                    return;
                case 21976:
                    this.zzaqa.zzase = (float) d;
                    return;
                case 21977:
                    this.zzaqa.zzasf = (float) d;
                    return;
                case 21978:
                    this.zzaqa.zzasg = (float) d;
                    return;
                default:
                    return;
            }
        } else {
            this.zzapz = (long) d;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(int i, String str) throws zzhv {
        if (i == 134) {
            this.zzaqa.zzari = str;
        } else if (i != 17026) {
            if (i == 2274716) {
                String unused = this.zzaqa.zzahp = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new zzhv(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0205, code lost:
        throw new com.google.android.gms.internal.ads.zzhv("EBML lacing sample size out of range.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(int r20, int r21, com.google.android.gms.internal.ads.zzjy r22) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = 161(0xa1, float:2.26E-43)
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 4
            r7 = 0
            r8 = 1
            if (r1 == r4) goto L_0x0097
            if (r1 == r5) goto L_0x0097
            r4 = 16981(0x4255, float:2.3795E-41)
            if (r1 == r4) goto L_0x0089
            r4 = 18402(0x47e2, float:2.5787E-41)
            if (r1 == r4) goto L_0x007a
            r4 = 21419(0x53ab, float:3.0014E-41)
            if (r1 == r4) goto L_0x005c
            r4 = 25506(0x63a2, float:3.5742E-41)
            if (r1 == r4) goto L_0x004e
            r4 = 30322(0x7672, float:4.249E-41)
            if (r1 != r4) goto L_0x0035
            com.google.android.gms.internal.ads.zzkq r1 = r0.zzaqa
            byte[] r4 = new byte[r2]
            r1.zzahg = r4
            com.google.android.gms.internal.ads.zzkq r1 = r0.zzaqa
            byte[] r1 = r1.zzahg
            r3.readFully(r1, r7, r2)
            return
        L_0x0035:
            com.google.android.gms.internal.ads.zzhv r2 = new com.google.android.gms.internal.ads.zzhv
            r3 = 26
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Unexpected id: "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2.<init>(r1)
            throw r2
        L_0x004e:
            com.google.android.gms.internal.ads.zzkq r1 = r0.zzaqa
            byte[] r4 = new byte[r2]
            r1.zzarn = r4
            com.google.android.gms.internal.ads.zzkq r1 = r0.zzaqa
            byte[] r1 = r1.zzarn
            r3.readFully(r1, r7, r2)
            return
        L_0x005c:
            com.google.android.gms.internal.ads.zzpk r1 = r0.zzapq
            byte[] r1 = r1.data
            java.util.Arrays.fill(r1, r7)
            com.google.android.gms.internal.ads.zzpk r1 = r0.zzapq
            byte[] r1 = r1.data
            int r6 = r6 - r2
            r3.readFully(r1, r6, r2)
            com.google.android.gms.internal.ads.zzpk r1 = r0.zzapq
            r1.zzbo(r7)
            com.google.android.gms.internal.ads.zzpk r1 = r0.zzapq
            long r1 = r1.zzja()
            int r2 = (int) r1
            r0.zzaqc = r2
            return
        L_0x007a:
            byte[] r1 = new byte[r2]
            r3.readFully(r1, r7, r2)
            com.google.android.gms.internal.ads.zzkq r2 = r0.zzaqa
            com.google.android.gms.internal.ads.zzkf r3 = new com.google.android.gms.internal.ads.zzkf
            r3.<init>(r8, r1)
            r2.zzarm = r3
            return
        L_0x0089:
            com.google.android.gms.internal.ads.zzkq r1 = r0.zzaqa
            byte[] r4 = new byte[r2]
            r1.zzarl = r4
            com.google.android.gms.internal.ads.zzkq r1 = r0.zzaqa
            byte[] r1 = r1.zzarl
            r3.readFully(r1, r7, r2)
            return
        L_0x0097:
            int r4 = r0.zzaql
            r9 = 8
            if (r4 != 0) goto L_0x00bc
            com.google.android.gms.internal.ads.zzks r4 = r0.zzaoz
            long r10 = r4.zza(r3, r7, r8, r9)
            int r4 = (int) r10
            r0.zzaqr = r4
            com.google.android.gms.internal.ads.zzks r4 = r0.zzaoz
            int r4 = r4.zzgu()
            r0.zzaqs = r4
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.zzaqn = r10
            r0.zzaql = r8
            com.google.android.gms.internal.ads.zzpk r4 = r0.zzapo
            r4.reset()
        L_0x00bc:
            android.util.SparseArray<com.google.android.gms.internal.ads.zzkq> r4 = r0.zzapk
            int r10 = r0.zzaqr
            java.lang.Object r4 = r4.get(r10)
            com.google.android.gms.internal.ads.zzkq r4 = (com.google.android.gms.internal.ads.zzkq) r4
            if (r4 != 0) goto L_0x00d2
            int r1 = r0.zzaqs
            int r1 = r2 - r1
            r3.zzai(r1)
            r0.zzaql = r7
            return
        L_0x00d2:
            int r10 = r0.zzaql
            if (r10 != r8) goto L_0x028d
            r10 = 3
            r0.zzb(r3, r10)
            com.google.android.gms.internal.ads.zzpk r11 = r0.zzapo
            byte[] r11 = r11.data
            r12 = 2
            byte r11 = r11[r12]
            r11 = r11 & 6
            int r11 = r11 >> r8
            r13 = 255(0xff, float:3.57E-43)
            if (r11 != 0) goto L_0x00fa
            r0.zzaqp = r8
            int[] r6 = r0.zzaqq
            int[] r6 = zza((int[]) r6, (int) r8)
            r0.zzaqq = r6
            int r11 = r0.zzaqs
            int r2 = r2 - r11
            int r2 = r2 - r10
            r6[r7] = r2
            goto L_0x021a
        L_0x00fa:
            if (r1 != r5) goto L_0x0285
            r0.zzb(r3, r6)
            com.google.android.gms.internal.ads.zzpk r14 = r0.zzapo
            byte[] r14 = r14.data
            byte r14 = r14[r10]
            r14 = r14 & r13
            int r14 = r14 + r8
            r0.zzaqp = r14
            int[] r15 = r0.zzaqq
            int[] r14 = zza((int[]) r15, (int) r14)
            r0.zzaqq = r14
            if (r11 != r12) goto L_0x011f
            int r10 = r0.zzaqs
            int r2 = r2 - r10
            int r2 = r2 - r6
            int r6 = r0.zzaqp
            int r2 = r2 / r6
            java.util.Arrays.fill(r14, r7, r6, r2)
            goto L_0x021a
        L_0x011f:
            if (r11 != r8) goto L_0x0158
            r10 = 0
            r11 = 0
        L_0x0125:
            int r14 = r0.zzaqp
            int r15 = r14 + -1
            if (r10 >= r15) goto L_0x014c
            int[] r14 = r0.zzaqq
            r14[r10] = r7
        L_0x012f:
            int r6 = r6 + r8
            r0.zzb(r3, r6)
            com.google.android.gms.internal.ads.zzpk r14 = r0.zzapo
            byte[] r14 = r14.data
            int r15 = r6 + -1
            byte r14 = r14[r15]
            r14 = r14 & r13
            int[] r15 = r0.zzaqq
            r16 = r15[r10]
            int r16 = r16 + r14
            r15[r10] = r16
            if (r14 == r13) goto L_0x012f
            r14 = r15[r10]
            int r11 = r11 + r14
            int r10 = r10 + 1
            goto L_0x0125
        L_0x014c:
            int[] r10 = r0.zzaqq
            int r14 = r14 - r8
            int r15 = r0.zzaqs
            int r2 = r2 - r15
            int r2 = r2 - r6
            int r2 = r2 - r11
            r10[r14] = r2
            goto L_0x021a
        L_0x0158:
            if (r11 != r10) goto L_0x026c
            r10 = 0
            r11 = 0
        L_0x015e:
            int r14 = r0.zzaqp
            int r15 = r14 + -1
            if (r10 >= r15) goto L_0x020e
            int[] r14 = r0.zzaqq
            r14[r10] = r7
            int r6 = r6 + 1
            r0.zzb(r3, r6)
            com.google.android.gms.internal.ads.zzpk r14 = r0.zzapo
            byte[] r14 = r14.data
            int r15 = r6 + -1
            byte r14 = r14[r15]
            if (r14 == 0) goto L_0x0206
            r16 = 0
            r14 = 0
        L_0x017a:
            if (r14 >= r9) goto L_0x01d1
            int r18 = 7 - r14
            int r5 = r8 << r18
            com.google.android.gms.internal.ads.zzpk r12 = r0.zzapo
            byte[] r12 = r12.data
            byte r12 = r12[r15]
            r12 = r12 & r5
            if (r12 == 0) goto L_0x01c7
            int r6 = r6 + r14
            r0.zzb(r3, r6)
            com.google.android.gms.internal.ads.zzpk r12 = r0.zzapo
            byte[] r12 = r12.data
            int r16 = r15 + 1
            byte r12 = r12[r15]
            r12 = r12 & r13
            int r5 = ~r5
            r5 = r5 & r12
            long r7 = (long) r5
            r5 = r16
            r16 = r7
        L_0x019e:
            if (r5 >= r6) goto L_0x01b4
            long r7 = r16 << r9
            com.google.android.gms.internal.ads.zzpk r15 = r0.zzapo
            byte[] r15 = r15.data
            int r16 = r5 + 1
            byte r5 = r15[r5]
            r5 = r5 & r13
            long r12 = (long) r5
            long r7 = r7 | r12
            r5 = r16
            r13 = 255(0xff, float:3.57E-43)
            r16 = r7
            goto L_0x019e
        L_0x01b4:
            if (r10 <= 0) goto L_0x01c4
            int r14 = r14 * 7
            int r14 = r14 + 6
            r7 = 1
            long r12 = r7 << r14
            long r12 = r12 - r7
            long r16 = r16 - r12
            r7 = r16
            goto L_0x01d3
        L_0x01c4:
            r7 = r16
            goto L_0x01d3
        L_0x01c7:
            int r14 = r14 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r7 = 0
            r8 = 1
            r12 = 2
            r13 = 255(0xff, float:3.57E-43)
            goto L_0x017a
        L_0x01d1:
            r7 = r16
        L_0x01d3:
            r12 = -2147483648(0xffffffff80000000, double:NaN)
            int r5 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r5 < 0) goto L_0x01fe
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r5 > 0) goto L_0x01fe
            int r5 = (int) r7
            int[] r7 = r0.zzaqq
            if (r10 != 0) goto L_0x01e7
            goto L_0x01ec
        L_0x01e7:
            int r8 = r10 + -1
            r8 = r7[r8]
            int r5 = r5 + r8
        L_0x01ec:
            r7[r10] = r5
            int[] r5 = r0.zzaqq
            r5 = r5[r10]
            int r11 = r11 + r5
            int r10 = r10 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r7 = 0
            r8 = 1
            r12 = 2
            r13 = 255(0xff, float:3.57E-43)
            goto L_0x015e
        L_0x01fe:
            com.google.android.gms.internal.ads.zzhv r1 = new com.google.android.gms.internal.ads.zzhv
            java.lang.String r2 = "EBML lacing sample size out of range."
            r1.<init>(r2)
            throw r1
        L_0x0206:
            com.google.android.gms.internal.ads.zzhv r1 = new com.google.android.gms.internal.ads.zzhv
            java.lang.String r2 = "No valid varint length mask found"
            r1.<init>(r2)
            throw r1
        L_0x020e:
            int[] r5 = r0.zzaqq
            r7 = 1
            int r14 = r14 - r7
            int r7 = r0.zzaqs
            int r2 = r2 - r7
            int r2 = r2 - r6
            int r2 = r2 - r11
            r5[r14] = r2
        L_0x021a:
            com.google.android.gms.internal.ads.zzpk r2 = r0.zzapo
            byte[] r2 = r2.data
            r5 = 0
            byte r2 = r2[r5]
            int r2 = r2 << r9
            com.google.android.gms.internal.ads.zzpk r5 = r0.zzapo
            byte[] r5 = r5.data
            r6 = 1
            byte r5 = r5[r6]
            r6 = 255(0xff, float:3.57E-43)
            r5 = r5 & r6
            r2 = r2 | r5
            long r5 = r0.zzaqh
            long r7 = (long) r2
            long r7 = r0.zzea(r7)
            long r5 = r5 + r7
            r0.zzaqm = r5
            com.google.android.gms.internal.ads.zzpk r2 = r0.zzapo
            byte[] r2 = r2.data
            r5 = 2
            byte r2 = r2[r5]
            r2 = r2 & r9
            if (r2 != r9) goto L_0x0243
            r2 = 1
            goto L_0x0244
        L_0x0243:
            r2 = 0
        L_0x0244:
            int r6 = r4.type
            if (r6 == r5) goto L_0x025a
            r6 = 163(0xa3, float:2.28E-43)
            if (r1 != r6) goto L_0x0258
            com.google.android.gms.internal.ads.zzpk r6 = r0.zzapo
            byte[] r6 = r6.data
            byte r6 = r6[r5]
            r5 = 128(0x80, float:1.794E-43)
            r6 = r6 & r5
            if (r6 != r5) goto L_0x0258
            goto L_0x025a
        L_0x0258:
            r5 = 0
            goto L_0x025b
        L_0x025a:
            r5 = 1
        L_0x025b:
            if (r2 == 0) goto L_0x0261
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0262
        L_0x0261:
            r2 = 0
        L_0x0262:
            r2 = r2 | r5
            r0.zzaqt = r2
            r2 = 2
            r0.zzaql = r2
            r2 = 0
            r0.zzaqo = r2
            goto L_0x028d
        L_0x026c:
            com.google.android.gms.internal.ads.zzhv r1 = new com.google.android.gms.internal.ads.zzhv
            r2 = 36
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Unexpected lacing value: "
            r3.append(r2)
            r3.append(r11)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x0285:
            com.google.android.gms.internal.ads.zzhv r1 = new com.google.android.gms.internal.ads.zzhv
            java.lang.String r2 = "Lacing only supported in SimpleBlocks."
            r1.<init>(r2)
            throw r1
        L_0x028d:
            r2 = 163(0xa3, float:2.28E-43)
            if (r1 != r2) goto L_0x02b8
        L_0x0291:
            int r1 = r0.zzaqo
            int r2 = r0.zzaqp
            if (r1 >= r2) goto L_0x02b4
            int[] r2 = r0.zzaqq
            r1 = r2[r1]
            r0.zza((com.google.android.gms.internal.ads.zzjy) r3, (com.google.android.gms.internal.ads.zzkq) r4, (int) r1)
            long r1 = r0.zzaqm
            int r5 = r0.zzaqo
            int r6 = r4.zzarj
            int r5 = r5 * r6
            int r5 = r5 / 1000
            long r5 = (long) r5
            long r1 = r1 + r5
            r0.zza((com.google.android.gms.internal.ads.zzkq) r4, (long) r1)
            int r1 = r0.zzaqo
            r2 = 1
            int r1 = r1 + r2
            r0.zzaqo = r1
            goto L_0x0291
        L_0x02b4:
            r1 = 0
            r0.zzaql = r1
            return
        L_0x02b8:
            r1 = 0
            int[] r2 = r0.zzaqq
            r1 = r2[r1]
            r0.zza((com.google.android.gms.internal.ads.zzjy) r3, (com.google.android.gms.internal.ads.zzkq) r4, (int) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkl.zza(int, int, com.google.android.gms.internal.ads.zzjy):void");
    }

    private final void zza(zzkq zzkq, long j) {
        byte[] bArr;
        if ("S_TEXT/UTF8".equals(zzkq.zzari)) {
            byte[] bArr2 = this.zzaps.data;
            long j2 = this.zzaqn;
            if (j2 == -9223372036854775807L) {
                bArr = zzaph;
            } else {
                int i = (int) (j2 / 3600000000L);
                long j3 = j2 - (((long) i) * 3600000000L);
                int i2 = (int) (j3 / 60000000);
                long j4 = j3 - ((long) (60000000 * i2));
                int i3 = (int) (j4 / 1000000);
                bArr = zzpq.zzbk(String.format(Locale.US, "%02d:%02d:%02d,%03d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - ((long) (1000000 * i3))) / 1000))}));
            }
            System.arraycopy(bArr, 0, bArr2, 19, 12);
            zzkg zzkg = zzkq.zzasm;
            zzpk zzpk = this.zzaps;
            zzkg.zza(zzpk, zzpk.limit());
            this.zzarc += this.zzaps.limit();
        }
        zzkq.zzasm.zza(j, this.zzaqt, this.zzarc, 0, zzkq.zzarm);
        this.zzard = true;
        zzgs();
    }

    private final void zzgs() {
        this.zzaqu = 0;
        this.zzarc = 0;
        this.zzarb = 0;
        this.zzaqv = false;
        this.zzaqw = false;
        this.zzaqy = false;
        this.zzara = 0;
        this.zzaqz = 0;
        this.zzaqx = false;
        this.zzapr.reset();
    }

    private final void zzb(zzjy zzjy, int i) throws IOException, InterruptedException {
        if (this.zzapo.limit() < i) {
            if (this.zzapo.capacity() < i) {
                zzpk zzpk = this.zzapo;
                zzpk.zzc(Arrays.copyOf(zzpk.data, Math.max(this.zzapo.data.length << 1, i)), this.zzapo.limit());
            }
            zzjy.readFully(this.zzapo.data, this.zzapo.limit(), i - this.zzapo.limit());
            this.zzapo.zzbn(i);
        }
    }

    private final void zza(zzjy zzjy, zzkq zzkq, int i) throws IOException, InterruptedException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzkq.zzari)) {
            int length = zzapg.length + i;
            if (this.zzaps.capacity() < length) {
                this.zzaps.data = Arrays.copyOf(zzapg, length + i);
            }
            zzjy.readFully(this.zzaps.data, zzapg.length, i);
            this.zzaps.zzbo(0);
            this.zzaps.zzbn(length);
            return;
        }
        zzkg zzkg = zzkq.zzasm;
        if (!this.zzaqv) {
            if (zzkq.zzark) {
                this.zzaqt &= -1073741825;
                int i3 = 128;
                if (!this.zzaqw) {
                    zzjy.readFully(this.zzapo.data, 0, 1);
                    this.zzaqu++;
                    if ((this.zzapo.data[0] & 128) != 128) {
                        this.zzaqz = this.zzapo.data[0];
                        this.zzaqw = true;
                    } else {
                        throw new zzhv("Extension bit is set in signal byte");
                    }
                }
                byte b = this.zzaqz;
                if ((b & 1) == 1) {
                    boolean z = (b & 2) == 2;
                    this.zzaqt |= 1073741824;
                    if (!this.zzaqx) {
                        zzjy.readFully(this.zzapt.data, 0, 8);
                        this.zzaqu += 8;
                        this.zzaqx = true;
                        byte[] bArr = this.zzapo.data;
                        if (!z) {
                            i3 = 0;
                        }
                        bArr[0] = (byte) (i3 | 8);
                        this.zzapo.zzbo(0);
                        zzkg.zza(this.zzapo, 1);
                        this.zzarc++;
                        this.zzapt.zzbo(0);
                        zzkg.zza(this.zzapt, 8);
                        this.zzarc += 8;
                    }
                    if (z) {
                        if (!this.zzaqy) {
                            zzjy.readFully(this.zzapo.data, 0, 1);
                            this.zzaqu++;
                            this.zzapo.zzbo(0);
                            this.zzara = this.zzapo.readUnsignedByte();
                            this.zzaqy = true;
                        }
                        int i4 = this.zzara << 2;
                        this.zzapo.reset(i4);
                        zzjy.readFully(this.zzapo.data, 0, i4);
                        this.zzaqu += i4;
                        short s = (short) ((this.zzara / 2) + 1);
                        int i5 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.zzapv;
                        if (byteBuffer == null || byteBuffer.capacity() < i5) {
                            this.zzapv = ByteBuffer.allocate(i5);
                        }
                        this.zzapv.position(0);
                        this.zzapv.putShort(s);
                        int i6 = 0;
                        int i7 = 0;
                        while (true) {
                            i2 = this.zzara;
                            if (i6 >= i2) {
                                break;
                            }
                            int zzjd = this.zzapo.zzjd();
                            if (i6 % 2 == 0) {
                                this.zzapv.putShort((short) (zzjd - i7));
                            } else {
                                this.zzapv.putInt(zzjd - i7);
                            }
                            i6++;
                            i7 = zzjd;
                        }
                        int i8 = (i - this.zzaqu) - i7;
                        if (i2 % 2 == 1) {
                            this.zzapv.putInt(i8);
                        } else {
                            this.zzapv.putShort((short) i8);
                            this.zzapv.putInt(0);
                        }
                        this.zzapu.zzc(this.zzapv.array(), i5);
                        zzkg.zza(this.zzapu, i5);
                        this.zzarc += i5;
                    }
                }
            } else if (zzkq.zzarl != null) {
                this.zzapr.zzc(zzkq.zzarl, zzkq.zzarl.length);
            }
            this.zzaqv = true;
        }
        int limit = i + this.zzapr.limit();
        if (!"V_MPEG4/ISO/AVC".equals(zzkq.zzari) && !"V_MPEGH/ISO/HEVC".equals(zzkq.zzari)) {
            while (true) {
                int i9 = this.zzaqu;
                if (i9 >= limit) {
                    break;
                }
                zza(zzjy, zzkg, limit - i9);
            }
        } else {
            byte[] bArr2 = this.zzapn.data;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i10 = zzkq.zzasn;
            int i11 = 4 - zzkq.zzasn;
            while (this.zzaqu < limit) {
                int i12 = this.zzarb;
                if (i12 == 0) {
                    int min = Math.min(i10, this.zzapr.zziy());
                    zzjy.readFully(bArr2, i11 + min, i10 - min);
                    if (min > 0) {
                        this.zzapr.zze(bArr2, i11, min);
                    }
                    this.zzaqu += i10;
                    this.zzapn.zzbo(0);
                    this.zzarb = this.zzapn.zzjd();
                    this.zzapm.zzbo(0);
                    zzkg.zza(this.zzapm, 4);
                    this.zzarc += 4;
                } else {
                    this.zzarb = i12 - zza(zzjy, zzkg, i12);
                }
            }
        }
        if ("A_VORBIS".equals(zzkq.zzari)) {
            this.zzapp.zzbo(0);
            zzkg.zza(this.zzapp, 4);
            this.zzarc += 4;
        }
    }

    private final int zza(zzjy zzjy, zzkg zzkg, int i) throws IOException, InterruptedException {
        int i2;
        int zziy = this.zzapr.zziy();
        if (zziy > 0) {
            i2 = Math.min(i, zziy);
            zzkg.zza(this.zzapr, i2);
        } else {
            i2 = zzkg.zza(zzjy, i, false);
        }
        this.zzaqu += i2;
        this.zzarc += i2;
        return i2;
    }

    private final long zzea(long j) throws zzhv {
        long j2 = this.zzapy;
        if (j2 != -9223372036854775807L) {
            return zzpq.zza(j, j2, 1000);
        }
        throw new zzhv("Can't scale timecode prior to timecodeScale being set.");
    }

    private static int[] zza(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length << 1, i)];
    }
}
