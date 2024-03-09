package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class zzekw extends zzeky implements zzbp {
    private String type;
    private long zzawj;
    private zzbs zzipz;
    private boolean zziqh;

    public zzekw(String str) {
        this.type = str;
    }

    public final void zza(zzbs zzbs) {
        this.zzipz = zzbs;
    }

    public final String getType() {
        return this.type;
    }

    public final void zza(zzela zzela, ByteBuffer byteBuffer, long j, zzbo zzbo) throws IOException {
        this.zzawj = zzela.position() - ((long) byteBuffer.remaining());
        this.zziqh = byteBuffer.remaining() == 16;
        zza(zzela, j, zzbo);
    }

    public final void zza(zzela zzela, long j, zzbo zzbo) throws IOException {
        this.zziqf = zzela;
        this.zziql = zzela.position();
        this.zzbgh = this.zziql - ((long) ((this.zziqh || 8 + j >= 4294967296L) ? 16 : 8));
        zzela.zzfc(zzela.position() + j);
        this.zzawf = zzela.position();
        this.zziqj = zzbo;
    }
}
