package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.collection.ArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbow implements zzbtm, zzbuj {
    private final zzbbg zzbpa;
    private final zzbfq zzdgc;
    private final zzdkx zzfpf;
    private IObjectWrapper zzfpg;
    private boolean zzfph;
    private final Context zzvr;

    public zzbow(Context context, zzbfq zzbfq, zzdkx zzdkx, zzbbg zzbbg) {
        this.zzvr = context;
        this.zzdgc = zzbfq;
        this.zzfpf = zzdkx;
        this.zzbpa = zzbbg;
    }

    public final synchronized void onAdLoaded() {
        if (!this.zzfph) {
            zzaii();
        }
    }

    public final synchronized void onAdImpression() {
        if (!this.zzfph) {
            zzaii();
        }
        if (!(!this.zzfpf.zzdsr || this.zzfpg == null || this.zzdgc == null)) {
            this.zzdgc.zza("onSdkImpression", new ArrayMap());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0081, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void zzaii() {
        /*
            r10 = this;
            monitor-enter(r10)
            com.google.android.gms.internal.ads.zzdkx r0 = r10.zzfpf     // Catch:{ all -> 0x0082 }
            boolean r0 = r0.zzdsr     // Catch:{ all -> 0x0082 }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r10)
            return
        L_0x0009:
            com.google.android.gms.internal.ads.zzbfq r0 = r10.zzdgc     // Catch:{ all -> 0x0082 }
            if (r0 != 0) goto L_0x000f
            monitor-exit(r10)
            return
        L_0x000f:
            com.google.android.gms.internal.ads.zzaqi r0 = com.google.android.gms.ads.internal.zzp.zzle()     // Catch:{ all -> 0x0082 }
            android.content.Context r1 = r10.zzvr     // Catch:{ all -> 0x0082 }
            boolean r0 = r0.zzp(r1)     // Catch:{ all -> 0x0082 }
            if (r0 != 0) goto L_0x001d
            monitor-exit(r10)
            return
        L_0x001d:
            com.google.android.gms.internal.ads.zzbbg r0 = r10.zzbpa     // Catch:{ all -> 0x0082 }
            int r0 = r0.zzedq     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.ads.zzbbg r1 = r10.zzbpa     // Catch:{ all -> 0x0082 }
            int r1 = r1.zzedr     // Catch:{ all -> 0x0082 }
            r2 = 23
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0082 }
            r3.<init>(r2)     // Catch:{ all -> 0x0082 }
            r3.append(r0)     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "."
            r3.append(r0)     // Catch:{ all -> 0x0082 }
            r3.append(r1)     // Catch:{ all -> 0x0082 }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.ads.zzdkx r0 = r10.zzfpf     // Catch:{ all -> 0x0082 }
            com.google.android.gms.ads.nonagon.transaction.omid.OmidSettings r0 = r0.zzhay     // Catch:{ all -> 0x0082 }
            java.lang.String r9 = r0.getVideoEventsOwner()     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.ads.zzaqi r4 = com.google.android.gms.ads.internal.zzp.zzle()     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.ads.zzbfq r0 = r10.zzdgc     // Catch:{ all -> 0x0082 }
            android.webkit.WebView r6 = r0.getWebView()     // Catch:{ all -> 0x0082 }
            java.lang.String r7 = ""
            java.lang.String r8 = "javascript"
            com.google.android.gms.dynamic.IObjectWrapper r0 = r4.zza(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0082 }
            r10.zzfpg = r0     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.ads.zzbfq r0 = r10.zzdgc     // Catch:{ all -> 0x0082 }
            android.view.View r0 = r0.getView()     // Catch:{ all -> 0x0082 }
            com.google.android.gms.dynamic.IObjectWrapper r1 = r10.zzfpg     // Catch:{ all -> 0x0082 }
            if (r1 == 0) goto L_0x0080
            if (r0 == 0) goto L_0x0080
            com.google.android.gms.internal.ads.zzaqi r1 = com.google.android.gms.ads.internal.zzp.zzle()     // Catch:{ all -> 0x0082 }
            com.google.android.gms.dynamic.IObjectWrapper r2 = r10.zzfpg     // Catch:{ all -> 0x0082 }
            r1.zza(r2, r0)     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.ads.zzbfq r0 = r10.zzdgc     // Catch:{ all -> 0x0082 }
            com.google.android.gms.dynamic.IObjectWrapper r1 = r10.zzfpg     // Catch:{ all -> 0x0082 }
            r0.zzap(r1)     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.ads.zzaqi r0 = com.google.android.gms.ads.internal.zzp.zzle()     // Catch:{ all -> 0x0082 }
            com.google.android.gms.dynamic.IObjectWrapper r1 = r10.zzfpg     // Catch:{ all -> 0x0082 }
            r0.zzab(r1)     // Catch:{ all -> 0x0082 }
            r0 = 1
            r10.zzfph = r0     // Catch:{ all -> 0x0082 }
        L_0x0080:
            monitor-exit(r10)
            return
        L_0x0082:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbow.zzaii():void");
    }
}
