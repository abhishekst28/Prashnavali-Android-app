package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.zzp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzrf implements Application.ActivityLifecycleCallbacks {
    /* access modifiers changed from: private */
    public boolean foreground = true;
    /* access modifiers changed from: private */
    public final Object lock = new Object();
    private Activity zzaas;
    /* access modifiers changed from: private */
    public boolean zzbsq = false;
    /* access modifiers changed from: private */
    public final List<zzrh> zzbsr = new ArrayList();
    private final List<zzrw> zzbss = new ArrayList();
    private Runnable zzbst;
    private long zzbsu;
    private Context zzvr;
    private boolean zzzh = false;

    zzrf() {
    }

    public final void zza(Application application, Context context) {
        if (!this.zzzh) {
            application.registerActivityLifecycleCallbacks(this);
            if (context instanceof Activity) {
                setActivity((Activity) context);
            }
            this.zzvr = application;
            this.zzbsu = ((Long) zzwe.zzpu().zzd(zzaat.zzcoe)).longValue();
            this.zzzh = true;
        }
    }

    public final void zza(zzrh zzrh) {
        synchronized (this.lock) {
            this.zzbsr.add(zzrh);
        }
    }

    public final void zzb(zzrh zzrh) {
        synchronized (this.lock) {
            this.zzbsr.remove(zzrh);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final Activity getActivity() {
        return this.zzaas;
    }

    public final Context getContext() {
        return this.zzvr;
    }

    public final void onActivityStarted(Activity activity) {
        setActivity(activity);
    }

    public final void onActivityResumed(Activity activity) {
        setActivity(activity);
        this.zzbsq = false;
        boolean z = !this.foreground;
        this.foreground = true;
        if (this.zzbst != null) {
            zzayh.zzeaj.removeCallbacks(this.zzbst);
        }
        synchronized (this.lock) {
            for (zzrw onActivityResumed : this.zzbss) {
                try {
                    onActivityResumed.onActivityResumed(activity);
                } catch (Exception e) {
                    zzp.zzkt().zza(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    zzbbd.zzc("", e);
                }
            }
            if (z) {
                for (zzrh zzp : this.zzbsr) {
                    try {
                        zzp.zzp(true);
                    } catch (Exception e2) {
                        zzbbd.zzc("", e2);
                    }
                }
            } else {
                zzaxy.zzef("App is still foreground.");
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        setActivity(activity);
        synchronized (this.lock) {
            for (zzrw onActivityPaused : this.zzbss) {
                try {
                    onActivityPaused.onActivityPaused(activity);
                } catch (Exception e) {
                    zzp.zzkt().zza(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    zzbbd.zzc("", e);
                }
            }
        }
        this.zzbsq = true;
        if (this.zzbst != null) {
            zzayh.zzeaj.removeCallbacks(this.zzbst);
        }
        zzdsf zzdsf = zzayh.zzeaj;
        zzri zzri = new zzri(this);
        this.zzbst = zzri;
        zzdsf.postDelayed(zzri, this.zzbsu);
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.lock) {
            if (this.zzaas != null) {
                if (this.zzaas.equals(activity)) {
                    this.zzaas = null;
                }
                Iterator<zzrw> it = this.zzbss.iterator();
                while (it.hasNext()) {
                    try {
                        if (it.next().zza(activity)) {
                            it.remove();
                        }
                    } catch (Exception e) {
                        zzp.zzkt().zza(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        zzbbd.zzc("", e);
                    }
                }
            }
        }
    }

    private final void setActivity(Activity activity) {
        synchronized (this.lock) {
            if (!activity.getClass().getName().startsWith(MobileAds.ERROR_DOMAIN)) {
                this.zzaas = activity;
            }
        }
    }
}
