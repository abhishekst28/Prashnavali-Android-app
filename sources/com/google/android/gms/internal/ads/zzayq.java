package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.os.StatFs;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public class zzayq extends zzayr {
    public boolean isAttachedToWindow(View view) {
        return super.isAttachedToWindow(view) || view.getWindowId() != null;
    }

    public final int zzxs() {
        return 14;
    }

    public final long zzxw() {
        if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcrg)).booleanValue()) {
            return -1;
        }
        return new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
    }
}
