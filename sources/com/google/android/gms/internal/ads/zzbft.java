package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zztq;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class zzbft extends WebViewClient implements zzbhc {
    private final Object lock;
    private boolean zzbrb;
    private zzut zzcgq;
    private zzagl zzddv;
    private zzagn zzddw;
    private zza zzder;
    private zzapw zzdes;
    private zzo zzdor;
    private zzt zzdov;
    private boolean zzdsu;
    protected zzbfq zzelw;
    private final zzto zzelx;
    private final HashMap<String, List<zzahf<? super zzbfq>>> zzely;
    private zzbhf zzelz;
    private zzbhe zzema;
    private zzbhh zzemb;
    private boolean zzemc;
    private boolean zzemd;
    private boolean zzeme;
    private boolean zzemf;
    private final zzaqd zzemg;
    protected zzavu zzemh;
    private boolean zzemi;
    private boolean zzemj;
    private int zzemk;
    private View.OnAttachStateChangeListener zzeml;

    public zzbft(zzbfq zzbfq, zzto zzto, boolean z) {
        this(zzbfq, zzto, z, new zzaqd(zzbfq, zzbfq.zzaaz(), new zzaae(zzbfq.getContext())), (zzapw) null);
    }

    private zzbft(zzbfq zzbfq, zzto zzto, boolean z, zzaqd zzaqd, zzapw zzapw) {
        this.zzely = new HashMap<>();
        this.lock = new Object();
        this.zzemc = false;
        this.zzelx = zzto;
        this.zzelw = zzbfq;
        this.zzbrb = z;
        this.zzemg = zzaqd;
        this.zzdes = null;
    }

    public final void zza(int i, int i2, boolean z) {
        this.zzemg.zzj(i, i2);
        zzapw zzapw = this.zzdes;
        if (zzapw != null) {
            zzapw.zza(i, i2, false);
        }
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
        boolean z;
        synchronized (this.lock) {
            z = this.zzbrb;
        }
        return z;
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

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        zzsq zzabu = this.zzelw.zzabu();
        if (zzabu != null && webView == zzabu.getWebView()) {
            zzabu.onPageStarted(webView, str, bitmap);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r1 == null) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        r1.zztf();
        r0.zzema = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        zzach();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r0.zzemi = true;
        r1 = r0.zzema;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
        /*
            r0 = this;
            java.lang.Object r1 = r0.lock
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbfq r2 = r0.zzelw     // Catch:{ all -> 0x002a }
            boolean r2 = r2.isDestroyed()     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = "Blank page loaded, 1..."
            com.google.android.gms.internal.ads.zzaxy.zzei(r2)     // Catch:{ all -> 0x002a }
            com.google.android.gms.internal.ads.zzbfq r2 = r0.zzelw     // Catch:{ all -> 0x002a }
            r2.zzabk()     // Catch:{ all -> 0x002a }
            monitor-exit(r1)     // Catch:{ all -> 0x002a }
            return
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x002a }
            r1 = 1
            r0.zzemi = r1
            com.google.android.gms.internal.ads.zzbhe r1 = r0.zzema
            if (r1 == 0) goto L_0x0026
            r1.zztf()
            r1 = 0
            r0.zzema = r1
        L_0x0026:
            r0.zzach()
            return
        L_0x002a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002a }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbft.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    public final void zza(View view, zzavu zzavu, int i) {
        if (zzavu.zzvo() && i > 0) {
            zzavu.zzl(view);
            if (zzavu.zzvo()) {
                zzayh.zzeaj.postDelayed(new zzbfu(this, view, zzavu, i), 100);
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
            this.zzeml = new zzbfx(this, zzavu);
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
        zzto zzto = this.zzelx;
        if (zzto != null) {
            zzto.zza(zztq.zza.zzb.DELAY_PAGE_LOAD_CANCELLED_AD);
        }
        this.zzemj = true;
        zzach();
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcuw)).booleanValue()) {
            this.zzelw.destroy();
        }
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
        zzbfz zzbfz;
        boolean zzabj = this.zzelw.zzabj();
        zzut zzut = (!zzabj || this.zzelw.zzabc().zzacx()) ? this.zzcgq : null;
        if (zzabj) {
            zzbfz = null;
        } else {
            zzbfz = new zzbfz(this.zzelw, this.zzdor);
        }
        zzagl zzagl = this.zzddv;
        zzagn zzagn = this.zzddw;
        zzt zzt = this.zzdov;
        zzbfq zzbfq = this.zzelw;
        zza(new AdOverlayInfoParcel(zzut, (zzo) zzbfz, zzagl, zzagn, zzt, zzbfq, z, i, str, zzbfq.zzzt()));
    }

    public final void zza(boolean z, int i, String str, String str2) {
        zzbfz zzbfz;
        boolean zzabj = this.zzelw.zzabj();
        zzut zzut = (!zzabj || this.zzelw.zzabc().zzacx()) ? this.zzcgq : null;
        if (zzabj) {
            zzbfz = null;
        } else {
            zzbfz = new zzbfz(this.zzelw, this.zzdor);
        }
        zzagl zzagl = this.zzddv;
        zzagn zzagn = this.zzddw;
        zzt zzt = this.zzdov;
        zzbfq zzbfq = this.zzelw;
        zza(new AdOverlayInfoParcel(zzut, zzbfz, zzagl, zzagn, zzt, zzbfq, z, i, str, str2, zzbfq.zzzt()));
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

    public final void zza(String str, zzahf<? super zzbfq> zzahf) {
        synchronized (this.lock) {
            List list = this.zzely.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.zzely.put(str, list);
            }
            list.add(zzahf);
        }
    }

    public final void zzb(String str, zzahf<? super zzbfq> zzahf) {
        synchronized (this.lock) {
            List list = this.zzely.get(str);
            if (list != null) {
                list.remove(zzahf);
            }
        }
    }

    public final void zza(String str, Predicate<zzahf<? super zzbfq>> predicate) {
        synchronized (this.lock) {
            List<zzahf> list = this.zzely.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (zzahf zzahf : list) {
                    if (predicate.apply(zzahf)) {
                        arrayList.add(zzahf);
                    }
                }
                list.removeAll(arrayList);
            }
        }
    }

    public final void reset() {
        zzavu zzavu = this.zzemh;
        if (zzavu != null) {
            zzavu.zzvq();
            this.zzemh = null;
        }
        zzacc();
        synchronized (this.lock) {
            this.zzely.clear();
            this.zzcgq = null;
            this.zzdor = null;
            this.zzelz = null;
            this.zzema = null;
            this.zzddv = null;
            this.zzddw = null;
            this.zzemc = false;
            this.zzbrb = false;
            this.zzemd = false;
            this.zzemf = false;
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

    public final void onLoadResource(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        zzaxy.zzei(valueOf.length() != 0 ? "Loading resource: ".concat(valueOf) : new String("Loading resource: "));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzh(parse);
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        zzaxy.zzei(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            if (this.zzemc && webView == this.zzelw.getWebView()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    zzut zzut = this.zzcgq;
                    if (zzut != null) {
                        zzut.onAdClicked();
                        zzavu zzavu = this.zzemh;
                        if (zzavu != null) {
                            zzavu.zzea(str);
                        }
                        this.zzcgq = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.zzelw.getWebView().willNotDraw()) {
                try {
                    zzeg zzabh = this.zzelw.zzabh();
                    if (zzabh != null && zzabh.zzb(parse)) {
                        parse = zzabh.zza(parse, this.zzelw.getContext(), this.zzelw.getView(), this.zzelw.zzzq());
                    }
                } catch (zzef e) {
                    String valueOf2 = String.valueOf(str);
                    zzaxy.zzfe(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
                }
                zza zza = this.zzder;
                if (zza == null || zza.zzjx()) {
                    zza(new zzd("android.intent.action.VIEW", parse.toString(), (String) null, (String) null, (String) null, (String) null, (String) null));
                } else {
                    this.zzder.zzbo(str);
                }
            } else {
                String valueOf3 = String.valueOf(str);
                zzaxy.zzfe(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
            }
        } else {
            zzh(parse);
        }
        return true;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzd(str, Collections.emptyMap());
    }

    /* access modifiers changed from: protected */
    public final WebResourceResponse zzd(String str, Map<String, String> map) {
        zzsv zza;
        try {
            String zzc = zzawq.zzc(str, this.zzelw.getContext(), this.zzdsu);
            if (!zzc.equals(str)) {
                return zze(zzc, map);
            }
            zzta zzbw = zzta.zzbw(str);
            if (zzbw != null && (zza = zzp.zzkv().zza(zzbw)) != null && zza.zzmu()) {
                return new WebResourceResponse("", "", zza.zzmv());
            }
            if (!zzbax.isEnabled() || !zzacj.zzdad.get().booleanValue()) {
                return null;
            }
            return zze(str, map);
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

    private final WebResourceResponse zze(String str, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        int i = 0;
        while (true) {
            i++;
            if (i <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry next : map.entrySet()) {
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
            zzbbi.zzedy.execute(new zzbfs(this));
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

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public final void zzh(Uri uri) {
        String path = uri.getPath();
        List list = this.zzely.get(path);
        if (list != null) {
            if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcus)).booleanValue()) {
                zzp.zzkp();
                zza(zzayh.zzj(uri), (List<zzahf<? super zzbfq>>) list, path);
                return;
            }
            zzdvl.zza(zzp.zzkp().zzi(uri), new zzbfw(this, list, path), zzbbi.zzedz);
            return;
        }
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("No GMSG handler found for GMSG: ");
        sb.append(valueOf);
        zzaxy.zzei(sb.toString());
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcwx)).booleanValue() && zzp.zzkt().zzwd() != null) {
            zzbbi.zzedu.execute(new zzbfv(path));
        }
    }

    /* access modifiers changed from: private */
    public final void zza(Map<String, String> map, List<zzahf<? super zzbfq>> list, String str) {
        if (zzaxy.isLoggable(2)) {
            String valueOf = String.valueOf(str);
            zzaxy.zzei(valueOf.length() != 0 ? "Received GMSG: ".concat(valueOf) : new String("Received GMSG: "));
            for (String next : map.keySet()) {
                String str2 = map.get(next);
                StringBuilder sb = new StringBuilder(String.valueOf(next).length() + 4 + String.valueOf(str2).length());
                sb.append("  ");
                sb.append(next);
                sb.append(": ");
                sb.append(str2);
                zzaxy.zzei(sb.toString());
            }
        }
        for (zzahf<? super zzbfq> zza : list) {
            zza.zza(this.zzelw, map);
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

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzelw.zzb(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }
}
