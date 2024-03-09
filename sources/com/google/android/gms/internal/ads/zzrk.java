package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.Iterator;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzrk extends Thread {
    private final Object lock;
    private boolean started;
    private final int zzbsb;
    private final int zzbsd;
    private final boolean zzbse;
    private boolean zzbtb;
    private boolean zzbtc;
    private final zzrd zzbtd;
    private final int zzbte;
    private final int zzbtf;
    private final int zzbtg;
    private final int zzbth;
    private final int zzbti;
    private final int zzbtj;
    private final String zzbtk;
    private final boolean zzbtl;
    private final boolean zzbtm;

    public zzrk() {
        this(new zzrd());
    }

    private zzrk(zzrd zzrd) {
        this.started = false;
        this.zzbtb = false;
        this.zzbtc = false;
        this.zzbtd = zzrd;
        this.lock = new Object();
        this.zzbsb = zzaci.zzczz.get().intValue();
        this.zzbtf = zzaci.zzczw.get().intValue();
        this.zzbsd = zzaci.zzdaa.get().intValue();
        this.zzbtg = zzaci.zzczy.get().intValue();
        this.zzbth = ((Integer) zzwe.zzpu().zzd(zzaat.zzcmt)).intValue();
        this.zzbti = ((Integer) zzwe.zzpu().zzd(zzaat.zzcmu)).intValue();
        this.zzbtj = ((Integer) zzwe.zzpu().zzd(zzaat.zzcmv)).intValue();
        this.zzbte = zzaci.zzdab.get().intValue();
        this.zzbtk = (String) zzwe.zzpu().zzd(zzaat.zzcmx);
        this.zzbtl = ((Boolean) zzwe.zzpu().zzd(zzaat.zzcmy)).booleanValue();
        this.zzbse = ((Boolean) zzwe.zzpu().zzd(zzaat.zzcmz)).booleanValue();
        this.zzbtm = ((Boolean) zzwe.zzpu().zzd(zzaat.zzcna)).booleanValue();
        setName("ContentFetchTask");
    }

    public final void zzmg() {
        synchronized (this.lock) {
            if (this.started) {
                zzaxy.zzef("Content hash thread already started, quiting...");
                return;
            }
            this.started = true;
            start();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        com.google.android.gms.ads.internal.zzp.zzkt().zza(r0, "ContentFetchTask.extractContent");
        com.google.android.gms.internal.ads.zzaxy.zzef("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007f, code lost:
        com.google.android.gms.internal.ads.zzaxy.zzc("Error in ContentFetchTask", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007e A[ExcHandler: InterruptedException (r0v1 'e' java.lang.InterruptedException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
        L_0x0000:
            boolean r0 = zzmh()     // Catch:{ InterruptedException -> 0x007e, Exception -> 0x006e }
            if (r0 == 0) goto L_0x005d
            com.google.android.gms.internal.ads.zzrg r0 = com.google.android.gms.ads.internal.zzp.zzks()     // Catch:{ InterruptedException -> 0x007e, Exception -> 0x006e }
            android.app.Activity r0 = r0.getActivity()     // Catch:{ InterruptedException -> 0x007e, Exception -> 0x006e }
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "ContentFetchThread: no activity. Sleeping."
            com.google.android.gms.internal.ads.zzaxy.zzef(r0)     // Catch:{ InterruptedException -> 0x007e, Exception -> 0x006e }
            r4.zzmj()     // Catch:{ InterruptedException -> 0x007e, Exception -> 0x006e }
            goto L_0x0065
        L_0x0019:
            if (r0 == 0) goto L_0x005c
            r1 = 0
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x003e, InterruptedException -> 0x007e }
            if (r2 == 0) goto L_0x003d
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x003e, InterruptedException -> 0x007e }
            android.view.View r2 = r2.getDecorView()     // Catch:{ Exception -> 0x003e, InterruptedException -> 0x007e }
            if (r2 == 0) goto L_0x003d
            android.view.Window r0 = r0.getWindow()     // Catch:{ Exception -> 0x003e, InterruptedException -> 0x007e }
            android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x003e, InterruptedException -> 0x007e }
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r2)     // Catch:{ Exception -> 0x003e, InterruptedException -> 0x007e }
            r1 = r0
        L_0x003d:
            goto L_0x004d
        L_0x003e:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzaxk r2 = com.google.android.gms.ads.internal.zzp.zzkt()     // Catch:{ InterruptedException -> 0x007e, Exception -> 0x006e }
            java.lang.String r3 = "ContentFetchTask.extractContent"
            r2.zza(r0, r3)     // Catch:{ InterruptedException -> 0x007e, Exception -> 0x006e }
            java.lang.String r0 = "Failed getting root view of activity. Content not extracted."
            com.google.android.gms.internal.ads.zzaxy.zzef(r0)     // Catch:{ InterruptedException -> 0x007e, Exception -> 0x006e }
        L_0x004d:
            if (r1 == 0) goto L_0x005c
            if (r1 != 0) goto L_0x0053
            goto L_0x005c
        L_0x0053:
            com.google.android.gms.internal.ads.zzrj r0 = new com.google.android.gms.internal.ads.zzrj     // Catch:{ InterruptedException -> 0x007e, Exception -> 0x006e }
            r0.<init>(r4, r1)     // Catch:{ InterruptedException -> 0x007e, Exception -> 0x006e }
            r1.post(r0)     // Catch:{ InterruptedException -> 0x007e, Exception -> 0x006e }
        L_0x005c:
            goto L_0x0065
        L_0x005d:
            java.lang.String r0 = "ContentFetchTask: sleeping"
            com.google.android.gms.internal.ads.zzaxy.zzef(r0)     // Catch:{ InterruptedException -> 0x007e, Exception -> 0x006e }
            r4.zzmj()     // Catch:{ InterruptedException -> 0x007e, Exception -> 0x006e }
        L_0x0065:
            int r0 = r4.zzbte     // Catch:{ InterruptedException -> 0x007e, Exception -> 0x006e }
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x007e, Exception -> 0x006e }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x007e, Exception -> 0x006e }
            goto L_0x0085
        L_0x006e:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.zzaxy.zzc(r1, r0)
            com.google.android.gms.internal.ads.zzaxk r1 = com.google.android.gms.ads.internal.zzp.zzkt()
            java.lang.String r2 = "ContentFetchTask.run"
            r1.zza(r0, r2)
            goto L_0x0085
        L_0x007e:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.zzaxy.zzc(r1, r0)
        L_0x0085:
            java.lang.Object r0 = r4.lock
            monitor-enter(r0)
        L_0x0088:
            boolean r1 = r4.zzbtb     // Catch:{ all -> 0x009c }
            if (r1 == 0) goto L_0x0099
            java.lang.String r1 = "ContentFetchTask: waiting"
            com.google.android.gms.internal.ads.zzaxy.zzef(r1)     // Catch:{ InterruptedException -> 0x0097 }
            java.lang.Object r1 = r4.lock     // Catch:{ InterruptedException -> 0x0097 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0097 }
            goto L_0x0088
        L_0x0097:
            r1 = move-exception
            goto L_0x0088
        L_0x0099:
            monitor-exit(r0)     // Catch:{ all -> 0x009c }
            goto L_0x0000
        L_0x009c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrk.run():void");
    }

    /* access modifiers changed from: package-private */
    public final void zzj(View view) {
        try {
            zzre zzre = new zzre(this.zzbsb, this.zzbtf, this.zzbsd, this.zzbtg, this.zzbth, this.zzbti, this.zzbtj, this.zzbse);
            Context context = zzp.zzks().getContext();
            if (context != null && !TextUtils.isEmpty(this.zzbtk)) {
                String str = (String) view.getTag(context.getResources().getIdentifier((String) zzwe.zzpu().zzd(zzaat.zzcmw), "id", context.getPackageName()));
                if (str != null && str.equals(this.zzbtk)) {
                    return;
                }
            }
            zzro zza = zza(view, zzre);
            zzre.zzme();
            if (zza.zzbtt != 0 || zza.zzbtu != 0) {
                if (zza.zzbtu != 0 || zzre.zzmf() != 0) {
                    if (zza.zzbtu != 0 || !this.zzbtd.zza(zzre)) {
                        this.zzbtd.zzc(zzre);
                    }
                }
            }
        } catch (Exception e) {
            zzaxy.zzc("Exception in fetchContentOnUIThread", e);
            zzp.zzkt().zza(e, "ContentFetchTask.fetchContent");
        }
    }

    private static boolean zzmh() {
        boolean z;
        try {
            Context context = zzp.zzks().getContext();
            if (context == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses == null) {
                        return false;
                    }
                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ActivityManager.RunningAppProcessInfo next = it.next();
                        if (Process.myPid() == next.pid) {
                            if (next.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode()) {
                                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                                if (powerManager == null) {
                                    z = false;
                                } else {
                                    z = powerManager.isScreenOn();
                                }
                                if (z) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable th) {
            zzp.zzkt().zza(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    private final zzro zza(View view, zzre zzre) {
        boolean z;
        if (view == null) {
            return new zzro(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new zzro(this, 0, 0);
            }
            zzre.zzb(text.toString(), globalVisibleRect, view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
            return new zzro(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof zzbfq)) {
            WebView webView = (WebView) view;
            if (!PlatformVersion.isAtLeastKitKat()) {
                z = false;
            } else {
                zzre.zzmc();
                webView.post(new zzrm(this, zzre, webView, globalVisibleRect));
                z = true;
            }
            if (z) {
                return new zzro(this, 0, 1);
            }
            return new zzro(this, 0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new zzro(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                zzro zza = zza(viewGroup.getChildAt(i3), zzre);
                i += zza.zzbtt;
                i2 += zza.zzbtu;
            }
            return new zzro(this, i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzre zzre, WebView webView, String str, boolean z) {
        zzre.zzmb();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.zzbtl || TextUtils.isEmpty(webView.getTitle())) {
                    zzre.zza(optString, z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    zzre.zza(sb.toString(), z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                }
            }
            if (zzre.zzlw()) {
                this.zzbtd.zzb(zzre);
            }
        } catch (JSONException e) {
            zzaxy.zzef("Json string may be malformed.");
        } catch (Throwable th) {
            zzaxy.zzb("Failed to get webview content.", th);
            zzp.zzkt().zza(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final zzre zzmi() {
        return this.zzbtd.zzo(this.zzbtm);
    }

    public final void wakeup() {
        synchronized (this.lock) {
            this.zzbtb = false;
            this.lock.notifyAll();
            zzaxy.zzef("ContentFetchThread: wakeup");
        }
    }

    private final void zzmj() {
        synchronized (this.lock) {
            this.zzbtb = true;
            StringBuilder sb = new StringBuilder(42);
            sb.append("ContentFetchThread: paused, mPause = ");
            sb.append(true);
            zzaxy.zzef(sb.toString());
        }
    }

    public final boolean zzmk() {
        return this.zzbtb;
    }
}
