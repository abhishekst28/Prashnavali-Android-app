package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.overlay.zzq;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdhl extends zzwx implements zzy, zzbuo, zzsc {
    /* access modifiers changed from: private */
    public final zzbbg zzbop;
    private final String zzbuo;
    /* access modifiers changed from: private */
    public final ViewGroup zzfnx;
    private final zzbii zzgmy;
    private final Context zzgpr;
    private AtomicBoolean zzgxh = new AtomicBoolean();
    private final zzdhc zzgxi;
    /* access modifiers changed from: private */
    public final zzdht zzgxj;
    private long zzgxk;
    private zzbmn zzgxl;
    protected zzbnc zzgxm;

    public zzdhl(zzbii zzbii, Context context, String str, zzdhc zzdhc, zzdht zzdht, zzbbg zzbbg) {
        this.zzfnx = new FrameLayout(context);
        this.zzgmy = zzbii;
        this.zzgpr = context;
        this.zzbuo = str;
        this.zzgxi = zzdhc;
        this.zzgxj = zzdht;
        zzdht.zza(this);
        this.zzbop = zzbbg;
    }

    public final IObjectWrapper zzkc() {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzfnx);
    }

    public final void zza(zzvm zzvm) {
        this.zzgxi.zza(zzvm);
    }

    public final synchronized boolean zza(zzvc zzvc) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        zzp.zzkp();
        if (zzayh.zzbe(this.zzgpr) && zzvc.zzchi == null) {
            zzaxy.zzfc("Failed to load the ad because app ID is missing.");
            this.zzgxj.zzg(zzdmb.zza(zzdmd.zzhcr, (String) null, (zzuw) null));
            return false;
        } else if (isLoading()) {
            return false;
        } else {
            this.zzgxh = new AtomicBoolean();
            return this.zzgxi.zza(zzvc, this.zzbuo, new zzdhm(this), new zzdhp(this));
        }
    }

    /* access modifiers changed from: private */
    public final zzq zza(zzbnc zzbnc) {
        boolean zzabx = zzbnc.zzabx();
        int intValue = ((Integer) zzwe.zzpu().zzd(zzaat.zzctj)).intValue();
        com.google.android.gms.ads.internal.overlay.zzp zzp = new com.google.android.gms.ads.internal.overlay.zzp();
        zzp.size = 50;
        zzp.paddingLeft = zzabx ? intValue : 0;
        zzp.paddingRight = zzabx ? 0 : intValue;
        zzp.paddingTop = 0;
        zzp.paddingBottom = intValue;
        return new zzq(this.zzgpr, zzp, this);
    }

    /* access modifiers changed from: private */
    public static RelativeLayout.LayoutParams zzb(zzbnc zzbnc) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(zzbnc.zzabx() ? 11 : 9);
        return layoutParams;
    }

    /* access modifiers changed from: private */
    public final void zzc(zzbnc zzbnc) {
        zzbnc.zza((zzsc) this);
    }

    public final void zzup() {
        zzasa();
    }

    public final void zzmr() {
        zzasa();
    }

    public final void zzajl() {
        if (this.zzgxm != null) {
            this.zzgxk = zzp.zzkw().elapsedRealtime();
            int zzahh = this.zzgxm.zzahh();
            if (zzahh > 0) {
                zzbmn zzbmn = new zzbmn(this.zzgmy.zzadk(), zzp.zzkw());
                this.zzgxl = zzbmn;
                zzbmn.zza(zzahh, new zzdhn(this));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zzarx */
    public final void zzasa() {
        if (this.zzgxh.compareAndSet(false, true)) {
            zzbnc zzbnc = this.zzgxm;
            if (!(zzbnc == null || zzbnc.zzahs() == null)) {
                this.zzgxj.zzb(this.zzgxm.zzahs());
            }
            this.zzgxj.onAdClosed();
            this.zzfnx.removeAllViews();
            zzbmn zzbmn = this.zzgxl;
            if (zzbmn != null) {
                zzp.zzks().zzb(zzbmn);
            }
            zzbnc zzbnc2 = this.zzgxm;
            if (zzbnc2 != null) {
                zzbnc2.zzfd(zzp.zzkw().elapsedRealtime() - this.zzgxk);
            }
            destroy();
        }
    }

    /* access modifiers changed from: private */
    public final zzvj zzary() {
        return zzdls.zzb(this.zzgpr, Collections.singletonList(this.zzgxm.zzahp()));
    }

    public final synchronized void destroy() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        if (this.zzgxm != null) {
            this.zzgxm.destroy();
        }
    }

    public final synchronized void pause() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    public final synchronized void resume() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    public final void zza(zzsi zzsi) {
        this.zzgxj.zzb(zzsi);
    }

    public final synchronized zzvj zzke() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        if (this.zzgxm == null) {
            return null;
        }
        return zzdls.zzb(this.zzgpr, Collections.singletonList(this.zzgxm.zzahp()));
    }

    public final synchronized void zza(zzvj zzvj) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
    }

    public final synchronized String getMediationAdapterClassName() {
        return null;
    }

    public final synchronized String zzkf() {
        return null;
    }

    public final synchronized zzyf zzkg() {
        return null;
    }

    public final synchronized boolean isLoading() {
        return this.zzgxi.isLoading();
    }

    public final synchronized String getAdUnitId() {
        return this.zzbuo;
    }

    public final void zza(zzwg zzwg) {
    }

    public final void zza(zzwl zzwl) {
    }

    public final zzwl zzki() {
        return null;
    }

    public final void zza(zzxc zzxc) {
    }

    public final zzxc zzkh() {
        return null;
    }

    public final synchronized void zzkd() {
    }

    public final synchronized void zza(zzxi zzxi) {
    }

    public final synchronized void setManualImpressionsEnabled(boolean z) {
    }

    public final synchronized zzyg getVideoController() {
        return null;
    }

    public final synchronized void zza(zzaac zzaac) {
    }

    public final synchronized void zza(zzabq zzabq) {
    }

    public final void zza(zzxb zzxb) {
    }

    public final Bundle getAdMetadata() {
        return new Bundle();
    }

    public final boolean isReady() {
        return false;
    }

    public final void showInterstitial() {
    }

    public final void stopLoading() {
    }

    public final void zza(zzaqv zzaqv) {
    }

    public final void zza(zzarb zzarb, String str) {
    }

    public final void zza(zzatt zzatt) {
    }

    public final void setUserId(String str) {
    }

    public final void zzbp(String str) {
    }

    public final void zza(zzym zzym) {
    }

    public final void setImmersiveMode(boolean z) {
    }

    public final void zza(zzya zzya) {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzarz() {
        this.zzgmy.zzadj().execute(new zzdhk(this));
    }
}
