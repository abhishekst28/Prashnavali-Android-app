package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.util.Predicate;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzbhi extends zzbhv implements zzbhc {
    private final Object lock = new Object();
    private volatile boolean zzbrb;
    private zzut zzcgq;
    private zzagl zzddv;
    private zzagn zzddw;
    private zza zzder;
    private zzapw zzdes;
    private zzo zzdor;
    private zzt zzdov;
    private boolean zzdsu;
    protected zzbfq zzelw;
    private zzbhf zzelz;
    private zzbhe zzema;
    private zzbhh zzemb;
    private boolean zzemc = false;
    private boolean zzemd;
    private boolean zzeme;
    private boolean zzemf;
    private zzaqd zzemg;
    private zzavu zzemh;
    private boolean zzemi;
    private boolean zzemj;
    private int zzemk;
    private View.OnAttachStateChangeListener zzeml;
    private final zzajw<zzbfq> zzepp = new zzajw<>();

    /* access modifiers changed from: package-private */
    public final void zza(zzbfq zzbfq, boolean z) {
        zzaqd zzaqd = new zzaqd(zzbfq, zzbfq.zzaaz(), new zzaae(zzbfq.getContext()));
        this.zzelw = zzbfq;
        this.zzbrb = z;
        this.zzemg = zzaqd;
        this.zzdes = null;
        this.zzepp.zzg(zzbfq);
    }

    public final void zza(int i, int i2, boolean z) {
        this.zzemg.zzj(i, i2);
        zzapw zzapw = this.zzdes;
        if (zzapw != null) {
            zzapw.zza(i, i2, false);
        }
    }

    public final void zza(String str, zzahf<? super zzbfq> zzahf) {
        this.zzepp.zza(str, zzahf);
    }

    public final void zzb(String str, zzahf<? super zzbfq> zzahf) {
        this.zzepp.zzb(str, zzahf);
    }

    public final void zza(String str, Predicate<zzahf<? super zzbfq>> predicate) {
        this.zzepp.zza(str, predicate);
    }

    public final void zza(zzut zzut, zzagl zzagl, zzo zzo, zzagn zzagn, zzt zzt, boolean z, zzahi zzahi, zza zza, zzaqf zzaqf, zzavu zzavu) {
        if (zza == null) {
            zza = new zza(this.zzelw.getContext(), zzavu, (zzasa) null);
        }
        this.zzdes = new zzapw(this.zzelw, zzaqf);
        this.zzemh = zzavu;
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcoc)).booleanValue()) {
            zza("/adMetadata", (zzahf<? super zzbfq>) new zzagm(zzagl));
        }
        zza("/appEvent", (zzahf<? super zzbfq>) new zzago(zzagn));
        zza("/backButton", (zzahf<? super zzbfq>) zzagp.zzdeh);
        zza("/refresh", (zzahf<? super zzbfq>) zzagp.zzdei);
        zza("/canOpenApp", (zzahf<? super zzbfq>) zzagp.zzddy);
        zza("/canOpenURLs", (zzahf<? super zzbfq>) zzagp.zzddx);
        zza("/canOpenIntents", (zzahf<? super zzbfq>) zzagp.zzddz);
        zza("/click", (zzahf<? super zzbfq>) zzagp.zzdea);
        zza("/close", (zzahf<? super zzbfq>) zzagp.zzdeb);
        zza("/customClose", (zzahf<? super zzbfq>) zzagp.zzdec);
        zza("/instrument", (zzahf<? super zzbfq>) zzagp.zzdel);
        zza("/delayPageLoaded", (zzahf<? super zzbfq>) zzagp.zzden);
        zza("/delayPageClosed", (zzahf<? super zzbfq>) zzagp.zzdeo);
        zza("/getLocationInfo", (zzahf<? super zzbfq>) zzagp.zzdep);
        zza("/httpTrack", (zzahf<? super zzbfq>) zzagp.zzded);
        zza("/log", (zzahf<? super zzbfq>) zzagp.zzdee);
        zza("/mraid", (zzahf<? super zzbfq>) new zzahk(zza, this.zzdes, zzaqf));
        zza("/mraidLoaded", (zzahf<? super zzbfq>) this.zzemg);
        zza("/open", (zzahf<? super zzbfq>) new zzahj(zza, this.zzdes));
        zza("/precache", (zzahf<? super zzbfq>) new zzbfa());
        zza("/touch", (zzahf<? super zzbfq>) zzagp.zzdeg);
        zza("/video", (zzahf<? super zzbfq>) zzagp.zzdej);
        zza("/videoMeta", (zzahf<? super zzbfq>) zzagp.zzdek);
        if (zzp.zzln().zzac(this.zzelw.getContext())) {
            zza("/logScionEvent", (zzahf<? super zzbfq>) new zzahh(this.zzelw.getContext()));
        }
        this.zzcgq = zzut;
        this.zzdor = zzo;
        this.zzddv = zzagl;
        this.zzddw = zzagn;
        this.zzdov = zzt;
        this.zzder = zza;
        this.zzemc = z;
    }

    public final zza zzabw() {
        return this.zzder;
    }

    public final boolean zzabx() {
        return this.zzbrb;
    }

    public final boolean zzaby() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzemd;
        }
        return z;
    }

    public final boolean zzabz() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzeme;
        }
        return z;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zzaca() {
        synchronized (this.lock) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzacb() {
        synchronized (this.lock) {
        }
        return null;
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        zzsq zzabu = this.zzelw.zzabu();
        if (zzabu != null && webView == zzabu.getWebView()) {
            zzabu.onPageStarted(webView, str, bitmap);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    public final void zza(zzbhu zzbhu) {
        this.zzemi = true;
        zzbhe zzbhe = this.zzema;
        if (zzbhe != null) {
            zzbhe.zztf();
            this.zzema = null;
        }
        zzach();
    }

    /* access modifiers changed from: private */
    public final void zza(View view, zzavu zzavu, int i) {
        if (zzavu.zzvo() && i > 0) {
            zzavu.zzl(view);
            if (zzavu.zzvo()) {
                zzayh.zzeaj.postDelayed(new zzbhk(this, view, zzavu, i), 100);
            }
        }
    }

    private final void zzacc() {
        if (this.zzeml != null) {
            this.zzelw.getView().removeOnAttachStateChangeListener(this.zzeml);
        }
    }

    public final void zzacd() {
        zzavu zzavu = this.zzemh;
        if (zzavu != null) {
            WebView webView = this.zzelw.getWebView();
            if (ViewCompat.isAttachedToWindow(webView)) {
                zza((View) webView, zzavu, 10);
                return;
            }
            zzacc();
            this.zzeml = new zzbhn(this, zzavu);
            this.zzelw.getView().addOnAttachStateChangeListener(this.zzeml);
        }
    }

    public final void zzace() {
        synchronized (this.lock) {
            this.zzemf = true;
        }
        this.zzemk++;
        zzach();
    }

    public final void zzacf() {
        this.zzemk--;
        zzach();
    }

    public final void zzacg() {
        this.zzemj = true;
        zzach();
    }

    private final void zzach() {
        if (this.zzelz != null && ((this.zzemi && this.zzemk <= 0) || this.zzemj)) {
            this.zzelz.zzak(!this.zzemj);
            this.zzelz = null;
        }
        this.zzelw.zzabo();
    }

    public final void zza(zzd zzd) {
        boolean zzabj = this.zzelw.zzabj();
        zza(new AdOverlayInfoParcel(zzd, (!zzabj || this.zzelw.zzabc().zzacx()) ? this.zzcgq : null, zzabj ? null : this.zzdor, this.zzdov, this.zzelw.zzzt()));
    }

    public final void zzc(boolean z, int i) {
        zzut zzut = (!this.zzelw.zzabj() || this.zzelw.zzabc().zzacx()) ? this.zzcgq : null;
        zzo zzo = this.zzdor;
        zzt zzt = this.zzdov;
        zzbfq zzbfq = this.zzelw;
        zza(new AdOverlayInfoParcel(zzut, zzo, zzt, zzbfq, z, i, zzbfq.zzzt()));
    }

    public final void zza(boolean z, int i, String str) {
        zzbhm zzbhm;
        boolean zzabj = this.zzelw.zzabj();
        zzut zzut = (!zzabj || this.zzelw.zzabc().zzacx()) ? this.zzcgq : null;
        if (zzabj) {
            zzbhm = null;
        } else {
            zzbhm = new zzbhm(this.zzelw, this.zzdor);
        }
        zzagl zzagl = this.zzddv;
        zzagn zzagn = this.zzddw;
        zzt zzt = this.zzdov;
        zzbfq zzbfq = this.zzelw;
        zza(new AdOverlayInfoParcel(zzut, (zzo) zzbhm, zzagl, zzagn, zzt, zzbfq, z, i, str, zzbfq.zzzt()));
    }

    public final void zza(boolean z, int i, String str, String str2) {
        zzbhm zzbhm;
        boolean zzabj = this.zzelw.zzabj();
        zzut zzut = (!zzabj || this.zzelw.zzabc().zzacx()) ? this.zzcgq : null;
        if (zzabj) {
            zzbhm = null;
        } else {
            zzbhm = new zzbhm(this.zzelw, this.zzdor);
        }
        zzagl zzagl = this.zzddv;
        zzagn zzagn = this.zzddw;
        zzt zzt = this.zzdov;
        zzbfq zzbfq = this.zzelw;
        zza(new AdOverlayInfoParcel(zzut, zzbhm, zzagl, zzagn, zzt, zzbfq, z, i, str, str2, zzbfq.zzzt()));
    }

    private final void zza(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z;
        zzapw zzapw = this.zzdes;
        if (zzapw != null) {
            z = zzapw.zzuk();
        } else {
            z = false;
        }
        zzp.zzko();
        zzn.zza(this.zzelw.getContext(), adOverlayInfoParcel, !z);
        if (this.zzemh != null) {
            String str = adOverlayInfoParcel.url;
            if (str == null && adOverlayInfoParcel.zzdoq != null) {
                str = adOverlayInfoParcel.zzdoq.url;
            }
            this.zzemh.zzea(str);
        }
    }

    public final void destroy() {
        zzavu zzavu = this.zzemh;
        if (zzavu != null) {
            zzavu.zzvq();
            this.zzemh = null;
        }
        zzacc();
        this.zzepp.reset();
        this.zzepp.zzg(null);
        synchronized (this.lock) {
            this.zzcgq = null;
            this.zzdor = null;
            this.zzelz = null;
            this.zzema = null;
            this.zzddv = null;
            this.zzddw = null;
            this.zzdov = null;
            this.zzemb = null;
            if (this.zzdes != null) {
                this.zzdes.zzac(true);
                this.zzdes = null;
            }
        }
    }

    public final void zza(zzbhf zzbhf) {
        this.zzelz = zzbhf;
    }

    public final void zza(zzbhe zzbhe) {
        this.zzema = zzbhe;
    }

    public final void zzb(zzbhu zzbhu) {
        this.zzepp.zzg(zzbhu.uri);
    }

    public final boolean zzc(zzbhu zzbhu) {
        String valueOf = String.valueOf(zzbhu.url);
        zzaxy.zzei(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri uri = zzbhu.uri;
        if (this.zzepp.zzg(uri)) {
            return true;
        }
        if (this.zzemc) {
            String scheme = uri.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                zzut zzut = this.zzcgq;
                if (zzut != null) {
                    zzut.onAdClicked();
                    zzavu zzavu = this.zzemh;
                    if (zzavu != null) {
                        zzavu.zzea(zzbhu.url);
                    }
                    this.zzcgq = null;
                }
                return false;
            }
        }
        if (!this.zzelw.getWebView().willNotDraw()) {
            try {
                zzeg zzabh = this.zzelw.zzabh();
                if (zzabh != null && zzabh.zzb(uri)) {
                    uri = zzabh.zza(uri, this.zzelw.getContext(), this.zzelw.getView(), this.zzelw.zzzq());
                }
            } catch (zzef e) {
                String valueOf2 = String.valueOf(zzbhu.url);
                zzaxy.zzfe(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
            }
            zza zza = this.zzder;
            if (zza == null || zza.zzjx()) {
                zza(new zzd("android.intent.action.VIEW", uri.toString(), (String) null, (String) null, (String) null, (String) null, (String) null));
            } else {
                this.zzder.zzbo(zzbhu.url);
            }
        } else {
            String valueOf3 = String.valueOf(zzbhu.url);
            zzaxy.zzfe(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
        }
        return true;
    }

    public final WebResourceResponse zzd(zzbhu zzbhu) {
        WebResourceResponse webResourceResponse;
        zzsv zza;
        String str;
        zzavu zzavu = this.zzemh;
        if (zzavu != null) {
            zzavu.zza(zzbhu.url, zzbhu.zzam, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(zzbhu.url).getName())) {
            webResourceResponse = null;
        } else {
            zzur();
            if (this.zzelw.zzabc().zzacx()) {
                str = (String) zzwe.zzpu().zzd(zzaat.zzcmp);
            } else if (this.zzelw.zzabj()) {
                str = (String) zzwe.zzpu().zzd(zzaat.zzcmo);
            } else {
                str = (String) zzwe.zzpu().zzd(zzaat.zzcmn);
            }
            zzp.zzkp();
            webResourceResponse = zzayh.zzd(this.zzelw.getContext(), this.zzelw.zzzt().zzbra, str);
        }
        if (webResourceResponse != null) {
            return webResourceResponse;
        }
        try {
            if (!zzawq.zzc(zzbhu.url, this.zzelw.getContext(), this.zzdsu).equals(zzbhu.url)) {
                return zze(zzbhu);
            }
            zzta zzbw = zzta.zzbw(zzbhu.url);
            if (zzbw != null && (zza = zzp.zzkv().zza(zzbw)) != null && zza.zzmu()) {
                return new WebResourceResponse("", "", zza.zzmv());
            }
            if (!zzbax.isEnabled() || !zzacj.zzdad.get().booleanValue()) {
                return null;
            }
            return zze(zzbhu);
        } catch (Exception | NoClassDefFoundError e) {
            zzp.zzkt().zza(e, "AdWebViewClient.interceptRequest");
            return zzaci();
        }
    }

    private static WebResourceResponse zzaci() {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcnr)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse zze(zzbhu zzbhu) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url = new URL(zzbhu.url);
        int i = 0;
        while (true) {
            i++;
            if (i <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry next : zzbhu.zzam.entrySet()) {
                    openConnection.addRequestProperty((String) next.getKey(), (String) next.getValue());
                }
                if (openConnection instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) openConnection;
                    zzp.zzkp().zza(this.zzelw.getContext(), this.zzelw.zzzt().zzbra, false, httpURLConnection);
                    zzbax zzbax = new zzbax();
                    zzbax.zza(httpURLConnection, (byte[]) null);
                    int responseCode = httpURLConnection.getResponseCode();
                    zzbax.zza(httpURLConnection, responseCode);
                    if (responseCode < 300 || responseCode >= 400) {
                        zzp.zzkp();
                    } else {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField == null) {
                            throw new IOException("Missing Location header in redirect");
                        } else if (headerField.startsWith("tel:")) {
                            return null;
                        } else {
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol == null) {
                                zzaxy.zzfe("Protocol is null");
                                return zzaci();
                            } else if (protocol.equals("http") || protocol.equals("https")) {
                                String valueOf = String.valueOf(headerField);
                                zzaxy.zzef(valueOf.length() != 0 ? "Redirecting to ".concat(valueOf) : new String("Redirecting to "));
                                httpURLConnection.disconnect();
                                url = url2;
                            } else {
                                String valueOf2 = String.valueOf(protocol);
                                zzaxy.zzfe(valueOf2.length() != 0 ? "Unsupported scheme: ".concat(valueOf2) : new String("Unsupported scheme: "));
                                return zzaci();
                            }
                        }
                    }
                } else {
                    throw new IOException("Invalid protocol.");
                }
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Too many redirects (20)");
                throw new IOException(sb.toString());
            }
        }
        zzp.zzkp();
        return zzayh.zzd(httpURLConnection);
    }

    public final void zzav(boolean z) {
        this.zzemc = z;
    }

    public final zzavu zzacj() {
        return this.zzemh;
    }

    public final void zzur() {
        synchronized (this.lock) {
            this.zzemc = false;
            this.zzbrb = true;
            zzbbi.zzedy.execute(new zzbhl(this));
        }
    }

    public final void zzba(boolean z) {
        this.zzdsu = z;
    }

    public final void zzi(int i, int i2) {
        zzapw zzapw = this.zzdes;
        if (zzapw != null) {
            zzapw.zzi(i, i2);
        }
    }

    public final void zzbb(boolean z) {
        synchronized (this.lock) {
            this.zzemd = true;
        }
    }

    public final void zzbc(boolean z) {
        synchronized (this.lock) {
            this.zzeme = z;
        }
    }

    public final void zzh(Uri uri) {
        this.zzepp.zzh(uri);
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzelw.zzb(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }
}
