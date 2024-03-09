package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public class zzbw {
    public static final Uri zza = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Pattern zzb = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern zzc = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static final Uri zzd = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    /* access modifiers changed from: private */
    public static final AtomicBoolean zze = new AtomicBoolean();
    private static HashMap<String, String> zzf;
    private static final HashMap<String, Boolean> zzg = new HashMap<>();
    private static final HashMap<String, Integer> zzh = new HashMap<>();
    private static final HashMap<String, Long> zzi = new HashMap<>();
    private static final HashMap<String, Float> zzj = new HashMap<>();
    private static Object zzk;
    private static boolean zzl;
    private static String[] zzm = new String[0];

    private static void zza(ContentResolver contentResolver) {
        if (zzf == null) {
            zze.set(false);
            zzf = new HashMap<>();
            zzk = new Object();
            zzl = false;
            contentResolver.registerContentObserver(zza, true, new zzbv((Handler) null));
        } else if (zze.getAndSet(false)) {
            zzf.clear();
            zzg.clear();
            zzh.clear();
            zzi.clear();
            zzj.clear();
            zzk = new Object();
            zzl = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        r13 = r13.query(zza, (java.lang.String[]) null, (java.lang.String) null, new java.lang.String[]{r14}, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0070, code lost:
        if (r13 != null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0073, code lost:
        if (r13 == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0075, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0078, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007d, code lost:
        if (r13.moveToFirst() != false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007f, code lost:
        zza(r0, r14, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0087, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r15 = r13.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008c, code lost:
        if (r15 == null) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0092, code lost:
        if (r15.equals((java.lang.Object) null) == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0094, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0095, code lost:
        zza(r0, r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0098, code lost:
        if (r15 == null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009a, code lost:
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009b, code lost:
        if (r13 == null) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x009d, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a0, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a1, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a2, code lost:
        if (r13 != null) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a4, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a7, code lost:
        throw r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String zza(android.content.ContentResolver r13, java.lang.String r14, java.lang.String r15) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.zzbw> r15 = com.google.android.gms.internal.measurement.zzbw.class
            monitor-enter(r15)
            zza(r13)     // Catch:{ all -> 0x00a8 }
            java.lang.Object r0 = zzk     // Catch:{ all -> 0x00a8 }
            java.util.HashMap<java.lang.String, java.lang.String> r1 = zzf     // Catch:{ all -> 0x00a8 }
            boolean r1 = r1.containsKey(r14)     // Catch:{ all -> 0x00a8 }
            r2 = 0
            if (r1 == 0) goto L_0x001e
            java.util.HashMap<java.lang.String, java.lang.String> r13 = zzf     // Catch:{ all -> 0x00a8 }
            java.lang.Object r13 = r13.get(r14)     // Catch:{ all -> 0x00a8 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x00a8 }
            if (r13 == 0) goto L_0x001c
            r2 = r13
        L_0x001c:
            monitor-exit(r15)     // Catch:{ all -> 0x00a8 }
            return r2
        L_0x001e:
            java.lang.String[] r1 = zzm     // Catch:{ all -> 0x00a8 }
            int r3 = r1.length     // Catch:{ all -> 0x00a8 }
            r4 = 0
            r5 = 0
        L_0x0023:
            r6 = 1
            if (r5 >= r3) goto L_0x0061
            r7 = r1[r5]     // Catch:{ all -> 0x00a8 }
            boolean r7 = r14.startsWith(r7)     // Catch:{ all -> 0x00a8 }
            if (r7 == 0) goto L_0x005e
            boolean r0 = zzl     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x003a
            java.util.HashMap<java.lang.String, java.lang.String> r0 = zzf     // Catch:{ all -> 0x00a8 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x005c
        L_0x003a:
            java.lang.String[] r0 = zzm     // Catch:{ all -> 0x00a8 }
            java.util.HashMap<java.lang.String, java.lang.String> r1 = zzf     // Catch:{ all -> 0x00a8 }
            java.util.Map r13 = zza(r13, r0)     // Catch:{ all -> 0x00a8 }
            r1.putAll(r13)     // Catch:{ all -> 0x00a8 }
            zzl = r6     // Catch:{ all -> 0x00a8 }
            java.util.HashMap<java.lang.String, java.lang.String> r13 = zzf     // Catch:{ all -> 0x00a8 }
            boolean r13 = r13.containsKey(r14)     // Catch:{ all -> 0x00a8 }
            if (r13 == 0) goto L_0x005c
            java.util.HashMap<java.lang.String, java.lang.String> r13 = zzf     // Catch:{ all -> 0x00a8 }
            java.lang.Object r13 = r13.get(r14)     // Catch:{ all -> 0x00a8 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x00a8 }
            if (r13 == 0) goto L_0x005a
            r2 = r13
        L_0x005a:
            monitor-exit(r15)     // Catch:{ all -> 0x00a8 }
            return r2
        L_0x005c:
            monitor-exit(r15)     // Catch:{ all -> 0x00a8 }
            return r2
        L_0x005e:
            int r5 = r5 + 1
            goto L_0x0023
        L_0x0061:
            monitor-exit(r15)     // Catch:{ all -> 0x00a8 }
            android.net.Uri r8 = zza
            r9 = 0
            r10 = 0
            java.lang.String[] r11 = new java.lang.String[r6]
            r11[r4] = r14
            r12 = 0
            r7 = r13
            android.database.Cursor r13 = r7.query(r8, r9, r10, r11, r12)
            if (r13 != 0) goto L_0x0079
            if (r13 == 0) goto L_0x0078
            r13.close()
        L_0x0078:
            return r2
        L_0x0079:
            boolean r15 = r13.moveToFirst()     // Catch:{ all -> 0x00a1 }
            if (r15 != 0) goto L_0x0088
            zza((java.lang.Object) r0, (java.lang.String) r14, (java.lang.String) r2)     // Catch:{ all -> 0x00a1 }
            if (r13 == 0) goto L_0x0087
            r13.close()
        L_0x0087:
            return r2
        L_0x0088:
            java.lang.String r15 = r13.getString(r6)     // Catch:{ all -> 0x00a1 }
            if (r15 == 0) goto L_0x0095
            boolean r1 = r15.equals(r2)     // Catch:{ all -> 0x00a1 }
            if (r1 == 0) goto L_0x0095
            r15 = r2
        L_0x0095:
            zza((java.lang.Object) r0, (java.lang.String) r14, (java.lang.String) r15)     // Catch:{ all -> 0x00a1 }
            if (r15 == 0) goto L_0x009b
            r2 = r15
        L_0x009b:
            if (r13 == 0) goto L_0x00a0
            r13.close()
        L_0x00a0:
            return r2
        L_0x00a1:
            r14 = move-exception
            if (r13 == 0) goto L_0x00a7
            r13.close()
        L_0x00a7:
            throw r14
        L_0x00a8:
            r13 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00a8 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzbw.zza(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String");
    }

    private static void zza(Object obj, String str, String str2) {
        synchronized (zzbw.class) {
            if (obj == zzk) {
                zzf.put(str, str2);
            }
        }
    }

    private static Map<String, String> zza(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(zzd, (String[]) null, (String) null, strArr, (String) null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }
}
