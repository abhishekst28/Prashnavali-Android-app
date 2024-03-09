package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
final class zzeiw extends InputStream {
    private int mark;
    private final /* synthetic */ zzeis zziiz;
    private zzeit zzijj;
    private zzefm zzijk;
    private int zzijl;
    private int zzijm;
    private int zzijn;

    public zzeiw(zzeis zzeis) {
        this.zziiz = zzeis;
        initialize();
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw null;
        } else if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        } else {
            int zzl = zzl(bArr, i, i2);
            if (zzl == 0) {
                return -1;
            }
            return zzl;
        }
    }

    public final long skip(long j) {
        if (j >= 0) {
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return (long) zzl((byte[]) null, 0, (int) j);
        }
        throw new IndexOutOfBoundsException();
    }

    private final int zzl(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            zzbhk();
            if (this.zzijk == null) {
                break;
            }
            int min = Math.min(this.zzijl - this.zzijm, i3);
            if (bArr != null) {
                this.zzijk.zza(bArr, this.zzijm, i, min);
                i += min;
            }
            this.zzijm += min;
            i3 -= min;
        }
        return i2 - i3;
    }

    public final int read() throws IOException {
        zzbhk();
        zzefm zzefm = this.zzijk;
        if (zzefm == null) {
            return -1;
        }
        int i = this.zzijm;
        this.zzijm = i + 1;
        return zzefm.zzfu(i) & 255;
    }

    public final int available() throws IOException {
        return this.zziiz.size() - (this.zzijn + this.zzijm);
    }

    public final boolean markSupported() {
        return true;
    }

    public final void mark(int i) {
        this.mark = this.zzijn + this.zzijm;
    }

    public final synchronized void reset() {
        initialize();
        zzl((byte[]) null, 0, this.mark);
    }

    private final void initialize() {
        zzeit zzeit = new zzeit(this.zziiz, (zzeir) null);
        this.zzijj = zzeit;
        zzefm zzefm = (zzefm) zzeit.next();
        this.zzijk = zzefm;
        this.zzijl = zzefm.size();
        this.zzijm = 0;
        this.zzijn = 0;
    }

    private final void zzbhk() {
        int i;
        if (this.zzijk != null && this.zzijm == (i = this.zzijl)) {
            this.zzijn += i;
            this.zzijm = 0;
            if (this.zzijj.hasNext()) {
                zzefm zzefm = (zzefm) this.zzijj.next();
                this.zzijk = zzefm;
                this.zzijl = zzefm.size();
                return;
            }
            this.zzijk = null;
            this.zzijl = 0;
        }
    }
}
