package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzaba {
    private File file;
    private String zzbra;
    private String zzcya;
    private BlockingQueue<zzabk> zzcyd = new ArrayBlockingQueue(100);
    private LinkedHashMap<String, String> zzcye = new LinkedHashMap<>();
    private Map<String, zzabe> zzcyf = new HashMap();
    private final HashSet<String> zzcyg = new HashSet<>(Arrays.asList(new String[]{"noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"}));
    private AtomicBoolean zzcyh;
    private Context zzvr;

    public final void zza(Context context, String str, String str2, Map<String, String> map) {
        File externalStorageDirectory;
        this.zzvr = context;
        this.zzbra = str;
        this.zzcya = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.zzcyh = atomicBoolean;
        atomicBoolean.set(zzack.zzdag.get().booleanValue());
        if (this.zzcyh.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.file = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry next : map.entrySet()) {
            this.zzcye.put((String) next.getKey(), (String) next.getValue());
        }
        zzbbi.zzedu.execute(new zzaaz(this));
        this.zzcyf.put("action", zzabe.zzcyj);
        this.zzcyf.put("ad_format", zzabe.zzcyj);
        this.zzcyf.put("e", zzabe.zzcyk);
    }

    public final boolean zza(zzabk zzabk) {
        return this.zzcyd.offer(zzabk);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0088 A[SYNTHETIC, Splitter:B:32:0x0088] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0094 A[SYNTHETIC, Splitter:B:38:0x0094] */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zza(java.util.Map<java.lang.String, java.lang.String> r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "CsiReporter: Cannot close file: sdk_csi_data.txt."
            java.lang.String r1 = r4.zzcya
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.net.Uri$Builder r1 = r1.buildUpon()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0014:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0030
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r1.appendQueryParameter(r3, r2)
            goto L_0x0014
        L_0x0030:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            android.net.Uri r1 = r1.build()
            java.lang.String r1 = r1.toString()
            r5.<init>(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L_0x004b
            java.lang.String r1 = "&it="
            r5.append(r1)
            r5.append(r6)
        L_0x004b:
            java.lang.String r5 = r5.toString()
            java.util.concurrent.atomic.AtomicBoolean r6 = r4.zzcyh
            boolean r6 = r6.get()
            if (r6 == 0) goto L_0x00a5
            java.io.File r6 = r4.file
            if (r6 == 0) goto L_0x009f
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0080 }
            r3 = 1
            r2.<init>(r6, r3)     // Catch:{ IOException -> 0x0080 }
            byte[] r5 = r5.getBytes()     // Catch:{ IOException -> 0x007b, all -> 0x0078 }
            r2.write(r5)     // Catch:{ IOException -> 0x007b, all -> 0x0078 }
            r5 = 10
            r2.write(r5)     // Catch:{ IOException -> 0x007b, all -> 0x0078 }
            r2.close()     // Catch:{ IOException -> 0x0073 }
            return
        L_0x0073:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzaxy.zzd(r0, r5)
            return
        L_0x0078:
            r5 = move-exception
            r1 = r2
            goto L_0x0092
        L_0x007b:
            r5 = move-exception
            r1 = r2
            goto L_0x0081
        L_0x007e:
            r5 = move-exception
            goto L_0x0092
        L_0x0080:
            r5 = move-exception
        L_0x0081:
            java.lang.String r6 = "CsiReporter: Cannot write to file: sdk_csi_data.txt."
            com.google.android.gms.internal.ads.zzaxy.zzd(r6, r5)     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x0091
            r1.close()     // Catch:{ IOException -> 0x008c }
            goto L_0x0091
        L_0x008c:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzaxy.zzd(r0, r5)
            return
        L_0x0091:
            return
        L_0x0092:
            if (r1 == 0) goto L_0x009d
            r1.close()     // Catch:{ IOException -> 0x0098 }
            goto L_0x009d
        L_0x0098:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzaxy.zzd(r0, r6)
            goto L_0x009e
        L_0x009d:
        L_0x009e:
            throw r5
        L_0x009f:
            java.lang.String r5 = "CsiReporter: File doesn't exists. Cannot write CSI data to file."
            com.google.android.gms.internal.ads.zzaxy.zzfe(r5)
            return
        L_0x00a5:
            com.google.android.gms.ads.internal.zzp.zzkp()
            android.content.Context r6 = r4.zzvr
            java.lang.String r0 = r4.zzbra
            com.google.android.gms.internal.ads.zzayh.zzb(r6, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaba.zza(java.util.Map, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> zza(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Map.Entry next : map2.entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, zzcu(str).zzg(str2, (String) next.getValue()));
        }
        return linkedHashMap;
    }

    public final zzabe zzcu(String str) {
        zzabe zzabe = this.zzcyf.get(str);
        return zzabe != null ? zzabe : zzabe.zzcyi;
    }

    public final void zzcv(String str) {
        if (!this.zzcyg.contains(str)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("sdkVersion", this.zzbra);
            linkedHashMap.put("ue", str);
            zza(zza((Map<String, String>) this.zzcye, (Map<String, String>) linkedHashMap), "");
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzrl() {
        while (true) {
            try {
                zzabk take = this.zzcyd.take();
                String zzrq = take.zzrq();
                if (!TextUtils.isEmpty(zzrq)) {
                    zza(zza((Map<String, String>) this.zzcye, take.zzrr()), zzrq);
                }
            } catch (InterruptedException e) {
                zzaxy.zzd("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }
}
