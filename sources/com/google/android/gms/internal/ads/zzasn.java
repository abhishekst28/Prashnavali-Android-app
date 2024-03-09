package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzasn implements Runnable {
    private final OutputStream zzdtb;
    private final byte[] zzdtc;

    zzasn(OutputStream outputStream, byte[] bArr) {
        this.zzdtb = outputStream;
        this.zzdtc = bArr;
    }

    public final void run() {
        zzask.zza(this.zzdtb, this.zzdtc);
    }
}
