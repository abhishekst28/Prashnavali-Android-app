package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcls {
    private List<Map<String, String>> zzgfs = new ArrayList();
    private boolean zzgft = false;
    private boolean zzgfu = false;
    private String zzgfv;
    private zzcln zzgfw;

    public zzcls(String str, zzcln zzcln) {
        this.zzgfv = str;
        this.zzgfw = zzcln;
    }

    public final synchronized void zzgj(String str) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcqc)).booleanValue()) {
            Map<String, String> zzaow = zzaow();
            zzaow.put("action", "adapter_init_started");
            zzaow.put("ancn", str);
            this.zzgfs.add(zzaow);
        }
    }

    public final synchronized void zzgk(String str) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcqc)).booleanValue()) {
            Map<String, String> zzaow = zzaow();
            zzaow.put("action", "adapter_init_finished");
            zzaow.put("ancn", str);
            this.zzgfs.add(zzaow);
        }
    }

    public final synchronized void zzr(String str, String str2) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcqc)).booleanValue()) {
            Map<String, String> zzaow = zzaow();
            zzaow.put("action", "adapter_init_finished");
            zzaow.put("ancn", str);
            zzaow.put("rqe", str2);
            this.zzgfs.add(zzaow);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzaou() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzaai<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzaat.zzcqc     // Catch:{ all -> 0x002e }
            com.google.android.gms.internal.ads.zzaap r1 = com.google.android.gms.internal.ads.zzwe.zzpu()     // Catch:{ all -> 0x002e }
            java.lang.Object r0 = r1.zzd(r0)     // Catch:{ all -> 0x002e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x002e }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x0015
            monitor-exit(r3)
            return
        L_0x0015:
            boolean r0 = r3.zzgft     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x002c
            java.util.Map r0 = r3.zzaow()     // Catch:{ all -> 0x002e }
            java.lang.String r1 = "action"
            java.lang.String r2 = "init_started"
            r0.put(r1, r2)     // Catch:{ all -> 0x002e }
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r1 = r3.zzgfs     // Catch:{ all -> 0x002e }
            r1.add(r0)     // Catch:{ all -> 0x002e }
            r0 = 1
            r3.zzgft = r0     // Catch:{ all -> 0x002e }
        L_0x002c:
            monitor-exit(r3)
            return
        L_0x002e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcls.zzaou():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzaov() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzaai<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzaat.zzcqc     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.ads.zzaap r1 = com.google.android.gms.internal.ads.zzwe.zzpu()     // Catch:{ all -> 0x0047 }
            java.lang.Object r0 = r1.zzd(r0)     // Catch:{ all -> 0x0047 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x0015
            monitor-exit(r3)
            return
        L_0x0015:
            boolean r0 = r3.zzgfu     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x0045
            java.util.Map r0 = r3.zzaow()     // Catch:{ all -> 0x0047 }
            java.lang.String r1 = "action"
            java.lang.String r2 = "init_finished"
            r0.put(r1, r2)     // Catch:{ all -> 0x0047 }
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r1 = r3.zzgfs     // Catch:{ all -> 0x0047 }
            r1.add(r0)     // Catch:{ all -> 0x0047 }
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r0 = r3.zzgfs     // Catch:{ all -> 0x0047 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0047 }
        L_0x0030:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0042
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0047 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.ads.zzcln r2 = r3.zzgfw     // Catch:{ all -> 0x0047 }
            r2.zzn(r1)     // Catch:{ all -> 0x0047 }
            goto L_0x0030
        L_0x0042:
            r0 = 1
            r3.zzgfu = r0     // Catch:{ all -> 0x0047 }
        L_0x0045:
            monitor-exit(r3)
            return
        L_0x0047:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcls.zzaov():void");
    }

    private final Map<String, String> zzaow() {
        Map<String, String> zzaos = this.zzgfw.zzaos();
        zzaos.put("tms", Long.toString(zzp.zzkw().elapsedRealtime(), 10));
        zzaos.put("tid", this.zzgfv);
        return zzaos;
    }
}
