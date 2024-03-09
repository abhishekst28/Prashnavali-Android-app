package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ads.zzcf;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class zzex {
    private static final String TAG = zzex.class.getSimpleName();
    protected Context zzvr;
    private volatile boolean zzxj;
    private zzev zzyt;
    private ExecutorService zzyu;
    private DexClassLoader zzyv;
    private zzei zzyw;
    private byte[] zzyx;
    private volatile AdvertisingIdClient zzyy = null;
    private Future zzyz;
    private boolean zzza;
    /* access modifiers changed from: private */
    public volatile zzcf.zza zzzb;
    private Future zzzc;
    private zzdu zzzd;
    private boolean zzze;
    private boolean zzzf;
    private Map<Pair<String, String>, zzgk> zzzg;
    private boolean zzzh;

    public static zzex zza(Context context, String str, String str2, boolean z) {
        File cacheDir;
        File file;
        zzex zzex = new zzex(context);
        try {
            zzex.zzyu = Executors.newCachedThreadPool(new zzfa());
            zzex.zzxj = z;
            if (z) {
                zzex.zzyz = zzex.zzyu.submit(new zzez(zzex));
            }
            zzex.zzyu.execute(new zzfb(zzex));
            try {
                GoogleApiAvailabilityLight instance = GoogleApiAvailabilityLight.getInstance();
                zzex.zzze = instance.getApkVersion(zzex.zzvr) > 0;
                zzex.zzzf = instance.isGooglePlayServicesAvailable(zzex.zzvr) == 0;
            } catch (Throwable th) {
            }
            zzex.zza(0, true);
            if (zzfg.isMainThread()) {
                if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcqv)).booleanValue()) {
                    throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
                }
            }
            zzei zzei = new zzei((SecureRandom) null);
            zzex.zzyw = zzei;
            zzex.zzyx = zzei.zzap(str);
            try {
                cacheDir = zzex.zzvr.getCacheDir();
                if (cacheDir == null) {
                    cacheDir = zzex.zzvr.getDir("dex", 0);
                    if (cacheDir == null) {
                        throw new zzeu();
                    }
                }
                file = new File(String.format("%s/%s.jar", new Object[]{cacheDir, "1588462714860"}));
                if (!file.exists()) {
                    byte[] zza = zzex.zzyw.zza(zzex.zzyx, str2);
                    file.createNewFile();
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    fileOutputStream.write(zza, 0, zza.length);
                    fileOutputStream.close();
                }
                zzex.zzb(cacheDir, "1588462714860");
                zzex.zzyv = new DexClassLoader(file.getAbsolutePath(), cacheDir.getAbsolutePath(), (String) null, zzex.zzvr.getClassLoader());
                zzc(file);
                zzex.zza(cacheDir, "1588462714860");
                zzaq(String.format("%s/%s.dex", new Object[]{cacheDir, "1588462714860"}));
                zzex.zzzd = new zzdu(zzex);
                zzex.zzzh = true;
            } catch (FileNotFoundException e) {
                throw new zzeu(e);
            } catch (IOException e2) {
                throw new zzeu(e2);
            } catch (zzeh e3) {
                throw new zzeu(e3);
            } catch (NullPointerException e4) {
                throw new zzeu(e4);
            } catch (Throwable th2) {
                zzc(file);
                zzex.zza(cacheDir, "1588462714860");
                zzaq(String.format("%s/%s.dex", new Object[]{cacheDir, "1588462714860"}));
                throw th2;
            }
        } catch (zzeh e5) {
            throw new zzeu(e5);
        } catch (zzeu e6) {
        }
        return zzex;
    }

    public final Context getContext() {
        return this.zzvr;
    }

    public final boolean isInitialized() {
        return this.zzzh;
    }

    public final ExecutorService zzcg() {
        return this.zzyu;
    }

    public final DexClassLoader zzch() {
        return this.zzyv;
    }

    public final zzei zzci() {
        return this.zzyw;
    }

    public final byte[] zzcj() {
        return this.zzyx;
    }

    public final boolean zzck() {
        return this.zzze;
    }

    public final zzdu zzcl() {
        return this.zzzd;
    }

    public final boolean zzcm() {
        return this.zzzf;
    }

    public final boolean zzcb() {
        return this.zzyt.zzcb();
    }

    /* access modifiers changed from: package-private */
    public final zzev zzcn() {
        return this.zzyt;
    }

    public final zzcf.zza zzco() {
        return this.zzzb;
    }

    public final Future zzcp() {
        return this.zzzc;
    }

    private zzex(Context context) {
        boolean z = false;
        this.zzxj = false;
        this.zzyz = null;
        this.zzzb = null;
        this.zzzc = null;
        this.zzze = false;
        this.zzzf = false;
        this.zzzh = false;
        Context applicationContext = context.getApplicationContext();
        z = applicationContext != null ? true : z;
        this.zzza = z;
        this.zzvr = z ? applicationContext : context;
        this.zzzg = new HashMap();
        if (this.zzyt == null) {
            this.zzyt = new zzev(this.zzvr);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e9 A[SYNTHETIC, Splitter:B:43:0x00e9] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f2 A[SYNTHETIC, Splitter:B:47:0x00f2] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0105 A[SYNTHETIC, Splitter:B:55:0x0105] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010e A[SYNTHETIC, Splitter:B:59:0x010e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zza(java.io.File r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "test"
            java.io.File r1 = new java.io.File
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r10
            r5 = 1
            r3[r5] = r11
            java.lang.String r6 = "%s/%s.tmp"
            java.lang.String r3 = java.lang.String.format(r6, r3)
            r1.<init>(r3)
            boolean r3 = r1.exists()
            if (r3 == 0) goto L_0x001d
            return
        L_0x001d:
            java.io.File r3 = new java.io.File
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r10
            r2[r5] = r11
            java.lang.String r10 = "%s/%s.dex"
            java.lang.String r10 = java.lang.String.format(r10, r2)
            r3.<init>(r10)
            boolean r10 = r3.exists()
            if (r10 != 0) goto L_0x0035
            return
        L_0x0035:
            long r5 = r3.length()
            r7 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 > 0) goto L_0x0042
            return
        L_0x0042:
            int r10 = (int) r5
            byte[] r10 = new byte[r10]
            r2 = 0
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0101, NoSuchAlgorithmException -> 0x00ff, zzeh -> 0x00fd, all -> 0x00e5 }
            r5.<init>(r3)     // Catch:{ IOException -> 0x0101, NoSuchAlgorithmException -> 0x00ff, zzeh -> 0x00fd, all -> 0x00e5 }
            int r6 = r5.read(r10)     // Catch:{ IOException -> 0x00e1, NoSuchAlgorithmException -> 0x00df, zzeh -> 0x00dd, all -> 0x00d9 }
            if (r6 > 0) goto L_0x005b
            r5.close()     // Catch:{ IOException -> 0x0055 }
            goto L_0x0056
        L_0x0055:
            r10 = move-exception
        L_0x0056:
            zzc(r3)
            return
        L_0x005b:
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ IOException -> 0x00e1, NoSuchAlgorithmException -> 0x00df, zzeh -> 0x00dd, all -> 0x00d9 }
            r6.print(r0)     // Catch:{ IOException -> 0x00e1, NoSuchAlgorithmException -> 0x00df, zzeh -> 0x00dd, all -> 0x00d9 }
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ IOException -> 0x00e1, NoSuchAlgorithmException -> 0x00df, zzeh -> 0x00dd, all -> 0x00d9 }
            r6.print(r0)     // Catch:{ IOException -> 0x00e1, NoSuchAlgorithmException -> 0x00df, zzeh -> 0x00dd, all -> 0x00d9 }
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ IOException -> 0x00e1, NoSuchAlgorithmException -> 0x00df, zzeh -> 0x00dd, all -> 0x00d9 }
            r6.print(r0)     // Catch:{ IOException -> 0x00e1, NoSuchAlgorithmException -> 0x00df, zzeh -> 0x00dd, all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzcf$zzc$zza r0 = com.google.android.gms.internal.ads.zzcf.zzc.zzbe()     // Catch:{ IOException -> 0x00e1, NoSuchAlgorithmException -> 0x00df, zzeh -> 0x00dd, all -> 0x00d9 }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ IOException -> 0x00e1, NoSuchAlgorithmException -> 0x00df, zzeh -> 0x00dd, all -> 0x00d9 }
            byte[] r6 = r6.getBytes()     // Catch:{ IOException -> 0x00e1, NoSuchAlgorithmException -> 0x00df, zzeh -> 0x00dd, all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzeff r6 = com.google.android.gms.internal.ads.zzeff.zzu(r6)     // Catch:{ IOException -> 0x00e1, NoSuchAlgorithmException -> 0x00df, zzeh -> 0x00dd, all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzcf$zzc$zza r0 = r0.zzd(r6)     // Catch:{ IOException -> 0x00e1, NoSuchAlgorithmException -> 0x00df, zzeh -> 0x00dd, all -> 0x00d9 }
            byte[] r11 = r11.getBytes()     // Catch:{ IOException -> 0x00e1, NoSuchAlgorithmException -> 0x00df, zzeh -> 0x00dd, all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzeff r11 = com.google.android.gms.internal.ads.zzeff.zzu(r11)     // Catch:{ IOException -> 0x00e1, NoSuchAlgorithmException -> 0x00df, zzeh -> 0x00dd, all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzcf$zzc$zza r11 = r0.zzc(r11)     // Catch:{ IOException -> 0x00e1, NoSuchAlgorithmException -> 0x00df, zzeh -> 0x00dd, all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzei r0 = r9.zzyw     // Catch:{ IOException -> 0x00e1, NoSuchAlgorithmException -> 0x00df, zzeh -> 0x00dd, all -> 0x00d9 }
            byte[] r6 = r9.zzyx     // Catch:{ IOException -> 0x00e1, NoSuchAlgorithmException -> 0x00df, zzeh -> 0x00dd, all -> 0x00d9 }
            java.lang.String r10 = r0.zzb(r6, r10)     // Catch:{ IOException -> 0x00e1, NoSuchAlgorithmException -> 0x00df, zzeh -> 0x00dd, all -> 0x00d9 }
            byte[] r10 = r10.getBytes()     // Catch:{ IOException -> 0x00e1, NoSuchAlgorithmException -> 0x00df, zzeh -> 0x00dd, all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzeff r0 = com.google.android.gms.internal.ads.zzeff.zzu(r10)     // Catch:{ IOException -> 0x00e1, NoSuchAlgorithmException -> 0x00df, zzeh -> 0x00dd, all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzcf$zzc$zza r0 = r11.zza(r0)     // Catch:{ IOException -> 0x00e1, NoSuchAlgorithmException -> 0x00df, zzeh -> 0x00dd, all -> 0x00d9 }
            byte[] r10 = com.google.android.gms.internal.ads.zzcx.zzb(r10)     // Catch:{ IOException -> 0x00e1, NoSuchAlgorithmException -> 0x00df, zzeh -> 0x00dd, all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzeff r10 = com.google.android.gms.internal.ads.zzeff.zzu(r10)     // Catch:{ IOException -> 0x00e1, NoSuchAlgorithmException -> 0x00df, zzeh -> 0x00dd, all -> 0x00d9 }
            r0.zzb(r10)     // Catch:{ IOException -> 0x00e1, NoSuchAlgorithmException -> 0x00df, zzeh -> 0x00dd, all -> 0x00d9 }
            r1.createNewFile()     // Catch:{ IOException -> 0x00e1, NoSuchAlgorithmException -> 0x00df, zzeh -> 0x00dd, all -> 0x00d9 }
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00e1, NoSuchAlgorithmException -> 0x00df, zzeh -> 0x00dd, all -> 0x00d9 }
            r10.<init>(r1)     // Catch:{ IOException -> 0x00e1, NoSuchAlgorithmException -> 0x00df, zzeh -> 0x00dd, all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzehz r11 = r11.zzbfx()     // Catch:{ IOException -> 0x00d7, NoSuchAlgorithmException -> 0x00d5, zzeh -> 0x00d3, all -> 0x00d1 }
            com.google.android.gms.internal.ads.zzegp r11 = (com.google.android.gms.internal.ads.zzegp) r11     // Catch:{ IOException -> 0x00d7, NoSuchAlgorithmException -> 0x00d5, zzeh -> 0x00d3, all -> 0x00d1 }
            com.google.android.gms.internal.ads.zzcf$zzc r11 = (com.google.android.gms.internal.ads.zzcf.zzc) r11     // Catch:{ IOException -> 0x00d7, NoSuchAlgorithmException -> 0x00d5, zzeh -> 0x00d3, all -> 0x00d1 }
            byte[] r11 = r11.toByteArray()     // Catch:{ IOException -> 0x00d7, NoSuchAlgorithmException -> 0x00d5, zzeh -> 0x00d3, all -> 0x00d1 }
            int r0 = r11.length     // Catch:{ IOException -> 0x00d7, NoSuchAlgorithmException -> 0x00d5, zzeh -> 0x00d3, all -> 0x00d1 }
            r10.write(r11, r4, r0)     // Catch:{ IOException -> 0x00d7, NoSuchAlgorithmException -> 0x00d5, zzeh -> 0x00d3, all -> 0x00d1 }
            r10.close()     // Catch:{ IOException -> 0x00d7, NoSuchAlgorithmException -> 0x00d5, zzeh -> 0x00d3, all -> 0x00d1 }
            r5.close()     // Catch:{ IOException -> 0x00c7 }
            goto L_0x00c8
        L_0x00c7:
            r11 = move-exception
        L_0x00c8:
            r10.close()     // Catch:{ IOException -> 0x00cc }
            goto L_0x00cd
        L_0x00cc:
            r10 = move-exception
        L_0x00cd:
            zzc(r3)
            return
        L_0x00d1:
            r11 = move-exception
            goto L_0x00db
        L_0x00d3:
            r11 = move-exception
            goto L_0x00e3
        L_0x00d5:
            r11 = move-exception
            goto L_0x00e3
        L_0x00d7:
            r11 = move-exception
            goto L_0x00e3
        L_0x00d9:
            r11 = move-exception
            r10 = r2
        L_0x00db:
            r2 = r5
            goto L_0x00e7
        L_0x00dd:
            r10 = move-exception
            goto L_0x00e2
        L_0x00df:
            r10 = move-exception
            goto L_0x00e2
        L_0x00e1:
            r10 = move-exception
        L_0x00e2:
            r10 = r2
        L_0x00e3:
            r2 = r5
            goto L_0x0103
        L_0x00e5:
            r11 = move-exception
            r10 = r2
        L_0x00e7:
            if (r2 == 0) goto L_0x00ef
            r2.close()     // Catch:{ IOException -> 0x00ed }
            goto L_0x00ef
        L_0x00ed:
            r0 = move-exception
            goto L_0x00f0
        L_0x00ef:
        L_0x00f0:
            if (r10 == 0) goto L_0x00f8
            r10.close()     // Catch:{ IOException -> 0x00f6 }
            goto L_0x00f8
        L_0x00f6:
            r10 = move-exception
            goto L_0x00f9
        L_0x00f8:
        L_0x00f9:
            zzc(r3)
            throw r11
        L_0x00fd:
            r10 = move-exception
            goto L_0x0102
        L_0x00ff:
            r10 = move-exception
            goto L_0x0102
        L_0x0101:
            r10 = move-exception
        L_0x0102:
            r10 = r2
        L_0x0103:
            if (r2 == 0) goto L_0x010b
            r2.close()     // Catch:{ IOException -> 0x0109 }
            goto L_0x010b
        L_0x0109:
            r11 = move-exception
            goto L_0x010c
        L_0x010b:
        L_0x010c:
            if (r10 == 0) goto L_0x0114
            r10.close()     // Catch:{ IOException -> 0x0112 }
            goto L_0x0114
        L_0x0112:
            r10 = move-exception
            goto L_0x0115
        L_0x0114:
        L_0x0115:
            zzc(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzex.zza(java.io.File, java.lang.String):void");
    }

    private static void zzaq(String str) {
        zzc(new File(str));
    }

    private static void zzc(File file) {
        if (!file.exists()) {
            Log.d(TAG, String.format("File %s not found. No need for deletion", new Object[]{file.getAbsolutePath()}));
            return;
        }
        file.delete();
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00fd A[SYNTHETIC, Splitter:B:56:0x00fd] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0106 A[SYNTHETIC, Splitter:B:60:0x0106] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0116 A[SYNTHETIC, Splitter:B:67:0x0116] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x011f A[SYNTHETIC, Splitter:B:71:0x011f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzb(java.io.File r10, java.lang.String r11) {
        /*
            r9 = this;
            java.io.File r0 = new java.io.File
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r10
            r4 = 1
            r2[r4] = r11
            java.lang.String r5 = "%s/%s.tmp"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 != 0) goto L_0x001b
            return r3
        L_0x001b:
            java.io.File r2 = new java.io.File
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r10
            r1[r4] = r11
            java.lang.String r10 = "%s/%s.dex"
            java.lang.String r10 = java.lang.String.format(r10, r1)
            r2.<init>(r10)
            boolean r10 = r2.exists()
            if (r10 == 0) goto L_0x0033
            return r3
        L_0x0033:
            r10 = 0
            long r5 = r0.length()     // Catch:{ IOException -> 0x0112, NoSuchAlgorithmException -> 0x0110, zzeh -> 0x010e, all -> 0x00f9 }
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x0045
            zzc(r0)     // Catch:{ IOException -> 0x0112, NoSuchAlgorithmException -> 0x0110, zzeh -> 0x010e, all -> 0x00f9 }
            return r3
        L_0x0045:
            int r1 = (int) r5     // Catch:{ IOException -> 0x0112, NoSuchAlgorithmException -> 0x0110, zzeh -> 0x010e, all -> 0x00f9 }
            byte[] r1 = new byte[r1]     // Catch:{ IOException -> 0x0112, NoSuchAlgorithmException -> 0x0110, zzeh -> 0x010e, all -> 0x00f9 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0112, NoSuchAlgorithmException -> 0x0110, zzeh -> 0x010e, all -> 0x00f9 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0112, NoSuchAlgorithmException -> 0x0110, zzeh -> 0x010e, all -> 0x00f9 }
            int r6 = r5.read(r1)     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            if (r6 > 0) goto L_0x0064
            java.lang.String r11 = TAG     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            java.lang.String r1 = "Cannot read the cache data."
            android.util.Log.d(r11, r1)     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            zzc(r0)     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            r5.close()     // Catch:{ IOException -> 0x0061 }
            goto L_0x0062
        L_0x0061:
            r10 = move-exception
        L_0x0062:
            return r3
        L_0x0064:
            com.google.android.gms.internal.ads.zzegc r6 = com.google.android.gms.internal.ads.zzegc.zzbey()     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            com.google.android.gms.internal.ads.zzcf$zzc r1 = com.google.android.gms.internal.ads.zzcf.zzc.zzb((byte[]) r1, (com.google.android.gms.internal.ads.zzegc) r6)     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            java.lang.String r6 = new java.lang.String     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            com.google.android.gms.internal.ads.zzeff r7 = r1.zzbc()     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            byte[] r7 = r7.toByteArray()     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            r6.<init>(r7)     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            boolean r11 = r11.equals(r6)     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            if (r11 == 0) goto L_0x00e3
            com.google.android.gms.internal.ads.zzeff r11 = r1.zzbb()     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            byte[] r11 = r11.toByteArray()     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            com.google.android.gms.internal.ads.zzeff r6 = r1.zzba()     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            byte[] r6 = r6.toByteArray()     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            byte[] r6 = com.google.android.gms.internal.ads.zzcx.zzb(r6)     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            boolean r11 = java.util.Arrays.equals(r11, r6)     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            if (r11 == 0) goto L_0x00e3
            com.google.android.gms.internal.ads.zzeff r11 = r1.zzbd()     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            byte[] r11 = r11.toByteArray()     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            byte[] r6 = r6.getBytes()     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            boolean r11 = java.util.Arrays.equals(r11, r6)     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            if (r11 != 0) goto L_0x00ae
            goto L_0x00e3
        L_0x00ae:
            com.google.android.gms.internal.ads.zzei r11 = r9.zzyw     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            byte[] r0 = r9.zzyx     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            java.lang.String r6 = new java.lang.String     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            com.google.android.gms.internal.ads.zzeff r1 = r1.zzba()     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            byte[] r1 = r1.toByteArray()     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            r6.<init>(r1)     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            byte[] r11 = r11.zza(r0, r6)     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            r2.createNewFile()     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            r0.<init>(r2)     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            int r10 = r11.length     // Catch:{ IOException -> 0x00e1, NoSuchAlgorithmException -> 0x00df, zzeh -> 0x00dd, all -> 0x00db }
            r0.write(r11, r3, r10)     // Catch:{ IOException -> 0x00e1, NoSuchAlgorithmException -> 0x00df, zzeh -> 0x00dd, all -> 0x00db }
            r5.close()     // Catch:{ IOException -> 0x00d3 }
            goto L_0x00d4
        L_0x00d3:
            r10 = move-exception
        L_0x00d4:
            r0.close()     // Catch:{ IOException -> 0x00d8 }
            goto L_0x00da
        L_0x00d8:
            r10 = move-exception
        L_0x00da:
            return r4
        L_0x00db:
            r11 = move-exception
            goto L_0x00ef
        L_0x00dd:
            r10 = move-exception
            goto L_0x00f7
        L_0x00df:
            r10 = move-exception
            goto L_0x00f7
        L_0x00e1:
            r10 = move-exception
            goto L_0x00f7
        L_0x00e3:
            zzc(r0)     // Catch:{ IOException -> 0x00f5, NoSuchAlgorithmException -> 0x00f3, zzeh -> 0x00f1, all -> 0x00ed }
            r5.close()     // Catch:{ IOException -> 0x00ea }
            goto L_0x00eb
        L_0x00ea:
            r10 = move-exception
        L_0x00eb:
            return r3
        L_0x00ed:
            r11 = move-exception
            r0 = r10
        L_0x00ef:
            r10 = r5
            goto L_0x00fb
        L_0x00f1:
            r11 = move-exception
            goto L_0x00f6
        L_0x00f3:
            r11 = move-exception
            goto L_0x00f6
        L_0x00f5:
            r11 = move-exception
        L_0x00f6:
            r0 = r10
        L_0x00f7:
            r10 = r5
            goto L_0x0114
        L_0x00f9:
            r11 = move-exception
            r0 = r10
        L_0x00fb:
            if (r10 == 0) goto L_0x0103
            r10.close()     // Catch:{ IOException -> 0x0101 }
            goto L_0x0103
        L_0x0101:
            r10 = move-exception
            goto L_0x0104
        L_0x0103:
        L_0x0104:
            if (r0 == 0) goto L_0x010c
            r0.close()     // Catch:{ IOException -> 0x010a }
            goto L_0x010c
        L_0x010a:
            r10 = move-exception
            goto L_0x010d
        L_0x010c:
        L_0x010d:
            throw r11
        L_0x010e:
            r11 = move-exception
            goto L_0x0113
        L_0x0110:
            r11 = move-exception
            goto L_0x0113
        L_0x0112:
            r11 = move-exception
        L_0x0113:
            r0 = r10
        L_0x0114:
            if (r10 == 0) goto L_0x011c
            r10.close()     // Catch:{ IOException -> 0x011a }
            goto L_0x011c
        L_0x011a:
            r10 = move-exception
            goto L_0x011d
        L_0x011c:
        L_0x011d:
            if (r0 == 0) goto L_0x0125
            r0.close()     // Catch:{ IOException -> 0x0123 }
            goto L_0x0125
        L_0x0123:
            r10 = move-exception
            goto L_0x0126
        L_0x0125:
        L_0x0126:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzex.zzb(java.io.File, java.lang.String):boolean");
    }

    public final boolean zza(String str, String str2, Class<?>... clsArr) {
        if (this.zzzg.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.zzzg.put(new Pair(str, str2), new zzgk(this, str, str2, clsArr));
        return true;
    }

    public final Method zza(String str, String str2) {
        zzgk zzgk = this.zzzg.get(new Pair(str, str2));
        if (zzgk == null) {
            return null;
        }
        return zzgk.zzdb();
    }

    /* access modifiers changed from: private */
    public final void zzcq() {
        try {
            if (this.zzyy == null && this.zzza) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.zzvr);
                advertisingIdClient.start();
                this.zzyy = advertisingIdClient;
            }
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException e) {
            this.zzyy = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(int i, boolean z) {
        if (this.zzzf) {
            Future<?> submit = this.zzyu.submit(new zzfc(this, i, z));
            if (i == 0) {
                this.zzzc = submit;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final zzcf.zza zzb(int i, boolean z) {
        if (i > 0 && z) {
            try {
                Thread.sleep((long) (i * 1000));
            } catch (InterruptedException e) {
            }
        }
        return zzcr();
    }

    /* access modifiers changed from: private */
    public static boolean zza(int i, zzcf.zza zza) {
        if (i >= 4) {
            return false;
        }
        if (zza != null && zza.zzaj() && !zza.zzaf().equals("0000000000000000000000000000000000000000000000000000000000000000") && zza.zzao() && zza.zzap().zzbg() && zza.zzap().zzbh() != -2) {
            return false;
        }
        return true;
    }

    private final zzcf.zza zzcr() {
        try {
            return zzdqi.zzj(this.zzvr, this.zzvr.getPackageName(), Integer.toString(this.zzvr.getPackageManager().getPackageInfo(this.zzvr.getPackageName(), 0).versionCode));
        } catch (Throwable th) {
            return null;
        }
    }

    public final AdvertisingIdClient zzcs() {
        if (!this.zzxj) {
            return null;
        }
        if (this.zzyy != null) {
            return this.zzyy;
        }
        Future future = this.zzyz;
        if (future != null) {
            try {
                future.get(2000, TimeUnit.MILLISECONDS);
                this.zzyz = null;
            } catch (InterruptedException | ExecutionException e) {
            } catch (TimeoutException e2) {
                this.zzyz.cancel(true);
            }
        }
        return this.zzyy;
    }

    public final int zzbu() {
        if (this.zzzd != null) {
            return zzdu.zzbu();
        }
        return Integer.MIN_VALUE;
    }
}
