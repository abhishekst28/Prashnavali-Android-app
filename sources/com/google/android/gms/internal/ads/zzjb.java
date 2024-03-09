package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzjb extends zzlu implements zzpd {
    private int zzahi;
    private int zzahk;
    /* access modifiers changed from: private */
    public final zzij zzamk;
    private final zzio zzaml;
    private boolean zzamm;
    private boolean zzamn;
    private MediaFormat zzamo;
    private long zzamp;
    /* access modifiers changed from: private */
    public boolean zzamq;

    public zzjb(zzlw zzlw) {
        this(zzlw, (zzjs<zzju>) null, true);
    }

    private zzjb(zzlw zzlw, zzjs<zzju> zzjs, boolean z) {
        this(zzlw, (zzjs<zzju>) null, true, (Handler) null, (zzig) null);
    }

    private zzjb(zzlw zzlw, zzjs<zzju> zzjs, boolean z, Handler handler, zzig zzig) {
        this(zzlw, (zzjs<zzju>) null, true, (Handler) null, (zzig) null, (zzif) null, new zzie[0]);
    }

    private zzjb(zzlw zzlw, zzjs<zzju> zzjs, boolean z, Handler handler, zzig zzig, zzif zzif, zzie... zzieArr) {
        super(1, zzlw, zzjs, z);
        this.zzaml = new zzio((zzif) null, zzieArr, new zzjd(this));
        this.zzamk = new zzij((Handler) null, (zzig) null);
    }

    /* access modifiers changed from: protected */
    public final int zza(zzlw zzlw, zzho zzho) throws zzlz {
        String str = zzho.zzagy;
        boolean z = false;
        if (!zzpg.zzbf(str)) {
            return 0;
        }
        int i = zzpq.SDK_INT >= 21 ? 16 : 0;
        int i2 = 3;
        if (zzba(str) && zzlw.zzhh() != null) {
            return i | 4 | 3;
        }
        zzlr zzc = zzlw.zzc(str, false);
        if (zzc == null) {
            return 1;
        }
        if (zzpq.SDK_INT < 21 || ((zzho.zzahj == -1 || zzc.zzay(zzho.zzahj)) && (zzho.zzahi == -1 || zzc.zzaz(zzho.zzahi)))) {
            z = true;
        }
        if (!z) {
            i2 = 2;
        }
        return i | 4 | i2;
    }

    /* access modifiers changed from: protected */
    public final zzlr zza(zzlw zzlw, zzho zzho, boolean z) throws zzlz {
        zzlr zzhh;
        if (!zzba(zzho.zzagy) || (zzhh = zzlw.zzhh()) == null) {
            this.zzamm = false;
            return super.zza(zzlw, zzho, z);
        }
        this.zzamm = true;
        return zzhh;
    }

    private final boolean zzba(String str) {
        return this.zzaml.zzay(str);
    }

    /* access modifiers changed from: protected */
    public final void zza(zzlr zzlr, MediaCodec mediaCodec, zzho zzho, MediaCrypto mediaCrypto) {
        this.zzamn = zzpq.SDK_INT < 24 && "OMX.SEC.aac.dec".equals(zzlr.name) && "samsung".equals(zzpq.MANUFACTURER) && (zzpq.DEVICE.startsWith("zeroflte") || zzpq.DEVICE.startsWith("herolte") || zzpq.DEVICE.startsWith("heroqlte"));
        if (this.zzamm) {
            MediaFormat zzey = zzho.zzey();
            this.zzamo = zzey;
            zzey.setString("mime", "audio/raw");
            mediaCodec.configure(this.zzamo, (Surface) null, (MediaCrypto) null, 0);
            this.zzamo.setString("mime", zzho.zzagy);
            return;
        }
        mediaCodec.configure(zzho.zzey(), (Surface) null, (MediaCrypto) null, 0);
        this.zzamo = null;
    }

    public final zzpd zzdy() {
        return this;
    }

    /* access modifiers changed from: protected */
    public final void zzc(String str, long j, long j2) {
        this.zzamk.zzb(str, j, j2);
    }

    /* access modifiers changed from: protected */
    public final void zzd(zzho zzho) throws zzhd {
        int i;
        super.zzd(zzho);
        this.zzamk.zzc(zzho);
        if ("audio/raw".equals(zzho.zzagy)) {
            i = zzho.zzahk;
        } else {
            i = 2;
        }
        this.zzahk = i;
        this.zzahi = zzho.zzahi;
    }

    /* access modifiers changed from: protected */
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzhd {
        String str;
        int[] iArr;
        int i;
        boolean z = this.zzamo != null;
        if (z) {
            str = this.zzamo.getString("mime");
        } else {
            str = "audio/raw";
        }
        if (z) {
            mediaFormat = this.zzamo;
        }
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (!this.zzamn || integer != 6 || (i = this.zzahi) >= 6) {
            iArr = null;
        } else {
            int[] iArr2 = new int[i];
            for (int i2 = 0; i2 < this.zzahi; i2++) {
                iArr2[i2] = i2;
            }
            iArr = iArr2;
        }
        try {
            this.zzaml.zza(str, integer, integer2, this.zzahk, 0, iArr);
        } catch (zzis e) {
            throw zzhd.zza(e, getIndex());
        }
    }

    protected static void zzx(int i) {
    }

    protected static void zzgb() {
    }

    protected static void zza(int i, long j, long j2) {
    }

    /* access modifiers changed from: protected */
    public final void zze(boolean z) throws zzhd {
        super.zze(z);
        this.zzamk.zzc(this.zzbcr);
        int i = zzeg().zzaib;
        if (i != 0) {
            this.zzaml.zzz(i);
        } else {
            this.zzaml.zzfr();
        }
    }

    /* access modifiers changed from: protected */
    public final void zza(long j, boolean z) throws zzhd {
        super.zza(j, z);
        this.zzaml.reset();
        this.zzamp = j;
        this.zzamq = true;
    }

    /* access modifiers changed from: protected */
    public final void onStarted() {
        super.onStarted();
        this.zzaml.play();
    }

    /* access modifiers changed from: protected */
    public final void onStopped() {
        this.zzaml.pause();
        super.onStopped();
    }

    /* access modifiers changed from: protected */
    public final void zzef() {
        try {
            this.zzaml.release();
            try {
                super.zzef();
            } finally {
                this.zzbcr.zzgl();
                this.zzamk.zzd(this.zzbcr);
            }
        } catch (Throwable th) {
            super.zzef();
            throw th;
        } finally {
            this.zzbcr.zzgl();
            this.zzamk.zzd(this.zzbcr);
        }
    }

    public final boolean zzfc() {
        return super.zzfc() && this.zzaml.zzfc();
    }

    public final boolean isReady() {
        return this.zzaml.zzfp() || super.isReady();
    }

    public final long zzfx() {
        long zzj = this.zzaml.zzj(zzfc());
        if (zzj != Long.MIN_VALUE) {
            if (!this.zzamq) {
                zzj = Math.max(this.zzamp, zzj);
            }
            this.zzamp = zzj;
            this.zzamq = false;
        }
        return this.zzamp;
    }

    public final zzhu zzb(zzhu zzhu) {
        return this.zzaml.zzb(zzhu);
    }

    public final zzhu zzfq() {
        return this.zzaml.zzfq();
    }

    /* access modifiers changed from: protected */
    public final boolean zza(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzhd {
        if (this.zzamm && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.zzbcr.zzaod++;
            this.zzaml.zzfm();
            return true;
        } else {
            try {
                if (!this.zzaml.zzb(byteBuffer, j3)) {
                    return false;
                }
                mediaCodec.releaseOutputBuffer(i, false);
                this.zzbcr.zzaoc++;
                return true;
            } catch (zziv | zziw e) {
                throw zzhd.zza(e, getIndex());
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zzgc() throws zzhd {
        try {
            this.zzaml.zzfn();
        } catch (zziw e) {
            throw zzhd.zza(e, getIndex());
        }
    }

    public final void zza(int i, Object obj) throws zzhd {
        if (i == 2) {
            this.zzaml.setVolume(((Float) obj).floatValue());
        } else if (i != 3) {
            super.zza(i, obj);
        } else {
            this.zzaml.setStreamType(((Integer) obj).intValue());
        }
    }
}
