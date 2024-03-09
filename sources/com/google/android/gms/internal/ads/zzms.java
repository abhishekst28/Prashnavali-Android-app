package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzms implements Runnable {
    private final /* synthetic */ zzmn zzbeg;
    private final /* synthetic */ zzmt zzbei;

    zzms(zzmn zzmn, zzmt zzmt) {
        this.zzbeg = zzmn;
        this.zzbei = zzmt;
    }

    public final void run() {
        this.zzbei.release();
        int size = this.zzbeg.zzbdq.size();
        for (int i = 0; i < size; i++) {
            ((zznh) this.zzbeg.zzbdq.valueAt(i)).disable();
        }
    }
}
