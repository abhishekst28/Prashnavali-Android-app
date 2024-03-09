package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzpx extends zzlu {
    private static final int[] zzbkx = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private int zzaib;
    private boolean zzali;
    private final zzqb zzbky;
    private final zzqg zzbkz;
    private final long zzbla;
    private final int zzblb;
    private final boolean zzblc;
    private final long[] zzbld;
    private zzho[] zzble;
    private zzpz zzblf;
    private Surface zzblg;
    private Surface zzblh;
    private int zzbli;
    private boolean zzblj;
    private long zzblk;
    private long zzbll;
    private int zzblm;
    private int zzbln;
    private int zzblo;
    private float zzblp;
    private int zzblq;
    private int zzblr;
    private int zzbls;
    private float zzblt;
    private int zzblu;
    private int zzblv;
    private int zzblw;
    private float zzblx;
    zzqc zzbly;
    private long zzblz;
    private int zzbma;
    private final Context zzvr;

    public zzpx(Context context, zzlw zzlw, long j, Handler handler, zzqd zzqd, int i) {
        this(context, zzlw, 0, (zzjs<zzju>) null, false, handler, zzqd, -1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private zzpx(Context context, zzlw zzlw, long j, zzjs<zzju> zzjs, boolean z, Handler handler, zzqd zzqd, int i) {
        super(2, zzlw, (zzjs<zzju>) null, false);
        boolean z2 = false;
        this.zzbla = 0;
        this.zzblb = -1;
        this.zzvr = context.getApplicationContext();
        this.zzbky = new zzqb(context);
        this.zzbkz = new zzqg(handler, zzqd);
        if (zzpq.SDK_INT <= 22 && "foster".equals(zzpq.DEVICE) && "NVIDIA".equals(zzpq.MANUFACTURER)) {
            z2 = true;
        }
        this.zzblc = z2;
        this.zzbld = new long[10];
        this.zzblz = -9223372036854775807L;
        this.zzblk = -9223372036854775807L;
        this.zzblq = -1;
        this.zzblr = -1;
        this.zzblt = -1.0f;
        this.zzblp = -1.0f;
        this.zzbli = 1;
        zzjj();
    }

    /* access modifiers changed from: protected */
    public final int zza(zzlw zzlw, zzho zzho) throws zzlz {
        boolean z;
        String str = zzho.zzagy;
        int i = 0;
        if (!zzpg.zzbg(str)) {
            return 0;
        }
        zzjn zzjn = zzho.zzahb;
        if (zzjn != null) {
            z = false;
            for (int i2 = 0; i2 < zzjn.zzaoh; i2++) {
                z |= zzjn.zzag(i2).zzaoi;
            }
        } else {
            z = false;
        }
        zzlr zzc = zzlw.zzc(str, z);
        boolean z2 = true;
        if (zzc == null) {
            return 1;
        }
        boolean zzbc = zzc.zzbc(zzho.zzagv);
        if (zzbc && zzho.width > 0 && zzho.height > 0) {
            if (zzpq.SDK_INT >= 21) {
                zzbc = zzc.zza(zzho.width, zzho.height, (double) zzho.zzahc);
            } else {
                if (zzho.width * zzho.height > zzly.zzhi()) {
                    z2 = false;
                }
                if (!z2) {
                    int i3 = zzho.width;
                    int i4 = zzho.height;
                    String str2 = zzpq.zzbki;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
                    sb.append("FalseCheck [legacyFrameSize, ");
                    sb.append(i3);
                    sb.append("x");
                    sb.append(i4);
                    sb.append("] [");
                    sb.append(str2);
                    sb.append("]");
                    Log.d("MediaCodecVideoRenderer", sb.toString());
                }
                zzbc = z2;
            }
        }
        int i5 = zzc.zzbba ? 8 : 4;
        if (zzc.zzali) {
            i = 16;
        }
        return (zzbc ? 3 : 2) | i5 | i;
    }

    /* access modifiers changed from: protected */
    public final void zze(boolean z) throws zzhd {
        super.zze(z);
        int i = zzeg().zzaib;
        this.zzaib = i;
        this.zzali = i != 0;
        this.zzbkz.zzc(this.zzbcr);
        this.zzbky.enable();
    }

    /* access modifiers changed from: protected */
    public final void zza(zzho[] zzhoArr, long j) throws zzhd {
        this.zzble = zzhoArr;
        if (this.zzblz == -9223372036854775807L) {
            this.zzblz = j;
        } else {
            int i = this.zzbma;
            long[] jArr = this.zzbld;
            if (i == jArr.length) {
                long j2 = jArr[i - 1];
                StringBuilder sb = new StringBuilder(65);
                sb.append("Too many stream changes, so dropping offset: ");
                sb.append(j2);
                Log.w("MediaCodecVideoRenderer", sb.toString());
            } else {
                this.zzbma = i + 1;
            }
            this.zzbld[this.zzbma - 1] = j;
        }
        super.zza(zzhoArr, j);
    }

    /* access modifiers changed from: protected */
    public final void zza(long j, boolean z) throws zzhd {
        super.zza(j, z);
        zzjh();
        this.zzbln = 0;
        int i = this.zzbma;
        if (i != 0) {
            this.zzblz = this.zzbld[i - 1];
            this.zzbma = 0;
        }
        if (z) {
            zzjg();
        } else {
            this.zzblk = -9223372036854775807L;
        }
    }

    public final boolean isReady() {
        Surface surface;
        if (super.isReady() && (this.zzblj || (((surface = this.zzblh) != null && this.zzblg == surface) || zzhc() == null))) {
            this.zzblk = -9223372036854775807L;
            return true;
        } else if (this.zzblk == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.zzblk) {
                return true;
            }
            this.zzblk = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final void onStarted() {
        super.onStarted();
        this.zzblm = 0;
        this.zzbll = SystemClock.elapsedRealtime();
        this.zzblk = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    public final void onStopped() {
        zzjm();
        super.onStopped();
    }

    /* access modifiers changed from: protected */
    public final void zzef() {
        this.zzblq = -1;
        this.zzblr = -1;
        this.zzblt = -1.0f;
        this.zzblp = -1.0f;
        this.zzblz = -9223372036854775807L;
        this.zzbma = 0;
        zzjj();
        zzjh();
        this.zzbky.disable();
        this.zzbly = null;
        this.zzali = false;
        try {
            super.zzef();
        } finally {
            this.zzbcr.zzgl();
            this.zzbkz.zzd(this.zzbcr);
        }
    }

    public final void zza(int i, Object obj) throws zzhd {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.zzblh;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    zzlr zzhd = zzhd();
                    if (zzhd != null && zzn(zzhd.zzbbb)) {
                        surface = zzpt.zzc(this.zzvr, zzhd.zzbbb);
                        this.zzblh = surface;
                    }
                }
            }
            if (this.zzblg != surface) {
                this.zzblg = surface;
                int state = getState();
                if (state == 1 || state == 2) {
                    MediaCodec zzhc = zzhc();
                    if (zzpq.SDK_INT < 23 || zzhc == null || surface == null) {
                        zzhe();
                        zzhb();
                    } else {
                        zzhc.setOutputSurface(surface);
                    }
                }
                if (surface == null || surface == this.zzblh) {
                    zzjj();
                    zzjh();
                    return;
                }
                zzjl();
                zzjh();
                if (state == 2) {
                    zzjg();
                }
            } else if (surface != null && surface != this.zzblh) {
                zzjl();
                if (this.zzblj) {
                    this.zzbkz.zzb(this.zzblg);
                }
            }
        } else if (i == 4) {
            this.zzbli = ((Integer) obj).intValue();
            MediaCodec zzhc2 = zzhc();
            if (zzhc2 != null) {
                zzhc2.setVideoScalingMode(this.zzbli);
            }
        } else {
            super.zza(i, obj);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zza(zzlr zzlr) {
        return this.zzblg != null || zzn(zzlr.zzbbb);
    }

    /* access modifiers changed from: protected */
    public final void zza(zzlr zzlr, MediaCodec mediaCodec, zzho zzho, MediaCrypto mediaCrypto) throws zzlz {
        zzpz zzpz;
        Point point;
        zzlr zzlr2 = zzlr;
        MediaCodec mediaCodec2 = mediaCodec;
        zzho zzho2 = zzho;
        zzho[] zzhoArr = this.zzble;
        int i = zzho2.width;
        int i2 = zzho2.height;
        int zzi = zzi(zzho);
        if (zzhoArr.length == 1) {
            zzpz = new zzpz(i, i2, zzi);
        } else {
            boolean z = false;
            for (zzho zzho3 : zzhoArr) {
                if (zza(zzlr2.zzbba, zzho2, zzho3)) {
                    z |= zzho3.width == -1 || zzho3.height == -1;
                    i = Math.max(i, zzho3.width);
                    i2 = Math.max(i2, zzho3.height);
                    zzi = Math.max(zzi, zzi(zzho3));
                }
            }
            if (z) {
                StringBuilder sb = new StringBuilder(66);
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                Log.w("MediaCodecVideoRenderer", sb.toString());
                boolean z2 = zzho2.height > zzho2.width;
                int i3 = z2 ? zzho2.height : zzho2.width;
                int i4 = z2 ? zzho2.width : zzho2.height;
                float f = ((float) i4) / ((float) i3);
                int[] iArr = zzbkx;
                int length = iArr.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        point = null;
                        break;
                    }
                    int i6 = length;
                    int i7 = iArr[i5];
                    int[] iArr2 = iArr;
                    int i8 = (int) (((float) i7) * f);
                    if (i7 <= i3 || i8 <= i4) {
                        point = null;
                    } else {
                        int i9 = i3;
                        int i10 = i4;
                        if (zzpq.SDK_INT >= 21) {
                            int i11 = z2 ? i8 : i7;
                            if (!z2) {
                                i7 = i8;
                            }
                            Point zzd = zzlr2.zzd(i11, i7);
                            Point point2 = zzd;
                            if (zzlr2.zza(zzd.x, zzd.y, (double) zzho2.zzahc)) {
                                point = point2;
                                break;
                            }
                        } else {
                            int zzf = zzpq.zzf(i7, 16) << 4;
                            int zzf2 = zzpq.zzf(i8, 16) << 4;
                            if (zzf * zzf2 <= zzly.zzhi()) {
                                int i12 = z2 ? zzf2 : zzf;
                                if (!z2) {
                                    zzf = zzf2;
                                }
                                point = new Point(i12, zzf);
                            }
                        }
                        i5++;
                        length = i6;
                        iArr = iArr2;
                        i3 = i9;
                        i4 = i10;
                    }
                }
                point = null;
                if (point != null) {
                    i = Math.max(i, point.x);
                    i2 = Math.max(i2, point.y);
                    zzi = Math.max(zzi, zza(zzho2.zzagy, i, i2));
                    StringBuilder sb2 = new StringBuilder(57);
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(i);
                    sb2.append("x");
                    sb2.append(i2);
                    Log.w("MediaCodecVideoRenderer", sb2.toString());
                }
            }
            zzpz = new zzpz(i, i2, zzi);
        }
        this.zzblf = zzpz;
        boolean z3 = this.zzblc;
        int i13 = this.zzaib;
        MediaFormat zzey = zzho.zzey();
        zzey.setInteger("max-width", zzpz.width);
        zzey.setInteger("max-height", zzpz.height);
        if (zzpz.zzbmb != -1) {
            zzey.setInteger("max-input-size", zzpz.zzbmb);
        }
        if (z3) {
            zzey.setInteger("auto-frc", 0);
        }
        if (i13 != 0) {
            zzey.setFeatureEnabled("tunneled-playback", true);
            zzey.setInteger("audio-session-id", i13);
        }
        if (this.zzblg == null) {
            zzoz.checkState(zzn(zzlr2.zzbbb));
            if (this.zzblh == null) {
                this.zzblh = zzpt.zzc(this.zzvr, zzlr2.zzbbb);
            }
            this.zzblg = this.zzblh;
        }
        mediaCodec2.configure(zzey, this.zzblg, (MediaCrypto) null, 0);
        if (zzpq.SDK_INT >= 23 && this.zzali) {
            this.zzbly = new zzqc(this, mediaCodec2);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzhe() {
        try {
            super.zzhe();
        } finally {
            Surface surface = this.zzblh;
            if (surface != null) {
                if (this.zzblg == surface) {
                    this.zzblg = null;
                }
                this.zzblh.release();
                this.zzblh = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zzc(String str, long j, long j2) {
        this.zzbkz.zzb(str, j, j2);
    }

    /* access modifiers changed from: protected */
    public final void zzd(zzho zzho) throws zzhd {
        super.zzd(zzho);
        this.zzbkz.zzc(zzho);
        this.zzblp = zzho.zzahe == -1.0f ? 1.0f : zzho.zzahe;
        this.zzblo = zzj(zzho);
    }

    /* access modifiers changed from: protected */
    public final void zza(zzjk zzjk) {
        if (zzpq.SDK_INT < 23 && this.zzali) {
            zzji();
        }
    }

    /* access modifiers changed from: protected */
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int i2;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z) {
            i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        this.zzblq = i;
        if (z) {
            i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        this.zzblr = i2;
        this.zzblt = this.zzblp;
        if (zzpq.SDK_INT >= 21) {
            int i3 = this.zzblo;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.zzblq;
                this.zzblq = this.zzblr;
                this.zzblr = i4;
                this.zzblt = 1.0f / this.zzblt;
            }
        } else {
            this.zzbls = this.zzblo;
        }
        mediaCodec.setVideoScalingMode(this.zzbli);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(MediaCodec mediaCodec, boolean z, zzho zzho, zzho zzho2) {
        return zza(z, zzho, zzho2) && zzho2.width <= this.zzblf.width && zzho2.height <= this.zzblf.height && zzho2.zzagz <= this.zzblf.zzbmb;
    }

    /* access modifiers changed from: protected */
    public final boolean zza(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        MediaCodec mediaCodec2 = mediaCodec;
        int i3 = i;
        long j4 = j3;
        while (true) {
            int i4 = this.zzbma;
            if (i4 == 0) {
                break;
            }
            long[] jArr = this.zzbld;
            if (j4 < jArr[0]) {
                break;
            }
            this.zzblz = jArr[0];
            int i5 = i4 - 1;
            this.zzbma = i5;
            System.arraycopy(jArr, 1, jArr, 0, i5);
        }
        long j5 = j4 - this.zzblz;
        if (z) {
            zza(mediaCodec2, i3, j5);
            return true;
        }
        long j6 = j4 - j;
        if (this.zzblg == this.zzblh) {
            if (!zzem(j6)) {
                return false;
            }
            zza(mediaCodec2, i3, j5);
            return true;
        } else if (!this.zzblj) {
            if (zzpq.SDK_INT >= 21) {
                zza(mediaCodec, i, j5, System.nanoTime());
            } else {
                zzb(mediaCodec2, i3, j5);
            }
            return true;
        } else if (getState() != 2) {
            return false;
        } else {
            long elapsedRealtime = j6 - ((SystemClock.elapsedRealtime() * 1000) - j2);
            long nanoTime = System.nanoTime();
            long zzf = this.zzbky.zzf(j4, (elapsedRealtime * 1000) + nanoTime);
            long j7 = (zzf - nanoTime) / 1000;
            if (zzem(j7)) {
                zzpn.beginSection("dropVideoBuffer");
                mediaCodec2.releaseOutputBuffer(i3, false);
                zzpn.endSection();
                this.zzbcr.zzaoe++;
                this.zzblm++;
                this.zzbln++;
                this.zzbcr.zzaof = Math.max(this.zzbln, this.zzbcr.zzaof);
                if (this.zzblm == this.zzblb) {
                    zzjm();
                }
                return true;
            }
            if (zzpq.SDK_INT >= 21) {
                if (j7 < 50000) {
                    zza(mediaCodec, i, j5, zzf);
                    return true;
                }
            } else if (j7 < 30000) {
                if (j7 > 11000) {
                    try {
                        Thread.sleep((j7 - 10000) / 1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                zzb(mediaCodec2, i3, j5);
                return true;
            }
            return false;
        }
    }

    private final void zza(MediaCodec mediaCodec, int i, long j) {
        zzpn.beginSection("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        zzpn.endSection();
        this.zzbcr.zzaod++;
    }

    private final void zzb(MediaCodec mediaCodec, int i, long j) {
        zzjk();
        zzpn.beginSection("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        zzpn.endSection();
        this.zzbcr.zzaoc++;
        this.zzbln = 0;
        zzji();
    }

    private final void zza(MediaCodec mediaCodec, int i, long j, long j2) {
        zzjk();
        zzpn.beginSection("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        zzpn.endSection();
        this.zzbcr.zzaoc++;
        this.zzbln = 0;
        zzji();
    }

    private final boolean zzn(boolean z) {
        if (zzpq.SDK_INT < 23 || this.zzali) {
            return false;
        }
        return !z || zzpt.zzc(this.zzvr);
    }

    private final void zzjg() {
        this.zzblk = this.zzbla > 0 ? SystemClock.elapsedRealtime() + this.zzbla : -9223372036854775807L;
    }

    private final void zzjh() {
        MediaCodec zzhc;
        this.zzblj = false;
        if (zzpq.SDK_INT >= 23 && this.zzali && (zzhc = zzhc()) != null) {
            this.zzbly = new zzqc(this, zzhc);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzji() {
        if (!this.zzblj) {
            this.zzblj = true;
            this.zzbkz.zzb(this.zzblg);
        }
    }

    private final void zzjj() {
        this.zzblu = -1;
        this.zzblv = -1;
        this.zzblx = -1.0f;
        this.zzblw = -1;
    }

    private final void zzjk() {
        if (this.zzblu != this.zzblq || this.zzblv != this.zzblr || this.zzblw != this.zzbls || this.zzblx != this.zzblt) {
            this.zzbkz.zzb(this.zzblq, this.zzblr, this.zzbls, this.zzblt);
            this.zzblu = this.zzblq;
            this.zzblv = this.zzblr;
            this.zzblw = this.zzbls;
            this.zzblx = this.zzblt;
        }
    }

    private final void zzjl() {
        if (this.zzblu != -1 || this.zzblv != -1) {
            this.zzbkz.zzb(this.zzblq, this.zzblr, this.zzbls, this.zzblt);
        }
    }

    private final void zzjm() {
        if (this.zzblm > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzbkz.zzf(this.zzblm, elapsedRealtime - this.zzbll);
            this.zzblm = 0;
            this.zzbll = elapsedRealtime;
        }
    }

    private static boolean zzem(long j) {
        return j < -30000;
    }

    private static int zzi(zzho zzho) {
        if (zzho.zzagz != -1) {
            return zzho.zzagz;
        }
        return zza(zzho.zzagy, zzho.width, zzho.height);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zza(java.lang.String r7, int r8, int r9) {
        /*
            r0 = -1
            if (r8 == r0) goto L_0x008f
            if (r9 != r0) goto L_0x0007
            goto L_0x008f
        L_0x0007:
            int r1 = r7.hashCode()
            r2 = 5
            r3 = 1
            r4 = 3
            r5 = 4
            r6 = 2
            switch(r1) {
                case -1664118616: goto L_0x0046;
                case -1662541442: goto L_0x003c;
                case 1187890754: goto L_0x0032;
                case 1331836730: goto L_0x0028;
                case 1599127256: goto L_0x001e;
                case 1599127257: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0050
        L_0x0014:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0013
            r7 = 5
            goto L_0x0051
        L_0x001e:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0013
            r7 = 3
            goto L_0x0051
        L_0x0028:
            java.lang.String r1 = "video/avc"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0013
            r7 = 2
            goto L_0x0051
        L_0x0032:
            java.lang.String r1 = "video/mp4v-es"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0013
            r7 = 1
            goto L_0x0051
        L_0x003c:
            java.lang.String r1 = "video/hevc"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0013
            r7 = 4
            goto L_0x0051
        L_0x0046:
            java.lang.String r1 = "video/3gpp"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0013
            r7 = 0
            goto L_0x0051
        L_0x0050:
            r7 = -1
        L_0x0051:
            if (r7 == 0) goto L_0x0085
            if (r7 == r3) goto L_0x0085
            if (r7 == r6) goto L_0x0067
            if (r7 == r4) goto L_0x0062
            if (r7 == r5) goto L_0x005e
            if (r7 == r2) goto L_0x005e
            return r0
        L_0x005e:
            int r8 = r8 * r9
            goto L_0x0089
        L_0x0062:
            int r8 = r8 * r9
            r5 = 2
            goto L_0x0089
        L_0x0067:
            java.lang.String r7 = com.google.android.gms.internal.ads.zzpq.MODEL
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x0072
            return r0
        L_0x0072:
            r7 = 16
            int r8 = com.google.android.gms.internal.ads.zzpq.zzf(r8, r7)
            int r7 = com.google.android.gms.internal.ads.zzpq.zzf(r9, r7)
            int r8 = r8 * r7
            int r7 = r8 << 4
            int r8 = r7 << 4
            r5 = 2
            goto L_0x0089
        L_0x0085:
            int r8 = r8 * r9
            r5 = 2
        L_0x0089:
            int r8 = r8 * 3
            int r5 = r5 * 2
            int r8 = r8 / r5
            return r8
        L_0x008f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpx.zza(java.lang.String, int, int):int");
    }

    private static boolean zza(boolean z, zzho zzho, zzho zzho2) {
        if (!zzho.zzagy.equals(zzho2.zzagy) || zzj(zzho) != zzj(zzho2)) {
            return false;
        }
        if (!z) {
            return zzho.width == zzho2.width && zzho.height == zzho2.height;
        }
        return true;
    }

    private static int zzj(zzho zzho) {
        if (zzho.zzahd == -1) {
            return 0;
        }
        return zzho.zzahd;
    }
}
