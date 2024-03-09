package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zznh implements zzkg {
    private final zzpk zzapo = new zzpk(32);
    private final zzok zzbdi;
    private final int zzbfu;
    private final zznf zzbfv = new zznf();
    private final zzni zzbfw = new zzni();
    private final AtomicInteger zzbfx = new AtomicInteger();
    private zznk zzbfy;
    private zznk zzbfz;
    private zzho zzbga;
    private boolean zzbgb;
    private zzho zzbgc;
    private long zzbgd;
    private int zzbge = this.zzbfu;
    private zznj zzbgf;

    public zznh(zzok zzok) {
        this.zzbdi = zzok;
        this.zzbfu = zzok.zzim();
        zznk zznk = new zznk(0, this.zzbfu);
        this.zzbfy = zznk;
        this.zzbfz = zznk;
    }

    public final void zzk(boolean z) {
        int andSet = this.zzbfx.getAndSet(z ? 0 : 2);
        zzhz();
        this.zzbfv.zzia();
        if (andSet == 2) {
            this.zzbga = null;
        }
    }

    public final int zzib() {
        return this.zzbfv.zzib();
    }

    public final void disable() {
        if (this.zzbfx.getAndSet(2) == 0) {
            zzhz();
        }
    }

    public final boolean zzic() {
        return this.zzbfv.zzic();
    }

    public final zzho zzid() {
        return this.zzbfv.zzid();
    }

    public final long zzht() {
        return this.zzbfv.zzht();
    }

    public final void zzif() {
        long zzie = this.zzbfv.zzie();
        if (zzie != -1) {
            zzej(zzie);
        }
    }

    public final boolean zze(long j, boolean z) {
        long zzd = this.zzbfv.zzd(j, z);
        if (zzd == -1) {
            return false;
        }
        zzej(zzd);
        return true;
    }

    public final int zza(zzhq zzhq, zzjk zzjk, boolean z, boolean z2, long j) {
        int i;
        int[] iArr;
        int[] iArr2;
        zzjk zzjk2 = zzjk;
        int zza = this.zzbfv.zza(zzhq, zzjk, z, z2, this.zzbga, this.zzbfw);
        if (zza == -5) {
            this.zzbga = zzhq.zzaht;
            return -5;
        } else if (zza == -4) {
            if (!zzjk.zzgj()) {
                if (zzjk2.zzanx < j) {
                    zzjk2.zzac(Integer.MIN_VALUE);
                }
                if (zzjk.isEncrypted()) {
                    zzni zzni = this.zzbfw;
                    long j2 = zzni.zzawj;
                    this.zzapo.reset(1);
                    zza(j2, this.zzapo.data, 1);
                    long j3 = j2 + 1;
                    byte b = this.zzapo.data[0];
                    boolean z3 = (b & 128) != 0;
                    byte b2 = b & Byte.MAX_VALUE;
                    if (zzjk2.zzanw.iv == null) {
                        zzjk2.zzanw.iv = new byte[16];
                    }
                    zza(j3, zzjk2.zzanw.iv, (int) b2);
                    long j4 = j3 + ((long) b2);
                    if (z3) {
                        this.zzapo.reset(2);
                        zza(j4, this.zzapo.data, 2);
                        j4 += 2;
                        i = this.zzapo.readUnsignedShort();
                    } else {
                        i = 1;
                    }
                    int[] iArr3 = zzjk2.zzanw.numBytesOfClearData;
                    if (iArr3 == null || iArr3.length < i) {
                        iArr = new int[i];
                    } else {
                        iArr = iArr3;
                    }
                    int[] iArr4 = zzjk2.zzanw.numBytesOfEncryptedData;
                    if (iArr4 == null || iArr4.length < i) {
                        iArr2 = new int[i];
                    } else {
                        iArr2 = iArr4;
                    }
                    if (z3) {
                        int i2 = i * 6;
                        this.zzapo.reset(i2);
                        zza(j4, this.zzapo.data, i2);
                        j4 += (long) i2;
                        this.zzapo.zzbo(0);
                        for (int i3 = 0; i3 < i; i3++) {
                            iArr[i3] = this.zzapo.readUnsignedShort();
                            iArr2[i3] = this.zzapo.zzjd();
                        }
                    } else {
                        iArr[0] = 0;
                        iArr2[0] = zzni.size - ((int) (j4 - zzni.zzawj));
                    }
                    zzkf zzkf = zzni.zzarm;
                    zzjk2.zzanw.set(i, iArr, iArr2, zzkf.zzaow, zzjk2.zzanw.iv, zzkf.zzaov);
                    int i4 = (int) (j4 - zzni.zzawj);
                    zzni.zzawj += (long) i4;
                    zzni.size -= i4;
                }
                zzjk2.zzae(this.zzbfw.size);
                long j5 = this.zzbfw.zzawj;
                ByteBuffer byteBuffer = zzjk2.zzdd;
                int i5 = this.zzbfw.size;
                zzej(j5);
                while (i5 > 0) {
                    int i6 = (int) (j5 - this.zzbfy.zzbgh);
                    int min = Math.min(i5, this.zzbfu - i6);
                    zzoh zzoh = this.zzbfy.zzbgj;
                    byteBuffer.put(zzoh.data, zzoh.zzbh(i6), min);
                    j5 += (long) min;
                    i5 -= min;
                    if (j5 == this.zzbfy.zzawf) {
                        this.zzbdi.zza(zzoh);
                        this.zzbfy = this.zzbfy.zzii();
                    }
                }
                zzej(this.zzbfw.zzbgg);
            }
            return -4;
        } else if (zza == -3) {
            return -3;
        } else {
            throw new IllegalStateException();
        }
    }

    private final void zza(long j, byte[] bArr, int i) {
        zzej(j);
        int i2 = 0;
        while (i2 < i) {
            int i3 = (int) (j - this.zzbfy.zzbgh);
            int min = Math.min(i - i2, this.zzbfu - i3);
            zzoh zzoh = this.zzbfy.zzbgj;
            System.arraycopy(zzoh.data, zzoh.zzbh(i3), bArr, i2, min);
            j += (long) min;
            i2 += min;
            if (j == this.zzbfy.zzawf) {
                this.zzbdi.zza(zzoh);
                this.zzbfy = this.zzbfy.zzii();
            }
        }
    }

    private final void zzej(long j) {
        while (j >= this.zzbfy.zzawf) {
            this.zzbdi.zza(this.zzbfy.zzbgj);
            this.zzbfy = this.zzbfy.zzii();
        }
    }

    public final void zza(zznj zznj) {
        this.zzbgf = zznj;
    }

    public final void zze(zzho zzho) {
        zzho zzho2;
        if (zzho == null) {
            zzho2 = null;
        } else {
            zzho2 = zzho;
        }
        boolean zzg = this.zzbfv.zzg(zzho2);
        this.zzbgc = zzho;
        this.zzbgb = false;
        zznj zznj = this.zzbgf;
        if (zznj != null && zzg) {
            zznj.zzf(zzho2);
        }
    }

    public final int zza(zzjy zzjy, int i, boolean z) throws IOException, InterruptedException {
        if (!zzig()) {
            int zzah = zzjy.zzah(i);
            if (zzah != -1) {
                return zzah;
            }
            throw new EOFException();
        }
        try {
            int zzbc = zzbc(i);
            zzoh zzoh = this.zzbfz.zzbgj;
            int read = zzjy.read(zzoh.data, zzoh.zzbh(this.zzbge), zzbc);
            if (read != -1) {
                this.zzbge += read;
                this.zzbgd += (long) read;
                return read;
            }
            throw new EOFException();
        } finally {
            zzih();
        }
    }

    public final void zza(zzpk zzpk, int i) {
        if (!zzig()) {
            zzpk.zzbp(i);
            return;
        }
        while (i > 0) {
            int zzbc = zzbc(i);
            zzoh zzoh = this.zzbfz.zzbgj;
            zzpk.zze(zzoh.data, zzoh.zzbh(this.zzbge), zzbc);
            this.zzbge += zzbc;
            this.zzbgd += (long) zzbc;
            i -= zzbc;
        }
        zzih();
    }

    public final void zza(long j, int i, int i2, int i3, zzkf zzkf) {
        if (!zzig()) {
            long j2 = j;
            this.zzbfv.zzei(j);
            return;
        }
        long j3 = j;
        try {
            this.zzbfv.zza(j, i, (this.zzbgd - ((long) i2)) - ((long) i3), i2, zzkf);
        } finally {
            zzih();
        }
    }

    private final boolean zzig() {
        return this.zzbfx.compareAndSet(0, 1);
    }

    private final void zzih() {
        if (!this.zzbfx.compareAndSet(1, 0)) {
            zzhz();
        }
    }

    private final void zzhz() {
        this.zzbfv.zzhz();
        zznk zznk = this.zzbfy;
        if (zznk.zzbgi) {
            int i = (this.zzbfz.zzbgi ? 1 : 0) + (((int) (this.zzbfz.zzbgh - zznk.zzbgh)) / this.zzbfu);
            zzoh[] zzohArr = new zzoh[i];
            for (int i2 = 0; i2 < i; i2++) {
                zzohArr[i2] = zznk.zzbgj;
                zznk = zznk.zzii();
            }
            this.zzbdi.zza(zzohArr);
        }
        zznk zznk2 = new zznk(0, this.zzbfu);
        this.zzbfy = zznk2;
        this.zzbfz = zznk2;
        this.zzbgd = 0;
        this.zzbge = this.zzbfu;
        this.zzbdi.zzn();
    }

    private final int zzbc(int i) {
        if (this.zzbge == this.zzbfu) {
            this.zzbge = 0;
            if (this.zzbfz.zzbgi) {
                this.zzbfz = this.zzbfz.zzbgk;
            }
            zznk zznk = this.zzbfz;
            zzoh zzil = this.zzbdi.zzil();
            zznk zznk2 = new zznk(this.zzbfz.zzawf, this.zzbfu);
            zznk.zzbgj = zzil;
            zznk.zzbgk = zznk2;
            zznk.zzbgi = true;
        }
        return Math.min(i, this.zzbfu - this.zzbge);
    }
}
