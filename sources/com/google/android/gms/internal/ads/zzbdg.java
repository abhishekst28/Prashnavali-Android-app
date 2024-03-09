package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbdg implements Runnable {
    private boolean zzbsq = false;
    private zzbcr zzegi;

    zzbdg(zzbcr zzbcr) {
        this.zzegi = zzbcr;
    }

    public final void run() {
        if (!this.zzbsq) {
            this.zzegi.zzzg();
            zzzx();
        }
    }

    public final void pause() {
        this.zzbsq = true;
        this.zzegi.zzzg();
    }

    public final void resume() {
        this.zzbsq = false;
        zzzx();
    }

    private final void zzzx() {
        zzayh.zzeaj.removeCallbacks(this);
        zzayh.zzeaj.postDelayed(this, 250);
    }
}
