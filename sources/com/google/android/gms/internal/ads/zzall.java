package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzall {
    private final Object zzdho = new Object();
    private final Object zzdhp = new Object();
    private zzalu zzdhq;
    private zzalu zzdhr;

    public final zzalu zza(Context context, zzbbg zzbbg) {
        zzalu zzalu;
        synchronized (this.zzdhp) {
            if (this.zzdhr == null) {
                this.zzdhr = new zzalu(zzl(context), zzbbg, zzacw.zzdbs.get());
            }
            zzalu = this.zzdhr;
        }
        return zzalu;
    }

    public final zzalu zzb(Context context, zzbbg zzbbg) {
        zzalu zzalu;
        synchronized (this.zzdho) {
            if (this.zzdhq == null) {
                this.zzdhq = new zzalu(zzl(context), zzbbg, (String) zzwe.zzpu().zzd(zzaat.zzcli));
            }
            zzalu = this.zzdhq;
        }
        return zzalu;
    }

    private static Context zzl(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}
