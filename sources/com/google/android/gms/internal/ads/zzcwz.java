package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzcwz extends zzwx {
    private final ViewGroup zzfnx;
    private final zzdln zzfqn;
    private final zzwl zzfvl;
    private final zzbni zzgpm;
    private final Context zzvr;

    public zzcwz(Context context, zzwl zzwl, zzdln zzdln, zzbni zzbni) {
        this.zzvr = context;
        this.zzfvl = zzwl;
        this.zzfqn = zzdln;
        this.zzgpm = zzbni;
        FrameLayout frameLayout = new FrameLayout(this.zzvr);
        frameLayout.removeAllViews();
        frameLayout.addView(this.zzgpm.zzahq(), zzp.zzkr().zzxt());
        frameLayout.setMinimumHeight(zzke().heightPixels);
        frameLayout.setMinimumWidth(zzke().widthPixels);
        this.zzfnx = frameLayout;
    }

    public final IObjectWrapper zzkc() throws RemoteException {
        return ObjectWrapper.wrap(this.zzfnx);
    }

    public final void destroy() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzgpm.destroy();
    }

    public final boolean zza(zzvc zzvc) throws RemoteException {
        zzaxy.zzfd("loadAd is not supported for a Publisher AdView returned from AdLoader.");
        return false;
    }

    public final void pause() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzgpm.zzail().zzbz((Context) null);
    }

    public final void resume() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzgpm.zzail().zzca((Context) null);
    }

    public final void zzkd() throws RemoteException {
        this.zzgpm.zzkd();
    }

    public final zzvj zzke() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        return zzdls.zzb(this.zzvr, Collections.singletonList(this.zzgpm.zzahp()));
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        if (this.zzgpm.zzaim() != null) {
            return this.zzgpm.zzaim().getMediationAdapterClassName();
        }
        return null;
    }

    public final zzyg getVideoController() throws RemoteException {
        return this.zzgpm.getVideoController();
    }

    public final String getAdUnitId() throws RemoteException {
        return this.zzfqn.zzhbv;
    }

    public final zzxc zzkh() throws RemoteException {
        return this.zzfqn.zzhca;
    }

    public final zzwl zzki() throws RemoteException {
        return this.zzfvl;
    }

    public final String zzkf() throws RemoteException {
        if (this.zzgpm.zzaim() != null) {
            return this.zzgpm.zzaim().getMediationAdapterClassName();
        }
        return null;
    }

    public final zzyf zzkg() {
        return this.zzgpm.zzaim();
    }

    public final void setImmersiveMode(boolean z) throws RemoteException {
    }

    public final void zza(zzaac zzaac) throws RemoteException {
        zzaxy.zzfd("setVideoOptions is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void zza(zzym zzym) throws RemoteException {
    }

    public final boolean isLoading() throws RemoteException {
        return false;
    }

    public final void zza(zzatt zzatt) throws RemoteException {
    }

    public final void setUserId(String str) throws RemoteException {
    }

    public final void zzbp(String str) throws RemoteException {
    }

    public final void zza(zzvj zzvj) throws RemoteException {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        zzbni zzbni = this.zzgpm;
        if (zzbni != null) {
            zzbni.zza(this.zzfnx, zzvj);
        }
    }

    public final void zza(zzaqv zzaqv) throws RemoteException {
    }

    public final void zza(zzarb zzarb, String str) throws RemoteException {
    }

    public final boolean isReady() throws RemoteException {
        return false;
    }

    public final void zza(zzabq zzabq) throws RemoteException {
        zzaxy.zzfd("setOnCustomRenderedAdLoadedListener is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void zza(zzwg zzwg) throws RemoteException {
        zzaxy.zzfd("setAdClickListener is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void zza(zzxi zzxi) throws RemoteException {
        zzaxy.zzfd("setCorrelationIdProvider is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void setManualImpressionsEnabled(boolean z) throws RemoteException {
        zzaxy.zzfd("setManualImpressionsEnabled is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void zza(zzwl zzwl) throws RemoteException {
        zzaxy.zzfd("setAdListener is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void zza(zzxc zzxc) throws RemoteException {
        zzaxy.zzfd("setAppEventListener is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void zza(zzxb zzxb) throws RemoteException {
        zzaxy.zzfd("setAdMetadataListener is not supported in Publisher AdView returned by AdLoader.");
    }

    public final Bundle getAdMetadata() throws RemoteException {
        zzaxy.zzfd("getAdMetadata is not supported in Publisher AdView returned by AdLoader.");
        return new Bundle();
    }

    public final void showInterstitial() throws RemoteException {
    }

    public final void zza(zzvm zzvm) throws RemoteException {
    }

    public final void stopLoading() throws RemoteException {
    }

    public final void zza(zzsi zzsi) throws RemoteException {
    }

    public final void zza(zzya zzya) {
        zzaxy.zzfd("setOnPaidEventListener is not supported in Publisher AdView returned by AdLoader.");
    }
}
