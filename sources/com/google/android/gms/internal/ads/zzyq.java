package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzyq {
    private final zzvh zzacs;
    private VideoOptions zzbnn;
    private boolean zzbnu;
    private AppEventListener zzbnw;
    private zzwu zzbun;
    private String zzbuo;
    private final zzamr zzbuq;
    private zzut zzcgq;
    private AdListener zzcgu;
    private AdSize[] zzchv;
    private final AtomicBoolean zzcji;
    /* access modifiers changed from: private */
    public final VideoController zzcjj;
    private final zzwh zzcjk;
    private OnCustomRenderedAdLoadedListener zzcjl;
    private ViewGroup zzcjm;
    private int zzcjn;
    private OnPaidEventListener zzcjo;

    public zzyq(ViewGroup viewGroup) {
        this(viewGroup, (AttributeSet) null, false, zzvh.zzchm, 0);
    }

    public zzyq(ViewGroup viewGroup, int i) {
        this(viewGroup, (AttributeSet) null, false, zzvh.zzchm, i);
    }

    public zzyq(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, zzvh.zzchm, 0);
    }

    public zzyq(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, false, zzvh.zzchm, i);
    }

    private zzyq(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzvh zzvh, zzwu zzwu, int i) {
        zzvj zzvj;
        this.zzbuq = new zzamr();
        this.zzcjj = new VideoController();
        this.zzcjk = new zzyt(this);
        this.zzcjm = viewGroup;
        this.zzacs = zzvh;
        this.zzbun = null;
        this.zzcji = new AtomicBoolean(false);
        this.zzcjn = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzvo zzvo = new zzvo(context, attributeSet);
                this.zzchv = zzvo.zzy(z);
                this.zzbuo = zzvo.getAdUnitId();
                if (viewGroup.isInEditMode()) {
                    zzbat zzpq = zzwe.zzpq();
                    AdSize adSize = this.zzchv[0];
                    int i2 = this.zzcjn;
                    if (adSize.equals(AdSize.INVALID)) {
                        zzvj = zzvj.zzpl();
                    } else {
                        zzvj zzvj2 = new zzvj(context, adSize);
                        zzvj2.zzchq = zzcz(i2);
                        zzvj = zzvj2;
                    }
                    zzpq.zza(viewGroup, zzvj, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                zzwe.zzpq().zza(viewGroup, new zzvj(context, AdSize.BANNER), e.getMessage(), e.getMessage());
            }
        }
    }

    private zzyq(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzvh zzvh, int i) {
        this(viewGroup, attributeSet, z, zzvh, (zzwu) null, i);
    }

    public final void destroy() {
        try {
            if (this.zzbun != null) {
                this.zzbun.destroy();
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    public final AdListener getAdListener() {
        return this.zzcgu;
    }

    public final AdSize getAdSize() {
        zzvj zzke;
        try {
            if (!(this.zzbun == null || (zzke = this.zzbun.zzke()) == null)) {
                return zzke.zzpm();
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
        AdSize[] adSizeArr = this.zzchv;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public final AdSize[] getAdSizes() {
        return this.zzchv;
    }

    public final String getAdUnitId() {
        zzwu zzwu;
        if (this.zzbuo == null && (zzwu = this.zzbun) != null) {
            try {
                this.zzbuo = zzwu.getAdUnitId();
            } catch (RemoteException e) {
                zzbbd.zze("#007 Could not call remote method.", e);
            }
        }
        return this.zzbuo;
    }

    public final AppEventListener getAppEventListener() {
        return this.zzbnw;
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzcjl;
    }

    public final void zza(zzyo zzyo) {
        zzwu zzwu;
        try {
            if (this.zzbun == null) {
                if ((this.zzchv == null || this.zzbuo == null) && this.zzbun == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.zzcjm.getContext();
                zzvj zza = zza(context, this.zzchv, this.zzcjn);
                if ("search_v2".equals(zza.zzacx)) {
                    zzwu = (zzwu) new zzvw(zzwe.zzpr(), context, zza, this.zzbuo).zzd(context, false);
                } else {
                    zzwu = (zzwu) new zzvq(zzwe.zzpr(), context, zza, this.zzbuo, this.zzbuq).zzd(context, false);
                }
                this.zzbun = zzwu;
                zzwu.zza((zzwl) new zzuy(this.zzcjk));
                if (this.zzcgq != null) {
                    this.zzbun.zza((zzwg) new zzuv(this.zzcgq));
                }
                if (this.zzbnw != null) {
                    this.zzbun.zza((zzxc) new zzvn(this.zzbnw));
                }
                if (this.zzcjl != null) {
                    this.zzbun.zza((zzabq) new zzabr(this.zzcjl));
                }
                if (this.zzbnn != null) {
                    this.zzbun.zza(new zzaac(this.zzbnn));
                }
                this.zzbun.zza((zzya) new zzzt(this.zzcjo));
                this.zzbun.setManualImpressionsEnabled(this.zzbnu);
                try {
                    IObjectWrapper zzkc = this.zzbun.zzkc();
                    if (zzkc != null) {
                        this.zzcjm.addView((View) ObjectWrapper.unwrap(zzkc));
                    }
                } catch (RemoteException e) {
                    zzbbd.zze("#007 Could not call remote method.", e);
                }
            }
            if (this.zzbun.zza(zzvh.zza(this.zzcjm.getContext(), zzyo))) {
                this.zzbuq.zzf(zzyo.zzqn());
            }
        } catch (RemoteException e2) {
            zzbbd.zze("#007 Could not call remote method.", e2);
        }
    }

    public final void pause() {
        try {
            if (this.zzbun != null) {
                this.zzbun.pause();
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    public final void recordManualImpression() {
        if (!this.zzcji.getAndSet(true)) {
            try {
                if (this.zzbun != null) {
                    this.zzbun.zzkd();
                }
            } catch (RemoteException e) {
                zzbbd.zze("#007 Could not call remote method.", e);
            }
        }
    }

    public final void resume() {
        try {
            if (this.zzbun != null) {
                this.zzbun.resume();
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setAdListener(AdListener adListener) {
        this.zzcgu = adListener;
        this.zzcjk.zza(adListener);
    }

    public final void zza(zzut zzut) {
        try {
            this.zzcgq = zzut;
            if (this.zzbun != null) {
                this.zzbun.zza((zzwg) zzut != null ? new zzuv(zzut) : null);
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setAdSizes(AdSize... adSizeArr) {
        if (this.zzchv == null) {
            zza(adSizeArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    public final void zza(AdSize... adSizeArr) {
        this.zzchv = adSizeArr;
        try {
            if (this.zzbun != null) {
                this.zzbun.zza(zza(this.zzcjm.getContext(), this.zzchv, this.zzcjn));
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
        this.zzcjm.requestLayout();
    }

    public final void setAdUnitId(String str) {
        if (this.zzbuo == null) {
            this.zzbuo = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.zzbnw = appEventListener;
            if (this.zzbun != null) {
                this.zzbun.zza((zzxc) appEventListener != null ? new zzvn(appEventListener) : null);
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        zzabr zzabr;
        this.zzcjl = onCustomRenderedAdLoadedListener;
        try {
            if (this.zzbun != null) {
                zzwu zzwu = this.zzbun;
                if (onCustomRenderedAdLoadedListener != null) {
                    zzabr = new zzabr(onCustomRenderedAdLoadedListener);
                } else {
                    zzabr = null;
                }
                zzwu.zza((zzabq) zzabr);
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setManualImpressionsEnabled(boolean z) {
        this.zzbnu = z;
        try {
            if (this.zzbun != null) {
                this.zzbun.setManualImpressionsEnabled(z);
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    public final String getMediationAdapterClassName() {
        try {
            if (this.zzbun != null) {
                return this.zzbun.zzkf();
            }
            return null;
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final boolean isLoading() {
        try {
            if (this.zzbun != null) {
                return this.zzbun.isLoading();
            }
            return false;
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final ResponseInfo getResponseInfo() {
        zzyf zzyf = null;
        try {
            if (this.zzbun != null) {
                zzyf = this.zzbun.zzkg();
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zza(zzyf);
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzcjo = onPaidEventListener;
            if (this.zzbun != null) {
                this.zzbun.zza((zzya) new zzzt(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzbbd.zze("#008 Must be called on the main UI thread.", e);
        }
    }

    public final VideoController getVideoController() {
        return this.zzcjj;
    }

    public final zzyg zzdt() {
        zzwu zzwu = this.zzbun;
        if (zzwu == null) {
            return null;
        }
        try {
            return zzwu.getVideoController();
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final void setVideoOptions(VideoOptions videoOptions) {
        this.zzbnn = videoOptions;
        try {
            if (this.zzbun != null) {
                this.zzbun.zza(videoOptions == null ? null : new zzaac(videoOptions));
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    public final VideoOptions getVideoOptions() {
        return this.zzbnn;
    }

    public final boolean zza(zzwu zzwu) {
        if (zzwu == null) {
            return false;
        }
        try {
            IObjectWrapper zzkc = zzwu.zzkc();
            if (zzkc == null || ((View) ObjectWrapper.unwrap(zzkc)).getParent() != null) {
                return false;
            }
            this.zzcjm.addView((View) ObjectWrapper.unwrap(zzkc));
            this.zzbun = zzwu;
            return true;
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            return false;
        }
    }

    private static zzvj zza(Context context, AdSize[] adSizeArr, int i) {
        for (AdSize equals : adSizeArr) {
            if (equals.equals(AdSize.INVALID)) {
                return zzvj.zzpl();
            }
        }
        zzvj zzvj = new zzvj(context, adSizeArr);
        zzvj.zzchq = zzcz(i);
        return zzvj;
    }

    private static boolean zzcz(int i) {
        return i == 1;
    }
}
