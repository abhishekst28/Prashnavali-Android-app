package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzamm {
    private static zzamm zzdio;
    private AtomicBoolean zzdip = new AtomicBoolean(false);

    public static zzamm zztn() {
        if (zzdio == null) {
            zzdio = new zzamm();
        }
        return zzdio;
    }

    zzamm() {
    }

    public final Thread zzd(Context context, String str) {
        if (!this.zzdip.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new zzaml(this, context, str));
        thread.start();
        return thread;
    }

    public final Thread zzm(Context context) {
        if (!this.zzdip.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new zzamo(this, context));
        thread.start();
        return thread;
    }

    private static void zza(Context context, AppMeasurementSdk appMeasurementSdk) {
        try {
            ((zzbid) zzbbc.zza(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", zzamn.zzbxs)).zza(ObjectWrapper.wrap(context), new zzamj(appMeasurementSdk));
        } catch (RemoteException | zzbbe | NullPointerException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    private static boolean zzn(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    static /* synthetic */ void zzo(Context context) {
        zzaat.initialize(context);
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcnn)).booleanValue() && zzn(context)) {
            zza(context, AppMeasurementSdk.getInstance(context));
        }
    }

    static /* synthetic */ void zze(Context context, String str) {
        zzaat.initialize(context);
        Bundle bundle = new Bundle();
        bundle.putBoolean("measurementEnabled", ((Boolean) zzwe.zzpu().zzd(zzaat.zzcni)).booleanValue());
        zza(context, AppMeasurementSdk.getInstance(context, "FA-Ads", "am", str, bundle));
    }
}
