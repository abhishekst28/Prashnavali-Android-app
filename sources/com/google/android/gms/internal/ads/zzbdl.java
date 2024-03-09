package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.zzp;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbdl extends zzbcp implements TextureView.SurfaceTextureListener, zzbei {
    private Surface zzblg;
    private final zzbdh zzeen;
    private final boolean zzeeo;
    private int zzeet;
    private int zzeeu;
    private int zzeew;
    private int zzeex;
    private zzbdc zzeey;
    private final boolean zzeez;
    private zzbcm zzefb;
    private final zzbde zzefm;
    private String[] zzefz;
    private final zzbdf zzeiw;
    private zzbeb zzeix;
    private String zzeiy;
    private boolean zzeiz;
    private int zzeja = 1;
    private boolean zzejb;
    private boolean zzejc;
    private float zzejd;

    public zzbdl(Context context, zzbdh zzbdh, zzbde zzbde, boolean z, boolean z2, zzbdf zzbdf) {
        super(context);
        this.zzeeo = z2;
        this.zzefm = zzbde;
        this.zzeen = zzbdh;
        this.zzeez = z;
        this.zzeiw = zzbdf;
        setSurfaceTextureListener(this);
        this.zzeen.zzb(this);
    }

    private final zzbeb zzaab() {
        return new zzbeb(this.zzefm.getContext(), this.zzeiw);
    }

    private final String zzaac() {
        return zzp.zzkp().zzs(this.zzefm.getContext(), this.zzefm.zzzt().zzbra);
    }

    private final boolean zzaad() {
        zzbeb zzbeb = this.zzeix;
        return (zzbeb == null || zzbeb.zzaaq() == null || this.zzeiz) ? false : true;
    }

    private final boolean zzaae() {
        return zzaad() && this.zzeja != 1;
    }

    private final void zzaaf() {
        String str;
        if (this.zzeix == null && (str = this.zzeiy) != null && this.zzblg != null) {
            if (str.startsWith("cache:")) {
                zzbev zzfj = this.zzefm.zzfj(this.zzeiy);
                if (zzfj instanceof zzbfg) {
                    zzbeb zzaav = ((zzbfg) zzfj).zzaav();
                    this.zzeix = zzaav;
                    if (zzaav.zzaaq() == null) {
                        zzaxy.zzfe("Precached video player has been released.");
                        return;
                    }
                } else if (zzfj instanceof zzbfh) {
                    zzbfh zzbfh = (zzbfh) zzfj;
                    String zzaac = zzaac();
                    ByteBuffer byteBuffer = zzbfh.getByteBuffer();
                    boolean zzaaw = zzbfh.zzaaw();
                    String url = zzbfh.getUrl();
                    if (url == null) {
                        zzaxy.zzfe("Stream cache URL is null.");
                        return;
                    }
                    zzbeb zzaab = zzaab();
                    this.zzeix = zzaab;
                    zzaab.zza(new Uri[]{Uri.parse(url)}, zzaac, byteBuffer, zzaaw);
                } else {
                    String valueOf = String.valueOf(this.zzeiy);
                    zzaxy.zzfe(valueOf.length() != 0 ? "Stream cache miss: ".concat(valueOf) : new String("Stream cache miss: "));
                    return;
                }
            } else {
                this.zzeix = zzaab();
                String zzaac2 = zzaac();
                Uri[] uriArr = new Uri[this.zzefz.length];
                int i = 0;
                while (true) {
                    String[] strArr = this.zzefz;
                    if (i >= strArr.length) {
                        break;
                    }
                    uriArr[i] = Uri.parse(strArr[i]);
                    i++;
                }
                this.zzeix.zza(uriArr, zzaac2);
            }
            this.zzeix.zza((zzbei) this);
            zza(this.zzblg, false);
            if (this.zzeix.zzaaq() != null) {
                int playbackState = this.zzeix.zzaaq().getPlaybackState();
                this.zzeja = playbackState;
                if (playbackState == 3) {
                    zzaag();
                }
            }
        }
    }

    private final void zza(Surface surface, boolean z) {
        zzbeb zzbeb = this.zzeix;
        if (zzbeb != null) {
            zzbeb.zza(surface, z);
        } else {
            zzaxy.zzfe("Trying to set surface before player is initalized.");
        }
    }

    private final void zza(float f, boolean z) {
        zzbeb zzbeb = this.zzeix;
        if (zzbeb != null) {
            zzbeb.zzb(f, z);
        } else {
            zzaxy.zzfe("Trying to set volume before player is initalized.");
        }
    }

    public final void zzyx() {
        zza(this.zzefk.getVolume(), false);
    }

    private final void zzaag() {
        if (!this.zzejb) {
            this.zzejb = true;
            zzayh.zzeaj.post(new zzbdk(this));
            zzyx();
            this.zzeen.zzez();
            if (this.zzejc) {
                play();
            }
        }
    }

    public final String zzyt() {
        String valueOf = String.valueOf("ExoPlayer/3");
        String valueOf2 = String.valueOf(this.zzeez ? " spherical" : "");
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public final void zza(zzbcm zzbcm) {
        this.zzefb = zzbcm;
    }

    public final void setVideoPath(String str) {
        if (str != null) {
            this.zzeiy = str;
            this.zzefz = new String[]{str};
            zzaaf();
        }
    }

    public final void zzb(String str, String[] strArr) {
        if (str != null) {
            if (strArr == null) {
                setVideoPath(str);
            }
            this.zzeiy = str;
            this.zzefz = (String[]) Arrays.copyOf(strArr, strArr.length);
            zzaaf();
        }
    }

    public final void play() {
        if (zzaae()) {
            if (this.zzeiw.zzehu) {
                zzaai();
            }
            this.zzeix.zzaaq().zzf(true);
            this.zzeen.zzzy();
            this.zzefk.zzzy();
            this.zzefj.zzyz();
            zzayh.zzeaj.post(new zzbdp(this));
            return;
        }
        this.zzejc = true;
    }

    public final void stop() {
        if (zzaad()) {
            this.zzeix.zzaaq().stop();
            if (this.zzeix != null) {
                zza((Surface) null, true);
                zzbeb zzbeb = this.zzeix;
                if (zzbeb != null) {
                    zzbeb.zza((zzbei) null);
                    this.zzeix.release();
                    this.zzeix = null;
                }
                this.zzeja = 1;
                this.zzeiz = false;
                this.zzejb = false;
                this.zzejc = false;
            }
        }
        this.zzeen.zzzz();
        this.zzefk.zzzz();
        this.zzeen.onStop();
    }

    public final void pause() {
        if (zzaae()) {
            if (this.zzeiw.zzehu) {
                zzaaj();
            }
            this.zzeix.zzaaq().zzf(false);
            this.zzeen.zzzz();
            this.zzefk.zzzz();
            zzayh.zzeaj.post(new zzbdo(this));
        }
    }

    public final void seekTo(int i) {
        if (zzaae()) {
            this.zzeix.zzaaq().seekTo((long) i);
        }
    }

    public final void zzdl(int i) {
        zzbeb zzbeb = this.zzeix;
        if (zzbeb != null) {
            zzbeb.zzaat().zzds(i);
        }
    }

    public final void zzdm(int i) {
        zzbeb zzbeb = this.zzeix;
        if (zzbeb != null) {
            zzbeb.zzaat().zzdt(i);
        }
    }

    public final void zzdn(int i) {
        zzbeb zzbeb = this.zzeix;
        if (zzbeb != null) {
            zzbeb.zzaat().zzdn(i);
        }
    }

    public final void zzdo(int i) {
        zzbeb zzbeb = this.zzeix;
        if (zzbeb != null) {
            zzbeb.zzaat().zzdo(i);
        }
    }

    public final void zzdp(int i) {
        zzbeb zzbeb = this.zzeix;
        if (zzbeb != null) {
            zzbeb.zzdp(i);
        }
    }

    public final void zza(float f, float f2) {
        zzbdc zzbdc = this.zzeey;
        if (zzbdc != null) {
            zzbdc.zzb(f, f2);
        }
    }

    public final int getCurrentPosition() {
        if (zzaae()) {
            return (int) this.zzeix.zzaaq().zzek();
        }
        return 0;
    }

    public final int getDuration() {
        if (zzaae()) {
            return (int) this.zzeix.zzaaq().getDuration();
        }
        return 0;
    }

    public final int getVideoWidth() {
        return this.zzeet;
    }

    public final int getVideoHeight() {
        return this.zzeeu;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007b A[LOOP:0: B:30:0x007b->B:35:0x0096, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r11, int r12) {
        /*
            r10 = this;
            super.onMeasure(r11, r12)
            int r11 = r10.getMeasuredWidth()
            int r12 = r10.getMeasuredHeight()
            float r0 = r10.zzejd
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 == 0) goto L_0x002a
            com.google.android.gms.internal.ads.zzbdc r2 = r10.zzeey
            if (r2 != 0) goto L_0x002a
            float r2 = (float) r11
            float r3 = (float) r12
            float r3 = r2 / r3
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x0020
            float r2 = r2 / r0
            int r12 = (int) r2
        L_0x0020:
            float r0 = r10.zzejd
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x002a
            float r11 = (float) r12
            float r11 = r11 * r0
            int r11 = (int) r11
        L_0x002a:
            r10.setMeasuredDimension(r11, r12)
            com.google.android.gms.internal.ads.zzbdc r0 = r10.zzeey
            if (r0 == 0) goto L_0x0034
            r0.zzm(r11, r12)
        L_0x0034:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r0 != r2) goto L_0x00a4
            int r0 = r10.zzeew
            if (r0 <= 0) goto L_0x0040
            if (r0 != r11) goto L_0x0046
        L_0x0040:
            int r0 = r10.zzeex
            if (r0 <= 0) goto L_0x00a0
            if (r0 == r12) goto L_0x00a0
        L_0x0046:
            boolean r0 = r10.zzeeo
            if (r0 == 0) goto L_0x00a0
            boolean r0 = r10.zzaad()
            if (r0 == 0) goto L_0x00a0
            com.google.android.gms.internal.ads.zzbeb r0 = r10.zzeix
            com.google.android.gms.internal.ads.zzhc r0 = r0.zzaaq()
            long r2 = r0.zzek()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x00a0
            boolean r2 = r0.zzei()
            if (r2 == 0) goto L_0x0068
            goto L_0x00a0
        L_0x0068:
            r2 = 1
            r10.zza((float) r1, (boolean) r2)
            r0.zzf(r2)
            long r1 = r0.zzek()
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzp.zzkw()
            long r3 = r3.currentTimeMillis()
        L_0x007b:
            boolean r5 = r10.zzaad()
            if (r5 == 0) goto L_0x0098
            long r5 = r0.zzek()
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 != 0) goto L_0x0098
            com.google.android.gms.common.util.Clock r5 = com.google.android.gms.ads.internal.zzp.zzkw()
            long r5 = r5.currentTimeMillis()
            long r5 = r5 - r3
            r7 = 250(0xfa, double:1.235E-321)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x007b
        L_0x0098:
            r1 = 0
            r0.zzf(r1)
            r10.zzyx()
        L_0x00a0:
            r10.zzeew = r11
            r10.zzeex = r12
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdl.onMeasure(int, int):void");
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.zzeez) {
            zzbdc zzbdc = new zzbdc(getContext());
            this.zzeey = zzbdc;
            zzbdc.zza(surfaceTexture, i, i2);
            this.zzeey.start();
            SurfaceTexture zzzl = this.zzeey.zzzl();
            if (zzzl != null) {
                surfaceTexture = zzzl;
            } else {
                this.zzeey.zzzk();
                this.zzeey = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzblg = surface;
        if (this.zzeix == null) {
            zzaaf();
        } else {
            zza(surface, true);
            if (!this.zzeiw.zzehu) {
                zzaai();
            }
        }
        if (this.zzeet == 0 || this.zzeeu == 0) {
            zzo(i, i2);
        } else {
            zzaah();
        }
        zzayh.zzeaj.post(new zzbdr(this));
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zzbdc zzbdc = this.zzeey;
        if (zzbdc != null) {
            zzbdc.zzm(i, i2);
        }
        zzayh.zzeaj.post(new zzbdq(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzeen.zzc(this);
        this.zzefj.zza(surfaceTexture, this.zzefb);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        pause();
        zzbdc zzbdc = this.zzeey;
        if (zzbdc != null) {
            zzbdc.zzzk();
            this.zzeey = null;
        }
        if (this.zzeix != null) {
            zzaaj();
            Surface surface = this.zzblg;
            if (surface != null) {
                surface.release();
            }
            this.zzblg = null;
            zza((Surface) null, true);
        }
        zzayh.zzeaj.post(new zzbdt(this));
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i);
        zzaxy.zzei(sb.toString());
        zzayh.zzeaj.post(new zzbds(this, i));
        super.onWindowVisibilityChanged(i);
    }

    public final void zzb(boolean z, long j) {
        if (this.zzefm != null) {
            zzbbi.zzedy.execute(new zzbdv(this, z, j));
        }
    }

    public final void zzdq(int i) {
        if (this.zzeja != i) {
            this.zzeja = i;
            if (i == 3) {
                zzaag();
            } else if (i == 4) {
                if (this.zzeiw.zzehu) {
                    zzaaj();
                }
                this.zzeen.zzzz();
                this.zzefk.zzzz();
                zzayh.zzeaj.post(new zzbdn(this));
            }
        }
    }

    public final void zzn(int i, int i2) {
        this.zzeet = i;
        this.zzeeu = i2;
        zzaah();
    }

    public final void zza(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        String sb2 = sb.toString();
        String valueOf = String.valueOf(sb2);
        zzaxy.zzfe(valueOf.length() != 0 ? "ExoPlayerAdapter error: ".concat(valueOf) : new String("ExoPlayerAdapter error: "));
        this.zzeiz = true;
        if (this.zzeiw.zzehu) {
            zzaaj();
        }
        zzayh.zzeaj.post(new zzbdm(this, sb2));
    }

    private final void zzaah() {
        zzo(this.zzeet, this.zzeeu);
    }

    private final void zzo(int i, int i2) {
        float f = i2 > 0 ? ((float) i) / ((float) i2) : 1.0f;
        if (this.zzejd != f) {
            this.zzejd = f;
            requestLayout();
        }
    }

    private final void zzaai() {
        zzbeb zzbeb = this.zzeix;
        if (zzbeb != null) {
            zzbeb.zzaw(true);
        }
    }

    private final void zzaaj() {
        zzbeb zzbeb = this.zzeix;
        if (zzbeb != null) {
            zzbeb.zzaw(false);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(boolean z, long j) {
        this.zzefm.zza(z, j);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzdr(int i) {
        zzbcm zzbcm = this.zzefb;
        if (zzbcm != null) {
            zzbcm.onWindowVisibilityChanged(i);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzaak() {
        zzbcm zzbcm = this.zzefb;
        if (zzbcm != null) {
            zzbcm.zzzb();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(int i, int i2) {
        zzbcm zzbcm = this.zzefb;
        if (zzbcm != null) {
            zzbcm.zzk(i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzaal() {
        zzbcm zzbcm = this.zzefb;
        if (zzbcm != null) {
            zzbcm.zzyy();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzaam() {
        zzbcm zzbcm = this.zzefb;
        if (zzbcm != null) {
            zzbcm.onPaused();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzaan() {
        zzbcm zzbcm = this.zzefb;
        if (zzbcm != null) {
            zzbcm.zzyz();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzfk(String str) {
        zzbcm zzbcm = this.zzefb;
        if (zzbcm != null) {
            zzbcm.zzm("ExoPlayerAdapter error", str);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzaao() {
        zzbcm zzbcm = this.zzefb;
        if (zzbcm != null) {
            zzbcm.zzza();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzaap() {
        zzbcm zzbcm = this.zzefb;
        if (zzbcm != null) {
            zzbcm.zzez();
        }
    }
}
