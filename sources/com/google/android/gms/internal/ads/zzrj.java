package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzrj implements Runnable {
    private final /* synthetic */ View zzbsz;
    private final /* synthetic */ zzrk zzbta;

    zzrj(zzrk zzrk, View view) {
        this.zzbta = zzrk;
        this.zzbsz = view;
    }

    public final void run() {
        this.zzbta.zzj(this.zzbsz);
    }
}
