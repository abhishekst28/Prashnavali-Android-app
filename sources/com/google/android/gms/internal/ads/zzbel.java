package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbel implements zzom {
    private Uri uri;
    private final zzom zzekj;
    private final long zzekk;
    private final zzom zzekl;
    private long zzekm;

    zzbel(zzom zzom, int i, zzom zzom2) {
        this.zzekj = zzom;
        this.zzekk = (long) i;
        this.zzekl = zzom2;
    }

    public final long zza(zzon zzon) throws IOException {
        zzon zzon2;
        long j;
        long j2;
        long j3;
        zzon zzon3 = zzon;
        this.uri = zzon3.uri;
        zzon zzon4 = null;
        if (zzon3.position >= this.zzekk) {
            zzon2 = null;
        } else {
            long j4 = zzon3.position;
            if (zzon3.zzcp != -1) {
                j3 = Math.min(zzon3.zzcp, this.zzekk - j4);
            } else {
                j3 = this.zzekk - j4;
            }
            zzon2 = new zzon(zzon3.uri, j4, j3, (String) null);
        }
        if (zzon3.zzcp == -1 || zzon3.position + zzon3.zzcp > this.zzekk) {
            long max = Math.max(this.zzekk, zzon3.position);
            if (zzon3.zzcp != -1) {
                j2 = Math.min(zzon3.zzcp, (zzon3.position + zzon3.zzcp) - this.zzekk);
            } else {
                j2 = -1;
            }
            zzon4 = new zzon(zzon3.uri, max, j2, (String) null);
        }
        long j5 = 0;
        if (zzon2 != null) {
            j = this.zzekj.zza(zzon2);
        } else {
            j = 0;
        }
        if (zzon4 != null) {
            j5 = this.zzekl.zza(zzon4);
        }
        this.zzekm = zzon3.position;
        if (j == -1 || j5 == -1) {
            return -1;
        }
        return j + j5;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.zzekm;
        long j2 = this.zzekk;
        if (j < j2) {
            i3 = this.zzekj.read(bArr, i, (int) Math.min((long) i2, j2 - j));
            this.zzekm += (long) i3;
        } else {
            i3 = 0;
        }
        if (this.zzekm < this.zzekk) {
            return i3;
        }
        int read = this.zzekl.read(bArr, i + i3, i2 - i3);
        int i4 = i3 + read;
        this.zzekm += (long) read;
        return i4;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final void close() throws IOException {
        this.zzekj.close();
        this.zzekl.close();
    }
}
