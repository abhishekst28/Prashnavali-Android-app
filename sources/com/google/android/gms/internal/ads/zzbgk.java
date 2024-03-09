package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbgk extends zzyj {
    private final Object lock = new Object();
    private boolean zzads;
    private boolean zzadt;
    private int zzaev;
    private zzyl zzdkl;
    private final zzbde zzefm;
    private final boolean zzeoz;
    private final boolean zzepa;
    private boolean zzepb;
    private boolean zzepc = true;
    private float zzepd;
    private float zzepe;
    private float zzepf;
    private zzafi zzepg;

    public zzbgk(zzbde zzbde, float f, boolean z, boolean z2) {
        this.zzefm = zzbde;
        this.zzepd = f;
        this.zzeoz = z;
        this.zzepa = z2;
    }

    public final void play() {
        zzf("play", (Map<String, String>) null);
    }

    public final void pause() {
        zzf("pause", (Map<String, String>) null);
    }

    public final void stop() {
        zzf("stop", (Map<String, String>) null);
    }

    public final void mute(boolean z) {
        zzf(z ? "mute" : "unmute", (Map<String, String>) null);
    }

    public final void zzb(zzaac zzaac) {
        boolean z = zzaac.zzadr;
        boolean z2 = zzaac.zzads;
        boolean z3 = zzaac.zzadt;
        synchronized (this.lock) {
            this.zzads = z2;
            this.zzadt = z3;
        }
        zzf("initialState", CollectionUtils.mapOf("muteStart", z ? "1" : "0", "customControlsRequested", z2 ? "1" : "0", "clickToExpandRequested", z3 ? "1" : "0"));
    }

    private final void zzf(String str, Map<String, String> map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        zzbbi.zzedy.execute(new zzbgn(this, hashMap));
    }

    public final boolean isMuted() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzepc;
        }
        return z;
    }

    public final int getPlaybackState() {
        int i;
        synchronized (this.lock) {
            i = this.zzaev;
        }
        return i;
    }

    public final float getAspectRatio() {
        float f;
        synchronized (this.lock) {
            f = this.zzepf;
        }
        return f;
    }

    public final float getDuration() {
        float f;
        synchronized (this.lock) {
            f = this.zzepd;
        }
        return f;
    }

    public final float getCurrentTime() {
        float f;
        synchronized (this.lock) {
            f = this.zzepe;
        }
        return f;
    }

    public final void zza(zzyl zzyl) {
        synchronized (this.lock) {
            this.zzdkl = zzyl;
        }
    }

    public final zzyl zzqj() throws RemoteException {
        zzyl zzyl;
        synchronized (this.lock) {
            zzyl = this.zzdkl;
        }
        return zzyl;
    }

    public final boolean isCustomControlsEnabled() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzeoz && this.zzads;
        }
        return z;
    }

    public final boolean isClickToExpandEnabled() {
        boolean z;
        boolean isCustomControlsEnabled = isCustomControlsEnabled();
        synchronized (this.lock) {
            if (!isCustomControlsEnabled) {
                try {
                    if (this.zzadt && this.zzepa) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z = false;
        }
        return z;
    }

    public final void zze(float f) {
        synchronized (this.lock) {
            this.zzepe = f;
        }
    }

    public final void zzacs() {
        boolean z;
        int i;
        synchronized (this.lock) {
            z = this.zzepc;
            i = this.zzaev;
            this.zzaev = 3;
        }
        zza(i, 3, z, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(float r4, float r5, int r6, boolean r7, float r8) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            float r1 = r3.zzepd     // Catch:{ all -> 0x0051 }
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0013
            float r1 = r3.zzepf     // Catch:{ all -> 0x0051 }
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r1 = 0
            goto L_0x0014
        L_0x0013:
            r1 = 1
        L_0x0014:
            r3.zzepd = r5     // Catch:{ all -> 0x0051 }
            r3.zzepe = r4     // Catch:{ all -> 0x0051 }
            boolean r4 = r3.zzepc     // Catch:{ all -> 0x0051 }
            r3.zzepc = r7     // Catch:{ all -> 0x0051 }
            int r5 = r3.zzaev     // Catch:{ all -> 0x0051 }
            r3.zzaev = r6     // Catch:{ all -> 0x0051 }
            float r2 = r3.zzepf     // Catch:{ all -> 0x0051 }
            r3.zzepf = r8     // Catch:{ all -> 0x0051 }
            float r8 = r8 - r2
            float r8 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x0051 }
            r2 = 953267991(0x38d1b717, float:1.0E-4)
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x0039
            com.google.android.gms.internal.ads.zzbde r8 = r3.zzefm     // Catch:{ all -> 0x0051 }
            android.view.View r8 = r8.getView()     // Catch:{ all -> 0x0051 }
            r8.invalidate()     // Catch:{ all -> 0x0051 }
        L_0x0039:
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x004d
            com.google.android.gms.internal.ads.zzafi r8 = r3.zzepg     // Catch:{ RemoteException -> 0x0047 }
            if (r8 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.zzafi r8 = r3.zzepg     // Catch:{ RemoteException -> 0x0047 }
            r8.zzsq()     // Catch:{ RemoteException -> 0x0047 }
        L_0x0046:
            goto L_0x004d
        L_0x0047:
            r8 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.internal.ads.zzbbd.zze(r0, r8)
        L_0x004d:
            r3.zza(r5, r6, r4, r7)
            return
        L_0x0051:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbgk.zza(float, float, int, boolean, float):void");
    }

    public final void zza(zzafi zzafi) {
        synchronized (this.lock) {
            this.zzepg = zzafi;
        }
    }

    private final void zza(int i, int i2, boolean z, boolean z2) {
        zzbbi.zzedy.execute(new zzbgm(this, i, i2, z, z2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(int i, int i2, boolean z, boolean z2) {
        synchronized (this.lock) {
            boolean z3 = false;
            boolean z4 = i != i2;
            boolean z5 = !this.zzepb && i2 == 1;
            boolean z6 = z4 && i2 == 1;
            boolean z7 = z4 && i2 == 2;
            boolean z8 = z4 && i2 == 3;
            boolean z9 = z != z2;
            if (this.zzepb || z5) {
                z3 = true;
            }
            this.zzepb = z3;
            if (z5) {
                try {
                    if (this.zzdkl != null) {
                        this.zzdkl.onVideoStart();
                    }
                } catch (RemoteException e) {
                    zzbbd.zze("#007 Could not call remote method.", e);
                }
            }
            if (z6 && this.zzdkl != null) {
                this.zzdkl.onVideoPlay();
            }
            if (z7 && this.zzdkl != null) {
                this.zzdkl.onVideoPause();
            }
            if (z8) {
                if (this.zzdkl != null) {
                    this.zzdkl.onVideoEnd();
                }
                this.zzefm.zzzw();
            }
            if (z9 && this.zzdkl != null) {
                this.zzdkl.onVideoMute(z2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(Map map) {
        this.zzefm.zza("pubVideoCmd", map);
    }
}
