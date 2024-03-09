package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzmr implements Runnable {
    private final /* synthetic */ zzmn zzbeg;
    private final /* synthetic */ IOException zzbeh;

    zzmr(zzmn zzmn, IOException iOException) {
        this.zzbeg = zzmn;
        this.zzbeh = iOException;
    }

    public final void run() {
        this.zzbeg.zzbdg.zzb(this.zzbeh);
    }
}
