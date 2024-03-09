package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zztj extends PushbackInputStream {
    private final /* synthetic */ zzti zzbvo;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zztj(zzti zzti, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.zzbvo = zzti;
    }

    public final synchronized void close() throws IOException {
        this.zzbvo.zzbvg.disconnect();
        super.close();
    }
}
