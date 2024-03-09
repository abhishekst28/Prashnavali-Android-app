package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzfi implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private static final Handler zzaah = new Handler(Looper.getMainLooper());
    private final Context zzaai;
    private final PowerManager zzaaj;
    private final KeyguardManager zzaak;
    private BroadcastReceiver zzaal;
    private WeakReference<ViewTreeObserver> zzaam;
    private WeakReference<View> zzaan;
    private zzej zzaao;
    private byte zzaap = -1;
    private int zzaaq = -1;
    private long zzaar = -3;
    private Application zzyh;
    private final zzev zzyt;

    public zzfi(Context context, zzev zzev) {
        Context applicationContext = context.getApplicationContext();
        this.zzaai = applicationContext;
        this.zzyt = zzev;
        this.zzaaj = (PowerManager) applicationContext.getSystemService("power");
        this.zzaak = (KeyguardManager) this.zzaai.getSystemService("keyguard");
        Context context2 = this.zzaai;
        if (context2 instanceof Application) {
            this.zzyh = (Application) context2;
            this.zzaao = new zzej((Application) this.zzaai, this);
        }
        zze((View) null);
    }

    /* access modifiers changed from: package-private */
    public final void zze(View view) {
        View currentView = getCurrentView();
        if (currentView != null) {
            currentView.removeOnAttachStateChangeListener(this);
            zzg(currentView);
        }
        this.zzaan = new WeakReference<>(view);
        if (view != null) {
            if ((view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true) {
                zzf(view);
            }
            view.addOnAttachStateChangeListener(this);
            this.zzaar = -2;
            return;
        }
        this.zzaar = -3;
    }

    private final View getCurrentView() {
        WeakReference<View> weakReference = this.zzaan;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    private final void zzct() {
        zzaah.post(new zzfh(this));
    }

    public final void onViewAttachedToWindow(View view) {
        this.zzaaq = -1;
        zzf(view);
        zzcv();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.zzaaq = -1;
        zzcv();
        zzct();
        zzg(view);
    }

    private final void zza(Activity activity, int i) {
        Window window;
        if (this.zzaan != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View currentView = getCurrentView();
            if (currentView != null && peekDecorView != null && currentView.getRootView() == peekDecorView.getRootView()) {
                this.zzaaq = i;
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(activity, 0);
        zzcv();
    }

    public final void onActivityStarted(Activity activity) {
        zza(activity, 0);
        zzcv();
    }

    public final void onActivityResumed(Activity activity) {
        zza(activity, 0);
        zzcv();
        zzct();
    }

    public final void onActivityPaused(Activity activity) {
        zza(activity, 4);
        zzcv();
    }

    public final void onActivityStopped(Activity activity) {
        zzcv();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzcv();
    }

    public final void onActivityDestroyed(Activity activity) {
        zzcv();
    }

    public final void onGlobalLayout() {
        zzcv();
    }

    public final void onScrollChanged() {
        zzcv();
    }

    public final long zzcu() {
        if (this.zzaar <= -2 && getCurrentView() == null) {
            this.zzaar = -3;
        }
        return this.zzaar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0068, code lost:
        if (r7 == false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzcv() {
        /*
            r9 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r9.zzaan
            if (r0 != 0) goto L_0x0006
            return
        L_0x0006:
            android.view.View r0 = r9.getCurrentView()
            r1 = -1
            r2 = -3
            if (r0 != 0) goto L_0x0014
            r9.zzaar = r2
            r9.zzaap = r1
            return
        L_0x0014:
            int r4 = r0.getVisibility()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x001e
            r4 = 1
            goto L_0x001f
        L_0x001e:
            r4 = 0
        L_0x001f:
            boolean r7 = r0.isShown()
            if (r7 != 0) goto L_0x0028
            r4 = r4 | 2
            byte r4 = (byte) r4
        L_0x0028:
            android.os.PowerManager r7 = r9.zzaaj
            if (r7 == 0) goto L_0x0035
            boolean r7 = r7.isScreenOn()
            if (r7 != 0) goto L_0x0035
            r4 = r4 | 4
            byte r4 = (byte) r4
        L_0x0035:
            com.google.android.gms.internal.ads.zzev r7 = r9.zzyt
            boolean r7 = r7.zzcb()
            if (r7 != 0) goto L_0x006d
            android.app.KeyguardManager r7 = r9.zzaak
            if (r7 == 0) goto L_0x006b
            boolean r7 = r7.inKeyguardRestrictedInputMode()
            if (r7 == 0) goto L_0x006b
            android.app.Activity r7 = com.google.android.gms.internal.ads.zzfg.zzd(r0)
            if (r7 == 0) goto L_0x0067
            android.view.Window r7 = r7.getWindow()
            if (r7 != 0) goto L_0x0057
            r7 = 0
            goto L_0x005b
        L_0x0057:
            android.view.WindowManager$LayoutParams r7 = r7.getAttributes()
        L_0x005b:
            if (r7 == 0) goto L_0x0067
            int r7 = r7.flags
            r8 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 & r8
            if (r7 == 0) goto L_0x0067
            r7 = 1
            goto L_0x0068
        L_0x0067:
            r7 = 0
        L_0x0068:
            if (r7 == 0) goto L_0x006b
            goto L_0x006d
        L_0x006b:
            r5 = 0
            goto L_0x006e
        L_0x006d:
        L_0x006e:
            if (r5 != 0) goto L_0x0073
            r4 = r4 | 8
            byte r4 = (byte) r4
        L_0x0073:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getGlobalVisibleRect(r5)
            if (r5 != 0) goto L_0x0081
            r4 = r4 | 16
            byte r4 = (byte) r4
        L_0x0081:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getLocalVisibleRect(r5)
            if (r5 != 0) goto L_0x008f
            r4 = r4 | 32
            byte r4 = (byte) r4
        L_0x008f:
            int r0 = r0.getWindowVisibility()
            int r5 = r9.zzaaq
            if (r5 == r1) goto L_0x0099
            r0 = r5
            goto L_0x009a
        L_0x0099:
        L_0x009a:
            if (r0 == 0) goto L_0x009f
            r0 = r4 | 64
            byte r4 = (byte) r0
        L_0x009f:
            byte r0 = r9.zzaap
            if (r0 == r4) goto L_0x00b3
            r9.zzaap = r4
            if (r4 != 0) goto L_0x00ad
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto L_0x00b1
        L_0x00ad:
            long r0 = (long) r4
            long r0 = r2 - r0
        L_0x00b1:
            r9.zzaar = r0
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfi.zzcv():void");
    }

    private final void zzf(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zzaam = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.zzaal == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            zzfk zzfk = new zzfk(this);
            this.zzaal = zzfk;
            this.zzaai.registerReceiver(zzfk, intentFilter);
        }
        Application application = this.zzyh;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.zzaao);
            } catch (Exception e) {
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
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
        }
        BroadcastReceiver broadcastReceiver = this.zzaal;
        if (broadcastReceiver != null) {
            try {
                this.zzaai.unregisterReceiver(broadcastReceiver);
            } catch (Exception e3) {
            }
            this.zzaal = null;
        }
        Application application = this.zzyh;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.zzaao);
            } catch (Exception e4) {
            }
        }
    }
}
