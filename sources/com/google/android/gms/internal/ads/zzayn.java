package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final class zzayn extends BroadcastReceiver {
    private final /* synthetic */ zzayh zzean;

    private zzayn(zzayh zzayh) {
        this.zzean = zzayh;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            boolean unused = this.zzean.zzyq = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            boolean unused2 = this.zzean.zzyq = false;
        }
    }

    /* synthetic */ zzayn(zzayh zzayh, zzayj zzayj) {
        this(zzayh);
    }
}
