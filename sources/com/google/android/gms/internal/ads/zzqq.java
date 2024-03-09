package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzqq implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private static final long zzbre = ((Long) zzwe.zzpu().zzd(zzaat.zzcpk)).longValue();
    private final Context zzaai;
    private final PowerManager zzaaj;
    private final KeyguardManager zzaak;
    private WeakReference<ViewTreeObserver> zzaam;
    private int zzaaq = -1;
    private final WindowManager zzbrf;
    private BroadcastReceiver zzbrg;
    private WeakReference<View> zzbrh;
    private zzqt zzbri;
    private zzbaj zzbrj = new zzbaj(zzbre);
    private boolean zzbrk = false;
    private final HashSet<zzqu> zzbrl = new HashSet<>();
    private final Rect zzbrm;
    private final DisplayMetrics zzxd;
    private Application zzyh;

    public zzqq(Context context, View view) {
        this.zzaai = context.getApplicationContext();
        this.zzbrf = (WindowManager) context.getSystemService("window");
        this.zzaaj = (PowerManager) this.zzaai.getSystemService("power");
        this.zzaak = (KeyguardManager) context.getSystemService("keyguard");
        Context context2 = this.zzaai;
        if (context2 instanceof Application) {
            this.zzyh = (Application) context2;
            this.zzbri = new zzqt((Application) this.zzaai, this);
        }
        this.zzxd = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.zzbrm = rect;
        rect.right = this.zzbrf.getDefaultDisplay().getWidth();
        this.zzbrm.bottom = this.zzbrf.getDefaultDisplay().getHeight();
        WeakReference<View> weakReference = this.zzbrh;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            zzg(view2);
        }
        this.zzbrh = new WeakReference<>(view);
        if (view != null) {
            if (zzp.zzkr().isAttachedToWindow(view)) {
                zzf(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    public final void zza(zzqu zzqu) {
        this.zzbrl.add(zzqu);
        zzbu(3);
    }

    public final void zzb(zzqu zzqu) {
        this.zzbrl.remove(zzqu);
    }

    private final void zzct() {
        zzayh.zzeaj.post(new zzqp(this));
    }

    public final void onViewAttachedToWindow(View view) {
        this.zzaaq = -1;
        zzf(view);
        zzbu(3);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.zzaaq = -1;
        zzbu(3);
        zzct();
        zzg(view);
    }

    private final void zza(Activity activity, int i) {
        Window window;
        if (this.zzbrh != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View view = (View) this.zzbrh.get();
            if (view != null && peekDecorView != null && view.getRootView() == peekDecorView.getRootView()) {
                this.zzaaq = i;
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(activity, 0);
        zzbu(3);
        zzct();
    }

    public final void onActivityStarted(Activity activity) {
        zza(activity, 0);
        zzbu(3);
        zzct();
    }

    public final void onActivityResumed(Activity activity) {
        zza(activity, 0);
        zzbu(3);
        zzct();
    }

    public final void onActivityPaused(Activity activity) {
        zza(activity, 4);
        zzbu(3);
        zzct();
    }

    public final void onActivityStopped(Activity activity) {
        zzbu(3);
        zzct();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzbu(3);
        zzct();
    }

    public final void onActivityDestroyed(Activity activity) {
        zzbu(3);
        zzct();
    }

    public final void onGlobalLayout() {
        zzbu(2);
        zzct();
    }

    public final void onScrollChanged() {
        zzbu(1);
    }

    /* access modifiers changed from: private */
    public final void zzbu(int i) {
        WeakReference<View> weakReference;
        boolean z;
        boolean z2;
        List<Rect> list;
        int i2 = i;
        if (this.zzbrl.size() != 0 && (weakReference = this.zzbrh) != null) {
            View view = (View) weakReference.get();
            boolean z3 = i2 == 1;
            boolean z4 = view == null;
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            Rect rect3 = new Rect();
            Rect rect4 = new Rect();
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            if (view != null) {
                boolean globalVisibleRect = view.getGlobalVisibleRect(rect2);
                boolean localVisibleRect = view.getLocalVisibleRect(rect3);
                view.getHitRect(rect4);
                try {
                    view.getLocationOnScreen(iArr);
                    view.getLocationInWindow(iArr2);
                } catch (Exception e) {
                    zzaxy.zzc("Failure getting view location.", e);
                }
                rect.left = iArr[0];
                rect.top = iArr[1];
                rect.right = rect.left + view.getWidth();
                rect.bottom = rect.top + view.getHeight();
                z2 = globalVisibleRect;
                z = localVisibleRect;
            } else {
                z2 = false;
                z = false;
            }
            if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcpn)).booleanValue() || view == null) {
                list = Collections.emptyList();
            } else {
                list = zzi(view);
            }
            int windowVisibility = view != null ? view.getWindowVisibility() : 8;
            int i3 = this.zzaaq;
            if (i3 != -1) {
                windowVisibility = i3;
            }
            boolean z5 = !z4 && zzp.zzkp().zza(view, this.zzaaj, this.zzaak) && z2 && z && windowVisibility == 0;
            if (z3 && !this.zzbrj.tryAcquire() && z5 == this.zzbrk) {
                return;
            }
            if (z5 || this.zzbrk || i2 != 1) {
                zzqr zzqr = new zzqr(zzp.zzkw().elapsedRealtime(), this.zzaaj.isScreenOn(), view != null && zzp.zzkr().isAttachedToWindow(view), view != null ? view.getWindowVisibility() : 8, zza(this.zzbrm), zza(rect), zza(rect2), z2, zza(rect3), z, zza(rect4), this.zzxd.density, z5, list);
                Iterator<zzqu> it = this.zzbrl.iterator();
                while (it.hasNext()) {
                    it.next().zza(zzqr);
                }
                this.zzbrk = z5;
            }
        }
    }

    private final Rect zza(Rect rect) {
        return new Rect(zzbv(rect.left), zzbv(rect.top), zzbv(rect.right), zzbv(rect.bottom));
    }

    private final int zzbv(int i) {
        return (int) (((float) i) / this.zzxd.density);
    }

    private final List<Rect> zzi(View view) {
        try {
            ArrayList arrayList = new ArrayList();
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                View view2 = (View) parent;
                Rect rect = new Rect();
                if (view2.isScrollContainer() && view2.getGlobalVisibleRect(rect)) {
                    arrayList.add(zza(rect));
                }
            }
            return arrayList;
        } catch (Exception e) {
            zzp.zzkt().zza(e, "PositionWatcher.getParentScrollViewRects");
            return Collections.emptyList();
        }
    }

    private final void zzf(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zzaam = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.zzbrg == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.zzbrg = new zzqs(this);
            zzp.zzlk().zza(this.zzaai, this.zzbrg, intentFilter);
        }
        Application application = this.zzyh;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.zzbri);
            } catch (Exception e) {
                zzaxy.zzc("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    private final void zzg(View view) {
        try {
            if (this.zzaam != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.zzaam.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.zzaam = null;
            }
        } catch (Exception e) {
            zzaxy.zzc("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            zzaxy.zzc("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.zzbrg != null) {
            try {
                zzp.zzlk().zza(this.zzaai, this.zzbrg);
            } catch (IllegalStateException e3) {
                zzaxy.zzc("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                zzp.zzkt().zza(e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.zzbrg = null;
        }
        Application application = this.zzyh;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.zzbri);
            } catch (Exception e5) {
                zzaxy.zzc("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    public final void zzen(long j) {
        this.zzbrj.zzfb(j);
    }

    public final void zzlu() {
        this.zzbrj.zzfb(zzbre);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzlv() {
        zzbu(3);
    }
}
