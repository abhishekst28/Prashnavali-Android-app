package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zza;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzceh {
    private final zzchc zzfzs;
    private final zzcih zzfzy;
    private ViewTreeObserver.OnScrollChangedListener zzgab = null;

    public zzceh(zzcih zzcih, zzchc zzchc) {
        this.zzfzy = zzcih;
        this.zzfzs = zzchc;
    }

    public final View zza(View view, WindowManager windowManager) throws zzbgc {
        zzbfq zza = this.zzfzy.zza(zzvj.zzpi(), false);
        zza.getView().setVisibility(4);
        zza.getView().setContentDescription("policy_validator");
        zza.zza("/sendMessageToSdk", (zzahf<? super zzbfq>) new zzcek(this));
        zza.zza("/hideValidatorOverlay", (zzahf<? super zzbfq>) new zzcej(this, windowManager, view));
        zza.zza("/open", (zzahf<? super zzbfq>) new zzahj((zza) null, (zzapw) null));
        this.zzfzs.zza(new WeakReference(zza), "/loadNativeAdPolicyViolations", new zzcem(this, view, windowManager));
        this.zzfzs.zza(new WeakReference(zza), "/showValidatorOverlay", zzcel.zzdeq);
        return zza.getView();
    }

    private static int zza(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
        }
        zzwe.zzpq();
        return zzbat.zzc(context, i);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(View view, WindowManager windowManager, zzbfq zzbfq, Map map) {
        int i;
        zzbfq.zzabe().zza((zzbhf) new zzcen(this, map));
        if (map != null) {
            Context context = view.getContext();
            int zza = zza(context, (String) map.get("validator_width"), ((Integer) zzwe.zzpu().zzd(zzaat.zzcxl)).intValue());
            int zza2 = zza(context, (String) map.get("validator_height"), ((Integer) zzwe.zzpu().zzd(zzaat.zzcxm)).intValue());
            int zza3 = zza(context, (String) map.get("validator_x"), 0);
            int zza4 = zza(context, (String) map.get("validator_y"), 0);
            zzbfq.zza(zzbhj.zzq(zza, zza2));
            try {
                zzbfq.getWebView().getSettings().setUseWideViewPort(((Boolean) zzwe.zzpu().zzd(zzaat.zzcxn)).booleanValue());
                zzbfq.getWebView().getSettings().setLoadWithOverviewMode(((Boolean) zzwe.zzpu().zzd(zzaat.zzcxo)).booleanValue());
            } catch (NullPointerException e) {
            }
            WindowManager.LayoutParams zzyg = zzbah.zzyg();
            zzyg.x = zza3;
            zzyg.y = zza4;
            windowManager.updateViewLayout(zzbfq.getView(), zzyg);
            String str = (String) map.get("orientation");
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                if ("1".equals(str) || "2".equals(str)) {
                    i = rect.bottom - zza4;
                } else {
                    i = rect.top - zza4;
                }
                this.zzgab = new zzceo(view, zzbfq, str, zzyg, i, windowManager);
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnScrollChangedListener(this.zzgab);
                }
            }
            String str2 = (String) map.get("overlay_url");
            if (!TextUtils.isEmpty(str2)) {
                zzbfq.loadUrl(str2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzfzs.zza("sendMessageToNativeJs", (Map<String, ?>) hashMap);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(WindowManager windowManager, View view, zzbfq zzbfq, Map map) {
        zzaxy.zzef("Hide native ad policy validator overlay.");
        zzbfq.getView().setVisibility(8);
        if (zzbfq.getView().getWindowToken() != null) {
            windowManager.removeView(zzbfq.getView());
        }
        zzbfq.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzgab != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.zzgab);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzbfq zzbfq, Map map) {
        this.zzfzs.zza("sendMessageToNativeJs", (Map<String, ?>) map);
    }
}
