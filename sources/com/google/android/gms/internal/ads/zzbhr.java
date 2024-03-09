package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zztq;
import com.google.android.gms.internal.ads.zztw;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbhr extends zzbhx implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, zzajs, zzbfq {
    private int maxHeight = -1;
    private int maxWidth = -1;
    private String zzacx;
    private final zzbbg zzbpa;
    private final WindowManager zzbrf;
    private int zzdng = -1;
    private int zzdnh = -1;
    private boolean zzdot;
    private String zzdqg = "";
    private zzabi zzeif;
    private final zzto zzelx;
    private final zzbhg zzenm;
    private final zzeg zzenn;
    private final zzabt zzeno;
    private final zzk zzenp;
    private final zzb zzenq;
    private final zzsq zzens;
    private final boolean zzent;
    private zzc zzenx;
    private zzbhj zzenz;
    private boolean zzeob;
    private boolean zzeoc;
    private int zzeod;
    private boolean zzeoe = true;
    private boolean zzeof = false;
    private zzbgk zzeog;
    private boolean zzeoh;
    private boolean zzeoi;
    private zzadk zzeoj;
    private zzadf zzeok;
    private zzsc zzeol;
    private int zzeom;
    /* access modifiers changed from: private */
    public int zzeon;
    private zzabi zzeoo;
    private zzabi zzeop;
    private zzabh zzeoq;
    private WeakReference<View.OnClickListener> zzeor;
    private zzc zzeos;
    private zzbaq zzeou;
    private Map<String, zzbev> zzeov;
    private final zzbhi zzeps;
    private final AtomicReference<IObjectWrapper> zzept = new AtomicReference<>();
    private final DisplayMetrics zzxd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected zzbhr(zzbhg zzbhg, zzbhi zzbhi, zzbhj zzbhj, String str, boolean z, boolean z2, zzeg zzeg, zzabt zzabt, zzbbg zzbbg, zzabk zzabk, zzk zzk, zzb zzb, zzto zzto, zzsq zzsq, boolean z3) {
        super(zzbhg, zzbhi);
        zzbbg zzbbg2 = zzbbg;
        this.zzenm = zzbhg;
        this.zzeps = zzbhi;
        this.zzenz = zzbhj;
        this.zzacx = str;
        this.zzeob = z;
        this.zzeod = -1;
        this.zzenn = zzeg;
        this.zzeno = zzabt;
        this.zzbpa = zzbbg2;
        this.zzenp = zzk;
        this.zzenq = zzb;
        this.zzbrf = (WindowManager) getContext().getSystemService("window");
        zzp.zzkp();
        this.zzxd = zzayh.zza(this.zzbrf);
        this.zzelx = zzto;
        this.zzens = zzsq;
        this.zzent = z3;
        this.zzeou = new zzbaq(this.zzenm.zzzq(), this, this, (ViewTreeObserver.OnScrollChangedListener) null);
        zzp.zzkp().zza((Context) zzbhg, zzbbg2.zzbra, getSettings());
        setDownloadListener(this);
        zzacn();
        if (PlatformVersion.isAtLeastJellyBeanMR1()) {
            addJavascriptInterface(zzbgp.zzc(this), "googleAdsJsInterface");
        }
        zzacr();
        zzabh zzabh = new zzabh(new zzabk(true, "make_wv", this.zzacx));
        this.zzeoq = zzabh;
        zzabh.zzrm().zzc(zzabk);
        zzabi zzb2 = zzabb.zzb(this.zzeoq.zzrm());
        this.zzeif = zzb2;
        this.zzeoq.zza("native:view_create", zzb2);
        this.zzeop = null;
        this.zzeoo = null;
        zzp.zzkr().zzbf(zzbhg);
    }

    public final void zza(String str, Map map) {
        zzajr.zza((zzajs) this, str, map);
    }

    public final void zza(String str, JSONObject jSONObject) {
        zzajr.zza((zzajs) this, str, jSONObject);
    }

    public final void zzb(String str, JSONObject jSONObject) {
        zzajr.zzb(this, str, jSONObject);
    }

    public final void zzj(String str, String str2) {
        zzajr.zza((zzajs) this, str, str2);
    }

    public final WebView getWebView() {
        return this;
    }

    public final View getView() {
        return this;
    }

    public final zzb zzzr() {
        return this.zzenq;
    }

    private final boolean zzack() {
        int i;
        int i2;
        boolean z = false;
        if (!this.zzeps.zzabx() && !this.zzeps.zzaby()) {
            return false;
        }
        zzwe.zzpq();
        DisplayMetrics displayMetrics = this.zzxd;
        int zzb = zzbat.zzb(displayMetrics, displayMetrics.widthPixels);
        zzwe.zzpq();
        DisplayMetrics displayMetrics2 = this.zzxd;
        int zzb2 = zzbat.zzb(displayMetrics2, displayMetrics2.heightPixels);
        Activity zzzq = this.zzenm.zzzq();
        if (zzzq == null || zzzq.getWindow() == null) {
            i2 = zzb;
            i = zzb2;
        } else {
            zzp.zzkp();
            int[] zzd = zzayh.zzd(zzzq);
            zzwe.zzpq();
            int zzb3 = zzbat.zzb(this.zzxd, zzd[0]);
            zzwe.zzpq();
            i = zzbat.zzb(this.zzxd, zzd[1]);
            i2 = zzb3;
        }
        if (this.zzdng == zzb && this.zzdnh == zzb2 && this.maxWidth == i2 && this.maxHeight == i) {
            return false;
        }
        if (!(this.zzdng == zzb && this.zzdnh == zzb2)) {
            z = true;
        }
        this.zzdng = zzb;
        this.zzdnh = zzb2;
        this.maxWidth = i2;
        this.maxHeight = i;
        new zzaqg(this).zza(zzb, zzb2, i2, i, this.zzxd.density, this.zzbrf.getDefaultDisplay().getRotation());
        return z;
    }

    public final synchronized void zzb(String str, String str2, String str3) {
        String str4 = str;
        super.loadDataWithBaseURL(str4, zzbgz.zzf(str2, zzbgz.zzact()), "text/html", "UTF-8", str3);
    }

    public final synchronized void zzdc(String str) {
        if (!isDestroyed()) {
            super.zzdc(str);
        } else {
            zzaxy.zzfe("The webview is destroyed. Ignoring action.");
        }
    }

    public final void zzaax() {
        zzacm();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzbpa.zzbra);
        zzajr.zza((zzajs) this, "onhide", (Map) hashMap);
    }

    public final void zzdu(int i) {
        if (i == 0) {
            zzabb.zza(this.zzeoq.zzrm(), this.zzeif, "aebb2");
        }
        zzacm();
        if (this.zzeoq.zzrm() != null) {
            this.zzeoq.zzrm().zzh("close_type", String.valueOf(i));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.zzbpa.zzbra);
        zzajr.zza((zzajs) this, "onhide", (Map) hashMap);
    }

    private final void zzacm() {
        zzabb.zza(this.zzeoq.zzrm(), this.zzeif, "aeh2");
    }

    public final void zzuv() {
        if (this.zzeoo == null) {
            zzabb.zza(this.zzeoq.zzrm(), this.zzeif, "aes2");
            zzabi zzb = zzabb.zzb(this.zzeoq.zzrm());
            this.zzeoo = zzb;
            this.zzeoq.zza("native:view_show", zzb);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzbpa.zzbra);
        zzajr.zza((zzajs) this, "onshow", (Map) hashMap);
    }

    public final void zzaay() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(zzp.zzku().zzqe()));
        hashMap.put("app_volume", String.valueOf(zzp.zzku().zzqd()));
        hashMap.put("device_volume", String.valueOf(zzayz.zzbh(getContext())));
        zzajr.zza((zzajs) this, "volume", (Map) hashMap);
    }

    public final void zza(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", z ? "1" : "0");
        hashMap.put("duration", Long.toString(j));
        zzajr.zza((zzajs) this, "onCacheAccessComplete", (Map) hashMap);
    }

    public final synchronized zzc zzaba() {
        return this.zzenx;
    }

    public final IObjectWrapper zzabi() {
        return this.zzept.get();
    }

    public final synchronized zzc zzabb() {
        return this.zzeos;
    }

    public final synchronized zzbhj zzabc() {
        return this.zzenz;
    }

    public final synchronized String zzabd() {
        return this.zzacx;
    }

    public final WebViewClient zzabf() {
        return this.zzeps;
    }

    public final synchronized boolean zzabg() {
        return this.zzdot;
    }

    public final zzeg zzabh() {
        return this.zzenn;
    }

    public final zzbbg zzzt() {
        return this.zzbpa;
    }

    public final synchronized boolean zzabj() {
        return this.zzeob;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            zzp.zzkp();
            zzayh.zza(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            zzaxy.zzef(sb.toString());
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.zzeps.zzaby() || this.zzeps.zzabz()) {
            zzeg zzeg = this.zzenn;
            if (zzeg != null) {
                zzeg.zza(motionEvent);
            }
            zzabt zzabt = this.zzeno;
            if (zzabt != null) {
                zzabt.zza(motionEvent);
            }
        } else {
            synchronized (this) {
                if (this.zzeoj != null) {
                    this.zzeoj.zzc(motionEvent);
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01e3 A[SYNTHETIC, Splitter:B:110:0x01e3] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0148  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:64:0x00e2=Splitter:B:64:0x00e2, B:117:0x01f9=Splitter:B:117:0x01f9} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.isDestroyed()     // Catch:{ all -> 0x01fe }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01fe }
            monitor-exit(r7)
            return
        L_0x000d:
            boolean r0 = r7.isInEditMode()     // Catch:{ all -> 0x01fe }
            if (r0 != 0) goto L_0x01f9
            boolean r0 = r7.zzeob     // Catch:{ all -> 0x01fe }
            if (r0 != 0) goto L_0x01f9
            com.google.android.gms.internal.ads.zzbhj r0 = r7.zzenz     // Catch:{ all -> 0x01fe }
            boolean r0 = r0.zzacy()     // Catch:{ all -> 0x01fe }
            if (r0 == 0) goto L_0x0021
            goto L_0x01f9
        L_0x0021:
            com.google.android.gms.internal.ads.zzbhj r0 = r7.zzenz     // Catch:{ all -> 0x01fe }
            boolean r0 = r0.zzada()     // Catch:{ all -> 0x01fe }
            if (r0 == 0) goto L_0x002e
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01fe }
            monitor-exit(r7)
            return
        L_0x002e:
            com.google.android.gms.internal.ads.zzbhj r0 = r7.zzenz     // Catch:{ all -> 0x01fe }
            boolean r0 = r0.zzacz()     // Catch:{ all -> 0x01fe }
            if (r0 == 0) goto L_0x0094
            com.google.android.gms.internal.ads.zzaai<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzaat.zzcru     // Catch:{ all -> 0x01fe }
            com.google.android.gms.internal.ads.zzaap r1 = com.google.android.gms.internal.ads.zzwe.zzpu()     // Catch:{ all -> 0x01fe }
            java.lang.Object r0 = r1.zzd(r0)     // Catch:{ all -> 0x01fe }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01fe }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01fe }
            if (r0 == 0) goto L_0x004d
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01fe }
            monitor-exit(r7)
            return
        L_0x004d:
            com.google.android.gms.internal.ads.zzbgk r0 = r7.zzzo()     // Catch:{ all -> 0x01fe }
            r1 = 0
            if (r0 == 0) goto L_0x005a
            float r0 = r0.getAspectRatio()     // Catch:{ all -> 0x01fe }
            goto L_0x005b
        L_0x005a:
            r0 = 0
        L_0x005b:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0064
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01fe }
            monitor-exit(r7)
            return
        L_0x0064:
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01fe }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01fe }
            float r1 = (float) r9     // Catch:{ all -> 0x01fe }
            float r1 = r1 * r0
            int r1 = (int) r1     // Catch:{ all -> 0x01fe }
            float r2 = (float) r8     // Catch:{ all -> 0x01fe }
            float r2 = r2 / r0
            int r2 = (int) r2     // Catch:{ all -> 0x01fe }
            if (r9 != 0) goto L_0x007e
            if (r2 == 0) goto L_0x007e
            float r9 = (float) r2     // Catch:{ all -> 0x01fe }
            float r9 = r9 * r0
            int r1 = (int) r9     // Catch:{ all -> 0x01fe }
            r9 = r2
            goto L_0x0087
        L_0x007e:
            if (r8 != 0) goto L_0x0087
            if (r1 == 0) goto L_0x0087
            float r8 = (float) r1     // Catch:{ all -> 0x01fe }
            float r8 = r8 / r0
            int r2 = (int) r8     // Catch:{ all -> 0x01fe }
            r8 = r1
        L_0x0087:
            int r8 = java.lang.Math.min(r1, r8)     // Catch:{ all -> 0x01fe }
            int r9 = java.lang.Math.min(r2, r9)     // Catch:{ all -> 0x01fe }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01fe }
            monitor-exit(r7)
            return
        L_0x0094:
            com.google.android.gms.internal.ads.zzbhj r0 = r7.zzenz     // Catch:{ all -> 0x01fe }
            boolean r0 = r0.isFluid()     // Catch:{ all -> 0x01fe }
            if (r0 == 0) goto L_0x00e7
            com.google.android.gms.internal.ads.zzaai<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzaat.zzcrx     // Catch:{ all -> 0x01fe }
            com.google.android.gms.internal.ads.zzaap r1 = com.google.android.gms.internal.ads.zzwe.zzpu()     // Catch:{ all -> 0x01fe }
            java.lang.Object r0 = r1.zzd(r0)     // Catch:{ all -> 0x01fe }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01fe }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01fe }
            if (r0 != 0) goto L_0x00e2
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR1()     // Catch:{ all -> 0x01fe }
            if (r0 != 0) goto L_0x00b5
            goto L_0x00e2
        L_0x00b5:
            java.lang.String r0 = "/contentHeight"
            com.google.android.gms.internal.ads.zzbht r1 = new com.google.android.gms.internal.ads.zzbht     // Catch:{ all -> 0x01fe }
            r1.<init>(r7)     // Catch:{ all -> 0x01fe }
            r7.zza((java.lang.String) r0, (com.google.android.gms.internal.ads.zzahf<? super com.google.android.gms.internal.ads.zzbfq>) r1)     // Catch:{ all -> 0x01fe }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r7.zzdc(r0)     // Catch:{ all -> 0x01fe }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01fe }
            int r0 = r7.zzeon     // Catch:{ all -> 0x01fe }
            r1 = -1
            if (r0 == r1) goto L_0x00d8
            int r9 = r7.zzeon     // Catch:{ all -> 0x01fe }
            float r9 = (float) r9     // Catch:{ all -> 0x01fe }
            android.util.DisplayMetrics r0 = r7.zzxd     // Catch:{ all -> 0x01fe }
            float r0 = r0.density     // Catch:{ all -> 0x01fe }
            float r9 = r9 * r0
            int r9 = (int) r9     // Catch:{ all -> 0x01fe }
            goto L_0x00dd
        L_0x00d8:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01fe }
        L_0x00dd:
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01fe }
            monitor-exit(r7)
            return
        L_0x00e2:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01fe }
            monitor-exit(r7)
            return
        L_0x00e7:
            com.google.android.gms.internal.ads.zzbhj r0 = r7.zzenz     // Catch:{ all -> 0x01fe }
            boolean r0 = r0.zzacx()     // Catch:{ all -> 0x01fe }
            if (r0 == 0) goto L_0x00fc
            android.util.DisplayMetrics r8 = r7.zzxd     // Catch:{ all -> 0x01fe }
            int r8 = r8.widthPixels     // Catch:{ all -> 0x01fe }
            android.util.DisplayMetrics r9 = r7.zzxd     // Catch:{ all -> 0x01fe }
            int r9 = r9.heightPixels     // Catch:{ all -> 0x01fe }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01fe }
            monitor-exit(r7)
            return
        L_0x00fc:
            int r0 = android.view.View.MeasureSpec.getMode(r8)     // Catch:{ all -> 0x01fe }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01fe }
            int r2 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01fe }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01fe }
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r4) goto L_0x011d
            if (r0 != r3) goto L_0x0119
            goto L_0x011d
        L_0x0119:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x011e
        L_0x011d:
            r0 = r8
        L_0x011e:
            if (r2 == r4) goto L_0x0123
            if (r2 != r3) goto L_0x0124
        L_0x0123:
            r5 = r9
        L_0x0124:
            com.google.android.gms.internal.ads.zzbhj r2 = r7.zzenz     // Catch:{ all -> 0x01fe }
            int r2 = r2.widthPixels     // Catch:{ all -> 0x01fe }
            r3 = 1
            if (r2 > r0) goto L_0x0135
            com.google.android.gms.internal.ads.zzbhj r2 = r7.zzenz     // Catch:{ all -> 0x01fe }
            int r2 = r2.heightPixels     // Catch:{ all -> 0x01fe }
            if (r2 <= r5) goto L_0x0133
            goto L_0x0135
        L_0x0133:
            r2 = 0
            goto L_0x0136
        L_0x0135:
            r2 = 1
        L_0x0136:
            com.google.android.gms.internal.ads.zzaai<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.zzaat.zzcuh     // Catch:{ all -> 0x01fe }
            com.google.android.gms.internal.ads.zzaap r6 = com.google.android.gms.internal.ads.zzwe.zzpu()     // Catch:{ all -> 0x01fe }
            java.lang.Object r4 = r6.zzd(r4)     // Catch:{ all -> 0x01fe }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01fe }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01fe }
            if (r4 == 0) goto L_0x0178
            com.google.android.gms.internal.ads.zzbhj r4 = r7.zzenz     // Catch:{ all -> 0x01fe }
            int r4 = r4.widthPixels     // Catch:{ all -> 0x01fe }
            float r4 = (float) r4     // Catch:{ all -> 0x01fe }
            android.util.DisplayMetrics r6 = r7.zzxd     // Catch:{ all -> 0x01fe }
            float r6 = r6.density     // Catch:{ all -> 0x01fe }
            float r4 = r4 / r6
            float r0 = (float) r0     // Catch:{ all -> 0x01fe }
            android.util.DisplayMetrics r6 = r7.zzxd     // Catch:{ all -> 0x01fe }
            float r6 = r6.density     // Catch:{ all -> 0x01fe }
            float r0 = r0 / r6
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0171
            com.google.android.gms.internal.ads.zzbhj r0 = r7.zzenz     // Catch:{ all -> 0x01fe }
            int r0 = r0.heightPixels     // Catch:{ all -> 0x01fe }
            float r0 = (float) r0     // Catch:{ all -> 0x01fe }
            android.util.DisplayMetrics r4 = r7.zzxd     // Catch:{ all -> 0x01fe }
            float r4 = r4.density     // Catch:{ all -> 0x01fe }
            float r0 = r0 / r4
            float r4 = (float) r5     // Catch:{ all -> 0x01fe }
            android.util.DisplayMetrics r5 = r7.zzxd     // Catch:{ all -> 0x01fe }
            float r5 = r5.density     // Catch:{ all -> 0x01fe }
            float r4 = r4 / r5
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0171
            goto L_0x0172
        L_0x0171:
            r3 = 0
        L_0x0172:
            if (r2 == 0) goto L_0x0176
            r2 = r3
            goto L_0x0179
        L_0x0176:
            goto L_0x0179
        L_0x0178:
        L_0x0179:
            r0 = 8
            if (r2 == 0) goto L_0x01e3
            com.google.android.gms.internal.ads.zzbhj r2 = r7.zzenz     // Catch:{ all -> 0x01fe }
            int r2 = r2.widthPixels     // Catch:{ all -> 0x01fe }
            float r2 = (float) r2     // Catch:{ all -> 0x01fe }
            android.util.DisplayMetrics r3 = r7.zzxd     // Catch:{ all -> 0x01fe }
            float r3 = r3.density     // Catch:{ all -> 0x01fe }
            float r2 = r2 / r3
            int r2 = (int) r2     // Catch:{ all -> 0x01fe }
            com.google.android.gms.internal.ads.zzbhj r3 = r7.zzenz     // Catch:{ all -> 0x01fe }
            int r3 = r3.heightPixels     // Catch:{ all -> 0x01fe }
            float r3 = (float) r3     // Catch:{ all -> 0x01fe }
            android.util.DisplayMetrics r4 = r7.zzxd     // Catch:{ all -> 0x01fe }
            float r4 = r4.density     // Catch:{ all -> 0x01fe }
            float r3 = r3 / r4
            int r3 = (int) r3     // Catch:{ all -> 0x01fe }
            float r8 = (float) r8     // Catch:{ all -> 0x01fe }
            android.util.DisplayMetrics r4 = r7.zzxd     // Catch:{ all -> 0x01fe }
            float r4 = r4.density     // Catch:{ all -> 0x01fe }
            float r8 = r8 / r4
            int r8 = (int) r8     // Catch:{ all -> 0x01fe }
            float r9 = (float) r9     // Catch:{ all -> 0x01fe }
            android.util.DisplayMetrics r4 = r7.zzxd     // Catch:{ all -> 0x01fe }
            float r4 = r4.density     // Catch:{ all -> 0x01fe }
            float r9 = r9 / r4
            int r9 = (int) r9     // Catch:{ all -> 0x01fe }
            r4 = 103(0x67, float:1.44E-43)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fe }
            r5.<init>(r4)     // Catch:{ all -> 0x01fe }
            java.lang.String r4 = "Not enough space to show ad. Needs "
            r5.append(r4)     // Catch:{ all -> 0x01fe }
            r5.append(r2)     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = "x"
            r5.append(r2)     // Catch:{ all -> 0x01fe }
            r5.append(r3)     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = " dp, but only has "
            r5.append(r2)     // Catch:{ all -> 0x01fe }
            r5.append(r8)     // Catch:{ all -> 0x01fe }
            java.lang.String r8 = "x"
            r5.append(r8)     // Catch:{ all -> 0x01fe }
            r5.append(r9)     // Catch:{ all -> 0x01fe }
            java.lang.String r8 = " dp."
            r5.append(r8)     // Catch:{ all -> 0x01fe }
            java.lang.String r8 = r5.toString()     // Catch:{ all -> 0x01fe }
            com.google.android.gms.internal.ads.zzaxy.zzfe(r8)     // Catch:{ all -> 0x01fe }
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01fe }
            if (r8 == r0) goto L_0x01de
            r8 = 4
            r7.setVisibility(r8)     // Catch:{ all -> 0x01fe }
        L_0x01de:
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01fe }
            monitor-exit(r7)
            return
        L_0x01e3:
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01fe }
            if (r8 == r0) goto L_0x01ec
            r7.setVisibility(r1)     // Catch:{ all -> 0x01fe }
        L_0x01ec:
            com.google.android.gms.internal.ads.zzbhj r8 = r7.zzenz     // Catch:{ all -> 0x01fe }
            int r8 = r8.widthPixels     // Catch:{ all -> 0x01fe }
            com.google.android.gms.internal.ads.zzbhj r9 = r7.zzenz     // Catch:{ all -> 0x01fe }
            int r9 = r9.heightPixels     // Catch:{ all -> 0x01fe }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01fe }
            monitor-exit(r7)
            return
        L_0x01f9:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01fe }
            monitor-exit(r7)
            return
        L_0x01fe:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbhr.onMeasure(int, int):void");
    }

    public final void onGlobalLayout() {
        boolean zzack = zzack();
        zzc zzaba = zzaba();
        if (zzaba != null && zzack) {
            zzaba.zzuu();
        }
    }

    public final synchronized void zza(zzc zzc) {
        this.zzenx = zzc;
    }

    public final void zzap(IObjectWrapper iObjectWrapper) {
        this.zzept.set(iObjectWrapper);
    }

    public final synchronized void zzb(zzc zzc) {
        this.zzeos = zzc;
    }

    public final synchronized void zza(zzbhj zzbhj) {
        this.zzenz = zzbhj;
        requestLayout();
    }

    public final synchronized void zzax(boolean z) {
        boolean z2 = z != this.zzeob;
        this.zzeob = z;
        zzacn();
        if (z2) {
            if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcmr)).booleanValue() || !this.zzenz.zzacx()) {
                new zzaqg(this).zzdz(z ? "expanded" : "default");
            }
        }
    }

    public final void zzabn() {
        this.zzeou.zzyi();
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isDestroyed()) {
            this.zzeou.onAttachedToWindow();
        }
        boolean z = this.zzeoh;
        if (this.zzeps != null && this.zzeps.zzaby()) {
            if (!this.zzeoi) {
                this.zzeps.zzaca();
                this.zzeps.zzacb();
                this.zzeoi = true;
            }
            zzack();
            z = true;
        }
        zzbd(z);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!isDestroyed()) {
                this.zzeou.onDetachedFromWindow();
            }
            super.onDetachedFromWindow();
            if (this.zzeoi && this.zzeps != null && this.zzeps.zzaby() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzeps.zzaca();
                this.zzeps.zzacb();
                this.zzeoi = false;
            }
        }
        zzbd(false);
    }

    public final void zzbv(Context context) {
        this.zzenm.setBaseContext(context);
        this.zzeou.zzh(this.zzenm.zzzq());
    }

    public final synchronized void zzal(boolean z) {
        if (this.zzenx != null) {
            this.zzenx.zza(this.zzeps.zzabx(), z);
        } else {
            this.zzdot = z;
        }
    }

    public final void zzabk() {
    }

    public final synchronized void setRequestedOrientation(int i) {
        this.zzeod = i;
        if (this.zzenx != null) {
            this.zzenx.setRequestedOrientation(i);
        }
    }

    public final Activity zzzq() {
        return this.zzenm.zzzq();
    }

    public final Context zzaaz() {
        return this.zzenm.zzaaz();
    }

    private final synchronized void zzacn() {
        if (!this.zzeob) {
            if (!this.zzenz.zzacx()) {
                if (Build.VERSION.SDK_INT < 18) {
                    zzaxy.zzef("Disabling hardware acceleration on an AdView.");
                    zzaco();
                    return;
                }
                zzaxy.zzef("Enabling hardware acceleration on an AdView.");
                zzacp();
                return;
            }
        }
        zzaxy.zzef("Enabling hardware acceleration on an overlay.");
        zzacp();
    }

    private final synchronized void zzaco() {
        if (!this.zzeoc) {
            zzp.zzkr();
            setLayerType(1, (Paint) null);
        }
        this.zzeoc = true;
    }

    private final synchronized void zzacp() {
        if (this.zzeoc) {
            zzp.zzkr();
            setLayerType(0, (Paint) null);
        }
        this.zzeoc = false;
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzbe(boolean z) {
        if (!z) {
            zzacr();
            this.zzeou.zzyj();
            if (this.zzenx != null) {
                this.zzenx.close();
                this.zzenx.onDestroy();
                this.zzenx = null;
            }
        }
        this.zzept.set((Object) null);
        this.zzeps.destroy();
        zzp.zzll();
        zzbes.zzc(this);
        zzacq();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
            super.onDraw(canvas);
            zzbhi zzbhi = this.zzeps;
        }
    }

    public final void zzabo() {
        if (this.zzeop == null) {
            zzabi zzb = zzabb.zzb(this.zzeoq.zzrm());
            this.zzeop = zzb;
            this.zzeoq.zza("native:view_load", zzb);
        }
    }

    public final void onPause() {
        try {
            super.onPause();
        } catch (Exception e) {
            zzaxy.zzc("Could not pause webview.", e);
        }
    }

    public final void onResume() {
        try {
            super.onResume();
        } catch (Exception e) {
            zzaxy.zzc("Could not resume webview.", e);
        }
    }

    public final void zzabr() {
        zzaxy.zzei("Cannot add text view to inner AdWebView");
    }

    public final void zzba(boolean z) {
        this.zzeps.zzba(z);
    }

    public final void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception e) {
            zzaxy.zzc("Could not stop loading webview.", e);
        }
    }

    public final synchronized void zzay(boolean z) {
        this.zzeoe = z;
    }

    public final synchronized boolean zzabl() {
        return this.zzeoe;
    }

    public final synchronized void zzkl() {
        this.zzeof = true;
        if (this.zzenp != null) {
            this.zzenp.zzkl();
        }
    }

    public final synchronized void zzkm() {
        this.zzeof = false;
        if (this.zzenp != null) {
            this.zzenp.zzkm();
        }
    }

    private final synchronized void zzacq() {
        if (this.zzeov != null) {
            for (zzbev release : this.zzeov.values()) {
                release.release();
            }
        }
        this.zzeov = null;
    }

    public final synchronized void zza(String str, zzbev zzbev) {
        if (this.zzeov == null) {
            this.zzeov = new HashMap();
        }
        this.zzeov.put(str, zzbev);
    }

    public final synchronized zzbev zzfj(String str) {
        if (this.zzeov == null) {
            return null;
        }
        return this.zzeov.get(str);
    }

    public final synchronized String getRequestId() {
        return this.zzdqg;
    }

    public final zzbcx zzzn() {
        return null;
    }

    public final zzabi zzzp() {
        return this.zzeif;
    }

    public final zzabh zzzs() {
        return this.zzeoq;
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zzeor = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final synchronized void zza(zzadk zzadk) {
        this.zzeoj = zzadk;
    }

    public final synchronized zzadk zzabp() {
        return this.zzeoj;
    }

    public final synchronized void zzzw() {
        if (this.zzeok != null) {
            this.zzeok.zzsc();
        }
    }

    public final synchronized void zza(zzadf zzadf) {
        this.zzeok = zzadf;
    }

    public final synchronized void zza(zzsc zzsc) {
        this.zzeol = zzsc;
    }

    public final synchronized zzsc zzabs() {
        return this.zzeol;
    }

    public final synchronized zzbgk zzzo() {
        return this.zzeog;
    }

    public final synchronized void zza(zzbgk zzbgk) {
        if (this.zzeog != null) {
            zzaxy.zzfc("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzeog = zzbgk;
        }
    }

    public final synchronized boolean zzabm() {
        return this.zzeom > 0;
    }

    public final synchronized void zzaz(boolean z) {
        int i = this.zzeom + (z ? 1 : -1);
        this.zzeom = i;
        if (i <= 0 && this.zzenx != null) {
            this.zzenx.zzux();
        }
    }

    private final void zzacr() {
        zzabk zzrm;
        zzabh zzabh = this.zzeoq;
        if (zzabh != null && (zzrm = zzabh.zzrm()) != null && zzp.zzkt().zzwd() != null) {
            zzp.zzkt().zzwd().zza(zzrm);
        }
    }

    public final void zzabq() {
        setBackgroundColor(0);
    }

    public final void zzav(boolean z) {
        this.zzeps.zzav(z);
    }

    public final void zzuw() {
        zzc zzaba = zzaba();
        if (zzaba != null) {
            zzaba.zzuw();
        }
    }

    public final int zzzu() {
        return getMeasuredHeight();
    }

    public final int zzzv() {
        return getMeasuredWidth();
    }

    public final void zza(zzd zzd) {
        this.zzeps.zza(zzd);
    }

    public final void zzc(boolean z, int i) {
        this.zzeps.zzc(z, i);
    }

    public final void zza(boolean z, int i, String str) {
        this.zzeps.zza(z, i, str);
    }

    public final void zza(boolean z, int i, String str, String str2) {
        this.zzeps.zza(z, i, str, str2);
    }

    public final void zza(zzqr zzqr) {
        synchronized (this) {
            this.zzeoh = zzqr.zzbrk;
        }
        zzbd(zzqr.zzbrk);
    }

    private final void zzbd(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        zzajr.zza((zzajs) this, "onAdVisibilityChanged", (Map) hashMap);
    }

    public final void zza(String str, zzahf<? super zzbfq> zzahf) {
        zzbhi zzbhi = this.zzeps;
        if (zzbhi != null) {
            zzbhi.zza(str, zzahf);
        }
    }

    public final void zzb(String str, zzahf<? super zzbfq> zzahf) {
        zzbhi zzbhi = this.zzeps;
        if (zzbhi != null) {
            zzbhi.zzb(str, zzahf);
        }
    }

    public final void zza(String str, Predicate<zzahf<? super zzbfq>> predicate) {
        zzbhi zzbhi = this.zzeps;
        if (zzbhi != null) {
            zzbhi.zza(str, predicate);
        }
    }

    public final boolean zzb(boolean z, int i) {
        destroy();
        this.zzelx.zza((zztn) new zzbhq(z, i));
        this.zzelx.zza(zztq.zza.zzb.ANDROID_WEBVIEW_CRASH);
        return true;
    }

    public final boolean zzabt() {
        return false;
    }

    public final void zza(ViewGroup viewGroup, Activity activity, String str, String str2) {
        if (!zzabv()) {
            zzaxy.zzei("AR ad is not enabled or the ad from the server is not an AR ad.");
            return;
        }
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).removeView(this);
        }
        zzaxy.zzei("Initializing ArWebView object.");
        this.zzens.zza(activity, this);
        this.zzens.zzc(str, str2);
        if (viewGroup != null) {
            viewGroup.addView(this.zzens.getView());
        } else {
            zzaxy.zzfc("The FrameLayout object cannot be null.");
        }
    }

    public final zzsq zzabu() {
        return this.zzens;
    }

    public final boolean zzabv() {
        return ((Boolean) zzwe.zzpu().zzd(zzaat.zzcwc)).booleanValue() && this.zzens != null && this.zzent;
    }

    public final /* synthetic */ zzbhc zzabe() {
        return this.zzeps;
    }

    static final /* synthetic */ void zza(boolean z, int i, zztw.zzi.zza zza) {
        zztw.zzae.zza zzpd = zztw.zzae.zzpd();
        if (zzpd.zzpc() != z) {
            zzpd.zzx(z);
        }
        zza.zza((zztw.zzae) ((zzegp) zzpd.zzcy(i).zzbfx()));
    }
}
