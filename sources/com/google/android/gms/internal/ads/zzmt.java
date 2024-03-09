package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzmt {
    private final zzjx zzarf;
    private final zzjv[] zzbej;
    private zzjv zzbek;

    public zzmt(zzjv[] zzjvArr, zzjx zzjx) {
        this.zzbej = zzjvArr;
        this.zzarf = zzjx;
    }

    public final zzjv zza(zzjy zzjy, Uri uri) throws IOException, InterruptedException {
        zzjv zzjv = this.zzbek;
        if (zzjv != null) {
            return zzjv;
        }
        zzjv[] zzjvArr = this.zzbej;
        int length = zzjvArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            zzjv zzjv2 = zzjvArr[i];
            try {
                if (zzjv2.zza(zzjy)) {
                    this.zzbek = zzjv2;
                    zzjy.zzgo();
                    break;
                }
                i++;
            } catch (EOFException e) {
            } finally {
                zzjy.zzgo();
            }
        }
        zzjv zzjv3 = this.zzbek;
        if (zzjv3 != null) {
            zzjv3.zza(this.zzarf);
            return this.zzbek;
        }
        String zza = zzpq.zza((Object[]) this.zzbej);
        StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 58);
        sb.append("None of the available extractors (");
        sb.append(zza);
        sb.append(") could read the stream.");
        throw new zzns(sb.toString(), uri);
    }

    public final void release() {
        zzjv zzjv = this.zzbek;
        if (zzjv != null) {
            zzjv.release();
            this.zzbek = null;
        }
    }
}
