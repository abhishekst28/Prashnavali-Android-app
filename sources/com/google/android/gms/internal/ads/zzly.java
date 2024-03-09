package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzly {
    private static final zzlr zzbct = zzlr.zzbb("OMX.google.raw.decoder");
    private static final Pattern zzbcu = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap<zza, List<zzlr>> zzbcv = new HashMap<>();
    private static final SparseIntArray zzbcw;
    private static final SparseIntArray zzbcx;
    private static final Map<String, Integer> zzbcy;
    private static int zzbcz = -1;

    public static zzlr zzhh() {
        return zzbct;
    }

    public static zzlr zzc(String str, boolean z) throws zzlz {
        List<zzlr> zzd = zzd(str, z);
        if (zzd.isEmpty()) {
            return null;
        }
        return zzd.get(0);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    static final class zza {
        public final String mimeType;
        public final boolean zzbbb;

        public zza(String str, boolean z) {
            this.mimeType = str;
            this.zzbbb = z;
        }

        public final int hashCode() {
            String str = this.mimeType;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.zzbbb ? 1231 : 1237);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != zza.class) {
                return false;
            }
            zza zza = (zza) obj;
            if (!TextUtils.equals(this.mimeType, zza.mimeType) || this.zzbbb != zza.zzbbb) {
                return false;
            }
            return true;
        }
    }

    private static synchronized List<zzlr> zzd(String str, boolean z) throws zzlz {
        synchronized (zzly.class) {
            zza zza2 = new zza(str, z);
            List<zzlr> list = zzbcv.get(zza2);
            if (list != null) {
                return list;
            }
            List<zzlr> zza3 = zza(zza2, zzpq.SDK_INT >= 21 ? new zzmd(z) : new zzma());
            if (z && zza3.isEmpty() && 21 <= zzpq.SDK_INT && zzpq.SDK_INT <= 23) {
                zza3 = zza(zza2, (zzmb) new zzma());
                if (!zza3.isEmpty()) {
                    String str2 = zza3.get(0).name;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            List<zzlr> unmodifiableList = Collections.unmodifiableList(zza3);
            zzbcv.put(zza2, unmodifiableList);
            return unmodifiableList;
        }
    }

    public static int zzhi() throws zzlz {
        if (zzbcz == -1) {
            int i = 0;
            zzlr zzc = zzc("video/avc", false);
            if (zzc != null) {
                MediaCodecInfo.CodecProfileLevel[] zzha = zzc.zzha();
                int length = zzha.length;
                int i2 = 0;
                while (i < length) {
                    int i3 = zzha[i].level;
                    int i4 = 9437184;
                    if (i3 == 1) {
                        i4 = 25344;
                    } else if (i3 != 2) {
                        switch (i3) {
                            case 8:
                                i4 = 101376;
                                break;
                            case 16:
                                i4 = 101376;
                                break;
                            case 32:
                                i4 = 101376;
                                break;
                            case 64:
                                i4 = 202752;
                                break;
                            case 128:
                                i4 = 414720;
                                break;
                            case 256:
                                i4 = 414720;
                                break;
                            case 512:
                                i4 = 921600;
                                break;
                            case 1024:
                                i4 = 1310720;
                                break;
                            case 2048:
                                i4 = 2097152;
                                break;
                            case 4096:
                                i4 = 2097152;
                                break;
                            case 8192:
                                i4 = 2228224;
                                break;
                            case 16384:
                                i4 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                break;
                            default:
                                i4 = -1;
                                break;
                        }
                    } else {
                        i4 = 25344;
                    }
                    i2 = Math.max(i4, i2);
                    i++;
                }
                i = Math.max(i2, zzpq.SDK_INT >= 21 ? 345600 : 172800);
            }
            zzbcz = i;
        }
        return zzbcz;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r3.equals("hev1") != false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> zzbe(java.lang.String r9) {
        /*
            r0 = 0
            if (r9 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "\\."
            java.lang.String[] r1 = r9.split(r1)
            r2 = 0
            r3 = r1[r2]
            r4 = -1
            int r5 = r3.hashCode()
            r6 = 3
            r7 = 2
            r8 = 1
            switch(r5) {
                case 3006243: goto L_0x0036;
                case 3006244: goto L_0x002c;
                case 3199032: goto L_0x0023;
                case 3214780: goto L_0x0019;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x0040
        L_0x0019:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0018
            r2 = 1
            goto L_0x0041
        L_0x0023:
            java.lang.String r5 = "hev1"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0018
            goto L_0x0041
        L_0x002c:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0018
            r2 = 3
            goto L_0x0041
        L_0x0036:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0018
            r2 = 2
            goto L_0x0041
        L_0x0040:
            r2 = -1
        L_0x0041:
            if (r2 == 0) goto L_0x004f
            if (r2 == r8) goto L_0x004f
            if (r2 == r7) goto L_0x004a
            if (r2 == r6) goto L_0x004a
            return r0
        L_0x004a:
            android.util.Pair r9 = zza((java.lang.String) r9, (java.lang.String[]) r1)
            return r9
        L_0x004f:
            int r2 = r1.length
            r3 = 4
            java.lang.String r4 = "Ignoring malformed HEVC codec string: "
            java.lang.String r5 = "MediaCodecUtil"
            if (r2 >= r3) goto L_0x0070
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r1 = r9.length()
            if (r1 == 0) goto L_0x0067
            java.lang.String r9 = r4.concat(r9)
            goto L_0x006c
        L_0x0067:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r4)
        L_0x006c:
            android.util.Log.w(r5, r9)
            return r0
        L_0x0070:
            java.util.regex.Pattern r2 = zzbcu
            r3 = r1[r8]
            java.util.regex.Matcher r2 = r2.matcher(r3)
            boolean r3 = r2.matches()
            if (r3 != 0) goto L_0x0096
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r1 = r9.length()
            if (r1 == 0) goto L_0x008d
            java.lang.String r9 = r4.concat(r9)
            goto L_0x0092
        L_0x008d:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r4)
        L_0x0092:
            android.util.Log.w(r5, r9)
            return r0
        L_0x0096:
            java.lang.String r9 = r2.group(r8)
            java.lang.String r3 = "1"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L_0x00a4
            r7 = 1
            goto L_0x00ad
        L_0x00a4:
            java.lang.String r3 = "2"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L_0x00e2
        L_0x00ad:
            java.util.Map<java.lang.String, java.lang.Integer> r9 = zzbcy
            r1 = r1[r6]
            java.lang.Object r9 = r9.get(r1)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 != 0) goto L_0x00d8
            java.lang.String r9 = "Unknown HEVC level string: "
            java.lang.String r1 = r2.group(r8)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            if (r2 == 0) goto L_0x00ce
            java.lang.String r9 = r9.concat(r1)
            goto L_0x00d4
        L_0x00ce:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r9)
            r9 = r1
        L_0x00d4:
            android.util.Log.w(r5, r9)
            return r0
        L_0x00d8:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0.<init>(r1, r9)
            return r0
        L_0x00e2:
            java.lang.String r1 = "Unknown HEVC profile string: "
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r2 = r9.length()
            if (r2 == 0) goto L_0x00f3
            java.lang.String r9 = r1.concat(r9)
            goto L_0x00f8
        L_0x00f3:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r1)
        L_0x00f8:
            android.util.Log.w(r5, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzly.zzbe(java.lang.String):android.util.Pair");
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x01ba A[Catch:{ Exception -> 0x02b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0241 A[SYNTHETIC, Splitter:B:156:0x0241] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x026b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x02af A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<com.google.android.gms.internal.ads.zzlr> zza(com.google.android.gms.internal.ads.zzly.zza r17, com.google.android.gms.internal.ads.zzmb r18) throws com.google.android.gms.internal.ads.zzlz {
        /*
            r1 = r17
            r2 = r18
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x02b8 }
            r3.<init>()     // Catch:{ Exception -> 0x02b8 }
            java.lang.String r4 = r1.mimeType     // Catch:{ Exception -> 0x02b8 }
            int r5 = r18.getCodecCount()     // Catch:{ Exception -> 0x02b8 }
            boolean r6 = r18.zzhj()     // Catch:{ Exception -> 0x02b8 }
            r8 = 0
        L_0x0014:
            if (r8 >= r5) goto L_0x02b7
            android.media.MediaCodecInfo r9 = r2.getCodecInfoAt(r8)     // Catch:{ Exception -> 0x02b8 }
            java.lang.String r10 = r9.getName()     // Catch:{ Exception -> 0x02b8 }
            boolean r0 = r9.isEncoder()     // Catch:{ Exception -> 0x02b8 }
            java.lang.String r11 = ".secure"
            if (r0 != 0) goto L_0x01b7
            if (r6 != 0) goto L_0x0031
            boolean r0 = r10.endsWith(r11)     // Catch:{ Exception -> 0x02b8 }
            if (r0 == 0) goto L_0x0031
            goto L_0x01b7
        L_0x0031:
            int r0 = com.google.android.gms.internal.ads.zzpq.SDK_INT     // Catch:{ Exception -> 0x02b8 }
            r13 = 21
            if (r0 >= r13) goto L_0x006a
            java.lang.String r0 = "CIPAACDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02b8 }
            if (r0 != 0) goto L_0x0067
            java.lang.String r0 = "CIPMP3Decoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02b8 }
            if (r0 != 0) goto L_0x0067
            java.lang.String r0 = "CIPVorbisDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02b8 }
            if (r0 != 0) goto L_0x0067
            java.lang.String r0 = "CIPAMRNBDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02b8 }
            if (r0 != 0) goto L_0x0067
            java.lang.String r0 = "AACDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02b8 }
            if (r0 != 0) goto L_0x0067
            java.lang.String r0 = "MP3Decoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02b8 }
            if (r0 == 0) goto L_0x006a
        L_0x0067:
            r0 = 0
            goto L_0x01b8
        L_0x006a:
            int r0 = com.google.android.gms.internal.ads.zzpq.SDK_INT     // Catch:{ Exception -> 0x02b8 }
            r13 = 18
            if (r0 >= r13) goto L_0x007b
            java.lang.String r0 = "OMX.SEC.MP3.Decoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02b8 }
            if (r0 == 0) goto L_0x007b
            r0 = 0
            goto L_0x01b8
        L_0x007b:
            int r0 = com.google.android.gms.internal.ads.zzpq.SDK_INT     // Catch:{ Exception -> 0x02b8 }
            if (r0 >= r13) goto L_0x0094
            java.lang.String r0 = "OMX.MTK.AUDIO.DECODER.AAC"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02b8 }
            if (r0 == 0) goto L_0x0094
            java.lang.String r0 = "a70"
            java.lang.String r13 = com.google.android.gms.internal.ads.zzpq.DEVICE     // Catch:{ Exception -> 0x02b8 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02b8 }
            if (r0 == 0) goto L_0x0094
            r0 = 0
            goto L_0x01b8
        L_0x0094:
            int r0 = com.google.android.gms.internal.ads.zzpq.SDK_INT     // Catch:{ Exception -> 0x02b8 }
            r13 = 16
            if (r0 != r13) goto L_0x011d
            java.lang.String r0 = "OMX.qcom.audio.decoder.mp3"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02b8 }
            if (r0 == 0) goto L_0x011d
            java.lang.String r0 = "dlxu"
            java.lang.String r14 = com.google.android.gms.internal.ads.zzpq.DEVICE     // Catch:{ Exception -> 0x02b8 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x02b8 }
            if (r0 != 0) goto L_0x011a
            java.lang.String r0 = "protou"
            java.lang.String r14 = com.google.android.gms.internal.ads.zzpq.DEVICE     // Catch:{ Exception -> 0x02b8 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x02b8 }
            if (r0 != 0) goto L_0x011a
            java.lang.String r0 = "ville"
            java.lang.String r14 = com.google.android.gms.internal.ads.zzpq.DEVICE     // Catch:{ Exception -> 0x02b8 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x02b8 }
            if (r0 != 0) goto L_0x011a
            java.lang.String r0 = "villeplus"
            java.lang.String r14 = com.google.android.gms.internal.ads.zzpq.DEVICE     // Catch:{ Exception -> 0x02b8 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x02b8 }
            if (r0 != 0) goto L_0x011a
            java.lang.String r0 = "villec2"
            java.lang.String r14 = com.google.android.gms.internal.ads.zzpq.DEVICE     // Catch:{ Exception -> 0x02b8 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x02b8 }
            if (r0 != 0) goto L_0x011a
            java.lang.String r0 = com.google.android.gms.internal.ads.zzpq.DEVICE     // Catch:{ Exception -> 0x02b8 }
            java.lang.String r14 = "gee"
            boolean r0 = r0.startsWith(r14)     // Catch:{ Exception -> 0x02b8 }
            if (r0 != 0) goto L_0x011a
            java.lang.String r0 = "C6602"
            java.lang.String r14 = com.google.android.gms.internal.ads.zzpq.DEVICE     // Catch:{ Exception -> 0x02b8 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x02b8 }
            if (r0 != 0) goto L_0x011a
            java.lang.String r0 = "C6603"
            java.lang.String r14 = com.google.android.gms.internal.ads.zzpq.DEVICE     // Catch:{ Exception -> 0x02b8 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x02b8 }
            if (r0 != 0) goto L_0x011a
            java.lang.String r0 = "C6606"
            java.lang.String r14 = com.google.android.gms.internal.ads.zzpq.DEVICE     // Catch:{ Exception -> 0x02b8 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x02b8 }
            if (r0 != 0) goto L_0x011a
            java.lang.String r0 = "C6616"
            java.lang.String r14 = com.google.android.gms.internal.ads.zzpq.DEVICE     // Catch:{ Exception -> 0x02b8 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x02b8 }
            if (r0 != 0) goto L_0x011a
            java.lang.String r0 = "L36h"
            java.lang.String r14 = com.google.android.gms.internal.ads.zzpq.DEVICE     // Catch:{ Exception -> 0x02b8 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x02b8 }
            if (r0 != 0) goto L_0x011a
            java.lang.String r0 = "SO-02E"
            java.lang.String r14 = com.google.android.gms.internal.ads.zzpq.DEVICE     // Catch:{ Exception -> 0x02b8 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x02b8 }
            if (r0 == 0) goto L_0x011d
        L_0x011a:
            r0 = 0
            goto L_0x01b8
        L_0x011d:
            int r0 = com.google.android.gms.internal.ads.zzpq.SDK_INT     // Catch:{ Exception -> 0x02b8 }
            if (r0 != r13) goto L_0x0153
            java.lang.String r0 = "OMX.qcom.audio.decoder.aac"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02b8 }
            if (r0 == 0) goto L_0x0153
            java.lang.String r0 = "C1504"
            java.lang.String r13 = com.google.android.gms.internal.ads.zzpq.DEVICE     // Catch:{ Exception -> 0x02b8 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02b8 }
            if (r0 != 0) goto L_0x0151
            java.lang.String r0 = "C1505"
            java.lang.String r13 = com.google.android.gms.internal.ads.zzpq.DEVICE     // Catch:{ Exception -> 0x02b8 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02b8 }
            if (r0 != 0) goto L_0x0151
            java.lang.String r0 = "C1604"
            java.lang.String r13 = com.google.android.gms.internal.ads.zzpq.DEVICE     // Catch:{ Exception -> 0x02b8 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02b8 }
            if (r0 != 0) goto L_0x0151
            java.lang.String r0 = "C1605"
            java.lang.String r13 = com.google.android.gms.internal.ads.zzpq.DEVICE     // Catch:{ Exception -> 0x02b8 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02b8 }
            if (r0 == 0) goto L_0x0153
        L_0x0151:
            r0 = 0
            goto L_0x01b8
        L_0x0153:
            int r0 = com.google.android.gms.internal.ads.zzpq.SDK_INT     // Catch:{ Exception -> 0x02b8 }
            java.lang.String r13 = "jflte"
            r14 = 19
            if (r0 > r14) goto L_0x019f
            java.lang.String r0 = "OMX.SEC.vp8.dec"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02b8 }
            if (r0 == 0) goto L_0x019f
            java.lang.String r0 = "samsung"
            java.lang.String r15 = com.google.android.gms.internal.ads.zzpq.MANUFACTURER     // Catch:{ Exception -> 0x02b8 }
            boolean r0 = r0.equals(r15)     // Catch:{ Exception -> 0x02b8 }
            if (r0 == 0) goto L_0x019f
            java.lang.String r0 = com.google.android.gms.internal.ads.zzpq.DEVICE     // Catch:{ Exception -> 0x02b8 }
            java.lang.String r15 = "d2"
            boolean r0 = r0.startsWith(r15)     // Catch:{ Exception -> 0x02b8 }
            if (r0 != 0) goto L_0x019d
            java.lang.String r0 = com.google.android.gms.internal.ads.zzpq.DEVICE     // Catch:{ Exception -> 0x02b8 }
            java.lang.String r15 = "serrano"
            boolean r0 = r0.startsWith(r15)     // Catch:{ Exception -> 0x02b8 }
            if (r0 != 0) goto L_0x019d
            java.lang.String r0 = com.google.android.gms.internal.ads.zzpq.DEVICE     // Catch:{ Exception -> 0x02b8 }
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x02b8 }
            if (r0 != 0) goto L_0x019d
            java.lang.String r0 = com.google.android.gms.internal.ads.zzpq.DEVICE     // Catch:{ Exception -> 0x02b8 }
            java.lang.String r15 = "santos"
            boolean r0 = r0.startsWith(r15)     // Catch:{ Exception -> 0x02b8 }
            if (r0 != 0) goto L_0x019d
            java.lang.String r0 = com.google.android.gms.internal.ads.zzpq.DEVICE     // Catch:{ Exception -> 0x02b8 }
            java.lang.String r15 = "t0"
            boolean r0 = r0.startsWith(r15)     // Catch:{ Exception -> 0x02b8 }
            if (r0 == 0) goto L_0x019f
        L_0x019d:
            r0 = 0
            goto L_0x01b8
        L_0x019f:
            int r0 = com.google.android.gms.internal.ads.zzpq.SDK_INT     // Catch:{ Exception -> 0x02b8 }
            if (r0 > r14) goto L_0x01b5
            java.lang.String r0 = com.google.android.gms.internal.ads.zzpq.DEVICE     // Catch:{ Exception -> 0x02b8 }
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x02b8 }
            if (r0 == 0) goto L_0x01b5
            java.lang.String r0 = "OMX.qcom.video.decoder.vp8"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02b8 }
            if (r0 == 0) goto L_0x01b5
            r0 = 0
            goto L_0x01b8
        L_0x01b5:
            r0 = 1
            goto L_0x01b8
        L_0x01b7:
            r0 = 0
        L_0x01b8:
            if (r0 == 0) goto L_0x02ad
            java.lang.String[] r13 = r9.getSupportedTypes()     // Catch:{ Exception -> 0x02b8 }
            int r14 = r13.length     // Catch:{ Exception -> 0x02b8 }
            r15 = 0
        L_0x01c0:
            if (r15 >= r14) goto L_0x02aa
            r12 = r13[r15]     // Catch:{ Exception -> 0x02b8 }
            boolean r0 = r12.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x02b8 }
            if (r0 == 0) goto L_0x02a0
            android.media.MediaCodecInfo$CodecCapabilities r0 = r9.getCapabilitiesForType(r12)     // Catch:{ Exception -> 0x0235 }
            boolean r7 = r2.zza(r4, r0)     // Catch:{ Exception -> 0x0235 }
            int r2 = com.google.android.gms.internal.ads.zzpq.SDK_INT     // Catch:{ Exception -> 0x0235 }
            r16 = r5
            r5 = 22
            if (r2 > r5) goto L_0x0203
            java.lang.String r2 = com.google.android.gms.internal.ads.zzpq.MODEL     // Catch:{ Exception -> 0x0201 }
            java.lang.String r5 = "ODROID-XU3"
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x0201 }
            if (r2 != 0) goto L_0x01ef
            java.lang.String r2 = com.google.android.gms.internal.ads.zzpq.MODEL     // Catch:{ Exception -> 0x0201 }
            java.lang.String r5 = "Nexus 10"
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x0201 }
            if (r2 == 0) goto L_0x0203
        L_0x01ef:
            java.lang.String r2 = "OMX.Exynos.AVC.Decoder"
            boolean r2 = r2.equals(r10)     // Catch:{ Exception -> 0x0201 }
            if (r2 != 0) goto L_0x01ff
            java.lang.String r2 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r2 = r2.equals(r10)     // Catch:{ Exception -> 0x0201 }
            if (r2 == 0) goto L_0x0203
        L_0x01ff:
            r2 = 1
            goto L_0x0204
        L_0x0201:
            r0 = move-exception
            goto L_0x0238
        L_0x0203:
            r2 = 0
        L_0x0204:
            if (r6 == 0) goto L_0x020b
            boolean r5 = r1.zzbbb     // Catch:{ Exception -> 0x0201 }
            if (r5 == r7) goto L_0x0211
        L_0x020b:
            if (r6 != 0) goto L_0x021b
            boolean r5 = r1.zzbbb     // Catch:{ Exception -> 0x0201 }
            if (r5 != 0) goto L_0x021b
        L_0x0211:
            r5 = 0
            com.google.android.gms.internal.ads.zzlr r0 = com.google.android.gms.internal.ads.zzlr.zza(r10, r4, r0, r2, r5)     // Catch:{ Exception -> 0x0201 }
            r3.add(r0)     // Catch:{ Exception -> 0x0201 }
            goto L_0x02a2
        L_0x021b:
            r5 = 0
            if (r6 != 0) goto L_0x0233
            if (r7 == 0) goto L_0x0233
            java.lang.String r7 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x0201 }
            java.lang.String r7 = r7.concat(r11)     // Catch:{ Exception -> 0x0201 }
            r5 = 1
            com.google.android.gms.internal.ads.zzlr r0 = com.google.android.gms.internal.ads.zzlr.zza(r7, r4, r0, r2, r5)     // Catch:{ Exception -> 0x0231 }
            r3.add(r0)     // Catch:{ Exception -> 0x0231 }
            return r3
        L_0x0231:
            r0 = move-exception
            goto L_0x0239
        L_0x0233:
            r5 = 1
            goto L_0x02a2
        L_0x0235:
            r0 = move-exception
            r16 = r5
        L_0x0238:
            r5 = 1
        L_0x0239:
            int r2 = com.google.android.gms.internal.ads.zzpq.SDK_INT     // Catch:{ Exception -> 0x02b8 }
            r7 = 23
            java.lang.String r5 = "MediaCodecUtil"
            if (r2 > r7) goto L_0x026b
            boolean r2 = r3.isEmpty()     // Catch:{ Exception -> 0x02b8 }
            if (r2 != 0) goto L_0x026b
            java.lang.String r0 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x02b8 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x02b8 }
            int r0 = r0 + 46
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02b8 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x02b8 }
            java.lang.String r0 = "Skipping codec "
            r2.append(r0)     // Catch:{ Exception -> 0x02b8 }
            r2.append(r10)     // Catch:{ Exception -> 0x02b8 }
            java.lang.String r0 = " (failed to query capabilities)"
            r2.append(r0)     // Catch:{ Exception -> 0x02b8 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x02b8 }
            android.util.Log.e(r5, r0)     // Catch:{ Exception -> 0x02b8 }
            goto L_0x02a2
        L_0x026b:
            java.lang.String r1 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x02b8 }
            int r1 = r1.length()     // Catch:{ Exception -> 0x02b8 }
            int r1 = r1 + 25
            java.lang.String r2 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x02b8 }
            int r2 = r2.length()     // Catch:{ Exception -> 0x02b8 }
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02b8 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x02b8 }
            java.lang.String r1 = "Failed to query codec "
            r2.append(r1)     // Catch:{ Exception -> 0x02b8 }
            r2.append(r10)     // Catch:{ Exception -> 0x02b8 }
            java.lang.String r1 = " ("
            r2.append(r1)     // Catch:{ Exception -> 0x02b8 }
            r2.append(r12)     // Catch:{ Exception -> 0x02b8 }
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch:{ Exception -> 0x02b8 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x02b8 }
            android.util.Log.e(r5, r1)     // Catch:{ Exception -> 0x02b8 }
            throw r0     // Catch:{ Exception -> 0x02b8 }
        L_0x02a0:
            r16 = r5
        L_0x02a2:
            int r15 = r15 + 1
            r2 = r18
            r5 = r16
            goto L_0x01c0
        L_0x02aa:
            r16 = r5
            goto L_0x02af
        L_0x02ad:
            r16 = r5
        L_0x02af:
            int r8 = r8 + 1
            r2 = r18
            r5 = r16
            goto L_0x0014
        L_0x02b7:
            return r3
        L_0x02b8:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzlz r1 = new com.google.android.gms.internal.ads.zzlz
            r2 = 0
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzly.zza(com.google.android.gms.internal.ads.zzly$zza, com.google.android.gms.internal.ads.zzmb):java.util.List");
    }

    private static Pair<Integer, Integer> zza(String str, String[] strArr) {
        Integer num;
        Integer num2;
        if (strArr.length < 2) {
            String valueOf = String.valueOf(str);
            Log.w("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                num2 = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                num = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
            } else if (strArr.length >= 3) {
                Integer valueOf2 = Integer.valueOf(Integer.parseInt(strArr[1]));
                num = Integer.valueOf(Integer.parseInt(strArr[2]));
                num2 = valueOf2;
            } else {
                String valueOf3 = String.valueOf(str);
                Log.w("MediaCodecUtil", valueOf3.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf3) : new String("Ignoring malformed AVC codec string: "));
                return null;
            }
            Integer valueOf4 = Integer.valueOf(zzbcw.get(num2.intValue()));
            if (valueOf4 == null) {
                String valueOf5 = String.valueOf(num2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf5).length() + 21);
                sb.append("Unknown AVC profile: ");
                sb.append(valueOf5);
                Log.w("MediaCodecUtil", sb.toString());
                return null;
            }
            Integer valueOf6 = Integer.valueOf(zzbcx.get(num.intValue()));
            if (valueOf6 != null) {
                return new Pair<>(valueOf4, valueOf6);
            }
            String valueOf7 = String.valueOf(num);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf7).length() + 19);
            sb2.append("Unknown AVC level: ");
            sb2.append(valueOf7);
            Log.w("MediaCodecUtil", sb2.toString());
            return null;
        } catch (NumberFormatException e) {
            String valueOf8 = String.valueOf(str);
            Log.w("MediaCodecUtil", valueOf8.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf8) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        zzbcw = sparseIntArray;
        sparseIntArray.put(66, 1);
        zzbcw.put(77, 2);
        zzbcw.put(88, 4);
        zzbcw.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        zzbcx = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        zzbcx.put(11, 4);
        zzbcx.put(12, 8);
        zzbcx.put(13, 16);
        zzbcx.put(20, 32);
        zzbcx.put(21, 64);
        zzbcx.put(22, 128);
        zzbcx.put(30, 256);
        zzbcx.put(31, 512);
        zzbcx.put(32, 1024);
        zzbcx.put(40, 2048);
        zzbcx.put(41, 4096);
        zzbcx.put(42, 8192);
        zzbcx.put(50, 16384);
        zzbcx.put(51, 32768);
        zzbcx.put(52, 65536);
        HashMap hashMap = new HashMap();
        zzbcy = hashMap;
        hashMap.put("L30", 1);
        zzbcy.put("L60", 4);
        zzbcy.put("L63", 16);
        zzbcy.put("L90", 64);
        zzbcy.put("L93", 256);
        zzbcy.put("L120", 1024);
        zzbcy.put("L123", 4096);
        zzbcy.put("L150", 16384);
        zzbcy.put("L153", 65536);
        zzbcy.put("L156", 262144);
        zzbcy.put("L180", 1048576);
        zzbcy.put("L183", 4194304);
        zzbcy.put("L186", 16777216);
        zzbcy.put("H30", 2);
        zzbcy.put("H60", 8);
        zzbcy.put("H63", 32);
        zzbcy.put("H90", 128);
        zzbcy.put("H93", 512);
        zzbcy.put("H120", 2048);
        zzbcy.put("H123", 8192);
        zzbcy.put("H150", 32768);
        zzbcy.put("H153", 131072);
        zzbcy.put("H156", 524288);
        zzbcy.put("H180", 2097152);
        zzbcy.put("H183", 8388608);
        zzbcy.put("H186", 33554432);
    }
}