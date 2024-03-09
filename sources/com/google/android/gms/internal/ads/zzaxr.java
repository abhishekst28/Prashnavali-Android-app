package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzaxr {
    private final Object lock = new Object();
    private long zzdyu = -1;
    private long zzdyv = -1;
    private int zzdyw = -1;
    int zzdyx = -1;
    private long zzdyy = 0;
    private final String zzdyz;
    private final zzaya zzdza;
    private int zzdzb = 0;
    private int zzdzc = 0;

    public zzaxr(String str, zzaya zzaya) {
        this.zzdyz = str;
        this.zzdza = zzaya;
    }

    public final void zzwa() {
        synchronized (this.lock) {
            this.zzdzb++;
        }
    }

    public final void zzvz() {
        synchronized (this.lock) {
            this.zzdzc++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0077, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.ads.zzvc r11, long r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.lock
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzaya r1 = r10.zzdza     // Catch:{ all -> 0x0078 }
            long r1 = r1.zzxf()     // Catch:{ all -> 0x0078 }
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzp.zzkw()     // Catch:{ all -> 0x0078 }
            long r3 = r3.currentTimeMillis()     // Catch:{ all -> 0x0078 }
            long r5 = r10.zzdyv     // Catch:{ all -> 0x0078 }
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0041
            long r1 = r3 - r1
            com.google.android.gms.internal.ads.zzaai<java.lang.Long> r5 = com.google.android.gms.internal.ads.zzaat.zzcof     // Catch:{ all -> 0x0078 }
            com.google.android.gms.internal.ads.zzaap r6 = com.google.android.gms.internal.ads.zzwe.zzpu()     // Catch:{ all -> 0x0078 }
            java.lang.Object r5 = r6.zzd(r5)     // Catch:{ all -> 0x0078 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x0078 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0078 }
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0034
            r1 = -1
            r10.zzdyx = r1     // Catch:{ all -> 0x0078 }
            goto L_0x003c
        L_0x0034:
            com.google.android.gms.internal.ads.zzaya r1 = r10.zzdza     // Catch:{ all -> 0x0078 }
            int r1 = r1.zzxg()     // Catch:{ all -> 0x0078 }
            r10.zzdyx = r1     // Catch:{ all -> 0x0078 }
        L_0x003c:
            r10.zzdyv = r12     // Catch:{ all -> 0x0078 }
            r10.zzdyu = r12     // Catch:{ all -> 0x0078 }
            goto L_0x0043
        L_0x0041:
            r10.zzdyu = r12     // Catch:{ all -> 0x0078 }
        L_0x0043:
            r12 = 1
            if (r11 == 0) goto L_0x0057
            android.os.Bundle r13 = r11.extras     // Catch:{ all -> 0x0078 }
            if (r13 == 0) goto L_0x0057
            android.os.Bundle r11 = r11.extras     // Catch:{ all -> 0x0078 }
            java.lang.String r13 = "gw"
            r1 = 2
            int r11 = r11.getInt(r13, r1)     // Catch:{ all -> 0x0078 }
            if (r11 != r12) goto L_0x0057
            monitor-exit(r0)     // Catch:{ all -> 0x0078 }
            return
        L_0x0057:
            int r11 = r10.zzdyw     // Catch:{ all -> 0x0078 }
            int r11 = r11 + r12
            r10.zzdyw = r11     // Catch:{ all -> 0x0078 }
            int r11 = r10.zzdyx     // Catch:{ all -> 0x0078 }
            int r11 = r11 + r12
            r10.zzdyx = r11     // Catch:{ all -> 0x0078 }
            if (r11 != 0) goto L_0x006d
            r11 = 0
            r10.zzdyy = r11     // Catch:{ all -> 0x0078 }
            com.google.android.gms.internal.ads.zzaya r11 = r10.zzdza     // Catch:{ all -> 0x0078 }
            r11.zzfa(r3)     // Catch:{ all -> 0x0078 }
            goto L_0x0076
        L_0x006d:
            com.google.android.gms.internal.ads.zzaya r11 = r10.zzdza     // Catch:{ all -> 0x0078 }
            long r11 = r11.zzxh()     // Catch:{ all -> 0x0078 }
            long r3 = r3 - r11
            r10.zzdyy = r3     // Catch:{ all -> 0x0078 }
        L_0x0076:
            monitor-exit(r0)     // Catch:{ all -> 0x0078 }
            return
        L_0x0078:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0078 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaxr.zza(com.google.android.gms.internal.ads.zzvc, long):void");
    }

    public final Bundle zzp(Context context, String str) {
        Bundle bundle;
        synchronized (this.lock) {
            bundle = new Bundle();
            bundle.putString("session_id", this.zzdyz);
            bundle.putLong("basets", this.zzdyv);
            bundle.putLong("currts", this.zzdyu);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.zzdyw);
            bundle.putInt("preqs_in_session", this.zzdyx);
            bundle.putLong("time_in_session", this.zzdyy);
            bundle.putInt("pclick", this.zzdzb);
            bundle.putInt("pimp", this.zzdzc);
            bundle.putBoolean("support_transparent_background", zzan(context));
        }
        return bundle;
    }

    private static boolean zzan(Context context) {
        Context zzab = zzatg.zzab(context);
        int identifier = zzab.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier == 0) {
            zzaxy.zzfd("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == zzab.getPackageManager().getActivityInfo(new ComponentName(zzab.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                return true;
            }
            zzaxy.zzfd("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            zzaxy.zzfe("Fail to fetch AdActivity theme");
            zzaxy.zzfd("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }
}
