package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.WindowManager;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcem implements zzahf {
    private final zzceh zzgae;
    private final View zzgah;
    private final WindowManager zzgai;

    zzcem(zzceh zzceh, View view, WindowManager windowManager) {
        this.zzgae = zzceh;
        this.zzgah = view;
        this.zzgai = windowManager;
    }

    public final void zza(Object obj, Map map) {
        this.zzgae.zza(this.zzgah, this.zzgai, (zzbfq) obj, map);
    }
}
