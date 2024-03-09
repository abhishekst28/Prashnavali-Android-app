package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzawb {
    private final AtomicReference<ThreadPoolExecutor> zzdwt = new AtomicReference<>((Object) null);
    private final Object zzdwu = new Object();
    private String zzdwv = null;
    private String zzdww = null;
    private final AtomicBoolean zzdwx = new AtomicBoolean(false);
    private final AtomicInteger zzdwy = new AtomicInteger(-1);
    private final AtomicReference<Object> zzdwz = new AtomicReference<>((Object) null);
    private final AtomicReference<Object> zzdxa = new AtomicReference<>((Object) null);
    private final ConcurrentMap<String, Method> zzdxb = new ConcurrentHashMap(9);
    private final AtomicReference<zzbib> zzdxc = new AtomicReference<>((Object) null);
    private final BlockingQueue<FutureTask<?>> zzdxd = new ArrayBlockingQueue(20);
    private final Object zzdxe = new Object();

    public final boolean zzac(Context context) {
        if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcnb)).booleanValue() || this.zzdwx.get()) {
            return false;
        }
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcnl)).booleanValue()) {
            return true;
        }
        if (this.zzdwy.get() == -1) {
            zzwe.zzpq();
            if (!zzbat.zzd(context, 12451000)) {
                zzwe.zzpq();
                if (zzbat.zzbo(context)) {
                    zzaxy.zzfe("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                    this.zzdwy.set(0);
                }
            }
            this.zzdwy.set(1);
        }
        if (this.zzdwy.get() == 1) {
            return true;
        }
        return false;
    }

    private static boolean zzad(Context context) {
        if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcni)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) < ((Integer) zzwe.zzpu().zzd(zzaat.zzcnj)).intValue()) {
            return false;
        }
        if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcnk)).booleanValue()) {
            return true;
        }
        try {
            context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            return false;
        } catch (ClassNotFoundException e) {
            return true;
        }
    }

    public final void zza(Context context, zzzw zzzw) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcno)).booleanValue() && zzac(context) && zzad(context)) {
            synchronized (this.zzdxe) {
            }
        }
    }

    public final void zza(Context context, zzvc zzvc) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcno)).booleanValue() && zzac(context) && zzad(context)) {
            synchronized (this.zzdxe) {
            }
        }
    }

    public final void zzf(Context context, String str) {
        if (zzac(context)) {
            if (zzad(context)) {
                zza("beginAdUnitExposure", (zzawr) new zzawa(str));
            } else {
                zza(context, str, "beginAdUnitExposure");
            }
        }
    }

    public final void zzg(Context context, String str) {
        if (zzac(context)) {
            if (zzad(context)) {
                zza("endAdUnitExposure", (zzawr) new zzawh(str));
            } else {
                zza(context, str, "endAdUnitExposure");
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzae(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "getCurrentScreenName"
            boolean r1 = r6.zzac(r7)
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x000b
            return r2
        L_0x000b:
            boolean r1 = zzad(r7)
            if (r1 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.zzawo r7 = com.google.android.gms.internal.ads.zzawg.zzdxg
            java.lang.String r0 = "getCurrentScreenNameOrScreenClass"
            java.lang.Object r7 = r6.zza((java.lang.String) r0, r2, r7)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L_0x001c:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r6.zzdwz
            r3 = 1
            java.lang.String r4 = "com.google.android.gms.measurement.AppMeasurement"
            boolean r1 = r6.zza((android.content.Context) r7, (java.lang.String) r4, (java.util.concurrent.atomic.AtomicReference<java.lang.Object>) r1, (boolean) r3)
            if (r1 != 0) goto L_0x0028
            return r2
        L_0x0028:
            r1 = 0
            java.lang.reflect.Method r3 = r6.zzn(r7, r0)     // Catch:{ Exception -> 0x0056 }
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r4 = r6.zzdwz     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r4 = r4.get()     // Catch:{ Exception -> 0x0056 }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r3 = r3.invoke(r4, r5)     // Catch:{ Exception -> 0x0056 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0056 }
            if (r3 != 0) goto L_0x0052
            java.lang.String r3 = "getCurrentScreenClass"
            java.lang.reflect.Method r7 = r6.zzn(r7, r3)     // Catch:{ Exception -> 0x0056 }
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r3 = r6.zzdwz     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x0056 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r7 = r7.invoke(r3, r4)     // Catch:{ Exception -> 0x0056 }
            r3 = r7
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0056 }
        L_0x0052:
            if (r3 == 0) goto L_0x0055
            return r3
        L_0x0055:
            return r2
        L_0x0056:
            r7 = move-exception
            r6.zza((java.lang.Exception) r7, (java.lang.String) r0, (boolean) r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawb.zzae(android.content.Context):java.lang.String");
    }

    public final void zzh(Context context, String str) {
        if (!zzac(context) || !(context instanceof Activity)) {
            return;
        }
        if (zzad(context)) {
            zza("setScreenName", (zzawr) new zzawj(context, str));
        } else if (zza(context, "com.google.firebase.analytics.FirebaseAnalytics", this.zzdxa, false)) {
            Method zzo = zzo(context, "setCurrentScreen");
            try {
                zzo.invoke(this.zzdxa.get(), new Object[]{(Activity) context, str, context.getPackageName()});
            } catch (Exception e) {
                zza(e, "setCurrentScreen", false);
            }
        }
    }

    public final String zzaf(Context context) {
        if (!zzac(context)) {
            return null;
        }
        synchronized (this.zzdwu) {
            if (this.zzdwv != null) {
                String str = this.zzdwv;
                return str;
            }
            if (zzad(context)) {
                this.zzdwv = (String) zza("getGmpAppId", this.zzdwv, zzawi.zzdxg);
            } else {
                this.zzdwv = (String) zza("getGmpAppId", context);
            }
            String str2 = this.zzdwv;
            return str2;
        }
    }

    public final String zzag(Context context) {
        if (!zzac(context)) {
            return null;
        }
        long longValue = ((Long) zzwe.zzpu().zzd(zzaat.zzcng)).longValue();
        if (zzad(context)) {
            if (longValue >= 0) {
                return (String) zzvu().submit(new zzawk(this)).get(longValue, TimeUnit.MILLISECONDS);
            }
            try {
                return (String) zza("getAppInstanceId", (Object) null, zzawl.zzdxg);
            } catch (TimeoutException e) {
                return "TIME_OUT";
            } catch (Exception e2) {
                return null;
            }
        } else if (longValue < 0) {
            return (String) zza("getAppInstanceId", context);
        } else {
            try {
                return (String) zzvu().submit(new zzawn(this, context)).get(longValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException e3) {
                return "TIME_OUT";
            } catch (Exception e4) {
                return null;
            }
        }
    }

    public final String zzah(Context context) {
        if (!zzac(context)) {
            return null;
        }
        if (zzad(context)) {
            Long l = (Long) zza("getAdEventId", (Object) null, zzawm.zzdxg);
            if (l != null) {
                return Long.toString(l.longValue());
            }
            return null;
        }
        Object zza = zza("generateEventId", context);
        if (zza != null) {
            return zza.toString();
        }
        return null;
    }

    public final String zzai(Context context) {
        if (!zzac(context)) {
            return null;
        }
        synchronized (this.zzdwu) {
            if (this.zzdww != null) {
                String str = this.zzdww;
                return str;
            }
            if (zzad(context)) {
                this.zzdww = (String) zza("getAppIdOrigin", this.zzdww, zzawd.zzdxg);
            } else {
                this.zzdww = "fa";
            }
            String str2 = this.zzdww;
            return str2;
        }
    }

    public final void zzi(Context context, String str) {
        zza(context, "_ac", str, (Bundle) null);
    }

    public final void zzj(Context context, String str) {
        zza(context, "_ai", str, (Bundle) null);
    }

    public final void zzk(Context context, String str) {
        zza(context, "_aq", str, (Bundle) null);
    }

    public final void zzl(Context context, String str) {
        zza(context, "_aa", str, (Bundle) null);
    }

    public final void zza(Context context, String str, String str2, String str3, int i) {
        if (zzac(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            zza(context, "_ar", str, bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 75);
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i);
            zzaxy.zzei(sb.toString());
        }
    }

    private final void zza(Context context, String str, String str2, Bundle bundle) {
        if (zzac(context)) {
            Bundle zzl = zzl(str2, str);
            if (bundle != null) {
                zzl.putAll(bundle);
            }
            if (zzad(context)) {
                zza("logEventInternal", (zzawr) new zzawc(str, zzl));
            } else if (zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzdwz, true)) {
                Method zzaj = zzaj(context);
                try {
                    zzaj.invoke(this.zzdwz.get(), new Object[]{"am", str, zzl});
                } catch (Exception e) {
                    zza(e, "logEventInternal", true);
                }
            }
        }
    }

    private static Bundle zzl(String str, String str2) {
        Bundle bundle = new Bundle();
        try {
            bundle.putLong("_aeid", Long.parseLong(str));
        } catch (NullPointerException | NumberFormatException e) {
            String valueOf = String.valueOf(str);
            zzaxy.zzc(valueOf.length() != 0 ? "Invalid event ID: ".concat(valueOf) : new String("Invalid event ID: "), e);
        }
        if ("_ac".equals(str2)) {
            bundle.putInt("_r", 1);
        }
        return bundle;
    }

    private final Method zzaj(Context context) {
        Method method = (Method) this.zzdxb.get("logEventInternal");
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", new Class[]{String.class, String.class, Bundle.class});
            this.zzdxb.put("logEventInternal", declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, "logEventInternal", true);
            return null;
        }
    }

    private final Method zzm(Context context, String str) {
        Method method = (Method) this.zzdxb.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[]{String.class});
            this.zzdxb.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, str, false);
            return null;
        }
    }

    private final Method zzn(Context context, String str) {
        Method method = (Method) this.zzdxb.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.zzdxb.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, str, false);
            return null;
        }
    }

    private final Method zzo(Context context, String str) {
        Method method = (Method) this.zzdxb.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(str, new Class[]{Activity.class, String.class, String.class});
            this.zzdxb.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, str, false);
            return null;
        }
    }

    private final void zza(Context context, String str, String str2) {
        if (zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzdwz, true)) {
            Method zzm = zzm(context, str2);
            try {
                zzm.invoke(this.zzdwz.get(), new Object[]{str});
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                zzaxy.zzei(sb.toString());
            } catch (Exception e) {
                zza(e, str2, false);
            }
        }
    }

    private final Object zza(String str, Context context) {
        if (!zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzdwz, true)) {
            return null;
        }
        try {
            return zzn(context, str).invoke(this.zzdwz.get(), new Object[0]);
        } catch (Exception e) {
            zza(e, str, true);
            return null;
        }
    }

    private final void zza(Exception exc, String str, boolean z) {
        if (!this.zzdwx.get()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
            sb.append("Invoke Firebase method ");
            sb.append(str);
            sb.append(" error.");
            zzaxy.zzfe(sb.toString());
            if (z) {
                zzaxy.zzfe("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.zzdwx.set(true);
            }
        }
    }

    private final ThreadPoolExecutor zzvu() {
        if (this.zzdwt.get() == null) {
            this.zzdwt.compareAndSet((Object) null, new ThreadPoolExecutor(((Integer) zzwe.zzpu().zzd(zzaat.zzcnh)).intValue(), ((Integer) zzwe.zzpu().zzd(zzaat.zzcnh)).intValue(), 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), new zzawp(this)));
        }
        return this.zzdwt.get();
    }

    private final boolean zza(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet((Object) null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context}));
            } catch (Exception e) {
                zza(e, "getInstance", z);
                return false;
            }
        }
        return true;
    }

    private final void zza(String str, zzawr zzawr) {
        synchronized (this.zzdxc) {
            FutureTask futureTask = new FutureTask(new zzawf(this, zzawr, str), (Object) null);
            if (this.zzdxc.get() != null) {
                futureTask.run();
            } else {
                this.zzdxd.offer(futureTask);
            }
        }
    }

    private final <T> T zza(String str, T t, zzawo<T> zzawo) {
        synchronized (this.zzdxc) {
            if (this.zzdxc.get() != null) {
                try {
                    T zzb = zzawo.zzb(this.zzdxc.get());
                    return zzb;
                } catch (Exception e) {
                    zza(e, str, false);
                    return t;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzawr zzawr, String str) {
        if (this.zzdxc.get() != null) {
            try {
                zzawr.zza(this.zzdxc.get());
            } catch (Exception e) {
                zza(e, str, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String zzak(Context context) throws Exception {
        return (String) zza("getAppInstanceId", context);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String zzvv() throws Exception {
        return (String) zza("getAppInstanceId", (Object) null, zzawe.zzdxg);
    }
}
