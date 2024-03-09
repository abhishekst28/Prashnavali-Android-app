package com.google.android.gms.internal.ads;

import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbda implements Runnable {
    zzbda(zzbdb zzbdb) {
    }

    public final void run() {
        Looper.myLooper().quit();
    }
}
