package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class zzayv extends zzays {
    public final boolean zza(Activity activity, Configuration configuration) {
        int i;
        if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzctg)).booleanValue()) {
            return false;
        }
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcti)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        zzwe.zzpq();
        int zzc = zzbat.zzc(activity, configuration.screenHeightDp);
        int zzc2 = zzbat.zzc(activity, configuration.screenWidthDp);
        zzp.zzkp();
        DisplayMetrics zza = zzayh.zza((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i2 = zza.heightPixels;
        int i3 = zza.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = activity.getResources().getDimensionPixelSize(identifier);
        } else {
            i = 0;
        }
        int round = ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d)) * ((Integer) zzwe.zzpu().zzd(zzaat.zzctf)).intValue();
        if (!(zze(i2, zzc + i, round) && zze(i3, zzc2, round))) {
            return true;
        }
        return false;
    }

    private static boolean zze(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }
}
