package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzbao extends BroadcastReceiver {
    private final /* synthetic */ zzbap zzecr;

    zzbao(zzbap zzbap) {
        this.zzecr = zzbap;
    }

    public final void onReceive(Context context, Intent intent) {
        this.zzecr.zzc(context, intent);
    }
}
