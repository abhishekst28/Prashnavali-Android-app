package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaat;
import com.google.android.gms.internal.ads.zzabk;
import com.google.android.gms.internal.ads.zzabt;
import com.google.android.gms.internal.ads.zzagl;
import com.google.android.gms.internal.ads.zzagn;
import com.google.android.gms.internal.ads.zzahi;
import com.google.android.gms.internal.ads.zzaqf;
import com.google.android.gms.internal.ads.zzaqk;
import com.google.android.gms.internal.ads.zzavu;
import com.google.android.gms.internal.ads.zzaxy;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzbbg;
import com.google.android.gms.internal.ads.zzbfq;
import com.google.android.gms.internal.ads.zzbfy;
import com.google.android.gms.internal.ads.zzbhc;
import com.google.android.gms.internal.ads.zzbhf;
import com.google.android.gms.internal.ads.zzbhj;
import com.google.android.gms.internal.ads.zzeg;
import com.google.android.gms.internal.ads.zzsq;
import com.google.android.gms.internal.ads.zzto;
import com.google.android.gms.internal.ads.zzut;
import com.google.android.gms.internal.ads.zzwe;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class zzc extends zzaqk implements zzy {
    private static final int zzdnn = Color.argb(0, 0, 0, 0);
    protected final Activity zzaas;
    private boolean zzbor = false;
    zzbfq zzdgc;
    AdOverlayInfoParcel zzdno;
    private zzi zzdnp;
    private zzq zzdnq;
    private boolean zzdnr = false;
    private FrameLayout zzdns;
    private WebChromeClient.CustomViewCallback zzdnt;
    private boolean zzdnu = false;
    private zzj zzdnv;
    private boolean zzdnw = false;
    int zzdnx = 0;
    private final Object zzdny = new Object();
    private Runnable zzdnz;
    private boolean zzdoa;
    private boolean zzdob;
    private boolean zzdoc = false;
    private boolean zzdod = false;
    private boolean zzdoe = true;

    public zzc(Activity activity) {
        this.zzaas = activity;
    }

    public final void close() {
        this.zzdnx = 2;
        this.zzaas.finish();
    }

    public final void zzuo() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzdno;
        if (adOverlayInfoParcel != null && this.zzdnr) {
            setRequestedOrientation(adOverlayInfoParcel.orientation);
        }
        if (this.zzdns != null) {
            this.zzaas.setContentView(this.zzdnv);
            this.zzdob = true;
            this.zzdns.removeAllViews();
            this.zzdns = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzdnt;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzdnt = null;
        }
        this.zzdnr = false;
    }

    public final void zzup() {
        this.zzdnx = 1;
        this.zzaas.finish();
    }

    public final void onBackPressed() {
        this.zzdnx = 0;
    }

    public final boolean zzuq() {
        this.zzdnx = 0;
        zzbfq zzbfq = this.zzdgc;
        if (zzbfq == null) {
            return true;
        }
        boolean zzabl = zzbfq.zzabl();
        if (!zzabl) {
            this.zzdgc.zza("onbackblocked", Collections.emptyMap());
        }
        return zzabl;
    }

    public void onCreate(Bundle bundle) {
        this.zzaas.requestWindowFeature(1);
        this.zzdnu = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel zzc = AdOverlayInfoParcel.zzc(this.zzaas.getIntent());
            this.zzdno = zzc;
            if (zzc != null) {
                if (zzc.zzbpa.zzedr > 7500000) {
                    this.zzdnx = 3;
                }
                if (this.zzaas.getIntent() != null) {
                    this.zzdoe = this.zzaas.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                }
                if (this.zzdno.zzdoy != null) {
                    this.zzbor = this.zzdno.zzdoy.zzbor;
                } else {
                    this.zzbor = false;
                }
                if (this.zzbor && this.zzdno.zzdoy.zzbow != -1) {
                    new zzl(this).zzwv();
                }
                if (bundle == null) {
                    if (this.zzdno.zzdor != null && this.zzdoe) {
                        this.zzdno.zzdor.zzuj();
                    }
                    if (!(this.zzdno.zzdow == 1 || this.zzdno.zzcgq == null)) {
                        this.zzdno.zzcgq.onAdClicked();
                    }
                }
                zzj zzj = new zzj(this.zzaas, this.zzdno.zzdox, this.zzdno.zzbpa.zzbra);
                this.zzdnv = zzj;
                zzj.setId(1000);
                zzp.zzkr().zzg(this.zzaas);
                int i = this.zzdno.zzdow;
                if (i == 1) {
                    zzaj(false);
                } else if (i == 2) {
                    this.zzdnp = new zzi(this.zzdno.zzdgc);
                    zzaj(false);
                } else if (i == 3) {
                    zzaj(true);
                } else {
                    throw new zzg("Could not determine ad overlay type.");
                }
            } else {
                throw new zzg("Could not get info for ad overlay.");
            }
        } catch (zzg e) {
            zzaxy.zzfe(e.getMessage());
            this.zzdnx = 3;
            this.zzaas.finish();
        }
    }

    public final void onRestart() {
    }

    public final void onStart() {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcth)).booleanValue()) {
            zzbfq zzbfq = this.zzdgc;
            if (zzbfq == null || zzbfq.isDestroyed()) {
                zzaxy.zzfe("The webview does not exist. Ignoring action.");
                return;
            }
            zzp.zzkr();
            zzaym.zzb(this.zzdgc);
        }
    }

    public final void onResume() {
        if (this.zzdno.zzdor != null) {
            this.zzdno.zzdor.onResume();
        }
        zza(this.zzaas.getResources().getConfiguration());
        if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcth)).booleanValue()) {
            zzbfq zzbfq = this.zzdgc;
            if (zzbfq == null || zzbfq.isDestroyed()) {
                zzaxy.zzfe("The webview does not exist. Ignoring action.");
                return;
            }
            zzp.zzkr();
            zzaym.zzb(this.zzdgc);
        }
    }

    public final void onPause() {
        zzuo();
        if (this.zzdno.zzdor != null) {
            this.zzdno.zzdor.onPause();
        }
        if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcth)).booleanValue() && this.zzdgc != null && (!this.zzaas.isFinishing() || this.zzdnp == null)) {
            zzp.zzkr();
            zzaym.zza(this.zzdgc);
        }
        zzus();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void zzad(IObjectWrapper iObjectWrapper) {
        zza((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzdnu);
    }

    public final void onStop() {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcth)).booleanValue() && this.zzdgc != null && (!this.zzaas.isFinishing() || this.zzdnp == null)) {
            zzp.zzkr();
            zzaym.zza(this.zzdgc);
        }
        zzus();
    }

    public final void onDestroy() {
        zzbfq zzbfq = this.zzdgc;
        if (zzbfq != null) {
            try {
                this.zzdnv.removeView(zzbfq.getView());
            } catch (NullPointerException e) {
            }
        }
        zzus();
    }

    private final void zzai(boolean z) {
        int intValue = ((Integer) zzwe.zzpu().zzd(zzaat.zzctj)).intValue();
        zzp zzp = new zzp();
        zzp.size = 50;
        zzp.paddingLeft = z ? intValue : 0;
        zzp.paddingRight = z ? 0 : intValue;
        zzp.paddingTop = 0;
        zzp.paddingBottom = intValue;
        this.zzdnq = new zzq(this.zzaas, zzp, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        zza(z, this.zzdno.zzdot);
        this.zzdnv.addView(this.zzdnq, layoutParams);
    }

    public final void zzdo() {
        this.zzdob = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0015, code lost:
        r0 = r6.zzdno;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(boolean r7, boolean r8) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzaai<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzaat.zzcok
            com.google.android.gms.internal.ads.zzaap r1 = com.google.android.gms.internal.ads.zzwe.zzpu()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0027
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r6.zzdno
            if (r0 == 0) goto L_0x0027
            com.google.android.gms.ads.internal.zzi r0 = r0.zzdoy
            if (r0 == 0) goto L_0x0027
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r6.zzdno
            com.google.android.gms.ads.internal.zzi r0 = r0.zzdoy
            boolean r0 = r0.zzboy
            if (r0 == 0) goto L_0x0027
            r0 = 1
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            com.google.android.gms.internal.ads.zzaai<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.zzaat.zzcol
            com.google.android.gms.internal.ads.zzaap r4 = com.google.android.gms.internal.ads.zzwe.zzpu()
            java.lang.Object r3 = r4.zzd(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x004d
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r6.zzdno
            if (r3 == 0) goto L_0x004d
            com.google.android.gms.ads.internal.zzi r3 = r3.zzdoy
            if (r3 == 0) goto L_0x004d
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r6.zzdno
            com.google.android.gms.ads.internal.zzi r3 = r3.zzdoy
            boolean r3 = r3.zzboz
            if (r3 == 0) goto L_0x004d
            r3 = 1
            goto L_0x004e
        L_0x004d:
            r3 = 0
        L_0x004e:
            if (r7 == 0) goto L_0x0064
            if (r8 == 0) goto L_0x0064
            if (r0 == 0) goto L_0x0064
            if (r3 != 0) goto L_0x0064
            com.google.android.gms.internal.ads.zzaqg r7 = new com.google.android.gms.internal.ads.zzaqg
            com.google.android.gms.internal.ads.zzbfq r4 = r6.zzdgc
            java.lang.String r5 = "useCustomClose"
            r7.<init>(r4, r5)
            java.lang.String r4 = "Custom close has been disabled for interstitial ads in this ad slot."
            r7.zzdx(r4)
        L_0x0064:
            com.google.android.gms.ads.internal.overlay.zzq r7 = r6.zzdnq
            if (r7 == 0) goto L_0x0073
            if (r3 != 0) goto L_0x0070
            if (r8 == 0) goto L_0x006f
            if (r0 != 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r1 = 0
        L_0x0070:
            r7.zzal(r1)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzc.zza(boolean, boolean):void");
    }

    public final void zzur() {
        this.zzdnv.removeView(this.zzdnq);
        zzai(true);
    }

    public final void setRequestedOrientation(int i) {
        if (this.zzaas.getApplicationInfo().targetSdkVersion >= ((Integer) zzwe.zzpu().zzd(zzaat.zzcvl)).intValue()) {
            if (this.zzaas.getApplicationInfo().targetSdkVersion <= ((Integer) zzwe.zzpu().zzd(zzaat.zzcvm)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) zzwe.zzpu().zzd(zzaat.zzcvn)).intValue()) {
                    if (Build.VERSION.SDK_INT <= ((Integer) zzwe.zzpu().zzd(zzaat.zzcvo)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.zzaas.setRequestedOrientation(i);
        } catch (Throwable th) {
            zzp.zzkt().zzb(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zza(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.zzaas);
        this.zzdns = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.zzdns.addView(view, -1, -1);
        this.zzaas.setContentView(this.zzdns);
        this.zzdob = true;
        this.zzdnt = customViewCallback;
        this.zzdnr = true;
    }

    private final void zzaj(boolean z) throws zzg {
        String str;
        zzb zzb;
        zza zza;
        if (!this.zzdob) {
            this.zzaas.requestWindowFeature(1);
        }
        Window window = this.zzaas.getWindow();
        if (window != null) {
            zzbhc zzabe = this.zzdno.zzdgc != null ? this.zzdno.zzdgc.zzabe() : null;
            boolean z2 = false;
            boolean z3 = zzabe != null && zzabe.zzabx();
            this.zzdnw = false;
            if (z3) {
                int i = this.zzdno.orientation;
                zzp.zzkr();
                if (i == 6) {
                    if (this.zzaas.getResources().getConfiguration().orientation == 1) {
                        z2 = true;
                    }
                    this.zzdnw = z2;
                } else {
                    int i2 = this.zzdno.orientation;
                    zzp.zzkr();
                    if (i2 == 7) {
                        if (this.zzaas.getResources().getConfiguration().orientation == 2) {
                            z2 = true;
                        }
                        this.zzdnw = z2;
                    }
                }
            }
            boolean z4 = this.zzdnw;
            StringBuilder sb = new StringBuilder(46);
            sb.append("Delay onShow to next orientation change: ");
            sb.append(z4);
            zzaxy.zzef(sb.toString());
            setRequestedOrientation(this.zzdno.orientation);
            zzp.zzkr();
            window.setFlags(16777216, 16777216);
            zzaxy.zzef("Hardware acceleration on the AdActivity window enabled.");
            if (!this.zzbor) {
                this.zzdnv.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            } else {
                this.zzdnv.setBackgroundColor(zzdnn);
            }
            this.zzaas.setContentView(this.zzdnv);
            this.zzdob = true;
            if (z) {
                try {
                    zzp.zzkq();
                    Activity activity = this.zzaas;
                    zzbhj zzabc = this.zzdno.zzdgc != null ? this.zzdno.zzdgc.zzabc() : null;
                    if (this.zzdno.zzdgc != null) {
                        str = this.zzdno.zzdgc.zzabd();
                    } else {
                        str = null;
                    }
                    zzbbg zzbbg = this.zzdno.zzbpa;
                    if (this.zzdno.zzdgc != null) {
                        zzb = this.zzdno.zzdgc.zzzr();
                    } else {
                        zzb = null;
                    }
                    zzbfq zza2 = zzbfy.zza(activity, zzabc, str, true, z3, (zzeg) null, (zzabt) null, zzbbg, (zzabk) null, (zzk) null, zzb, zzto.zzmy(), (zzsq) null, false);
                    this.zzdgc = zza2;
                    zzbhc zzabe2 = zza2.zzabe();
                    zzagl zzagl = this.zzdno.zzddv;
                    zzagn zzagn = this.zzdno.zzddw;
                    zzt zzt = this.zzdno.zzdov;
                    if (this.zzdno.zzdgc != null) {
                        zza = this.zzdno.zzdgc.zzabe().zzabw();
                    } else {
                        zza = null;
                    }
                    zzabe2.zza((zzut) null, zzagl, (zzo) null, zzagn, zzt, true, (zzahi) null, zza, (zzaqf) null, (zzavu) null);
                    this.zzdgc.zzabe().zza((zzbhf) new zzf(this));
                    if (this.zzdno.url != null) {
                        this.zzdgc.loadUrl(this.zzdno.url);
                    } else if (this.zzdno.zzdou != null) {
                        this.zzdgc.loadDataWithBaseURL(this.zzdno.zzdos, this.zzdno.zzdou, "text/html", "UTF-8", (String) null);
                    } else {
                        throw new zzg("No URL or HTML to display in ad overlay.");
                    }
                    if (this.zzdno.zzdgc != null) {
                        this.zzdno.zzdgc.zzb(this);
                    }
                } catch (Exception e) {
                    zzaxy.zzc("Error obtaining webview.", e);
                    throw new zzg("Could not obtain webview for the overlay.");
                }
            } else {
                zzbfq zzbfq = this.zzdno.zzdgc;
                this.zzdgc = zzbfq;
                zzbfq.zzbv(this.zzaas);
            }
            this.zzdgc.zza(this);
            if (this.zzdno.zzdgc != null) {
                zzc(this.zzdno.zzdgc.zzabi(), this.zzdnv);
            }
            ViewParent parent = this.zzdgc.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.zzdgc.getView());
            }
            if (this.zzbor) {
                this.zzdgc.zzabq();
            }
            this.zzdgc.zza((ViewGroup) null, this.zzaas, this.zzdno.zzdos, this.zzdno.zzdou);
            this.zzdnv.addView(this.zzdgc.getView(), -1, -1);
            if (!z && !this.zzdnw) {
                zzuv();
            }
            zzai(z3);
            if (this.zzdgc.zzabg()) {
                zza(z3, true);
                return;
            }
            return;
        }
        throw new zzg("Invalid activity, no window available.");
    }

    private final void zzus() {
        if (this.zzaas.isFinishing() && !this.zzdoc) {
            this.zzdoc = true;
            zzbfq zzbfq = this.zzdgc;
            if (zzbfq != null) {
                zzbfq.zzdu(this.zzdnx);
                synchronized (this.zzdny) {
                    if (!this.zzdoa && this.zzdgc.zzabm()) {
                        this.zzdnz = new zze(this);
                        zzayh.zzeaj.postDelayed(this.zzdnz, ((Long) zzwe.zzpu().zzd(zzaat.zzcoj)).longValue());
                        return;
                    }
                }
            }
            zzut();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzut() {
        if (!this.zzdod) {
            this.zzdod = true;
            zzbfq zzbfq = this.zzdgc;
            if (zzbfq != null) {
                this.zzdnv.removeView(zzbfq.getView());
                zzi zzi = this.zzdnp;
                if (zzi != null) {
                    this.zzdgc.zzbv(zzi.zzvr);
                    this.zzdgc.zzax(false);
                    this.zzdnp.parent.addView(this.zzdgc.getView(), this.zzdnp.index, this.zzdnp.zzdok);
                    this.zzdnp = null;
                } else if (this.zzaas.getApplicationContext() != null) {
                    this.zzdgc.zzbv(this.zzaas.getApplicationContext());
                }
                this.zzdgc = null;
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.zzdno;
            if (!(adOverlayInfoParcel == null || adOverlayInfoParcel.zzdor == null)) {
                this.zzdno.zzdor.zzui();
            }
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzdno;
            if (adOverlayInfoParcel2 != null && adOverlayInfoParcel2.zzdgc != null) {
                zzc(this.zzdno.zzdgc.zzabi(), this.zzdno.zzdgc.getView());
            }
        }
    }

    private static void zzc(IObjectWrapper iObjectWrapper, View view) {
        if (iObjectWrapper != null && view != null) {
            zzp.zzle().zza(iObjectWrapper, view);
        }
    }

    public final void zzuu() {
        if (this.zzdnw) {
            this.zzdnw = false;
            zzuv();
        }
    }

    private final void zzuv() {
        this.zzdgc.zzuv();
    }

    public final void zzuw() {
        this.zzdnv.zzdom = true;
    }

    public final void zzux() {
        synchronized (this.zzdny) {
            this.zzdoa = true;
            if (this.zzdnz != null) {
                zzayh.zzeaj.removeCallbacks(this.zzdnz);
                zzayh.zzeaj.post(this.zzdnz);
            }
        }
    }

    private final void zza(Configuration configuration) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzdno;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (adOverlayInfoParcel2 == null || adOverlayInfoParcel2.zzdoy == null || !this.zzdno.zzdoy.zzbos) ? false : true;
        boolean zza = zzp.zzkr().zza(this.zzaas, configuration);
        if ((this.zzbor && !z3) || zza) {
            z = false;
        } else if (Build.VERSION.SDK_INT >= 19 && (adOverlayInfoParcel = this.zzdno) != null && adOverlayInfoParcel.zzdoy != null && this.zzdno.zzdoy.zzbox) {
            z2 = true;
        }
        Window window = this.zzaas.getWindow();
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcom)).booleanValue() && Build.VERSION.SDK_INT >= 19) {
            View decorView = window.getDecorView();
            int i = 256;
            if (z) {
                i = 5380;
                if (z2) {
                    i = 5894;
                }
            }
            decorView.setSystemUiVisibility(i);
        } else if (z) {
            window.addFlags(1024);
            window.clearFlags(2048);
            if (Build.VERSION.SDK_INT >= 19 && z2) {
                window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
            }
        } else {
            window.addFlags(2048);
            window.clearFlags(1024);
        }
    }
}
