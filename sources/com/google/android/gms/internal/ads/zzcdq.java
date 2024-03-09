package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcdq extends zzaeg implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzcep {
    private zzcco zzfyz;
    private zzqq zzfza;
    private final WeakReference<View> zzfzd;
    private final Map<String, WeakReference<View>> zzfze = new HashMap();
    private final Map<String, WeakReference<View>> zzfzf = new HashMap();
    private final Map<String, WeakReference<View>> zzfzg = new HashMap();

    public zzcdq(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        zzp.zzlm();
        zzbby.zza(view, (ViewTreeObserver.OnGlobalLayoutListener) this);
        zzp.zzlm();
        zzbby.zza(view, (ViewTreeObserver.OnScrollChangedListener) this);
        this.zzfzd = new WeakReference<>(view);
        for (Map.Entry next : hashMap.entrySet()) {
            String str = (String) next.getKey();
            View view2 = (View) next.getValue();
            if (view2 != null) {
                this.zzfze.put(str, new WeakReference(view2));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.zzfzg.putAll(this.zzfze);
        for (Map.Entry next2 : hashMap2.entrySet()) {
            View view3 = (View) next2.getValue();
            if (view3 != null) {
                this.zzfzf.put((String) next2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.zzfzg.putAll(this.zzfzf);
        this.zzfza = new zzqq(view.getContext(), view);
    }

    public final synchronized void unregisterNativeAd() {
        if (this.zzfyz != null) {
            this.zzfyz.zzb(this);
            this.zzfyz = null;
        }
    }

    public final synchronized void zza(IObjectWrapper iObjectWrapper) {
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof zzcco)) {
            zzaxy.zzfe("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        if (this.zzfyz != null) {
            this.zzfyz.zzb(this);
        }
        if (((zzcco) unwrap).zzali()) {
            zzcco zzcco = (zzcco) unwrap;
            this.zzfyz = zzcco;
            zzcco.zza((zzcep) this);
            this.zzfyz.zzaa(zzahq());
            return;
        }
        zzaxy.zzfc("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
    }

    public final FrameLayout zzams() {
        return null;
    }

    public final View zzahq() {
        return (View) this.zzfzd.get();
    }

    public final zzqq zzamt() {
        return this.zzfza;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zza(java.lang.String r2, android.view.View r3, boolean r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r3 != 0) goto L_0x0014
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r1.zzfzg     // Catch:{ all -> 0x0048 }
            r3.remove(r2)     // Catch:{ all -> 0x0048 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r1.zzfze     // Catch:{ all -> 0x0048 }
            r3.remove(r2)     // Catch:{ all -> 0x0048 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r1.zzfzf     // Catch:{ all -> 0x0048 }
            r3.remove(r2)     // Catch:{ all -> 0x0048 }
            monitor-exit(r1)
            return
        L_0x0014:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r1.zzfzg     // Catch:{ all -> 0x0048 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0048 }
            r0.<init>(r3)     // Catch:{ all -> 0x0048 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0048 }
            java.lang.String r4 = "1098"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0048 }
            if (r4 != 0) goto L_0x0046
            java.lang.String r4 = "3011"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0048 }
            if (r4 == 0) goto L_0x002f
            goto L_0x0046
        L_0x002f:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r1.zzfze     // Catch:{ all -> 0x0048 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0048 }
            r0.<init>(r3)     // Catch:{ all -> 0x0048 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0048 }
            r2 = 1
            r3.setClickable(r2)     // Catch:{ all -> 0x0048 }
            r3.setOnClickListener(r1)     // Catch:{ all -> 0x0048 }
            r3.setOnTouchListener(r1)     // Catch:{ all -> 0x0048 }
            monitor-exit(r1)
            return
        L_0x0046:
            monitor-exit(r1)
            return
        L_0x0048:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdq.zza(java.lang.String, android.view.View, boolean):void");
    }

    public final synchronized Map<String, WeakReference<View>> zzamo() {
        return this.zzfzg;
    }

    public final synchronized Map<String, WeakReference<View>> zzamp() {
        return this.zzfze;
    }

    public final synchronized Map<String, WeakReference<View>> zzamq() {
        return this.zzfzf;
    }

    public final synchronized View zzgf(String str) {
        WeakReference weakReference;
        weakReference = this.zzfzg.get(str);
        return weakReference == null ? null : (View) weakReference.get();
    }

    public final synchronized String zzamr() {
        return NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE;
    }

    public final synchronized IObjectWrapper zzamu() {
        return null;
    }

    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.zzfyz != null) {
            this.zzfyz.zza(view, motionEvent, zzahq());
        }
        return false;
    }

    public final synchronized void onClick(View view) {
        if (this.zzfyz != null) {
            this.zzfyz.zza(view, zzahq(), zzamo(), zzamp(), true);
        }
    }

    public final synchronized void onGlobalLayout() {
        if (this.zzfyz != null) {
            this.zzfyz.zzb(zzahq(), zzamo(), zzamp(), zzcco.zzz(zzahq()));
        }
    }

    public final synchronized void onScrollChanged() {
        if (this.zzfyz != null) {
            this.zzfyz.zzb(zzahq(), zzamo(), zzamp(), zzcco.zzz(zzahq()));
        }
    }

    public final synchronized void zze(IObjectWrapper iObjectWrapper) {
        if (this.zzfyz != null) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (!(unwrap instanceof View)) {
                zzaxy.zzfe("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.zzfyz.setClickConfirmingView((View) unwrap);
        }
    }
}
