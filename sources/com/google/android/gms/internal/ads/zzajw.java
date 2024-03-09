package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.util.Predicate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class zzajw<ReferenceT> implements zzajt {
    private final Map<String, CopyOnWriteArrayList<zzahf<? super ReferenceT>>> zzdfz = new HashMap();
    private ReferenceT zzdga;

    public final void zzg(ReferenceT referencet) {
        this.zzdga = referencet;
    }

    public final boolean zzdg(String str) {
        return str != null && zzg(Uri.parse(str));
    }

    public final boolean zzg(Uri uri) {
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            return false;
        }
        zzh(uri);
        return true;
    }

    public final void zzh(Uri uri) {
        String path = uri.getPath();
        zzp.zzkp();
        zzb(path, zzayh.zzj(uri));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c3, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void zzb(java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 2
            boolean r0 = com.google.android.gms.internal.ads.zzaxy.isLoggable(r0)     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = "Received GMSG: "
            java.lang.String r1 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00c4 }
            int r2 = r1.length()     // Catch:{ all -> 0x00c4 }
            if (r2 == 0) goto L_0x0019
            java.lang.String r0 = r0.concat(r1)     // Catch:{ all -> 0x00c4 }
            goto L_0x001f
        L_0x0019:
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x00c4 }
            r1.<init>(r0)     // Catch:{ all -> 0x00c4 }
            r0 = r1
        L_0x001f:
            com.google.android.gms.internal.ads.zzaxy.zzei(r0)     // Catch:{ all -> 0x00c4 }
            java.util.Set r0 = r7.keySet()     // Catch:{ all -> 0x00c4 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00c4 }
        L_0x002a:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x00c4 }
            if (r1 == 0) goto L_0x006c
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x00c4 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00c4 }
            java.lang.Object r2 = r7.get(r1)     // Catch:{ all -> 0x00c4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00c4 }
            int r3 = r3.length()     // Catch:{ all -> 0x00c4 }
            int r3 = r3 + 4
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00c4 }
            int r4 = r4.length()     // Catch:{ all -> 0x00c4 }
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c4 }
            r4.<init>(r3)     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = "  "
            r4.append(r3)     // Catch:{ all -> 0x00c4 }
            r4.append(r1)     // Catch:{ all -> 0x00c4 }
            java.lang.String r1 = ": "
            r4.append(r1)     // Catch:{ all -> 0x00c4 }
            r4.append(r2)     // Catch:{ all -> 0x00c4 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00c4 }
            com.google.android.gms.internal.ads.zzaxy.zzei(r1)     // Catch:{ all -> 0x00c4 }
            goto L_0x002a
        L_0x006c:
            java.util.Map<java.lang.String, java.util.concurrent.CopyOnWriteArrayList<com.google.android.gms.internal.ads.zzahf<? super ReferenceT>>> r0 = r5.zzdfz     // Catch:{ all -> 0x00c4 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x00c4 }
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x0099
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x00c4 }
            if (r1 != 0) goto L_0x0099
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x00c4 }
        L_0x0080:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x0097
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x00c4 }
            com.google.android.gms.internal.ads.zzahf r0 = (com.google.android.gms.internal.ads.zzahf) r0     // Catch:{ all -> 0x00c4 }
            com.google.android.gms.internal.ads.zzdvw r1 = com.google.android.gms.internal.ads.zzbbi.zzedy     // Catch:{ all -> 0x00c4 }
            com.google.android.gms.internal.ads.zzajv r2 = new com.google.android.gms.internal.ads.zzajv     // Catch:{ all -> 0x00c4 }
            r2.<init>(r5, r0, r7)     // Catch:{ all -> 0x00c4 }
            r1.execute(r2)     // Catch:{ all -> 0x00c4 }
            goto L_0x0080
        L_0x0097:
            monitor-exit(r5)
            return
        L_0x0099:
            com.google.android.gms.internal.ads.zzaai<java.lang.Boolean> r7 = com.google.android.gms.internal.ads.zzaat.zzcwx     // Catch:{ all -> 0x00c4 }
            com.google.android.gms.internal.ads.zzaap r0 = com.google.android.gms.internal.ads.zzwe.zzpu()     // Catch:{ all -> 0x00c4 }
            java.lang.Object r7 = r0.zzd(r7)     // Catch:{ all -> 0x00c4 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x00c4 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x00c4 }
            if (r7 == 0) goto L_0x00c2
            com.google.android.gms.internal.ads.zzaxk r7 = com.google.android.gms.ads.internal.zzp.zzkt()     // Catch:{ all -> 0x00c4 }
            com.google.android.gms.internal.ads.zzaba r7 = r7.zzwd()     // Catch:{ all -> 0x00c4 }
            if (r7 != 0) goto L_0x00b6
            goto L_0x00c2
        L_0x00b6:
            com.google.android.gms.internal.ads.zzdvw r7 = com.google.android.gms.internal.ads.zzbbi.zzedu     // Catch:{ all -> 0x00c4 }
            com.google.android.gms.internal.ads.zzajy r0 = new com.google.android.gms.internal.ads.zzajy     // Catch:{ all -> 0x00c4 }
            r0.<init>(r6)     // Catch:{ all -> 0x00c4 }
            r7.execute(r0)     // Catch:{ all -> 0x00c4 }
            monitor-exit(r5)
            return
        L_0x00c2:
            monitor-exit(r5)
            return
        L_0x00c4:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajw.zzb(java.lang.String, java.util.Map):void");
    }

    public final synchronized void zza(String str, zzahf<? super ReferenceT> zzahf) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zzdfz.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.zzdfz.put(str, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(zzahf);
    }

    public final synchronized void zzb(String str, zzahf<? super ReferenceT> zzahf) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zzdfz.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(zzahf);
        }
    }

    public final synchronized void zza(String str, Predicate<zzahf<? super ReferenceT>> predicate) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zzdfz.get(str);
        if (copyOnWriteArrayList != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                zzahf zzahf = (zzahf) it.next();
                if (predicate.apply(zzahf)) {
                    arrayList.add(zzahf);
                }
            }
            copyOnWriteArrayList.removeAll(arrayList);
        }
    }

    public final synchronized void reset() {
        this.zzdfz.clear();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzahf zzahf, Map map) {
        zzahf.zza(this.zzdga, map);
    }
}
