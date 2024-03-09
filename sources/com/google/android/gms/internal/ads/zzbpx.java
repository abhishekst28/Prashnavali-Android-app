package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbpx implements zzo {
    private final zzbtu zzfqj;
    private AtomicBoolean zzfqk = new AtomicBoolean(false);

    public zzbpx(zzbtu zzbtu) {
        this.zzfqj = zzbtu;
    }

    public final void zzui() {
        this.zzfqk.set(true);
        this.zzfqj.onAdClosed();
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public final void zzuj() {
        this.zzfqj.onAdOpened();
    }

    public final boolean isClosed() {
        return this.zzfqk.get();
    }
}
