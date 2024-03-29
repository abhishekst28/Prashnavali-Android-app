package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzp;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzrd {
    private final Object lock = new Object();
    private int zzbrz;
    private List<zzre> zzbsa = new LinkedList();

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005e, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzre zzo(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.lock
            monitor-enter(r0)
            java.util.List<com.google.android.gms.internal.ads.zzre> r1 = r7.zzbsa     // Catch:{ all -> 0x005f }
            int r1 = r1.size()     // Catch:{ all -> 0x005f }
            r2 = 0
            if (r1 != 0) goto L_0x0013
            java.lang.String r8 = "Queue empty"
            com.google.android.gms.internal.ads.zzaxy.zzef(r8)     // Catch:{ all -> 0x005f }
            monitor-exit(r0)     // Catch:{ all -> 0x005f }
            return r2
        L_0x0013:
            java.util.List<com.google.android.gms.internal.ads.zzre> r1 = r7.zzbsa     // Catch:{ all -> 0x005f }
            int r1 = r1.size()     // Catch:{ all -> 0x005f }
            r3 = 2
            r4 = 0
            if (r1 < r3) goto L_0x004a
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            java.util.List<com.google.android.gms.internal.ads.zzre> r1 = r7.zzbsa     // Catch:{ all -> 0x005f }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x005f }
            r3 = 0
        L_0x0029:
            boolean r5 = r1.hasNext()     // Catch:{ all -> 0x005f }
            if (r5 == 0) goto L_0x0043
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x005f }
            com.google.android.gms.internal.ads.zzre r5 = (com.google.android.gms.internal.ads.zzre) r5     // Catch:{ all -> 0x005f }
            int r6 = r5.getScore()     // Catch:{ all -> 0x005f }
            if (r6 <= r8) goto L_0x0040
            r4 = r3
            r2 = r5
            r8 = r6
        L_0x0040:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x0043:
            java.util.List<com.google.android.gms.internal.ads.zzre> r8 = r7.zzbsa     // Catch:{ all -> 0x005f }
            r8.remove(r4)     // Catch:{ all -> 0x005f }
            monitor-exit(r0)     // Catch:{ all -> 0x005f }
            return r2
        L_0x004a:
            java.util.List<com.google.android.gms.internal.ads.zzre> r1 = r7.zzbsa     // Catch:{ all -> 0x005f }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x005f }
            com.google.android.gms.internal.ads.zzre r1 = (com.google.android.gms.internal.ads.zzre) r1     // Catch:{ all -> 0x005f }
            if (r8 == 0) goto L_0x005a
            java.util.List<com.google.android.gms.internal.ads.zzre> r8 = r7.zzbsa     // Catch:{ all -> 0x005f }
            r8.remove(r4)     // Catch:{ all -> 0x005f }
            goto L_0x005d
        L_0x005a:
            r1.zzma()     // Catch:{ all -> 0x005f }
        L_0x005d:
            monitor-exit(r0)     // Catch:{ all -> 0x005f }
            return r1
        L_0x005f:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005f }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrd.zzo(boolean):com.google.android.gms.internal.ads.zzre");
    }

    public final boolean zza(zzre zzre) {
        synchronized (this.lock) {
            if (this.zzbsa.contains(zzre)) {
                return true;
            }
            return false;
        }
    }

    public final boolean zzb(zzre zzre) {
        synchronized (this.lock) {
            Iterator<zzre> it = this.zzbsa.iterator();
            while (it.hasNext()) {
                zzre next = it.next();
                if (!zzp.zzkt().zzwj().zzwy()) {
                    if (zzre != next && next.zzlx().equals(zzre.zzlx())) {
                        it.remove();
                        return true;
                    }
                } else if (!zzp.zzkt().zzwj().zzxa() && zzre != next && next.zzlz().equals(zzre.zzlz())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final void zzc(zzre zzre) {
        synchronized (this.lock) {
            if (this.zzbsa.size() >= 10) {
                int size = this.zzbsa.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                zzaxy.zzef(sb.toString());
                this.zzbsa.remove(0);
            }
            int i = this.zzbrz;
            this.zzbrz = i + 1;
            zzre.zzbw(i);
            zzre.zzmd();
            this.zzbsa.add(zzre);
        }
    }
}
