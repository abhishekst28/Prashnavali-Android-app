package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzduo implements Runnable {
    private final /* synthetic */ zzdvt zzhox;
    private final /* synthetic */ int zzhoy;
    private final /* synthetic */ zzdup zzhoz;

    zzduo(zzdup zzdup, zzdvt zzdvt, int i) {
        this.zzhoz = zzdup;
        this.zzhox = zzdvt;
        this.zzhoy = i;
    }

    public final void run() {
        try {
            if (this.zzhox.isCancelled()) {
                zzdtf unused = this.zzhoz.zzhpa = null;
                this.zzhoz.cancel(false);
            } else {
                this.zzhoz.zza(this.zzhoy, this.zzhox);
            }
        } finally {
            this.zzhoz.zza((zzdtf) null);
        }
    }
}
