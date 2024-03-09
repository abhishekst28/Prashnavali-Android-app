package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdbd implements zzden<zzdba> {
    private final zzdvw zzgay;
    private final Context zzvr;

    public zzdbd(zzdvw zzdvw, Context context) {
        this.zzgay = zzdvw;
        this.zzvr = context;
    }

    public final zzdvt<zzdba> zzaqs() {
        return this.zzgay.zze(new zzdbc(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdba zzaqx() throws Exception {
        double d;
        Intent registerReceiver = this.zzvr.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            d = ((double) registerReceiver.getIntExtra("level", -1)) / ((double) registerReceiver.getIntExtra("scale", -1));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
        } else {
            d = -1.0d;
        }
        return new zzdba(d, z);
    }
}
