package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.zzoy;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzov<T extends zzoy> extends Handler implements Runnable {
    private volatile boolean zzage;
    private final T zzbjf;
    private final zzow<T> zzbjg;
    public final int zzbjh;
    private final long zzbji;
    private IOException zzbjj;
    private int zzbjk;
    private volatile Thread zzbjl;
    private final /* synthetic */ zzot zzbjm;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzov(zzot zzot, Looper looper, T t, zzow<T> zzow, int i, long j) {
        super(looper);
        this.zzbjm = zzot;
        this.zzbjf = t;
        this.zzbjg = zzow;
        this.zzbjh = i;
        this.zzbji = j;
    }

    public final void zzbj(int i) throws IOException {
        IOException iOException = this.zzbjj;
        if (iOException != null && this.zzbjk > i) {
            throw iOException;
        }
    }

    public final void zzek(long j) {
        zzoz.checkState(this.zzbjm.zzbjb == null);
        zzov unused = this.zzbjm.zzbjb = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            execute();
        }
    }

    public final void zzl(boolean z) {
        this.zzage = z;
        this.zzbjj = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            this.zzbjf.cancelLoad();
            if (this.zzbjl != null) {
                this.zzbjl.interrupt();
            }
        }
        if (z) {
            finish();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzbjg.zza(this.zzbjf, elapsedRealtime, elapsedRealtime - this.zzbji, true);
        }
    }

    public final void run() {
        try {
            this.zzbjl = Thread.currentThread();
            if (!this.zzbjf.zzhv()) {
                String valueOf = String.valueOf(this.zzbjf.getClass().getSimpleName());
                zzpn.beginSection(valueOf.length() != 0 ? "load:".concat(valueOf) : new String("load:"));
                this.zzbjf.zzhw();
                zzpn.endSection();
            }
            if (!this.zzage) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.zzage) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (InterruptedException e2) {
            zzoz.checkState(this.zzbjf.zzhv());
            if (!this.zzage) {
                sendEmptyMessage(2);
            }
        } catch (Exception e3) {
            Log.e("LoadTask", "Unexpected exception loading stream", e3);
            if (!this.zzage) {
                obtainMessage(3, new zzox(e3)).sendToTarget();
            }
        } catch (OutOfMemoryError e4) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e4);
            if (!this.zzage) {
                obtainMessage(3, new zzox(e4)).sendToTarget();
            }
        } catch (Error e5) {
            Log.e("LoadTask", "Unexpected error loading stream", e5);
            if (!this.zzage) {
                obtainMessage(4, e5).sendToTarget();
            }
            throw e5;
        } catch (Throwable th) {
            zzpn.endSection();
            throw th;
        }
    }

    public final void handleMessage(Message message) {
        if (!this.zzage) {
            if (message.what == 0) {
                execute();
            } else if (message.what != 4) {
                finish();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.zzbji;
                if (this.zzbjf.zzhv()) {
                    this.zzbjg.zza(this.zzbjf, elapsedRealtime, j, false);
                    return;
                }
                int i = message.what;
                if (i == 1) {
                    this.zzbjg.zza(this.zzbjf, elapsedRealtime, j, false);
                } else if (i == 2) {
                    this.zzbjg.zza(this.zzbjf, elapsedRealtime, j);
                } else if (i == 3) {
                    IOException iOException = (IOException) message.obj;
                    this.zzbjj = iOException;
                    int zza = this.zzbjg.zza(this.zzbjf, elapsedRealtime, j, iOException);
                    if (zza == 3) {
                        IOException unused = this.zzbjm.zzbjc = this.zzbjj;
                    } else if (zza != 2) {
                        int i2 = zza == 1 ? 1 : this.zzbjk + 1;
                        this.zzbjk = i2;
                        zzek((long) Math.min((i2 - 1) * 1000, 5000));
                    }
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    private final void execute() {
        this.zzbjj = null;
        this.zzbjm.zzbja.execute(this.zzbjm.zzbjb);
    }

    private final void finish() {
        zzov unused = this.zzbjm.zzbjb = null;
    }
}
