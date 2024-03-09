package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzav implements zzk {
    private final Map<String, zzax> zzci;
    private long zzcj;
    private final zzaz zzck;
    private final int zzcl;

    public zzav(File file, int i) {
        this.zzci = new LinkedHashMap(16, 0.75f, true);
        this.zzcj = 0;
        this.zzck = new zzay(this, file);
        this.zzcl = 20971520;
    }

    private zzav(zzaz zzaz, int i) {
        this.zzci = new LinkedHashMap(16, 0.75f, true);
        this.zzcj = 0;
        this.zzck = zzaz;
        this.zzcl = 5242880;
    }

    public zzav(zzaz zzaz) {
        this(zzaz, 5242880);
    }

    public final synchronized zzn zzb(String str) {
        zzba zzba;
        zzax zzax = this.zzci.get(str);
        if (zzax == null) {
            return null;
        }
        File zzf = zzf(str);
        try {
            zzba = new zzba(new BufferedInputStream(zza(zzf)), zzf.length());
            zzax zzc = zzax.zzc(zzba);
            if (!TextUtils.equals(str, zzc.zzcn)) {
                zzaq.d("%s: key=%s, found=%s", zzf.getAbsolutePath(), str, zzc.zzcn);
                removeEntry(str);
                zzba.close();
                return null;
            }
            byte[] zza = zza(zzba, zzba.zzp());
            zzn zzn = new zzn();
            zzn.data = zza;
            zzn.zzr = zzax.zzr;
            zzn.zzs = zzax.zzs;
            zzn.zzt = zzax.zzt;
            zzn.zzu = zzax.zzu;
            zzn.zzv = zzax.zzv;
            List<zzu> list = zzax.zzx;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (zzu next : list) {
                treeMap.put(next.getName(), next.getValue());
            }
            zzn.zzw = treeMap;
            zzn.zzx = Collections.unmodifiableList(zzax.zzx);
            zzba.close();
            return zzn;
        } catch (IOException e) {
            zzaq.d("%s: %s", zzf.getAbsolutePath(), e.toString());
            remove(str);
            return null;
        } catch (Throwable th) {
            zzba.close();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void initialize() {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzaz r0 = r9.zzck     // Catch:{ all -> 0x0060 }
            java.io.File r0 = r0.zzo()     // Catch:{ all -> 0x0060 }
            boolean r1 = r0.exists()     // Catch:{ all -> 0x0060 }
            r2 = 0
            if (r1 != 0) goto L_0x0024
            boolean r1 = r0.mkdirs()     // Catch:{ all -> 0x0060 }
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = "Unable to create cache dir %s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0060 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x0060 }
            r3[r2] = r0     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.zzaq.e(r1, r3)     // Catch:{ all -> 0x0060 }
        L_0x0022:
            monitor-exit(r9)
            return
        L_0x0024:
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x002c
            monitor-exit(r9)
            return
        L_0x002c:
            int r1 = r0.length     // Catch:{ all -> 0x0060 }
        L_0x002d:
            if (r2 >= r1) goto L_0x005e
            r3 = r0[r2]     // Catch:{ all -> 0x0060 }
            long r4 = r3.length()     // Catch:{ IOException -> 0x0057 }
            com.google.android.gms.internal.ads.zzba r6 = new com.google.android.gms.internal.ads.zzba     // Catch:{ IOException -> 0x0057 }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0057 }
            java.io.InputStream r8 = zza((java.io.File) r3)     // Catch:{ IOException -> 0x0057 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0057 }
            r6.<init>(r7, r4)     // Catch:{ IOException -> 0x0057 }
            com.google.android.gms.internal.ads.zzax r7 = com.google.android.gms.internal.ads.zzax.zzc(r6)     // Catch:{ all -> 0x0052 }
            r7.zzcm = r4     // Catch:{ all -> 0x0052 }
            java.lang.String r4 = r7.zzcn     // Catch:{ all -> 0x0052 }
            r9.zza((java.lang.String) r4, (com.google.android.gms.internal.ads.zzax) r7)     // Catch:{ all -> 0x0052 }
            r6.close()     // Catch:{ IOException -> 0x0057 }
            goto L_0x005b
        L_0x0052:
            r4 = move-exception
            r6.close()     // Catch:{ IOException -> 0x0057 }
            throw r4     // Catch:{ IOException -> 0x0057 }
        L_0x0057:
            r4 = move-exception
            r3.delete()     // Catch:{ all -> 0x0060 }
        L_0x005b:
            int r2 = r2 + 1
            goto L_0x002d
        L_0x005e:
            monitor-exit(r9)
            return
        L_0x0060:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzav.initialize():void");
    }

    public final synchronized void zza(String str, boolean z) {
        zzn zzb = zzb(str);
        if (zzb != null) {
            zzb.zzv = 0;
            zzb.zzu = 0;
            zza(str, zzb);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00fc, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zza(java.lang.String r16, com.google.android.gms.internal.ads.zzn r17) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r2 = r17
            monitor-enter(r15)
            long r3 = r1.zzcj     // Catch:{ all -> 0x0149 }
            byte[] r5 = r2.data     // Catch:{ all -> 0x0149 }
            int r5 = r5.length     // Catch:{ all -> 0x0149 }
            long r5 = (long) r5     // Catch:{ all -> 0x0149 }
            long r3 = r3 + r5
            int r5 = r1.zzcl     // Catch:{ all -> 0x0149 }
            long r5 = (long) r5     // Catch:{ all -> 0x0149 }
            r7 = 1063675494(0x3f666666, float:0.9)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x0026
            byte[] r3 = r2.data     // Catch:{ all -> 0x0149 }
            int r3 = r3.length     // Catch:{ all -> 0x0149 }
            float r3 = (float) r3     // Catch:{ all -> 0x0149 }
            int r4 = r1.zzcl     // Catch:{ all -> 0x0149 }
            float r4 = (float) r4
            float r4 = r4 * r7
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0026
            monitor-exit(r15)
            return
        L_0x0026:
            java.io.File r3 = r15.zzf(r16)     // Catch:{ all -> 0x0149 }
            r4 = 1
            r5 = 0
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0113 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0113 }
            r8.<init>(r3)     // Catch:{ IOException -> 0x0113 }
            r6.<init>(r8)     // Catch:{ IOException -> 0x0113 }
            com.google.android.gms.internal.ads.zzax r8 = new com.google.android.gms.internal.ads.zzax     // Catch:{ IOException -> 0x0113 }
            r8.<init>(r0, r2)     // Catch:{ IOException -> 0x0113 }
            boolean r9 = r8.zza(r6)     // Catch:{ IOException -> 0x0113 }
            if (r9 == 0) goto L_0x00fd
            byte[] r2 = r2.data     // Catch:{ IOException -> 0x0113 }
            r6.write(r2)     // Catch:{ IOException -> 0x0113 }
            r6.close()     // Catch:{ IOException -> 0x0113 }
            long r9 = r3.length()     // Catch:{ IOException -> 0x0113 }
            r8.zzcm = r9     // Catch:{ IOException -> 0x0113 }
            r15.zza((java.lang.String) r0, (com.google.android.gms.internal.ads.zzax) r8)     // Catch:{ IOException -> 0x0113 }
            long r8 = r1.zzcj     // Catch:{ IOException -> 0x0113 }
            int r0 = r1.zzcl     // Catch:{ IOException -> 0x0113 }
            long r10 = (long) r0     // Catch:{ IOException -> 0x0113 }
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x00fb
            boolean r0 = com.google.android.gms.internal.ads.zzaq.DEBUG     // Catch:{ IOException -> 0x0113 }
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = "Pruning old cache entries."
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x0113 }
            com.google.android.gms.internal.ads.zzaq.v(r0, r2)     // Catch:{ IOException -> 0x0113 }
        L_0x0067:
            long r8 = r1.zzcj     // Catch:{ IOException -> 0x0113 }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0113 }
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.zzax> r0 = r1.zzci     // Catch:{ IOException -> 0x0113 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ IOException -> 0x0113 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x0113 }
            r2 = 0
        L_0x0079:
            boolean r6 = r0.hasNext()     // Catch:{ IOException -> 0x0113 }
            r12 = 2
            if (r6 == 0) goto L_0x00d2
            java.lang.Object r6 = r0.next()     // Catch:{ IOException -> 0x0113 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ IOException -> 0x0113 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ IOException -> 0x0113 }
            com.google.android.gms.internal.ads.zzax r6 = (com.google.android.gms.internal.ads.zzax) r6     // Catch:{ IOException -> 0x0113 }
            java.lang.String r13 = r6.zzcn     // Catch:{ IOException -> 0x0113 }
            java.io.File r13 = r15.zzf(r13)     // Catch:{ IOException -> 0x0113 }
            boolean r13 = r13.delete()     // Catch:{ IOException -> 0x0113 }
            if (r13 == 0) goto L_0x00a2
            long r13 = r1.zzcj     // Catch:{ IOException -> 0x0113 }
            r16 = r8
            long r7 = r6.zzcm     // Catch:{ IOException -> 0x0113 }
            long r13 = r13 - r7
            r1.zzcj = r13     // Catch:{ IOException -> 0x0113 }
            goto L_0x00b7
        L_0x00a2:
            r16 = r8
            java.lang.String r7 = "Could not delete cache entry for key=%s, filename=%s"
            java.lang.Object[] r8 = new java.lang.Object[r12]     // Catch:{ IOException -> 0x0113 }
            java.lang.String r9 = r6.zzcn     // Catch:{ IOException -> 0x0113 }
            r8[r5] = r9     // Catch:{ IOException -> 0x0113 }
            java.lang.String r6 = r6.zzcn     // Catch:{ IOException -> 0x0113 }
            java.lang.String r6 = zze(r6)     // Catch:{ IOException -> 0x0113 }
            r8[r4] = r6     // Catch:{ IOException -> 0x0113 }
            com.google.android.gms.internal.ads.zzaq.d(r7, r8)     // Catch:{ IOException -> 0x0113 }
        L_0x00b7:
            r0.remove()     // Catch:{ IOException -> 0x0113 }
            int r2 = r2 + 1
            long r6 = r1.zzcj     // Catch:{ IOException -> 0x0113 }
            float r6 = (float) r6     // Catch:{ IOException -> 0x0113 }
            int r7 = r1.zzcl     // Catch:{ IOException -> 0x0113 }
            float r7 = (float) r7     // Catch:{ IOException -> 0x0113 }
            r8 = 1063675494(0x3f666666, float:0.9)
            float r7 = r7 * r8
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x00cc
            goto L_0x00d4
        L_0x00cc:
            r8 = r16
            r7 = 1063675494(0x3f666666, float:0.9)
            goto L_0x0079
        L_0x00d2:
            r16 = r8
        L_0x00d4:
            boolean r0 = com.google.android.gms.internal.ads.zzaq.DEBUG     // Catch:{ IOException -> 0x0113 }
            if (r0 == 0) goto L_0x00fb
            java.lang.String r0 = "pruned %d files, %d bytes, %d ms"
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x0113 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x0113 }
            r6[r5] = r2     // Catch:{ IOException -> 0x0113 }
            long r7 = r1.zzcj     // Catch:{ IOException -> 0x0113 }
            long r7 = r7 - r16
            java.lang.Long r2 = java.lang.Long.valueOf(r7)     // Catch:{ IOException -> 0x0113 }
            r6[r4] = r2     // Catch:{ IOException -> 0x0113 }
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0113 }
            long r7 = r7 - r10
            java.lang.Long r2 = java.lang.Long.valueOf(r7)     // Catch:{ IOException -> 0x0113 }
            r6[r12] = r2     // Catch:{ IOException -> 0x0113 }
            com.google.android.gms.internal.ads.zzaq.v(r0, r6)     // Catch:{ IOException -> 0x0113 }
        L_0x00fb:
            monitor-exit(r15)
            return
        L_0x00fd:
            r6.close()     // Catch:{ IOException -> 0x0113 }
            java.lang.String r0 = "Failed to write header for %s"
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0113 }
            java.lang.String r6 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x0113 }
            r2[r5] = r6     // Catch:{ IOException -> 0x0113 }
            com.google.android.gms.internal.ads.zzaq.d(r0, r2)     // Catch:{ IOException -> 0x0113 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0113 }
            r0.<init>()     // Catch:{ IOException -> 0x0113 }
            throw r0     // Catch:{ IOException -> 0x0113 }
        L_0x0113:
            r0 = move-exception
            boolean r0 = r3.delete()     // Catch:{ all -> 0x0149 }
            if (r0 != 0) goto L_0x0127
            java.lang.String r0 = "Could not clean up file %s"
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ all -> 0x0149 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x0149 }
            r2[r5] = r3     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzaq.d(r0, r2)     // Catch:{ all -> 0x0149 }
        L_0x0127:
            com.google.android.gms.internal.ads.zzaz r0 = r1.zzck     // Catch:{ all -> 0x0149 }
            java.io.File r0 = r0.zzo()     // Catch:{ all -> 0x0149 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0149 }
            if (r0 != 0) goto L_0x0147
            java.lang.String r0 = "Re-initializing cache after external clearing."
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzaq.d(r0, r2)     // Catch:{ all -> 0x0149 }
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.zzax> r0 = r1.zzci     // Catch:{ all -> 0x0149 }
            r0.clear()     // Catch:{ all -> 0x0149 }
            r2 = 0
            r1.zzcj = r2     // Catch:{ all -> 0x0149 }
            r15.initialize()     // Catch:{ all -> 0x0149 }
        L_0x0147:
            monitor-exit(r15)
            return
        L_0x0149:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzav.zza(java.lang.String, com.google.android.gms.internal.ads.zzn):void");
    }

    private final synchronized void remove(String str) {
        boolean delete = zzf(str).delete();
        removeEntry(str);
        if (!delete) {
            zzaq.d("Could not delete cache entry for key=%s, filename=%s", str, zze(str));
        }
    }

    private static String zze(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private final File zzf(String str) {
        return new File(this.zzck.zzo(), zze(str));
    }

    private final void zza(String str, zzax zzax) {
        if (!this.zzci.containsKey(str)) {
            this.zzcj += zzax.zzcm;
        } else {
            this.zzcj += zzax.zzcm - this.zzci.get(str).zzcm;
        }
        this.zzci.put(str, zzax);
    }

    private final void removeEntry(String str) {
        zzax remove = this.zzci.remove(str);
        if (remove != null) {
            this.zzcj -= remove.zzcm;
        }
    }

    private static byte[] zza(zzba zzba, long j) throws IOException {
        long zzp = zzba.zzp();
        if (j >= 0 && j <= zzp) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(zzba).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(zzp);
        throw new IOException(sb.toString());
    }

    private static InputStream zza(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    private static int zza(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    static void zza(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write(i >>> 24);
    }

    static int zzb(InputStream inputStream) throws IOException {
        return (zza(inputStream) << 24) | zza(inputStream) | 0 | (zza(inputStream) << 8) | (zza(inputStream) << 16);
    }

    static void zza(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    static long zzc(InputStream inputStream) throws IOException {
        return (((long) zza(inputStream)) & 255) | 0 | ((((long) zza(inputStream)) & 255) << 8) | ((((long) zza(inputStream)) & 255) << 16) | ((((long) zza(inputStream)) & 255) << 24) | ((((long) zza(inputStream)) & 255) << 32) | ((((long) zza(inputStream)) & 255) << 40) | ((((long) zza(inputStream)) & 255) << 48) | ((255 & ((long) zza(inputStream))) << 56);
    }

    static void zza(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        zza(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    static String zza(zzba zzba) throws IOException {
        return new String(zza(zzba, zzc(zzba)), "UTF-8");
    }

    static List<zzu> zzb(zzba zzba) throws IOException {
        int zzb = zzb((InputStream) zzba);
        if (zzb >= 0) {
            List<zzu> emptyList = zzb == 0 ? Collections.emptyList() : new ArrayList<>();
            for (int i = 0; i < zzb; i++) {
                emptyList.add(new zzu(zza(zzba).intern(), zza(zzba).intern()));
            }
            return emptyList;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("readHeaderList size=");
        sb.append(zzb);
        throw new IOException(sb.toString());
    }
}
