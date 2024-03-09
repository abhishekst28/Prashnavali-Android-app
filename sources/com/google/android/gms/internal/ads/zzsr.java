package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzsr implements Runnable {
    private final /* synthetic */ zzss zzbuu;

    zzsr(zzss zzss) {
        this.zzbuu = zzss;
    }

    public final void run() {
        this.zzbuu.disconnect();
    }
}
