package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcgo extends zzaiw implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzadf {
    private boolean zzeoa = false;
    private zzyg zzfxs;
    private View zzfxx;
    private zzcco zzfyz;
    private boolean zzgce = false;

    public zzcgo(zzcco zzcco, zzccv zzccv) {
        this.zzfxx = zzccv.zzalr();
        this.zzfxs = zzccv.getVideoController();
        this.zzfyz = zzcco;
        if (zzccv.zzals() != null) {
            zzccv.zzals().zza((zzadf) this);
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzaiy zzaiy) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzeoa) {
            zzaxy.zzfc("Instream ad can not be shown after destroy().");
            zza(zzaiy, 2);
        } else if (this.zzfxx == null || this.zzfxs == null) {
            String valueOf = String.valueOf(this.zzfxx == null ? "can not get video view." : "can not get video controller.");
            zzaxy.zzfc(valueOf.length() != 0 ? "Instream internal error: ".concat(valueOf) : new String("Instream internal error: "));
            zza(zzaiy, 0);
        } else if (this.zzgce) {
            zzaxy.zzfc("Instream ad should not be used again.");
            zza(zzaiy, 1);
        } else {
            this.zzgce = true;
            zzanc();
            ((ViewGroup) ObjectWrapper.unwrap(iObjectWrapper)).addView(this.zzfxx, new ViewGroup.LayoutParams(-1, -1));
            zzp.zzlm();
            zzbby.zza(this.zzfxx, (ViewTreeObserver.OnGlobalLayoutListener) this);
            zzp.zzlm();
            zzbby.zza(this.zzfxx, (ViewTreeObserver.OnScrollChangedListener) this);
            zzand();
            try {
                zzaiy.zzsy();
            } catch (RemoteException e) {
                zzaxy.zze("#007 Could not call remote method.", e);
            }
        }
    }

    public final void zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zza(iObjectWrapper, (zzaiy) new zzcgq(this));
    }

    public final zzyg getVideoController() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (!this.zzeoa) {
            return this.zzfxs;
        }
        zzaxy.zzfc("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    public final zzadr zzss() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzeoa) {
            zzaxy.zzfc("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzcco zzcco = this.zzfyz;
        if (zzcco == null || zzcco.zzalk() == null) {
            return null;
        }
        return this.zzfyz.zzalk().zzss();
    }

    public final void destroy() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzanc();
        zzcco zzcco = this.zzfyz;
        if (zzcco != null) {
            zzcco.destroy();
        }
        this.zzfyz = null;
        this.zzfxx = null;
        this.zzfxs = null;
        this.zzeoa = true;
    }

    private final void zzanc() {
        View view = this.zzfxx;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.zzfxx);
            }
        }
    }

    public final void onGlobalLayout() {
        zzand();
    }

    public final void onScrollChanged() {
        zzand();
    }

    public final void zzsc() {
        zzayh.zzeaj.post(new zzcgn(this));
    }

    private final void zzand() {
        View view;
        zzcco zzcco = this.zzfyz;
        if (zzcco != null && (view = this.zzfxx) != null) {
            zzcco.zzb(view, Collections.emptyMap(), Collections.emptyMap(), zzcco.zzz(this.zzfxx));
        }
    }

    private static void zza(zzaiy zzaiy, int i) {
        try {
            zzaiy.zzdc(i);
        } catch (RemoteException e) {
            zzaxy.zze("#007 Could not call remote method.", e);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzane() {
        try {
            destroy();
        } catch (RemoteException e) {
            zzaxy.zze("#007 Could not call remote method.", e);
        }
    }
}
