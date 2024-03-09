package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class zzeky implements zzbs, Closeable, Iterator<zzbp> {
    private static zzelg zzdc = zzelg.zzn(zzeky.class);
    private static final zzbp zziqi = new zzekx("eof ");
    long zzawf = 0;
    long zzbgh = 0;
    protected zzela zziqf;
    protected zzbo zziqj;
    private zzbp zziqk = null;
    long zziql = 0;
    private List<zzbp> zziqm = new ArrayList();

    public final List<zzbp> zzbjk() {
        if (this.zziqf == null || this.zziqk == zziqi) {
            return this.zziqm;
        }
        return new zzele(this.zziqm, this);
    }

    public void zza(zzela zzela, long j, zzbo zzbo) throws IOException {
        this.zziqf = zzela;
        long position = zzela.position();
        this.zzbgh = position;
        this.zziql = position;
        zzela.zzfc(zzela.position() + j);
        this.zzawf = zzela.position();
        this.zziqj = zzbo;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public boolean hasNext() {
        zzbp zzbp = this.zziqk;
        if (zzbp == zziqi) {
            return false;
        }
        if (zzbp != null) {
            return true;
        }
        try {
            this.zziqk = (zzbp) next();
            return true;
        } catch (NoSuchElementException e) {
            this.zziqk = zziqi;
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zzbjl */
    public final zzbp next() {
        zzbp zza;
        zzbp zzbp = this.zziqk;
        if (zzbp == null || zzbp == zziqi) {
            zzela zzela = this.zziqf;
            if (zzela == null || this.zziql >= this.zzawf) {
                this.zziqk = zziqi;
                throw new NoSuchElementException();
            }
            try {
                synchronized (zzela) {
                    this.zziqf.zzfc(this.zziql);
                    zza = this.zziqj.zza(this.zziqf, this);
                    this.zziql = this.zziqf.position();
                }
                return zza;
            } catch (EOFException e) {
                throw new NoSuchElementException();
            } catch (IOException e2) {
                throw new NoSuchElementException();
            }
        } else {
            this.zziqk = null;
            return zzbp;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.zziqm.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(this.zziqm.get(i).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    public void close() throws IOException {
        this.zziqf.close();
    }
}
