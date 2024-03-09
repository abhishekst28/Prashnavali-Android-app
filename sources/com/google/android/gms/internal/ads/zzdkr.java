package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
public final class zzdkr extends zzatp {
    private final zzdli zzfsl;
    private boolean zzgqs = false;
    private final zzdkd zzgzu;
    private final zzdje zzgzv;
    /* access modifiers changed from: private */
    public zzchu zzgzw;

    public zzdkr(zzdkd zzdkd, zzdje zzdje, zzdli zzdli) {
        this.zzgzu = zzdkd;
        this.zzgzv = zzdje;
        this.zzfsl = zzdli;
    }

    public final void setAppPackageName(String str) throws RemoteException {
    }

    public final synchronized void zza(zzatz zzatz) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        if (!zzaav.zzct(zzatz.zzbuo)) {
            if (zzaqd()) {
                if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcui)).booleanValue()) {
                    return;
                }
            }
            zzdka zzdka = new zzdka((String) null);
            this.zzgzw = null;
            this.zzgzu.zzea(zzdlf.zzhbh);
            this.zzgzu.zza(zzatz.zzdpw, zzatz.zzbuo, zzdka, new zzdkq(this));
        }
    }

    public final void destroy() throws RemoteException {
        zzl((IObjectWrapper) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.content.Context} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzl(com.google.android.gms.dynamic.IObjectWrapper r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch:{ all -> 0x0026 }
            com.google.android.gms.internal.ads.zzdje r0 = r2.zzgzv     // Catch:{ all -> 0x0026 }
            r1 = 0
            r0.zza(r1)     // Catch:{ all -> 0x0026 }
            com.google.android.gms.internal.ads.zzchu r0 = r2.zzgzw     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0024
            if (r3 != 0) goto L_0x0013
        L_0x0012:
            goto L_0x001b
        L_0x0013:
            java.lang.Object r3 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r3)     // Catch:{ all -> 0x0026 }
            r1 = r3
            android.content.Context r1 = (android.content.Context) r1     // Catch:{ all -> 0x0026 }
            goto L_0x0012
        L_0x001b:
            com.google.android.gms.internal.ads.zzchu r3 = r2.zzgzw     // Catch:{ all -> 0x0026 }
            com.google.android.gms.internal.ads.zzbto r3 = r3.zzail()     // Catch:{ all -> 0x0026 }
            r3.zzcb(r1)     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r2)
            return
        L_0x0026:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdkr.zzl(com.google.android.gms.dynamic.IObjectWrapper):void");
    }

    public final void pause() {
        zzj((IObjectWrapper) null);
    }

    public final synchronized void zzj(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzgzw != null) {
            this.zzgzw.zzail().zzbz(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public final void resume() {
        zzk((IObjectWrapper) null);
    }

    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzgzw != null) {
            this.zzgzw.zzail().zzca(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public final synchronized void show() throws RemoteException {
        zzi((IObjectWrapper) null);
    }

    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Activity activity;
        Preconditions.checkMainThread("showAd must be called on the main UI thread.");
        if (this.zzgzw != null) {
            if (iObjectWrapper != null) {
                Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
                if (unwrap instanceof Activity) {
                    activity = (Activity) unwrap;
                    this.zzgzw.zzb(this.zzgqs, activity);
                }
            }
            activity = null;
            this.zzgzw.zzb(this.zzgqs, activity);
        }
    }

    public final boolean zzqx() {
        zzchu zzchu = this.zzgzw;
        return zzchu != null && zzchu.zzqx();
    }

    public final synchronized String getMediationAdapterClassName() throws RemoteException {
        if (this.zzgzw == null || this.zzgzw.zzaim() == null) {
            return null;
        }
        return this.zzgzw.zzaim().getMediationAdapterClassName();
    }

    public final boolean isLoaded() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzaqd();
    }

    public final void zza(zzatt zzatt) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzgzv.zzb(zzatt);
    }

    public final void zza(zzatk zzatk) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzgzv.zzb(zzatk);
    }

    public final void zza(zzxb zzxb) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzxb == null) {
            this.zzgzv.zza((AdMetadataListener) null);
        } else {
            this.zzgzv.zza(new zzdkt(this, zzxb));
        }
    }

    public final Bundle getAdMetadata() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzchu zzchu = this.zzgzw;
        return zzchu != null ? zzchu.getAdMetadata() : new Bundle();
    }

    public final synchronized void setUserId(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzfsl.zzdve = str;
    }

    public final synchronized void setCustomData(String str) throws RemoteException {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcod)).booleanValue()) {
            Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
            this.zzfsl.zzdvf = str;
        }
    }

    public final synchronized void setImmersiveMode(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzgqs = z;
    }

    public final synchronized zzyf zzkg() throws RemoteException {
        if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcwy)).booleanValue()) {
            return null;
        }
        if (this.zzgzw == null) {
            return null;
        }
        return this.zzgzw.zzaim();
    }

    private final synchronized boolean zzaqd() {
        return this.zzgzw != null && !this.zzgzw.isClosed();
    }
}
