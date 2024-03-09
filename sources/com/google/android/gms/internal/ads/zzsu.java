package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzsu implements zzrh {
    private final /* synthetic */ zzss zzbuu;

    zzsu(zzss zzss) {
        this.zzbuu = zzss;
    }

    public final void zzp(boolean z) {
        if (z) {
            this.zzbuu.connect();
        } else {
            this.zzbuu.disconnect();
        }
    }
}
