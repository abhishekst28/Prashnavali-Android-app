package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbfc extends zzbev {
    private static final Set<String> zzeld = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzele = new DecimalFormat("#,###");
    private File zzcz;
    private boolean zzelf;

    public zzbfc(zzbde zzbde) {
        super(zzbde);
        File cacheDir = this.mContext.getCacheDir();
        if (cacheDir == null) {
            zzaxy.zzfe("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.zzcz = file;
        if (!file.isDirectory() && !this.zzcz.mkdirs()) {
            String valueOf = String.valueOf(this.zzcz.getAbsolutePath());
            zzaxy.zzfe(valueOf.length() != 0 ? "Could not create preload cache directory at ".concat(valueOf) : new String("Could not create preload cache directory at "));
            this.zzcz = null;
        } else if (!this.zzcz.setReadable(true, false) || !this.zzcz.setExecutable(true, false)) {
            String valueOf2 = String.valueOf(this.zzcz.getAbsolutePath());
            zzaxy.zzfe(valueOf2.length() != 0 ? "Could not set cache file permissions at ".concat(valueOf2) : new String("Could not set cache file permissions at "));
            this.zzcz = null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v29, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v30, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01fe, code lost:
        if ((r5 instanceof java.net.HttpURLConnection) == false) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r1 = r5.getResponseCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0209, code lost:
        if (r1 < 400) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x020b, code lost:
        r15 = "badUrl";
        r2 = java.lang.String.valueOf(java.lang.Integer.toString(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x021b, code lost:
        if (r2.length() == 0) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x021d, code lost:
        r2 = "HTTP request failed. Code: ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0223, code lost:
        r2 = new java.lang.String("HTTP request failed. Code: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 32);
        r4.append("HTTP status code ");
        r4.append(r1);
        r4.append(" at ");
        r4.append(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0250, code lost:
        throw new java.io.IOException(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0251, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0254, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
        r7 = r5.getContentLength();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x025a, code lost:
        if (r7 >= 0) goto L_0x0285;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        r1 = java.lang.String.valueOf(r31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0266, code lost:
        if (r1.length() == 0) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0268, code lost:
        r0 = "Stream cache aborted, missing content-length header at ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x026d, code lost:
        r0 = new java.lang.String("Stream cache aborted, missing content-length header at ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0273, code lost:
        com.google.android.gms.internal.ads.zzaxy.zzfe(r0);
        zza(r9, r12.getAbsolutePath(), "contentLengthMissing", (java.lang.String) null);
        zzeld.remove(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0284, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
        r1 = zzele.format((long) r7);
        r3 = ((java.lang.Integer) com.google.android.gms.internal.ads.zzwe.zzpu().zzd(com.google.android.gms.internal.ads.zzaat.zzclx)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x029c, code lost:
        if (r7 <= r3) goto L_0x02f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
        r2 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 33) + java.lang.String.valueOf(r31).length());
        r2.append("Content length ");
        r2.append(r1);
        r2.append(" exceeds limit at ");
        r2.append(r9);
        com.google.android.gms.internal.ads.zzaxy.zzfe(r2.toString());
        r1 = java.lang.String.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02d7, code lost:
        if (r1.length() == 0) goto L_0x02de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02d9, code lost:
        r0 = "File too big for full file cache. Size: ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02de, code lost:
        r0 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02e4, code lost:
        zza(r9, r12.getAbsolutePath(), "sizeExceeded", r0);
        zzeld.remove(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02f2, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:?, code lost:
        r4 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 20) + java.lang.String.valueOf(r31).length());
        r4.append("Caching ");
        r4.append(r1);
        r4.append(" bytes from ");
        r4.append(r9);
        com.google.android.gms.internal.ads.zzaxy.zzef(r4.toString());
        r5 = java.nio.channels.Channels.newChannel(r5.getInputStream());
        r4 = new java.io.FileOutputStream(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        r2 = r4.getChannel();
        r1 = java.nio.ByteBuffer.allocate(1048576);
        r16 = com.google.android.gms.ads.internal.zzp.zzkw();
        r17 = r16.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x034d, code lost:
        r10 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
        r6 = new com.google.android.gms.internal.ads.zzbaj(((java.lang.Long) com.google.android.gms.internal.ads.zzwe.zzpu().zzd(com.google.android.gms.internal.ads.zzaat.zzcma)).longValue());
        r13 = ((java.lang.Long) com.google.android.gms.internal.ads.zzwe.zzpu().zzd(com.google.android.gms.internal.ads.zzaat.zzclz)).longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0367, code lost:
        r20 = r5.read(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x036b, code lost:
        if (r20 < 0) goto L_0x04a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x036d, code lost:
        r11 = r11 + r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x036f, code lost:
        if (r11 <= r3) goto L_0x03a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0371, code lost:
        r15 = "sizeExceeded";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
        r1 = java.lang.String.valueOf(java.lang.Integer.toString(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0381, code lost:
        if (r1.length() == 0) goto L_0x0389;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0383, code lost:
        r1 = "File too big for full file cache. Size: ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0389, code lost:
        r1 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0395, code lost:
        throw new java.io.IOException("stream cache file size limit exceeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0396, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0399, code lost:
        r3 = r0;
        r2 = r1;
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x039d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03a0, code lost:
        r3 = r0;
        r1 = r10;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03a3, code lost:
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:?, code lost:
        r1.flip();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03ad, code lost:
        if (r2.write(r1) > 0) goto L_0x047f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03af, code lost:
        r1.clear();
        r24 = ((r16.currentTimeMillis() - r17) > (1000 * r13) ? 1 : ((r16.currentTimeMillis() - r17) == (1000 * r13) ? 0 : -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03be, code lost:
        if (r24 > 0) goto L_0x043a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03c0, code lost:
        r20 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03c4, code lost:
        if (r8.zzelf != false) goto L_0x042a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03ca, code lost:
        if (r6.tryAcquire() == false) goto L_0x0404;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03cc, code lost:
        r21 = r12.getAbsolutePath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03d2, code lost:
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03d4, code lost:
        r24 = r24;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03d6, code lost:
        r24 = r10;
        r10 = com.google.android.gms.internal.ads.zzbat.zzaah;
        r1 = r1;
        r25 = r2;
        r26 = r3;
        r27 = r4;
        r4 = r21;
        r21 = r5;
        r19 = r6;
        r29 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03f4, code lost:
        r24 = r24;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:?, code lost:
        r1 = new com.google.android.gms.internal.ads.zzbeu(r30, r31, r4, r11, r7, false);
        r10.post(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03fb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03fd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03fe, code lost:
        r27 = r4;
        r3 = r0;
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0404, code lost:
        r25 = r2;
        r26 = r3;
        r27 = r4;
        r21 = r5;
        r19 = r6;
        r29 = r7;
        r24 = r10;
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0416, code lost:
        r6 = r19;
        r1 = r20;
        r5 = r21;
        r15 = r22;
        r10 = r24;
        r2 = r25;
        r3 = r26;
        r4 = r27;
        r7 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x042a, code lost:
        r27 = r4;
        r24 = r10;
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0439, code lost:
        throw new java.io.IOException("abort requested");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x043a, code lost:
        r27 = r4;
        r24 = r10;
        r22 = r15;
        r15 = "downloadTimeout";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:?, code lost:
        r0 = java.lang.Long.toString(r13);
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 29);
        r2.append("Timeout exceeded. Limit: ");
        r2.append(r0);
        r2.append(" sec");
        r10 = r2.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x046d, code lost:
        throw new java.io.IOException("stream cache time limit exceeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x046e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0471, code lost:
        r3 = r0;
        r2 = r10;
        r1 = r24;
        r10 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0479, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x047c, code lost:
        r3 = r0;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x047f, code lost:
        r20 = r1;
        r25 = r2;
        r26 = r3;
        r27 = r4;
        r21 = r5;
        r19 = r6;
        r29 = r7;
        r24 = r10;
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0495, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0498, code lost:
        r27 = r4;
        r22 = r15;
        r3 = r0;
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x04a0, code lost:
        r27 = r4;
        r24 = r10;
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:?, code lost:
        r27.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04af, code lost:
        if (com.google.android.gms.internal.ads.zzaxy.isLoggable(3) == false) goto L_0x04f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04b1, code lost:
        r24 = r24;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:?, code lost:
        r1 = zzele.format((long) r11);
        r3 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 22) + java.lang.String.valueOf(r31).length());
        r3.append("Preloaded ");
        r3.append(r1);
        r3.append(" bytes from ");
        r3.append(r9);
        com.google.android.gms.internal.ads.zzaxy.zzef(r3.toString());
        r24 = r24;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04e8, code lost:
        r0 = e;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x04ea, code lost:
        r0 = e;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:?, code lost:
        r12.setReadable(true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04fb, code lost:
        if (r0.isFile() == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04fd, code lost:
        r24 = r24;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:?, code lost:
        r0.setLastModified(java.lang.System.currentTimeMillis());
        r24 = r24;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0505, code lost:
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:?, code lost:
        r0.createNewFile();
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x051e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0521, code lost:
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0527, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x052a, code lost:
        r27 = r4;
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x052e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0531, code lost:
        r27 = r4;
        r1 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0534, code lost:
        r22 = r15;
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x053b, code lost:
        r1 = r14;
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0545, code lost:
        throw new java.io.IOException("Invalid protocol.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0546, code lost:
        r1 = r14;
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0550, code lost:
        throw new java.io.IOException("Too many redirects (20)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0551, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0554, code lost:
        r3 = r0;
        r15 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0558, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x055b, code lost:
        r1 = r14;
        r22 = r15;
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x055f, code lost:
        r2 = null;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0565, code lost:
        com.google.android.gms.ads.internal.zzp.zzkt().zza(r3, "VideoStreamFullFileCache.preload");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0579, code lost:
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 26);
        r3.append("Preload aborted for URL \"");
        r3.append(r9);
        r3.append("\"");
        com.google.android.gms.internal.ads.zzaxy.zzfd(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x059d, code lost:
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 25);
        r4.append("Preload failed for URL \"");
        r4.append(r9);
        r4.append("\"");
        com.google.android.gms.internal.ads.zzaxy.zzd(r4.toString(), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x05dc, code lost:
        r0 = "Could not delete partial cache file at ".concat(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x05e1, code lost:
        r0 = new java.lang.String("Could not delete partial cache file at ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0416, code lost:
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0138, code lost:
        r15 = "error";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        com.google.android.gms.ads.internal.zzp.zzlb();
        r1 = ((java.lang.Integer) com.google.android.gms.internal.ads.zzwe.zzpu().zzd(com.google.android.gms.internal.ads.zzaat.zzcmb)).intValue();
        r2 = new java.net.URL(r9);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0156, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0159, code lost:
        if (r3 > 20) goto L_0x0546;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015b, code lost:
        r5 = r2.openConnection();
        r5.setConnectTimeout(r1);
        r5.setReadTimeout(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0167, code lost:
        if ((r5 instanceof java.net.HttpURLConnection) == false) goto L_0x053b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0169, code lost:
        r5 = (java.net.HttpURLConnection) r5;
        r6 = new com.google.android.gms.internal.ads.zzbax();
        r6.zza(r5, (byte[]) null);
        r5.setInstanceFollowRedirects(false);
        r7 = r5.getResponseCode();
        r6.zza(r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0180, code lost:
        if ((r7 / 100) != 3) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r4 = r5.getHeaderField("Location");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0188, code lost:
        if (r4 == null) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x018a, code lost:
        r6 = new java.net.URL(r2, r4);
        r2 = r6.getProtocol();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0193, code lost:
        if (r2 == null) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x019b, code lost:
        if (r2.equals("http") != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a3, code lost:
        if (r2.equals("https") != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a5, code lost:
        r2 = java.lang.String.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b1, code lost:
        if (r2.length() == 0) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b3, code lost:
        r1 = "Unsupported scheme: ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b8, code lost:
        r1 = new java.lang.String("Unsupported scheme: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c1, code lost:
        throw new java.io.IOException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01c2, code lost:
        r4 = java.lang.String.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01cc, code lost:
        if (r4.length() == 0) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01ce, code lost:
        r2 = "Redirecting to ".concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01d3, code lost:
        r2 = new java.lang.String("Redirecting to ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01d9, code lost:
        com.google.android.gms.internal.ads.zzaxy.zzef(r2);
        r5.disconnect();
        r2 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01e9, code lost:
        throw new java.io.IOException("Protocol is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01f1, code lost:
        throw new java.io.IOException("Missing Location header in redirect");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01f2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01f5, code lost:
        r3 = r0;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01f7, code lost:
        r1 = r14;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x04e8 A[ExcHandler: RuntimeException (e java.lang.RuntimeException), PHI: r22 r24 r27 
      PHI: (r22v8 java.lang.String) = (r22v4 java.lang.String), (r22v4 java.lang.String), (r22v4 java.lang.String), (r22v4 java.lang.String), (r22v4 java.lang.String), (r22v4 java.lang.String), (r22v16 java.lang.String), (r22v16 java.lang.String) binds: [B:218:0x0505, B:219:?, B:216:0x04fd, B:217:?, B:206:0x04b1, B:207:?, B:174:0x03d4, B:177:0x03f4] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r24v4 java.lang.String) = (r24v13 java.lang.String), (r24v14 java.lang.String), (r24v16 java.lang.String), (r24v18 java.lang.String), (r24v20 java.lang.String), (r24v22 java.lang.String), (r24v27 java.lang.String), (r24v30 java.lang.String) binds: [B:218:0x0505, B:219:?, B:216:0x04fd, B:217:?, B:206:0x04b1, B:207:?, B:174:0x03d4, B:177:0x03f4] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r27v10 java.io.FileOutputStream) = (r27v5 java.io.FileOutputStream), (r27v5 java.io.FileOutputStream), (r27v5 java.io.FileOutputStream), (r27v5 java.io.FileOutputStream), (r27v5 java.io.FileOutputStream), (r27v5 java.io.FileOutputStream), (r27v12 java.io.FileOutputStream), (r27v19 java.io.FileOutputStream) binds: [B:218:0x0505, B:219:?, B:216:0x04fd, B:217:?, B:206:0x04b1, B:207:?, B:174:0x03d4, B:177:0x03f4] A[DONT_GENERATE, DONT_INLINE], Splitter:B:177:0x03f4] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0565  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0579  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x059d  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x05dc  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x05e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzfn(java.lang.String r31) {
        /*
            r30 = this;
            r8 = r30
            r9 = r31
            java.io.File r0 = r8.zzcz
            r10 = 0
            r11 = 0
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "noCacheDir"
            r8.zza(r9, r10, r0, r10)
            return r11
        L_0x0010:
            java.io.File r0 = r8.zzcz
            if (r0 != 0) goto L_0x0017
            r3 = 0
            goto L_0x0035
        L_0x0017:
            java.io.File[] r0 = r0.listFiles()
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x001f:
            if (r2 >= r1) goto L_0x0034
            r4 = r0[r2]
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = ".done"
            boolean r4 = r4.endsWith(r5)
            if (r4 != 0) goto L_0x0031
            int r3 = r3 + 1
        L_0x0031:
            int r2 = r2 + 1
            goto L_0x001f
        L_0x0034:
        L_0x0035:
            com.google.android.gms.internal.ads.zzaai<java.lang.Integer> r0 = com.google.android.gms.internal.ads.zzaat.zzclw
            com.google.android.gms.internal.ads.zzaap r1 = com.google.android.gms.internal.ads.zzwe.zzpu()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r3 <= r0) goto L_0x009f
            java.io.File r0 = r8.zzcz
            if (r0 != 0) goto L_0x004e
            r0 = 0
            goto L_0x0092
        L_0x004e:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.io.File[] r0 = r0.listFiles()
            int r3 = r0.length
            r5 = r10
            r4 = 0
        L_0x005b:
            if (r4 >= r3) goto L_0x0079
            r6 = r0[r4]
            java.lang.String r7 = r6.getName()
            java.lang.String r12 = ".done"
            boolean r7 = r7.endsWith(r12)
            if (r7 != 0) goto L_0x0076
            long r12 = r6.lastModified()
            int r7 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r7 >= 0) goto L_0x0076
            r5 = r6
            r1 = r12
        L_0x0076:
            int r4 = r4 + 1
            goto L_0x005b
        L_0x0079:
            if (r5 == 0) goto L_0x0090
            boolean r0 = r5.delete()
            java.io.File r1 = r8.zzd(r5)
            boolean r2 = r1.isFile()
            if (r2 == 0) goto L_0x0091
            boolean r1 = r1.delete()
            r0 = r0 & r1
            goto L_0x0091
        L_0x0090:
            r0 = 0
        L_0x0091:
        L_0x0092:
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "Unable to expire stream cache"
            com.google.android.gms.internal.ads.zzaxy.zzfe(r0)
            java.lang.String r0 = "expireFailed"
            r8.zza(r9, r10, r0, r10)
            return r11
        L_0x009f:
            java.lang.String r0 = r30.zzfo(r31)
            java.io.File r12 = new java.io.File
            java.io.File r1 = r8.zzcz
            r12.<init>(r1, r0)
            java.io.File r0 = r8.zzd(r12)
            boolean r1 = r12.isFile()
            r13 = 1
            if (r1 == 0) goto L_0x00e2
            boolean r1 = r0.isFile()
            if (r1 == 0) goto L_0x00e2
            long r0 = r12.length()
            int r1 = (int) r0
            java.lang.String r0 = "Stream cache hit at "
            java.lang.String r2 = java.lang.String.valueOf(r31)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x00d1
            java.lang.String r0 = r0.concat(r2)
            goto L_0x00d7
        L_0x00d1:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0)
            r0 = r2
        L_0x00d7:
            com.google.android.gms.internal.ads.zzaxy.zzef(r0)
            java.lang.String r0 = r12.getAbsolutePath()
            r8.zza((java.lang.String) r9, (java.lang.String) r0, (int) r1)
            return r13
        L_0x00e2:
            java.io.File r1 = r8.zzcz
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = java.lang.String.valueOf(r31)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x00fc
            java.lang.String r1 = r1.concat(r2)
            r14 = r1
            goto L_0x0102
        L_0x00fc:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r14 = r2
        L_0x0102:
            java.util.Set<java.lang.String> r1 = zzeld
            monitor-enter(r1)
            java.util.Set<java.lang.String> r2 = zzeld     // Catch:{ all -> 0x05f8 }
            boolean r2 = r2.contains(r14)     // Catch:{ all -> 0x05f8 }
            if (r2 == 0) goto L_0x0132
            java.lang.String r0 = "Stream cache already in progress at "
            java.lang.String r2 = java.lang.String.valueOf(r31)     // Catch:{ all -> 0x05f8 }
            int r3 = r2.length()     // Catch:{ all -> 0x05f8 }
            if (r3 == 0) goto L_0x011e
            java.lang.String r0 = r0.concat(r2)     // Catch:{ all -> 0x05f8 }
            goto L_0x0124
        L_0x011e:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x05f8 }
            r2.<init>(r0)     // Catch:{ all -> 0x05f8 }
            r0 = r2
        L_0x0124:
            com.google.android.gms.internal.ads.zzaxy.zzfe(r0)     // Catch:{ all -> 0x05f8 }
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ all -> 0x05f8 }
            java.lang.String r2 = "inProgress"
            r8.zza(r9, r0, r2, r10)     // Catch:{ all -> 0x05f8 }
            monitor-exit(r1)     // Catch:{ all -> 0x05f8 }
            return r11
        L_0x0132:
            java.util.Set<java.lang.String> r2 = zzeld     // Catch:{ all -> 0x05f8 }
            r2.add(r14)     // Catch:{ all -> 0x05f8 }
            monitor-exit(r1)     // Catch:{ all -> 0x05f8 }
            java.lang.String r15 = "error"
            com.google.android.gms.ads.internal.zzp.zzlb()     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            com.google.android.gms.internal.ads.zzaai<java.lang.Integer> r1 = com.google.android.gms.internal.ads.zzaat.zzcmb     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            com.google.android.gms.internal.ads.zzaap r2 = com.google.android.gms.internal.ads.zzwe.zzpu()     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            java.lang.Object r1 = r2.zzd(r1)     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            int r1 = r1.intValue()     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            r2.<init>(r9)     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            r3 = 0
        L_0x0156:
            int r3 = r3 + r13
            r4 = 20
            if (r3 > r4) goto L_0x0546
            java.net.URLConnection r5 = r2.openConnection()     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            r5.setConnectTimeout(r1)     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            r5.setReadTimeout(r1)     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            boolean r6 = r5 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            if (r6 == 0) goto L_0x053b
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            com.google.android.gms.internal.ads.zzbax r6 = new com.google.android.gms.internal.ads.zzbax     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            r6.<init>()     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            r6.zza((java.net.HttpURLConnection) r5, (byte[]) r10)     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            r5.setInstanceFollowRedirects(r11)     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            int r7 = r5.getResponseCode()     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            r6.zza((java.net.HttpURLConnection) r5, (int) r7)     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            int r7 = r7 / 100
            r6 = 3
            if (r7 != r6) goto L_0x01fa
            java.lang.String r4 = "Location"
            java.lang.String r4 = r5.getHeaderField(r4)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            if (r4 == 0) goto L_0x01ea
            java.net.URL r6 = new java.net.URL     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            r6.<init>(r2, r4)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            java.lang.String r2 = r6.getProtocol()     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            if (r2 == 0) goto L_0x01e2
            java.lang.String r7 = "http"
            boolean r7 = r2.equals(r7)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            if (r7 != 0) goto L_0x01c2
            java.lang.String r7 = "https"
            boolean r7 = r2.equals(r7)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            if (r7 != 0) goto L_0x01c2
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            java.lang.String r1 = "Unsupported scheme: "
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            int r3 = r2.length()     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            if (r3 == 0) goto L_0x01b8
            java.lang.String r1 = r1.concat(r2)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            goto L_0x01be
        L_0x01b8:
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            r1 = r2
        L_0x01be:
            r0.<init>(r1)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            throw r0     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
        L_0x01c2:
            java.lang.String r2 = "Redirecting to "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            int r7 = r4.length()     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            if (r7 == 0) goto L_0x01d3
            java.lang.String r2 = r2.concat(r4)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            goto L_0x01d9
        L_0x01d3:
            java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            r4.<init>(r2)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            r2 = r4
        L_0x01d9:
            com.google.android.gms.internal.ads.zzaxy.zzef(r2)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            r5.disconnect()     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            r2 = r6
            goto L_0x0156
        L_0x01e2:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            java.lang.String r1 = "Protocol is null"
            r0.<init>(r1)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            throw r0     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
        L_0x01ea:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            java.lang.String r1 = "Missing Location header in redirect"
            r0.<init>(r1)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            throw r0     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
        L_0x01f2:
            r0 = move-exception
            goto L_0x01f5
        L_0x01f4:
            r0 = move-exception
        L_0x01f5:
            r3 = r0
            r2 = r10
        L_0x01f7:
            r1 = r14
            goto L_0x0561
        L_0x01fa:
            boolean r1 = r5 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            if (r1 == 0) goto L_0x0256
            r1 = r5
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            int r1 = r1.getResponseCode()     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            r2 = 400(0x190, float:5.6E-43)
            if (r1 < r2) goto L_0x0256
            java.lang.String r15 = "badUrl"
            java.lang.String r0 = "HTTP request failed. Code: "
            java.lang.String r2 = java.lang.Integer.toString(r1)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            int r3 = r2.length()     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            if (r3 == 0) goto L_0x0223
            java.lang.String r0 = r0.concat(r2)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            r2 = r0
            goto L_0x0228
        L_0x0223:
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
        L_0x0228:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0253, RuntimeException -> 0x0251 }
            java.lang.String r3 = java.lang.String.valueOf(r31)     // Catch:{ IOException -> 0x0253, RuntimeException -> 0x0251 }
            int r3 = r3.length()     // Catch:{ IOException -> 0x0253, RuntimeException -> 0x0251 }
            int r3 = r3 + 32
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0253, RuntimeException -> 0x0251 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0253, RuntimeException -> 0x0251 }
            java.lang.String r3 = "HTTP status code "
            r4.append(r3)     // Catch:{ IOException -> 0x0253, RuntimeException -> 0x0251 }
            r4.append(r1)     // Catch:{ IOException -> 0x0253, RuntimeException -> 0x0251 }
            java.lang.String r1 = " at "
            r4.append(r1)     // Catch:{ IOException -> 0x0253, RuntimeException -> 0x0251 }
            r4.append(r9)     // Catch:{ IOException -> 0x0253, RuntimeException -> 0x0251 }
            java.lang.String r1 = r4.toString()     // Catch:{ IOException -> 0x0253, RuntimeException -> 0x0251 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0253, RuntimeException -> 0x0251 }
            throw r0     // Catch:{ IOException -> 0x0253, RuntimeException -> 0x0251 }
        L_0x0251:
            r0 = move-exception
            goto L_0x0254
        L_0x0253:
            r0 = move-exception
        L_0x0254:
            r3 = r0
            goto L_0x01f7
        L_0x0256:
            int r7 = r5.getContentLength()     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            if (r7 >= 0) goto L_0x0285
            java.lang.String r0 = "Stream cache aborted, missing content-length header at "
            java.lang.String r1 = java.lang.String.valueOf(r31)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            int r2 = r1.length()     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            if (r2 == 0) goto L_0x026d
            java.lang.String r0 = r0.concat(r1)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            goto L_0x0273
        L_0x026d:
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            r0 = r1
        L_0x0273:
            com.google.android.gms.internal.ads.zzaxy.zzfe(r0)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            java.lang.String r1 = "contentLengthMissing"
            r8.zza(r9, r0, r1, r10)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            java.util.Set<java.lang.String> r0 = zzeld     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            r0.remove(r14)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            return r11
        L_0x0285:
            java.text.DecimalFormat r1 = zzele     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            long r2 = (long) r7     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            java.lang.String r1 = r1.format(r2)     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            com.google.android.gms.internal.ads.zzaai<java.lang.Integer> r2 = com.google.android.gms.internal.ads.zzaat.zzclx     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            com.google.android.gms.internal.ads.zzaap r3 = com.google.android.gms.internal.ads.zzwe.zzpu()     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            java.lang.Object r2 = r3.zzd(r2)     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            int r3 = r2.intValue()     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            if (r7 <= r3) goto L_0x02f3
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            int r0 = r0.length()     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            int r0 = r0 + 33
            java.lang.String r2 = java.lang.String.valueOf(r31)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            int r2 = r2.length()     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            int r0 = r0 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            java.lang.String r0 = "Content length "
            r2.append(r0)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            r2.append(r1)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            java.lang.String r0 = " exceeds limit at "
            r2.append(r0)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            r2.append(r9)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            com.google.android.gms.internal.ads.zzaxy.zzfe(r0)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            java.lang.String r0 = "File too big for full file cache. Size: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            int r2 = r1.length()     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            if (r2 == 0) goto L_0x02de
            java.lang.String r0 = r0.concat(r1)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            goto L_0x02e4
        L_0x02de:
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            r0 = r1
        L_0x02e4:
            java.lang.String r1 = r12.getAbsolutePath()     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            java.lang.String r2 = "sizeExceeded"
            r8.zza(r9, r1, r2, r0)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            java.util.Set<java.lang.String> r0 = zzeld     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            r0.remove(r14)     // Catch:{ IOException -> 0x01f4, RuntimeException -> 0x01f2 }
            return r11
        L_0x02f3:
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            int r2 = r2.length()     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            int r2 = r2 + r4
            java.lang.String r4 = java.lang.String.valueOf(r31)     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            int r4 = r4.length()     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            int r2 = r2 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            r4.<init>(r2)     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            java.lang.String r2 = "Caching "
            r4.append(r2)     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            r4.append(r1)     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            java.lang.String r1 = " bytes from "
            r4.append(r1)     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            r4.append(r9)     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            java.lang.String r1 = r4.toString()     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            com.google.android.gms.internal.ads.zzaxy.zzef(r1)     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            java.io.InputStream r1 = r5.getInputStream()     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            java.nio.channels.ReadableByteChannel r5 = java.nio.channels.Channels.newChannel(r1)     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            r4.<init>(r12)     // Catch:{ IOException -> 0x055a, RuntimeException -> 0x0558 }
            java.nio.channels.FileChannel r2 = r4.getChannel()     // Catch:{ IOException -> 0x0530, RuntimeException -> 0x052e }
            r1 = 1048576(0x100000, float:1.469368E-39)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)     // Catch:{ IOException -> 0x0530, RuntimeException -> 0x052e }
            com.google.android.gms.common.util.Clock r16 = com.google.android.gms.ads.internal.zzp.zzkw()     // Catch:{ IOException -> 0x0530, RuntimeException -> 0x052e }
            long r17 = r16.currentTimeMillis()     // Catch:{ IOException -> 0x0530, RuntimeException -> 0x052e }
            com.google.android.gms.internal.ads.zzaai<java.lang.Long> r6 = com.google.android.gms.internal.ads.zzaat.zzcma     // Catch:{ IOException -> 0x0530, RuntimeException -> 0x052e }
            com.google.android.gms.internal.ads.zzaap r10 = com.google.android.gms.internal.ads.zzwe.zzpu()     // Catch:{ IOException -> 0x0530, RuntimeException -> 0x052e }
            java.lang.Object r6 = r10.zzd(r6)     // Catch:{ IOException -> 0x0530, RuntimeException -> 0x052e }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ IOException -> 0x0530, RuntimeException -> 0x052e }
            r10 = r14
            long r13 = r6.longValue()     // Catch:{ IOException -> 0x0529, RuntimeException -> 0x0527 }
            com.google.android.gms.internal.ads.zzbaj r6 = new com.google.android.gms.internal.ads.zzbaj     // Catch:{ IOException -> 0x0529, RuntimeException -> 0x0527 }
            r6.<init>(r13)     // Catch:{ IOException -> 0x0529, RuntimeException -> 0x0527 }
            com.google.android.gms.internal.ads.zzaai<java.lang.Long> r13 = com.google.android.gms.internal.ads.zzaat.zzclz     // Catch:{ IOException -> 0x0529, RuntimeException -> 0x0527 }
            com.google.android.gms.internal.ads.zzaap r14 = com.google.android.gms.internal.ads.zzwe.zzpu()     // Catch:{ IOException -> 0x0529, RuntimeException -> 0x0527 }
            java.lang.Object r13 = r14.zzd(r13)     // Catch:{ IOException -> 0x0529, RuntimeException -> 0x0527 }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ IOException -> 0x0529, RuntimeException -> 0x0527 }
            long r13 = r13.longValue()     // Catch:{ IOException -> 0x0529, RuntimeException -> 0x0527 }
        L_0x0367:
            int r20 = r5.read(r1)     // Catch:{ IOException -> 0x0529, RuntimeException -> 0x0527 }
            if (r20 < 0) goto L_0x04a0
            int r11 = r11 + r20
            if (r11 <= r3) goto L_0x03a6
            java.lang.String r15 = "sizeExceeded"
            java.lang.String r0 = "File too big for full file cache. Size: "
            java.lang.String r1 = java.lang.Integer.toString(r11)     // Catch:{ IOException -> 0x039f, RuntimeException -> 0x039d }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x039f, RuntimeException -> 0x039d }
            int r2 = r1.length()     // Catch:{ IOException -> 0x039f, RuntimeException -> 0x039d }
            if (r2 == 0) goto L_0x0389
            java.lang.String r0 = r0.concat(r1)     // Catch:{ IOException -> 0x039f, RuntimeException -> 0x039d }
            r1 = r0
            goto L_0x038e
        L_0x0389:
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x039f, RuntimeException -> 0x039d }
            r1.<init>(r0)     // Catch:{ IOException -> 0x039f, RuntimeException -> 0x039d }
        L_0x038e:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0398, RuntimeException -> 0x0396 }
            java.lang.String r2 = "stream cache file size limit exceeded"
            r0.<init>(r2)     // Catch:{ IOException -> 0x0398, RuntimeException -> 0x0396 }
            throw r0     // Catch:{ IOException -> 0x0398, RuntimeException -> 0x0396 }
        L_0x0396:
            r0 = move-exception
            goto L_0x0399
        L_0x0398:
            r0 = move-exception
        L_0x0399:
            r3 = r0
            r2 = r1
            r1 = r10
            goto L_0x03a3
        L_0x039d:
            r0 = move-exception
            goto L_0x03a0
        L_0x039f:
            r0 = move-exception
        L_0x03a0:
            r3 = r0
            r1 = r10
            r2 = 0
        L_0x03a3:
            r10 = r4
            goto L_0x0561
        L_0x03a6:
            r1.flip()     // Catch:{ IOException -> 0x0497, RuntimeException -> 0x0495 }
        L_0x03a9:
            int r20 = r2.write(r1)     // Catch:{ IOException -> 0x0497, RuntimeException -> 0x0495 }
            if (r20 > 0) goto L_0x047f
            r1.clear()     // Catch:{ IOException -> 0x0497, RuntimeException -> 0x0495 }
            long r20 = r16.currentTimeMillis()     // Catch:{ IOException -> 0x0497, RuntimeException -> 0x0495 }
            long r20 = r20 - r17
            r22 = 1000(0x3e8, double:4.94E-321)
            long r22 = r22 * r13
            int r24 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r24 > 0) goto L_0x043a
            r20 = r1
            boolean r1 = r8.zzelf     // Catch:{ IOException -> 0x0497, RuntimeException -> 0x0495 }
            if (r1 != 0) goto L_0x042a
            boolean r1 = r6.tryAcquire()     // Catch:{ IOException -> 0x0497, RuntimeException -> 0x0495 }
            if (r1 == 0) goto L_0x0404
            java.lang.String r21 = r12.getAbsolutePath()     // Catch:{ IOException -> 0x0497, RuntimeException -> 0x0495 }
            android.os.Handler r1 = com.google.android.gms.internal.ads.zzbat.zzaah     // Catch:{ IOException -> 0x0497, RuntimeException -> 0x0495 }
            r22 = r15
            com.google.android.gms.internal.ads.zzbeu r15 = new com.google.android.gms.internal.ads.zzbeu     // Catch:{ IOException -> 0x03fd, RuntimeException -> 0x03fb }
            r23 = 0
            r24 = r10
            r10 = r1
            r1 = r15
            r25 = r2
            r2 = r30
            r26 = r3
            r3 = r31
            r27 = r4
            r4 = r21
            r21 = r5
            r5 = r11
            r19 = r6
            r28 = 3
            r6 = r7
            r29 = r7
            r7 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x04ea, RuntimeException -> 0x04e8 }
            r10.post(r15)     // Catch:{ IOException -> 0x04ea, RuntimeException -> 0x04e8 }
            goto L_0x0416
        L_0x03fb:
            r0 = move-exception
            goto L_0x03fe
        L_0x03fd:
            r0 = move-exception
        L_0x03fe:
            r27 = r4
            r3 = r0
            r1 = r10
            goto L_0x0524
        L_0x0404:
            r25 = r2
            r26 = r3
            r27 = r4
            r21 = r5
            r19 = r6
            r29 = r7
            r24 = r10
            r22 = r15
            r28 = 3
        L_0x0416:
            r6 = r19
            r1 = r20
            r5 = r21
            r15 = r22
            r10 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r7 = r29
            goto L_0x0367
        L_0x042a:
            r27 = r4
            r24 = r10
            r22 = r15
            java.lang.String r15 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x047b, RuntimeException -> 0x0479 }
            java.lang.String r1 = "abort requested"
            r0.<init>(r1)     // Catch:{ IOException -> 0x047b, RuntimeException -> 0x0479 }
            throw r0     // Catch:{ IOException -> 0x047b, RuntimeException -> 0x0479 }
        L_0x043a:
            r27 = r4
            r24 = r10
            r22 = r15
            java.lang.String r15 = "downloadTimeout"
            java.lang.String r0 = java.lang.Long.toString(r13)     // Catch:{ IOException -> 0x047b, RuntimeException -> 0x0479 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x047b, RuntimeException -> 0x0479 }
            int r1 = r1.length()     // Catch:{ IOException -> 0x047b, RuntimeException -> 0x0479 }
            int r1 = r1 + 29
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x047b, RuntimeException -> 0x0479 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x047b, RuntimeException -> 0x0479 }
            java.lang.String r1 = "Timeout exceeded. Limit: "
            r2.append(r1)     // Catch:{ IOException -> 0x047b, RuntimeException -> 0x0479 }
            r2.append(r0)     // Catch:{ IOException -> 0x047b, RuntimeException -> 0x0479 }
            java.lang.String r0 = " sec"
            r2.append(r0)     // Catch:{ IOException -> 0x047b, RuntimeException -> 0x0479 }
            java.lang.String r10 = r2.toString()     // Catch:{ IOException -> 0x047b, RuntimeException -> 0x0479 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0470, RuntimeException -> 0x046e }
            java.lang.String r1 = "stream cache time limit exceeded"
            r0.<init>(r1)     // Catch:{ IOException -> 0x0470, RuntimeException -> 0x046e }
            throw r0     // Catch:{ IOException -> 0x0470, RuntimeException -> 0x046e }
        L_0x046e:
            r0 = move-exception
            goto L_0x0471
        L_0x0470:
            r0 = move-exception
        L_0x0471:
            r3 = r0
            r2 = r10
            r1 = r24
            r10 = r27
            goto L_0x0561
        L_0x0479:
            r0 = move-exception
            goto L_0x047c
        L_0x047b:
            r0 = move-exception
        L_0x047c:
            r3 = r0
            goto L_0x04ee
        L_0x047f:
            r20 = r1
            r25 = r2
            r26 = r3
            r27 = r4
            r21 = r5
            r19 = r6
            r29 = r7
            r24 = r10
            r22 = r15
            r28 = 3
            goto L_0x03a9
        L_0x0495:
            r0 = move-exception
            goto L_0x0498
        L_0x0497:
            r0 = move-exception
        L_0x0498:
            r27 = r4
            r22 = r15
            r3 = r0
            r1 = r10
            goto L_0x0537
        L_0x04a0:
            r27 = r4
            r24 = r10
            r22 = r15
            r28 = 3
            r27.close()     // Catch:{ IOException -> 0x0520, RuntimeException -> 0x051e }
            boolean r1 = com.google.android.gms.internal.ads.zzaxy.isLoggable(r28)     // Catch:{ IOException -> 0x0520, RuntimeException -> 0x051e }
            if (r1 == 0) goto L_0x04f1
            java.text.DecimalFormat r1 = zzele     // Catch:{ IOException -> 0x04ea, RuntimeException -> 0x04e8 }
            long r2 = (long) r11     // Catch:{ IOException -> 0x04ea, RuntimeException -> 0x04e8 }
            java.lang.String r1 = r1.format(r2)     // Catch:{ IOException -> 0x04ea, RuntimeException -> 0x04e8 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x04ea, RuntimeException -> 0x04e8 }
            int r2 = r2.length()     // Catch:{ IOException -> 0x04ea, RuntimeException -> 0x04e8 }
            int r2 = r2 + 22
            java.lang.String r3 = java.lang.String.valueOf(r31)     // Catch:{ IOException -> 0x04ea, RuntimeException -> 0x04e8 }
            int r3 = r3.length()     // Catch:{ IOException -> 0x04ea, RuntimeException -> 0x04e8 }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x04ea, RuntimeException -> 0x04e8 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x04ea, RuntimeException -> 0x04e8 }
            java.lang.String r2 = "Preloaded "
            r3.append(r2)     // Catch:{ IOException -> 0x04ea, RuntimeException -> 0x04e8 }
            r3.append(r1)     // Catch:{ IOException -> 0x04ea, RuntimeException -> 0x04e8 }
            java.lang.String r1 = " bytes from "
            r3.append(r1)     // Catch:{ IOException -> 0x04ea, RuntimeException -> 0x04e8 }
            r3.append(r9)     // Catch:{ IOException -> 0x04ea, RuntimeException -> 0x04e8 }
            java.lang.String r1 = r3.toString()     // Catch:{ IOException -> 0x04ea, RuntimeException -> 0x04e8 }
            com.google.android.gms.internal.ads.zzaxy.zzef(r1)     // Catch:{ IOException -> 0x04ea, RuntimeException -> 0x04e8 }
            goto L_0x04f1
        L_0x04e8:
            r0 = move-exception
            goto L_0x04eb
        L_0x04ea:
            r0 = move-exception
        L_0x04eb:
            r3 = r0
            r15 = r22
        L_0x04ee:
            r1 = r24
            goto L_0x0537
        L_0x04f1:
            r1 = 1
            r2 = 0
            r12.setReadable(r1, r2)     // Catch:{ IOException -> 0x0520, RuntimeException -> 0x051e }
            boolean r1 = r0.isFile()     // Catch:{ IOException -> 0x0520, RuntimeException -> 0x051e }
            if (r1 == 0) goto L_0x0505
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x04ea, RuntimeException -> 0x04e8 }
            r0.setLastModified(r1)     // Catch:{ IOException -> 0x04ea, RuntimeException -> 0x04e8 }
            goto L_0x050a
        L_0x0505:
            r0.createNewFile()     // Catch:{ IOException -> 0x0509, RuntimeException -> 0x04e8 }
            goto L_0x050a
        L_0x0509:
            r0 = move-exception
        L_0x050a:
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ IOException -> 0x0520, RuntimeException -> 0x051e }
            r8.zza((java.lang.String) r9, (java.lang.String) r0, (int) r11)     // Catch:{ IOException -> 0x0520, RuntimeException -> 0x051e }
            java.util.Set<java.lang.String> r0 = zzeld     // Catch:{ IOException -> 0x0520, RuntimeException -> 0x051e }
            r1 = r24
            r0.remove(r1)     // Catch:{ IOException -> 0x051c, RuntimeException -> 0x051a }
            r1 = 1
            return r1
        L_0x051a:
            r0 = move-exception
            goto L_0x0523
        L_0x051c:
            r0 = move-exception
            goto L_0x0523
        L_0x051e:
            r0 = move-exception
            goto L_0x0521
        L_0x0520:
            r0 = move-exception
        L_0x0521:
            r1 = r24
        L_0x0523:
            r3 = r0
        L_0x0524:
            r15 = r22
            goto L_0x0537
        L_0x0527:
            r0 = move-exception
            goto L_0x052a
        L_0x0529:
            r0 = move-exception
        L_0x052a:
            r27 = r4
            r1 = r10
            goto L_0x0534
        L_0x052e:
            r0 = move-exception
            goto L_0x0531
        L_0x0530:
            r0 = move-exception
        L_0x0531:
            r27 = r4
            r1 = r14
        L_0x0534:
            r22 = r15
            r3 = r0
        L_0x0537:
            r10 = r27
            r2 = 0
            goto L_0x0561
        L_0x053b:
            r1 = r14
            r22 = r15
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0553, RuntimeException -> 0x0551 }
            java.lang.String r2 = "Invalid protocol."
            r0.<init>(r2)     // Catch:{ IOException -> 0x0553, RuntimeException -> 0x0551 }
            throw r0     // Catch:{ IOException -> 0x0553, RuntimeException -> 0x0551 }
        L_0x0546:
            r1 = r14
            r22 = r15
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0553, RuntimeException -> 0x0551 }
            java.lang.String r2 = "Too many redirects (20)"
            r0.<init>(r2)     // Catch:{ IOException -> 0x0553, RuntimeException -> 0x0551 }
            throw r0     // Catch:{ IOException -> 0x0553, RuntimeException -> 0x0551 }
        L_0x0551:
            r0 = move-exception
            goto L_0x0554
        L_0x0553:
            r0 = move-exception
        L_0x0554:
            r3 = r0
            r15 = r22
            goto L_0x055f
        L_0x0558:
            r0 = move-exception
            goto L_0x055b
        L_0x055a:
            r0 = move-exception
        L_0x055b:
            r1 = r14
            r22 = r15
            r3 = r0
        L_0x055f:
            r2 = 0
            r10 = 0
        L_0x0561:
            boolean r0 = r3 instanceof java.lang.RuntimeException
            if (r0 == 0) goto L_0x056e
            com.google.android.gms.internal.ads.zzaxk r0 = com.google.android.gms.ads.internal.zzp.zzkt()
            java.lang.String r4 = "VideoStreamFullFileCache.preload"
            r0.zza(r3, r4)
        L_0x056e:
            r10.close()     // Catch:{ IOException -> 0x0574, NullPointerException -> 0x0572 }
            goto L_0x0575
        L_0x0572:
            r0 = move-exception
            goto L_0x0575
        L_0x0574:
            r0 = move-exception
        L_0x0575:
            boolean r0 = r8.zzelf
            if (r0 == 0) goto L_0x059d
            java.lang.String r0 = java.lang.String.valueOf(r31)
            int r0 = r0.length()
            int r0 = r0 + 26
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.lang.String r0 = "Preload aborted for URL \""
            r3.append(r0)
            r3.append(r9)
            java.lang.String r0 = "\""
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.google.android.gms.internal.ads.zzaxy.zzfd(r0)
            goto L_0x05c0
        L_0x059d:
            java.lang.String r0 = java.lang.String.valueOf(r31)
            int r0 = r0.length()
            int r0 = r0 + 25
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            java.lang.String r0 = "Preload failed for URL \""
            r4.append(r0)
            r4.append(r9)
            java.lang.String r0 = "\""
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.google.android.gms.internal.ads.zzaxy.zzd(r0, r3)
        L_0x05c0:
            boolean r0 = r12.exists()
            if (r0 == 0) goto L_0x05ea
            boolean r0 = r12.delete()
            if (r0 != 0) goto L_0x05ea
            java.lang.String r0 = "Could not delete partial cache file at "
            java.lang.String r3 = r12.getAbsolutePath()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            if (r4 == 0) goto L_0x05e1
            java.lang.String r0 = r0.concat(r3)
            goto L_0x05e7
        L_0x05e1:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
            r0 = r3
        L_0x05e7:
            com.google.android.gms.internal.ads.zzaxy.zzfe(r0)
        L_0x05ea:
            java.lang.String r0 = r12.getAbsolutePath()
            r8.zza(r9, r0, r15, r2)
            java.util.Set<java.lang.String> r0 = zzeld
            r0.remove(r1)
            r1 = 0
            return r1
        L_0x05f8:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x05f8 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbfc.zzfn(java.lang.String):boolean");
    }

    public final void abort() {
        this.zzelf = true;
    }

    private final File zzd(File file) {
        return new File(this.zzcz, String.valueOf(file.getName()).concat(".done"));
    }
}
