package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzhl implements Handler.Callback, zzna, zznc, zzof {
    private final Handler handler;
    private int repeatMode = 0;
    private int state;
    private final zzhx[] zzael;
    private final zzog zzaem;
    private final Handler zzaeo;
    private final zzid zzaer;
    private final zzia zzaes;
    private boolean zzaeu;
    private boolean zzaey;
    private zzhy zzaez;
    private zzhu zzafd;
    private zzhn zzafe;
    private final zzhw[] zzafu;
    private final zzhs zzafv;
    private zzmz zzafw;
    private final zzpl zzafy;
    private final HandlerThread zzafz;
    private final zzhc zzaga;
    private zzhx zzagb;
    private zzpd zzagc;
    private zzhx[] zzagd;
    private boolean zzage;
    private boolean zzagf;
    private int zzagg;
    private int zzagh;
    private long zzagi;
    private int zzagj;
    private zzhm zzagk;
    private long zzagl;
    private zzhk zzagm;
    private zzhk zzagn;
    private zzhk zzago;

    public zzhl(zzhx[] zzhxArr, zzog zzog, zzhs zzhs, boolean z, int i, Handler handler2, zzhn zzhn, zzhc zzhc) {
        this.zzael = zzhxArr;
        this.zzaem = zzog;
        this.zzafv = zzhs;
        this.zzaeu = z;
        this.zzaeo = handler2;
        this.state = 1;
        this.zzafe = zzhn;
        this.zzaga = zzhc;
        this.zzafu = new zzhw[zzhxArr.length];
        for (int i2 = 0; i2 < zzhxArr.length; i2++) {
            zzhxArr[i2].setIndex(i2);
            this.zzafu[i2] = zzhxArr[i2].zzdx();
        }
        this.zzafy = new zzpl();
        this.zzagd = new zzhx[0];
        this.zzaer = new zzid();
        this.zzaes = new zzia();
        zzog.zza(this);
        this.zzafd = zzhu.zzahv;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.zzafz = handlerThread;
        handlerThread.start();
        this.handler = new Handler(this.zzafz.getLooper(), this);
    }

    public final void zza(zzmz zzmz, boolean z) {
        this.handler.obtainMessage(0, 1, 0, zzmz).sendToTarget();
    }

    public final void zzf(boolean z) {
        this.handler.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
    }

    public final void zza(zzhy zzhy, int i, long j) {
        this.handler.obtainMessage(3, new zzhm(zzhy, i, j)).sendToTarget();
    }

    public final void stop() {
        this.handler.sendEmptyMessage(5);
    }

    public final void zza(zzhh... zzhhArr) {
        if (this.zzage) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        this.zzagg++;
        this.handler.obtainMessage(11, zzhhArr).sendToTarget();
    }

    public final synchronized void zzb(zzhh... zzhhArr) {
        if (this.zzage) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        int i = this.zzagg;
        this.zzagg = i + 1;
        this.handler.obtainMessage(11, zzhhArr).sendToTarget();
        while (this.zzagh <= i) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final synchronized void release() {
        if (!this.zzage) {
            this.handler.sendEmptyMessage(6);
            while (!this.zzage) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            this.zzafz.quit();
        }
    }

    public final void zzb(zzhy zzhy, Object obj) {
        this.handler.obtainMessage(7, Pair.create(zzhy, obj)).sendToTarget();
    }

    public final void zza(zzmx zzmx) {
        this.handler.obtainMessage(8, zzmx).sendToTarget();
    }

    public final void zzeq() {
        this.handler.sendEmptyMessage(10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:168:0x0290 A[Catch:{ all -> 0x0458, all -> 0x0390, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0293 A[Catch:{ all -> 0x0458, all -> 0x0390, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0297 A[Catch:{ all -> 0x0458, all -> 0x0390, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x035d A[Catch:{ all -> 0x0458, all -> 0x0390, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0371 A[Catch:{ all -> 0x0458, all -> 0x0390, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x05bf A[Catch:{ all -> 0x0458, all -> 0x0390, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x05db A[Catch:{ all -> 0x0458, all -> 0x0390, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }, LOOP:8: B:329:0x05db->B:333:0x05ed, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x073f A[Catch:{ all -> 0x0458, all -> 0x0390, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x07fa A[Catch:{ all -> 0x0458, all -> 0x0390, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r35) {
        /*
            r34 = this;
            r8 = r34
            r1 = r35
            r10 = 1
            int r2 = r1.what     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r11 = 7
            r3 = 0
            r14 = 3
            r5 = -1
            r6 = 0
            r15 = 4
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 2
            r9 = 0
            switch(r2) {
                case 0: goto L_0x0892;
                case 1: goto L_0x0865;
                case 2: goto L_0x0472;
                case 3: goto L_0x03b9;
                case 4: goto L_0x0398;
                case 5: goto L_0x0394;
                case 6: goto L_0x037c;
                case 7: goto L_0x021b;
                case 8: goto L_0x01e5;
                case 9: goto L_0x01d0;
                case 10: goto L_0x00d9;
                case 11: goto L_0x009b;
                case 12: goto L_0x0019;
                default: goto L_0x0018;
            }     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x0018:
            return r9
        L_0x0019:
            int r1 = r1.arg1     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.repeatMode = r1     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r2 = r8.zzago     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r2 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzhk r2 = r8.zzago     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x0026
        L_0x0024:
            com.google.android.gms.internal.ads.zzhk r2 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x0026:
            if (r2 == 0) goto L_0x009a
            com.google.android.gms.internal.ads.zzhk r3 = r8.zzagn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r2 != r3) goto L_0x002e
            r3 = 1
            goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            com.google.android.gms.internal.ads.zzhk r4 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r2 != r4) goto L_0x0035
            r4 = 1
            goto L_0x0036
        L_0x0035:
            r4 = 0
        L_0x0036:
            com.google.android.gms.internal.ads.zzhy r11 = r8.zzaez     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r12 = r2.zzafn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzia r13 = r8.zzaes     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzid r14 = r8.zzaer     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r11 = r11.zza((int) r12, (com.google.android.gms.internal.ads.zzia) r13, (com.google.android.gms.internal.ads.zzid) r14, (int) r1)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r12 = r2.zzafs     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r12 == 0) goto L_0x0061
            if (r11 == r5) goto L_0x0061
            com.google.android.gms.internal.ads.zzhk r12 = r2.zzafs     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r12 = r12.zzafn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r12 != r11) goto L_0x0061
            com.google.android.gms.internal.ads.zzhk r2 = r2.zzafs     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r11 = r8.zzagn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r2 != r11) goto L_0x0056
            r11 = 1
            goto L_0x0057
        L_0x0056:
            r11 = 0
        L_0x0057:
            r3 = r3 | r11
            com.google.android.gms.internal.ads.zzhk r11 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r2 != r11) goto L_0x005e
            r11 = 1
            goto L_0x005f
        L_0x005e:
            r11 = 0
        L_0x005f:
            r4 = r4 | r11
            goto L_0x0036
        L_0x0061:
            com.google.android.gms.internal.ads.zzhk r5 = r2.zzafs     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r5 == 0) goto L_0x006c
            com.google.android.gms.internal.ads.zzhk r5 = r2.zzafs     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            zza((com.google.android.gms.internal.ads.zzhk) r5)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r2.zzafs = r6     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x006c:
            int r5 = r2.zzafn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            boolean r5 = r8.zzu(r5)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r2.zzafp = r5     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r4 != 0) goto L_0x0078
            r8.zzagm = r2     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x0078:
            if (r3 != 0) goto L_0x0091
            com.google.android.gms.internal.ads.zzhk r2 = r8.zzago     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r2 == 0) goto L_0x0091
            com.google.android.gms.internal.ads.zzhk r2 = r8.zzago     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r2 = r2.zzafn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhn r3 = r8.zzafe     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r3 = r3.zzagr     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r3 = r8.zza((int) r2, (long) r3)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhn r5 = new com.google.android.gms.internal.ads.zzhn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r5.<init>(r2, r3)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzafe = r5     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x0091:
            int r2 = r8.state     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r2 != r15) goto L_0x009a
            if (r1 == 0) goto L_0x009a
            r8.setState(r7)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x009a:
            return r10
        L_0x009b:
            java.lang.Object r1 = r1.obj     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhh[] r1 = (com.google.android.gms.internal.ads.zzhh[]) r1     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r2 = r1.length     // Catch:{ all -> 0x00c8 }
        L_0x00a0:
            if (r9 >= r2) goto L_0x00b0
            r3 = r1[r9]     // Catch:{ all -> 0x00c8 }
            com.google.android.gms.internal.ads.zzhe r4 = r3.zzaeh     // Catch:{ all -> 0x00c8 }
            int r5 = r3.zzaei     // Catch:{ all -> 0x00c8 }
            java.lang.Object r3 = r3.zzaej     // Catch:{ all -> 0x00c8 }
            r4.zza(r5, r3)     // Catch:{ all -> 0x00c8 }
            int r9 = r9 + 1
            goto L_0x00a0
        L_0x00b0:
            com.google.android.gms.internal.ads.zzmz r1 = r8.zzafw     // Catch:{ all -> 0x00c8 }
            if (r1 == 0) goto L_0x00b9
            android.os.Handler r1 = r8.handler     // Catch:{ all -> 0x00c8 }
            r1.sendEmptyMessage(r7)     // Catch:{ all -> 0x00c8 }
        L_0x00b9:
            monitor-enter(r34)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r1 = r8.zzagh     // Catch:{ all -> 0x00c4 }
            int r1 = r1 + r10
            r8.zzagh = r1     // Catch:{ all -> 0x00c4 }
            r34.notifyAll()     // Catch:{ all -> 0x00c4 }
            monitor-exit(r34)     // Catch:{ all -> 0x00c4 }
            return r10
        L_0x00c4:
            r0 = move-exception
            r1 = r0
            monitor-exit(r34)     // Catch:{ all -> 0x00c4 }
            throw r1     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x00c8:
            r0 = move-exception
            r1 = r0
            monitor-enter(r34)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r2 = r8.zzagh     // Catch:{ all -> 0x00d5 }
            int r2 = r2 + r10
            r8.zzagh = r2     // Catch:{ all -> 0x00d5 }
            r34.notifyAll()     // Catch:{ all -> 0x00d5 }
            monitor-exit(r34)     // Catch:{ all -> 0x00d5 }
            throw r1     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x00d5:
            r0 = move-exception
            r1 = r0
            monitor-exit(r34)     // Catch:{ all -> 0x00d5 }
            throw r1     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x00d9:
            com.google.android.gms.internal.ads.zzhk r1 = r8.zzago     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 == 0) goto L_0x01cf
            com.google.android.gms.internal.ads.zzhk r1 = r8.zzago     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r2 = 1
        L_0x00e1:
            if (r1 == 0) goto L_0x01cf
            boolean r3 = r1.zzafq     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r3 != 0) goto L_0x00e9
            goto L_0x01cf
        L_0x00e9:
            boolean r3 = r1.zzep()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r3 != 0) goto L_0x00f7
            com.google.android.gms.internal.ads.zzhk r3 = r8.zzagn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 != r3) goto L_0x00f4
            r2 = 0
        L_0x00f4:
            com.google.android.gms.internal.ads.zzhk r1 = r1.zzafs     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x00e1
        L_0x00f7:
            if (r2 == 0) goto L_0x0196
            com.google.android.gms.internal.ads.zzhk r2 = r8.zzagn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r3 = r8.zzago     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r2 == r3) goto L_0x0101
            r2 = 1
            goto L_0x0102
        L_0x0101:
            r2 = 0
        L_0x0102:
            com.google.android.gms.internal.ads.zzhk r3 = r8.zzago     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r3 = r3.zzafs     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            zza((com.google.android.gms.internal.ads.zzhk) r3)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r3 = r8.zzago     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r3.zzafs = r6     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r3 = r8.zzago     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzagm = r3     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r3 = r8.zzago     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzagn = r3     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhx[] r3 = r8.zzael     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r3 = r3.length     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            boolean[] r3 = new boolean[r3]     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r4 = r8.zzago     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhn r5 = r8.zzafe     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r11 = r5.zzagr     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r4 = r4.zza(r11, r2, r3)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhn r2 = r8.zzafe     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r11 = r2.zzagr     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r2 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x0133
            com.google.android.gms.internal.ads.zzhn r2 = r8.zzafe     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r2.zzagr = r4     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzdq(r4)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x0133:
            com.google.android.gms.internal.ads.zzhx[] r2 = r8.zzael     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r2 = r2.length     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            boolean[] r2 = new boolean[r2]     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r4 = 0
            r5 = 0
        L_0x013b:
            com.google.android.gms.internal.ads.zzhx[] r11 = r8.zzael     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r11 = r11.length     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r4 >= r11) goto L_0x0187
            com.google.android.gms.internal.ads.zzhx[] r11 = r8.zzael     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r11 = r11[r4]     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r12 = r11.getState()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r12 == 0) goto L_0x014c
            r12 = 1
            goto L_0x014d
        L_0x014c:
            r12 = 0
        L_0x014d:
            r2[r4] = r12     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r12 = r8.zzago     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zznm[] r12 = r12.zzafk     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r12 = r12[r4]     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r12 == 0) goto L_0x0159
            int r5 = r5 + 1
        L_0x0159:
            boolean r13 = r2[r4]     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r13 == 0) goto L_0x0184
            com.google.android.gms.internal.ads.zznm r13 = r11.zzdz()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r12 == r13) goto L_0x017b
            com.google.android.gms.internal.ads.zzhx r13 = r8.zzagb     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r11 != r13) goto L_0x0174
            if (r12 != 0) goto L_0x0170
            com.google.android.gms.internal.ads.zzpl r12 = r8.zzafy     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzpd r13 = r8.zzagc     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r12.zza(r13)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x0170:
            r8.zzagc = r6     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzagb = r6     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x0174:
            zza((com.google.android.gms.internal.ads.zzhx) r11)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r11.disable()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x0184
        L_0x017b:
            boolean r12 = r3[r4]     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r12 == 0) goto L_0x0184
            long r12 = r8.zzagl     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r11.zzdo(r12)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x0184:
            int r4 = r4 + 1
            goto L_0x013b
        L_0x0187:
            android.os.Handler r3 = r8.zzaeo     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzoi r1 = r1.zzaft     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            android.os.Message r1 = r3.obtainMessage(r14, r1)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r1.sendToTarget()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zza((boolean[]) r2, (int) r5)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x01c3
        L_0x0196:
            r8.zzagm = r1     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r1 = r1.zzafs     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x019a:
            if (r1 == 0) goto L_0x01a2
            r1.release()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r1 = r1.zzafs     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x019a
        L_0x01a2:
            com.google.android.gms.internal.ads.zzhk r1 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r1.zzafs = r6     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r1 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            boolean r1 = r1.zzafq     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 == 0) goto L_0x01c3
            com.google.android.gms.internal.ads.zzhk r1 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r1 = r1.zzafo     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r3 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r4 = r8.zzagl     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r11 = r3.zzen()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r4 = r4 - r11
            long r1 = java.lang.Math.max(r1, r4)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r3 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r3.zzb(r1, r9)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x01c3:
            r34.zzew()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r34.zzet()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            android.os.Handler r1 = r8.handler     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r1.sendEmptyMessage(r7)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x01cf:
            return r10
        L_0x01d0:
            java.lang.Object r1 = r1.obj     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzmx r1 = (com.google.android.gms.internal.ads.zzmx) r1     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r2 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r2 == 0) goto L_0x01e3
            com.google.android.gms.internal.ads.zzhk r2 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzmx r2 = r2.zzafi     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r2 == r1) goto L_0x01df
            goto L_0x01e3
        L_0x01df:
            r34.zzew()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x01e4
        L_0x01e3:
        L_0x01e4:
            return r10
        L_0x01e5:
            java.lang.Object r1 = r1.obj     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzmx r1 = (com.google.android.gms.internal.ads.zzmx) r1     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r2 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r2 == 0) goto L_0x0219
            com.google.android.gms.internal.ads.zzhk r2 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzmx r2 = r2.zzafi     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r2 == r1) goto L_0x01f4
            goto L_0x0219
        L_0x01f4:
            com.google.android.gms.internal.ads.zzhk r1 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r1.zzafq = r10     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r1.zzep()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r2 = r1.zzafo     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r2 = r1.zzb(r2, r9)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r1.zzafo = r2     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r1 = r8.zzago     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 != 0) goto L_0x0215
            com.google.android.gms.internal.ads.zzhk r1 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzagn = r1     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r1 = r1.zzafo     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzdq(r1)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r1 = r8.zzagn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzb((com.google.android.gms.internal.ads.zzhk) r1)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x0215:
            r34.zzew()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x021a
        L_0x0219:
        L_0x021a:
            return r10
        L_0x021b:
            java.lang.Object r1 = r1.obj     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            android.util.Pair r1 = (android.util.Pair) r1     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhy r2 = r8.zzaez     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            java.lang.Object r3 = r1.first     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhy r3 = (com.google.android.gms.internal.ads.zzhy) r3     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzaez = r3     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            java.lang.Object r1 = r1.second     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r2 != 0) goto L_0x028b
            int r3 = r8.zzagj     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r3 <= 0) goto L_0x025b
            com.google.android.gms.internal.ads.zzhm r3 = r8.zzagk     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            android.util.Pair r3 = r8.zza((com.google.android.gms.internal.ads.zzhm) r3)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r4 = r8.zzagj     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzagj = r9     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzagk = r6     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r3 != 0) goto L_0x0243
            r8.zza((java.lang.Object) r1, (int) r4)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x037b
        L_0x0243:
            com.google.android.gms.internal.ads.zzhn r7 = new com.google.android.gms.internal.ads.zzhn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            java.lang.Object r11 = r3.first     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r11 = r11.intValue()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            java.lang.Object r3 = r3.second     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r14 = r3.longValue()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r7.<init>(r11, r14)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzafe = r7     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x028c
        L_0x025b:
            com.google.android.gms.internal.ads.zzhn r3 = r8.zzafe     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r3 = r3.zzafo     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r7 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r7 != 0) goto L_0x028b
            com.google.android.gms.internal.ads.zzhy r3 = r8.zzaez     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            boolean r3 = r3.isEmpty()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r3 == 0) goto L_0x0270
            r8.zza((java.lang.Object) r1, (int) r9)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x037b
        L_0x0270:
            android.util.Pair r3 = r8.zzb((int) r9, (long) r12)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhn r4 = new com.google.android.gms.internal.ads.zzhn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            java.lang.Object r7 = r3.first     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r7 = r7.intValue()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            java.lang.Object r3 = r3.second     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r14 = r3.longValue()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r4.<init>(r7, r14)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzafe = r4     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x028b:
            r4 = 0
        L_0x028c:
            com.google.android.gms.internal.ads.zzhk r3 = r8.zzago     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r3 == 0) goto L_0x0293
            com.google.android.gms.internal.ads.zzhk r3 = r8.zzago     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x0295
        L_0x0293:
            com.google.android.gms.internal.ads.zzhk r3 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x0295:
            if (r3 == 0) goto L_0x0378
            com.google.android.gms.internal.ads.zzhy r7 = r8.zzaez     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            java.lang.Object r11 = r3.zzafj     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r7 = r7.zzc(r11)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r7 != r5) goto L_0x02fb
            int r6 = r3.zzafn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhy r7 = r8.zzaez     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r2 = r8.zza((int) r6, (com.google.android.gms.internal.ads.zzhy) r2, (com.google.android.gms.internal.ads.zzhy) r7)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r2 != r5) goto L_0x02b0
            r8.zza((java.lang.Object) r1, (int) r4)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x037b
        L_0x02b0:
            com.google.android.gms.internal.ads.zzhy r6 = r8.zzaez     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzia r7 = r8.zzaes     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r6.zza((int) r2, (com.google.android.gms.internal.ads.zzia) r7, (boolean) r9)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            android.util.Pair r2 = r8.zzb((int) r9, (long) r12)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            java.lang.Object r6 = r2.first     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r6 = r6.intValue()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            java.lang.Object r2 = r2.second     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r11 = r2.longValue()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhy r2 = r8.zzaez     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzia r7 = r8.zzaes     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r2.zza((int) r6, (com.google.android.gms.internal.ads.zzia) r7, (boolean) r10)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzia r2 = r8.zzaes     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            java.lang.Object r2 = r2.zzafj     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r3.zzafn = r5     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x02da:
            com.google.android.gms.internal.ads.zzhk r7 = r3.zzafs     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r7 == 0) goto L_0x02ee
            com.google.android.gms.internal.ads.zzhk r3 = r3.zzafs     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            java.lang.Object r7 = r3.zzafj     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            boolean r7 = r7.equals(r2)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r7 == 0) goto L_0x02ea
            r7 = r6
            goto L_0x02eb
        L_0x02ea:
            r7 = -1
        L_0x02eb:
            r3.zzafn = r7     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x02da
        L_0x02ee:
            long r2 = r8.zza((int) r6, (long) r11)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhn r5 = new com.google.android.gms.internal.ads.zzhn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r5.<init>(r6, r2)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzafe = r5     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x0378
        L_0x02fb:
            boolean r2 = r8.zzu(r7)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r3.zzc(r7, r2)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r2 = r8.zzagn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r3 != r2) goto L_0x0308
            r2 = 1
            goto L_0x0309
        L_0x0308:
            r2 = 0
        L_0x0309:
            com.google.android.gms.internal.ads.zzhn r11 = r8.zzafe     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r11 = r11.zzafn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r7 == r11) goto L_0x0323
            com.google.android.gms.internal.ads.zzhn r11 = r8.zzafe     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhn r12 = new com.google.android.gms.internal.ads.zzhn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r13 = r11.zzafo     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r12.<init>(r7, r13)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r13 = r11.zzagr     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r12.zzagr = r13     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r13 = r11.zzags     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r12.zzags = r13     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzafe = r12     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x0323:
            com.google.android.gms.internal.ads.zzhk r11 = r3.zzafs     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r11 == 0) goto L_0x0378
            com.google.android.gms.internal.ads.zzhk r11 = r3.zzafs     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhy r12 = r8.zzaez     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzia r13 = r8.zzaes     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzid r14 = r8.zzaer     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r15 = r8.repeatMode     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r7 = r12.zza((int) r7, (com.google.android.gms.internal.ads.zzia) r13, (com.google.android.gms.internal.ads.zzid) r14, (int) r15)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r7 == r5) goto L_0x035b
            java.lang.Object r12 = r11.zzafj     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhy r13 = r8.zzaez     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzia r14 = r8.zzaes     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzia r13 = r13.zza((int) r7, (com.google.android.gms.internal.ads.zzia) r14, (boolean) r10)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            java.lang.Object r13 = r13.zzafj     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            boolean r12 = r12.equals(r13)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r12 == 0) goto L_0x035b
            boolean r3 = r8.zzu(r7)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r11.zzc(r7, r3)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r3 = r8.zzagn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r11 != r3) goto L_0x0357
            r3 = 1
            goto L_0x0358
        L_0x0357:
            r3 = 0
        L_0x0358:
            r2 = r2 | r3
            r3 = r11
            goto L_0x0323
        L_0x035b:
            if (r2 != 0) goto L_0x0371
            com.google.android.gms.internal.ads.zzhk r2 = r8.zzago     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r2 = r2.zzafn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhn r3 = r8.zzafe     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r5 = r3.zzagr     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r5 = r8.zza((int) r2, (long) r5)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhn r3 = new com.google.android.gms.internal.ads.zzhn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r3.<init>(r2, r5)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzafe = r3     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x0378
        L_0x0371:
            r8.zzagm = r3     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r3.zzafs = r6     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            zza((com.google.android.gms.internal.ads.zzhk) r11)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x0378:
            r8.zzb((java.lang.Object) r1, (int) r4)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x037b:
            return r10
        L_0x037c:
            r8.zzi(r10)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhs r1 = r8.zzafv     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r1.zzfa()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.setState(r10)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            monitor-enter(r34)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzage = r10     // Catch:{ all -> 0x0390 }
            r34.notifyAll()     // Catch:{ all -> 0x0390 }
            monitor-exit(r34)     // Catch:{ all -> 0x0390 }
            return r10
        L_0x0390:
            r0 = move-exception
            r1 = r0
            monitor-exit(r34)     // Catch:{ all -> 0x0390 }
            throw r1     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x0394:
            r34.zzeu()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            return r10
        L_0x0398:
            java.lang.Object r1 = r1.obj     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhu r1 = (com.google.android.gms.internal.ads.zzhu) r1     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzpd r2 = r8.zzagc     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r2 == 0) goto L_0x03a7
            com.google.android.gms.internal.ads.zzpd r2 = r8.zzagc     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhu r1 = r2.zzb(r1)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x03ad
        L_0x03a7:
            com.google.android.gms.internal.ads.zzpl r2 = r8.zzafy     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhu r1 = r2.zzb(r1)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x03ad:
            r8.zzafd = r1     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            android.os.Handler r2 = r8.zzaeo     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            android.os.Message r1 = r2.obtainMessage(r11, r1)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r1.sendToTarget()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            return r10
        L_0x03b9:
            java.lang.Object r1 = r1.obj     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhm r1 = (com.google.android.gms.internal.ads.zzhm) r1     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhy r2 = r8.zzaez     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r2 != 0) goto L_0x03ca
            int r2 = r8.zzagj     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r2 = r2 + r10
            r8.zzagj = r2     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzagk = r1     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x0457
        L_0x03ca:
            android.util.Pair r2 = r8.zza((com.google.android.gms.internal.ads.zzhm) r1)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r2 != 0) goto L_0x03ee
            com.google.android.gms.internal.ads.zzhn r1 = new com.google.android.gms.internal.ads.zzhn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r1.<init>(r9, r3)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzafe = r1     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            android.os.Handler r2 = r8.zzaeo     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            android.os.Message r1 = r2.obtainMessage(r15, r10, r9, r1)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r1.sendToTarget()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhn r1 = new com.google.android.gms.internal.ads.zzhn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r1.<init>(r9, r12)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzafe = r1     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.setState(r15)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzi(r9)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x0457
        L_0x03ee:
            long r3 = r1.zzagq     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r1 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x03f6
            r1 = 1
            goto L_0x03f7
        L_0x03f6:
            r1 = 0
        L_0x03f7:
            java.lang.Object r3 = r2.first     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r3 = r3.intValue()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            java.lang.Object r2 = r2.second     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r4 = r2.longValue()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhn r2 = r8.zzafe     // Catch:{ all -> 0x0458 }
            int r2 = r2.zzafn     // Catch:{ all -> 0x0458 }
            if (r3 != r2) goto L_0x0432
            r6 = 1000(0x3e8, double:4.94E-321)
            long r11 = r4 / r6
            com.google.android.gms.internal.ads.zzhn r2 = r8.zzafe     // Catch:{ all -> 0x0458 }
            long r13 = r2.zzagr     // Catch:{ all -> 0x0458 }
            long r13 = r13 / r6
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x0432
            com.google.android.gms.internal.ads.zzhn r2 = new com.google.android.gms.internal.ads.zzhn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r2.<init>(r3, r4)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzafe = r2     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            android.os.Handler r2 = r8.zzaeo     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 == 0) goto L_0x0427
            r1 = 1
            goto L_0x0428
        L_0x0427:
            r1 = 0
        L_0x0428:
            com.google.android.gms.internal.ads.zzhn r3 = r8.zzafe     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            android.os.Message r1 = r2.obtainMessage(r15, r1, r9, r3)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r1.sendToTarget()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x0457
        L_0x0432:
            long r6 = r8.zza((int) r3, (long) r4)     // Catch:{ all -> 0x0458 }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x043c
            r2 = 1
            goto L_0x043d
        L_0x043c:
            r2 = 0
        L_0x043d:
            r1 = r1 | r2
            com.google.android.gms.internal.ads.zzhn r2 = new com.google.android.gms.internal.ads.zzhn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r2.<init>(r3, r6)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzafe = r2     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            android.os.Handler r2 = r8.zzaeo     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 == 0) goto L_0x044c
            r1 = 1
            goto L_0x044d
        L_0x044c:
            r1 = 0
        L_0x044d:
            com.google.android.gms.internal.ads.zzhn r3 = r8.zzafe     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            android.os.Message r1 = r2.obtainMessage(r15, r1, r9, r3)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r1.sendToTarget()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x0457:
            return r10
        L_0x0458:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.internal.ads.zzhn r6 = new com.google.android.gms.internal.ads.zzhn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r6.<init>(r3, r4)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzafe = r6     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            android.os.Handler r3 = r8.zzaeo     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 == 0) goto L_0x0467
            r1 = 1
            goto L_0x0468
        L_0x0467:
            r1 = 0
        L_0x0468:
            com.google.android.gms.internal.ads.zzhn r4 = r8.zzafe     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            android.os.Message r1 = r3.obtainMessage(r15, r1, r9, r4)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r1.sendToTarget()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            throw r2     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x0472:
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhy r1 = r8.zzaez     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 != 0) goto L_0x0484
            com.google.android.gms.internal.ads.zzmz r1 = r8.zzafw     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r1.zzhx()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r14 = r5
            goto L_0x06ee
        L_0x0484:
            com.google.android.gms.internal.ads.zzhk r1 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 != 0) goto L_0x048e
            com.google.android.gms.internal.ads.zzhn r1 = r8.zzafe     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r1 = r1.zzafn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x04d3
        L_0x048e:
            com.google.android.gms.internal.ads.zzhk r1 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r1 = r1.zzafn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r2 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            boolean r2 = r2.zzafp     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r2 != 0) goto L_0x05b9
            com.google.android.gms.internal.ads.zzhk r2 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            boolean r2 = r2.zzeo()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r2 == 0) goto L_0x05b9
            com.google.android.gms.internal.ads.zzhy r2 = r8.zzaez     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzia r7 = r8.zzaes     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzia r2 = r2.zza((int) r1, (com.google.android.gms.internal.ads.zzia) r7, (boolean) r9)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r14 = r2.zzaid     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r2 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x04b2
            r14 = r5
            goto L_0x05ba
        L_0x04b2:
            com.google.android.gms.internal.ads.zzhk r2 = r8.zzago     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r2 == 0) goto L_0x04c7
            com.google.android.gms.internal.ads.zzhk r2 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r2 = r2.index     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r7 = r8.zzago     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r7 = r7.index     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r2 = r2 - r7
            r7 = 100
            if (r2 == r7) goto L_0x04c4
            goto L_0x04c7
        L_0x04c4:
            r14 = r5
            goto L_0x05bb
        L_0x04c7:
            com.google.android.gms.internal.ads.zzhy r2 = r8.zzaez     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzia r7 = r8.zzaes     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzid r14 = r8.zzaer     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r15 = r8.repeatMode     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r1 = r2.zza((int) r1, (com.google.android.gms.internal.ads.zzia) r7, (com.google.android.gms.internal.ads.zzid) r14, (int) r15)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x04d3:
            com.google.android.gms.internal.ads.zzhy r2 = r8.zzaez     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r2 = r2.zzfe()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 < r2) goto L_0x04e3
            com.google.android.gms.internal.ads.zzmz r1 = r8.zzafw     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r1.zzhx()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r14 = r5
            goto L_0x05bb
        L_0x04e3:
            com.google.android.gms.internal.ads.zzhk r2 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r2 != 0) goto L_0x04ed
            com.google.android.gms.internal.ads.zzhn r2 = r8.zzafe     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r3 = r2.zzagr     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r14 = r5
            goto L_0x0545
        L_0x04ed:
            com.google.android.gms.internal.ads.zzhy r2 = r8.zzaez     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzia r7 = r8.zzaes     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r2.zza((int) r1, (com.google.android.gms.internal.ads.zzia) r7, (boolean) r9)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhy r2 = r8.zzaez     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzid r7 = r8.zzaer     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r2.zza((int) r9, (com.google.android.gms.internal.ads.zzid) r7, (boolean) r9)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 == 0) goto L_0x0500
            r14 = r5
            goto L_0x0545
        L_0x0500:
            com.google.android.gms.internal.ads.zzhk r1 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r1 = r1.zzen()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhy r7 = r8.zzaez     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r14 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r14 = r14.zzafn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzia r15 = r8.zzaes     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzia r7 = r7.zza((int) r14, (com.google.android.gms.internal.ads.zzia) r15, (boolean) r9)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r14 = r7.zzaid     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r1 = r1 + r14
            long r14 = r8.zzagl     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r1 = r1 - r14
            com.google.android.gms.internal.ads.zzhy r7 = r8.zzaez     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r14 = 0
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r18 = java.lang.Math.max(r3, r1)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r1 = r34
            r2 = r7
            r3 = r14
            r14 = r5
            r4 = r16
            r6 = r18
            android.util.Pair r1 = r1.zza(r2, r3, r4, r6)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 == 0) goto L_0x05bb
            java.lang.Object r2 = r1.first     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r2 = r2.intValue()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            java.lang.Object r1 = r1.second     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r3 = r1.longValue()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r1 = r2
        L_0x0545:
            com.google.android.gms.internal.ads.zzhk r2 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r2 != 0) goto L_0x0550
            r5 = 60000000(0x3938700, double:2.96439388E-316)
            long r5 = r5 + r3
            r23 = r5
            goto L_0x0568
        L_0x0550:
            com.google.android.gms.internal.ads.zzhk r2 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r5 = r2.zzen()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhy r2 = r8.zzaez     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r7 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r7 = r7.zzafn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzia r11 = r8.zzaes     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzia r2 = r2.zza((int) r7, (com.google.android.gms.internal.ads.zzia) r11, (boolean) r9)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r12 = r2.zzaid     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r5 = r5 + r12
            r23 = r5
        L_0x0568:
            com.google.android.gms.internal.ads.zzhk r2 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r2 != 0) goto L_0x056f
            r29 = 0
            goto L_0x0576
        L_0x056f:
            com.google.android.gms.internal.ads.zzhk r2 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r2 = r2.index     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r2 = r2 + r10
            r29 = r2
        L_0x0576:
            boolean r31 = r8.zzu(r1)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhy r2 = r8.zzaez     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzia r5 = r8.zzaes     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r2.zza((int) r1, (com.google.android.gms.internal.ads.zzia) r5, (boolean) r10)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r2 = new com.google.android.gms.internal.ads.zzhk     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhx[] r5 = r8.zzael     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhw[] r6 = r8.zzafu     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzog r7 = r8.zzaem     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhs r11 = r8.zzafv     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzmz r12 = r8.zzafw     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzia r13 = r8.zzaes     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            java.lang.Object r13 = r13.zzafj     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r20 = r2
            r21 = r5
            r22 = r6
            r25 = r7
            r26 = r11
            r27 = r12
            r28 = r13
            r30 = r1
            r32 = r3
            r20.<init>(r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r1 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 == 0) goto L_0x05ae
            com.google.android.gms.internal.ads.zzhk r1 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r1.zzafs = r2     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x05ae:
            r8.zzagm = r2     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzmx r1 = r2.zzafi     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r1.zza(r8, r3)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzh(r10)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x05bb
        L_0x05b9:
            r14 = r5
        L_0x05ba:
        L_0x05bb:
            com.google.android.gms.internal.ads.zzhk r1 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 == 0) goto L_0x05d4
            com.google.android.gms.internal.ads.zzhk r1 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            boolean r1 = r1.zzeo()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 == 0) goto L_0x05c8
            goto L_0x05d4
        L_0x05c8:
            com.google.android.gms.internal.ads.zzhk r1 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 == 0) goto L_0x05d7
            boolean r1 = r8.zzaey     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 != 0) goto L_0x05d7
            r34.zzew()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x05d7
        L_0x05d4:
            r8.zzh(r9)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x05d7:
            com.google.android.gms.internal.ads.zzhk r1 = r8.zzago     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 == 0) goto L_0x06ee
        L_0x05db:
            com.google.android.gms.internal.ads.zzhk r1 = r8.zzago     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r2 = r8.zzagn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 == r2) goto L_0x0618
            long r1 = r8.zzagl     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r3 = r8.zzago     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r3 = r3.zzafs     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r3 = r3.zzafm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0618
            com.google.android.gms.internal.ads.zzhk r1 = r8.zzago     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r1.release()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r1 = r8.zzago     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r1 = r1.zzafs     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzb((com.google.android.gms.internal.ads.zzhk) r1)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhn r1 = new com.google.android.gms.internal.ads.zzhn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r2 = r8.zzago     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r2 = r2.zzafn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r3 = r8.zzago     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r3 = r3.zzafo     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r1.<init>(r2, r3)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzafe = r1     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r34.zzet()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            android.os.Handler r1 = r8.zzaeo     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r2 = 5
            com.google.android.gms.internal.ads.zzhn r3 = r8.zzafe     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            android.os.Message r1 = r1.obtainMessage(r2, r3)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r1.sendToTarget()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x05db
        L_0x0618:
            com.google.android.gms.internal.ads.zzhk r1 = r8.zzagn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            boolean r1 = r1.zzafp     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 == 0) goto L_0x0644
            r1 = 0
        L_0x061f:
            com.google.android.gms.internal.ads.zzhx[] r2 = r8.zzael     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r2 = r2.length     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 >= r2) goto L_0x0642
            com.google.android.gms.internal.ads.zzhx[] r2 = r8.zzael     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r2 = r2[r1]     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r3 = r8.zzagn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zznm[] r3 = r3.zzafk     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r3 = r3[r1]     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r3 == 0) goto L_0x063f
            com.google.android.gms.internal.ads.zznm r4 = r2.zzdz()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r4 != r3) goto L_0x063f
            boolean r3 = r2.zzea()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r3 == 0) goto L_0x063f
            r2.zzeb()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x063f:
            int r1 = r1 + 1
            goto L_0x061f
        L_0x0642:
            goto L_0x06ee
        L_0x0644:
            r1 = 0
        L_0x0645:
            com.google.android.gms.internal.ads.zzhx[] r2 = r8.zzael     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r2 = r2.length     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 >= r2) goto L_0x0668
            com.google.android.gms.internal.ads.zzhx[] r2 = r8.zzael     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r2 = r2[r1]     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r3 = r8.zzagn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zznm[] r3 = r3.zzafk     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r3 = r3[r1]     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zznm r4 = r2.zzdz()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r4 != r3) goto L_0x0666
            if (r3 == 0) goto L_0x0663
            boolean r2 = r2.zzea()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r2 != 0) goto L_0x0663
            goto L_0x0666
        L_0x0663:
            int r1 = r1 + 1
            goto L_0x0645
        L_0x0666:
            goto L_0x06ee
        L_0x0668:
            com.google.android.gms.internal.ads.zzhk r1 = r8.zzagn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r1 = r1.zzafs     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 == 0) goto L_0x06ee
            com.google.android.gms.internal.ads.zzhk r1 = r8.zzagn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r1 = r1.zzafs     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            boolean r1 = r1.zzafq     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 == 0) goto L_0x06ee
            com.google.android.gms.internal.ads.zzhk r1 = r8.zzagn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzoi r1 = r1.zzaft     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r2 = r8.zzagn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r2 = r2.zzafs     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzagn = r2     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzoi r2 = r2.zzaft     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r3 = r8.zzagn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzmx r3 = r3.zzafi     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r3 = r3.zzho()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0695
            r3 = 1
            goto L_0x0696
        L_0x0695:
            r3 = 0
        L_0x0696:
            r4 = 0
        L_0x0697:
            com.google.android.gms.internal.ads.zzhx[] r5 = r8.zzael     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r5 = r5.length     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r4 >= r5) goto L_0x06ee
            com.google.android.gms.internal.ads.zzhx[] r5 = r8.zzael     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r5 = r5[r4]     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzod r6 = r1.zzbht     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzob r6 = r6.zzbg(r4)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r6 == 0) goto L_0x06eb
            if (r3 != 0) goto L_0x06e8
            boolean r6 = r5.zzec()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r6 != 0) goto L_0x06eb
            com.google.android.gms.internal.ads.zzod r6 = r2.zzbht     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzob r6 = r6.zzbg(r4)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhz[] r7 = r1.zzbhv     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r7 = r7[r4]     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhz[] r11 = r2.zzbhv     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r11 = r11[r4]     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r6 == 0) goto L_0x06e8
            boolean r7 = r11.equals(r7)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r7 == 0) goto L_0x06e8
            int r7 = r6.length()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzho[] r11 = new com.google.android.gms.internal.ads.zzho[r7]     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r12 = 0
        L_0x06cd:
            if (r12 >= r7) goto L_0x06d8
            com.google.android.gms.internal.ads.zzho r13 = r6.zzbe(r12)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r11[r12] = r13     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r12 = r12 + 1
            goto L_0x06cd
        L_0x06d8:
            com.google.android.gms.internal.ads.zzhk r6 = r8.zzagn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zznm[] r6 = r6.zzafk     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r6 = r6[r4]     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r7 = r8.zzagn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r12 = r7.zzen()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r5.zza(r11, r6, r12)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x06eb
        L_0x06e8:
            r5.zzeb()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x06eb:
            int r4 = r4 + 1
            goto L_0x0697
        L_0x06ee:
            com.google.android.gms.internal.ads.zzhk r1 = r8.zzago     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r2 = 10
            if (r1 != 0) goto L_0x06fc
            r34.zzev()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zza((long) r14, (long) r2)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x0864
        L_0x06fc:
            java.lang.String r1 = "doSomeWork"
            com.google.android.gms.internal.ads.zzpn.beginSection(r1)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r34.zzet()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r1 = r8.zzago     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzmx r1 = r1.zzafi     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhn r4 = r8.zzafe     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r4 = r4.zzagr     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r1.zzee(r4)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhx[] r1 = r8.zzagd     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r4 = r1.length     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r5 = 0
            r6 = 1
            r7 = 1
        L_0x0717:
            if (r5 >= r4) goto L_0x074e
            r11 = r1[r5]     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r12 = r8.zzagl     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r2 = r8.zzagi     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r11.zzb(r12, r2)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r7 == 0) goto L_0x072c
            boolean r2 = r11.zzfc()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r2 == 0) goto L_0x072c
            r7 = 1
            goto L_0x072d
        L_0x072c:
            r7 = 0
        L_0x072d:
            boolean r2 = r11.isReady()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r2 != 0) goto L_0x073c
            boolean r2 = r11.zzfc()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r2 == 0) goto L_0x073a
            goto L_0x073c
        L_0x073a:
            r2 = 0
            goto L_0x073d
        L_0x073c:
            r2 = 1
        L_0x073d:
            if (r2 != 0) goto L_0x0742
            r11.zzed()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x0742:
            if (r6 == 0) goto L_0x0748
            if (r2 == 0) goto L_0x0748
            r6 = 1
            goto L_0x0749
        L_0x0748:
            r6 = 0
        L_0x0749:
            int r5 = r5 + 1
            r2 = 10
            goto L_0x0717
        L_0x074e:
            if (r6 != 0) goto L_0x0753
            r34.zzev()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x0753:
            com.google.android.gms.internal.ads.zzpd r1 = r8.zzagc     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 == 0) goto L_0x0778
            com.google.android.gms.internal.ads.zzpd r1 = r8.zzagc     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhu r1 = r1.zzfq()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhu r2 = r8.zzafd     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            boolean r2 = r1.equals(r2)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r2 != 0) goto L_0x0778
            r8.zzafd = r1     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzpl r2 = r8.zzafy     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzpd r3 = r8.zzagc     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r2.zza(r3)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            android.os.Handler r2 = r8.zzaeo     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r3 = 7
            android.os.Message r1 = r2.obtainMessage(r3, r1)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r1.sendToTarget()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x0778:
            com.google.android.gms.internal.ads.zzhy r1 = r8.zzaez     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r2 = r8.zzago     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r2 = r2.zzafn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzia r3 = r8.zzaes     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzia r1 = r1.zza((int) r2, (com.google.android.gms.internal.ads.zzia) r3, (boolean) r9)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r1 = r1.zzaid     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r7 == 0) goto L_0x07aa
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x079a
            com.google.android.gms.internal.ads.zzhn r3 = r8.zzafe     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r3 = r3.zzagr     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x07aa
        L_0x079a:
            com.google.android.gms.internal.ads.zzhk r3 = r8.zzago     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            boolean r3 = r3.zzafp     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r3 == 0) goto L_0x07aa
            r1 = 4
            r8.setState(r1)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r34.zzes()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r4 = 2
            goto L_0x082d
        L_0x07aa:
            int r3 = r8.state     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r4 = 2
            if (r3 != r4) goto L_0x0810
            com.google.android.gms.internal.ads.zzhx[] r3 = r8.zzagd     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r3 = r3.length     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r3 <= 0) goto L_0x07fe
            if (r6 == 0) goto L_0x07fc
            boolean r1 = r8.zzagf     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r2 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            boolean r2 = r2.zzafq     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r2 != 0) goto L_0x07c3
            com.google.android.gms.internal.ads.zzhk r2 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r2 = r2.zzafo     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x07cb
        L_0x07c3:
            com.google.android.gms.internal.ads.zzhk r2 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzmx r2 = r2.zzafi     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r2 = r2.zzhp()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x07cb:
            r5 = -9223372036854775808
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x07e7
            com.google.android.gms.internal.ads.zzhk r2 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            boolean r2 = r2.zzafp     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r2 == 0) goto L_0x07d9
            r1 = 1
            goto L_0x07f8
        L_0x07d9:
            com.google.android.gms.internal.ads.zzhy r2 = r8.zzaez     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r3 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r3 = r3.zzafn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzia r5 = r8.zzaes     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzia r2 = r2.zza((int) r3, (com.google.android.gms.internal.ads.zzia) r5, (boolean) r9)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r2 = r2.zzaid     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x07e7:
            com.google.android.gms.internal.ads.zzhs r5 = r8.zzafv     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhk r6 = r8.zzagm     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r11 = r8.zzagl     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r6 = r6.zzen()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            long r11 = r11 - r6
            long r2 = r2 - r11
            boolean r1 = r5.zzc(r2, r1)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x07f8:
            if (r1 == 0) goto L_0x07fc
            r1 = 1
            goto L_0x0802
        L_0x07fc:
            r1 = 0
            goto L_0x0802
        L_0x07fe:
            boolean r1 = r8.zzdr(r1)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x0802:
            if (r1 == 0) goto L_0x082c
            r1 = 3
            r8.setState(r1)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            boolean r1 = r8.zzaeu     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 == 0) goto L_0x082c
            r34.zzer()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x082c
        L_0x0810:
            int r3 = r8.state     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r5 = 3
            if (r3 != r5) goto L_0x082c
            com.google.android.gms.internal.ads.zzhx[] r3 = r8.zzagd     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r3 = r3.length     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r3 <= 0) goto L_0x081b
            goto L_0x081f
        L_0x081b:
            boolean r6 = r8.zzdr(r1)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x081f:
            if (r6 != 0) goto L_0x082d
            boolean r1 = r8.zzaeu     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzagf = r1     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.setState(r4)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r34.zzes()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x082d
        L_0x082c:
        L_0x082d:
            int r1 = r8.state     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 != r4) goto L_0x083e
            com.google.android.gms.internal.ads.zzhx[] r1 = r8.zzagd     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r2 = r1.length     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x0834:
            if (r9 >= r2) goto L_0x083e
            r3 = r1[r9]     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r3.zzed()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r9 = r9 + 1
            goto L_0x0834
        L_0x083e:
            boolean r1 = r8.zzaeu     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 == 0) goto L_0x0847
            int r1 = r8.state     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r2 = 3
            if (r1 == r2) goto L_0x084b
        L_0x0847:
            int r1 = r8.state     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 != r4) goto L_0x0851
        L_0x084b:
            r1 = 10
            r8.zza((long) r14, (long) r1)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x0861
        L_0x0851:
            com.google.android.gms.internal.ads.zzhx[] r1 = r8.zzagd     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r1 = r1.length     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 == 0) goto L_0x085c
            r1 = 1000(0x3e8, double:4.94E-321)
            r8.zza((long) r14, (long) r1)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x0861
        L_0x085c:
            android.os.Handler r1 = r8.handler     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r1.removeMessages(r4)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x0861:
            com.google.android.gms.internal.ads.zzpn.endSection()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x0864:
            return r10
        L_0x0865:
            r4 = 2
            int r1 = r1.arg1     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 == 0) goto L_0x086c
            r1 = 1
            goto L_0x086d
        L_0x086c:
            r1 = 0
        L_0x086d:
            r8.zzagf = r9     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzaeu = r1     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 != 0) goto L_0x087a
            r34.zzes()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r34.zzet()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x0891
        L_0x087a:
            int r1 = r8.state     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r2 = 3
            if (r1 != r2) goto L_0x0888
            r34.zzer()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            android.os.Handler r1 = r8.handler     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r1.sendEmptyMessage(r4)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            goto L_0x0891
        L_0x0888:
            int r1 = r8.state     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 != r4) goto L_0x0891
            android.os.Handler r1 = r8.handler     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r1.sendEmptyMessage(r4)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x0891:
            return r10
        L_0x0892:
            r4 = 2
            java.lang.Object r2 = r1.obj     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzmz r2 = (com.google.android.gms.internal.ads.zzmz) r2     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            int r1 = r1.arg1     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 == 0) goto L_0x089d
            r1 = 1
            goto L_0x089e
        L_0x089d:
            r1 = 0
        L_0x089e:
            android.os.Handler r3 = r8.zzaeo     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r3.sendEmptyMessage(r9)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzi(r10)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhs r3 = r8.zzafv     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r3.zzez()     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            if (r1 == 0) goto L_0x08b9
            com.google.android.gms.internal.ads.zzhn r1 = new com.google.android.gms.internal.ads.zzhn     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.<init>(r9, r5)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.zzafe = r1     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
        L_0x08b9:
            r8.zzafw = r2     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            com.google.android.gms.internal.ads.zzhc r1 = r8.zzaga     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r2.zza(r1, r10, r8)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r8.setState(r4)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            android.os.Handler r1 = r8.handler     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            r1.sendEmptyMessage(r4)     // Catch:{ zzhd -> 0x0901, IOException -> 0x08e5, RuntimeException -> 0x08c9 }
            return r10
        L_0x08c9:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Internal runtime error."
            android.util.Log.e(r2, r3, r1)
            android.os.Handler r2 = r8.zzaeo
            com.google.android.gms.internal.ads.zzhd r1 = com.google.android.gms.internal.ads.zzhd.zza((java.lang.RuntimeException) r1)
            r3 = 8
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.sendToTarget()
            r34.zzeu()
            return r10
        L_0x08e5:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Source error."
            android.util.Log.e(r2, r3, r1)
            android.os.Handler r2 = r8.zzaeo
            com.google.android.gms.internal.ads.zzhd r1 = com.google.android.gms.internal.ads.zzhd.zza((java.io.IOException) r1)
            r3 = 8
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.sendToTarget()
            r34.zzeu()
            return r10
        L_0x0901:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Renderer error."
            android.util.Log.e(r2, r3, r1)
            android.os.Handler r2 = r8.zzaeo
            r3 = 8
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.sendToTarget()
            r34.zzeu()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhl.handleMessage(android.os.Message):boolean");
    }

    private final void setState(int i) {
        if (this.state != i) {
            this.state = i;
            this.zzaeo.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    private final void zzh(boolean z) {
        if (this.zzaey != z) {
            this.zzaey = z;
            this.zzaeo.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    private final void zzer() throws zzhd {
        this.zzagf = false;
        this.zzafy.start();
        for (zzhx start : this.zzagd) {
            start.start();
        }
    }

    private final void zzes() throws zzhd {
        this.zzafy.stop();
        for (zzhx zza : this.zzagd) {
            zza(zza);
        }
    }

    private final void zzet() throws zzhd {
        long j;
        zzhk zzhk = this.zzago;
        if (zzhk != null) {
            long zzho = zzhk.zzafi.zzho();
            if (zzho != -9223372036854775807L) {
                zzdq(zzho);
            } else {
                zzhx zzhx = this.zzagb;
                if (zzhx == null || zzhx.zzfc()) {
                    this.zzagl = this.zzafy.zzfx();
                } else {
                    long zzfx = this.zzagc.zzfx();
                    this.zzagl = zzfx;
                    this.zzafy.zzel(zzfx);
                }
                zzho = this.zzagl - this.zzago.zzen();
            }
            this.zzafe.zzagr = zzho;
            this.zzagi = SystemClock.elapsedRealtime() * 1000;
            if (this.zzagd.length == 0) {
                j = Long.MIN_VALUE;
            } else {
                j = this.zzago.zzafi.zzhp();
            }
            zzhn zzhn = this.zzafe;
            if (j == Long.MIN_VALUE) {
                j = this.zzaez.zza(this.zzago.zzafn, this.zzaes, false).zzaid;
            }
            zzhn.zzags = j;
        }
    }

    private final void zza(long j, long j2) {
        this.handler.removeMessages(2);
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.handler.sendEmptyMessage(2);
        } else {
            this.handler.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    private final long zza(int i, long j) throws zzhd {
        zzhk zzhk;
        zzes();
        this.zzagf = false;
        setState(2);
        zzhk zzhk2 = this.zzago;
        if (zzhk2 == null) {
            zzhk zzhk3 = this.zzagm;
            if (zzhk3 != null) {
                zzhk3.release();
            }
            zzhk = null;
        } else {
            zzhk = null;
            while (zzhk2 != null) {
                if (zzhk2.zzafn != i || !zzhk2.zzafq) {
                    zzhk2.release();
                } else {
                    zzhk = zzhk2;
                }
                zzhk2 = zzhk2.zzafs;
            }
        }
        zzhk zzhk4 = this.zzago;
        if (!(zzhk4 == zzhk && zzhk4 == this.zzagn)) {
            for (zzhx disable : this.zzagd) {
                disable.disable();
            }
            this.zzagd = new zzhx[0];
            this.zzagc = null;
            this.zzagb = null;
            this.zzago = null;
        }
        if (zzhk != null) {
            zzhk.zzafs = null;
            this.zzagm = zzhk;
            this.zzagn = zzhk;
            zzb(zzhk);
            if (this.zzago.zzafr) {
                j = this.zzago.zzafi.zzeg(j);
            }
            zzdq(j);
            zzew();
        } else {
            this.zzagm = null;
            this.zzagn = null;
            this.zzago = null;
            zzdq(j);
        }
        this.handler.sendEmptyMessage(2);
        return j;
    }

    private final void zzdq(long j) throws zzhd {
        long j2;
        zzhk zzhk = this.zzago;
        if (zzhk == null) {
            j2 = j + 60000000;
        } else {
            j2 = j + zzhk.zzen();
        }
        this.zzagl = j2;
        this.zzafy.zzel(j2);
        for (zzhx zzdo : this.zzagd) {
            zzdo.zzdo(this.zzagl);
        }
    }

    private final void zzeu() {
        zzi(true);
        this.zzafv.onStopped();
        setState(1);
    }

    private final void zzi(boolean z) {
        this.handler.removeMessages(2);
        this.zzagf = false;
        this.zzafy.stop();
        this.zzagc = null;
        this.zzagb = null;
        this.zzagl = 60000000;
        for (zzhx zzhx : this.zzagd) {
            try {
                zza(zzhx);
                zzhx.disable();
            } catch (zzhd | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.zzagd = new zzhx[0];
        zzhk zzhk = this.zzago;
        if (zzhk == null) {
            zzhk = this.zzagm;
        }
        zza(zzhk);
        this.zzagm = null;
        this.zzagn = null;
        this.zzago = null;
        zzh(false);
        if (z) {
            zzmz zzmz = this.zzafw;
            if (zzmz != null) {
                zzmz.zzhy();
                this.zzafw = null;
            }
            this.zzaez = null;
        }
    }

    private static void zza(zzhx zzhx) throws zzhd {
        if (zzhx.getState() == 2) {
            zzhx.stop();
        }
    }

    private final boolean zzdr(long j) {
        if (j == -9223372036854775807L || this.zzafe.zzagr < j) {
            return true;
        }
        return this.zzago.zzafs != null && this.zzago.zzafs.zzafq;
    }

    private final void zzev() throws IOException {
        zzhk zzhk = this.zzagm;
        if (zzhk != null && !zzhk.zzafq) {
            zzhk zzhk2 = this.zzagn;
            if (zzhk2 == null || zzhk2.zzafs == this.zzagm) {
                zzhx[] zzhxArr = this.zzagd;
                int length = zzhxArr.length;
                int i = 0;
                while (i < length) {
                    if (zzhxArr[i].zzea()) {
                        i++;
                    } else {
                        return;
                    }
                }
                this.zzagm.zzafi.zzhl();
            }
        }
    }

    private final void zza(Object obj, int i) {
        this.zzafe = new zzhn(0, 0);
        zzb(obj, i);
        this.zzafe = new zzhn(0, -9223372036854775807L);
        setState(4);
        zzi(false);
    }

    private final void zzb(Object obj, int i) {
        this.zzaeo.obtainMessage(6, new zzhp(this.zzaez, obj, this.zzafe, i)).sendToTarget();
    }

    private final int zza(int i, zzhy zzhy, zzhy zzhy2) {
        int zzfe = zzhy.zzfe();
        int i2 = -1;
        for (int i3 = 0; i3 < zzfe && i2 == -1; i3++) {
            i = zzhy.zza(i, this.zzaes, this.zzaer, this.repeatMode);
            i2 = zzhy2.zzc(zzhy.zza(i, this.zzaes, true).zzafj);
        }
        return i2;
    }

    private final boolean zzu(int i) {
        this.zzaez.zza(i, this.zzaes, false);
        if (this.zzaez.zza(0, this.zzaer, false).zzaip || this.zzaez.zza(i, this.zzaes, this.zzaer, this.repeatMode) != -1) {
            return false;
        }
        return true;
    }

    private final Pair<Integer, Long> zza(zzhm zzhm) {
        zzhy zzhy = zzhm.zzaez;
        if (zzhy.isEmpty()) {
            zzhy = this.zzaez;
        }
        try {
            Pair<Integer, Long> zzb = zzb(zzhy, zzhm.zzagp, zzhm.zzagq);
            zzhy zzhy2 = this.zzaez;
            if (zzhy2 == zzhy) {
                return zzb;
            }
            int zzc = zzhy2.zzc(zzhy.zza(((Integer) zzb.first).intValue(), this.zzaes, true).zzafj);
            if (zzc != -1) {
                return Pair.create(Integer.valueOf(zzc), (Long) zzb.second);
            }
            int zza = zza(((Integer) zzb.first).intValue(), zzhy, this.zzaez);
            if (zza == -1) {
                return null;
            }
            this.zzaez.zza(zza, this.zzaes, false);
            return zzb(0, -9223372036854775807L);
        } catch (IndexOutOfBoundsException e) {
            throw new zzht(this.zzaez, zzhm.zzagp, zzhm.zzagq);
        }
    }

    private final Pair<Integer, Long> zzb(int i, long j) {
        return zzb(this.zzaez, i, -9223372036854775807L);
    }

    private final Pair<Integer, Long> zzb(zzhy zzhy, int i, long j) {
        return zza(zzhy, i, j, 0);
    }

    private final Pair<Integer, Long> zza(zzhy zzhy, int i, long j, long j2) {
        zzoz.zzc(i, 0, zzhy.zzfd());
        zzhy.zza(i, this.zzaer, false, j2);
        if (j == -9223372036854775807L) {
            j = this.zzaer.zzais;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        long j3 = this.zzaer.zzait + j;
        long j4 = zzhy.zza(0, this.zzaes, false).zzaid;
        if (j4 != -9223372036854775807L) {
            int i2 = (j3 > j4 ? 1 : (j3 == j4 ? 0 : -1));
        }
        return Pair.create(0, Long.valueOf(j3));
    }

    private final void zzew() {
        long j;
        if (!this.zzagm.zzafq) {
            j = 0;
        } else {
            j = this.zzagm.zzafi.zzhn();
        }
        if (j == Long.MIN_VALUE) {
            zzh(false);
            return;
        }
        long zzen = this.zzagl - this.zzagm.zzen();
        boolean zzdt = this.zzafv.zzdt(j - zzen);
        zzh(zzdt);
        if (zzdt) {
            this.zzagm.zzafi.zzef(zzen);
        }
    }

    private static void zza(zzhk zzhk) {
        while (zzhk != null) {
            zzhk.release();
            zzhk = zzhk.zzafs;
        }
    }

    private final void zzb(zzhk zzhk) throws zzhd {
        if (this.zzago != zzhk) {
            boolean[] zArr = new boolean[this.zzael.length];
            int i = 0;
            int i2 = 0;
            while (true) {
                zzhx[] zzhxArr = this.zzael;
                if (i < zzhxArr.length) {
                    zzhx zzhx = zzhxArr[i];
                    zArr[i] = zzhx.getState() != 0;
                    zzob zzbg = zzhk.zzaft.zzbht.zzbg(i);
                    if (zzbg != null) {
                        i2++;
                    }
                    if (zArr[i] && (zzbg == null || (zzhx.zzec() && zzhx.zzdz() == this.zzago.zzafk[i]))) {
                        if (zzhx == this.zzagb) {
                            this.zzafy.zza(this.zzagc);
                            this.zzagc = null;
                            this.zzagb = null;
                        }
                        zza(zzhx);
                        zzhx.disable();
                    }
                    i++;
                } else {
                    this.zzago = zzhk;
                    this.zzaeo.obtainMessage(3, zzhk.zzaft).sendToTarget();
                    zza(zArr, i2);
                    return;
                }
            }
        }
    }

    private final void zza(boolean[] zArr, int i) throws zzhd {
        this.zzagd = new zzhx[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            zzhx[] zzhxArr = this.zzael;
            if (i2 < zzhxArr.length) {
                zzhx zzhx = zzhxArr[i2];
                zzob zzbg = this.zzago.zzaft.zzbht.zzbg(i2);
                if (zzbg != null) {
                    int i4 = i3 + 1;
                    this.zzagd[i3] = zzhx;
                    if (zzhx.getState() == 0) {
                        zzhz zzhz = this.zzago.zzaft.zzbhv[i2];
                        boolean z = this.zzaeu && this.state == 3;
                        boolean z2 = !zArr[i2] && z;
                        int length = zzbg.length();
                        zzho[] zzhoArr = new zzho[length];
                        for (int i5 = 0; i5 < length; i5++) {
                            zzhoArr[i5] = zzbg.zzbe(i5);
                        }
                        zzhx.zza(zzhz, zzhoArr, this.zzago.zzafk[i2], this.zzagl, z2, this.zzago.zzen());
                        zzpd zzdy = zzhx.zzdy();
                        if (zzdy != null) {
                            if (this.zzagc == null) {
                                this.zzagc = zzdy;
                                this.zzagb = zzhx;
                                zzdy.zzb(this.zzafd);
                            } else {
                                throw zzhd.zza((RuntimeException) new IllegalStateException("Multiple renderer media clocks enabled."));
                            }
                        }
                        if (z) {
                            zzhx.start();
                        }
                    }
                    i3 = i4;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final /* synthetic */ void zza(zznl zznl) {
        this.handler.obtainMessage(9, (zzmx) zznl).sendToTarget();
    }
}
