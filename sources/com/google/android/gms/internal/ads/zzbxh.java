package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzbxh implements Runnable {
    private final Object zzdij;
    private final zzbxg zzftt;

    zzbxh(zzbxg zzbxg, Object obj) {
        this.zzftt = zzbxg;
        this.zzdij = obj;
    }

    public final void run() {
        try {
            this.zzftt.zzp(this.zzdij);
        } catch (Throwable th) {
            zzp.zzkt().zzb(th, "EventEmitter.notify");
            zzaxy.zza("Event emitter exception.", th);
        }
    }
}
