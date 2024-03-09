package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzri implements Runnable {
    private final /* synthetic */ zzrf zzbsy;

    zzri(zzrf zzrf) {
        this.zzbsy = zzrf;
    }

    public final void run() {
        synchronized (this.zzbsy.lock) {
            if (!this.zzbsy.foreground || !this.zzbsy.zzbsq) {
                zzaxy.zzef("App is still foreground");
            } else {
                boolean unused = this.zzbsy.foreground = false;
                zzaxy.zzef("App went background");
                for (zzrh zzp : this.zzbsy.zzbsr) {
                    try {
                        zzp.zzp(false);
                    } catch (Exception e) {
                        zzbbd.zzc("", e);
                    }
                }
            }
        }
    }
}
