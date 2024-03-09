package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzio {
    private static boolean zzajj = false;
    private static boolean zzajk = false;
    private int streamType;
    private zzhu zzafd;
    private int zzahj;
    private final zzif zzajl = null;
    private final zziz zzajm;
    private final zzje zzajn;
    private final zzie[] zzajo;
    private final zziu zzajp;
    /* access modifiers changed from: private */
    public final ConditionVariable zzajq;
    private final long[] zzajr;
    private final zziq zzajs;
    private final LinkedList<zzix> zzajt;
    private AudioTrack zzaju;
    private int zzajv;
    private int zzajw;
    private int zzajx;
    private boolean zzajy;
    private int zzajz;
    private long zzaka;
    private zzhu zzakb;
    private long zzakc;
    private long zzakd;
    private ByteBuffer zzake;
    private int zzakf;
    private int zzakg;
    private int zzakh;
    private long zzaki;
    private long zzakj;
    private boolean zzakk;
    private long zzakl;
    private Method zzakm;
    private int zzakn;
    private long zzako;
    private long zzakp;
    private int zzakq;
    private long zzakr;
    private long zzaks;
    private int zzakt;
    private int zzaku;
    private long zzakv;
    private long zzakw;
    private long zzakx;
    private zzie[] zzaky;
    private ByteBuffer[] zzakz;
    private ByteBuffer zzala;
    private ByteBuffer zzalb;
    private byte[] zzalc;
    private int zzald;
    private int zzale;
    private boolean zzalf;
    private boolean zzalg;
    private int zzalh;
    private boolean zzali;
    private boolean zzalj;
    private long zzalk;
    private float zzdj;

    public zzio(zzif zzif, zzie[] zzieArr, zziu zziu) {
        this.zzajp = zziu;
        this.zzajq = new ConditionVariable(true);
        if (zzpq.SDK_INT >= 18) {
            try {
                this.zzakm = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException e) {
            }
        }
        if (zzpq.SDK_INT >= 19) {
            this.zzajs = new zzit();
        } else {
            this.zzajs = new zziq((zzir) null);
        }
        this.zzajm = new zziz();
        this.zzajn = new zzje();
        zzie[] zzieArr2 = new zzie[(zzieArr.length + 3)];
        this.zzajo = zzieArr2;
        zzieArr2[0] = new zzjc();
        zzie[] zzieArr3 = this.zzajo;
        zzieArr3[1] = this.zzajm;
        System.arraycopy(zzieArr, 0, zzieArr3, 2, zzieArr.length);
        this.zzajo[zzieArr.length + 2] = this.zzajn;
        this.zzajr = new long[10];
        this.zzdj = 1.0f;
        this.zzaku = 0;
        this.streamType = 3;
        this.zzalh = 0;
        this.zzafd = zzhu.zzahv;
        this.zzale = -1;
        this.zzaky = new zzie[0];
        this.zzakz = new ByteBuffer[0];
        this.zzajt = new LinkedList<>();
    }

    public final boolean zzay(String str) {
        zzif zzif = this.zzajl;
        return zzif != null && zzif.zzw(zzaz(str));
    }

    public final long zzj(boolean z) {
        long j;
        long j2;
        if (!(isInitialized() && this.zzaku != 0)) {
            return Long.MIN_VALUE;
        }
        if (this.zzaju.getPlayState() == 3) {
            long zzfx = this.zzajs.zzfx();
            if (zzfx != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.zzakj >= 30000) {
                    long[] jArr = this.zzajr;
                    int i = this.zzakg;
                    jArr[i] = zzfx - nanoTime;
                    this.zzakg = (i + 1) % 10;
                    int i2 = this.zzakh;
                    if (i2 < 10) {
                        this.zzakh = i2 + 1;
                    }
                    this.zzakj = nanoTime;
                    this.zzaki = 0;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.zzakh;
                        if (i3 >= i4) {
                            break;
                        }
                        this.zzaki += this.zzajr[i3] / ((long) i4);
                        i3++;
                    }
                }
                if (!zzfv() && nanoTime - this.zzakl >= 500000) {
                    boolean zzfy = this.zzajs.zzfy();
                    this.zzakk = zzfy;
                    if (zzfy) {
                        long zzfz = this.zzajs.zzfz() / 1000;
                        long zzga = this.zzajs.zzga();
                        if (zzfz < this.zzakw) {
                            this.zzakk = false;
                        } else if (Math.abs(zzfz - nanoTime) > 5000000) {
                            StringBuilder sb = new StringBuilder(136);
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(zzga);
                            sb.append(", ");
                            sb.append(zzfz);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(zzfx);
                            Log.w("AudioTrack", sb.toString());
                            this.zzakk = false;
                        } else if (Math.abs(zzdw(zzga) - zzfx) > 5000000) {
                            StringBuilder sb2 = new StringBuilder(138);
                            sb2.append("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(zzga);
                            sb2.append(", ");
                            sb2.append(zzfz);
                            sb2.append(", ");
                            sb2.append(nanoTime);
                            sb2.append(", ");
                            sb2.append(zzfx);
                            Log.w("AudioTrack", sb2.toString());
                            this.zzakk = false;
                        }
                    }
                    Method method = this.zzakm;
                    if (method != null && !this.zzajy) {
                        try {
                            long intValue = (((long) ((Integer) method.invoke(this.zzaju, (Object[]) null)).intValue()) * 1000) - this.zzaka;
                            this.zzakx = intValue;
                            long max = Math.max(intValue, 0);
                            this.zzakx = max;
                            if (max > 5000000) {
                                StringBuilder sb3 = new StringBuilder(61);
                                sb3.append("Ignoring impossibly large audio latency: ");
                                sb3.append(max);
                                Log.w("AudioTrack", sb3.toString());
                                this.zzakx = 0;
                            }
                        } catch (Exception e) {
                            this.zzakm = null;
                        }
                    }
                    this.zzakl = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.zzakk) {
            j = zzdw(this.zzajs.zzga() + zzdx(nanoTime2 - (this.zzajs.zzfz() / 1000)));
        } else {
            if (this.zzakh == 0) {
                j = this.zzajs.zzfx();
            } else {
                j = nanoTime2 + this.zzaki;
            }
            if (!z) {
                j -= this.zzakx;
            }
        }
        long j3 = this.zzakv;
        while (!this.zzajt.isEmpty() && j >= this.zzajt.getFirst().zzagr) {
            zzix remove = this.zzajt.remove();
            this.zzafd = remove.zzafd;
            this.zzakd = remove.zzagr;
            this.zzakc = remove.zzama - this.zzakv;
        }
        if (this.zzafd.zzahw == 1.0f) {
            j2 = (j + this.zzakc) - this.zzakd;
        } else if (!this.zzajt.isEmpty() || this.zzajn.zzge() < 1024) {
            j2 = ((long) (((double) this.zzafd.zzahw) * ((double) (j - this.zzakd)))) + this.zzakc;
        } else {
            j2 = zzpq.zza(j - this.zzakd, this.zzajn.zzgd(), this.zzajn.zzge()) + this.zzakc;
        }
        return j3 + j2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(java.lang.String r8, int r9, int r10, int r11, int r12, int[] r13) throws com.google.android.gms.internal.ads.zzis {
        /*
            r7 = this;
            java.lang.String r12 = "audio/raw"
            boolean r12 = r12.equals(r8)
            r0 = 1
            r12 = r12 ^ r0
            if (r12 == 0) goto L_0x000f
            int r8 = zzaz(r8)
            goto L_0x0010
        L_0x000f:
            r8 = r11
        L_0x0010:
            r1 = 0
            if (r12 != 0) goto L_0x004c
            int r11 = com.google.android.gms.internal.ads.zzpq.zzg(r11, r9)
            r7.zzakn = r11
            com.google.android.gms.internal.ads.zziz r11 = r7.zzajm
            r11.zzb(r13)
            com.google.android.gms.internal.ads.zzie[] r11 = r7.zzajo
            int r13 = r11.length
            r2 = 0
            r3 = 0
        L_0x0024:
            if (r2 >= r13) goto L_0x0046
            r4 = r11[r2]
            boolean r5 = r4.zzb(r10, r9, r8)     // Catch:{ zzih -> 0x003f }
            r3 = r3 | r5
            boolean r5 = r4.isActive()
            if (r5 == 0) goto L_0x003c
            int r9 = r4.zzfh()
            int r8 = r4.zzfi()
        L_0x003c:
            int r2 = r2 + 1
            goto L_0x0024
        L_0x003f:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzis r9 = new com.google.android.gms.internal.ads.zzis
            r9.<init>((java.lang.Throwable) r8)
            throw r9
        L_0x0046:
            if (r3 == 0) goto L_0x004d
            r7.zzfl()
            goto L_0x004d
        L_0x004c:
            r3 = 0
        L_0x004d:
            r11 = 252(0xfc, float:3.53E-43)
            r13 = 12
            switch(r9) {
                case 1: goto L_0x0084;
                case 2: goto L_0x0080;
                case 3: goto L_0x007d;
                case 4: goto L_0x007a;
                case 5: goto L_0x0077;
                case 6: goto L_0x0073;
                case 7: goto L_0x0070;
                case 8: goto L_0x006d;
                default: goto L_0x0054;
            }
        L_0x0054:
            com.google.android.gms.internal.ads.zzis r8 = new com.google.android.gms.internal.ads.zzis
            r10 = 38
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r10)
            java.lang.String r10 = "Unsupported channel count: "
            r11.append(r10)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r8.<init>((java.lang.String) r9)
            throw r8
        L_0x006d:
            int r2 = com.google.android.gms.internal.ads.zzha.CHANNEL_OUT_7POINT1_SURROUND
            goto L_0x0086
        L_0x0070:
            r2 = 1276(0x4fc, float:1.788E-42)
            goto L_0x0086
        L_0x0073:
            r2 = 252(0xfc, float:3.53E-43)
            goto L_0x0086
        L_0x0077:
            r2 = 220(0xdc, float:3.08E-43)
            goto L_0x0086
        L_0x007a:
            r2 = 204(0xcc, float:2.86E-43)
            goto L_0x0086
        L_0x007d:
            r2 = 28
            goto L_0x0086
        L_0x0080:
            r2 = 12
            goto L_0x0086
        L_0x0084:
            r2 = 4
        L_0x0086:
            int r4 = com.google.android.gms.internal.ads.zzpq.SDK_INT
            r5 = 23
            r6 = 5
            if (r4 > r5) goto L_0x00ae
            java.lang.String r4 = com.google.android.gms.internal.ads.zzpq.DEVICE
            java.lang.String r5 = "foster"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00ae
            java.lang.String r4 = com.google.android.gms.internal.ads.zzpq.MANUFACTURER
            java.lang.String r5 = "NVIDIA"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00ae
            r4 = 3
            if (r9 == r4) goto L_0x00ad
            if (r9 == r6) goto L_0x00ad
            r11 = 7
            if (r9 == r11) goto L_0x00aa
            goto L_0x00ae
        L_0x00aa:
            int r11 = com.google.android.gms.internal.ads.zzha.CHANNEL_OUT_7POINT1_SURROUND
            goto L_0x00af
        L_0x00ad:
            goto L_0x00af
        L_0x00ae:
            r11 = r2
        L_0x00af:
            int r2 = com.google.android.gms.internal.ads.zzpq.SDK_INT
            r4 = 25
            if (r2 > r4) goto L_0x00c4
            java.lang.String r2 = com.google.android.gms.internal.ads.zzpq.DEVICE
            java.lang.String r4 = "fugu"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00c4
            if (r12 == 0) goto L_0x00c4
            if (r9 != r0) goto L_0x00c4
            goto L_0x00c5
        L_0x00c4:
            r13 = r11
        L_0x00c5:
            if (r3 != 0) goto L_0x00da
            boolean r11 = r7.isInitialized()
            if (r11 == 0) goto L_0x00da
            int r11 = r7.zzajw
            if (r11 != r8) goto L_0x00da
            int r11 = r7.zzahj
            if (r11 != r10) goto L_0x00da
            int r11 = r7.zzajv
            if (r11 != r13) goto L_0x00da
            return
        L_0x00da:
            r7.reset()
            r7.zzajw = r8
            r7.zzajy = r12
            r7.zzahj = r10
            r7.zzajv = r13
            r11 = 2
            if (r12 == 0) goto L_0x00e9
            goto L_0x00ea
        L_0x00e9:
            r8 = 2
        L_0x00ea:
            r7.zzajx = r8
            int r8 = com.google.android.gms.internal.ads.zzpq.zzg(r11, r9)
            r7.zzakq = r8
            if (r12 == 0) goto L_0x0103
            int r8 = r7.zzajx
            if (r8 == r6) goto L_0x0100
            r9 = 6
            if (r8 != r9) goto L_0x00fc
            goto L_0x0100
        L_0x00fc:
            r8 = 49152(0xc000, float:6.8877E-41)
            goto L_0x0139
        L_0x0100:
            r8 = 20480(0x5000, float:2.8699E-41)
            goto L_0x0139
        L_0x0103:
            int r8 = r7.zzajx
            int r8 = android.media.AudioTrack.getMinBufferSize(r10, r13, r8)
            r9 = -2
            if (r8 == r9) goto L_0x010d
            goto L_0x010e
        L_0x010d:
            r0 = 0
        L_0x010e:
            com.google.android.gms.internal.ads.zzoz.checkState(r0)
            int r9 = r8 << 2
            r10 = 250000(0x3d090, double:1.235164E-318)
            long r10 = r7.zzdx(r10)
            int r11 = (int) r10
            int r10 = r7.zzakq
            int r10 = r10 * r11
            long r0 = (long) r8
            r2 = 750000(0xb71b0, double:3.70549E-318)
            long r2 = r7.zzdx(r2)
            int r8 = r7.zzakq
            long r4 = (long) r8
            long r2 = r2 * r4
            long r0 = java.lang.Math.max(r0, r2)
            int r8 = (int) r0
            if (r9 >= r10) goto L_0x0135
            r8 = r10
            goto L_0x0139
        L_0x0135:
            if (r9 <= r8) goto L_0x0138
            goto L_0x0139
        L_0x0138:
            r8 = r9
        L_0x0139:
            r7.zzajz = r8
            if (r12 == 0) goto L_0x0143
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x014b
        L_0x0143:
            int r9 = r7.zzakq
            int r8 = r8 / r9
            long r8 = (long) r8
            long r8 = r7.zzdw(r8)
        L_0x014b:
            r7.zzaka = r8
            com.google.android.gms.internal.ads.zzhu r8 = r7.zzafd
            r7.zzb(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzio.zza(java.lang.String, int, int, int, int, int[]):void");
    }

    private final void zzfl() {
        ArrayList arrayList = new ArrayList();
        for (zzie zzie : this.zzajo) {
            if (zzie.isActive()) {
                arrayList.add(zzie);
            } else {
                zzie.flush();
            }
        }
        int size = arrayList.size();
        this.zzaky = (zzie[]) arrayList.toArray(new zzie[size]);
        this.zzakz = new ByteBuffer[size];
        for (int i = 0; i < size; i++) {
            zzie zzie2 = this.zzaky[i];
            zzie2.flush();
            this.zzakz[i] = zzie2.zzfk();
        }
    }

    public final void play() {
        this.zzalg = true;
        if (isInitialized()) {
            this.zzakw = System.nanoTime() / 1000;
            this.zzaju.play();
        }
    }

    public final void zzfm() {
        if (this.zzaku == 1) {
            this.zzaku = 2;
        }
    }

    public final boolean zzb(ByteBuffer byteBuffer, long j) throws zziv, zziw {
        int i;
        int i2;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j2 = j;
        ByteBuffer byteBuffer3 = this.zzala;
        zzoz.checkArgument(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (!isInitialized()) {
            this.zzajq.block();
            if (this.zzali) {
                this.zzaju = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(this.zzajv).setEncoding(this.zzajx).setSampleRate(this.zzahj).build(), this.zzajz, 1, this.zzalh);
            } else if (this.zzalh == 0) {
                this.zzaju = new AudioTrack(this.streamType, this.zzahj, this.zzajv, this.zzajx, this.zzajz, 1);
            } else {
                this.zzaju = new AudioTrack(this.streamType, this.zzahj, this.zzajv, this.zzajx, this.zzajz, 1, this.zzalh);
            }
            int state = this.zzaju.getState();
            if (state == 1) {
                int audioSessionId = this.zzaju.getAudioSessionId();
                if (this.zzalh != audioSessionId) {
                    this.zzalh = audioSessionId;
                    this.zzajp.zzx(audioSessionId);
                }
                this.zzajs.zza(this.zzaju, zzfv());
                zzfs();
                this.zzalj = false;
                if (this.zzalg) {
                    play();
                }
            } else {
                try {
                    this.zzaju.release();
                } catch (Exception e) {
                } finally {
                    this.zzaju = null;
                }
                throw new zziv(state, this.zzahj, this.zzajv, this.zzajz);
            }
        }
        if (zzfv()) {
            if (this.zzaju.getPlayState() == 2) {
                this.zzalj = false;
                return false;
            } else if (this.zzaju.getPlayState() == 1 && this.zzajs.zzfw() != 0) {
                return false;
            }
        }
        boolean z = this.zzalj;
        boolean zzfp = zzfp();
        this.zzalj = zzfp;
        if (z && !zzfp && this.zzaju.getPlayState() != 1) {
            this.zzajp.zzc(this.zzajz, zzha.zzdm(this.zzaka), SystemClock.elapsedRealtime() - this.zzalk);
        }
        if (this.zzala == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.zzajy && this.zzakt == 0) {
                int i3 = this.zzajx;
                if (i3 == 7 || i3 == 8) {
                    i2 = zziy.zzo(byteBuffer);
                } else if (i3 == 5) {
                    i2 = zzic.zzfg();
                } else if (i3 == 6) {
                    i2 = zzic.zzm(byteBuffer);
                } else {
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unexpected audio encoding: ");
                    sb.append(i3);
                    throw new IllegalStateException(sb.toString());
                }
                this.zzakt = i2;
            }
            if (this.zzakb != null) {
                if (!zzfo()) {
                    return false;
                }
                LinkedList<zzix> linkedList = this.zzajt;
                zzix zzix = r11;
                zzix zzix2 = new zzix(this.zzakb, Math.max(0, j2), zzdw(zzft()), (zzir) null);
                linkedList.add(zzix);
                this.zzakb = null;
                zzfl();
            }
            if (this.zzaku == 0) {
                this.zzakv = Math.max(0, j2);
                this.zzaku = 1;
            } else {
                long zzdw = this.zzakv + zzdw(this.zzajy ? this.zzakp : this.zzako / ((long) this.zzakn));
                if (this.zzaku != 1) {
                    i = 2;
                } else if (Math.abs(zzdw - j2) > 200000) {
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Discontinuity detected [expected ");
                    sb2.append(zzdw);
                    sb2.append(", got ");
                    sb2.append(j2);
                    sb2.append("]");
                    Log.e("AudioTrack", sb2.toString());
                    i = 2;
                    this.zzaku = 2;
                } else {
                    i = 2;
                }
                if (this.zzaku == i) {
                    this.zzakv += j2 - zzdw;
                    this.zzaku = 1;
                    this.zzajp.zzel();
                }
            }
            if (this.zzajy) {
                this.zzakp += (long) this.zzakt;
            } else {
                this.zzako += (long) byteBuffer.remaining();
            }
            this.zzala = byteBuffer2;
        }
        if (this.zzajy) {
            zzc(this.zzala, j2);
        } else {
            zzdv(j2);
        }
        if (this.zzala.hasRemaining()) {
            return false;
        }
        this.zzala = null;
        return true;
    }

    private final void zzdv(long j) throws zziw {
        ByteBuffer byteBuffer;
        int length = this.zzaky.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.zzakz[i - 1];
            } else {
                byteBuffer = this.zzala;
                if (byteBuffer == null) {
                    byteBuffer = zzie.zzaiu;
                }
            }
            if (i == length) {
                zzc(byteBuffer, j);
            } else {
                zzie zzie = this.zzaky[i];
                zzie.zzn(byteBuffer);
                ByteBuffer zzfk = zzie.zzfk();
                this.zzakz[i] = zzfk;
                if (zzfk.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    private final boolean zzc(ByteBuffer byteBuffer, long j) throws zziw {
        int i;
        if (!byteBuffer.hasRemaining()) {
            return true;
        }
        ByteBuffer byteBuffer2 = this.zzalb;
        if (byteBuffer2 != null) {
            zzoz.checkArgument(byteBuffer2 == byteBuffer);
        } else {
            this.zzalb = byteBuffer;
            if (zzpq.SDK_INT < 21) {
                int remaining = byteBuffer.remaining();
                byte[] bArr = this.zzalc;
                if (bArr == null || bArr.length < remaining) {
                    this.zzalc = new byte[remaining];
                }
                int position = byteBuffer.position();
                byteBuffer.get(this.zzalc, 0, remaining);
                byteBuffer.position(position);
                this.zzald = 0;
            }
        }
        int remaining2 = byteBuffer.remaining();
        if (zzpq.SDK_INT < 21) {
            int zzfw = this.zzajz - ((int) (this.zzakr - (this.zzajs.zzfw() * ((long) this.zzakq))));
            if (zzfw > 0) {
                i = this.zzaju.write(this.zzalc, this.zzald, Math.min(remaining2, zzfw));
                if (i > 0) {
                    this.zzald += i;
                    byteBuffer.position(byteBuffer.position() + i);
                }
            } else {
                i = 0;
            }
        } else if (this.zzali) {
            zzoz.checkState(j != -9223372036854775807L);
            AudioTrack audioTrack = this.zzaju;
            if (this.zzake == null) {
                ByteBuffer allocate = ByteBuffer.allocate(16);
                this.zzake = allocate;
                allocate.order(ByteOrder.BIG_ENDIAN);
                this.zzake.putInt(1431633921);
            }
            if (this.zzakf == 0) {
                this.zzake.putInt(4, remaining2);
                this.zzake.putLong(8, j * 1000);
                this.zzake.position(0);
                this.zzakf = remaining2;
            }
            int remaining3 = this.zzake.remaining();
            if (remaining3 > 0) {
                int write = audioTrack.write(this.zzake, remaining3, 1);
                if (write < 0) {
                    this.zzakf = 0;
                    i = write;
                } else if (write < remaining3) {
                    i = 0;
                }
            }
            int write2 = audioTrack.write(byteBuffer, remaining2, 1);
            if (write2 < 0) {
                this.zzakf = 0;
            } else {
                this.zzakf -= write2;
            }
            i = write2;
        } else {
            i = this.zzaju.write(byteBuffer, remaining2, 1);
        }
        this.zzalk = SystemClock.elapsedRealtime();
        if (i >= 0) {
            if (!this.zzajy) {
                this.zzakr += (long) i;
            }
            if (i != remaining2) {
                return false;
            }
            if (this.zzajy) {
                this.zzaks += (long) this.zzakt;
            }
            this.zzalb = null;
            return true;
        }
        throw new zziw(i);
    }

    public final void zzfn() throws zziw {
        if (!this.zzalf && isInitialized() && zzfo()) {
            this.zzajs.zzdy(zzft());
            this.zzakf = 0;
            this.zzalf = true;
        }
    }

    private final boolean zzfo() throws zziw {
        boolean z;
        if (this.zzale == -1) {
            this.zzale = this.zzajy ? this.zzaky.length : 0;
            z = true;
        } else {
            z = false;
        }
        while (true) {
            int i = this.zzale;
            zzie[] zzieArr = this.zzaky;
            if (i < zzieArr.length) {
                zzie zzie = zzieArr[i];
                if (z) {
                    zzie.zzfj();
                }
                zzdv(-9223372036854775807L);
                if (!zzie.zzfc()) {
                    return false;
                }
                this.zzale++;
                z = true;
            } else {
                ByteBuffer byteBuffer = this.zzalb;
                if (byteBuffer != null) {
                    zzc(byteBuffer, -9223372036854775807L);
                    if (this.zzalb != null) {
                        return false;
                    }
                }
                this.zzale = -1;
                return true;
            }
        }
    }

    public final boolean zzfc() {
        if (isInitialized()) {
            return this.zzalf && !zzfp();
        }
        return true;
    }

    public final boolean zzfp() {
        if (isInitialized()) {
            if (zzft() <= this.zzajs.zzfw()) {
                if (zzfv() && this.zzaju.getPlayState() == 2 && this.zzaju.getPlaybackHeadPosition() == 0) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public final zzhu zzb(zzhu zzhu) {
        if (this.zzajy) {
            zzhu zzhu2 = zzhu.zzahv;
            this.zzafd = zzhu2;
            return zzhu2;
        }
        zzhu zzhu3 = new zzhu(this.zzajn.zza(zzhu.zzahw), this.zzajn.zzb(zzhu.zzahx));
        zzhu zzhu4 = this.zzakb;
        if (zzhu4 == null) {
            if (!this.zzajt.isEmpty()) {
                zzhu4 = this.zzajt.getLast().zzafd;
            } else {
                zzhu4 = this.zzafd;
            }
        }
        if (!zzhu3.equals(zzhu4)) {
            if (isInitialized()) {
                this.zzakb = zzhu3;
            } else {
                this.zzafd = zzhu3;
            }
        }
        return this.zzafd;
    }

    public final zzhu zzfq() {
        return this.zzafd;
    }

    public final void setStreamType(int i) {
        if (this.streamType != i) {
            this.streamType = i;
            if (!this.zzali) {
                reset();
                this.zzalh = 0;
            }
        }
    }

    public final void zzz(int i) {
        zzoz.checkState(zzpq.SDK_INT >= 21);
        if (!this.zzali || this.zzalh != i) {
            this.zzali = true;
            this.zzalh = i;
            reset();
        }
    }

    public final void zzfr() {
        if (this.zzali) {
            this.zzali = false;
            this.zzalh = 0;
            reset();
        }
    }

    public final void setVolume(float f) {
        if (this.zzdj != f) {
            this.zzdj = f;
            zzfs();
        }
    }

    private final void zzfs() {
        if (!isInitialized()) {
            return;
        }
        if (zzpq.SDK_INT >= 21) {
            this.zzaju.setVolume(this.zzdj);
            return;
        }
        AudioTrack audioTrack = this.zzaju;
        float f = this.zzdj;
        audioTrack.setStereoVolume(f, f);
    }

    public final void pause() {
        this.zzalg = false;
        if (isInitialized()) {
            zzfu();
            this.zzajs.pause();
        }
    }

    public final void reset() {
        if (isInitialized()) {
            this.zzako = 0;
            this.zzakp = 0;
            this.zzakr = 0;
            this.zzaks = 0;
            this.zzakt = 0;
            zzhu zzhu = this.zzakb;
            if (zzhu != null) {
                this.zzafd = zzhu;
                this.zzakb = null;
            } else if (!this.zzajt.isEmpty()) {
                this.zzafd = this.zzajt.getLast().zzafd;
            }
            this.zzajt.clear();
            this.zzakc = 0;
            this.zzakd = 0;
            this.zzala = null;
            this.zzalb = null;
            int i = 0;
            while (true) {
                zzie[] zzieArr = this.zzaky;
                if (i >= zzieArr.length) {
                    break;
                }
                zzie zzie = zzieArr[i];
                zzie.flush();
                this.zzakz[i] = zzie.zzfk();
                i++;
            }
            this.zzalf = false;
            this.zzale = -1;
            this.zzake = null;
            this.zzakf = 0;
            this.zzaku = 0;
            this.zzakx = 0;
            zzfu();
            if (this.zzaju.getPlayState() == 3) {
                this.zzaju.pause();
            }
            AudioTrack audioTrack = this.zzaju;
            this.zzaju = null;
            this.zzajs.zza((AudioTrack) null, false);
            this.zzajq.close();
            new zzir(this, audioTrack).start();
        }
    }

    public final void release() {
        reset();
        for (zzie reset : this.zzajo) {
            reset.reset();
        }
        this.zzalh = 0;
        this.zzalg = false;
    }

    private final boolean isInitialized() {
        return this.zzaju != null;
    }

    private final long zzdw(long j) {
        return (j * 1000000) / ((long) this.zzahj);
    }

    private final long zzdx(long j) {
        return (j * ((long) this.zzahj)) / 1000000;
    }

    private final long zzft() {
        return this.zzajy ? this.zzaks : this.zzakr / ((long) this.zzakq);
    }

    private final void zzfu() {
        this.zzaki = 0;
        this.zzakh = 0;
        this.zzakg = 0;
        this.zzakj = 0;
        this.zzakk = false;
        this.zzakl = 0;
    }

    private final boolean zzfv() {
        if (zzpq.SDK_INT >= 23) {
            return false;
        }
        int i = this.zzajx;
        return i == 5 || i == 6;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zzaz(java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1095064472: goto L_0x002a;
                case 187078296: goto L_0x0020;
                case 1504578661: goto L_0x0016;
                case 1505942594: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0034
        L_0x000c:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x000b
            r5 = 3
            goto L_0x0035
        L_0x0016:
            java.lang.String r0 = "audio/eac3"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x000b
            r5 = 1
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "audio/ac3"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x000b
            r5 = 0
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x000b
            r5 = 2
            goto L_0x0035
        L_0x0034:
            r5 = -1
        L_0x0035:
            if (r5 == 0) goto L_0x0045
            if (r5 == r4) goto L_0x0043
            if (r5 == r3) goto L_0x0041
            if (r5 == r2) goto L_0x003e
            return r1
        L_0x003e:
            r5 = 8
            return r5
        L_0x0041:
            r5 = 7
            return r5
        L_0x0043:
            r5 = 6
            return r5
        L_0x0045:
            r5 = 5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzio.zzaz(java.lang.String):int");
    }
}
