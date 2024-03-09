package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
final /* synthetic */ class zzceo implements ViewTreeObserver.OnScrollChangedListener {
    private final String zzdin;
    private final View zzgaj;
    private final zzbfq zzgak;
    private final WindowManager.LayoutParams zzgal;
    private final int zzgam;
    private final WindowManager zzgan;

    zzceo(View view, zzbfq zzbfq, String str, WindowManager.LayoutParams layoutParams, int i, WindowManager windowManager) {
        this.zzgaj = view;
        this.zzgak = zzbfq;
        this.zzdin = str;
        this.zzgal = layoutParams;
        this.zzgam = i;
        this.zzgan = windowManager;
    }

    public final void onScrollChanged() {
        View view = this.zzgaj;
        zzbfq zzbfq = this.zzgak;
        String str = this.zzdin;
        WindowManager.LayoutParams layoutParams = this.zzgal;
        int i = this.zzgam;
        WindowManager windowManager = this.zzgan;
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect) && zzbfq.getView().getWindowToken() != null) {
            if ("1".equals(str) || "2".equals(str)) {
                layoutParams.y = rect.bottom - i;
            } else {
                layoutParams.y = rect.top - i;
            }
            windowManager.updateViewLayout(zzbfq.getView(), layoutParams);
        }
    }
}
