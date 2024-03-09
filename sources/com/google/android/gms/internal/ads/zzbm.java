package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public abstract class zzbm implements zzbo {
    private static Logger zzda = Logger.getLogger(zzbm.class.getName());
    private ThreadLocal<ByteBuffer> zzdb = new zzbl(this);

    public abstract zzbp zza(String str, byte[] bArr, String str2);

    public final zzbp zza(zzela zzela, zzbs zzbs) throws IOException {
        int read;
        long j;
        long j2;
        byte[] bArr;
        zzela zzela2 = zzela;
        zzbs zzbs2 = zzbs;
        long position = zzela.position();
        this.zzdb.get().rewind().limit(8);
        do {
            read = zzela2.read(this.zzdb.get());
            if (read == 8) {
                this.zzdb.get().rewind();
                long zzf = zzbq.zzf(this.zzdb.get());
                if (zzf >= 8 || zzf <= 1) {
                    String zzk = zzbq.zzk(this.zzdb.get());
                    if (zzf == 1) {
                        this.zzdb.get().limit(16);
                        zzela2.read(this.zzdb.get());
                        this.zzdb.get().position(8);
                        j = zzbq.zzh(this.zzdb.get()) - 16;
                    } else if (zzf == 0) {
                        j = zzela.size() - zzela.position();
                    } else {
                        j = zzf - 8;
                    }
                    if ("uuid".equals(zzk)) {
                        this.zzdb.get().limit(this.zzdb.get().limit() + 16);
                        zzela2.read(this.zzdb.get());
                        byte[] bArr2 = new byte[16];
                        for (int position2 = this.zzdb.get().position() - 16; position2 < this.zzdb.get().position(); position2++) {
                            bArr2[position2 - (this.zzdb.get().position() - 16)] = this.zzdb.get().get(position2);
                        }
                        long j3 = j - 16;
                        bArr = bArr2;
                        j2 = j3;
                    } else {
                        long j4 = j;
                        bArr = null;
                        j2 = j4;
                    }
                    zzbp zza = zza(zzk, bArr, zzbs2 instanceof zzbp ? ((zzbp) zzbs2).getType() : "");
                    zza.zza(zzbs2);
                    this.zzdb.get().rewind();
                    zza.zza(zzela, this.zzdb.get(), j2, this);
                    return zza;
                }
                Logger logger = zzda;
                Level level = Level.SEVERE;
                StringBuilder sb = new StringBuilder(80);
                sb.append("Plausibility check failed: size < 8 (size = ");
                sb.append(zzf);
                sb.append("). Stop parsing!");
                logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                return null;
            }
        } while (read >= 0);
        zzela2.zzfc(position);
        throw new EOFException();
    }
}
