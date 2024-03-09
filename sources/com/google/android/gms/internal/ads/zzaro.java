package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzaro implements zzars {
    private static final Object lock = new Object();
    private static zzars zzdpm = null;
    private static zzars zzdpn = null;
    private final Context zzcle;
    private final Object zzdpo;
    private final WeakHashMap<Thread, Boolean> zzdpp;
    private final zzbbg zzdpq;
    private final ExecutorService zzyu;

    public static zzars zzt(Context context) {
        synchronized (lock) {
            if (zzdpm == null) {
                if (zzact.zzdbl.get().booleanValue()) {
                    if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcxf)).booleanValue()) {
                        zzdpm = new zzaro(context);
                    }
                }
                zzdpm = new zzarv();
            }
        }
        return zzdpm;
    }

    public static zzars zzc(Context context, zzbbg zzbbg) {
        synchronized (lock) {
            if (zzdpn == null) {
                if (zzact.zzdbl.get().booleanValue()) {
                    if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcxf)).booleanValue()) {
                        zzaro zzaro = new zzaro(context, zzbbg);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (zzaro.zzdpo) {
                                zzaro.zzdpp.put(thread, true);
                            }
                            thread.setUncaughtExceptionHandler(new zzart(zzaro, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new zzarq(zzaro, Thread.getDefaultUncaughtExceptionHandler()));
                        zzdpn = zzaro;
                    }
                }
                zzdpn = new zzarv();
            }
        }
        return zzdpn;
    }

    private zzaro(Context context) {
        this(context, zzbbg.zzyr());
    }

    private zzaro(Context context, zzbbg zzbbg) {
        this.zzdpo = new Object();
        this.zzdpp = new WeakHashMap<>();
        this.zzyu = zzdsb.zzawj().zzej(zzdsg.zzhll);
        this.zzcle = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzdpq = zzbbg;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r3 == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(java.lang.Thread r10, java.lang.Throwable r11) {
        /*
            r9 = this;
            r10 = 1
            r0 = 0
            if (r11 == 0) goto L_0x0040
            r1 = r11
            r2 = 0
            r3 = 0
        L_0x0009:
            if (r1 == 0) goto L_0x003b
            java.lang.StackTraceElement[] r4 = r1.getStackTrace()
            int r5 = r4.length
            r6 = 0
        L_0x0011:
            if (r6 >= r5) goto L_0x0036
            r7 = r4[r6]
            java.lang.String r8 = r7.getClassName()
            boolean r8 = com.google.android.gms.internal.ads.zzbat.zzey(r8)
            if (r8 == 0) goto L_0x0020
            r2 = 1
        L_0x0020:
            java.lang.Class r8 = r9.getClass()
            java.lang.String r8 = r8.getName()
            java.lang.String r7 = r7.getClassName()
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0033
            r3 = 1
        L_0x0033:
            int r6 = r6 + 1
            goto L_0x0011
        L_0x0036:
            java.lang.Throwable r1 = r1.getCause()
            goto L_0x0009
        L_0x003b:
            if (r2 == 0) goto L_0x0040
            if (r3 != 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r10 = 0
        L_0x0041:
            if (r10 == 0) goto L_0x004c
            r10 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r0 = ""
            r9.zza(r11, r0, r10)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaro.zza(java.lang.Thread, java.lang.Throwable):void");
    }

    public final void zza(Throwable th, String str) {
        zza(th, str, 1.0f);
    }

    public final void zza(Throwable th, String str, float f) {
        if (zzbat.zzd(th) != null) {
            String name = th.getClass().getName();
            StringWriter stringWriter = new StringWriter();
            zzeeo.zza(th, new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            int i = 0;
            int i2 = 1;
            boolean z = Math.random() < ((double) f);
            if (f > 0.0f) {
                i2 = (int) (1.0f / f);
            }
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(zza(name, stringWriter2, str, i2).toString());
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    this.zzyu.execute(new zzarr(new zzbbh(), (String) obj));
                }
            }
        }
    }

    private final Uri.Builder zza(String str, String str2, String str3, int i) {
        boolean z;
        String str4;
        try {
            z = Wrappers.packageManager(this.zzcle).isCallerInstantApp();
        } catch (Throwable th) {
            zzbbd.zzc("Error fetching instant app info", th);
            z = false;
        }
        try {
            str4 = this.zzcle.getPackageName();
        } catch (Throwable th2) {
            zzbbd.zzfe("Cannot obtain package name, proceeding.");
            str4 = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
        String str5 = Build.MANUFACTURER;
        String str6 = Build.MODEL;
        if (!str6.startsWith(str5)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 1 + String.valueOf(str6).length());
            sb.append(str5);
            sb.append(" ");
            sb.append(str6);
            str6 = sb.toString();
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("device", str6).appendQueryParameter("js", this.zzdpq.zzbra).appendQueryParameter("appid", str4).appendQueryParameter("exceptiontype", str).appendQueryParameter("stacktrace", str2).appendQueryParameter("eids", TextUtils.join(",", zzaat.zzrd())).appendQueryParameter("exceptionkey", str3).appendQueryParameter("cl", "317778048").appendQueryParameter("rc", "dev").appendQueryParameter("session_id", zzwe.zzpv()).appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(zzact.zzdbj.get()));
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcpp)).booleanValue()) {
            appendQueryParameter2.appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzcle))).appendQueryParameter("lite", this.zzdpq.zzedt ? "1" : "0");
        }
        return appendQueryParameter2;
    }
}
