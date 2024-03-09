package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public abstract class zzlu extends zzhb {
    private static final byte[] zzbbh = zzpq.zzbm("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private zzho zzaht;
    private ByteBuffer[] zzakz;
    private final zzlw zzbbi;
    private final zzjs<zzju> zzbbj;
    private final boolean zzbbk;
    private final zzjk zzbbl;
    private final zzjk zzbbm;
    private final zzhq zzbbn;
    private final List<Long> zzbbo;
    private final MediaCodec.BufferInfo zzbbp;
    private zzjq<zzju> zzbbq;
    private zzjq<zzju> zzbbr;
    private MediaCodec zzbbs;
    private zzlr zzbbt;
    private boolean zzbbu;
    private boolean zzbbv;
    private boolean zzbbw;
    private boolean zzbbx;
    private boolean zzbby;
    private boolean zzbbz;
    private boolean zzbca;
    private boolean zzbcb;
    private boolean zzbcc;
    private ByteBuffer[] zzbcd;
    private long zzbce;
    private int zzbcf;
    private int zzbcg;
    private boolean zzbch;
    private boolean zzbci;
    private int zzbcj;
    private int zzbck;
    private boolean zzbcl;
    private boolean zzbcm;
    private boolean zzbcn;
    private boolean zzbco;
    private boolean zzbcp;
    private boolean zzbcq;
    protected zzjl zzbcr;

    public zzlu(int i, zzlw zzlw, zzjs<zzju> zzjs, boolean z) {
        super(i);
        zzoz.checkState(zzpq.SDK_INT >= 16);
        this.zzbbi = (zzlw) zzoz.checkNotNull(zzlw);
        this.zzbbj = zzjs;
        this.zzbbk = z;
        this.zzbbl = new zzjk(0);
        this.zzbbm = new zzjk(0);
        this.zzbbn = new zzhq();
        this.zzbbo = new ArrayList();
        this.zzbbp = new MediaCodec.BufferInfo();
        this.zzbcj = 0;
        this.zzbck = 0;
    }

    /* access modifiers changed from: protected */
    public abstract int zza(zzlw zzlw, zzho zzho) throws zzlz;

    /* access modifiers changed from: protected */
    public abstract void zza(zzlr zzlr, MediaCodec mediaCodec, zzho zzho, MediaCrypto mediaCrypto) throws zzlz;

    /* access modifiers changed from: protected */
    public abstract boolean zza(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzhd;

    public final int zzee() {
        return 4;
    }

    public final int zza(zzho zzho) throws zzhd {
        try {
            return zza(this.zzbbi, zzho);
        } catch (zzlz e) {
            throw zzhd.zza(e, getIndex());
        }
    }

    /* access modifiers changed from: protected */
    public zzlr zza(zzlw zzlw, zzho zzho, boolean z) throws zzlz {
        return zzlw.zzc(zzho.zzagy, z);
    }

    /* access modifiers changed from: protected */
    public final void zzhb() throws zzhd {
        zzho zzho;
        if (this.zzbbs == null && (zzho = this.zzaht) != null) {
            this.zzbbq = this.zzbbr;
            String str = zzho.zzagy;
            zzjq<zzju> zzjq = this.zzbbq;
            if (zzjq != null) {
                int state = zzjq.getState();
                if (state == 0) {
                    throw zzhd.zza(this.zzbbq.zzgn(), getIndex());
                } else if (state == 3 || state == 4) {
                    zzju zzgm = this.zzbbq.zzgm();
                    throw new NoSuchMethodError();
                }
            } else {
                if (this.zzbbt == null) {
                    try {
                        this.zzbbt = zza(this.zzbbi, this.zzaht, false);
                    } catch (zzlz e) {
                        zza(new zzlt(this.zzaht, (Throwable) e, false, -49998));
                    }
                    if (this.zzbbt == null) {
                        zza(new zzlt(this.zzaht, (Throwable) null, false, -49999));
                    }
                }
                if (zza(this.zzbbt)) {
                    String str2 = this.zzbbt.name;
                    this.zzbbu = zzpq.SDK_INT < 21 && this.zzaht.zzaha.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
                    this.zzbbv = zzpq.SDK_INT < 18 || (zzpq.SDK_INT == 18 && ("OMX.SEC.avc.dec".equals(str2) || "OMX.SEC.avc.dec.secure".equals(str2))) || (zzpq.SDK_INT == 19 && zzpq.MODEL.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2)));
                    this.zzbbw = zzpq.SDK_INT < 24 && ("OMX.Nvidia.h264.decode".equals(str2) || "OMX.Nvidia.h264.decode.secure".equals(str2)) && ("flounder".equals(zzpq.DEVICE) || "flounder_lte".equals(zzpq.DEVICE) || "grouper".equals(zzpq.DEVICE) || "tilapia".equals(zzpq.DEVICE));
                    this.zzbbx = zzpq.SDK_INT <= 17 && ("OMX.rk.video_decoder.avc".equals(str2) || "OMX.allwinner.video.decoder.avc".equals(str2));
                    this.zzbby = (zzpq.SDK_INT <= 23 && "OMX.google.vorbis.decoder".equals(str2)) || (zzpq.SDK_INT <= 19 && "hb2000".equals(zzpq.DEVICE) && ("OMX.amlogic.avc.decoder.awesome".equals(str2) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str2)));
                    this.zzbbz = zzpq.SDK_INT == 21 && "OMX.google.aac.decoder".equals(str2);
                    this.zzbca = zzpq.SDK_INT <= 18 && this.zzaht.zzahi == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2);
                    try {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        String valueOf = String.valueOf(str2);
                        zzpn.beginSection(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
                        this.zzbbs = MediaCodec.createByCodecName(str2);
                        zzpn.endSection();
                        zzpn.beginSection("configureCodec");
                        zza(this.zzbbt, this.zzbbs, this.zzaht, (MediaCrypto) null);
                        zzpn.endSection();
                        zzpn.beginSection("startCodec");
                        this.zzbbs.start();
                        zzpn.endSection();
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        zzc(str2, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                        this.zzbcd = this.zzbbs.getInputBuffers();
                        this.zzakz = this.zzbbs.getOutputBuffers();
                    } catch (Exception e2) {
                        zza(new zzlt(this.zzaht, (Throwable) e2, false, str2));
                    }
                    this.zzbce = getState() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                    this.zzbcf = -1;
                    this.zzbcg = -1;
                    this.zzbcq = true;
                    this.zzbcr.zzanz++;
                }
            }
        }
    }

    private final void zza(zzlt zzlt) throws zzhd {
        throw zzhd.zza(zzlt, getIndex());
    }

    /* access modifiers changed from: protected */
    public boolean zza(zzlr zzlr) {
        return true;
    }

    /* access modifiers changed from: protected */
    public final MediaCodec zzhc() {
        return this.zzbbs;
    }

    /* access modifiers changed from: protected */
    public final zzlr zzhd() {
        return this.zzbbt;
    }

    /* access modifiers changed from: protected */
    public void zze(boolean z) throws zzhd {
        this.zzbcr = new zzjl();
    }

    /* access modifiers changed from: protected */
    public void zza(long j, boolean z) throws zzhd {
        this.zzbcn = false;
        this.zzbco = false;
        if (this.zzbbs != null) {
            this.zzbce = -9223372036854775807L;
            this.zzbcf = -1;
            this.zzbcg = -1;
            this.zzbcq = true;
            this.zzbcp = false;
            this.zzbch = false;
            this.zzbbo.clear();
            this.zzbcb = false;
            this.zzbcc = false;
            if (this.zzbbv || (this.zzbby && this.zzbcm)) {
                zzhe();
                zzhb();
            } else if (this.zzbck != 0) {
                zzhe();
                zzhb();
            } else {
                this.zzbbs.flush();
                this.zzbcl = false;
            }
            if (this.zzbci && this.zzaht != null) {
                this.zzbcj = 1;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void zzef() {
        this.zzaht = null;
        try {
            zzhe();
            try {
                if (this.zzbbq != null) {
                    this.zzbbj.zza(this.zzbbq);
                }
                try {
                    if (!(this.zzbbr == null || this.zzbbr == this.zzbbq)) {
                        this.zzbbj.zza(this.zzbbr);
                    }
                } finally {
                    this.zzbbq = null;
                    this.zzbbr = null;
                }
            } catch (Throwable th) {
                if (!(this.zzbbr == null || this.zzbbr == this.zzbbq)) {
                    this.zzbbj.zza(this.zzbbr);
                }
                throw th;
            } finally {
                this.zzbbq = null;
                this.zzbbr = null;
            }
        } catch (Throwable th2) {
            try {
                if (!(this.zzbbr == null || this.zzbbr == this.zzbbq)) {
                    this.zzbbj.zza(this.zzbbr);
                }
                throw th2;
            } finally {
                this.zzbbq = null;
                this.zzbbr = null;
            }
        } finally {
        }
    }

    /* access modifiers changed from: protected */
    public void zzhe() {
        this.zzbce = -9223372036854775807L;
        this.zzbcf = -1;
        this.zzbcg = -1;
        this.zzbcp = false;
        this.zzbch = false;
        this.zzbbo.clear();
        this.zzbcd = null;
        this.zzakz = null;
        this.zzbbt = null;
        this.zzbci = false;
        this.zzbcl = false;
        this.zzbbu = false;
        this.zzbbv = false;
        this.zzbbw = false;
        this.zzbbx = false;
        this.zzbby = false;
        this.zzbca = false;
        this.zzbcb = false;
        this.zzbcc = false;
        this.zzbcm = false;
        this.zzbcj = 0;
        this.zzbck = 0;
        this.zzbbl.zzdd = null;
        if (this.zzbbs != null) {
            this.zzbcr.zzaoa++;
            try {
                this.zzbbs.stop();
                try {
                    this.zzbbs.release();
                    this.zzbbs = null;
                    zzjq<zzju> zzjq = this.zzbbq;
                    if (zzjq != null && this.zzbbr != zzjq) {
                        try {
                            this.zzbbj.zza(zzjq);
                        } finally {
                            this.zzbbq = null;
                        }
                    }
                } catch (Throwable th) {
                    this.zzbbs = null;
                    zzjq<zzju> zzjq2 = this.zzbbq;
                    if (!(zzjq2 == null || this.zzbbr == zzjq2)) {
                        this.zzbbj.zza(zzjq2);
                    }
                    throw th;
                } finally {
                    this.zzbbq = null;
                }
            } catch (Throwable th2) {
                this.zzbbs = null;
                zzjq<zzju> zzjq3 = this.zzbbq;
                if (!(zzjq3 == null || this.zzbbr == zzjq3)) {
                    try {
                        this.zzbbj.zza(zzjq3);
                    } finally {
                        this.zzbbq = null;
                    }
                }
                throw th2;
            } finally {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onStarted() {
    }

    /* access modifiers changed from: protected */
    public void onStopped() {
    }

    public final void zzb(long j, long j2) throws zzhd {
        if (this.zzbco) {
            zzgc();
            return;
        }
        if (this.zzaht == null) {
            this.zzbbm.clear();
            int zza = zza(this.zzbbn, this.zzbbm, true);
            if (zza == -5) {
                zzd(this.zzbbn.zzaht);
            } else if (zza == -4) {
                zzoz.checkState(this.zzbbm.zzgj());
                this.zzbcn = true;
                zzhg();
                return;
            } else {
                return;
            }
        }
        zzhb();
        if (this.zzbbs != null) {
            zzpn.beginSection("drainAndFeed");
            do {
            } while (zzd(j, j2));
            do {
            } while (zzhf());
            zzpn.endSection();
        } else {
            zzdp(j);
            this.zzbbm.clear();
            int zza2 = zza(this.zzbbn, this.zzbbm, false);
            if (zza2 == -5) {
                zzd(this.zzbbn.zzaht);
            } else if (zza2 == -4) {
                zzoz.checkState(this.zzbbm.zzgj());
                this.zzbcn = true;
                zzhg();
            }
        }
        this.zzbcr.zzgl();
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x014c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x014d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzhf() throws com.google.android.gms.internal.ads.zzhd {
        /*
            r14 = this;
            android.media.MediaCodec r0 = r14.zzbbs
            r1 = 0
            if (r0 == 0) goto L_0x01da
            int r2 = r14.zzbck
            r3 = 2
            if (r2 == r3) goto L_0x01da
            boolean r2 = r14.zzbcn
            if (r2 == 0) goto L_0x0010
            goto L_0x01da
        L_0x0010:
            int r2 = r14.zzbcf
            if (r2 >= 0) goto L_0x002c
            r4 = 0
            int r0 = r0.dequeueInputBuffer(r4)
            r14.zzbcf = r0
            if (r0 >= 0) goto L_0x001f
            return r1
        L_0x001f:
            com.google.android.gms.internal.ads.zzjk r2 = r14.zzbbl
            java.nio.ByteBuffer[] r4 = r14.zzbcd
            r0 = r4[r0]
            r2.zzdd = r0
            com.google.android.gms.internal.ads.zzjk r0 = r14.zzbbl
            r0.clear()
        L_0x002c:
            int r0 = r14.zzbck
            r2 = -1
            r4 = 1
            if (r0 != r4) goto L_0x0049
            boolean r0 = r14.zzbbx
            if (r0 != 0) goto L_0x0046
            r14.zzbcm = r4
            android.media.MediaCodec r5 = r14.zzbbs
            int r6 = r14.zzbcf
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r5.queueInputBuffer(r6, r7, r8, r9, r11)
            r14.zzbcf = r2
        L_0x0046:
            r14.zzbck = r3
            return r1
        L_0x0049:
            boolean r0 = r14.zzbcb
            if (r0 == 0) goto L_0x006b
            r14.zzbcb = r1
            com.google.android.gms.internal.ads.zzjk r0 = r14.zzbbl
            java.nio.ByteBuffer r0 = r0.zzdd
            byte[] r1 = zzbbh
            r0.put(r1)
            android.media.MediaCodec r5 = r14.zzbbs
            int r6 = r14.zzbcf
            r7 = 0
            byte[] r0 = zzbbh
            int r8 = r0.length
            r9 = 0
            r11 = 0
            r5.queueInputBuffer(r6, r7, r8, r9, r11)
            r14.zzbcf = r2
            r14.zzbcl = r4
            return r4
        L_0x006b:
            boolean r0 = r14.zzbcp
            if (r0 == 0) goto L_0x0073
            r0 = -4
            r5 = 0
            goto L_0x00ab
        L_0x0073:
            int r0 = r14.zzbcj
            if (r0 != r4) goto L_0x0098
            r0 = 0
        L_0x0078:
            com.google.android.gms.internal.ads.zzho r5 = r14.zzaht
            java.util.List<byte[]> r5 = r5.zzaha
            int r5 = r5.size()
            if (r0 >= r5) goto L_0x0096
            com.google.android.gms.internal.ads.zzho r5 = r14.zzaht
            java.util.List<byte[]> r5 = r5.zzaha
            java.lang.Object r5 = r5.get(r0)
            byte[] r5 = (byte[]) r5
            com.google.android.gms.internal.ads.zzjk r6 = r14.zzbbl
            java.nio.ByteBuffer r6 = r6.zzdd
            r6.put(r5)
            int r0 = r0 + 1
            goto L_0x0078
        L_0x0096:
            r14.zzbcj = r3
        L_0x0098:
            com.google.android.gms.internal.ads.zzjk r0 = r14.zzbbl
            java.nio.ByteBuffer r0 = r0.zzdd
            int r0 = r0.position()
            com.google.android.gms.internal.ads.zzhq r5 = r14.zzbbn
            com.google.android.gms.internal.ads.zzjk r6 = r14.zzbbl
            int r5 = r14.zza((com.google.android.gms.internal.ads.zzhq) r5, (com.google.android.gms.internal.ads.zzjk) r6, (boolean) r1)
            r13 = r5
            r5 = r0
            r0 = r13
        L_0x00ab:
            r6 = -3
            if (r0 != r6) goto L_0x00af
            return r1
        L_0x00af:
            r6 = -5
            if (r0 != r6) goto L_0x00c5
            int r0 = r14.zzbcj
            if (r0 != r3) goto L_0x00bd
            com.google.android.gms.internal.ads.zzjk r0 = r14.zzbbl
            r0.clear()
            r14.zzbcj = r4
        L_0x00bd:
            com.google.android.gms.internal.ads.zzhq r0 = r14.zzbbn
            com.google.android.gms.internal.ads.zzho r0 = r0.zzaht
            r14.zzd(r0)
            return r4
        L_0x00c5:
            com.google.android.gms.internal.ads.zzjk r0 = r14.zzbbl
            boolean r0 = r0.zzgj()
            if (r0 == 0) goto L_0x0102
            int r0 = r14.zzbcj
            if (r0 != r3) goto L_0x00d8
            com.google.android.gms.internal.ads.zzjk r0 = r14.zzbbl
            r0.clear()
            r14.zzbcj = r4
        L_0x00d8:
            r14.zzbcn = r4
            boolean r0 = r14.zzbcl
            if (r0 != 0) goto L_0x00e2
            r14.zzhg()
            return r1
        L_0x00e2:
            boolean r0 = r14.zzbbx     // Catch:{ CryptoException -> 0x00f8 }
            if (r0 != 0) goto L_0x00f6
            r14.zzbcm = r4     // Catch:{ CryptoException -> 0x00f8 }
            android.media.MediaCodec r5 = r14.zzbbs     // Catch:{ CryptoException -> 0x00f8 }
            int r6 = r14.zzbcf     // Catch:{ CryptoException -> 0x00f8 }
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r5.queueInputBuffer(r6, r7, r8, r9, r11)     // Catch:{ CryptoException -> 0x00f8 }
            r14.zzbcf = r2     // Catch:{ CryptoException -> 0x00f8 }
        L_0x00f6:
            return r1
        L_0x00f8:
            r0 = move-exception
            int r1 = r14.getIndex()
            com.google.android.gms.internal.ads.zzhd r0 = com.google.android.gms.internal.ads.zzhd.zza(r0, r1)
            throw r0
        L_0x0102:
            boolean r0 = r14.zzbcq
            if (r0 == 0) goto L_0x011a
            com.google.android.gms.internal.ads.zzjk r0 = r14.zzbbl
            boolean r0 = r0.zzgk()
            if (r0 != 0) goto L_0x011a
            com.google.android.gms.internal.ads.zzjk r0 = r14.zzbbl
            r0.clear()
            int r0 = r14.zzbcj
            if (r0 != r3) goto L_0x0119
            r14.zzbcj = r4
        L_0x0119:
            return r4
        L_0x011a:
            r14.zzbcq = r1
            com.google.android.gms.internal.ads.zzjk r0 = r14.zzbbl
            boolean r0 = r0.isEncrypted()
            com.google.android.gms.internal.ads.zzjq<com.google.android.gms.internal.ads.zzju> r3 = r14.zzbbq
            if (r3 == 0) goto L_0x0147
            int r3 = r3.getState()
            if (r3 == 0) goto L_0x0138
            r6 = 4
            if (r3 == r6) goto L_0x0147
            if (r0 != 0) goto L_0x0136
            boolean r3 = r14.zzbbk
            if (r3 != 0) goto L_0x0147
        L_0x0136:
            r3 = 1
            goto L_0x0148
        L_0x0138:
            com.google.android.gms.internal.ads.zzjq<com.google.android.gms.internal.ads.zzju> r0 = r14.zzbbq
            com.google.android.gms.internal.ads.zzjp r0 = r0.zzgn()
            int r1 = r14.getIndex()
            com.google.android.gms.internal.ads.zzhd r0 = com.google.android.gms.internal.ads.zzhd.zza(r0, r1)
            throw r0
        L_0x0147:
            r3 = 0
        L_0x0148:
            r14.zzbcp = r3
            if (r3 == 0) goto L_0x014d
            return r1
        L_0x014d:
            boolean r3 = r14.zzbbu
            if (r3 == 0) goto L_0x0167
            if (r0 != 0) goto L_0x0167
            com.google.android.gms.internal.ads.zzjk r3 = r14.zzbbl
            java.nio.ByteBuffer r3 = r3.zzdd
            com.google.android.gms.internal.ads.zzpf.zzp(r3)
            com.google.android.gms.internal.ads.zzjk r3 = r14.zzbbl
            java.nio.ByteBuffer r3 = r3.zzdd
            int r3 = r3.position()
            if (r3 != 0) goto L_0x0165
            return r4
        L_0x0165:
            r14.zzbbu = r1
        L_0x0167:
            com.google.android.gms.internal.ads.zzjk r3 = r14.zzbbl     // Catch:{ CryptoException -> 0x01d0 }
            long r10 = r3.zzanx     // Catch:{ CryptoException -> 0x01d0 }
            com.google.android.gms.internal.ads.zzjk r3 = r14.zzbbl     // Catch:{ CryptoException -> 0x01d0 }
            boolean r3 = r3.zzgi()     // Catch:{ CryptoException -> 0x01d0 }
            if (r3 == 0) goto L_0x017c
            java.util.List<java.lang.Long> r3 = r14.zzbbo     // Catch:{ CryptoException -> 0x01d0 }
            java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch:{ CryptoException -> 0x01d0 }
            r3.add(r6)     // Catch:{ CryptoException -> 0x01d0 }
        L_0x017c:
            com.google.android.gms.internal.ads.zzjk r3 = r14.zzbbl     // Catch:{ CryptoException -> 0x01d0 }
            java.nio.ByteBuffer r3 = r3.zzdd     // Catch:{ CryptoException -> 0x01d0 }
            r3.flip()     // Catch:{ CryptoException -> 0x01d0 }
            com.google.android.gms.internal.ads.zzjk r3 = r14.zzbbl     // Catch:{ CryptoException -> 0x01d0 }
            r14.zza((com.google.android.gms.internal.ads.zzjk) r3)     // Catch:{ CryptoException -> 0x01d0 }
            if (r0 == 0) goto L_0x01b0
            com.google.android.gms.internal.ads.zzjk r0 = r14.zzbbl     // Catch:{ CryptoException -> 0x01d0 }
            com.google.android.gms.internal.ads.zzjg r0 = r0.zzanw     // Catch:{ CryptoException -> 0x01d0 }
            android.media.MediaCodec$CryptoInfo r9 = r0.zzgh()     // Catch:{ CryptoException -> 0x01d0 }
            if (r5 != 0) goto L_0x0195
            goto L_0x01a5
        L_0x0195:
            int[] r0 = r9.numBytesOfClearData     // Catch:{ CryptoException -> 0x01d0 }
            if (r0 != 0) goto L_0x019d
            int[] r0 = new int[r4]     // Catch:{ CryptoException -> 0x01d0 }
            r9.numBytesOfClearData = r0     // Catch:{ CryptoException -> 0x01d0 }
        L_0x019d:
            int[] r0 = r9.numBytesOfClearData     // Catch:{ CryptoException -> 0x01d0 }
            r3 = r0[r1]     // Catch:{ CryptoException -> 0x01d0 }
            int r3 = r3 + r5
            r0[r1] = r3     // Catch:{ CryptoException -> 0x01d0 }
        L_0x01a5:
            android.media.MediaCodec r6 = r14.zzbbs     // Catch:{ CryptoException -> 0x01d0 }
            int r7 = r14.zzbcf     // Catch:{ CryptoException -> 0x01d0 }
            r8 = 0
            r12 = 0
            r6.queueSecureInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x01d0 }
            goto L_0x01c1
        L_0x01b0:
            android.media.MediaCodec r6 = r14.zzbbs     // Catch:{ CryptoException -> 0x01d0 }
            int r7 = r14.zzbcf     // Catch:{ CryptoException -> 0x01d0 }
            r8 = 0
            com.google.android.gms.internal.ads.zzjk r0 = r14.zzbbl     // Catch:{ CryptoException -> 0x01d0 }
            java.nio.ByteBuffer r0 = r0.zzdd     // Catch:{ CryptoException -> 0x01d0 }
            int r9 = r0.limit()     // Catch:{ CryptoException -> 0x01d0 }
            r12 = 0
            r6.queueInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x01d0 }
        L_0x01c1:
            r14.zzbcf = r2     // Catch:{ CryptoException -> 0x01d0 }
            r14.zzbcl = r4     // Catch:{ CryptoException -> 0x01d0 }
            r14.zzbcj = r1     // Catch:{ CryptoException -> 0x01d0 }
            com.google.android.gms.internal.ads.zzjl r0 = r14.zzbcr     // Catch:{ CryptoException -> 0x01d0 }
            int r1 = r0.zzaob     // Catch:{ CryptoException -> 0x01d0 }
            int r1 = r1 + r4
            r0.zzaob = r1     // Catch:{ CryptoException -> 0x01d0 }
            return r4
        L_0x01d0:
            r0 = move-exception
            int r1 = r14.getIndex()
            com.google.android.gms.internal.ads.zzhd r0 = com.google.android.gms.internal.ads.zzhd.zza(r0, r1)
            throw r0
        L_0x01da:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlu.zzhf():boolean");
    }

    /* access modifiers changed from: protected */
    public void zzc(String str, long j, long j2) {
    }

    /* access modifiers changed from: protected */
    public void zzd(zzho zzho) throws zzhd {
        zzjn zzjn;
        MediaCodec mediaCodec;
        zzho zzho2 = this.zzaht;
        this.zzaht = zzho;
        zzjn zzjn2 = zzho.zzahb;
        if (zzho2 == null) {
            zzjn = null;
        } else {
            zzjn = zzho2.zzahb;
        }
        boolean zza = zzpq.zza(zzjn2, zzjn);
        boolean z = true;
        if (!zza) {
            if (this.zzaht.zzahb != null) {
                zzjs<zzju> zzjs = this.zzbbj;
                if (zzjs != null) {
                    zzjq<zzju> zza2 = zzjs.zza(Looper.myLooper(), this.zzaht.zzahb);
                    this.zzbbr = zza2;
                    if (zza2 == this.zzbbq) {
                        this.zzbbj.zza(zza2);
                    }
                } else {
                    throw zzhd.zza(new IllegalStateException("Media requires a DrmSessionManager"), getIndex());
                }
            } else {
                this.zzbbr = null;
            }
        }
        if (this.zzbbr == this.zzbbq && (mediaCodec = this.zzbbs) != null && zza(mediaCodec, this.zzbbt.zzbba, zzho2, this.zzaht)) {
            this.zzbci = true;
            this.zzbcj = 1;
            if (!(this.zzbbw && this.zzaht.width == zzho2.width && this.zzaht.height == zzho2.height)) {
                z = false;
            }
            this.zzbcb = z;
        } else if (this.zzbcl) {
            this.zzbck = 1;
        } else {
            zzhe();
            zzhb();
        }
    }

    /* access modifiers changed from: protected */
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzhd {
    }

    /* access modifiers changed from: protected */
    public void zza(zzjk zzjk) {
    }

    /* access modifiers changed from: protected */
    public boolean zza(MediaCodec mediaCodec, boolean z, zzho zzho, zzho zzho2) {
        return false;
    }

    public boolean zzfc() {
        return this.zzbco;
    }

    public boolean isReady() {
        if (this.zzaht == null || this.zzbcp) {
            return false;
        }
        if (zzeh() || this.zzbcg >= 0) {
            return true;
        }
        return this.zzbce != -9223372036854775807L && SystemClock.elapsedRealtime() < this.zzbce;
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzd(long r18, long r20) throws com.google.android.gms.internal.ads.zzhd {
        /*
            r17 = this;
            r13 = r17
            int r0 = r13.zzbcg
            r14 = -1
            r15 = 1
            r12 = 0
            if (r0 >= 0) goto L_0x00ec
            boolean r0 = r13.zzbbz
            r1 = 0
            if (r0 == 0) goto L_0x002b
            boolean r0 = r13.zzbcm
            if (r0 == 0) goto L_0x002b
            android.media.MediaCodec r0 = r13.zzbbs     // Catch:{ IllegalStateException -> 0x001f }
            android.media.MediaCodec$BufferInfo r3 = r13.zzbbp     // Catch:{ IllegalStateException -> 0x001f }
            int r0 = r0.dequeueOutputBuffer(r3, r1)     // Catch:{ IllegalStateException -> 0x001f }
            r13.zzbcg = r0     // Catch:{ IllegalStateException -> 0x001f }
            goto L_0x0036
        L_0x001f:
            r0 = move-exception
            r17.zzhg()
            boolean r0 = r13.zzbco
            if (r0 == 0) goto L_0x002a
            r17.zzhe()
        L_0x002a:
            return r12
        L_0x002b:
            android.media.MediaCodec r0 = r13.zzbbs
            android.media.MediaCodec$BufferInfo r3 = r13.zzbbp
            int r0 = r0.dequeueOutputBuffer(r3, r1)
            r13.zzbcg = r0
        L_0x0036:
            int r0 = r13.zzbcg
            if (r0 < 0) goto L_0x009c
            boolean r1 = r13.zzbcc
            if (r1 == 0) goto L_0x0048
            r13.zzbcc = r12
            android.media.MediaCodec r1 = r13.zzbbs
            r1.releaseOutputBuffer(r0, r12)
            r13.zzbcg = r14
            return r15
        L_0x0048:
            android.media.MediaCodec$BufferInfo r0 = r13.zzbbp
            int r0 = r0.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0056
            r17.zzhg()
            r13.zzbcg = r14
            return r12
        L_0x0056:
            java.nio.ByteBuffer[] r0 = r13.zzakz
            int r1 = r13.zzbcg
            r0 = r0[r1]
            if (r0 == 0) goto L_0x0071
            android.media.MediaCodec$BufferInfo r1 = r13.zzbbp
            int r1 = r1.offset
            r0.position(r1)
            android.media.MediaCodec$BufferInfo r1 = r13.zzbbp
            int r1 = r1.offset
            android.media.MediaCodec$BufferInfo r2 = r13.zzbbp
            int r2 = r2.size
            int r1 = r1 + r2
            r0.limit(r1)
        L_0x0071:
            android.media.MediaCodec$BufferInfo r0 = r13.zzbbp
            long r0 = r0.presentationTimeUs
            java.util.List<java.lang.Long> r2 = r13.zzbbo
            int r2 = r2.size()
            r3 = 0
        L_0x007c:
            if (r3 >= r2) goto L_0x0098
            java.util.List<java.lang.Long> r4 = r13.zzbbo
            java.lang.Object r4 = r4.get(r3)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x0095
            java.util.List<java.lang.Long> r0 = r13.zzbbo
            r0.remove(r3)
            r0 = 1
            goto L_0x0099
        L_0x0095:
            int r3 = r3 + 1
            goto L_0x007c
        L_0x0098:
            r0 = 0
        L_0x0099:
            r13.zzbch = r0
            goto L_0x00ec
        L_0x009c:
            r1 = -2
            if (r0 != r1) goto L_0x00ce
            android.media.MediaCodec r0 = r13.zzbbs
            android.media.MediaFormat r0 = r0.getOutputFormat()
            boolean r1 = r13.zzbbw
            if (r1 == 0) goto L_0x00bf
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)
            r2 = 32
            if (r1 != r2) goto L_0x00bf
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)
            if (r1 != r2) goto L_0x00bf
            r13.zzbcc = r15
            goto L_0x00cd
        L_0x00bf:
            boolean r1 = r13.zzbca
            if (r1 == 0) goto L_0x00c8
            java.lang.String r1 = "channel-count"
            r0.setInteger(r1, r15)
        L_0x00c8:
            android.media.MediaCodec r1 = r13.zzbbs
            r13.onOutputFormatChanged(r1, r0)
        L_0x00cd:
            return r15
        L_0x00ce:
            r1 = -3
            if (r0 != r1) goto L_0x00db
            android.media.MediaCodec r0 = r13.zzbbs
            java.nio.ByteBuffer[] r0 = r0.getOutputBuffers()
            r13.zzakz = r0
            return r15
        L_0x00db:
            boolean r0 = r13.zzbbx
            if (r0 == 0) goto L_0x00eb
            boolean r0 = r13.zzbcn
            if (r0 != 0) goto L_0x00e8
            int r0 = r13.zzbck
            r1 = 2
            if (r0 != r1) goto L_0x00eb
        L_0x00e8:
            r17.zzhg()
        L_0x00eb:
            return r12
        L_0x00ec:
            boolean r0 = r13.zzbbz
            if (r0 == 0) goto L_0x0126
            boolean r0 = r13.zzbcm
            if (r0 == 0) goto L_0x0126
            android.media.MediaCodec r6 = r13.zzbbs     // Catch:{ IllegalStateException -> 0x0118 }
            java.nio.ByteBuffer[] r0 = r13.zzakz     // Catch:{ IllegalStateException -> 0x0118 }
            int r1 = r13.zzbcg     // Catch:{ IllegalStateException -> 0x0118 }
            r7 = r0[r1]     // Catch:{ IllegalStateException -> 0x0118 }
            int r8 = r13.zzbcg     // Catch:{ IllegalStateException -> 0x0118 }
            android.media.MediaCodec$BufferInfo r0 = r13.zzbbp     // Catch:{ IllegalStateException -> 0x0118 }
            int r9 = r0.flags     // Catch:{ IllegalStateException -> 0x0118 }
            android.media.MediaCodec$BufferInfo r0 = r13.zzbbp     // Catch:{ IllegalStateException -> 0x0118 }
            long r10 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0118 }
            boolean r0 = r13.zzbch     // Catch:{ IllegalStateException -> 0x0118 }
            r1 = r17
            r2 = r18
            r4 = r20
            r16 = 0
            r12 = r0
            boolean r0 = r1.zza(r2, r4, r6, r7, r8, r9, r10, r12)     // Catch:{ IllegalStateException -> 0x0116 }
            goto L_0x0144
        L_0x0116:
            r0 = move-exception
            goto L_0x011b
        L_0x0118:
            r0 = move-exception
            r16 = 0
        L_0x011b:
            r17.zzhg()
            boolean r0 = r13.zzbco
            if (r0 == 0) goto L_0x0125
            r17.zzhe()
        L_0x0125:
            return r16
        L_0x0126:
            r16 = 0
            android.media.MediaCodec r6 = r13.zzbbs
            java.nio.ByteBuffer[] r0 = r13.zzakz
            int r8 = r13.zzbcg
            r7 = r0[r8]
            android.media.MediaCodec$BufferInfo r0 = r13.zzbbp
            int r9 = r0.flags
            android.media.MediaCodec$BufferInfo r0 = r13.zzbbp
            long r10 = r0.presentationTimeUs
            boolean r12 = r13.zzbch
            r1 = r17
            r2 = r18
            r4 = r20
            boolean r0 = r1.zza(r2, r4, r6, r7, r8, r9, r10, r12)
        L_0x0144:
            if (r0 == 0) goto L_0x014d
            android.media.MediaCodec$BufferInfo r0 = r13.zzbbp
            long r0 = r0.presentationTimeUs
            r13.zzbcg = r14
            return r15
        L_0x014d:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlu.zzd(long, long):boolean");
    }

    /* access modifiers changed from: protected */
    public void zzgc() throws zzhd {
    }

    private final void zzhg() throws zzhd {
        if (this.zzbck == 2) {
            zzhe();
            zzhb();
            return;
        }
        this.zzbco = true;
        zzgc();
    }
}
