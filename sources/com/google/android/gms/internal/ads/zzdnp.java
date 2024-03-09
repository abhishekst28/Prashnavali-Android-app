package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbpd;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdnp<AdT extends zzbpd> {
    /* access modifiers changed from: private */
    public final zzdna zzgyr;
    private final zzdmt zzhfn;
    /* access modifiers changed from: private */
    public zzdnv zzhfo;
    /* access modifiers changed from: private */
    public zzdwe<zzdnh<AdT>> zzhfp;
    private zzdvt<zzdnh<AdT>> zzhfq;
    /* access modifiers changed from: private */
    public int zzhfr = zzdnf.zzhez;
    /* access modifiers changed from: private */
    public final zzdnw<AdT> zzhfs;
    private final LinkedList<zzdnv> zzhft;
    private final zzdvi<zzdnh<AdT>> zzhfu = new zzdnu(this);

    public zzdnp(zzdna zzdna, zzdmt zzdmt, zzdnw<AdT> zzdnw) {
        this.zzgyr = zzdna;
        this.zzhfn = zzdmt;
        this.zzhfs = zzdnw;
        this.zzhft = new LinkedList<>();
        this.zzhfn.zza(new zzdnr(this));
    }

    public final void zzb(zzdnv zzdnv) {
        this.zzhft.add(zzdnv);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.zzdvt<com.google.android.gms.internal.ads.zzdnt<AdT>> zzc(com.google.android.gms.internal.ads.zzdnv r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzaty()     // Catch:{ all -> 0x0044 }
            r1 = 0
            if (r0 == 0) goto L_0x000a
            monitor-exit(r3)
            return r1
        L_0x000a:
            int r0 = com.google.android.gms.internal.ads.zzdnf.zzhfb     // Catch:{ all -> 0x0044 }
            r3.zzhfr = r0     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.zzdnv r0 = r3.zzhfo     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.zzdnk r0 = r0.zzasd()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0042
            com.google.android.gms.internal.ads.zzdnk r0 = r4.zzasd()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0042
            com.google.android.gms.internal.ads.zzdnv r0 = r3.zzhfo     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.zzdnk r0 = r0.zzasd()     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.zzdnk r2 = r4.zzasd()     // Catch:{ all -> 0x0044 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x002d
            goto L_0x0042
        L_0x002d:
            int r0 = com.google.android.gms.internal.ads.zzdnf.zzhfa     // Catch:{ all -> 0x0044 }
            r3.zzhfr = r0     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.zzdwe<com.google.android.gms.internal.ads.zzdnh<AdT>> r0 = r3.zzhfp     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.zzdns r1 = new com.google.android.gms.internal.ads.zzdns     // Catch:{ all -> 0x0044 }
            r1.<init>(r3)     // Catch:{ all -> 0x0044 }
            java.util.concurrent.Executor r4 = r4.getExecutor()     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.zzdvt r4 = com.google.android.gms.internal.ads.zzdvl.zzb(r0, r1, (java.util.concurrent.Executor) r4)     // Catch:{ all -> 0x0044 }
            monitor-exit(r3)
            return r4
        L_0x0042:
            monitor-exit(r3)
            return r1
        L_0x0044:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdnp.zzc(com.google.android.gms.internal.ads.zzdnv):com.google.android.gms.internal.ads.zzdvt");
    }

    /* access modifiers changed from: private */
    public final void zzd(zzdnv zzdnv) {
        while (zzaty()) {
            if (zzdnv != null || !this.zzhft.isEmpty()) {
                if (zzdnv == null) {
                    zzdnv = this.zzhft.remove();
                }
                if (zzdnv.zzasd() == null || !this.zzgyr.zzb(zzdnv.zzasd())) {
                    zzdnv = null;
                } else {
                    this.zzhfo = zzdnv.zzase();
                    this.zzhfp = zzdwe.zzaxn();
                    zzdvt<zzdnh<AdT>> zza = this.zzhfs.zza(this.zzhfo);
                    this.zzhfq = zza;
                    zzdvl.zza(zza, this.zzhfu, zzdnv.getExecutor());
                    return;
                }
            } else {
                return;
            }
        }
        if (zzdnv != null) {
            this.zzhft.add(zzdnv);
        }
    }

    private final boolean zzaty() {
        zzdvt<zzdnh<AdT>> zzdvt = this.zzhfq;
        return zzdvt == null || zzdvt.isDone();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzatz() {
        synchronized (this) {
            zzd(this.zzhfo);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zzc(zzdnh zzdnh) throws Exception {
        zzdvt zzaf;
        synchronized (this) {
            zzaf = zzdvl.zzaf(new zzdnt(zzdnh, this.zzhfo));
        }
        return zzaf;
    }
}
