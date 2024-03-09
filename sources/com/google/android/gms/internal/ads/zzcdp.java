package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcdp extends zzadz implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzcep {
    public static final String[] zzfyv = {NativeAppInstallAd.ASSET_MEDIA_VIDEO, NativeContentAd.ASSET_MEDIA_VIDEO, UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO};
    private FrameLayout zzbns;
    private zzadr zzcki;
    private Map<String, WeakReference<View>> zzdpj = new HashMap();
    private final int zzedr;
    private boolean zzeoa = false;
    private final String zzfyu;
    private FrameLayout zzfyw;
    private zzdvw zzfyx;
    private View zzfyy;
    private zzcco zzfyz;
    private zzqq zzfza;
    private IObjectWrapper zzfzb = null;
    private boolean zzfzc;

    public zzcdp(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        String str;
        this.zzfyw = frameLayout;
        this.zzbns = frameLayout2;
        this.zzedr = i;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE;
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = NativeAppInstallAd.ASSET_ATTRIBUTION_ICON_IMAGE;
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.zzfyu = str;
        zzp.zzlm();
        zzbby.zza((View) frameLayout, (ViewTreeObserver.OnGlobalLayoutListener) this);
        zzp.zzlm();
        zzbby.zza((View) frameLayout, (ViewTreeObserver.OnScrollChangedListener) this);
        this.zzfyx = zzbbi.zzedy;
        this.zzfza = new zzqq(this.zzfyw.getContext(), this.zzfyw);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    public final synchronized void zzb(String str, IObjectWrapper iObjectWrapper) {
        zza(str, (View) ObjectWrapper.unwrap(iObjectWrapper), true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0040, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zza(java.lang.String r2, android.view.View r3, boolean r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r4 = r1.zzeoa     // Catch:{ all -> 0x0041 }
            if (r4 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            if (r3 != 0) goto L_0x0010
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r1.zzdpj     // Catch:{ all -> 0x0041 }
            r3.remove(r2)     // Catch:{ all -> 0x0041 }
            monitor-exit(r1)
            return
        L_0x0010:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r1.zzdpj     // Catch:{ all -> 0x0041 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0041 }
            r0.<init>(r3)     // Catch:{ all -> 0x0041 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0041 }
            java.lang.String r4 = "1098"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0041 }
            if (r4 != 0) goto L_0x003f
            java.lang.String r4 = "3011"
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x002b
            goto L_0x003f
        L_0x002b:
            int r2 = r1.zzedr     // Catch:{ all -> 0x0041 }
            boolean r2 = com.google.android.gms.internal.ads.zzbah.zzdi(r2)     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0036
            r3.setOnTouchListener(r1)     // Catch:{ all -> 0x0041 }
        L_0x0036:
            r2 = 1
            r3.setClickable(r2)     // Catch:{ all -> 0x0041 }
            r3.setOnClickListener(r1)     // Catch:{ all -> 0x0041 }
            monitor-exit(r1)
            return
        L_0x003f:
            monitor-exit(r1)
            return
        L_0x0041:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdp.zza(java.lang.String, android.view.View, boolean):void");
    }

    public final synchronized IObjectWrapper zzcs(String str) {
        return ObjectWrapper.wrap(zzgf(str));
    }

    public final synchronized View zzgf(String str) {
        if (this.zzeoa) {
            return null;
        }
        WeakReference weakReference = this.zzdpj.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zza(com.google.android.gms.dynamic.IObjectWrapper r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzeoa     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)     // Catch:{ all -> 0x0048 }
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.zzcco     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x0016
            java.lang.String r2 = "Not an instance of native engine. This is most likely a transient error"
            com.google.android.gms.internal.ads.zzaxy.zzfe(r2)     // Catch:{ all -> 0x0048 }
            monitor-exit(r1)
            return
        L_0x0016:
            com.google.android.gms.internal.ads.zzcco r0 = r1.zzfyz     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.zzcco r0 = r1.zzfyz     // Catch:{ all -> 0x0048 }
            r0.zzb(r1)     // Catch:{ all -> 0x0048 }
        L_0x001f:
            r1.zzamn()     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzcco r2 = (com.google.android.gms.internal.ads.zzcco) r2     // Catch:{ all -> 0x0048 }
            r1.zzfyz = r2     // Catch:{ all -> 0x0048 }
            r2.zza((com.google.android.gms.internal.ads.zzcep) r1)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzcco r2 = r1.zzfyz     // Catch:{ all -> 0x0048 }
            android.widget.FrameLayout r0 = r1.zzfyw     // Catch:{ all -> 0x0048 }
            r2.zzaa(r0)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzcco r2 = r1.zzfyz     // Catch:{ all -> 0x0048 }
            android.widget.FrameLayout r0 = r1.zzbns     // Catch:{ all -> 0x0048 }
            r2.zzab(r0)     // Catch:{ all -> 0x0048 }
            boolean r2 = r1.zzfzc     // Catch:{ all -> 0x0048 }
            if (r2 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.zzcco r2 = r1.zzfyz     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzccu r2 = r2.zzalk()     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzadr r0 = r1.zzcki     // Catch:{ all -> 0x0048 }
            r2.zza(r0)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r1)
            return
        L_0x0048:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdp.zza(com.google.android.gms.dynamic.IObjectWrapper):void");
    }

    private final synchronized void zzamn() {
        this.zzfyx.execute(new zzcds(this));
    }

    public final synchronized void destroy() {
        if (!this.zzeoa) {
            if (this.zzfyz != null) {
                this.zzfyz.zzb(this);
                this.zzfyz = null;
            }
            this.zzdpj.clear();
            this.zzfyw.removeAllViews();
            this.zzbns.removeAllViews();
            this.zzdpj = null;
            this.zzfyw = null;
            this.zzbns = null;
            this.zzfyy = null;
            this.zzfza = null;
            this.zzeoa = true;
        }
    }

    public final synchronized void zzc(IObjectWrapper iObjectWrapper, int i) {
    }

    public final synchronized void onClick(View view) {
        if (this.zzfyz != null) {
            this.zzfyz.cancelUnconfirmedClick();
            this.zzfyz.zza(view, this.zzfyw, zzamo(), zzamp(), false);
        }
    }

    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.zzfyz != null) {
            this.zzfyz.zza(view, motionEvent, this.zzfyw);
        }
        return false;
    }

    public final synchronized void onGlobalLayout() {
        if (this.zzfyz != null) {
            this.zzfyz.zzb(this.zzfyw, zzamo(), zzamp(), zzcco.zzz(this.zzfyw));
        }
    }

    public final synchronized void onScrollChanged() {
        if (this.zzfyz != null) {
            this.zzfyz.zzb(this.zzfyw, zzamo(), zzamp(), zzcco.zzz(this.zzfyw));
        }
    }

    public final synchronized Map<String, WeakReference<View>> zzamo() {
        return this.zzdpj;
    }

    public final synchronized Map<String, WeakReference<View>> zzamp() {
        return this.zzdpj;
    }

    public final synchronized Map<String, WeakReference<View>> zzamq() {
        return null;
    }

    public final synchronized String zzamr() {
        return this.zzfyu;
    }

    public final FrameLayout zzams() {
        return this.zzbns;
    }

    public final zzqq zzamt() {
        return this.zzfza;
    }

    public final synchronized void zze(IObjectWrapper iObjectWrapper) {
        this.zzfyz.setClickConfirmingView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final synchronized void zzg(IObjectWrapper iObjectWrapper) {
        if (!this.zzeoa) {
            this.zzfzb = iObjectWrapper;
        }
    }

    public final IObjectWrapper zzamu() {
        return this.zzfzb;
    }

    public final void zzf(IObjectWrapper iObjectWrapper) {
        onTouch(this.zzfyw, (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zza(com.google.android.gms.internal.ads.zzadr r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzeoa     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            r0 = 1
            r1.zzfzc = r0     // Catch:{ all -> 0x001b }
            r1.zzcki = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.ads.zzcco r0 = r1.zzfyz     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x0019
            com.google.android.gms.internal.ads.zzcco r0 = r1.zzfyz     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.ads.zzccu r0 = r0.zzalk()     // Catch:{ all -> 0x001b }
            r0.zza(r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdp.zza(com.google.android.gms.internal.ads.zzadr):void");
    }

    public final /* synthetic */ View zzahq() {
        return this.zzfyw;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzamv() {
        if (this.zzfyy == null) {
            View view = new View(this.zzfyw.getContext());
            this.zzfyy = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.zzfyw != this.zzfyy.getParent()) {
            this.zzfyw.addView(this.zzfyy);
        }
    }
}
