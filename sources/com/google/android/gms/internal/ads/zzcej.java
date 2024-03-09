package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.WindowManager;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzcej implements zzahf {
    private final zzceh zzgae;
    private final WindowManager zzgaf;
    private final View zzgag;

    zzcej(zzceh zzceh, WindowManager windowManager, View view) {
        this.zzgae = zzceh;
        this.zzgaf = windowManager;
        this.zzgag = view;
    }

    public final void zza(Object obj, Map map) {
        this.zzgae.zza(this.zzgaf, this.zzgag, (zzbfq) obj, map);
    }
}
